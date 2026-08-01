package com.google.protobuf;

import com.google.protobuf.AbstractC4365;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世苏哲兰楪子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4271 implements InterfaceC4267 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f11465 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC4365.AbstractC4366 f11466;

    public C4271(AbstractC4365.AbstractC4366 abstractC4366) {
        this.f11466 = abstractC4366;
    }

    @Override // com.google.protobuf.InterfaceC4267
    public final InterfaceC4267 addRepeatedField(C4489 c4489, Object obj) {
        if (obj instanceof InterfaceC4282) {
            obj = ((InterfaceC4282) obj).buildPartial();
        }
        this.f11466.addRepeatedField(c4489, obj);
        return this;
    }

    @Override // com.google.protobuf.InterfaceC4267
    public final boolean hasField(C4489 c4489) {
        return this.f11466.hasField(c4489);
    }

    @Override // com.google.protobuf.InterfaceC4267
    public final InterfaceC4267 setField(C4489 c4489, Object obj) {
        boolean zMo8365 = c4489.mo8365();
        AbstractC4365.AbstractC4366 abstractC4366 = this.f11466;
        if (zMo8365 || !(obj instanceof InterfaceC4282)) {
            abstractC4366.setField(c4489, obj);
            return this;
        }
        if (obj != m8166(c4489)) {
            abstractC4366.setField(c4489, ((InterfaceC4282) obj).buildPartial());
        }
        return this;
    }

    @Override // com.google.protobuf.InterfaceC4267
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo8100(AbstractC4306 abstractC4306, C4529 c4529, C4489 c4489, InterfaceC4285 interfaceC4285) {
        InterfaceC4286 interfaceC4286M8167;
        if (c4489.mo8365()) {
            InterfaceC4286 interfaceC4286M81672 = m8167(c4489, interfaceC4285);
            abstractC4306.mo8275(interfaceC4286M81672, c4529);
            addRepeatedField(c4489, interfaceC4286M81672.buildPartial());
            return;
        }
        AbstractC4365.AbstractC4366 abstractC4366 = this.f11466;
        if (abstractC4366.hasField(c4489)) {
            InterfaceC4286 interfaceC4286M8166 = m8166(c4489);
            if (interfaceC4286M8166 != null) {
                abstractC4306.mo8275(interfaceC4286M8166, c4529);
                return;
            } else {
                interfaceC4286M8167 = m8167(c4489, interfaceC4285);
                interfaceC4286M8167.mergeFrom((InterfaceC4285) abstractC4366.getField(c4489));
            }
        } else {
            interfaceC4286M8167 = m8167(c4489, interfaceC4285);
        }
        abstractC4306.mo8275(interfaceC4286M8167, c4529);
        setField(c4489, interfaceC4286M8167.buildPartial());
    }

    @Override // com.google.protobuf.InterfaceC4267
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC4285 mo8101(ByteString byteString, C4529 c4529, C4489 c4489, InterfaceC4285 interfaceC4285) {
        InterfaceC4285 interfaceC42852;
        AbstractC4365.AbstractC4366 abstractC4366 = this.f11466;
        InterfaceC4286 interfaceC4286NewBuilderForType = interfaceC4285 != null ? interfaceC4285.newBuilderForType() : abstractC4366.newBuilderForField(c4489);
        if (!c4489.mo8365() && (interfaceC42852 = (InterfaceC4285) abstractC4366.getField(c4489)) != null) {
            interfaceC4286NewBuilderForType.mergeFrom(interfaceC42852);
        }
        interfaceC4286NewBuilderForType.mergeFrom(byteString, c4529);
        return interfaceC4286NewBuilderForType.buildPartial();
    }

    @Override // com.google.protobuf.InterfaceC4267
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final WireFormat$Utf8Validation mo8102(C4489 c4489) {
        return c4489.m8411() ? WireFormat$Utf8Validation.STRICT : (c4489.mo8365() || !(this.f11466 instanceof GeneratedMessage.AbstractC4137)) ? WireFormat$Utf8Validation.LOOSE : WireFormat$Utf8Validation.LAZY;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC4286 m8166(C4489 c4489) {
        if (!this.f11465) {
            return null;
        }
        try {
            return this.f11466.getFieldBuilder(c4489);
        } catch (UnsupportedOperationException unused) {
            this.f11465 = false;
            return null;
        }
    }

    @Override // com.google.protobuf.InterfaceC4267
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final MessageReflection$MergeTarget$ContainerType mo8103() {
        return MessageReflection$MergeTarget$ContainerType.MESSAGE;
    }

    @Override // com.google.protobuf.InterfaceC4267
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C4410 mo8104(C4525 c4525, C4495 c4495, int i) {
        return (C4410) c4525.f11838.get(new C4409(c4495, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC4286 m8167(C4489 c4489, InterfaceC4285 interfaceC4285) {
        return interfaceC4285 != null ? interfaceC4285.newBuilderForType() : this.f11466.newBuilderForField(c4489);
    }

    @Override // com.google.protobuf.InterfaceC4267
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo8118(AbstractC4306 abstractC4306, C4529 c4529, C4489 c4489, InterfaceC4285 interfaceC4285) {
        InterfaceC4286 interfaceC4286M8167;
        boolean zMo8365 = c4489.mo8365();
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = c4489.f11700;
        if (zMo8365) {
            InterfaceC4286 interfaceC4286M81672 = m8167(c4489, interfaceC4285);
            abstractC4306.mo8272(descriptorProtos$FieldDescriptorProto.getNumber(), interfaceC4286M81672, c4529);
            addRepeatedField(c4489, interfaceC4286M81672.buildPartial());
            return;
        }
        AbstractC4365.AbstractC4366 abstractC4366 = this.f11466;
        if (abstractC4366.hasField(c4489)) {
            InterfaceC4286 interfaceC4286M8166 = m8166(c4489);
            if (interfaceC4286M8166 != null) {
                abstractC4306.mo8272(descriptorProtos$FieldDescriptorProto.getNumber(), interfaceC4286M8166, c4529);
                return;
            } else {
                interfaceC4286M8167 = m8167(c4489, interfaceC4285);
                interfaceC4286M8167.mergeFrom((InterfaceC4285) abstractC4366.getField(c4489));
            }
        } else {
            interfaceC4286M8167 = m8167(c4489, interfaceC4285);
        }
        abstractC4306.mo8272(descriptorProtos$FieldDescriptorProto.getNumber(), interfaceC4286M8167, c4529);
        setField(c4489, interfaceC4286M8167.buildPartial());
    }
}
