package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲兰子苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C4467 implements InterfaceC4481 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4466 f11639;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f11640;

    public C4467(Class cls, Class cls2, String str) {
        C4466 c4466 = new C4466(cls, cls2, str);
        this.f11640 = c4466.f11633.getReturnType();
        this.f11639 = c4466;
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public InterfaceC4286 mo8377() {
        throw new UnsupportedOperationException("newBuilderForField() called on a repeated field.");
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo8393(GeneratedMessage.AbstractC4137 abstractC4137) {
        throw new UnsupportedOperationException("hasField() called on a repeated field.");
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Object mo8391(GeneratedMessage.AbstractC4137 abstractC4137) {
        return GeneratedMessage.invokeOrDie(this.f11639.f11634, abstractC4137, new Object[0]);
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo8394(GeneratedMessage generatedMessage) {
        throw new UnsupportedOperationException("hasField() called on a repeated field.");
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Object mo8392(GeneratedMessage generatedMessage) {
        return GeneratedMessage.invokeOrDie(this.f11639.f11635, generatedMessage, new Object[0]);
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo8395(GeneratedMessage.AbstractC4137 abstractC4137) {
        GeneratedMessage.invokeOrDie(this.f11639.f11638, abstractC4137, new Object[0]);
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public Object mo8396(GeneratedMessage.AbstractC4137 abstractC4137, int i) {
        return GeneratedMessage.invokeOrDie(this.f11639.f11632, abstractC4137, Integer.valueOf(i));
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int mo8397(GeneratedMessage generatedMessage) {
        return ((Integer) GeneratedMessage.invokeOrDie(this.f11639.f11637, generatedMessage, new Object[0])).intValue();
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public void mo8388(GeneratedMessage.AbstractC4137 abstractC4137, Object obj) {
        GeneratedMessage.invokeOrDie(this.f11639.f11630, abstractC4137, obj);
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final InterfaceC4286 mo8378(GeneratedMessage.AbstractC4137 abstractC4137) {
        throw new UnsupportedOperationException("getFieldBuilder() called on a repeated field.");
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo8389(GeneratedMessage.AbstractC4137 abstractC4137, int i, Object obj) {
        GeneratedMessage.invokeOrDie(this.f11639.f11631, abstractC4137, Integer.valueOf(i), obj);
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public InterfaceC4286 mo8390(GeneratedMessage.AbstractC4137 abstractC4137, int i) {
        throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo8375(GeneratedMessage.AbstractC4137 abstractC4137, Object obj) {
        mo8395(abstractC4137);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            mo8388(abstractC4137, it.next());
        }
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int mo8398(GeneratedMessage.AbstractC4137 abstractC4137) {
        return ((Integer) GeneratedMessage.invokeOrDie(this.f11639.f11636, abstractC4137, new Object[0])).intValue();
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public Object mo8399(int i, GeneratedMessage generatedMessage) {
        return GeneratedMessage.invokeOrDie(this.f11639.f11633, generatedMessage, Integer.valueOf(i));
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo8376(GeneratedMessage generatedMessage) {
        return mo8392(generatedMessage);
    }
}
