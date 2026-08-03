package i3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static byte[] a(java.nio.ByteBuffer r5, qf.a r6) {
            int r0 = r6.f11016e
            java.nio.Buffer r0 = r5.position(r0)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteBuffer r5 = r5.slice()
            long r0 = r6.f11017f
            int r0 = (int) r0
            java.nio.Buffer r0 = r5.limit(r0)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            long r0 = r6.f11018g
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L4f
            int r0 = (int) r0
            byte[] r1 = new byte[r0]
            java.util.zip.Inflater r2 = new java.util.zip.Inflater
            r3 = 1
            r2.<init>(r3)
            r2.setInput(r5)
            int r5 = r2.inflate(r1)
            r2.end()
            if (r5 != r0) goto L34
            return r1
        L34:
            java.util.zip.DataFormatException r1 = new java.util.zip.DataFormatException
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r2 = ", got: "
            java.lang.String r3 = ", expected: "
            java.lang.String r4 = "Unexpected size of decompressed entry: "
            java.lang.StringBuilder r5 = eh.a.u(r5, r4, r6, r2, r3)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            throw r1
        L4f:
            java.util.zip.DataFormatException r5 = new java.util.zip.DataFormatException
            java.lang.String r6 = "Entry too large: "
            java.lang.String r6 = bc.e.g(r0, r6)
            r5.<init>(r6)
            throw r5
    }

    public static void b(android.view.inputmethod.EditorInfo r0, boolean r1) {
            r0.setStylusHandwritingEnabled(r1)
            return
    }
}
