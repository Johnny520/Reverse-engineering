package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3528 implements InterfaceC3375 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C3697 f11174 = C3697.m7947();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m7751(InterfaceC3441 interfaceC3441) {
        if (interfaceC3441 == null || interfaceC3441.isInitialized()) {
        } else {
            throw (interfaceC3441 instanceof AbstractC3529 ? ((AbstractC3529) interfaceC3441).newUninitializedMessageException() : new UninitializedMessageException(interfaceC3441)).asInvalidProtocolBufferException().setUnfinishedMessage(interfaceC3441);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC3441 m7752(byte[] bArr, C3697 c3697) throws InvalidProtocolBufferException {
        AbstractC3477 abstractC3477M7694 = AbstractC3474.m7694(bArr, 0, bArr.length, false);
        InterfaceC3441 interfaceC3441 = (InterfaceC3441) mo7345(abstractC3477M7694, c3697);
        try {
            abstractC3477M7694.mo7712(0);
            m7751(interfaceC3441);
            return interfaceC3441;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(interfaceC3441);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC3441 m7753(ByteBuffer byteBuffer, C3697 c3697) throws InvalidProtocolBufferException {
        AbstractC3477 abstractC3477M7693 = AbstractC3474.m7693(byteBuffer);
        InterfaceC3441 interfaceC3441 = (InterfaceC3441) mo7345(abstractC3477M7693, c3697);
        try {
            abstractC3477M7693.mo7712(0);
            m7751(interfaceC3441);
            return interfaceC3441;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(interfaceC3441);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC3441 m7754(ByteString byteString, C3697 c3697) throws InvalidProtocolBufferException {
        AbstractC3474 abstractC3474NewCodedInput = byteString.newCodedInput();
        InterfaceC3441 interfaceC3441 = (InterfaceC3441) mo7345(abstractC3474NewCodedInput, c3697);
        try {
            abstractC3474NewCodedInput.mo7712(0);
            m7751(interfaceC3441);
            return interfaceC3441;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(interfaceC3441);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC3441 m7755(InputStream inputStream, C3697 c3697) throws InvalidProtocolBufferException {
        InterfaceC3441 interfaceC3441;
        try {
            int i = inputStream.read();
            if (i == -1) {
                interfaceC3441 = null;
            } else {
                AbstractC3474 abstractC3474M7695 = AbstractC3474.m7695(new C3531(inputStream, AbstractC3474.m7690(inputStream, i), 0));
                interfaceC3441 = (InterfaceC3441) mo7345(abstractC3474M7695, c3697);
                try {
                    abstractC3474M7695.mo7712(0);
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(interfaceC3441);
                }
            }
            m7751(interfaceC3441);
            return interfaceC3441;
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2);
        }
    }
}
