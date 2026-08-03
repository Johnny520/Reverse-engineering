package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrays.kt\nkotlin/collections/ArraysKt__ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
public class C0585 extends Yue.C0584 {
    public C0585() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4986
    @Yue.InterfaceC5792(version = "1.3")
    @Yue.InterfaceC3421(name = "contentDeepEquals")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> boolean m2103(@Yue.InterfaceC4543 T[] r7, @Yue.InterfaceC4543 T[] r8) {
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L145
            if (r8 == 0) goto L145
            int r2 = r7.length
            int r3 = r8.length
            if (r2 == r3) goto Lf
            goto L145
        Lf:
            int r2 = r7.length
            r3 = r1
        L11:
            if (r3 >= r2) goto L144
            r4 = r7[r3]
            r5 = r8[r3]
            if (r4 != r5) goto L1b
            goto L13f
        L1b:
            if (r4 == 0) goto L143
            if (r5 != 0) goto L21
            goto L143
        L21:
            boolean r6 = r4 instanceof java.lang.Object[]
            if (r6 == 0) goto L34
            boolean r6 = r5 instanceof java.lang.Object[]
            if (r6 == 0) goto L34
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            boolean r4 = m2103(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L34:
            boolean r6 = r4 instanceof byte[]
            if (r6 == 0) goto L47
            boolean r6 = r5 instanceof byte[]
            if (r6 == 0) goto L47
            byte[] r4 = (byte[]) r4
            byte[] r5 = (byte[]) r5
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L47:
            boolean r6 = r4 instanceof short[]
            if (r6 == 0) goto L5a
            boolean r6 = r5 instanceof short[]
            if (r6 == 0) goto L5a
            short[] r4 = (short[]) r4
            short[] r5 = (short[]) r5
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L5a:
            boolean r6 = r4 instanceof int[]
            if (r6 == 0) goto L6d
            boolean r6 = r5 instanceof int[]
            if (r6 == 0) goto L6d
            int[] r4 = (int[]) r4
            int[] r5 = (int[]) r5
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L6d:
            boolean r6 = r4 instanceof long[]
            if (r6 == 0) goto L80
            boolean r6 = r5 instanceof long[]
            if (r6 == 0) goto L80
            long[] r4 = (long[]) r4
            long[] r5 = (long[]) r5
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L80:
            boolean r6 = r4 instanceof float[]
            if (r6 == 0) goto L93
            boolean r6 = r5 instanceof float[]
            if (r6 == 0) goto L93
            float[] r4 = (float[]) r4
            float[] r5 = (float[]) r5
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L93:
            boolean r6 = r4 instanceof double[]
            if (r6 == 0) goto La6
            boolean r6 = r5 instanceof double[]
            if (r6 == 0) goto La6
            double[] r4 = (double[]) r4
            double[] r5 = (double[]) r5
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        La6:
            boolean r6 = r4 instanceof char[]
            if (r6 == 0) goto Lb9
            boolean r6 = r5 instanceof char[]
            if (r6 == 0) goto Lb9
            char[] r4 = (char[]) r4
            char[] r5 = (char[]) r5
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        Lb9:
            boolean r6 = r4 instanceof boolean[]
            if (r6 == 0) goto Lcc
            boolean r6 = r5 instanceof boolean[]
            if (r6 == 0) goto Lcc
            boolean[] r4 = (boolean[]) r4
            boolean[] r5 = (boolean[]) r5
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        Lcc:
            boolean r6 = r4 instanceof Yue.C6519
            if (r6 == 0) goto Le7
            boolean r6 = r5 instanceof Yue.C6519
            if (r6 == 0) goto Le7
            Yue.ۥۢۢۥۦ r4 = (Yue.C6519) r4
            byte[] r4 = r4.m24869()
            Yue.ۥۢۢۥۦ r5 = (Yue.C6519) r5
            byte[] r5 = r5.m24869()
            boolean r4 = Yue.C6512.m24146(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        Le7:
            boolean r6 = r4 instanceof Yue.C6561
            if (r6 == 0) goto L102
            boolean r6 = r5 instanceof Yue.C6561
            if (r6 == 0) goto L102
            Yue.ۥۢۢۨۥ r4 = (Yue.C6561) r4
            short[] r4 = r4.m25314()
            Yue.ۥۢۢۨۥ r5 = (Yue.C6561) r5
            short[] r5 = r5.m25314()
            boolean r4 = Yue.C6512.m24144(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L102:
            boolean r6 = r4 instanceof Yue.C6530
            if (r6 == 0) goto L11d
            boolean r6 = r5 instanceof Yue.C6530
            if (r6 == 0) goto L11d
            Yue.ۥۢۢۦۤ r4 = (Yue.C6530) r4
            int[] r4 = r4.m25010()
            Yue.ۥۢۢۦۤ r5 = (Yue.C6530) r5
            int[] r5 = r5.m25010()
            boolean r4 = Yue.C6512.m24145(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L11d:
            boolean r6 = r4 instanceof Yue.C6541
            if (r6 == 0) goto L138
            boolean r6 = r5 instanceof Yue.C6541
            if (r6 == 0) goto L138
            Yue.ۥۢۢۧ۠ r4 = (Yue.C6541) r4
            long[] r4 = r4.m25111()
            Yue.ۥۢۢۧ۠ r5 = (Yue.C6541) r5
            long[] r5 = r5.m25111()
            boolean r4 = Yue.C6512.m24147(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L138:
            boolean r4 = Yue.C3329.m13897(r4, r5)
            if (r4 != 0) goto L13f
            return r1
        L13f:
            int r3 = r3 + 1
            goto L11
        L143:
            return r1
        L144:
            return r0
        L145:
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.3")
    @Yue.InterfaceC3421(name = "contentDeepToString")
    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> java.lang.String m2104(@Yue.InterfaceC4543 T[] r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = "null"
            return r2
        L5:
            int r0 = r2.length
            r1 = 429496729(0x19999999, float:1.5881867E-23)
            int r0 = Yue.C5196.m19521(r0, r1)
            int r0 = r0 * 5
            int r0 = r0 + 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            m2105(r2, r1, r0)
            java.lang.String r2 = r1.toString()
            java.lang.String r0 = "StringBuilder(capacity).…builderAction).toString()"
            Yue.C3329.m13905(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T> void m2105(T[] r5, java.lang.StringBuilder r6, java.util.List<java.lang.Object[]> r7) {
            boolean r0 = r7.contains(r5)
            if (r0 == 0) goto Lc
            java.lang.String r5 = "[...]"
            r6.append(r5)
            return
        Lc:
            r7.add(r5)
            r0 = 91
            r6.append(r0)
            int r0 = r5.length
            r1 = 0
        L16:
            if (r1 >= r0) goto L118
            if (r1 == 0) goto L1f
            java.lang.String r2 = ", "
            r6.append(r2)
        L1f:
            r2 = r5[r1]
            if (r2 != 0) goto L2a
            java.lang.String r2 = "null"
            r6.append(r2)
            goto L114
        L2a:
            boolean r3 = r2 instanceof java.lang.Object[]
            if (r3 == 0) goto L35
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            m2105(r2, r6, r7)
            goto L114
        L35:
            boolean r3 = r2 instanceof byte[]
            java.lang.String r4 = "toString(this)"
            if (r3 == 0) goto L49
            byte[] r2 = (byte[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            Yue.C3329.m13905(r2, r4)
            r6.append(r2)
            goto L114
        L49:
            boolean r3 = r2 instanceof short[]
            if (r3 == 0) goto L5b
            short[] r2 = (short[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            Yue.C3329.m13905(r2, r4)
            r6.append(r2)
            goto L114
        L5b:
            boolean r3 = r2 instanceof int[]
            if (r3 == 0) goto L6d
            int[] r2 = (int[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            Yue.C3329.m13905(r2, r4)
            r6.append(r2)
            goto L114
        L6d:
            boolean r3 = r2 instanceof long[]
            if (r3 == 0) goto L7f
            long[] r2 = (long[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            Yue.C3329.m13905(r2, r4)
            r6.append(r2)
            goto L114
        L7f:
            boolean r3 = r2 instanceof float[]
            if (r3 == 0) goto L91
            float[] r2 = (float[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            Yue.C3329.m13905(r2, r4)
            r6.append(r2)
            goto L114
        L91:
            boolean r3 = r2 instanceof double[]
            if (r3 == 0) goto La3
            double[] r2 = (double[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            Yue.C3329.m13905(r2, r4)
            r6.append(r2)
            goto L114
        La3:
            boolean r3 = r2 instanceof char[]
            if (r3 == 0) goto Lb4
            char[] r2 = (char[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            Yue.C3329.m13905(r2, r4)
            r6.append(r2)
            goto L114
        Lb4:
            boolean r3 = r2 instanceof boolean[]
            if (r3 == 0) goto Lc5
            boolean[] r2 = (boolean[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            Yue.C3329.m13905(r2, r4)
            r6.append(r2)
            goto L114
        Lc5:
            boolean r3 = r2 instanceof Yue.C6519
            if (r3 == 0) goto Ld7
            Yue.ۥۢۢۥۦ r2 = (Yue.C6519) r2
            byte[] r2 = r2.m24869()
            java.lang.String r2 = Yue.C6512.m24152(r2)
            r6.append(r2)
            goto L114
        Ld7:
            boolean r3 = r2 instanceof Yue.C6561
            if (r3 == 0) goto Le9
            Yue.ۥۢۢۨۥ r2 = (Yue.C6561) r2
            short[] r2 = r2.m25314()
            java.lang.String r2 = Yue.C6512.m24154(r2)
            r6.append(r2)
            goto L114
        Le9:
            boolean r3 = r2 instanceof Yue.C6530
            if (r3 == 0) goto Lfb
            Yue.ۥۢۢۦۤ r2 = (Yue.C6530) r2
            int[] r2 = r2.m25010()
            java.lang.String r2 = Yue.C6512.m24153(r2)
            r6.append(r2)
            goto L114
        Lfb:
            boolean r3 = r2 instanceof Yue.C6541
            if (r3 == 0) goto L10d
            Yue.ۥۢۢۧ۠ r2 = (Yue.C6541) r2
            long[] r2 = r2.m25111()
            java.lang.String r2 = Yue.C6512.m24155(r2)
            r6.append(r2)
            goto L114
        L10d:
            java.lang.String r2 = r2.toString()
            r6.append(r2)
        L114:
            int r1 = r1 + 1
            goto L16
        L118:
            r5 = 93
            r6.append(r5)
            int r5 = Yue.C1208.m6212(r7)
            r7.remove(r5)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final <T> java.util.List<T> m2106(@Yue.InterfaceC4418 T[][] r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r5, r0)
            int r0 = r5.length
            r1 = 0
            r2 = r1
            r3 = r2
        L9:
            if (r2 >= r0) goto L12
            r4 = r5[r2]
            int r4 = r4.length
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L9
        L12:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            int r2 = r5.length
        L18:
            if (r1 >= r2) goto L22
            r3 = r5[r1]
            Yue.C1216.m6248(r0, r3)
            int r1 = r1 + 1
            goto L18
        L22:
            return r0
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;LYue/ۥۣ۠۠ۨ<+TR;>;)TR; */
    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final java.lang.Object m2107(java.lang.Object[] r1, Yue.InterfaceC2823 r2) {
            java.lang.String r0 = "defaultValue"
            Yue.C3329.m13906(r2, r0)
            int r0 = r1.length
            if (r0 != 0) goto Lc
            java.lang.Object r1 = r2.invoke()
        Lc:
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC5792(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final boolean m2108(java.lang.Object[] r0) {
            if (r0 == 0) goto L8
            int r0 = r0.length
            if (r0 != 0) goto L6
            goto L8
        L6:
            r0 = 0
            goto L9
        L8:
            r0 = 1
        L9:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final <T, R> Yue.C4677<java.util.List<T>, java.util.List<R>> m2109(@Yue.InterfaceC4418 Yue.C4677<? extends T, ? extends R>[] r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r6.length
            r1.<init>(r2)
            int r2 = r6.length
            r3 = 0
        L13:
            if (r3 >= r2) goto L28
            r4 = r6[r3]
            java.lang.Object r5 = r4.m18540()
            r0.add(r5)
            java.lang.Object r4 = r4.m18541()
            r1.add(r4)
            int r3 = r3 + 1
            goto L13
        L28:
            Yue.ۥۣۡۦ۠ r6 = Yue.C6456.m23777(r0, r1)
            return r6
    }
}
