package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class o4<R> implements java.io.Serializable {
    public o4() {
            r0 = this;
            r0.<init>()
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            ۟.s8 r0 = p000.r8.f945
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
            p000.h4.m188(r1, r0)
            return r0
    }
}
