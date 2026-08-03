package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nCollectionToArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,82:1\n57#1,22:83\n57#1,22:105\n26#2:127\n*S KotlinDebug\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n*L\n19#1:83,22\n31#1:105,22\n14#1:127\n*E\n"})
@Yue.InterfaceC3421(name = "CollectionToArray")
public final class C1204 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final java.lang.Object[] f3752 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f3753 = 2147483645;

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            Yue.C1204.f3752 = r0
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "toArray")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.Object[] m6175(@Yue.InterfaceC4418 java.util.Collection<?> r4) {
            java.lang.String r0 = "collection"
            Yue.C3329.m13906(r4, r0)
            int r0 = r4.size()
            if (r0 != 0) goto Le
        Lb:
            java.lang.Object[] r4 = Yue.C1204.f3752
            goto L5d
        Le:
            java.util.Iterator r4 = r4.iterator()
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L19
            goto Lb
        L19:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
        L1c:
            int r2 = r1 + 1
            java.lang.Object r3 = r4.next()
            r0[r1] = r3
            int r1 = r0.length
            if (r2 < r1) goto L4e
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L2f
            r4 = r0
            goto L5d
        L2f:
            int r1 = r2 * 3
            int r1 = r1 + 1
            int r1 = r1 >>> 1
            if (r1 > r2) goto L43
            r1 = 2147483645(0x7ffffffd, float:NaN)
            if (r2 >= r1) goto L3d
            goto L43
        L3d:
            java.lang.OutOfMemoryError r4 = new java.lang.OutOfMemoryError
            r4.<init>()
            throw r4
        L43:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "copyOf(result, newSize)"
            Yue.C3329.m13905(r0, r1)
        L4c:
            r1 = r2
            goto L1c
        L4e:
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L4c
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r0 = "copyOf(result, size)"
            Yue.C3329.m13905(r4, r0)
        L5d:
            return r4
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3421(name = "toArray")
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.Object[] m6176(@Yue.InterfaceC4418 java.util.Collection<?> r5, @Yue.InterfaceC4543 java.lang.Object[] r6) {
            java.lang.String r0 = "collection"
            Yue.C3329.m13906(r5, r0)
            r6.getClass()
            int r0 = r5.size()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L17
            int r5 = r6.length
            if (r5 <= 0) goto L85
            r6[r2] = r1
            goto L85
        L17:
            java.util.Iterator r5 = r5.iterator()
            boolean r3 = r5.hasNext()
            if (r3 != 0) goto L27
            int r5 = r6.length
            if (r5 <= 0) goto L85
            r6[r2] = r1
            goto L85
        L27:
            int r3 = r6.length
            if (r0 > r3) goto L2c
            r0 = r6
            goto L3f
        L2c:
            java.lang.Class r3 = r6.getClass()
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r3, r0)
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>"
            Yue.C3329.m13904(r0, r3)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
        L3f:
            int r3 = r2 + 1
            java.lang.Object r4 = r5.next()
            r0[r2] = r4
            int r2 = r0.length
            if (r3 < r2) goto L71
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L52
            r6 = r0
            goto L85
        L52:
            int r2 = r3 * 3
            int r2 = r2 + 1
            int r2 = r2 >>> 1
            if (r2 > r3) goto L66
            r2 = 2147483645(0x7ffffffd, float:NaN)
            if (r3 >= r2) goto L60
            goto L66
        L60:
            java.lang.OutOfMemoryError r5 = new java.lang.OutOfMemoryError
            r5.<init>()
            throw r5
        L66:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r2 = "copyOf(result, newSize)"
            Yue.C3329.m13905(r0, r2)
        L6f:
            r2 = r3
            goto L3f
        L71:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L6f
            if (r0 != r6) goto L7c
            r6[r3] = r1
            goto L85
        L7c:
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r5 = "copyOf(result, size)"
            Yue.C3329.m13905(r6, r5)
        L85:
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.Object[] m6177(java.util.Collection<?> r2, Yue.InterfaceC2823<java.lang.Object[]> r3, Yue.InterfaceC2825<? super java.lang.Integer, java.lang.Object[]> r4, Yue.InterfaceC2839<? super java.lang.Object[], ? super java.lang.Integer, java.lang.Object[]> r5) {
            int r0 = r2.size()
            if (r0 != 0) goto Ld
            java.lang.Object r2 = r3.invoke()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            return r2
        Ld:
            java.util.Iterator r2 = r2.iterator()
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L1e
            java.lang.Object r2 = r3.invoke()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            return r2
        L1e:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r4.invoke(r3)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r4 = 0
        L29:
            int r0 = r4 + 1
            java.lang.Object r1 = r2.next()
            r3[r4] = r1
            int r4 = r3.length
            if (r0 < r4) goto L5a
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L3b
            return r3
        L3b:
            int r4 = r0 * 3
            int r4 = r4 + 1
            int r4 = r4 >>> 1
            if (r4 > r0) goto L4f
            r4 = 2147483645(0x7ffffffd, float:NaN)
            if (r0 >= r4) goto L49
            goto L4f
        L49:
            java.lang.OutOfMemoryError r2 = new java.lang.OutOfMemoryError
            r2.<init>()
            throw r2
        L4f:
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            java.lang.String r4 = "copyOf(result, newSize)"
            Yue.C3329.m13905(r3, r4)
        L58:
            r4 = r0
            goto L29
        L5a:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L58
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r5.invoke(r3, r2)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            return r2
    }
}
