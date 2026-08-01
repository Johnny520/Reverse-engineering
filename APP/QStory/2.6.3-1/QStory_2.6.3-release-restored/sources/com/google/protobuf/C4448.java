package com.google.protobuf;

import java.util.Iterator;
import java.util.List;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰子哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4448 extends AbstractC4411 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Extension$ExtensionType f11602;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11603;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final java.lang.reflect.Method f11604;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC4285 f11605;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f11606;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC4480 f11607;

    public C4448(C4475 c4475, Class cls, InterfaceC4285 interfaceC4285, Extension$ExtensionType extension$ExtensionType) {
        if (InterfaceC4285.class.isAssignableFrom(cls) && !cls.isInstance(interfaceC4285)) {
            C6755.m11869("Bad messageDefaultInstance for ".concat(cls.getName()));
            throw null;
        }
        this.f11607 = c4475;
        this.f11606 = cls;
        this.f11605 = interfaceC4285;
        if (InterfaceC4213.class.isAssignableFrom(cls)) {
            this.f11604 = GeneratedMessage.getMethodOrDie(cls, "valueOf", C4496.class);
            this.f11603 = GeneratedMessage.getMethodOrDie(cls, "getValueDescriptor", new Class[0]);
        } else {
            this.f11604 = null;
            this.f11603 = null;
        }
        this.f11602 = extension$ExtensionType;
    }

    @Override // com.google.protobuf.AbstractC4411
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo8348(Object obj) {
        if (AbstractC4472.f11658[mo8350().m8422().ordinal()] != 2) {
            return obj;
        }
        return GeneratedMessage.invokeOrDie(this.f11603, obj, new Object[0]);
    }

    @Override // com.google.protobuf.AbstractC4411
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo8349(Object obj) {
        int i = AbstractC4472.f11658[mo8350().m8422().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return GeneratedMessage.invokeOrDie(this.f11604, null, obj);
            }
        } else if (!this.f11606.isInstance(obj)) {
            return this.f11605.newBuilderForType().mergeFrom((InterfaceC4285) obj).build();
        }
        return obj;
    }

    @Override // com.google.protobuf.AbstractC4411
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C4489 mo8350() {
        InterfaceC4480 interfaceC4480 = this.f11607;
        if (interfaceC4480 != null) {
            return interfaceC4480.getDescriptor();
        }
        C6755.m11870("getDescriptor() called before internalInit()");
        return null;
    }

    @Override // com.google.protobuf.AbstractC4411
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo8351(Object obj) {
        C4489 c4489Mo8350 = mo8350();
        if (!c4489Mo8350.mo8365()) {
            return mo8349(obj);
        }
        if (c4489Mo8350.m8422() != Descriptors$FieldDescriptor$JavaType.MESSAGE && c4489Mo8350.m8422() != Descriptors$FieldDescriptor$JavaType.ENUM) {
            return obj;
        }
        C4212 c4212 = new C4212();
        List list = (List) obj;
        c4212.m8043(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c4212.add(mo8349(it.next()));
        }
        c4212.m8346();
        return c4212;
    }
}
