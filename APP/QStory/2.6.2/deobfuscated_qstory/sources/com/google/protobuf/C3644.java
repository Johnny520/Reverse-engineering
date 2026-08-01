package com.google.protobuf;

import com.google.protobuf.GeneratedMessage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪哲苏世子兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3644 implements InterfaceC3648 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC3452 f11313;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3656 f11314;

    public C3644(C3656 c3656, Class cls) {
        this.f11314 = c3656;
        this.f11313 = ((GeneratedMessage) GeneratedMessage.invokeOrDie(GeneratedMessage.getMethodOrDie(cls, "getDefaultInstance", new Class[0]), null, new Object[0])).internalGetMapFieldReflection(c3656.f11350.getNumber()).mo7522();
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC3453 mo7831() {
        return this.f11313.newBuilderForType();
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo7847(GeneratedMessage.AbstractC3304 abstractC3304) {
        throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo7845(GeneratedMessage.AbstractC3304 abstractC3304) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < mo7852(abstractC3304); i++) {
            arrayList.add(mo7850(abstractC3304, i));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo7848(GeneratedMessage generatedMessage) {
        throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7846(GeneratedMessage generatedMessage) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < mo7851(generatedMessage); i++) {
            arrayList.add(mo7853(i, generatedMessage));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7849(GeneratedMessage.AbstractC3304 abstractC3304) {
        abstractC3304.internalGetMutableMapFieldReflection(this.f11314.f11350.getNumber()).mo7521().clear();
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Object mo7850(GeneratedMessage.AbstractC3304 abstractC3304, int i) {
        return abstractC3304.internalGetMapFieldReflection(this.f11314.f11350.getNumber()).mo7523().get(i);
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final int mo7851(GeneratedMessage generatedMessage) {
        return generatedMessage.internalGetMapFieldReflection(this.f11314.f11350.getNumber()).mo7523().size();
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo7842(GeneratedMessage.AbstractC3304 abstractC3304, Object obj) {
        List listMo7521 = abstractC3304.internalGetMutableMapFieldReflection(this.f11314.f11350.getNumber()).mo7521();
        InterfaceC3452 interfaceC3452Build = (InterfaceC3452) obj;
        if (interfaceC3452Build == null) {
            interfaceC3452Build = null;
        } else {
            InterfaceC3452 interfaceC3452 = this.f11313;
            if (!interfaceC3452.getClass().isInstance(interfaceC3452Build)) {
                interfaceC3452Build = interfaceC3452.toBuilder().mergeFrom(interfaceC3452Build).build();
            }
        }
        listMo7521.add(interfaceC3452Build);
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final InterfaceC3453 mo7832(GeneratedMessage.AbstractC3304 abstractC3304) {
        throw new UnsupportedOperationException("Nested builder not supported for map fields.");
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo7843(GeneratedMessage.AbstractC3304 abstractC3304, int i, Object obj) {
        List listMo7521 = abstractC3304.internalGetMutableMapFieldReflection(this.f11314.f11350.getNumber()).mo7521();
        InterfaceC3452 interfaceC3452Build = (InterfaceC3452) obj;
        if (interfaceC3452Build == null) {
            interfaceC3452Build = null;
        } else {
            InterfaceC3452 interfaceC3452 = this.f11313;
            if (!interfaceC3452.getClass().isInstance(interfaceC3452Build)) {
                interfaceC3452Build = interfaceC3452.toBuilder().mergeFrom(interfaceC3452Build).build();
            }
        }
        listMo7521.set(i, interfaceC3452Build);
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC3453 mo7844(GeneratedMessage.AbstractC3304 abstractC3304, int i) {
        throw new UnsupportedOperationException("Map fields cannot be repeated");
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
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final int mo7852(GeneratedMessage.AbstractC3304 abstractC3304) {
        return abstractC3304.internalGetMapFieldReflection(this.f11314.f11350.getNumber()).mo7523().size();
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Object mo7853(int i, GeneratedMessage generatedMessage) {
        return generatedMessage.internalGetMapFieldReflection(this.f11314.f11350.getNumber()).mo7523().get(i);
    }

    @Override // com.google.protobuf.InterfaceC3648
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo7830(GeneratedMessage generatedMessage) {
        return mo7846(generatedMessage);
    }
}
