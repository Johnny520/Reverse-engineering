package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/ModuleNameRetriever\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
public final class C4261 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C4261 f13153 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C4261.C4262 f13154 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public static Yue.C4261.C4262 f13155;

    /* JADX INFO: renamed from: Yue.ۥۣۡۡۤ$ۥ, reason: contains not printable characters */
    public static final class C4262 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC3417
        @Yue.InterfaceC4543
        public final java.lang.reflect.Method f13156;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC3417
        @Yue.InterfaceC4543
        public final java.lang.reflect.Method f13157;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC3417
        @Yue.InterfaceC4543
        public final java.lang.reflect.Method f13158;

        public C4262(@Yue.InterfaceC4543 java.lang.reflect.Method r1, @Yue.InterfaceC4543 java.lang.reflect.Method r2, @Yue.InterfaceC4543 java.lang.reflect.Method r3) {
                r0 = this;
                r0.<init>()
                r0.f13156 = r1
                r0.f13157 = r2
                r0.f13158 = r3
                return
        }
    }

    static {
            Yue.ۥۣۡۡۤ r0 = new Yue.ۥۣۡۡۤ
            r0.<init>()
            Yue.C4261.f13153 = r0
            Yue.ۥۣۡۡۤ$ۥ r0 = new Yue.ۥۣۡۡۤ$ۥ
            r1 = 0
            r0.<init>(r1, r1, r1)
            Yue.C4261.f13154 = r0
            return
    }

    public C4261() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.C4261.C4262 m16527(Yue.AbstractC0730 r5) {
            r4 = this;
            java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
            java.lang.String r1 = "getModule"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L39
            java.lang.Class r1 = r5.getClass()     // Catch: java.lang.Exception -> L39
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Exception -> L39
            java.lang.String r3 = "java.lang.Module"
            java.lang.Class r1 = r1.loadClass(r3)     // Catch: java.lang.Exception -> L39
            java.lang.String r3 = "getDescriptor"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r2)     // Catch: java.lang.Exception -> L39
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Exception -> L39
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.Exception -> L39
            java.lang.String r3 = "java.lang.module.ModuleDescriptor"
            java.lang.Class r5 = r5.loadClass(r3)     // Catch: java.lang.Exception -> L39
            java.lang.String r3 = "name"
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r3, r2)     // Catch: java.lang.Exception -> L39
            Yue.ۥۣۡۡۤ$ۥ r2 = new Yue.ۥۣۡۡۤ$ۥ     // Catch: java.lang.Exception -> L39
            r2.<init>(r0, r1, r5)     // Catch: java.lang.Exception -> L39
            Yue.C4261.f13155 = r2     // Catch: java.lang.Exception -> L39
            return r2
        L39:
            Yue.ۥۣۡۡۤ$ۥ r5 = Yue.C4261.f13154
            Yue.C4261.f13155 = r5
            return r5
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.String m16528(@Yue.InterfaceC4418 Yue.AbstractC0730 r4) {
            r3 = this;
            java.lang.String r0 = "continuation"
            Yue.C3329.m13906(r4, r0)
            Yue.ۥۣۡۡۤ$ۥ r0 = Yue.C4261.f13155
            if (r0 != 0) goto Ld
            Yue.ۥۣۡۡۤ$ۥ r0 = r3.m16527(r4)
        Ld:
            Yue.ۥۣۡۡۤ$ۥ r1 = Yue.C4261.f13154
            r2 = 0
            if (r0 != r1) goto L13
            return r2
        L13:
            java.lang.reflect.Method r1 = r0.f13156
            if (r1 == 0) goto L20
            java.lang.Class r4 = r4.getClass()
            java.lang.Object r4 = r1.invoke(r4, r2)
            goto L21
        L20:
            r4 = r2
        L21:
            if (r4 != 0) goto L24
            return r2
        L24:
            java.lang.reflect.Method r1 = r0.f13157
            if (r1 == 0) goto L2d
            java.lang.Object r4 = r1.invoke(r4, r2)
            goto L2e
        L2d:
            r4 = r2
        L2e:
            if (r4 != 0) goto L31
            return r2
        L31:
            java.lang.reflect.Method r0 = r0.f13158
            if (r0 == 0) goto L3a
            java.lang.Object r4 = r0.invoke(r4, r2)
            goto L3b
        L3a:
            r4 = r2
        L3b:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L42
            r2 = r4
            java.lang.String r2 = (java.lang.String) r2
        L42:
            return r2
    }
}
