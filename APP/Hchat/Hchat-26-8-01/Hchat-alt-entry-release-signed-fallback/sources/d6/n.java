package d6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d6.m f2034a = null;

    static {
            d6.m r0 = new d6.m
            r1 = 0
            r0.<init>(r1)
            d6.n.f2034a = r0
            return
    }

    public static void a(int r9, int r10) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "bad utf-8 byte "
            r1.<init>(r2)
            r2 = 2
            char[] r3 = new char[r2]
            r4 = 0
            r5 = r4
        Le:
            r6 = 16
            if (r5 >= r2) goto L21
            int r7 = 1 - r5
            r8 = r9 & 15
            char r6 = java.lang.Character.forDigit(r8, r6)
            r3[r7] = r6
            int r9 = r9 >> 4
            int r5 = r5 + 1
            goto Le
        L21:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r3)
            r1.append(r9)
            java.lang.String r9 = " at offset "
            r1.append(r9)
            r9 = 8
            char[] r2 = new char[r9]
        L32:
            if (r4 >= r9) goto L43
            int r3 = 7 - r4
            r5 = r10 & 15
            char r5 = java.lang.Character.forDigit(r5, r6)
            r2[r3] = r5
            int r10 = r10 >> 4
            int r4 = r4 + 1
            goto L32
        L43:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
    }
}
