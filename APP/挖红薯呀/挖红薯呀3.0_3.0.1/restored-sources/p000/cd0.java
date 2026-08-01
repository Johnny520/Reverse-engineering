package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class cd0 extends ed0 implements Iterator, p40 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f791h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cd0(fd0 fd0Var, int i) {
        this.f791h = i;
        fd0Var.getClass();
        this.f1423g = fd0Var;
        this.f1421e = -1;
        this.f1422f = fd0Var.f1690k;
        m927c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f791h) {
            case 0:
                m926b();
                int i = this.f1420d;
                fd0 fd0Var = (fd0) this.f1423g;
                if (i >= fd0Var.f1688i) {
                    C0921xc.m5132m();
                } else {
                    this.f1420d = i + 1;
                    this.f1421e = i;
                    dd0 dd0Var = new dd0(fd0Var, i);
                    m927c();
                }
                break;
            case 1:
                m926b();
                int i2 = this.f1420d;
                fd0 fd0Var2 = (fd0) this.f1423g;
                if (i2 >= fd0Var2.f1688i) {
                    C0921xc.m5132m();
                } else {
                    this.f1420d = i2 + 1;
                    this.f1421e = i2;
                    Object obj = fd0Var2.f1683d[i2];
                    m927c();
                }
                break;
            default:
                m926b();
                int i3 = this.f1420d;
                fd0 fd0Var3 = (fd0) this.f1423g;
                if (i3 >= fd0Var3.f1688i) {
                    C0921xc.m5132m();
                } else {
                    this.f1420d = i3 + 1;
                    this.f1421e = i3;
                    Object[] objArr = fd0Var3.f1684e;
                    objArr.getClass();
                    Object obj2 = objArr[this.f1421e];
                    m927c();
                }
                break;
        }
        return null;
    }
}
