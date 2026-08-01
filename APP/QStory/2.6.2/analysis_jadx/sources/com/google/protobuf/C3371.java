package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世哲楪兰苏子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3371 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3371 f11013 = new C3371();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ConcurrentHashMap f11014 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3426 f11015 = new C3426(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3344 m7493(Class cls) {
        AbstractC3693 abstractC3693;
        InterfaceC3344 interfaceC3344M7588;
        AbstractC3401.m7518(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f11014;
        InterfaceC3344 interfaceC3344 = (InterfaceC3344) concurrentHashMap.get(cls);
        if (interfaceC3344 != null) {
            return interfaceC3344;
        }
        C3426 c3426 = this.f11015;
        c3426.getClass();
        Class cls2 = AbstractC3340.f10962;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            Class cls3 = AbstractC3546.f11193;
            Class cls4 = AbstractC3340.f10962;
            if (cls4 != null && !cls4.isAssignableFrom(cls)) {
                C5919.m11249("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                return null;
            }
        }
        InterfaceC3451 interfaceC3451Mo7577 = ((C3427) c3426.f11084).mo7577(cls);
        if (interfaceC3451Mo7577.mo7495()) {
            Class cls5 = AbstractC3546.f11193;
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                interfaceC3344M7588 = new C3435(AbstractC3340.f10960, AbstractC3675.f11468, interfaceC3451Mo7577.mo7494());
            } else {
                AbstractC3709 abstractC3709 = AbstractC3340.f10961;
                AbstractC3693 abstractC36932 = AbstractC3675.f11467;
                if (abstractC36932 == null) {
                    C5919.m11250("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                interfaceC3344M7588 = new C3435(abstractC3709, abstractC36932, interfaceC3451Mo7577.mo7494());
            }
        } else {
            Class cls6 = AbstractC3546.f11193;
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                interfaceC3344M7588 = C3436.m7588(interfaceC3451Mo7577, AbstractC3373.f11016, AbstractC3420.f11080, AbstractC3340.f10960, AbstractC3428.f11086[interfaceC3451Mo7577.getSyntax().ordinal()] != 1 ? AbstractC3675.f11468 : null, AbstractC3454.f11122);
            } else {
                InterfaceC3368 interfaceC3368 = AbstractC3373.f11017;
                InterfaceC3423 interfaceC3423 = AbstractC3420.f11081;
                AbstractC3709 abstractC37092 = AbstractC3340.f10961;
                if (AbstractC3428.f11086[interfaceC3451Mo7577.getSyntax().ordinal()] != 1) {
                    AbstractC3693 abstractC36933 = AbstractC3675.f11467;
                    if (abstractC36933 == null) {
                        C5919.m11250("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                    abstractC3693 = abstractC36933;
                } else {
                    abstractC3693 = null;
                }
                interfaceC3344M7588 = C3436.m7588(interfaceC3451Mo7577, interfaceC3368, interfaceC3423, abstractC37092, abstractC3693, AbstractC3454.f11123);
            }
        }
        InterfaceC3344 interfaceC33442 = (InterfaceC3344) concurrentHashMap.putIfAbsent(cls, interfaceC3344M7588);
        return interfaceC33442 != null ? interfaceC33442 : interfaceC3344M7588;
    }
}
