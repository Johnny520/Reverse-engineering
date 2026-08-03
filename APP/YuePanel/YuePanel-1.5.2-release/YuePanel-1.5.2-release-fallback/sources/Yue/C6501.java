package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1#2:231\n1549#3:232\n1620#3,3:233\n1549#3:236\n1620#3,3:237\n1549#3:240\n1620#3,3:241\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/TypesJVMKt\n*L\n69#1:232\n69#1:233,3\n71#1:236\n71#1:237,3\n77#1:240\n77#1:241,3\n*E\n"})
public final class C6501 {

    /* JADX INFO: renamed from: Yue.ۥۢۢۥ۟$ۥ, reason: contains not printable characters */
    public /* synthetic */ class C6502 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ int[] f22844 = null;

        static {
                Yue.ۥ۠ۦۤۧ[] r0 = Yue.EnumC3480.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Yue.ۥ۠ۦۤۧ r1 = Yue.EnumC3480.f10906     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                Yue.ۥ۠ۦۤۧ r1 = Yue.EnumC3480.f10905     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                Yue.ۥ۠ۦۤۧ r1 = Yue.EnumC3480.f10907     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                Yue.C6501.C6502.f22844 = r0
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢۥ۟$ۥ۟, reason: contains not printable characters */
    public /* synthetic */ class C6503 extends Yue.C2854 implements Yue.InterfaceC2825<java.lang.Class<?>, java.lang.Class<?>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final Yue.C6501.C6503 f22845 = null;

        static {
                Yue.ۥۢۢۥ۟$ۥ۟ r0 = new Yue.ۥۢۢۥ۟$ۥ۟
                r0.<init>()
                Yue.C6501.C6503.f22845 = r0
                return
        }

        public C6503() {
                r6 = this;
                java.lang.String r4 = "getComponentType()Ljava/lang/Class;"
                r5 = 0
                r1 = 1
                java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
                java.lang.String r3 = "getComponentType"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ java.lang.Class<?> invoke(java.lang.Class<?> r1) {
                r0 = this;
                java.lang.Class r1 = (java.lang.Class) r1
                java.lang.Class r1 = r0.m24015(r1)
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public final java.lang.Class<?> m24015(@Yue.InterfaceC4418 java.lang.Class<?> r2) {
                r1 = this;
                java.lang.String r0 = "p0"
                Yue.C3329.m13906(r2, r0)
                java.lang.Class r2 = r2.getComponentType()
                return r2
        }
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.reflect.Type m24005(Yue.InterfaceC3473 r0, boolean r1) {
            java.lang.reflect.Type r0 = m24007(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ java.lang.String m24006(java.lang.reflect.Type r0) {
            java.lang.String r0 = m24014(r0)
            return r0
    }

    @Yue.InterfaceC2310
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.reflect.Type m24007(Yue.InterfaceC3473 r3, boolean r4) {
            Yue.ۥ۠ۦۢۥ r0 = r3.mo14253()
            boolean r1 = r0 instanceof Yue.InterfaceC3476
            if (r1 == 0) goto L10
            Yue.ۥۣۣۢۢ r3 = new Yue.ۥۣۣۢۢ
            Yue.ۥ۠ۦۤۥ r0 = (Yue.InterfaceC3476) r0
            r3.<init>(r0)
            return r3
        L10:
            boolean r1 = r0 instanceof Yue.InterfaceC3435
            if (r1 == 0) goto L9c
            Yue.ۥ۠ۦۢۢ r0 = (Yue.InterfaceC3435) r0
            if (r4 == 0) goto L1d
            java.lang.Class r4 = Yue.C3413.m14195(r0)
            goto L21
        L1d:
            java.lang.Class r4 = Yue.C3413.m14192(r0)
        L21:
            java.util.List r0 = r3.mo14252()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2c
            return r4
        L2c:
            boolean r1 = r4.isArray()
            if (r1 == 0) goto L97
            java.lang.Class r1 = r4.getComponentType()
            boolean r1 = r1.isPrimitive()
            if (r1 == 0) goto L3d
            return r4
        L3d:
            java.lang.Object r0 = Yue.C1219.m6500(r0)
            Yue.ۥ۠ۦۤۦ r0 = (Yue.C3477) r0
            if (r0 == 0) goto L80
            Yue.ۥ۠ۦۤۧ r3 = r0.m14263()
            Yue.ۥ۠ۦۣۤ r0 = r0.m14264()
            r1 = -1
            if (r3 != 0) goto L52
            r3 = r1
            goto L5a
        L52:
            int[] r2 = Yue.C6501.C6502.f22844
            int r3 = r3.ordinal()
            r3 = r2[r3]
        L5a:
            if (r3 == r1) goto L7f
            r1 = 1
            if (r3 == r1) goto L7f
            r2 = 2
            if (r3 == r2) goto L6c
            r2 = 3
            if (r3 != r2) goto L66
            goto L6c
        L66:
            Yue.ۥۣۣۡۢ r3 = new Yue.ۥۣۣۡۢ
            r3.<init>()
            throw r3
        L6c:
            Yue.C3329.m13903(r0)
            r3 = 0
            r2 = 0
            java.lang.reflect.Type r3 = m24008(r0, r3, r1, r2)
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L7a
            goto L7f
        L7a:
            Yue.ۥۣ۠ۤ r4 = new Yue.ۥۣ۠ۤ
            r4.<init>(r3)
        L7f:
            return r4
        L80:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "kotlin.Array must have exactly one type argument: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L97:
            java.lang.reflect.Type r3 = m24009(r4, r0)
            return r3
        L9c:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported type classifier: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.reflect.Type m24008(Yue.InterfaceC3473 r0, boolean r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            java.lang.reflect.Type r0 = m24007(r0, r1)
            return r0
    }

    @Yue.InterfaceC2310
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.reflect.Type m24009(java.lang.Class<?> r4, java.util.List<Yue.C3477> r5) {
            java.lang.Class r0 = r4.getDeclaringClass()
            r1 = 10
            if (r0 != 0) goto L30
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = Yue.C1210.m6231(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L15:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r5.next()
            Yue.ۥ۠ۦۤۦ r1 = (Yue.C3477) r1
            java.lang.reflect.Type r1 = m24011(r1)
            r0.add(r1)
            goto L15
        L29:
            Yue.ۥۣۡۦۥ r5 = new Yue.ۥۣۡۦۥ
            r1 = 0
            r5.<init>(r4, r1, r0)
            return r5
        L30:
            int r2 = r4.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
            if (r2 == 0) goto L61
            java.util.ArrayList r2 = new java.util.ArrayList
            int r1 = Yue.C1210.m6231(r5, r1)
            r2.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L47:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r5.next()
            Yue.ۥ۠ۦۤۦ r1 = (Yue.C3477) r1
            java.lang.reflect.Type r1 = m24011(r1)
            r2.add(r1)
            goto L47
        L5b:
            Yue.ۥۣۡۦۥ r5 = new Yue.ۥۣۡۦۥ
            r5.<init>(r4, r0, r2)
            return r5
        L61:
            java.lang.reflect.TypeVariable[] r2 = r4.getTypeParameters()
            int r2 = r2.length
            int r3 = r5.size()
            java.util.List r3 = r5.subList(r2, r3)
            java.lang.reflect.Type r0 = m24009(r0, r3)
            r3 = 0
            java.util.List r5 = r5.subList(r3, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r1 = Yue.C1210.m6231(r5, r1)
            r2.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L84:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L98
            java.lang.Object r1 = r5.next()
            Yue.ۥ۠ۦۤۦ r1 = (Yue.C3477) r1
            java.lang.reflect.Type r1 = m24011(r1)
            r2.add(r1)
            goto L84
        L98:
            Yue.ۥۣۡۦۥ r5 = new Yue.ۥۣۡۦۥ
            r5.<init>(r4, r0, r2)
            return r5
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.reflect.Type m24010(@Yue.InterfaceC4418 Yue.InterfaceC3473 r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            boolean r0 = r3 instanceof Yue.InterfaceC3475
            if (r0 == 0) goto L13
            r0 = r3
            Yue.ۥ۠ۦۤۤ r0 = (Yue.InterfaceC3475) r0
            java.lang.reflect.Type r0 = r0.m14256()
            if (r0 == 0) goto L13
            return r0
        L13:
            r0 = 1
            r1 = 0
            r2 = 0
            java.lang.reflect.Type r3 = m24008(r3, r2, r0, r1)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.reflect.Type m24011(Yue.C3477 r4) {
            Yue.ۥ۠ۦۤۧ r0 = r4.m14267()
            if (r0 != 0) goto Ld
            Yue.ۥۢۥۣۡ$ۥ r4 = Yue.C7015.f24544
            Yue.ۥۢۥۣۡ r4 = r4.m27176()
            return r4
        Ld:
            Yue.ۥ۠ۦۣۤ r4 = r4.m14266()
            Yue.C3329.m13903(r4)
            int[] r1 = Yue.C6501.C6502.f22844
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L3b
            r3 = 2
            if (r0 == r3) goto L36
            r3 = 3
            if (r0 != r3) goto L30
            Yue.ۥۢۥۣۡ r0 = new Yue.ۥۢۥۣۡ
            java.lang.reflect.Type r4 = m24007(r4, r2)
            r0.<init>(r4, r1)
            goto L44
        L30:
            Yue.ۥۣۣۡۢ r4 = new Yue.ۥۣۣۡۢ
            r4.<init>()
            throw r4
        L36:
            java.lang.reflect.Type r0 = m24007(r4, r2)
            goto L44
        L3b:
            Yue.ۥۢۥۣۡ r0 = new Yue.ۥۢۥۣۡ
            java.lang.reflect.Type r4 = m24007(r4, r2)
            r0.<init>(r1, r4)
        L44:
            return r0
    }

    @Yue.InterfaceC3834
    @Yue.InterfaceC5792(version = "1.4")
    @Yue.InterfaceC2310
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m24012(Yue.InterfaceC3473 r0) {
            return
    }

    @Yue.InterfaceC2310
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m24013(Yue.C3477 r0) {
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final java.lang.String m24014(java.lang.reflect.Type r2) {
            boolean r0 = r2 instanceof java.lang.Class
            if (r0 == 0) goto L41
            r0 = r2
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L37
            Yue.ۥۢۢۥ۟$ۥ۟ r0 = Yue.C6501.C6503.f22845
            Yue.ۥۡۨۢ r2 = Yue.C5616.m20994(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = Yue.C5629.m21096(r2)
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "[]"
            int r2 = Yue.C5629.m21045(r2)
            java.lang.String r2 = Yue.C5988.m22301(r1, r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            goto L3b
        L37:
            java.lang.String r2 = r0.getName()
        L3b:
            java.lang.String r0 = "{\n        if (type.isArr…   } else type.name\n    }"
            Yue.C3329.m13905(r2, r0)
            goto L45
        L41:
            java.lang.String r2 = r2.toString()
        L45:
            return r2
    }
}
