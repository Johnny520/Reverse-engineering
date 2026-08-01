package com.google.protobuf;

import com.google.protobuf.C3594;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪世苏哲兰子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3597 extends AbstractC3527 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C3594 f11229;

    public C3597(C3594 c3594) {
        this.f11229 = c3594;
    }

    @Override // com.google.protobuf.InterfaceC3374
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7358(AbstractC3473 abstractC3473, C3696 c3696) throws InvalidProtocolBufferException {
        C3594.C3595 c3595NewBuilder = C3594.newBuilder(this.f11229.type);
        try {
            c3595NewBuilder.mergeFrom(abstractC3473, c3696);
            return c3595NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c3595NewBuilder.buildPartial());
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(c3595NewBuilder.buildPartial());
        }
    }
}
