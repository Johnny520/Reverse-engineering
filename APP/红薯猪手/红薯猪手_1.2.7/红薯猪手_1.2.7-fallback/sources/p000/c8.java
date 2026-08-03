package p000;

/* JADX INFO: loaded from: classes.dex */
public class c8 {

    public static final class a {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final java.lang.reflect.Method f264 = null;

        static {
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                p000.h4.m186(r1)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            Lc:
                r5 = 0
                if (r4 >= r2) goto L3b
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = p000.h4.m185(r7, r8)
                r8 = 1
                if (r7 == 0) goto L33
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r9 = "getParameterTypes(...)"
                p000.h4.m188(r9, r7)
                int r9 = r7.length
                if (r9 != r8) goto L2c
                r5 = r7[r3]
            L2c:
                boolean r5 = p000.h4.m185(r5, r0)
                if (r5 == 0) goto L33
                goto L34
            L33:
                r8 = r3
            L34:
                if (r8 == 0) goto L38
                r5 = r6
                goto L3b
            L38:
                int r4 = r4 + 1
                goto Lc
            L3b:
                ۟.c8.a.f264 = r5
                int r0 = r1.length
            L3e:
                if (r3 >= r0) goto L52
                r2 = r1[r3]
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = p000.h4.m185(r2, r4)
                if (r2 == 0) goto L4f
                goto L52
            L4f:
                int r3 = r3 + 1
                goto L3e
            L52:
                return
        }
    }

    public c8() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void mo111(java.lang.Throwable r4, java.lang.Throwable r5) {
            r3 = this;
            java.lang.String r0 = "cause"
            p000.h4.m189(r0, r4)
            java.lang.reflect.Method r0 = ۟.c8.a.f264
            if (r0 == 0) goto L12
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r5
            r0.invoke(r4, r1)
        L12:
            return
    }
}
