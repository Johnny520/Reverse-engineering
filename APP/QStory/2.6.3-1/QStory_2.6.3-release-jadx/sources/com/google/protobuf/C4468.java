package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲兰苏世子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C4468 implements InterfaceC4481 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4469 f11641;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f11642;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f11643;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4489 f11644;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f11645;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4468(C4489 c4489, String str, Class cls, Class cls2, String str2) {
        C4426 c4426 = c4489.f11690;
        if (c4426 != null) {
            C4489[] c4489Arr = c4426.f11575;
            if (c4489Arr.length == 1 && c4489Arr[0].f11695) {
                c4426 = null;
            }
        }
        boolean z = c4426 != null;
        this.f11643 = z;
        boolean zM8419 = c4489.m8419();
        this.f11642 = zM8419;
        C4469 c4469 = new C4469(str, cls, cls2, str2, z, zM8419);
        this.f11644 = c4489;
        this.f11645 = c4469.f11651.getReturnType();
        this.f11641 = c4469;
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public InterfaceC4286 mo8377() {
        throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo8393(GeneratedMessage.AbstractC4137 abstractC4137) {
        boolean z = this.f11642;
        C4469 c4469 = this.f11641;
        if (z) {
            return ((Boolean) GeneratedMessage.invokeOrDie(c4469.f11647, abstractC4137, new Object[0])).booleanValue();
        }
        return this.f11643 ? ((InterfaceC4231) GeneratedMessage.invokeOrDie(c4469.f11652, abstractC4137, new Object[0])).getNumber() == this.f11644.f11700.getNumber() : !mo8391(abstractC4137).equals(r4.m8423());
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Object mo8391(GeneratedMessage.AbstractC4137 abstractC4137) {
        return GeneratedMessage.invokeOrDie(this.f11641.f11650, abstractC4137, new Object[0]);
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo8394(GeneratedMessage generatedMessage) {
        boolean z = this.f11642;
        C4469 c4469 = this.f11641;
        if (z) {
            return ((Boolean) GeneratedMessage.invokeOrDie(c4469.f11648, generatedMessage, new Object[0])).booleanValue();
        }
        return this.f11643 ? ((InterfaceC4231) GeneratedMessage.invokeOrDie(c4469.f11653, generatedMessage, new Object[0])).getNumber() == this.f11644.f11700.getNumber() : !mo8392(generatedMessage).equals(r4.m8423());
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Object mo8392(GeneratedMessage generatedMessage) {
        return GeneratedMessage.invokeOrDie(this.f11641.f11651, generatedMessage, new Object[0]);
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8395(GeneratedMessage.AbstractC4137 abstractC4137) {
        GeneratedMessage.invokeOrDie(this.f11641.f11646, abstractC4137, new Object[0]);
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Object mo8396(GeneratedMessage.AbstractC4137 abstractC4137, int i) {
        throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final int mo8397(GeneratedMessage generatedMessage) {
        throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo8388(GeneratedMessage.AbstractC4137 abstractC4137, Object obj) {
        throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public InterfaceC4286 mo8378(GeneratedMessage.AbstractC4137 abstractC4137) {
        throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo8389(GeneratedMessage.AbstractC4137 abstractC4137, int i, Object obj) {
        throw new UnsupportedOperationException("setRepeatedField() called on a singular field.");
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC4286 mo8390(GeneratedMessage.AbstractC4137 abstractC4137, int i) {
        throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public void mo8375(GeneratedMessage.AbstractC4137 abstractC4137, Object obj) {
        GeneratedMessage.invokeOrDie(this.f11641.f11649, abstractC4137, obj);
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo8398(GeneratedMessage.AbstractC4137 abstractC4137) {
        throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Object mo8399(int i, GeneratedMessage generatedMessage) {
        throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public Object mo8376(GeneratedMessage generatedMessage) {
        return mo8392(generatedMessage);
    }
}
