package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4542 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract void mo8508(Object obj, Object obj2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m8523(int i, InterfaceC4191 interfaceC4191, Object obj) throws InvalidProtocolBufferException {
        int iMo8001 = interfaceC4191.mo8001();
        int i2 = iMo8001 >>> 3;
        int i3 = iMo8001 & 7;
        if (i3 == 0) {
            ((C4539) obj).m8511(i2 << 3, Long.valueOf(interfaceC4191.mo7976()));
            return true;
        }
        if (i3 == 1) {
            ((C4539) obj).m8511((i2 << 3) | 1, Long.valueOf(interfaceC4191.mo7993()));
            return true;
        }
        if (i3 == 2) {
            ((C4539) obj).m8511((i2 << 3) | 2, interfaceC4191.mo7987());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                if (i != 0) {
                    return false;
                }
                throw InvalidProtocolBufferException.invalidEndTag();
            }
            if (i3 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            ((C4539) obj).m8511(5 | (i2 << 3), Integer.valueOf(interfaceC4191.mo8010()));
            return true;
        }
        C4539 c4539 = new C4539();
        int i4 = i2 << 3;
        int i5 = i4 | 4;
        int i6 = i + 1;
        if (i6 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        while (interfaceC4191.mo7979() != Integer.MAX_VALUE && m8523(i6, interfaceC4191, c4539)) {
        }
        if (i5 != interfaceC4191.mo8001()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (c4539.f11862) {
            c4539.f11862 = false;
        }
        ((C4539) obj).m8511(i4 | 3, c4539);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract C4539 mo8509(Object obj);
}
