package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4722 implements InterfaceC8549 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public InterfaceC8549 f10093;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4722() {
    }

    @Override // Yue.InterfaceC8549
    public void close() throws C8559 {
        this.f10093.close();
    }

    @Override // Yue.InterfaceC8549
    public Object getProperty(String str) throws IllegalArgumentException {
        return this.f10093.getProperty(str);
    }

    @Override // Yue.InterfaceC8549, java.util.Iterator
    public boolean hasNext() {
        return this.f10093.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.f10093.next();
    }

    @Override // Yue.InterfaceC8549
    public InterfaceC8543 peek() throws C8559 {
        return this.f10093.peek();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f10093.remove();
    }

    /* JADX INFO: renamed from: ۥ */
    public InterfaceC8549 m1634() {
        return this.f10093;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m1635(InterfaceC8549 interfaceC8549) {
        this.f10093 = interfaceC8549;
    }

    @Override // Yue.InterfaceC8549
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public InterfaceC8543 mo14123() throws C8559 {
        return this.f10093.mo14123();
    }

    @Override // Yue.InterfaceC8549
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public String mo14124() throws C8559 {
        return this.f10093.mo14124();
    }

    @Override // Yue.InterfaceC8549
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public InterfaceC8543 mo14125() throws C8559 {
        return this.f10093.mo14125();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4722(InterfaceC8549 interfaceC8549) {
        this.f10093 = interfaceC8549;
    }
}
