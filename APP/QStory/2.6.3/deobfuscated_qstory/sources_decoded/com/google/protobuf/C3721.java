package com.google.protobuf;

import com.google.protobuf.Timestamp;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3721 extends AbstractC3528 {
    @Override // com.google.protobuf.InterfaceC3375
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7345(AbstractC3474 abstractC3474, C3697 c3697) throws InvalidProtocolBufferException {
        Timestamp.C3320 c3320NewBuilder = Timestamp.newBuilder();
        try {
            c3320NewBuilder.mergeFrom(abstractC3474, c3697);
            return c3320NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c3320NewBuilder.buildPartial());
        } catch (UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(c3320NewBuilder.buildPartial());
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(c3320NewBuilder.buildPartial());
        }
    }
}
