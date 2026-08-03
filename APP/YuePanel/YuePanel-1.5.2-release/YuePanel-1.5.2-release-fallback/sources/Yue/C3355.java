package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3355 extends Yue.C3353 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۨۥ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nJDK8PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK8PlatformImplementations.kt\nkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    public static final class C3356 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public static final Yue.C3355.C3356 f10808 = null;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC3417
        @Yue.InterfaceC4543
        public static final java.lang.Integer f10809 = null;

        static {
                Yue.ۥ۠ۥۨۥ$ۥ r0 = new Yue.ۥ۠ۥۨۥ$ۥ
                r0.<init>()
                Yue.C3355.C3356.f10808 = r0
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
                Yue.C3355.C3356.f10809 = r0
                return
        }

        public C3356() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public C3355() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.C4776
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.AbstractC5185 mo13962() {
            r1 = this;
            r0 = 34
            boolean r0 = r1.m13964(r0)
            if (r0 == 0) goto Le
            Yue.ۥۡۤۡۨ r0 = new Yue.ۥۡۤۡۨ
            r0.<init>()
            goto L12
        Le:
            Yue.ۥۡۥۨۤ r0 = super.mo13962()
        L12:
            return r0
    }

    @Override // Yue.C4776
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.C3913 mo13963(@Yue.InterfaceC4418 java.util.regex.MatchResult r5, @Yue.InterfaceC4418 java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = "matchResult"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r6, r0)
            boolean r0 = r5 instanceof java.util.regex.Matcher
            r1 = 0
            if (r0 == 0) goto L12
            java.util.regex.Matcher r5 = (java.util.regex.Matcher) r5
            goto L13
        L12:
            r5 = r1
        L13:
            if (r5 == 0) goto L3d
            Yue.ۥ۠ۥۣۨ r0 = new Yue.ۥ۠ۥۣۨ
            int r2 = r5.start(r6)
            int r3 = r5.end(r6)
            int r3 = r3 + (-1)
            r0.<init>(r2, r3)
            java.lang.Integer r2 = r0.m13748()
            int r2 = r2.intValue()
            if (r2 < 0) goto L3c
            Yue.ۥ۠ۨۨۨ r1 = new Yue.ۥ۠ۨۨۨ
            java.lang.String r5 = r5.group(r6)
            java.lang.String r6 = "matcher.group(name)"
            Yue.C3329.m13905(r5, r6)
            r1.<init>(r5, r0)
        L3c:
            return r1
        L3d:
            java.lang.UnsupportedOperationException r5 = new java.lang.UnsupportedOperationException
            java.lang.String r6 = "Retrieving groups by name is not supported on this platform."
            r5.<init>(r6)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m13964(int r2) {
            r1 = this;
            java.lang.Integer r0 = Yue.C3355.C3356.f10809
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
}
