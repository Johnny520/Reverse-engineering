package com.google.protobuf;

import com.google.protobuf.AbstractC3532;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世苏哲兰楪子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3438 implements InterfaceC3434 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f11115 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC3532.AbstractC3533 f11116;

    public C3438(AbstractC3532.AbstractC3533 abstractC3533) {
        this.f11116 = abstractC3533;
    }

    @Override // com.google.protobuf.InterfaceC3434
    public final InterfaceC3434 addRepeatedField(C3656 c3656, Object obj) {
        if (obj instanceof InterfaceC3449) {
            obj = ((InterfaceC3449) obj).buildPartial();
        }
        this.f11116.addRepeatedField(c3656, obj);
        return this;
    }

    @Override // com.google.protobuf.InterfaceC3434
    public final boolean hasField(C3656 c3656) {
        return this.f11116.hasField(c3656);
    }

    @Override // com.google.protobuf.InterfaceC3434
    public final InterfaceC3434 setField(C3656 c3656, Object obj) {
        boolean zMo7819 = c3656.mo7819();
        AbstractC3532.AbstractC3533 abstractC3533 = this.f11116;
        if (zMo7819 || !(obj instanceof InterfaceC3449)) {
            abstractC3533.setField(c3656, obj);
            return this;
        }
        if (obj != m7620(c3656)) {
            abstractC3533.setField(c3656, ((InterfaceC3449) obj).buildPartial());
        }
        return this;
    }

    @Override // com.google.protobuf.InterfaceC3434
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo7554(AbstractC3473 abstractC3473, C3696 c3696, C3656 c3656, InterfaceC3452 interfaceC3452) {
        InterfaceC3453 interfaceC3453M7621;
        if (c3656.mo7819()) {
            InterfaceC3453 interfaceC3453M76212 = m7621(c3656, interfaceC3452);
            abstractC3473.mo7729(interfaceC3453M76212, c3696);
            addRepeatedField(c3656, interfaceC3453M76212.buildPartial());
            return;
        }
        AbstractC3532.AbstractC3533 abstractC3533 = this.f11116;
        if (abstractC3533.hasField(c3656)) {
            InterfaceC3453 interfaceC3453M7620 = m7620(c3656);
            if (interfaceC3453M7620 != null) {
                abstractC3473.mo7729(interfaceC3453M7620, c3696);
                return;
            } else {
                interfaceC3453M7621 = m7621(c3656, interfaceC3452);
                interfaceC3453M7621.mergeFrom((InterfaceC3452) abstractC3533.getField(c3656));
            }
        } else {
            interfaceC3453M7621 = m7621(c3656, interfaceC3452);
        }
        abstractC3473.mo7729(interfaceC3453M7621, c3696);
        setField(c3656, interfaceC3453M7621.buildPartial());
    }

    @Override // com.google.protobuf.InterfaceC3434
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC3452 mo7555(ByteString byteString, C3696 c3696, C3656 c3656, InterfaceC3452 interfaceC3452) {
        InterfaceC3452 interfaceC34522;
        AbstractC3532.AbstractC3533 abstractC3533 = this.f11116;
        InterfaceC3453 interfaceC3453NewBuilderForType = interfaceC3452 != null ? interfaceC3452.newBuilderForType() : abstractC3533.newBuilderForField(c3656);
        if (!c3656.mo7819() && (interfaceC34522 = (InterfaceC3452) abstractC3533.getField(c3656)) != null) {
            interfaceC3453NewBuilderForType.mergeFrom(interfaceC34522);
        }
        interfaceC3453NewBuilderForType.mergeFrom(byteString, c3696);
        return interfaceC3453NewBuilderForType.buildPartial();
    }

    @Override // com.google.protobuf.InterfaceC3434
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final WireFormat$Utf8Validation mo7556(C3656 c3656) {
        return c3656.m7865() ? WireFormat$Utf8Validation.STRICT : (c3656.mo7819() || !(this.f11116 instanceof GeneratedMessage.AbstractC3304)) ? WireFormat$Utf8Validation.LOOSE : WireFormat$Utf8Validation.LAZY;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC3453 m7620(C3656 c3656) {
        if (!this.f11115) {
            return null;
        }
        try {
            return this.f11116.getFieldBuilder(c3656);
        } catch (UnsupportedOperationException unused) {
            this.f11115 = false;
            return null;
        }
    }

    @Override // com.google.protobuf.InterfaceC3434
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final MessageReflection$MergeTarget$ContainerType mo7557() {
        return MessageReflection$MergeTarget$ContainerType.MESSAGE;
    }

    @Override // com.google.protobuf.InterfaceC3434
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C3577 mo7558(C3692 c3692, C3662 c3662, int i) {
        return (C3577) c3692.f11488.get(new C3576(c3662, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC3453 m7621(C3656 c3656, InterfaceC3452 interfaceC3452) {
        return interfaceC3452 != null ? interfaceC3452.newBuilderForType() : this.f11116.newBuilderForField(c3656);
    }

    @Override // com.google.protobuf.InterfaceC3434
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo7572(AbstractC3473 abstractC3473, C3696 c3696, C3656 c3656, InterfaceC3452 interfaceC3452) {
        InterfaceC3453 interfaceC3453M7621;
        boolean zMo7819 = c3656.mo7819();
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = c3656.f11350;
        if (zMo7819) {
            InterfaceC3453 interfaceC3453M76212 = m7621(c3656, interfaceC3452);
            abstractC3473.mo7726(descriptorProtos$FieldDescriptorProto.getNumber(), interfaceC3453M76212, c3696);
            addRepeatedField(c3656, interfaceC3453M76212.buildPartial());
            return;
        }
        AbstractC3532.AbstractC3533 abstractC3533 = this.f11116;
        if (abstractC3533.hasField(c3656)) {
            InterfaceC3453 interfaceC3453M7620 = m7620(c3656);
            if (interfaceC3453M7620 != null) {
                abstractC3473.mo7726(descriptorProtos$FieldDescriptorProto.getNumber(), interfaceC3453M7620, c3696);
                return;
            } else {
                interfaceC3453M7621 = m7621(c3656, interfaceC3452);
                interfaceC3453M7621.mergeFrom((InterfaceC3452) abstractC3533.getField(c3656));
            }
        } else {
            interfaceC3453M7621 = m7621(c3656, interfaceC3452);
        }
        abstractC3473.mo7726(descriptorProtos$FieldDescriptorProto.getNumber(), interfaceC3453M7621, c3696);
        setField(c3656, interfaceC3453M7621.buildPartial());
    }
}
