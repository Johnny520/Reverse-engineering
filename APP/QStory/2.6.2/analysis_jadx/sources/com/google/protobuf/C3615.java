package com.google.protobuf;

import java.util.Iterator;
import java.util.List;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰子哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3615 extends AbstractC3578 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Extension$ExtensionType f11252;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final java.lang.reflect.Method f11253;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final java.lang.reflect.Method f11254;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC3452 f11255;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class f11256;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC3647 f11257;

    public C3615(C3642 c3642, Class cls, InterfaceC3452 interfaceC3452, Extension$ExtensionType extension$ExtensionType) {
        if (InterfaceC3452.class.isAssignableFrom(cls) && !cls.isInstance(interfaceC3452)) {
            C5919.m11249("Bad messageDefaultInstance for ".concat(cls.getName()));
            throw null;
        }
        this.f11257 = c3642;
        this.f11256 = cls;
        this.f11255 = interfaceC3452;
        if (InterfaceC3380.class.isAssignableFrom(cls)) {
            this.f11254 = GeneratedMessage.getMethodOrDie(cls, "valueOf", C3663.class);
            this.f11253 = GeneratedMessage.getMethodOrDie(cls, "getValueDescriptor", new Class[0]);
        } else {
            this.f11254 = null;
            this.f11253 = null;
        }
        this.f11252 = extension$ExtensionType;
    }

    @Override // com.google.protobuf.AbstractC3578
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo7802(Object obj) {
        if (AbstractC3639.f11308[mo7804().m7876().ordinal()] != 2) {
            return obj;
        }
        return GeneratedMessage.invokeOrDie(this.f11253, obj, new Object[0]);
    }

    @Override // com.google.protobuf.AbstractC3578
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo7803(Object obj) {
        int i = AbstractC3639.f11308[mo7804().m7876().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return GeneratedMessage.invokeOrDie(this.f11254, null, obj);
            }
        } else if (!this.f11256.isInstance(obj)) {
            return this.f11255.newBuilderForType().mergeFrom((InterfaceC3452) obj).build();
        }
        return obj;
    }

    @Override // com.google.protobuf.AbstractC3578
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final C3656 mo7804() {
        InterfaceC3647 interfaceC3647 = this.f11257;
        if (interfaceC3647 != null) {
            return interfaceC3647.getDescriptor();
        }
        C5919.m11250("getDescriptor() called before internalInit()");
        return null;
    }

    @Override // com.google.protobuf.AbstractC3578
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Object mo7805(Object obj) {
        C3656 c3656Mo7804 = mo7804();
        if (!c3656Mo7804.mo7819()) {
            return mo7803(obj);
        }
        if (c3656Mo7804.m7876() != Descriptors$FieldDescriptor$JavaType.MESSAGE && c3656Mo7804.m7876() != Descriptors$FieldDescriptor$JavaType.ENUM) {
            return obj;
        }
        C3379 c3379 = new C3379();
        List list = (List) obj;
        c3379.m7497(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c3379.add(mo7803(it.next()));
        }
        c3379.m7800();
        return c3379;
    }
}
