package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲世子兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C3627 implements InterfaceC3628 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f11266;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Map.Entry f11267;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Iterator f11268;

    public C3627(GeneratedMessage.ExtendableMessage extendableMessage, boolean z) {
        Iterator itM7924 = extendableMessage.extensions.m7924();
        this.f11268 = itM7924;
        if (itM7924.hasNext()) {
            this.f11267 = (Map.Entry) itM7924.next();
        }
        this.f11266 = z;
    }

    @Override // com.google.protobuf.InterfaceC3628
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7841(int i, AbstractC3461 abstractC3461) {
        while (true) {
            Map.Entry entry = this.f11267;
            if (entry == null || ((C3656) entry.getKey()).f11350.getNumber() >= i) {
                return;
            }
            C3656 c3656 = (C3656) this.f11267.getKey();
            if (this.f11266 && c3656.mo7817() == WireFormat$JavaType.MESSAGE && !c3656.mo7819()) {
                boolean z = this.f11267 instanceof C3387;
                DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = c3656.f11350;
                if (z) {
                    abstractC3461.mo7671(descriptorProtos$FieldDescriptorProto.getNumber(), ((C3382) ((C3387) this.f11267).f11041.getValue()).m7500());
                } else {
                    abstractC3461.mo7672(descriptorProtos$FieldDescriptorProto.getNumber(), (InterfaceC3452) this.f11267.getValue());
                }
            } else {
                C3679.m7909(c3656, this.f11267.getValue(), abstractC3461);
            }
            Iterator it = this.f11268;
            if (it.hasNext()) {
                this.f11267 = (Map.Entry) it.next();
            } else {
                this.f11267 = null;
            }
        }
    }
}
