package p000;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class r92 implements Closeable {

    /* JADX INFO: renamed from: h */
    public final k82 f9456h;

    /* JADX INFO: renamed from: i */
    public final c42 f9457i;

    /* JADX INFO: renamed from: j */
    public final String f9458j;

    /* JADX INFO: renamed from: k */
    public final int f9459k;

    /* JADX INFO: renamed from: l */
    public final yr0 f9460l;

    /* JADX INFO: renamed from: m */
    public final js0 f9461m;

    /* JADX INFO: renamed from: n */
    public final u92 f9462n;

    /* JADX INFO: renamed from: o */
    public final ys2 f9463o;

    /* JADX INFO: renamed from: p */
    public final r92 f9464p;

    /* JADX INFO: renamed from: q */
    public final r92 f9465q;

    /* JADX INFO: renamed from: r */
    public final r92 f9466r;

    /* JADX INFO: renamed from: s */
    public final long f9467s;

    /* JADX INFO: renamed from: t */
    public final long f9468t;

    /* JADX INFO: renamed from: u */
    public final f90 f9469u;

    /* JADX INFO: renamed from: v */
    public final e33 f9470v;

    /* JADX INFO: renamed from: w */
    public final boolean f9471w;

    public r92(k82 k82Var, c42 c42Var, String str, int i, yr0 yr0Var, js0 js0Var, u92 u92Var, ys2 ys2Var, r92 r92Var, r92 r92Var2, r92 r92Var3, long j, long j2, f90 f90Var, e33 e33Var) {
        k82Var.getClass();
        c42Var.getClass();
        str.getClass();
        u92Var.getClass();
        e33Var.getClass();
        this.f9456h = k82Var;
        this.f9457i = c42Var;
        this.f9458j = str;
        this.f9459k = i;
        this.f9460l = yr0Var;
        this.f9461m = js0Var;
        this.f9462n = u92Var;
        this.f9463o = ys2Var;
        this.f9464p = r92Var;
        this.f9465q = r92Var2;
        this.f9466r = r92Var3;
        this.f9467s = j;
        this.f9468t = j2;
        this.f9469u = f90Var;
        this.f9470v = e33Var;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        this.f9471w = z;
    }

    /* JADX INFO: renamed from: b */
    public final p92 m4416b() {
        p92 p92Var = new p92();
        p92Var.f8046c = -1;
        p92Var.f8050g = u92.f11170i;
        p92Var.f8058o = e33.f2303g;
        p92Var.f8044a = this.f9456h;
        p92Var.f8045b = this.f9457i;
        p92Var.f8046c = this.f9459k;
        p92Var.f8047d = this.f9458j;
        p92Var.f8048e = this.f9460l;
        p92Var.f8049f = this.f9461m.m2559c();
        p92Var.f8050g = this.f9462n;
        p92Var.f8051h = this.f9463o;
        p92Var.f8052i = this.f9464p;
        p92Var.f8053j = this.f9465q;
        p92Var.f8054k = this.f9466r;
        p92Var.f8055l = this.f9467s;
        p92Var.f8056m = this.f9468t;
        p92Var.f8057n = this.f9469u;
        p92Var.f8058o = this.f9470v;
        return p92Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9462n.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f9457i + ", code=" + this.f9459k + ", message=" + this.f9458j + ", url=" + this.f9456h.f5390a + '}';
    }
}
