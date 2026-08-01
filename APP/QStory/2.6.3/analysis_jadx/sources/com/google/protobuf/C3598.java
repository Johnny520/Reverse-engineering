package com.google.protobuf;

import com.google.protobuf.C3595;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪世苏哲兰子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3598 extends AbstractC3528 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C3595 f11234;

    public C3598(C3595 c3595) {
        this.f11234 = c3595;
    }

    @Override // com.google.protobuf.InterfaceC3375
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7345(AbstractC3474 abstractC3474, C3697 c3697) throws InvalidProtocolBufferException {
        C3595.C3596 c3596NewBuilder = C3595.newBuilder(this.f11234.type);
        try {
            c3596NewBuilder.mergeFrom(abstractC3474, c3697);
            return c3596NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c3596NewBuilder.buildPartial());
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(c3596NewBuilder.buildPartial());
        }
    }
}
