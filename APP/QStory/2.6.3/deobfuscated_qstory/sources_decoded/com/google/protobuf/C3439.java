package com.google.protobuf;

import com.google.protobuf.AbstractC3533;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世苏哲兰楪子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3439 implements InterfaceC3435 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f11120 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC3533.AbstractC3534 f11121;

    public C3439(AbstractC3533.AbstractC3534 abstractC3534) {
        this.f11121 = abstractC3534;
    }

    @Override // com.google.protobuf.InterfaceC3435
    public final InterfaceC3435 addRepeatedField(C3657 c3657, Object obj) {
        if (obj instanceof InterfaceC3450) {
            obj = ((InterfaceC3450) obj).buildPartial();
        }
        this.f11121.addRepeatedField(c3657, obj);
        return this;
    }

    @Override // com.google.protobuf.InterfaceC3435
    public final boolean hasField(C3657 c3657) {
        return this.f11121.hasField(c3657);
    }

    @Override // com.google.protobuf.InterfaceC3435
    public final InterfaceC3435 setField(C3657 c3657, Object obj) {
        boolean zMo7806 = c3657.mo7806();
        AbstractC3533.AbstractC3534 abstractC3534 = this.f11121;
        if (zMo7806 || !(obj instanceof InterfaceC3450)) {
            abstractC3534.setField(c3657, obj);
            return this;
        }
        if (obj != m7607(c3657)) {
            abstractC3534.setField(c3657, ((InterfaceC3450) obj).buildPartial());
        }
        return this;
    }

    @Override // com.google.protobuf.InterfaceC3435
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo7541(AbstractC3474 abstractC3474, C3697 c3697, C3657 c3657, InterfaceC3453 interfaceC3453) {
        InterfaceC3454 interfaceC3454M7608;
        if (c3657.mo7806()) {
            InterfaceC3454 interfaceC3454M76082 = m7608(c3657, interfaceC3453);
            abstractC3474.mo7716(interfaceC3454M76082, c3697);
            addRepeatedField(c3657, interfaceC3454M76082.buildPartial());
            return;
        }
        AbstractC3533.AbstractC3534 abstractC3534 = this.f11121;
        if (abstractC3534.hasField(c3657)) {
            InterfaceC3454 interfaceC3454M7607 = m7607(c3657);
            if (interfaceC3454M7607 != null) {
                abstractC3474.mo7716(interfaceC3454M7607, c3697);
                return;
            } else {
                interfaceC3454M7608 = m7608(c3657, interfaceC3453);
                interfaceC3454M7608.mergeFrom((InterfaceC3453) abstractC3534.getField(c3657));
            }
        } else {
            interfaceC3454M7608 = m7608(c3657, interfaceC3453);
        }
        abstractC3474.mo7716(interfaceC3454M7608, c3697);
        setField(c3657, interfaceC3454M7608.buildPartial());
    }

    @Override // com.google.protobuf.InterfaceC3435
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC3453 mo7542(ByteString byteString, C3697 c3697, C3657 c3657, InterfaceC3453 interfaceC3453) {
        InterfaceC3453 interfaceC34532;
        AbstractC3533.AbstractC3534 abstractC3534 = this.f11121;
        InterfaceC3454 interfaceC3454NewBuilderForType = interfaceC3453 != null ? interfaceC3453.newBuilderForType() : abstractC3534.newBuilderForField(c3657);
        if (!c3657.mo7806() && (interfaceC34532 = (InterfaceC3453) abstractC3534.getField(c3657)) != null) {
            interfaceC3454NewBuilderForType.mergeFrom(interfaceC34532);
        }
        interfaceC3454NewBuilderForType.mergeFrom(byteString, c3697);
        return interfaceC3454NewBuilderForType.buildPartial();
    }

    @Override // com.google.protobuf.InterfaceC3435
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final WireFormat$Utf8Validation mo7543(C3657 c3657) {
        return c3657.m7852() ? WireFormat$Utf8Validation.STRICT : (c3657.mo7806() || !(this.f11121 instanceof GeneratedMessage.AbstractC3305)) ? WireFormat$Utf8Validation.LOOSE : WireFormat$Utf8Validation.LAZY;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC3454 m7607(C3657 c3657) {
        if (!this.f11120) {
            return null;
        }
        try {
            return this.f11121.getFieldBuilder(c3657);
        } catch (UnsupportedOperationException unused) {
            this.f11120 = false;
            return null;
        }
    }

    @Override // com.google.protobuf.InterfaceC3435
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final MessageReflection$MergeTarget$ContainerType mo7544() {
        return MessageReflection$MergeTarget$ContainerType.MESSAGE;
    }

    @Override // com.google.protobuf.InterfaceC3435
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C3578 mo7545(C3693 c3693, C3663 c3663, int i) {
        return (C3578) c3693.f11493.get(new C3577(c3663, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC3454 m7608(C3657 c3657, InterfaceC3453 interfaceC3453) {
        return interfaceC3453 != null ? interfaceC3453.newBuilderForType() : this.f11121.newBuilderForField(c3657);
    }

    @Override // com.google.protobuf.InterfaceC3435
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo7559(AbstractC3474 abstractC3474, C3697 c3697, C3657 c3657, InterfaceC3453 interfaceC3453) {
        InterfaceC3454 interfaceC3454M7608;
        boolean zMo7806 = c3657.mo7806();
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = c3657.f11355;
        if (zMo7806) {
            InterfaceC3454 interfaceC3454M76082 = m7608(c3657, interfaceC3453);
            abstractC3474.mo7713(descriptorProtos$FieldDescriptorProto.getNumber(), interfaceC3454M76082, c3697);
            addRepeatedField(c3657, interfaceC3454M76082.buildPartial());
            return;
        }
        AbstractC3533.AbstractC3534 abstractC3534 = this.f11121;
        if (abstractC3534.hasField(c3657)) {
            InterfaceC3454 interfaceC3454M7607 = m7607(c3657);
            if (interfaceC3454M7607 != null) {
                abstractC3474.mo7713(descriptorProtos$FieldDescriptorProto.getNumber(), interfaceC3454M7607, c3697);
                return;
            } else {
                interfaceC3454M7608 = m7608(c3657, interfaceC3453);
                interfaceC3454M7608.mergeFrom((InterfaceC3453) abstractC3534.getField(c3657));
            }
        } else {
            interfaceC3454M7608 = m7608(c3657, interfaceC3453);
        }
        abstractC3474.mo7713(descriptorProtos$FieldDescriptorProto.getNumber(), interfaceC3454M7608, c3697);
        setField(c3657, interfaceC3454M7608.buildPartial());
    }
}
