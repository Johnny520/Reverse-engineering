package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$UninterpretedOption;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪子苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4500 extends AbstractC4360 {
    @Override // com.google.protobuf.InterfaceC4207
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7904(AbstractC4306 abstractC4306, C4529 c4529) throws InvalidProtocolBufferException {
        DescriptorProtos$UninterpretedOption.NamePart.C4126 c4126NewBuilder = DescriptorProtos$UninterpretedOption.NamePart.newBuilder();
        try {
            c4126NewBuilder.mergeFrom(abstractC4306, c4529);
            return c4126NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4126NewBuilder.buildPartial());
        } catch (UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(c4126NewBuilder.buildPartial());
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(c4126NewBuilder.buildPartial());
        }
    }
}
