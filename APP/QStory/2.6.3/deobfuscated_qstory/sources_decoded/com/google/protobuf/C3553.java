package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$ExtensionRangeOptions;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3553 extends AbstractC3528 {
    @Override // com.google.protobuf.InterfaceC3375
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7345(AbstractC3474 abstractC3474, C3697 c3697) throws InvalidProtocolBufferException {
        DescriptorProtos$ExtensionRangeOptions.C3271 c3271NewBuilder = DescriptorProtos$ExtensionRangeOptions.newBuilder();
        try {
            c3271NewBuilder.mergeFrom(abstractC3474, c3697);
            return c3271NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c3271NewBuilder.buildPartial());
        } catch (UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(c3271NewBuilder.buildPartial());
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(c3271NewBuilder.buildPartial());
        }
    }
}
