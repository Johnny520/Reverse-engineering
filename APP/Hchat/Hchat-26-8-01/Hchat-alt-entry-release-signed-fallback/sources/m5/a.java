package m5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f8718a = null;

    static {
            r0 = 8
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [100, 101, 120, 10, 0, 0, 0, 0} // fill-array
            m5.a.f8718a = r0
            return
    }

    public static int a(byte[] r5) {
            int r0 = r5.length
            r1 = 8
            if (r0 >= r1) goto L6
            goto L2e
        L6:
            r0 = 0
        L7:
            byte[] r1 = m5.a.f8718a
            r2 = 4
            if (r0 >= r2) goto L16
            r2 = r5[r0]
            r1 = r1[r0]
            if (r2 == r1) goto L13
            goto L2e
        L13:
            int r0 = r0 + 1
            goto L7
        L16:
            r0 = r2
        L17:
            r3 = 48
            r4 = 7
            if (r0 >= r4) goto L28
            r4 = r5[r0]
            if (r4 < r3) goto L2e
            r3 = 57
            if (r4 <= r3) goto L25
            goto L2e
        L25:
            int r0 = r0 + 1
            goto L17
        L28:
            r0 = r5[r4]
            r1 = r1[r4]
            if (r0 == r1) goto L30
        L2e:
            r5 = -1
            return r5
        L30:
            r0 = r5[r2]
            int r0 = r0 - r3
            int r0 = r0 * 100
            r1 = 5
            r1 = r5[r1]
            r2 = 10
            int r0 = p.a.z(r1, r3, r2, r0)
            r1 = 6
            r5 = r5[r1]
            int r5 = r5 - r3
            int r5 = r5 + r0
            return r5
    }
}
