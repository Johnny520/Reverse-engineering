package com.google.protobuf.compiler;

import com.google.protobuf.AbstractC3474;
import com.google.protobuf.AbstractC3528;
import com.google.protobuf.C3697;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.compiler.PluginProtos$CodeGeneratorRequest;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.protobuf.compiler.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3334 extends AbstractC3528 {
    @Override // com.google.protobuf.InterfaceC3375
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo7345(AbstractC3474 abstractC3474, C3697 c3697) throws InvalidProtocolBufferException {
        PluginProtos$CodeGeneratorRequest.C3325 c3325NewBuilder = PluginProtos$CodeGeneratorRequest.newBuilder();
        try {
            c3325NewBuilder.mergeFrom(abstractC3474, c3697);
            return c3325NewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(c3325NewBuilder.buildPartial());
        } catch (UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(c3325NewBuilder.buildPartial());
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(c3325NewBuilder.buildPartial());
        }
    }
}
