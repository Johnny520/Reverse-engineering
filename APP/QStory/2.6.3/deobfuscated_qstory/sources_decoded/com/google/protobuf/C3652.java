package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$SourceCodeInfo;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3652 extends AbstractC3528 {
    @Override // com.google.protobuf.InterfaceC3375
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7345(AbstractC3474 abstractC3474, C3697 c3697) throws InvalidProtocolBufferException {
        DescriptorProtos$SourceCodeInfo.Location.C3292 c3292NewBuilder = DescriptorProtos$SourceCodeInfo.Location.newBuilder();
        try {
            c3292NewBuilder.mergeFrom(abstractC3474, c3697);
            return c3292NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c3292NewBuilder.buildPartial());
        } catch (UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(c3292NewBuilder.buildPartial());
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(c3292NewBuilder.buildPartial());
        }
    }
}
