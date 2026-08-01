package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲兰苏世子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3636 implements InterfaceC3649 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C3637 f11296;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f11297;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f11298;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3657 f11299;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f11300;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3636(com.google.protobuf.C3657 r11, java.lang.String r12, java.lang.Class r13, java.lang.Class r14, java.lang.String r15) {
        /*
            r10 = this;
            r10.<init>()
            com.google.protobuf.飘花落叶言楪世子苏哲兰 r0 = r11.f11345
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L14
            com.google.protobuf.飘花落叶言楪子兰世苏哲[] r3 = r0.f11230
            int r4 = r3.length
            if (r4 != r1) goto L15
            r3 = r3[r2]
            boolean r3 = r3.f11350
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
            r10.f11298 = r8
            boolean r9 = r11.m7860()
            r10.f11297 = r9
            com.google.protobuf.飘花落叶言楪哲兰苏子世 r3 = new com.google.protobuf.飘花落叶言楪哲兰苏子世
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.f11299 = r11
            java.lang.reflect.Method r11 = r3.f11306
            java.lang.Class r11 = r11.getReturnType()
            r10.f11300 = r11
            r10.f11296 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C3636.<init>(com.google.protobuf.飘花落叶言楪子兰世苏哲, java.lang.String, java.lang.Class, java.lang.Class, java.lang.String):void");
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public InterfaceC3454 mo7818() {
        throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo7834(GeneratedMessage.AbstractC3305 abstractC3305) {
        boolean z = this.f11297;
        C3637 c3637 = this.f11296;
        if (z) {
            return ((Boolean) GeneratedMessage.invokeOrDie(c3637.f11302, abstractC3305, new Object[0])).booleanValue();
        }
        return this.f11298 ? ((InterfaceC3399) GeneratedMessage.invokeOrDie(c3637.f11307, abstractC3305, new Object[0])).getNumber() == this.f11299.f11355.getNumber() : !mo7832(abstractC3305).equals(r4.m7864());
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Object mo7832(GeneratedMessage.AbstractC3305 abstractC3305) {
        return GeneratedMessage.invokeOrDie(this.f11296.f11305, abstractC3305, new Object[0]);
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo7835(GeneratedMessage generatedMessage) {
        boolean z = this.f11297;
        C3637 c3637 = this.f11296;
        if (z) {
            return ((Boolean) GeneratedMessage.invokeOrDie(c3637.f11303, generatedMessage, new Object[0])).booleanValue();
        }
        return this.f11298 ? ((InterfaceC3399) GeneratedMessage.invokeOrDie(c3637.f11308, generatedMessage, new Object[0])).getNumber() == this.f11299.f11355.getNumber() : !mo7833(generatedMessage).equals(r4.m7864());
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Object mo7833(GeneratedMessage generatedMessage) {
        return GeneratedMessage.invokeOrDie(this.f11296.f11306, generatedMessage, new Object[0]);
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7836(GeneratedMessage.AbstractC3305 abstractC3305) {
        GeneratedMessage.invokeOrDie(this.f11296.f11301, abstractC3305, new Object[0]);
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Object mo7837(GeneratedMessage.AbstractC3305 abstractC3305, int i) {
        throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final int mo7838(GeneratedMessage generatedMessage) {
        throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo7829(GeneratedMessage.AbstractC3305 abstractC3305, Object obj) {
        throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public InterfaceC3454 mo7819(GeneratedMessage.AbstractC3305 abstractC3305) {
        throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo7830(GeneratedMessage.AbstractC3305 abstractC3305, int i, Object obj) {
        throw new UnsupportedOperationException("setRepeatedField() called on a singular field.");
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC3454 mo7831(GeneratedMessage.AbstractC3305 abstractC3305, int i) {
        throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public void mo7816(GeneratedMessage.AbstractC3305 abstractC3305, Object obj) {
        GeneratedMessage.invokeOrDie(this.f11296.f11304, abstractC3305, obj);
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo7839(GeneratedMessage.AbstractC3305 abstractC3305) {
        throw new UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Object mo7840(int i, GeneratedMessage generatedMessage) {
        throw new UnsupportedOperationException("getRepeatedField() called on a singular field.");
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public Object mo7817(GeneratedMessage generatedMessage) {
        return mo7833(generatedMessage);
    }
}
