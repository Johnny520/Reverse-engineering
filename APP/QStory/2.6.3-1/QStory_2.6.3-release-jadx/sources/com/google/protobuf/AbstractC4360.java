package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4360 implements InterfaceC4207 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4529 f11519 = C4529.m8506();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m8310(InterfaceC4273 interfaceC4273) {
        if (interfaceC4273 == null || interfaceC4273.isInitialized()) {
        } else {
            throw (interfaceC4273 instanceof AbstractC4361 ? ((AbstractC4361) interfaceC4273).newUninitializedMessageException() : new UninitializedMessageException(interfaceC4273)).asInvalidProtocolBufferException().setUnfinishedMessage(interfaceC4273);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC4273 m8311(byte[] bArr, C4529 c4529) throws InvalidProtocolBufferException {
        AbstractC4309 abstractC4309M8253 = AbstractC4306.m8253(bArr, 0, bArr.length, false);
        InterfaceC4273 interfaceC4273 = (InterfaceC4273) mo7904(abstractC4309M8253, c4529);
        try {
            abstractC4309M8253.mo8271(0);
            m8310(interfaceC4273);
            return interfaceC4273;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(interfaceC4273);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC4273 m8312(ByteBuffer byteBuffer, C4529 c4529) throws InvalidProtocolBufferException {
        AbstractC4309 abstractC4309M8252 = AbstractC4306.m8252(byteBuffer);
        InterfaceC4273 interfaceC4273 = (InterfaceC4273) mo7904(abstractC4309M8252, c4529);
        try {
            abstractC4309M8252.mo8271(0);
            m8310(interfaceC4273);
            return interfaceC4273;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(interfaceC4273);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC4273 m8313(ByteString byteString, C4529 c4529) throws InvalidProtocolBufferException {
        AbstractC4306 abstractC4306NewCodedInput = byteString.newCodedInput();
        InterfaceC4273 interfaceC4273 = (InterfaceC4273) mo7904(abstractC4306NewCodedInput, c4529);
        try {
            abstractC4306NewCodedInput.mo8271(0);
            m8310(interfaceC4273);
            return interfaceC4273;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(interfaceC4273);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC4273 m8314(InputStream inputStream, C4529 c4529) throws InvalidProtocolBufferException {
        InterfaceC4273 interfaceC4273;
        try {
            int i = inputStream.read();
            if (i == -1) {
                interfaceC4273 = null;
            } else {
                AbstractC4306 abstractC4306M8254 = AbstractC4306.m8254(new C4363(inputStream, AbstractC4306.m8249(inputStream, i), 0));
                interfaceC4273 = (InterfaceC4273) mo7904(abstractC4306M8254, c4529);
                try {
                    abstractC4306M8254.mo8271(0);
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(interfaceC4273);
                }
            }
            m8310(interfaceC4273);
            return interfaceC4273;
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2);
        }
    }
}
