package a;

/* JADX INFO: renamed from: a.vc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0428vc {

    /* JADX INFO: renamed from: a.vc$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final java.lang.reflect.Method f739a = null;

        static {
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                a.C0193i9.b(r1)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            Lc:
                r5 = 0
                if (r4 >= r2) goto L37
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = a.C0193i9.a(r7, r8)
                if (r7 == 0) goto L34
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "getParameterTypes(...)"
                a.C0193i9.d(r7, r8)
                int r8 = r7.length
                r9 = 1
                if (r8 != r9) goto L2c
                r5 = r7[r3]
            L2c:
                boolean r5 = a.C0193i9.a(r5, r0)
                if (r5 == 0) goto L34
                r5 = r6
                goto L37
            L34:
                int r4 = r4 + 1
                goto Lc
            L37:
                a.C0428vc.a.f739a = r5
                int r0 = r1.length
            L3a:
                if (r3 >= r0) goto L4e
                r2 = r1[r3]
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = a.C0193i9.a(r2, r4)
                if (r2 == 0) goto L4b
                return
            L4b:
                int r3 = r3 + 1
                goto L3a
            L4e:
                return
        }
    }

    public void a(java.lang.Throwable r2, java.lang.Throwable r3) {
            r1 = this;
            java.lang.String r0 = "cause"
            a.C0193i9.e(r2, r0)
            java.lang.String r0 = "exception"
            a.C0193i9.e(r3, r0)
            java.lang.reflect.Method r0 = a.C0428vc.a.f739a
            if (r0 == 0) goto L15
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r0.invoke(r2, r3)
        L15:
            return
    }
}
