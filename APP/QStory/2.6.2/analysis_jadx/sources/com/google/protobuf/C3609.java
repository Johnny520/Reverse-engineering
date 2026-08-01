package com.google.protobuf;

import com.google.protobuf.Int32Value;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰哲子世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3609 extends AbstractC3527 {
    @Override // com.google.protobuf.InterfaceC3374
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7358(AbstractC3473 abstractC3473, C3696 c3696) throws InvalidProtocolBufferException {
        Int32Value.C3308 c3308NewBuilder = Int32Value.newBuilder();
        try {
            c3308NewBuilder.mergeFrom(abstractC3473, c3696);
            return c3308NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c3308NewBuilder.buildPartial());
        } catch (UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(c3308NewBuilder.buildPartial());
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(c3308NewBuilder.buildPartial());
        }
    }
}
