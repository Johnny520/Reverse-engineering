package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲兰苏世子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C3635 implements InterfaceC3648 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C3636 f11291;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f11292;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f11293;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3656 f11294;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f11295;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3635(com.google.protobuf.C3656 r11, java.lang.String r12, java.lang.Class r13, java.lang.Class r14, java.lang.String r15) {
        /*
            r10 = this;
            r10.<init>()
            com.google.protobuf.飘花落叶言楪世子苏哲兰 r0 = r11.f11340
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L14
            com.google.protobuf.飘花落叶言楪子兰世苏哲[] r3 = r0.f11225
            int r4 = r3.length
            if (r4 != r1) goto L15
            r3 = r3[r2]
            boolean r3 = r3.f11345
            if (r3 == 0) goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L19
            r8 = r1
            goto L1a
        L19:
            r8 = r2
        L1a:
            r10.f11293 = r8
            boolean r9 = r11.m7873()
            r10.f11292 = r9
            com.google.protobuf.飘花落叶言楪哲兰苏子世 r3 = new com.google.protobuf.飘花落叶言楪哲兰苏子世
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.f11294 = r11
            java.lang.reflect.Method r11 = r3.f11301
            java.lang.Class r11 = r11.getReturnType()
            r10.f11295 = r11
            r10.f11291 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C3635.<init>(com.google.protobuf.飘花落叶言楪子兰世苏哲, java.lang.String, java.lang.Class, java.lang.Class, java.lang.String):void");
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public InterfaceC3453 mo7831() {
        throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo7847(GeneratedMessage.AbstractC3304 abstractC3304) {
        boolean z = this.f11292;
        C3636 c3636 = this.f11291;
        if (z) {
            return ((Boolean) GeneratedMessage.invokeOrDie(c3636.f11297, abstractC3304, new Object[0])).booleanValue();
        }
        return this.f11293 ? ((InterfaceC3398) GeneratedMessage.invokeOrDie(c3636.f11302, abstractC3304, new Object[0])).getNumber() == this.f11294.f11350.getNumber() : !mo7845(abstractC3304).equals(r4.m7877());
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Object mo7845(GeneratedMessage.AbstractC3304 abstractC3304) {
        return GeneratedMessage.invokeOrDie(this.f11291.f11300, abstractC3304, new Object[0]);
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo7848(GeneratedMessage generatedMessage) {
        boolean z = this.f11292;
        C3636 c3636 = this.f11291;
        if (z) {
            return ((Boolean) GeneratedMessage.invokeOrDie(c3636.f11298, generatedMessage, new Object[0])).booleanValue();
        }
        return this.f11293 ? ((InterfaceC3398) GeneratedMessage.invokeOrDie(c3636.f11303, generatedMessage, new Object[0])).getNumber() == this.f11294.f11350.getNumber() : !mo7846(generatedMessage).equals(r4.m7877());
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Object mo7846(GeneratedMessage generatedMessage) {
        return GeneratedMessage.invokeOrDie(this.f11291.f11301, generatedMessage, new Object[0]);
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7849(GeneratedMessage.AbstractC3304 abstractC3304) {
        GeneratedMessage.invokeOrDie(this.f11291.f11296, abstractC3304, new Object[0]);
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Object mo7850(GeneratedMessage.AbstractC3304 abstractC3304, int i) {
        throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final int mo7851(GeneratedMessage generatedMessage) {
        throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo7842(GeneratedMessage.AbstractC3304 abstractC3304, Object obj) {
        throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public InterfaceC3453 mo7832(GeneratedMessage.AbstractC3304 abstractC3304) {
        throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo7843(GeneratedMessage.AbstractC3304 abstractC3304, int i, Object obj) {
        throw new UnsupportedOperationException("setRepeatedField() called on a singular field.");
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC3453 mo7844(GeneratedMessage.AbstractC3304 abstractC3304, int i) {
        throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public void mo7829(GeneratedMessage.AbstractC3304 abstractC3304, Object obj) {
        GeneratedMessage.invokeOrDie(this.f11291.f11299, abstractC3304, obj);
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo7852(GeneratedMessage.AbstractC3304 abstractC3304) {
        throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Object mo7853(int i, GeneratedMessage generatedMessage) {
        throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public Object mo7830(GeneratedMessage generatedMessage) {
        return mo7846(generatedMessage);
    }
}
