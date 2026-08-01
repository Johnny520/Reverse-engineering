package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3709 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public abstract void mo7962(Object obj, Object obj2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m7977(int i, InterfaceC3358 interfaceC3358, Object obj) throws InvalidProtocolBufferException {
        int iMo7455 = interfaceC3358.mo7455();
        int i2 = iMo7455 >>> 3;
        int i3 = iMo7455 & 7;
        if (i3 == 0) {
            ((C3706) obj).m7965(i2 << 3, Long.valueOf(interfaceC3358.mo7430()));
            return true;
        }
        if (i3 == 1) {
            ((C3706) obj).m7965((i2 << 3) | 1, Long.valueOf(interfaceC3358.mo7447()));
            return true;
        }
        if (i3 == 2) {
            ((C3706) obj).m7965((i2 << 3) | 2, interfaceC3358.mo7441());
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
            ((C3706) obj).m7965(5 | (i2 << 3), Integer.valueOf(interfaceC3358.mo7464()));
            return true;
        }
        C3706 c3706 = new C3706();
        int i4 = i2 << 3;
        int i5 = i4 | 4;
        int i6 = i + 1;
        if (i6 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        while (interfaceC3358.mo7433() != Integer.MAX_VALUE && m7977(i6, interfaceC3358, c3706)) {
        }
        if (i5 != interfaceC3358.mo7455()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        if (c3706.f11512) {
            c3706.f11512 = false;
        }
        ((C3706) obj).m7965(i4 | 3, c3706);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract C3706 mo7963(Object obj);
}
