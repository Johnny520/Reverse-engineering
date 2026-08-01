package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$EnumValueOptions;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3555 extends AbstractC3528 {
    @Override // com.google.protobuf.InterfaceC3375
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7345(AbstractC3474 abstractC3474, C3697 c3697) throws InvalidProtocolBufferException {
        DescriptorProtos$EnumValueOptions.C3269 c3269NewBuilder = DescriptorProtos$EnumValueOptions.newBuilder();
        try {
            c3269NewBuilder.mergeFrom(abstractC3474, c3697);
            return c3269NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c3269NewBuilder.buildPartial());
        } catch (UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(c3269NewBuilder.buildPartial());
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(c3269NewBuilder.buildPartial());
        }
    }
}
