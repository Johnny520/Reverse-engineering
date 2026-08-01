package com.google.protobuf;

import com.google.protobuf.C4427;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪世苏哲兰子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4430 extends AbstractC4360 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C4427 f11579;

    public C4430(C4427 c4427) {
        this.f11579 = c4427;
    }

    @Override // com.google.protobuf.InterfaceC4207
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7904(AbstractC4306 abstractC4306, C4529 c4529) throws InvalidProtocolBufferException {
        C4427.C4428 c4428NewBuilder = C4427.newBuilder(this.f11579.type);
        try {
            c4428NewBuilder.mergeFrom(abstractC4306, c4529);
            return c4428NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4428NewBuilder.buildPartial());
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(c4428NewBuilder.buildPartial());
        }
    }
}
