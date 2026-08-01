package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ke extends defpackage.h implements defpackage.md {
    public static final defpackage.je b = null;

    static {
            je r0 = new je
            vh r1 = defpackage.vh.b
            ie r2 = defpackage.ie.b
            r0.<init>(r1, r2)
            defpackage.ke.b = r0
            return
    }

    public ke() {
            r1 = this;
            vh r0 = defpackage.vh.b
            r1.<init>(r0)
            return
    }

    @Override // defpackage.h, defpackage.ge
    public final defpackage.ee b(defpackage.fe r4) {
            r3 = this;
            java.lang.String r0 = "key"
            defpackage.ip.o(r0, r4)
            boolean r0 = r4 instanceof defpackage.je
            r1 = 0
            if (r0 == 0) goto L21
            je r4 = (defpackage.je) r4
            fe r0 = r3.a
            if (r0 == r4) goto L16
            fe r2 = r4.b
            if (r2 != r0) goto L15
            goto L16
        L15:
            return r1
        L16:
            cq r4 = r4.a
            java.lang.Object r4 = r4.f(r3)
            ee r4 = (defpackage.ee) r4
            if (r4 == 0) goto L26
            return r4
        L21:
            vh r0 = defpackage.vh.b
            if (r0 != r4) goto L26
            return r3
        L26:
            return r1
    }

    public abstract void d(defpackage.ge r1, java.lang.Runnable r2);

    public boolean e() {
            r1 = this;
            boolean r0 = r1 instanceof defpackage.n80
            r0 = r0 ^ 1
            return r0
    }

    @Override // defpackage.h, defpackage.ge
    public final defpackage.ge g(defpackage.fe r3) {
            r2 = this;
            java.lang.String r0 = "key"
            defpackage.ip.o(r0, r3)
            boolean r0 = r3 instanceof defpackage.je
            if (r0 == 0) goto L20
            je r3 = (defpackage.je) r3
            fe r0 = r2.a
            if (r0 == r3) goto L15
            fe r1 = r3.b
            if (r1 != r0) goto L14
            goto L15
        L14:
            return r2
        L15:
            cq r3 = r3.a
            java.lang.Object r3 = r3.f(r2)
            ee r3 = (defpackage.ee) r3
            if (r3 == 0) goto L27
            goto L24
        L20:
            vh r0 = defpackage.vh.b
            if (r0 != r3) goto L27
        L24:
            wi r3 = defpackage.wi.a
            return r3
        L27:
            return r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = defpackage.ff.s(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
