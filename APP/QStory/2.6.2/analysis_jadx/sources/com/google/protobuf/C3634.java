package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲兰子苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C3634 implements InterfaceC3648 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3633 f11289;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Class f11290;

    public C3634(Class cls, Class cls2, String str) {
        C3633 c3633 = new C3633(cls, cls2, str);
        this.f11290 = c3633.f11283.getReturnType();
        this.f11289 = c3633;
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public InterfaceC3453 mo7831() {
        throw new UnsupportedOperationException("newBuilderForField() called on a repeated field.");
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo7847(GeneratedMessage.AbstractC3304 abstractC3304) {
        throw new UnsupportedOperationException("hasField() called on a repeated field.");
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Object mo7845(GeneratedMessage.AbstractC3304 abstractC3304) {
        return GeneratedMessage.invokeOrDie(this.f11289.f11284, abstractC3304, new Object[0]);
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo7848(GeneratedMessage generatedMessage) {
        throw new UnsupportedOperationException("hasField() called on a repeated field.");
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Object mo7846(GeneratedMessage generatedMessage) {
        return GeneratedMessage.invokeOrDie(this.f11289.f11285, generatedMessage, new Object[0]);
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo7849(GeneratedMessage.AbstractC3304 abstractC3304) {
        GeneratedMessage.invokeOrDie(this.f11289.f11288, abstractC3304, new Object[0]);
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public Object mo7850(GeneratedMessage.AbstractC3304 abstractC3304, int i) {
        return GeneratedMessage.invokeOrDie(this.f11289.f11282, abstractC3304, Integer.valueOf(i));
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int mo7851(GeneratedMessage generatedMessage) {
        return ((Integer) GeneratedMessage.invokeOrDie(this.f11289.f11287, generatedMessage, new Object[0])).intValue();
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public void mo7842(GeneratedMessage.AbstractC3304 abstractC3304, Object obj) {
        GeneratedMessage.invokeOrDie(this.f11289.f11280, abstractC3304, obj);
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final InterfaceC3453 mo7832(GeneratedMessage.AbstractC3304 abstractC3304) {
        throw new UnsupportedOperationException("getFieldBuilder() called on a repeated field.");
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo7843(GeneratedMessage.AbstractC3304 abstractC3304, int i, Object obj) {
        GeneratedMessage.invokeOrDie(this.f11289.f11281, abstractC3304, Integer.valueOf(i), obj);
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public InterfaceC3453 mo7844(GeneratedMessage.AbstractC3304 abstractC3304, int i) {
        throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo7829(GeneratedMessage.AbstractC3304 abstractC3304, Object obj) {
        mo7849(abstractC3304);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            mo7842(abstractC3304, it.next());
        }
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final int mo7852(GeneratedMessage.AbstractC3304 abstractC3304) {
        return ((Integer) GeneratedMessage.invokeOrDie(this.f11289.f11286, abstractC3304, new Object[0])).intValue();
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public Object mo7853(int i, GeneratedMessage generatedMessage) {
        return GeneratedMessage.invokeOrDie(this.f11289.f11283, generatedMessage, Integer.valueOf(i));
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo7830(GeneratedMessage generatedMessage) {
        return mo7846(generatedMessage);
    }
}
