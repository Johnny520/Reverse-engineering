package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲世子兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3628 implements InterfaceC3629 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f11271;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Map.Entry f11272;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Iterator f11273;

    public C3628(GeneratedMessage.ExtendableMessage extendableMessage, boolean z) {
        Iterator itM7911 = extendableMessage.extensions.m7911();
        this.f11273 = itM7911;
        if (itM7911.hasNext()) {
            this.f11272 = (Map.Entry) itM7911.next();
        }
        this.f11271 = z;
    }

    @Override // com.google.protobuf.InterfaceC3629
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7828(int i, AbstractC3462 abstractC3462) {
        while (true) {
            Map.Entry entry = this.f11272;
            if (entry == null || ((C3657) entry.getKey()).f11355.getNumber() >= i) {
                return;
            }
            C3657 c3657 = (C3657) this.f11272.getKey();
            if (this.f11271 && c3657.mo7804() == WireFormat$JavaType.MESSAGE && !c3657.mo7806()) {
                boolean z = this.f11272 instanceof C3388;
                DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = c3657.f11355;
                if (z) {
                    abstractC3462.mo7658(descriptorProtos$FieldDescriptorProto.getNumber(), ((C3383) ((C3388) this.f11272).f11046.getValue()).m7487());
                } else {
                    abstractC3462.mo7659(descriptorProtos$FieldDescriptorProto.getNumber(), (InterfaceC3453) this.f11272.getValue());
                }
            } else {
                C3680.m7896(c3657, this.f11272.getValue(), abstractC3462);
            }
            Iterator it = this.f11273;
            if (it.hasNext()) {
                this.f11272 = (Map.Entry) it.next();
            } else {
                this.f11272 = null;
            }
        }
    }
}
