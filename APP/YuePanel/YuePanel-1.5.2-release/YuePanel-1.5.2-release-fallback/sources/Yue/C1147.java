package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,205:1\n1559#2:206\n1590#2,4:207\n1253#2,4:211\n1238#2,4:217\n453#3:215\n403#3:216\n*S KotlinDebug\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference\n*L\n107#1:206\n107#1:207,4\n155#1:211,4\n163#1:217,4\n163#1:215\n163#1:216\n*E\n"})
public final class C1147 implements Yue.InterfaceC3435<java.lang.Object>, Yue.InterfaceC1144 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C1147.C1148 f3533 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.util.Map<java.lang.Class<? extends Yue.InterfaceC2840<?>>, java.lang.Integer> f3534 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.util.HashMap<java.lang.String, java.lang.String> f3535 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.util.HashMap<java.lang.String, java.lang.String> f3536 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.util.HashMap<java.lang.String, java.lang.String> f3537 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.util.Map<java.lang.String, java.lang.String> f3538 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.Class<?> f3539;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۧۢ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nClassReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassReference.kt\nkotlin/jvm/internal/ClassReference$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1#2:206\n*E\n"})
    public static final class C1148 {
        public C1148() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C1148(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.lang.String m6042(@Yue.InterfaceC4418 java.lang.Class<?> r3) {
                r2 = this;
                java.lang.String r0 = "jClass"
                Yue.C3329.m13906(r3, r0)
                boolean r0 = r3.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Ld
                goto L5f
            Ld:
                boolean r0 = r3.isLocalClass()
                if (r0 == 0) goto L14
                goto L5f
            L14:
                boolean r0 = r3.isArray()
                if (r0 == 0) goto L4a
                java.lang.Class r3 = r3.getComponentType()
                boolean r0 = r3.isPrimitive()
                if (r0 == 0) goto L45
                java.util.HashMap r0 = Yue.C1147.m6015()
                java.lang.String r3 = r3.getName()
                java.lang.Object r3 = r0.get(r3)
                java.lang.String r3 = (java.lang.String) r3
                if (r3 == 0) goto L45
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r3 = "Array"
                r0.append(r3)
                java.lang.String r1 = r0.toString()
            L45:
                if (r1 != 0) goto L5f
                java.lang.String r1 = "kotlin.Array"
                goto L5f
            L4a:
                java.util.HashMap r0 = Yue.C1147.m6015()
                java.lang.String r1 = r3.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto L5f
                java.lang.String r1 = r3.getCanonicalName()
            L5f:
                return r1
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final java.lang.String m6043(@Yue.InterfaceC4418 java.lang.Class<?> r8) {
                r7 = this;
                java.lang.String r0 = "jClass"
                Yue.C3329.m13906(r8, r0)
                boolean r0 = r8.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Le
                goto Lb5
            Le:
                boolean r0 = r8.isLocalClass()
                if (r0 == 0) goto L6c
                java.lang.String r0 = r8.getSimpleName()
                java.lang.reflect.Method r2 = r8.getEnclosingMethod()
                r3 = 2
                r4 = 36
                java.lang.String r5 = "name"
                if (r2 == 0) goto L43
                Yue.C3329.m13905(r0, r5)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r2 = r2.getName()
                r6.append(r2)
                r6.append(r4)
                java.lang.String r2 = r6.toString()
                java.lang.String r2 = Yue.C5989.m22466(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L40
                goto L43
            L40:
                r1 = r2
                goto Lb5
            L43:
                java.lang.reflect.Constructor r8 = r8.getEnclosingConstructor()
                if (r8 == 0) goto L64
                Yue.C3329.m13905(r0, r5)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r8 = r8.getName()
                r2.append(r8)
                r2.append(r4)
                java.lang.String r8 = r2.toString()
                java.lang.String r1 = Yue.C5989.m22466(r0, r8, r1, r3, r1)
                goto Lb5
            L64:
                Yue.C3329.m13905(r0, r5)
                java.lang.String r1 = Yue.C5989.m22465(r0, r4, r1, r3, r1)
                goto Lb5
            L6c:
                boolean r0 = r8.isArray()
                if (r0 == 0) goto La0
                java.lang.Class r8 = r8.getComponentType()
                boolean r0 = r8.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L9d
                java.util.Map r0 = Yue.C1147.m6017()
                java.lang.String r8 = r8.getName()
                java.lang.Object r8 = r0.get(r8)
                java.lang.String r8 = (java.lang.String) r8
                if (r8 == 0) goto L9d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r8)
                r0.append(r2)
                java.lang.String r1 = r0.toString()
            L9d:
                if (r1 != 0) goto Lb5
                goto L40
            La0:
                java.util.Map r0 = Yue.C1147.m6017()
                java.lang.String r1 = r8.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Lb5
                java.lang.String r1 = r8.getSimpleName()
            Lb5:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final boolean m6044(@Yue.InterfaceC4543 java.lang.Object r3, @Yue.InterfaceC4418 java.lang.Class<?> r4) {
                r2 = this;
                java.lang.String r0 = "jClass"
                Yue.C3329.m13906(r4, r0)
                java.util.Map r0 = Yue.C1147.m6016()
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>"
                Yue.C3329.m13904(r0, r1)
                java.lang.Object r0 = r0.get(r4)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto L1f
                int r4 = r0.intValue()
                boolean r3 = Yue.C6466.m23841(r3, r4)
                return r3
            L1f:
                boolean r0 = r4.isPrimitive()
                if (r0 == 0) goto L2d
                Yue.ۥ۠ۦۢۢ r4 = Yue.C3413.m14197(r4)
                java.lang.Class r4 = Yue.C3413.m14195(r4)
            L2d:
                boolean r3 = r4.isInstance(r3)
                return r3
        }
    }

    static {
            Yue.ۥ۟ۤۧۢ$ۥ r0 = new Yue.ۥ۟ۤۧۢ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C1147.f3533 = r0
            java.lang.Class<Yue.ۥۣ۠ۢ۠> r23 = Yue.InterfaceC2837.class
            java.lang.Class<Yue.ۥۣ۠ۢۡ> r24 = Yue.InterfaceC2838.class
            java.lang.Class<Yue.ۥۣ۠۠ۨ> r2 = Yue.InterfaceC2823.class
            java.lang.Class<Yue.ۥۣ۠ۡ۟> r3 = Yue.InterfaceC2825.class
            java.lang.Class<Yue.ۥۣ۠ۢۢ> r4 = Yue.InterfaceC2839.class
            java.lang.Class<Yue.ۥۣ۠ۢۤ> r5 = Yue.InterfaceC2841.class
            java.lang.Class<Yue.ۥۣ۠ۢۥ> r6 = Yue.InterfaceC2842.class
            java.lang.Class<Yue.ۥۣ۠ۢۦ> r7 = Yue.InterfaceC2843.class
            java.lang.Class<Yue.ۥۣ۠ۢۧ> r8 = Yue.InterfaceC2844.class
            java.lang.Class<Yue.ۥۣ۠ۢۨ> r9 = Yue.InterfaceC2845.class
            java.lang.Class<Yue.ۥۣۣ۠> r10 = Yue.InterfaceC2846.class
            java.lang.Class<Yue.ۥۣۣ۠۟> r11 = Yue.InterfaceC2847.class
            java.lang.Class<Yue.ۥۣ۠ۡ> r12 = Yue.InterfaceC2824.class
            java.lang.Class<Yue.ۥۣ۠ۡ۠> r13 = Yue.InterfaceC2826.class
            java.lang.Class<Yue.ۥۣ۠ۡۡ> r14 = Yue.InterfaceC2827.class
            java.lang.Class<Yue.ۥۣ۠ۡۢ> r15 = Yue.InterfaceC2828.class
            java.lang.Class<Yue.ۥۣۣ۠ۡ> r16 = Yue.InterfaceC2829.class
            java.lang.Class<Yue.ۥۣ۠ۡۤ> r17 = Yue.InterfaceC2830.class
            java.lang.Class<Yue.ۥۣ۠ۡۥ> r18 = Yue.InterfaceC2831.class
            java.lang.Class<Yue.ۥۣ۠ۡۦ> r19 = Yue.InterfaceC2832.class
            java.lang.Class<Yue.ۥۣ۠ۡۧ> r20 = Yue.InterfaceC2833.class
            java.lang.Class<Yue.ۥۣ۠ۡۨ> r21 = Yue.InterfaceC2834.class
            java.lang.Class<Yue.ۥۣ۠ۢ۟> r22 = Yue.InterfaceC2836.class
            java.lang.Class[] r0 = new java.lang.Class[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24}
            java.util.List r0 = Yue.C1208.m6217(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = Yue.C1210.m6231(r0, r3)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
        L4e:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L6e
            java.lang.Object r4 = r0.next()
            int r5 = r3 + 1
            if (r3 >= 0) goto L5f
            Yue.C1208.m6228()
        L5f:
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            Yue.ۥۣۡۦ۠ r3 = Yue.C6456.m23777(r4, r3)
            r2.add(r3)
            r3 = r5
            goto L4e
        L6e:
            java.util.Map r0 = Yue.C3901.m15794(r2)
            Yue.C1147.f3534 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r2 = "boolean"
            java.lang.String r3 = "kotlin.Boolean"
            r0.put(r2, r3)
            java.lang.String r2 = "char"
            java.lang.String r4 = "kotlin.Char"
            r0.put(r2, r4)
            java.lang.String r2 = "byte"
            java.lang.String r5 = "kotlin.Byte"
            r0.put(r2, r5)
            java.lang.String r2 = "short"
            java.lang.String r6 = "kotlin.Short"
            r0.put(r2, r6)
            java.lang.String r2 = "int"
            java.lang.String r7 = "kotlin.Int"
            r0.put(r2, r7)
            java.lang.String r2 = "float"
            java.lang.String r8 = "kotlin.Float"
            r0.put(r2, r8)
            java.lang.String r2 = "long"
            java.lang.String r9 = "kotlin.Long"
            r0.put(r2, r9)
            java.lang.String r2 = "double"
            java.lang.String r10 = "kotlin.Double"
            r0.put(r2, r10)
            Yue.C1147.f3535 = r0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r11 = "java.lang.Boolean"
            r2.put(r11, r3)
            java.lang.String r3 = "java.lang.Character"
            r2.put(r3, r4)
            java.lang.String r3 = "java.lang.Byte"
            r2.put(r3, r5)
            java.lang.String r3 = "java.lang.Short"
            r2.put(r3, r6)
            java.lang.String r3 = "java.lang.Integer"
            r2.put(r3, r7)
            java.lang.String r3 = "java.lang.Float"
            r2.put(r3, r8)
            java.lang.String r3 = "java.lang.Long"
            r2.put(r3, r9)
            java.lang.String r3 = "java.lang.Double"
            r2.put(r3, r10)
            Yue.C1147.f3536 = r2
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "java.lang.Object"
            java.lang.String r5 = "kotlin.Any"
            r3.put(r4, r5)
            java.lang.String r4 = "java.lang.String"
            java.lang.String r5 = "kotlin.String"
            r3.put(r4, r5)
            java.lang.String r4 = "java.lang.CharSequence"
            java.lang.String r5 = "kotlin.CharSequence"
            r3.put(r4, r5)
            java.lang.String r4 = "java.lang.Throwable"
            java.lang.String r5 = "kotlin.Throwable"
            r3.put(r4, r5)
            java.lang.String r4 = "java.lang.Cloneable"
            java.lang.String r5 = "kotlin.Cloneable"
            r3.put(r4, r5)
            java.lang.String r4 = "java.lang.Number"
            java.lang.String r5 = "kotlin.Number"
            r3.put(r4, r5)
            java.lang.String r4 = "java.lang.Comparable"
            java.lang.String r5 = "kotlin.Comparable"
            r3.put(r4, r5)
            java.lang.String r4 = "java.lang.Enum"
            java.lang.String r5 = "kotlin.Enum"
            r3.put(r4, r5)
            java.lang.String r4 = "java.lang.annotation.Annotation"
            java.lang.String r5 = "kotlin.Annotation"
            r3.put(r4, r5)
            java.lang.String r4 = "java.lang.Iterable"
            java.lang.String r5 = "kotlin.collections.Iterable"
            r3.put(r4, r5)
            java.lang.String r4 = "java.util.Iterator"
            java.lang.String r5 = "kotlin.collections.Iterator"
            r3.put(r4, r5)
            java.lang.String r4 = "java.util.Collection"
            java.lang.String r5 = "kotlin.collections.Collection"
            r3.put(r4, r5)
            java.lang.String r4 = "java.util.List"
            java.lang.String r5 = "kotlin.collections.List"
            r3.put(r4, r5)
            java.lang.String r4 = "java.util.Set"
            java.lang.String r5 = "kotlin.collections.Set"
            r3.put(r4, r5)
            java.lang.String r4 = "java.util.ListIterator"
            java.lang.String r5 = "kotlin.collections.ListIterator"
            r3.put(r4, r5)
            java.lang.String r4 = "java.util.Map"
            java.lang.String r5 = "kotlin.collections.Map"
            r3.put(r4, r5)
            java.lang.String r4 = "java.util.Map$Entry"
            java.lang.String r5 = "kotlin.collections.Map.Entry"
            r3.put(r4, r5)
            java.lang.String r4 = "kotlin.jvm.internal.StringCompanionObject"
            java.lang.String r5 = "kotlin.String.Companion"
            r3.put(r4, r5)
            java.lang.String r4 = "kotlin.jvm.internal.EnumCompanionObject"
            java.lang.String r5 = "kotlin.Enum.Companion"
            r3.put(r4, r5)
            r3.putAll(r0)
            r3.putAll(r2)
            java.util.Collection r0 = r0.values()
            java.lang.String r2 = "primitiveFqNames.values"
            Yue.C3329.m13905(r0, r2)
            java.util.Iterator r0 = r0.iterator()
        L17f:
            boolean r2 = r0.hasNext()
            r4 = 2
            r5 = 46
            if (r2 == 0) goto L1ce
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "kotlin.jvm.internal."
            r6.append(r7)
            java.lang.String r7 = "kotlinName"
            Yue.C3329.m13905(r2, r7)
            java.lang.String r4 = Yue.C5989.m22469(r2, r5, r1, r4, r1)
            r6.append(r4)
            java.lang.String r4 = "CompanionObject"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r2 = ".Companion"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            Yue.ۥۣۡۦ۠ r2 = Yue.C6456.m23777(r4, r2)
            java.lang.Object r4 = r2.m18540()
            java.lang.Object r2 = r2.m18541()
            r3.put(r4, r2)
            goto L17f
        L1ce:
            java.util.Map<java.lang.Class<? extends Yue.ۥۣۣ۠ۢ<?>>, java.lang.Integer> r0 = Yue.C1147.f3534
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1d8:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L20d
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r6 = r2.getKey()
            java.lang.Class r6 = (java.lang.Class) r6
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.String r6 = r6.getName()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "kotlin.Function"
            r7.append(r8)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            r3.put(r6, r2)
            goto L1d8
        L20d:
            Yue.C1147.f3537 = r3
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r2 = r3.size()
            int r2 = Yue.C3900.m15722(r2)
            r0.<init>(r2)
            java.util.Set r2 = r3.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L224:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L242
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r6 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = Yue.C5989.m22469(r3, r5, r1, r4, r1)
            r0.put(r6, r3)
            goto L224
        L242:
            Yue.C1147.f3538 = r0
            return
    }

    public C1147(@Yue.InterfaceC4418 java.lang.Class<?> r2) {
            r1 = this;
            java.lang.String r0 = "jClass"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f3539 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final /* synthetic */ java.util.HashMap m6015() {
            java.util.HashMap<java.lang.String, java.lang.String> r0 = Yue.C1147.f3537
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final /* synthetic */ java.util.Map m6016() {
            java.util.Map<java.lang.Class<? extends Yue.ۥۣۣ۠ۢ<?>>, java.lang.Integer> r0 = Yue.C1147.f3534
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final /* synthetic */ java.util.Map m6017() {
            java.util.Map<java.lang.String, java.lang.String> r0 = Yue.C1147.f3538
            return r0
    }

    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static /* synthetic */ void m6018() {
            return
    }

    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static /* synthetic */ void m6019() {
            return
    }

    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static /* synthetic */ void m6020() {
            return
    }

    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static /* synthetic */ void m6021() {
            return
    }

    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static /* synthetic */ void m6022() {
            return
    }

    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static /* synthetic */ void m6023() {
            return
    }

    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m6024() {
            return
    }

    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static /* synthetic */ void m6025() {
            return
    }

    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static /* synthetic */ void m6026() {
            return
    }

    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static /* synthetic */ void m6027() {
            return
    }

    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static /* synthetic */ void m6028() {
            return
    }

    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m6029() {
            return
    }

    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static /* synthetic */ void m6030() {
            return
    }

    @Override // Yue.InterfaceC3435
    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof Yue.C1147
            if (r0 == 0) goto L16
            java.lang.Class r0 = Yue.C3413.m14195(r1)
            Yue.ۥ۠ۦۢۢ r2 = (Yue.InterfaceC3435) r2
            java.lang.Class r2 = Yue.C3413.m14195(r2)
            boolean r2 = Yue.C3329.m13897(r0, r2)
            if (r2 == 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    @Override // Yue.InterfaceC3432
    @Yue.InterfaceC4418
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
            r1 = this;
            r1.m6041()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Override // Yue.InterfaceC3435
    @Yue.InterfaceC4418
    public java.util.Collection<Yue.InterfaceC3441<java.lang.Object>> getConstructors() {
            r1 = this;
            r1.m6041()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Override // Yue.InterfaceC3435
    @Yue.InterfaceC4543
    public java.lang.String getSimpleName() {
            r2 = this;
            Yue.ۥ۟ۤۧۢ$ۥ r0 = Yue.C1147.f3533
            java.lang.Class r1 = r2.mo6000()
            java.lang.String r0 = r0.m6043(r1)
            return r0
    }

    @Override // Yue.InterfaceC3435
    @Yue.InterfaceC4418
    public java.util.List<Yue.InterfaceC3476> getTypeParameters() {
            r1 = this;
            r1.m6041()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Override // Yue.InterfaceC3435
    @Yue.InterfaceC4543
    public Yue.EnumC3481 getVisibility() {
            r1 = this;
            r1.m6041()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Override // Yue.InterfaceC3435
    public int hashCode() {
            r1 = this;
            java.lang.Class r0 = Yue.C3413.m14195(r1)
            int r0 = r0.hashCode()
            return r0
    }

    @Override // Yue.InterfaceC3435
    public boolean isAbstract() {
            r1 = this;
            r1.m6041()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Override // Yue.InterfaceC3435
    public boolean isData() {
            r1 = this;
            r1.m6041()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Override // Yue.InterfaceC3435
    public boolean isFinal() {
            r1 = this;
            r1.m6041()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Override // Yue.InterfaceC3435
    @Yue.InterfaceC5792(version = "1.1")
    public boolean isInstance(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            Yue.ۥ۟ۤۧۢ$ۥ r0 = Yue.C1147.f3533
            java.lang.Class r1 = r2.mo6000()
            boolean r3 = r0.m6044(r3, r1)
            return r3
    }

    @Override // Yue.InterfaceC3435
    public boolean isOpen() {
            r1 = this;
            r1.m6041()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Override // Yue.InterfaceC3435
    public boolean isSealed() {
            r1 = this;
            r1.m6041()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.mo6000()
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = " (Kotlin reflection is not available)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC3435, Yue.InterfaceC3440
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.util.Collection<Yue.InterfaceC3433<?>> mo6031() {
            r1 = this;
            r1.m6041()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Override // Yue.InterfaceC3435
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.lang.String mo6032() {
            r2 = this;
            Yue.ۥ۟ۤۧۢ$ۥ r0 = Yue.C1147.f3533
            java.lang.Class r1 = r2.mo6000()
            java.lang.String r0 = r0.m6042(r1)
            return r0
    }

    @Override // Yue.InterfaceC3435
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public java.util.Collection<Yue.InterfaceC3435<?>> mo6033() {
            r1 = this;
            r1.m6041()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Override // Yue.InterfaceC3435
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean mo6034() {
            r1 = this;
            r1.m6041()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Override // Yue.InterfaceC3435
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public java.util.List<Yue.InterfaceC3435<? extends java.lang.Object>> mo6035() {
            r1 = this;
            r1.m6041()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Override // Yue.InterfaceC3435
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean mo6036() {
            r1 = this;
            r1.m6041()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Override // Yue.InterfaceC1144
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public java.lang.Class<?> mo6000() {
            r1 = this;
            java.lang.Class<?> r0 = r1.f3539
            return r0
    }

    @Override // Yue.InterfaceC3435
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public boolean mo6037() {
            r1 = this;
            r1.m6041()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Override // Yue.InterfaceC3435
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public java.util.List<Yue.InterfaceC3473> mo6038() {
            r1 = this;
            r1.m6041()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Override // Yue.InterfaceC3435
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public java.lang.Object mo6039() {
            r1 = this;
            r1.m6041()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    @Override // Yue.InterfaceC3435
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean mo6040() {
            r1 = this;
            r1.m6041()
            Yue.ۥ۠ۦۧۤ r0 = new Yue.ۥ۠ۦۧۤ
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final java.lang.Void m6041() {
            r1 = this;
            Yue.ۥ۠ۦۧۧ r0 = new Yue.ۥ۠ۦۧۧ
            r0.<init>()
            throw r0
    }
}
