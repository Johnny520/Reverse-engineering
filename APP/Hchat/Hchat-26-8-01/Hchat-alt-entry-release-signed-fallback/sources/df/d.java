package df;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double[] f2215a = null;

    static {
            r0 = 4
            double[] r1 = new double[r0]
            r1 = {x0064: FILL_ARRAY_DATA , data: [4571153621781053440, 4539628424389459968, 4503599627370496000, 4467570830351532032} // fill-array
            df.d.f2215a = r1
            int r0 = a(r0)
            r1 = 5
            int r1 = a(r1)
            r2 = 6
            int r2 = a(r2)
            r3 = 7
            int r3 = a(r3)
            r4 = 8
            int r4 = a(r4)
            r5 = 9
            int r5 = a(r5)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r7 = "other"
            r6.put(r0, r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = "zero"
            r6.put(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.String r1 = "one"
            r6.put(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.String r1 = "two"
            r6.put(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.String r1 = "few"
            r6.put(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.String r1 = "many"
            r6.put(r0, r1)
            return
    }

    public static int a(int r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 | r0
            return r1
    }
}
