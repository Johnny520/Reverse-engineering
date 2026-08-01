package com.google.protobuf;

import java.util.Iterator;
import java.util.List;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰子哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3616 extends AbstractC3579 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Extension$ExtensionType f11257;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11258;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final java.lang.reflect.Method f11259;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC3453 f11260;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f11261;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC3648 f11262;

    public C3616(C3643 c3643, Class cls, InterfaceC3453 interfaceC3453, Extension$ExtensionType extension$ExtensionType) {
        if (InterfaceC3453.class.isAssignableFrom(cls) && !cls.isInstance(interfaceC3453)) {
            C5925.m11310("Bad messageDefaultInstance for ".concat(cls.getName()));
            throw null;
        }
        this.f11262 = c3643;
        this.f11261 = cls;
        this.f11260 = interfaceC3453;
        if (InterfaceC3381.class.isAssignableFrom(cls)) {
            this.f11259 = GeneratedMessage.getMethodOrDie(cls, "valueOf", C3664.class);
            this.f11258 = GeneratedMessage.getMethodOrDie(cls, "getValueDescriptor", new Class[0]);
        } else {
            this.f11259 = null;
            this.f11258 = null;
        }
        this.f11257 = extension$ExtensionType;
    }

    @Override // com.google.protobuf.AbstractC3579
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo7789(Object obj) {
        if (AbstractC3640.f11313[mo7791().m7863().ordinal()] != 2) {
            return obj;
        }
        return GeneratedMessage.invokeOrDie(this.f11258, obj, new Object[0]);
    }

    @Override // com.google.protobuf.AbstractC3579
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo7790(Object obj) {
        int i = AbstractC3640.f11313[mo7791().m7863().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return GeneratedMessage.invokeOrDie(this.f11259, null, obj);
            }
        } else if (!this.f11261.isInstance(obj)) {
            return this.f11260.newBuilderForType().mergeFrom((InterfaceC3453) obj).build();
        }
        return obj;
    }

    @Override // com.google.protobuf.AbstractC3579
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C3657 mo7791() {
        InterfaceC3648 interfaceC3648 = this.f11262;
        if (interfaceC3648 != null) {
            return interfaceC3648.getDescriptor();
        }
        C5925.m11311("getDescriptor() called before internalInit()");
        return null;
    }

    @Override // com.google.protobuf.AbstractC3579
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7792(Object obj) {
        C3657 c3657Mo7791 = mo7791();
        if (!c3657Mo7791.mo7806()) {
            return mo7790(obj);
        }
        if (c3657Mo7791.m7863() != Descriptors$FieldDescriptor$JavaType.MESSAGE && c3657Mo7791.m7863() != Descriptors$FieldDescriptor$JavaType.ENUM) {
            return obj;
        }
        C3380 c3380 = new C3380();
        List list = (List) obj;
        c3380.m7484(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c3380.add(mo7790(it.next()));
        }
        c3380.m7787();
        return c3380;
    }
}
