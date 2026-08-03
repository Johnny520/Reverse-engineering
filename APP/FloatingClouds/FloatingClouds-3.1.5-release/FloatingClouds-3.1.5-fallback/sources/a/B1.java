package a;

/* JADX INFO: loaded from: classes.dex */
public final class B1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f21a = -1;
    public static java.lang.String b = "";

    public static final class a {
        public static java.lang.String a() {
                java.lang.String r0 = c()
                int r1 = b()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                java.lang.String r0 = "("
                r2.append(r0)
                r2.append(r1)
                java.lang.String r0 = ")"
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                return r0
        }

        public static int b() {
                int r0 = a.B1.f21a
                r1 = -1
                if (r0 != r1) goto L27
                android.content.Context r0 = a.C0435w1.p     // Catch: java.lang.Exception -> L18
                a.C0193i9.b(r0)     // Catch: java.lang.Exception -> L18
                android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L18
                java.lang.String r2 = "com.tencent.mm"
                r3 = 0
                android.content.pm.PackageInfo r0 = r0.getPackageInfo(r2, r3)     // Catch: java.lang.Exception -> L18
                int r1 = r0.versionCode     // Catch: java.lang.Exception -> L18
                goto L25
            L18:
                r0 = move-exception
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                r2 = 1
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
                a.C0453x1.a(r0)
            L25:
                a.B1.f21a = r1
            L27:
                int r0 = a.B1.f21a
                return r0
        }

        public static java.lang.String c() {
                java.lang.String r0 = ""
                java.lang.String r1 = a.B1.b
                boolean r1 = a.Be.P(r1)
                if (r1 == 0) goto L30
                android.content.Context r1 = a.C0435w1.p     // Catch: java.lang.Exception -> L21
                a.C0193i9.b(r1)     // Catch: java.lang.Exception -> L21
                android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L21
                java.lang.String r2 = "com.tencent.mm"
                r3 = 0
                android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch: java.lang.Exception -> L21
                java.lang.String r1 = r1.versionName     // Catch: java.lang.Exception -> L21
                if (r1 != 0) goto L1f
                goto L2e
            L1f:
                r0 = r1
                goto L2e
            L21:
                r1 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                r2 = 1
                java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
                a.C0453x1.a(r1)
            L2e:
                a.B1.b = r0
            L30:
                java.lang.String r0 = a.B1.b
                return r0
        }
    }
}
