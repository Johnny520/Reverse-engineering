package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥۣۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/WildcardTypeImpl\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,230:1\n26#2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/WildcardTypeImpl\n*L\n163#1:231\n*E\n"})
@Yue.InterfaceC2310
public final class C7015 implements java.lang.reflect.WildcardType, Yue.InterfaceC6465 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C7015.C7016 f24544 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C7015 f24545 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.reflect.Type f24546;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final java.lang.reflect.Type f24547;

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۡ$ۥ, reason: contains not printable characters */
    public static final class C7016 {
        public C7016() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C7016(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C7015 m27176() {
                r1 = this;
                Yue.ۥۢۥۣۡ r0 = Yue.C7015.m27175()
                return r0
        }
    }

    static {
            Yue.ۥۢۥۣۡ$ۥ r0 = new Yue.ۥۢۥۣۡ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C7015.f24544 = r0
            Yue.ۥۢۥۣۡ r0 = new Yue.ۥۢۥۣۡ
            r0.<init>(r1, r1)
            Yue.C7015.f24545 = r0
            return
    }

    public C7015(@Yue.InterfaceC4543 java.lang.reflect.Type r1, @Yue.InterfaceC4543 java.lang.reflect.Type r2) {
            r0 = this;
            r0.<init>()
            r0.f24546 = r1
            r0.f24547 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ Yue.C7015 m27175() {
            Yue.ۥۢۥۣۡ r0 = Yue.C7015.f24545
            return r0
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L24
            java.lang.reflect.Type[] r0 = r2.getUpperBounds()
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            java.lang.reflect.Type[] r1 = r3.getUpperBounds()
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L24
            java.lang.reflect.Type[] r0 = r2.getLowerBounds()
            java.lang.reflect.Type[] r3 = r3.getLowerBounds()
            boolean r3 = java.util.Arrays.equals(r0, r3)
            if (r3 == 0) goto L24
            r3 = 1
            goto L25
        L24:
            r3 = 0
        L25:
            return r3
    }

    @Override // java.lang.reflect.WildcardType
    @Yue.InterfaceC4418
    public java.lang.reflect.Type[] getLowerBounds() {
            r3 = this;
            java.lang.reflect.Type r0 = r3.f24547
            r1 = 0
            if (r0 != 0) goto L8
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r1]
            goto Le
        L8:
            r2 = 1
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            r2[r1] = r0
            r0 = r2
        Le:
            return r0
    }

    @Override // java.lang.reflect.Type, Yue.InterfaceC6465
    @Yue.InterfaceC4418
    public java.lang.String getTypeName() {
            r2 = this;
            java.lang.reflect.Type r0 = r2.f24547
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "? super "
            r0.append(r1)
            java.lang.reflect.Type r1 = r2.f24547
            java.lang.String r1 = Yue.C6501.m24006(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L42
        L1c:
            java.lang.reflect.Type r0 = r2.f24546
            if (r0 == 0) goto L40
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 != 0) goto L40
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "? extends "
            r0.append(r1)
            java.lang.reflect.Type r1 = r2.f24546
            java.lang.String r1 = Yue.C6501.m24006(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L42
        L40:
            java.lang.String r0 = "?"
        L42:
            return r0
    }

    @Override // java.lang.reflect.WildcardType
    @Yue.InterfaceC4418
    public java.lang.reflect.Type[] getUpperBounds() {
            r3 = this;
            java.lang.reflect.Type r0 = r3.f24546
            if (r0 != 0) goto L6
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
        L6:
            r1 = 1
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
            r2 = 0
            r1[r2] = r0
            return r1
    }

    public int hashCode() {
            r2 = this;
            java.lang.reflect.Type[] r0 = r2.getUpperBounds()
            int r0 = java.util.Arrays.hashCode(r0)
            java.lang.reflect.Type[] r1 = r2.getLowerBounds()
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
