package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
public class C4776 {

    /* JADX INFO: renamed from: Yue.ۥۡۤۡۤ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations$ReflectThrowable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
    public static final class C4777 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4418
        public static final Yue.C4776.C4777 f15128 = null;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC3417
        @Yue.InterfaceC4543
        public static final java.lang.reflect.Method f15129 = null;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC3417
        @Yue.InterfaceC4543
        public static final java.lang.reflect.Method f15130 = null;

        static {
                Yue.ۥۡۤۡۤ$ۥ r0 = new Yue.ۥۡۤۡۤ$ۥ
                r0.<init>()
                Yue.C4776.C4777.f15128 = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                Yue.C3329.m13905(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L15:
                r5 = 0
                if (r4 >= r2) goto L3d
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = Yue.C3329.m13897(r7, r8)
                if (r7 == 0) goto L3a
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                Yue.C3329.m13905(r7, r8)
                java.lang.Object r7 = Yue.C0595.m3714(r7)
                boolean r7 = Yue.C3329.m13897(r7, r0)
                if (r7 == 0) goto L3a
                goto L3e
            L3a:
                int r4 = r4 + 1
                goto L15
            L3d:
                r6 = r5
            L3e:
                Yue.C4776.C4777.f15129 = r6
                int r0 = r1.length
            L41:
                if (r3 >= r0) goto L56
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = Yue.C3329.m13897(r4, r6)
                if (r4 == 0) goto L53
                r5 = r2
                goto L56
            L53:
                int r3 = r3 + 1
                goto L41
            L56:
                Yue.C4776.C4777.f15130 = r5
                return
        }

        public C4777() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public C4776() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ */
    public void mo13960(@Yue.InterfaceC4418 java.lang.Throwable r2, @Yue.InterfaceC4418 java.lang.Throwable r3) {
            r1 = this;
            java.lang.String r0 = "cause"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "exception"
            Yue.C3329.m13906(r3, r0)
            java.lang.reflect.Method r0 = Yue.C4776.C4777.f15129
            if (r0 == 0) goto L15
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r0.invoke(r2, r3)
        L15:
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟ */
    public Yue.AbstractC5185 mo13962() {
            r1 = this;
            Yue.ۥ۠ۡۦۣ r0 = new Yue.ۥ۠ۡۦۣ
            r0.<init>()
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ */
    public Yue.C3913 mo13963(@Yue.InterfaceC4418 java.util.regex.MatchResult r2, @Yue.InterfaceC4418 java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "matchResult"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r2 = "name"
            Yue.C3329.m13906(r3, r2)
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "Retrieving groups by name is not supported on this platform."
            r2.<init>(r3)
            throw r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public java.util.List<java.lang.Throwable> mo13961(@Yue.InterfaceC4418 java.lang.Throwable r3) {
            r2 = this;
            java.lang.String r0 = "exception"
            Yue.C3329.m13906(r3, r0)
            java.lang.reflect.Method r0 = Yue.C4776.C4777.f15130
            if (r0 == 0) goto L18
            r1 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)
            if (r3 == 0) goto L18
            java.lang.Throwable[] r3 = (java.lang.Throwable[]) r3
            java.util.List r3 = Yue.C0586.m2116(r3)
            if (r3 != 0) goto L1c
        L18:
            java.util.List r3 = Yue.C1208.m6210()
        L1c:
            return r3
    }
}
