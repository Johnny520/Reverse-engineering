package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲苏世子兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4477 implements InterfaceC4481 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4285 f11663;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4489 f11664;

    public C4477(C4489 c4489, Class cls) {
        this.f11664 = c4489;
        this.f11663 = ((GeneratedMessage) GeneratedMessage.invokeOrDie(GeneratedMessage.getMethodOrDie(cls, "getDefaultInstance", new Class[0]), null, new Object[0])).internalGetMapFieldReflection(c4489.f11700.getNumber()).mo8068();
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC4286 mo8377() {
        return this.f11663.newBuilderForType();
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo8393(GeneratedMessage.AbstractC4137 abstractC4137) {
        throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo8391(GeneratedMessage.AbstractC4137 abstractC4137) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < mo8398(abstractC4137); i++) {
            arrayList.add(mo8396(abstractC4137, i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo8394(GeneratedMessage generatedMessage) {
        throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo8392(GeneratedMessage generatedMessage) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < mo8397(generatedMessage); i++) {
            arrayList.add(mo8399(i, generatedMessage));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8395(GeneratedMessage.AbstractC4137 abstractC4137) {
        abstractC4137.internalGetMutableMapFieldReflection(this.f11664.f11700.getNumber()).mo8067().clear();
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Object mo8396(GeneratedMessage.AbstractC4137 abstractC4137, int i) {
        return abstractC4137.internalGetMapFieldReflection(this.f11664.f11700.getNumber()).mo8069().get(i);
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final int mo8397(GeneratedMessage generatedMessage) {
        return generatedMessage.internalGetMapFieldReflection(this.f11664.f11700.getNumber()).mo8069().size();
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo8388(GeneratedMessage.AbstractC4137 abstractC4137, Object obj) {
        List listMo8067 = abstractC4137.internalGetMutableMapFieldReflection(this.f11664.f11700.getNumber()).mo8067();
        InterfaceC4285 interfaceC4285Build = (InterfaceC4285) obj;
        if (interfaceC4285Build == null) {
            interfaceC4285Build = null;
        } else {
            InterfaceC4285 interfaceC4285 = this.f11663;
            if (!interfaceC4285.getClass().isInstance(interfaceC4285Build)) {
                interfaceC4285Build = interfaceC4285.toBuilder().mergeFrom(interfaceC4285Build).build();
            }
        }
        listMo8067.add(interfaceC4285Build);
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final InterfaceC4286 mo8378(GeneratedMessage.AbstractC4137 abstractC4137) {
        throw new UnsupportedOperationException("Nested builder not supported for map fields.");
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo8389(GeneratedMessage.AbstractC4137 abstractC4137, int i, Object obj) {
        List listMo8067 = abstractC4137.internalGetMutableMapFieldReflection(this.f11664.f11700.getNumber()).mo8067();
        InterfaceC4285 interfaceC4285Build = (InterfaceC4285) obj;
        if (interfaceC4285Build == null) {
            interfaceC4285Build = null;
        } else {
            InterfaceC4285 interfaceC4285 = this.f11663;
            if (!interfaceC4285.getClass().isInstance(interfaceC4285Build)) {
                interfaceC4285Build = interfaceC4285.toBuilder().mergeFrom(interfaceC4285Build).build();
            }
        }
        listMo8067.set(i, interfaceC4285Build);
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC4286 mo8390(GeneratedMessage.AbstractC4137 abstractC4137, int i) {
        throw new UnsupportedOperationException("Map fields cannot be repeated");
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
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo8398(GeneratedMessage.AbstractC4137 abstractC4137) {
        return abstractC4137.internalGetMapFieldReflection(this.f11664.f11700.getNumber()).mo8069().size();
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Object mo8399(int i, GeneratedMessage generatedMessage) {
        return generatedMessage.internalGetMapFieldReflection(this.f11664.f11700.getNumber()).mo8069().get(i);
    }

    @Override // com.google.protobuf.InterfaceC4481
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo8376(GeneratedMessage generatedMessage) {
        return mo8392(generatedMessage);
    }
}
