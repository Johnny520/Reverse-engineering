package com.google.protobuf;

import com.google.protobuf.Any;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3550 extends AbstractC3527 {
    @Override // com.google.protobuf.InterfaceC3374
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7358(AbstractC3473 abstractC3473, C3696 c3696) throws InvalidProtocolBufferException {
        Any.C3257 c3257NewBuilder = Any.newBuilder();
        try {
            c3257NewBuilder.mergeFrom(abstractC3473, c3696);
            return c3257NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c3257NewBuilder.buildPartial());
        } catch (UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(c3257NewBuilder.buildPartial());
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(c3257NewBuilder.buildPartial());
        }
    }
}
