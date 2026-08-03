package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n37#2,2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n*L\n190#1:231,2\n*E\n"})
@Yue.InterfaceC2310
public final class C4682 implements java.lang.reflect.ParameterizedType, Yue.InterfaceC6465 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.Class<?> f14902;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.reflect.Type f14903;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.reflect.Type[] f14904;

    /* JADX INFO: renamed from: Yue.ۥۣۡۦۥ$ۥ, reason: contains not printable characters */
    public /* synthetic */ class C4683 extends Yue.C2854 implements Yue.InterfaceC2825<java.lang.reflect.Type, java.lang.String> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final Yue.C4682.C4683 f14905 = null;

        static {
                Yue.ۥۣۡۦۥ$ۥ r0 = new Yue.ۥۣۡۦۥ$ۥ
                r0.<init>()
                Yue.C4682.C4683.f14905 = r0
                return
        }

        public C4683() {
                r6 = this;
                java.lang.String r4 = "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;"
                r5 = 1
                r1 = 1
                java.lang.Class<Yue.ۥۢۢۥ۟> r2 = Yue.C6501.class
                java.lang.String r3 = "typeToString"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ java.lang.String invoke(java.lang.reflect.Type r1) {
                r0 = this;
                java.lang.reflect.Type r1 = (java.lang.reflect.Type) r1
                java.lang.String r1 = r0.m18551(r1)
                return r1
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public final java.lang.String m18551(@Yue.InterfaceC4418 java.lang.reflect.Type r2) {
                r1 = this;
                java.lang.String r0 = "p0"
                Yue.C3329.m13906(r2, r0)
                java.lang.String r2 = Yue.C6501.m24006(r2)
                return r2
        }
    }

    public C4682(@Yue.InterfaceC4418 java.lang.Class<?> r2, @Yue.InterfaceC4543 java.lang.reflect.Type r3, @Yue.InterfaceC4418 java.util.List<? extends java.lang.reflect.Type> r4) {
            r1 = this;
            java.lang.String r0 = "rawType"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "typeArguments"
            Yue.C3329.m13906(r4, r0)
            r1.<init>()
            r1.f14902 = r2
            r1.f14903 = r3
            r2 = 0
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r2 = r4.toArray(r2)
            java.lang.reflect.Type[] r2 = (java.lang.reflect.Type[]) r2
            r1.f14904 = r2
            return
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L2e
            java.lang.Class<?> r0 = r2.f14902
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r1 = r3.getRawType()
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 == 0) goto L2e
            java.lang.reflect.Type r0 = r2.f14903
            java.lang.reflect.Type r1 = r3.getOwnerType()
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 == 0) goto L2e
            java.lang.reflect.Type[] r0 = r2.getActualTypeArguments()
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            boolean r3 = java.util.Arrays.equals(r0, r3)
            if (r3 == 0) goto L2e
            r3 = 1
            goto L2f
        L2e:
            r3 = 0
        L2f:
            return r3
    }

    @Override // java.lang.reflect.ParameterizedType
    @Yue.InterfaceC4418
    public java.lang.reflect.Type[] getActualTypeArguments() {
            r1 = this;
            java.lang.reflect.Type[] r0 = r1.f14904
            return r0
    }

    @Override // java.lang.reflect.ParameterizedType
    @Yue.InterfaceC4543
    public java.lang.reflect.Type getOwnerType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.f14903
            return r0
    }

    @Override // java.lang.reflect.ParameterizedType
    @Yue.InterfaceC4418
    public java.lang.reflect.Type getRawType() {
            r1 = this;
            java.lang.Class<?> r0 = r1.f14902
            return r0
    }

    @Override // java.lang.reflect.Type, Yue.InterfaceC6465
    @Yue.InterfaceC4418
    public java.lang.String getTypeName() {
            r11 = this;
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.reflect.Type r0 = r11.f14903
            if (r0 == 0) goto L1f
            java.lang.String r0 = Yue.C6501.m24006(r0)
            r10.append(r0)
            java.lang.String r0 = "$"
            r10.append(r0)
            java.lang.Class<?> r0 = r11.f14902
            java.lang.String r0 = r0.getSimpleName()
            r10.append(r0)
            goto L28
        L1f:
            java.lang.Class<?> r0 = r11.f14902
            java.lang.String r0 = Yue.C6501.m24006(r0)
            r10.append(r0)
        L28:
            java.lang.reflect.Type[] r0 = r11.f14904
            int r1 = r0.length
            r2 = 1
            if (r1 != 0) goto L30
            r1 = r2
            goto L31
        L30:
            r1 = 0
        L31:
            r1 = r1 ^ r2
            if (r1 == 0) goto L44
            Yue.ۥۣۡۦۥ$ۥ r7 = Yue.C4682.C4683.f14905
            r8 = 50
            r9 = 0
            r2 = 0
            java.lang.String r3 = "<"
            java.lang.String r4 = ">"
            r5 = 0
            r6 = 0
            r1 = r10
            Yue.C0595.m3058(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L44:
            java.lang.String r0 = r10.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            Yue.C3329.m13905(r0, r1)
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class<?> r0 = r2.f14902
            int r0 = r0.hashCode()
            java.lang.reflect.Type r1 = r2.f14903
            if (r1 == 0) goto Lf
            int r1 = r1.hashCode()
            goto L10
        Lf:
            r1 = 0
        L10:
            r0 = r0 ^ r1
            java.lang.reflect.Type[] r1 = r2.getActualTypeArguments()
            int r1 = java.util.Arrays.hashCode(r1)
            r0 = r0 ^ r1
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.getTypeName()
            return r0
    }
}
