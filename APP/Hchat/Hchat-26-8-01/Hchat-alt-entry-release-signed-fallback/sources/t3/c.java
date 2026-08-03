package t3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13049a = null;

    static {
            r0 = 155(0x9b, float:2.17E-43)
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155} // fill-array
            t3.c.f13049a = r0
            return
    }

    public static /* synthetic */ java.lang.Integer a(int r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = r0 + (-1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    public static /* synthetic */ int b(int r0) {
            if (r0 == 0) goto L5
            int r0 = r0 + (-1)
            return r0
        L5:
            r0 = 0
            throw r0
    }

    public static /* synthetic */ int[] c(int r3) {
            int[] r0 = new int[r3]
            int[] r1 = t3.c.f13049a
            r2 = 0
            java.lang.System.arraycopy(r1, r2, r0, r2, r3)
            return r0
    }
}
