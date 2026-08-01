package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gy implements defpackage.oq {
    public static final defpackage.gy i = null;
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public android.os.Handler e;
    public final androidx.lifecycle.a f;
    public final defpackage.p1 g;
    public final defpackage.l0 h;

    static {
            gy r0 = new gy
            r0.<init>()
            defpackage.gy.i = r0
            return
    }

    public gy() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.c = r0
            r2.d = r0
            androidx.lifecycle.a r0 = new androidx.lifecycle.a
            r0.<init>(r2)
            r2.f = r0
            p1 r0 = new p1
            r1 = 10
            r0.<init>(r1, r2)
            r2.g = r0
            l0 r0 = new l0
            r1 = 23
            r0.<init>(r1, r2)
            r2.h = r0
            return
    }

    public final void a() {
            r2 = this;
            int r0 = r2.b
            r1 = 1
            int r0 = r0 + r1
            r2.b = r0
            if (r0 != r1) goto L21
            boolean r0 = r2.c
            if (r0 == 0) goto L17
            androidx.lifecycle.a r0 = r2.f
            iq r1 = defpackage.iq.ON_RESUME
            r0.d(r1)
            r0 = 0
            r2.c = r0
            return
        L17:
            android.os.Handler r0 = r2.e
            defpackage.ip.l(r0)
            p1 r1 = r2.g
            r0.removeCallbacks(r1)
        L21:
            return
    }

    @Override // defpackage.oq
    public final androidx.lifecycle.a e() {
            r1 = this;
            androidx.lifecycle.a r0 = r1.f
            return r0
    }
}
