package com.google.protobuf.compiler;

import com.google.protobuf.AbstractC4306;
import com.google.protobuf.AbstractC4360;
import com.google.protobuf.C4529;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.compiler.PluginProtos$CodeGeneratorResponse;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.protobuf.compiler.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4163 extends AbstractC4360 {
    @Override // com.google.protobuf.InterfaceC4207
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7904(AbstractC4306 abstractC4306, C4529 c4529) throws InvalidProtocolBufferException {
        PluginProtos$CodeGeneratorResponse.File.C4158 c4158NewBuilder = PluginProtos$CodeGeneratorResponse.File.newBuilder();
        try {
            c4158NewBuilder.mergeFrom(abstractC4306, c4529);
            return c4158NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c4158NewBuilder.buildPartial());
        } catch (UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(c4158NewBuilder.buildPartial());
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(c4158NewBuilder.buildPartial());
        }
    }
}
