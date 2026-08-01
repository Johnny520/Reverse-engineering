package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲苏世子兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3645 implements InterfaceC3649 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC3453 f11318;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3657 f11319;

    public C3645(C3657 c3657, Class cls) {
        this.f11319 = c3657;
        this.f11318 = ((GeneratedMessage) GeneratedMessage.invokeOrDie(GeneratedMessage.getMethodOrDie(cls, "getDefaultInstance", new Class[0]), null, new Object[0])).internalGetMapFieldReflection(c3657.f11355.getNumber()).mo7509();
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC3454 mo7818() {
        return this.f11318.newBuilderForType();
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo7834(GeneratedMessage.AbstractC3305 abstractC3305) {
        throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo7832(GeneratedMessage.AbstractC3305 abstractC3305) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < mo7839(abstractC3305); i++) {
            arrayList.add(mo7837(abstractC3305, i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo7835(GeneratedMessage generatedMessage) {
        throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7833(GeneratedMessage generatedMessage) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < mo7838(generatedMessage); i++) {
            arrayList.add(mo7840(i, generatedMessage));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7836(GeneratedMessage.AbstractC3305 abstractC3305) {
        abstractC3305.internalGetMutableMapFieldReflection(this.f11319.f11355.getNumber()).mo7508().clear();
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Object mo7837(GeneratedMessage.AbstractC3305 abstractC3305, int i) {
        return abstractC3305.internalGetMapFieldReflection(this.f11319.f11355.getNumber()).mo7510().get(i);
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final int mo7838(GeneratedMessage generatedMessage) {
        return generatedMessage.internalGetMapFieldReflection(this.f11319.f11355.getNumber()).mo7510().size();
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo7829(GeneratedMessage.AbstractC3305 abstractC3305, Object obj) {
        List listMo7508 = abstractC3305.internalGetMutableMapFieldReflection(this.f11319.f11355.getNumber()).mo7508();
        InterfaceC3453 interfaceC3453Build = (InterfaceC3453) obj;
        if (interfaceC3453Build == null) {
            interfaceC3453Build = null;
        } else {
            InterfaceC3453 interfaceC3453 = this.f11318;
            if (!interfaceC3453.getClass().isInstance(interfaceC3453Build)) {
                interfaceC3453Build = interfaceC3453.toBuilder().mergeFrom(interfaceC3453Build).build();
            }
        }
        listMo7508.add(interfaceC3453Build);
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final InterfaceC3454 mo7819(GeneratedMessage.AbstractC3305 abstractC3305) {
        throw new UnsupportedOperationException("Nested builder not supported for map fields.");
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo7830(GeneratedMessage.AbstractC3305 abstractC3305, int i, Object obj) {
        List listMo7508 = abstractC3305.internalGetMutableMapFieldReflection(this.f11319.f11355.getNumber()).mo7508();
        InterfaceC3453 interfaceC3453Build = (InterfaceC3453) obj;
        if (interfaceC3453Build == null) {
            interfaceC3453Build = null;
        } else {
            InterfaceC3453 interfaceC3453 = this.f11318;
            if (!interfaceC3453.getClass().isInstance(interfaceC3453Build)) {
                interfaceC3453Build = interfaceC3453.toBuilder().mergeFrom(interfaceC3453Build).build();
            }
        }
        listMo7508.set(i, interfaceC3453Build);
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC3454 mo7831(GeneratedMessage.AbstractC3305 abstractC3305, int i) {
        throw new UnsupportedOperationException("Map fields cannot be repeated");
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
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo7839(GeneratedMessage.AbstractC3305 abstractC3305) {
        return abstractC3305.internalGetMapFieldReflection(this.f11319.f11355.getNumber()).mo7510().size();
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Object mo7840(int i, GeneratedMessage generatedMessage) {
        return generatedMessage.internalGetMapFieldReflection(this.f11319.f11355.getNumber()).mo7510().get(i);
    }

    @Override // com.google.protobuf.InterfaceC3649
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo7817(GeneratedMessage generatedMessage) {
        return mo7833(generatedMessage);
    }
}
