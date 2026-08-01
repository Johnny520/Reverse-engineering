package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$FileDescriptorProto;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3513 extends AbstractC3527 {
    @Override // com.google.protobuf.InterfaceC3374
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7358(AbstractC3473 abstractC3473, C3696 c3696) throws InvalidProtocolBufferException {
        DescriptorProtos$FileDescriptorProto.C3279 c3279NewBuilder = DescriptorProtos$FileDescriptorProto.newBuilder();
        try {
            c3279NewBuilder.mergeFrom(abstractC3473, c3696);
            return c3279NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c3279NewBuilder.buildPartial());
        } catch (UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(c3279NewBuilder.buildPartial());
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(c3279NewBuilder.buildPartial());
        }
    }
}
