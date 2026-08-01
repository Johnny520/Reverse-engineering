package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class cq implements defpackage.an, java.io.Serializable {
    public final int a;

    public cq(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.an
    public final int b() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            k00 r0 = defpackage.j00.a
            r0.getClass()
            java.lang.Class r0 = r2.getClass()
            java.lang.reflect.Type[] r0 = r0.getGenericInterfaces()
            r1 = 0
            r0 = r0[r1]
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "kotlin.jvm.functions."
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L22
            r1 = 21
            java.lang.String r0 = r0.substring(r1)
        L22:
            java.lang.String r1 = "renderLambdaToString(...)"
            defpackage.ip.n(r1, r0)
            return r0
    }
}
