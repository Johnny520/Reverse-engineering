package io.fastkv;

import io.fastkv.interfaces.FastEncoder;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class StringSetEncoder implements FastEncoder<Set<String>> {
    static final StringSetEncoder INSTANCE = new StringSetEncoder();

    private StringSetEncoder() {
    }

    @Override // io.fastkv.interfaces.FastEncoder
    public String tag() {
        return "StringSet";
    }

    @Override // io.fastkv.interfaces.FastEncoder
    public Set<String> decode(byte[] bArr, int i, int i2) {
        int i3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i2 > 0) {
            FastBuffer fastBuffer = new FastBuffer(bArr, i);
            int i4 = i + i2;
            while (true) {
                i3 = fastBuffer.position;
                if (i3 >= i4) {
                    break;
                }
                linkedHashSet.add(fastBuffer.getString(fastBuffer.getVarint32()));
            }
            if (i3 != i4) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }

    @Override // io.fastkv.interfaces.FastEncoder
    public byte[] encode(Set<String> set) {
        if (set.isEmpty()) {
            return new byte[0];
        }
        int size = set.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        int varint32Size = 0;
        int i = 0;
        for (String str : set) {
            if (str == null) {
                varint32Size += 5;
                iArr[i] = -1;
            } else {
                int stringSize = FastBuffer.getStringSize(str);
                strArr[i] = str;
                iArr[i] = stringSize;
                varint32Size = FastBuffer.getVarint32Size(stringSize) + stringSize + varint32Size;
            }
            i++;
        }
        FastBuffer fastBuffer = new FastBuffer(varint32Size);
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = iArr[i2];
            fastBuffer.putVarint32(i3);
            if (i3 >= 0) {
                fastBuffer.putString(strArr[i2]);
            }
        }
        return fastBuffer.f2461hb;
    }
}
