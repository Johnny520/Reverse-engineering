package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言苏子兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3704 extends AbstractC3527 {
    @Override // com.google.protobuf.InterfaceC3374
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7358(AbstractC3473 abstractC3473, C3696 c3696) throws InvalidProtocolBufferException {
        C3711 c3711NewBuilder = C3703.newBuilder();
        try {
            c3711NewBuilder.m7978(abstractC3473);
            return c3711NewBuilder.build();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c3711NewBuilder.build());
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(c3711NewBuilder.build());
        }
    }
}
