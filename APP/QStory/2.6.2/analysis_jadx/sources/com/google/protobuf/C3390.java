package com.google.protobuf;

import com.google.protobuf.JavaFeaturesProto$JavaFeatures;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3390 extends AbstractC3527 {
    @Override // com.google.protobuf.InterfaceC3374
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7358(AbstractC3473 abstractC3473, C3696 c3696) throws InvalidProtocolBufferException {
        JavaFeaturesProto$JavaFeatures.C3311 c3311NewBuilder = JavaFeaturesProto$JavaFeatures.newBuilder();
        try {
            c3311NewBuilder.mergeFrom(abstractC3473, c3696);
            return c3311NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c3311NewBuilder.buildPartial());
        } catch (UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(c3311NewBuilder.buildPartial());
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(c3311NewBuilder.buildPartial());
        }
    }
}
