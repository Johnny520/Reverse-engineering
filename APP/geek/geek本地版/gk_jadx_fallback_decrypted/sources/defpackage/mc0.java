package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class mc0 {
    public final defpackage.wc0 a;
    public defpackage.ep[] b;

    public mc0() {
            r1 = this;
            wc0 r0 = new wc0
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public mc0(defpackage.wc0 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final void a() {
            r5 = this;
            ep[] r0 = r5.b
            if (r0 == 0) goto L51
            r1 = 0
            r1 = r0[r1]
            r2 = 1
            r0 = r0[r2]
            wc0 r3 = r5.a
            if (r0 != 0) goto L15
            r0 = 2
            tc0 r4 = r3.a
            ep r0 = r4.f(r0)
        L15:
            if (r1 != 0) goto L1d
            tc0 r1 = r3.a
            ep r1 = r1.f(r2)
        L1d:
            ep r0 = defpackage.ep.a(r1, r0)
            r5.g(r0)
            ep[] r0 = r5.b
            r1 = 16
            int r1 = defpackage.ct.q(r1)
            r0 = r0[r1]
            if (r0 == 0) goto L33
            r5.f(r0)
        L33:
            ep[] r0 = r5.b
            r1 = 32
            int r1 = defpackage.ct.q(r1)
            r0 = r0[r1]
            if (r0 == 0) goto L42
            r5.d(r0)
        L42:
            ep[] r0 = r5.b
            r1 = 64
            int r1 = defpackage.ct.q(r1)
            r0 = r0[r1]
            if (r0 == 0) goto L51
            r5.h(r0)
        L51:
            return
    }

    public abstract defpackage.wc0 b();

    public void c(int r4, defpackage.ep r5) {
            r3 = this;
            ep[] r0 = r3.b
            if (r0 != 0) goto La
            r0 = 9
            ep[] r0 = new defpackage.ep[r0]
            r3.b = r0
        La:
            r0 = 1
        Lb:
            r1 = 256(0x100, float:3.59E-43)
            if (r0 > r1) goto L1f
            r1 = r4 & r0
            if (r1 != 0) goto L14
            goto L1c
        L14:
            ep[] r1 = r3.b
            int r2 = defpackage.ct.q(r0)
            r1[r2] = r5
        L1c:
            int r0 = r0 << 1
            goto Lb
        L1f:
            return
    }

    public void d(defpackage.ep r1) {
            r0 = this;
            return
    }

    public abstract void e(defpackage.ep r1);

    public void f(defpackage.ep r1) {
            r0 = this;
            return
    }

    public abstract void g(defpackage.ep r1);

    public void h(defpackage.ep r1) {
            r0 = this;
            return
    }
}
