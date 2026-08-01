package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$EnumValueDescriptorProto;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3556 extends AbstractC3527 {
    @Override // com.google.protobuf.InterfaceC3374
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7358(AbstractC3473 abstractC3473, C3696 c3696) throws InvalidProtocolBufferException {
        DescriptorProtos$EnumValueDescriptorProto.C3267 c3267NewBuilder = DescriptorProtos$EnumValueDescriptorProto.newBuilder();
        try {
            c3267NewBuilder.mergeFrom(abstractC3473, c3696);
            return c3267NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c3267NewBuilder.buildPartial());
        } catch (UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(c3267NewBuilder.buildPartial());
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(c3267NewBuilder.buildPartial());
        }
    }
}
