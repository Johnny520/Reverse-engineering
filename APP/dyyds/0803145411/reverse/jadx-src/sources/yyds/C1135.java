package yyds;

/* JADX INFO: renamed from: yyds.ᛵᛷᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C1135 implements InterfaceC0942 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object[] f5214;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f5215;

    public C1135(int i) {
        if (i > 0) {
            this.f5214 = new Object[i];
        } else {
            C0188.m798("The max pool size must be > 0");
            throw null;
        }
    }

    @Override // yyds.InterfaceC0942
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public Object mo1548() {
        int i = this.f5215;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f5214;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f5215 = i - 1;
        return obj;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public void m2327(Object obj) {
        int i = this.f5215;
        Object[] objArr = this.f5214;
        if (i < objArr.length) {
            objArr[i] = obj;
            this.f5215 = i + 1;
        }
    }

    @Override // yyds.InterfaceC0942
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public boolean mo1557(Object obj) {
        int i = this.f5215;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.f5214;
            if (i2 >= i) {
                int i3 = this.f5215;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = obj;
                this.f5215 = i3 + 1;
                return true;
            }
            if (objArr[i2] == obj) {
                C0188.m800("Already in the pool!");
                return false;
            }
            i2++;
        }
    }

    public C1135() {
        this.f5214 = new Object[256];
    }
}
