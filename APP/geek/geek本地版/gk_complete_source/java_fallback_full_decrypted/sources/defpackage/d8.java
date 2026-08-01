package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class d8 implements defpackage.xp, java.io.Serializable {
    public transient defpackage.xp a;
    public final java.lang.Object b;
    public final java.lang.Class c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final boolean f;

    public d8(java.lang.Object r1, java.lang.Class r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r0.e = r4
            r0.f = r5
            return
    }

    public final defpackage.la c() {
            r2 = this;
            boolean r0 = r2.f
            java.lang.Class r1 = r2.c
            if (r0 == 0) goto L11
            k00 r0 = defpackage.j00.a
            r0.getClass()
            fx r0 = new fx
            r0.<init>(r1)
            return r0
        L11:
            k00 r0 = defpackage.j00.a
            r0.getClass()
            ma r0 = new ma
            r0.<init>(r1)
            return r0
    }
}
