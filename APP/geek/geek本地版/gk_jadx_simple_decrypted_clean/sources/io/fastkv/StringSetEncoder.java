package io.fastkv;

import io.fastkv.interfaces.FastEncoder;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class StringSetEncoder implements FastEncoder<Set<String>> {
    static final StringSetEncoder INSTANCE = null;

    static {
        INSTANCE = new StringSetEncoder();
    }

    private StringSetEncoder() {
    }

    @Override // io.fastkv.interfaces.FastEncoder
    public /* bridge */ /* synthetic */ Set<String> decode(byte[] r1, int r2, int r3) {
        return decode2(r1, r2, r3);
    }

    @Override // io.fastkv.interfaces.FastEncoder
    public /* bridge */ /* synthetic */ byte[] encode(Set<String> r1) {
        return encode2(r1);
    }

    @Override // io.fastkv.interfaces.FastEncoder
    public String tag() {
        return "StringSet";
    }

    @Override // io.fastkv.interfaces.FastEncoder
    /* JADX INFO: renamed from: decode, reason: avoid collision after fix types in other method */
    public Set<String> decode2(byte[] r3, int r4, int r5) {
        LinkedHashSet r0 = new LinkedHashSet();
        if (r5 <= 0) goto L12;
        FastBuffer r1 = new FastBuffer(r3, r4);
        int r42 = r4 + r5;
    L5:
        int r32 = r1.position;
        if (r32 >= r42) goto L8;
        r0.add(r1.getString(r1.getVarint32()));
        goto L5
    L8:
        if (r32 == r42) goto L12;
        throw new IllegalArgumentException("Invalid String set");
    L12:
        return r0;
    }

    /* JADX INFO: renamed from: encode, reason: avoid collision after fix types in other method */
    public byte[] encode2(Set<String> r9) {
        int r1 = 0;
        if (r9.isEmpty() == true) goto L5;
        int r0 = r9.size();
        int[] r2 = new int[r0];
        String[] r3 = new String[r0];
        Iterator<String> r92 = r9.iterator();
        int r4 = 0;
        int r5 = 0;
    L8:
        if (r92.hasNext() == false) goto L14;
        String r6 = r92.next();
        if (r6 != null) goto L12;
        r4 = r4 + 5;
        r2[r5] = -1;
    L13:
        r5 = r5 + 1;
        goto L8
    L12:
        int r7 = FastBuffer.getStringSize(r6);
        r3[r5] = r6;
        r2[r5] = r7;
        r4 = (FastBuffer.getVarint32Size(r7) + r7) + r4;
        goto L13
    L14:
        FastBuffer r93 = new FastBuffer(r4);
    L15:
        if (r1 >= r0) goto L21;
        int r42 = r2[r1];
        r93.putVarint32(r42);
        if (r42 < 0) goto L19;
        r93.putString(r3[r1]);
    L19:
        r1 = r1 + 1;
        goto L15
    L21:
        return r93.hb;
    L5:
        return new byte[0];
    }
}
