package com.google.protobuf;

import com.google.protobuf.JavaFeaturesProto$JavaFeatures;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世子哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3394 extends AbstractC3528 {
    @Override // com.google.protobuf.InterfaceC3375
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7345(AbstractC3474 abstractC3474, C3697 c3697) throws InvalidProtocolBufferException {
        JavaFeaturesProto$JavaFeatures.NestInFileClassFeature.C3311 c3311NewBuilder = JavaFeaturesProto$JavaFeatures.NestInFileClassFeature.newBuilder();
        try {
            c3311NewBuilder.mergeFrom(abstractC3474, c3697);
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
