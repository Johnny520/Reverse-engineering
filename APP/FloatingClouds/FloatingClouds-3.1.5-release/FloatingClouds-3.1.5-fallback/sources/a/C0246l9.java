package a;

/* JADX INFO: renamed from: a.l9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0246l9 extends a.C0428vc {

    /* JADX INFO: renamed from: a.l9$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final java.lang.Integer f557a = null;

        static {
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L18
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L18
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L18
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L18
                if (r2 == 0) goto L18
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L18
                goto L19
            L18:
                r1 = r0
            L19:
                if (r1 == 0) goto L22
                int r2 = r1.intValue()
                if (r2 <= 0) goto L22
                r0 = r1
            L22:
                a.C0246l9.a.f557a = r0
                return
        }
    }

    @Override // a.C0428vc
    public final void a(java.lang.Throwable r3, java.lang.Throwable r4) {
            r2 = this;
            java.lang.String r0 = "cause"
            a.C0193i9.e(r3, r0)
            java.lang.String r0 = "exception"
            a.C0193i9.e(r4, r0)
            java.lang.Integer r0 = a.C0246l9.a.f557a
            if (r0 == 0) goto L1b
            int r0 = r0.intValue()
            r1 = 19
            if (r0 < r1) goto L17
            goto L1b
        L17:
            super.a(r3, r4)
            return
        L1b:
            r3.addSuppressed(r4)
            return
    }
}
