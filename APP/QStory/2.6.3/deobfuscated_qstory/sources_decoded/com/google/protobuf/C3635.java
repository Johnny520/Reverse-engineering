package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲兰子苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3635 implements InterfaceC3649 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3634 f11294;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f11295;

    public C3635(Class cls, Class cls2, String str) {
        C3634 c3634 = new C3634(cls, cls2, str);
        this.f11295 = c3634.f11288.getReturnType();
        this.f11294 = c3634;
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public InterfaceC3454 mo7818() {
        throw new UnsupportedOperationException("newBuilderForField() called on a repeated field.");
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo7834(GeneratedMessage.AbstractC3305 abstractC3305) {
        throw new UnsupportedOperationException("hasField() called on a repeated field.");
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Object mo7832(GeneratedMessage.AbstractC3305 abstractC3305) {
        return GeneratedMessage.invokeOrDie(this.f11294.f11289, abstractC3305, new Object[0]);
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo7835(GeneratedMessage generatedMessage) {
        throw new UnsupportedOperationException("hasField() called on a repeated field.");
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Object mo7833(GeneratedMessage generatedMessage) {
        return GeneratedMessage.invokeOrDie(this.f11294.f11290, generatedMessage, new Object[0]);
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo7836(GeneratedMessage.AbstractC3305 abstractC3305) {
        GeneratedMessage.invokeOrDie(this.f11294.f11293, abstractC3305, new Object[0]);
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public Object mo7837(GeneratedMessage.AbstractC3305 abstractC3305, int i) {
        return GeneratedMessage.invokeOrDie(this.f11294.f11287, abstractC3305, Integer.valueOf(i));
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int mo7838(GeneratedMessage generatedMessage) {
        return ((Integer) GeneratedMessage.invokeOrDie(this.f11294.f11292, generatedMessage, new Object[0])).intValue();
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public void mo7829(GeneratedMessage.AbstractC3305 abstractC3305, Object obj) {
        GeneratedMessage.invokeOrDie(this.f11294.f11285, abstractC3305, obj);
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final InterfaceC3454 mo7819(GeneratedMessage.AbstractC3305 abstractC3305) {
        throw new UnsupportedOperationException("getFieldBuilder() called on a repeated field.");
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo7830(GeneratedMessage.AbstractC3305 abstractC3305, int i, Object obj) {
        GeneratedMessage.invokeOrDie(this.f11294.f11286, abstractC3305, Integer.valueOf(i), obj);
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public InterfaceC3454 mo7831(GeneratedMessage.AbstractC3305 abstractC3305, int i) {
        throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo7816(GeneratedMessage.AbstractC3305 abstractC3305, Object obj) {
        mo7836(abstractC3305);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            mo7829(abstractC3305, it.next());
        }
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int mo7839(GeneratedMessage.AbstractC3305 abstractC3305) {
        return ((Integer) GeneratedMessage.invokeOrDie(this.f11294.f11291, abstractC3305, new Object[0])).intValue();
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public Object mo7840(int i, GeneratedMessage generatedMessage) {
        return GeneratedMessage.invokeOrDie(this.f11294.f11288, generatedMessage, Integer.valueOf(i));
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo7817(GeneratedMessage generatedMessage) {
        return mo7833(generatedMessage);
    }
}
