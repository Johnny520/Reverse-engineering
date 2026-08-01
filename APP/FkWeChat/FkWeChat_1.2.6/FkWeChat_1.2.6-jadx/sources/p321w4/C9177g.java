package p321w4;

import p321w4.AbstractC9171a;

/* JADX INFO: renamed from: w4.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9177g extends AbstractC9176f {

    /* JADX INFO: renamed from: c */
    public final C9184n f31283c;

    /* JADX INFO: renamed from: d */
    public final int f31284d;

    /* JADX INFO: renamed from: e */
    public final int f31285e;

    /* JADX INFO: renamed from: f */
    public final int f31286f;

    /* JADX INFO: renamed from: g */
    public int f31287g;

    /* JADX INFO: renamed from: h */
    public int f31288h;

    public C9177g(C9184n c9184n, int i10, String str, String str2, String str3, Object obj) {
        super(393216);
        this.f31283c = c9184n;
        this.f31284d = i10;
        this.f31285e = c9184n.m35721o(str);
        this.f31286f = c9184n.m35721o(str2);
        if (str3 != null) {
            this.f31287g = c9184n.m35721o(str3);
        }
        if (obj != null) {
            this.f31288h = c9184n.m35707a(obj).f31356a;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m35637a(AbstractC9171a.a aVar) {
        aVar.m35617a(null);
    }

    /* JADX INFO: renamed from: b */
    public int m35638b() {
        int i10;
        if (this.f31288h != 0) {
            this.f31283c.m35721o("ConstantValue");
            i10 = 16;
        } else {
            i10 = 8;
        }
        if ((this.f31284d & 4096) != 0 && this.f31283c.m35732z() < 49) {
            this.f31283c.m35721o("Synthetic");
            i10 += 6;
        }
        if (this.f31287g != 0) {
            this.f31283c.m35721o("Signature");
            i10 += 8;
        }
        if ((this.f31284d & 131072) == 0) {
            return i10;
        }
        this.f31283c.m35721o("Deprecated");
        return i10 + 6;
    }

    /* JADX INFO: renamed from: c */
    public void m35639c(C9172b c9172b) {
        boolean z10 = this.f31283c.m35732z() < 49;
        c9172b.m35628j((~(z10 ? 4096 : 0)) & this.f31284d).m35628j(this.f31285e).m35628j(this.f31286f);
        int i10 = this.f31288h == 0 ? 0 : 1;
        int i11 = this.f31284d;
        if ((i11 & 4096) != 0 && z10) {
            i10++;
        }
        if (this.f31287g != 0) {
            i10++;
        }
        if ((i11 & 131072) != 0) {
            i10++;
        }
        c9172b.m35628j(i10);
        if (this.f31288h != 0) {
            c9172b.m35628j(this.f31283c.m35721o("ConstantValue")).m35626h(2).m35628j(this.f31288h);
        }
        if ((4096 & this.f31284d) != 0 && z10) {
            c9172b.m35628j(this.f31283c.m35721o("Synthetic")).m35626h(0);
        }
        if (this.f31287g != 0) {
            c9172b.m35628j(this.f31283c.m35721o("Signature")).m35626h(2).m35628j(this.f31287g);
        }
        if ((this.f31284d & 131072) != 0) {
            c9172b.m35628j(this.f31283c.m35721o("Deprecated")).m35626h(0);
        }
    }
}
