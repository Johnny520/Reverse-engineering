package io.fastkv;

/* JADX INFO: loaded from: classes.dex */
class StringSetEncoder implements io.fastkv.interfaces.FastEncoder<java.util.Set<java.lang.String>> {
    static final io.fastkv.StringSetEncoder INSTANCE = null;

    static {
            io.fastkv.StringSetEncoder r0 = new io.fastkv.StringSetEncoder
            r0.<init>()
            io.fastkv.StringSetEncoder.INSTANCE = r0
            return
    }

    private StringSetEncoder() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.fastkv.interfaces.FastEncoder
    public /* bridge */ /* synthetic */ java.util.Set<java.lang.String> decode(byte[] r1, int r2, int r3) {
            r0 = this;
            java.util.Set r1 = r0.decode2(r1, r2, r3)
            return r1
    }

    @Override // io.fastkv.interfaces.FastEncoder
    /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
    public java.util.Set<java.lang.String> decode2(byte[] r3, int r4, int r5) {
            r2 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            if (r5 <= 0) goto L28
            io.fastkv.FastBuffer r1 = new io.fastkv.FastBuffer
            r1.<init>(r3, r4)
            int r4 = r4 + r5
        Ld:
            int r3 = r1.position
            if (r3 >= r4) goto L1d
            int r3 = r1.getVarint32()
            java.lang.String r3 = r1.getString(r3)
            r0.add(r3)
            goto Ld
        L1d:
            if (r3 != r4) goto L20
            goto L28
        L20:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Invalid String set"
            r3.<init>(r4)
            throw r3
        L28:
            return r0
    }

    @Override // io.fastkv.interfaces.FastEncoder
    public /* bridge */ /* synthetic */ byte[] encode(java.util.Set<java.lang.String> r1) {
            r0 = this;
            java.util.Set r1 = (java.util.Set) r1
            byte[] r1 = r0.encode2(r1)
            return r1
    }

    /* JADX INFO: renamed from: encode, reason: avoid collision after fix types in other method */
    public byte[] encode2(java.util.Set<java.lang.String> r9) {
            r8 = this;
            boolean r0 = r9.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            byte[] r9 = new byte[r1]
            return r9
        La:
            int r0 = r9.size()
            int[] r2 = new int[r0]
            java.lang.String[] r3 = new java.lang.String[r0]
            java.util.Iterator r9 = r9.iterator()
            r4 = r1
            r5 = r4
        L18:
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L3e
            java.lang.Object r6 = r9.next()
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L2c
            int r4 = r4 + 5
            r6 = -1
            r2[r5] = r6
            goto L3b
        L2c:
            int r7 = io.fastkv.FastBuffer.getStringSize(r6)
            r3[r5] = r6
            r2[r5] = r7
            int r6 = io.fastkv.FastBuffer.getVarint32Size(r7)
            int r6 = r6 + r7
            int r6 = r6 + r4
            r4 = r6
        L3b:
            int r5 = r5 + 1
            goto L18
        L3e:
            io.fastkv.FastBuffer r9 = new io.fastkv.FastBuffer
            r9.<init>(r4)
        L43:
            if (r1 >= r0) goto L54
            r4 = r2[r1]
            r9.putVarint32(r4)
            if (r4 < 0) goto L51
            r4 = r3[r1]
            r9.putString(r4)
        L51:
            int r1 = r1 + 1
            goto L43
        L54:
            byte[] r9 = r9.hb
            return r9
    }

    @Override // io.fastkv.interfaces.FastEncoder
    public java.lang.String tag() {
            r1 = this;
            java.lang.String r0 = "StringSet"
            return r0
    }
}
