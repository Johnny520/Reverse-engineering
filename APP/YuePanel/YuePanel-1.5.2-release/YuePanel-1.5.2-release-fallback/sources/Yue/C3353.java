package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3353 extends Yue.C4776 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۨۤ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nJDK7PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK7PlatformImplementations.kt\nkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
    public static final class C3354 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public static final Yue.C3353.C3354 f10806 = null;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC3417
        @Yue.InterfaceC4543
        public static final java.lang.Integer f10807 = null;

        static {
                Yue.ۥ۠ۥۨۤ$ۥ r0 = new Yue.ۥ۠ۥۨۤ$ۥ
                r0.<init>()
                Yue.C3353.C3354.f10806 = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1f
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L1f
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1f
                if (r2 == 0) goto L1f
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L1f
                goto L20
            L1f:
                r1 = r0
            L20:
                if (r1 == 0) goto L29
                int r2 = r1.intValue()
                if (r2 <= 0) goto L29
                r0 = r1
            L29:
                Yue.C3353.C3354.f10807 = r0
                return
        }

        public C3354() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public C3353() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    private final boolean m13959(int r2) {
            r1 = this;
            java.lang.Integer r0 = Yue.C3353.C3354.f10807
            if (r0 == 0) goto Ld
            int r0 = r0.intValue()
            if (r0 < r2) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            return r2
    }

    @Override // Yue.C4776
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void mo13960(@Yue.InterfaceC4418 java.lang.Throwable r2, @Yue.InterfaceC4418 java.lang.Throwable r3) {
            r1 = this;
            java.lang.String r0 = "cause"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "exception"
            Yue.C3329.m13906(r3, r0)
            r0 = 19
            boolean r0 = r1.m13959(r0)
            if (r0 == 0) goto L16
            r2.addSuppressed(r3)
            goto L19
        L16:
            super.mo13960(r2, r3)
        L19:
            return
    }

    @Override // Yue.C4776
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.util.List<java.lang.Throwable> mo13961(@Yue.InterfaceC4418 java.lang.Throwable r2) {
            r1 = this;
            java.lang.String r0 = "exception"
            Yue.C3329.m13906(r2, r0)
            r0 = 19
            boolean r0 = r1.m13959(r0)
            if (r0 == 0) goto L1b
            java.lang.Throwable[] r2 = r2.getSuppressed()
            java.lang.String r0 = "exception.suppressed"
            Yue.C3329.m13905(r2, r0)
            java.util.List r2 = Yue.C0586.m2116(r2)
            goto L1f
        L1b:
            java.util.List r2 = super.mo13961(r2)
        L1f:
            return r2
    }
}
