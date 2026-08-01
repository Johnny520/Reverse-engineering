package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3710 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract void mo7949(Object obj, Object obj2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m7964(int i, InterfaceC3359 interfaceC3359, Object obj) throws InvalidProtocolBufferException {
        int iMo7442 = interfaceC3359.mo7442();
        int i2 = iMo7442 >>> 3;
        int i3 = iMo7442 & 7;
        if (i3 == 0) {
            ((C3707) obj).m7952(i2 << 3, Long.valueOf(interfaceC3359.mo7417()));
            return true;
        }
        if (i3 == 1) {
            ((C3707) obj).m7952((i2 << 3) | 1, Long.valueOf(interfaceC3359.mo7434()));
            return true;
        }
        if (i3 == 2) {
            ((C3707) obj).m7952((i2 << 3) | 2, interfaceC3359.mo7428());
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
            ((C3707) obj).m7952(5 | (i2 << 3), Integer.valueOf(interfaceC3359.mo7451()));
            return true;
        }
        C3707 c3707 = new C3707();
        int i4 = i2 << 3;
        int i5 = i4 | 4;
        int i6 = i + 1;
        if (i6 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        while (interfaceC3359.mo7420() != Integer.MAX_VALUE && m7964(i6, interfaceC3359, c3707)) {
        }
        if (i5 != interfaceC3359.mo7442()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (c3707.f11517) {
            c3707.f11517 = false;
        }
        ((C3707) obj).m7952(i4 | 3, c3707);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract C3707 mo7950(Object obj);
}
