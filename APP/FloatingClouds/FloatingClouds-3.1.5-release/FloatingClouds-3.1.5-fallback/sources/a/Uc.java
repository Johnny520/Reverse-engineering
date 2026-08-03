package a;

/* JADX INFO: loaded from: classes.dex */
public final class Uc {
    public Uc() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(a.Q7 r1) {
            java.lang.Class r1 = r1.getClass()
            java.lang.reflect.Type[] r1 = r1.getGenericInterfaces()
            r0 = 0
            r1 = r1[r0]
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "kotlin.jvm.functions."
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L1d
            r0 = 21
            java.lang.String r1 = r1.substring(r0)
        L1d:
            return r1
    }
}
