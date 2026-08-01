package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4537 extends AbstractC4360 {
    @Override // com.google.protobuf.InterfaceC4207
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7904(AbstractC4306 abstractC4306, C4529 c4529) throws InvalidProtocolBufferException {
        C4544 c4544NewBuilder = C4536.newBuilder();
        try {
            c4544NewBuilder.m8524(abstractC4306);
            return c4544NewBuilder.build();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4544NewBuilder.build());
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(c4544NewBuilder.build());
        }
    }
}
