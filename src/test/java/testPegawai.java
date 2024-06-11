
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import model.Pegawai;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mzaky
 */
public class testPegawai {
    @Test
    public void testGetNama() {
        Pegawai pegawai = new Pegawai("John Doe", 30, 5000000);
        assertEquals("John Doe", pegawai.getNama());
    }

    @Test
    public void testGetUmur() {
        Pegawai pegawai = new Pegawai("John Doe", 30, 5000000);
        assertEquals(30, pegawai.getUmur());
    }

    @Test
    public void testGetGaji() {
        Pegawai pegawai = new Pegawai("John Doe", 30, 5000000);
        assertEquals(5000000, pegawai.getGaji(), 0.0);
    }

    @Test
    public void testCompareTo() {
        Pegawai pegawai1 = new Pegawai("John Doe", 30, 5000000);
        Pegawai pegawai2 = new Pegawai("Jane Doe", 25, 6000000);
        assertTrue(pegawai1.compareTo(pegawai2) < 0);
    }

}
