package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FileDescriptorSet;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4324 extends AbstractC4360 {
    @Override // com.google.protobuf.InterfaceC4207
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7904(AbstractC4306 abstractC4306, C4529 c4529) throws InvalidProtocolBufferException {
        DescriptorProtos$FileDescriptorSet.C4113 c4113NewBuilder = DescriptorProtos$FileDescriptorSet.newBuilder();
        try {
            c4113NewBuilder.mergeFrom(abstractC4306, c4529);
            return c4113NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4113NewBuilder.buildPartial());
        } catch (UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(c4113NewBuilder.buildPartial());
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(c4113NewBuilder.buildPartial());
        }
    }
}
