package df;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.nio.ByteBuffer f2206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f2208d;

    public a(long r2, byte[] r4, boolean r5) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f2208d = r0
            r1.f2205a = r2
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r4)
            r1.f2206b = r2
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r3)
            r1.f2207c = r5
            return
    }

    public final java.lang.String a(int r10) {
            r9 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            java.util.HashMap r1 = r9.f2208d
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lf
            return r0
        Lf:
            int r0 = r10 * 4
            java.nio.ByteBuffer r2 = r9.f2206b
            int r3 = r2.limit()
            int r3 = r3 + (-3)
            java.lang.String r4 = "⟨STRING_DECODE_ERROR⟩"
            if (r0 < r3) goto L1e
            goto L24
        L1e:
            int r0 = r2.getInt(r0)
            if (r0 >= 0) goto L25
        L24:
            return r4
        L25:
            long r5 = r9.f2205a
            long r7 = (long) r0
            long r5 = r5 + r7
            boolean r0 = r9.f2207c
            r3 = 2
            if (r0 == 0) goto L66
            byte[] r0 = r2.array()
            int r2 = (int) r5
            int r5 = r0.length
            if (r2 < r5) goto L37
            goto L96
        L37:
            r4 = r0[r2]
            r4 = r4 & 128(0x80, float:1.8E-43)
            if (r4 != 0) goto L3f
            r4 = 1
            goto L40
        L3f:
            r4 = r3
        L40:
            int r2 = r2 + r4
            int r4 = r2 + 1
            r5 = r0[r2]
            if (r5 != 0) goto L4a
            java.lang.String r4 = ""
            goto L96
        L4a:
            r6 = r5 & 128(0x80, float:1.8E-43)
            if (r6 == 0) goto L59
            r5 = r5 & 127(0x7f, float:1.78E-43)
            int r5 = r5 << 8
            int r2 = r2 + r3
            r3 = r0[r4]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r5 = r5 | r3
            r4 = r2
        L59:
            int r5 = r5 + r4
            byte[] r0 = java.util.Arrays.copyOfRange(r0, r4, r5)
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r2 = df.e.f2217k
            r4.<init>(r0, r2)
            goto L96
        L66:
            byte[] r0 = r2.array()
            int r2 = (int) r5
            int r5 = r2 + 2
            int r6 = r0.length
            if (r5 < r6) goto L71
            goto L96
        L71:
            int r4 = r0.length
            int r5 = r2 + 1
            r5 = r0[r5]
            r5 = r5 & 128(0x80, float:1.8E-43)
            if (r5 != 0) goto L7b
            goto L7c
        L7b:
            r3 = 4
        L7c:
            int r2 = r2 + r3
            r3 = r2
        L7e:
            int r5 = r3 + 1
            if (r5 < r4) goto L83
            goto L8b
        L83:
            r6 = r0[r3]
            if (r6 != 0) goto L9e
            r5 = r0[r5]
            if (r5 != 0) goto L9e
        L8b:
            byte[] r0 = java.util.Arrays.copyOfRange(r0, r2, r3)
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r2 = df.e.f2216j
            r4.<init>(r0, r2)
        L96:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1.put(r10, r4)
            return r4
        L9e:
            int r3 = r3 + 2
            goto L7e
    }
}
