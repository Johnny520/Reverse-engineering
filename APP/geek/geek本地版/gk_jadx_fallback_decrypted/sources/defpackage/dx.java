package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class dx {
    public abstract java.lang.Object a(java.lang.Object r1);

    public final java.lang.String toString() {
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
