package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3527 implements InterfaceC3374 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C3696 f11169 = C3696.m7960();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m7764(InterfaceC3440 interfaceC3440) {
        if (interfaceC3440 == null || interfaceC3440.isInitialized()) {
        } else {
            throw (interfaceC3440 instanceof AbstractC3528 ? ((AbstractC3528) interfaceC3440).newUninitializedMessageException() : new UninitializedMessageException(interfaceC3440)).asInvalidProtocolBufferException().setUnfinishedMessage(interfaceC3440);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC3440 m7765(byte[] bArr, C3696 c3696) throws InvalidProtocolBufferException {
        AbstractC3476 abstractC3476M7707 = AbstractC3473.m7707(bArr, 0, bArr.length, false);
        InterfaceC3440 interfaceC3440 = (InterfaceC3440) mo7358(abstractC3476M7707, c3696);
        try {
            abstractC3476M7707.mo7725(0);
            m7764(interfaceC3440);
            return interfaceC3440;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(interfaceC3440);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC3440 m7766(ByteBuffer byteBuffer, C3696 c3696) throws InvalidProtocolBufferException {
        AbstractC3476 abstractC3476M7706 = AbstractC3473.m7706(byteBuffer);
        InterfaceC3440 interfaceC3440 = (InterfaceC3440) mo7358(abstractC3476M7706, c3696);
        try {
            abstractC3476M7706.mo7725(0);
            m7764(interfaceC3440);
            return interfaceC3440;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(interfaceC3440);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC3440 m7767(ByteString byteString, C3696 c3696) throws InvalidProtocolBufferException {
        AbstractC3473 abstractC3473NewCodedInput = byteString.newCodedInput();
        InterfaceC3440 interfaceC3440 = (InterfaceC3440) mo7358(abstractC3473NewCodedInput, c3696);
        try {
            abstractC3473NewCodedInput.mo7725(0);
            m7764(interfaceC3440);
            return interfaceC3440;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(interfaceC3440);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC3440 m7768(InputStream inputStream, C3696 c3696) throws InvalidProtocolBufferException {
        InterfaceC3440 interfaceC3440;
        try {
            int i = inputStream.read();
            if (i == -1) {
                interfaceC3440 = null;
            } else {
                AbstractC3473 abstractC3473M7708 = AbstractC3473.m7708(new C3530(inputStream, AbstractC3473.m7703(inputStream, i), 0));
                interfaceC3440 = (InterfaceC3440) mo7358(abstractC3473M7708, c3696);
                try {
                    abstractC3473M7708.mo7725(0);
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(interfaceC3440);
                }
            }
            m7764(interfaceC3440);
            return interfaceC3440;
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2);
        }
    }
}
