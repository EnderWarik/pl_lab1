package po01.decl

import jakarta.inject.Singleton
import org.apache.poi.ss.usermodel.CellType

@Singleton
class StudentRow {
    fun getStructure(): List<CellType> = listOf(CellType.STRING, CellType.STRING, CellType.STRING)
}