package com.google.protobuf;

import com.google.protobuf.JavaFeaturesProto$JavaFeatures;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3393 extends AbstractC3527 {
    @Override // com.google.protobuf.InterfaceC3374
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7358(AbstractC3473 abstractC3473, C3696 c3696) throws InvalidProtocolBufferException {
        JavaFeaturesProto$JavaFeatures.NestInFileClassFeature.C3310 c3310NewBuilder = JavaFeaturesProto$JavaFeatures.NestInFileClassFeature.newBuilder();
        try {
            c3310NewBuilder.mergeFrom(abstractC3473, c3696);
            return c3310NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c3310NewBuilder.buildPartial());
        } catch (UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(c3310NewBuilder.buildPartial());
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(c3310NewBuilder.buildPartial());
        }
    }
}
