package LibraryManagement;

class theLibrary {
	private String buku;
	private String anggota;
	private String state;
	
	public theLibrary(String buku, String anggota, String state) {
		this.anggota = anggota;
		this.buku = buku;
		this.state = state;
	}
	//@Override
	public String dataBuku() {
		return "\nAnggota: " + anggota + "\nNama Buku: " + buku + "\nTindakkan: " + state;
	}
}
