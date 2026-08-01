package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲世子兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C4460 implements InterfaceC4461 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f11616;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Map.Entry f11617;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Iterator f11618;

    public C4460(GeneratedMessage.ExtendableMessage extendableMessage, boolean z) {
        Iterator itM8470 = extendableMessage.extensions.m8470();
        this.f11618 = itM8470;
        if (itM8470.hasNext()) {
            this.f11617 = (Map.Entry) itM8470.next();
        }
        this.f11616 = z;
    }

    @Override // com.google.protobuf.InterfaceC4461
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8387(int i, AbstractC4294 abstractC4294) {
        while (true) {
            Map.Entry entry = this.f11617;
            if (entry == null || ((C4489) entry.getKey()).f11700.getNumber() >= i) {
                return;
            }
            C4489 c4489 = (C4489) this.f11617.getKey();
            if (this.f11616 && c4489.mo8363() == WireFormat$JavaType.MESSAGE && !c4489.mo8365()) {
                boolean z = this.f11617 instanceof C4220;
                DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = c4489.f11700;
                if (z) {
                    abstractC4294.mo8217(descriptorProtos$FieldDescriptorProto.getNumber(), ((C4215) ((C4220) this.f11617).f11391.getValue()).m8046());
                } else {
                    abstractC4294.mo8218(descriptorProtos$FieldDescriptorProto.getNumber(), (InterfaceC4285) this.f11617.getValue());
                }
            } else {
                C4512.m8455(c4489, this.f11617.getValue(), abstractC4294);
            }
            Iterator it = this.f11618;
            if (it.hasNext()) {
                this.f11617 = (Map.Entry) it.next();
            } else {
                this.f11617 = null;
            }
        }
    }
}
