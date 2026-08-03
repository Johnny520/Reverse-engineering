package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(21)
public final class C4755 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C4755 f15074 = null;

    static {
            Yue.ۥۡۤ۠ۢ r0 = new Yue.ۥۡۤ۠ۢ
            r0.<init>()
            Yue.C4755.f15074 = r0
            return
    }

    public C4755() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC1947
    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final android.os.PersistableBundle m18948(int r1) {
            android.os.PersistableBundle r0 = new android.os.PersistableBundle
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC1947
    @Yue.InterfaceC3427
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final void m18949(@Yue.InterfaceC4418 android.os.PersistableBundle r4, @Yue.InterfaceC4543 java.lang.String r5, @Yue.InterfaceC4543 java.lang.Object r6) {
            if (r6 != 0) goto L8
            r6 = 0
            r4.putString(r5, r6)
            goto L99
        L8:
            boolean r0 = r6 instanceof java.lang.Boolean
            if (r0 == 0) goto L17
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            Yue.C4756.m18950(r4, r5, r6)
            goto L99
        L17:
            boolean r0 = r6 instanceof java.lang.Double
            if (r0 == 0) goto L26
            java.lang.Number r6 = (java.lang.Number) r6
            double r0 = r6.doubleValue()
            r4.putDouble(r5, r0)
            goto L99
        L26:
            boolean r0 = r6 instanceof java.lang.Integer
            if (r0 == 0) goto L34
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r4.putInt(r5, r6)
            goto L99
        L34:
            boolean r0 = r6 instanceof java.lang.Long
            if (r0 == 0) goto L42
            java.lang.Number r6 = (java.lang.Number) r6
            long r0 = r6.longValue()
            r4.putLong(r5, r0)
            goto L99
        L42:
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L4c
            java.lang.String r6 = (java.lang.String) r6
            r4.putString(r5, r6)
            goto L99
        L4c:
            boolean r0 = r6 instanceof boolean[]
            if (r0 == 0) goto L56
            boolean[] r6 = (boolean[]) r6
            Yue.C4756.m18951(r4, r5, r6)
            goto L99
        L56:
            boolean r0 = r6 instanceof double[]
            if (r0 == 0) goto L60
            double[] r6 = (double[]) r6
            r4.putDoubleArray(r5, r6)
            goto L99
        L60:
            boolean r0 = r6 instanceof int[]
            if (r0 == 0) goto L6a
            int[] r6 = (int[]) r6
            r4.putIntArray(r5, r6)
            goto L99
        L6a:
            boolean r0 = r6 instanceof long[]
            if (r0 == 0) goto L74
            long[] r6 = (long[]) r6
            r4.putLongArray(r5, r6)
            goto L99
        L74:
            boolean r0 = r6 instanceof java.lang.Object[]
            r1 = 34
            java.lang.String r2 = " for key \""
            if (r0 == 0) goto Lbe
            java.lang.Class r0 = r6.getClass()
            java.lang.Class r0 = r0.getComponentType()
            Yue.C3329.m13903(r0)
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            boolean r3 = r3.isAssignableFrom(r0)
            if (r3 == 0) goto L9a
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<kotlin.String>"
            Yue.C3329.m13904(r6, r0)
            java.lang.String[] r6 = (java.lang.String[]) r6
            r4.putStringArray(r5, r6)
        L99:
            return
        L9a:
            java.lang.String r4 = r0.getCanonicalName()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Illegal value array type "
            r0.append(r3)
            r0.append(r4)
            r0.append(r2)
            r0.append(r5)
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            r6.<init>(r4)
            throw r6
        Lbe:
            java.lang.Class r4 = r6.getClass()
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Illegal value type "
            r0.append(r3)
            r0.append(r4)
            r0.append(r2)
            r0.append(r5)
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            r6.<init>(r4)
            throw r6
    }
}
