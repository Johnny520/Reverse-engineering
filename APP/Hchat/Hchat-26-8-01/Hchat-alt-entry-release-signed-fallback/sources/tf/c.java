package tf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static void a(int r2, int r3) {
            if (r2 < 0) goto L5
            if (r2 >= r3) goto L5
            return
        L5:
            java.lang.String r0 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r2 = p.a.j(r2, r0, r1, r3)
            okio.a.i(r2)
            return
    }

    public static void b(int r2, int r3) {
            if (r2 < 0) goto L5
            if (r2 > r3) goto L5
            return
        L5:
            java.lang.String r0 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r2 = p.a.j(r2, r0, r1, r3)
            okio.a.i(r2)
            return
    }

    public static void c(int r3, int r4, int r5) {
            java.lang.String r0 = "fromIndex: "
            if (r3 < 0) goto L13
            if (r4 > r5) goto L13
            if (r3 > r4) goto L9
            return
        L9:
            java.lang.String r5 = " > toIndex: "
            java.lang.String r3 = p.a.j(r3, r0, r5, r4)
            j8.o.t(r3)
            return
        L13:
            java.lang.String r1 = ", toIndex: "
            java.lang.String r2 = ", size: "
            java.lang.StringBuilder r3 = eh.a.s(r3, r4, r0, r1, r2)
            j8.o.e(r5, r3)
            return
    }

    public static int d(int r2, int r3) {
            int r0 = r2 >> 1
            int r2 = r2 + r0
            int r0 = r2 - r3
            if (r0 >= 0) goto L8
            r2 = r3
        L8:
            r0 = 2147483639(0x7ffffff7, float:NaN)
            int r1 = r2 - r0
            if (r1 <= 0) goto L16
            if (r3 <= r0) goto L15
            r2 = 2147483647(0x7fffffff, float:NaN)
            return r2
        L15:
            return r0
        L16:
            return r2
    }
}
