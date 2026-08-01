package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class mc0 {
    public final wc0 a;
    public ep[] b;

    public mc0() {
        this(new wc0());
    }

    public final void a() {
        ep[] r0 = this.b;
        if (r0 == null) goto L19;
        ep r1 = r0[0];
        ep r02 = r0[1];
        wc0 r3 = this.a;
        if (r02 != null) goto L7;
        r02 = r3.a.f(2);
    L7:
        if (r1 != null) goto L9;
        r1 = r3.a.f(1);
    L9:
        g(ep.a(r1, r02));
        ep r03 = this.b[ct.q(16)];
        if (r03 == null) goto L12;
        f(r03);
    L12:
        ep r04 = this.b[ct.q(32)];
        if (r04 == null) goto L15;
        d(r04);
    L15:
        ep r05 = this.b[ct.q(64)];
        if (r05 == null) goto L20;
        h(r05);
        return;
    L20:
        return;
    }

    public abstract wc0 b();

    public void c(int r4, ep r5) {
        if (this.b != null) goto L5;
        this.b = new ep[9];
    L5:
        int r0 = 1;
    L7:
        if (r0 > 256) goto L13;
        if ((r4 & r0) == 0) goto L12;
        this.b[ct.q(r0)] = r5;
    L12:
        r0 = r0 << 1;
        goto L7
    }

    public abstract void e(ep r1);

    public abstract void g(ep r1);

    public mc0(wc0 r1) {
        this.a = r1;
    }

    public void d(ep r1) {
    }

    public void f(ep r1) {
    }

    public void h(ep r1) {
    }
}
