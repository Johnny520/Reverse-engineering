package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世哲楪兰苏子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3372 f11018 = new C3372();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ConcurrentHashMap f11019 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3427 f11020 = new C3427(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3345 m7480(Class cls) {
        AbstractC3694 abstractC3694;
        InterfaceC3345 interfaceC3345M7575;
        AbstractC3402.m7505(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f11019;
        InterfaceC3345 interfaceC3345 = (InterfaceC3345) concurrentHashMap.get(cls);
        if (interfaceC3345 != null) {
            return interfaceC3345;
        }
        C3427 c3427 = this.f11020;
        c3427.getClass();
        Class cls2 = AbstractC3341.f10967;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            Class cls3 = AbstractC3547.f11198;
            Class cls4 = AbstractC3341.f10967;
            if (cls4 != null && !cls4.isAssignableFrom(cls)) {
                C5925.m11310("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                return null;
            }
        }
        InterfaceC3452 interfaceC3452Mo7564 = ((C3428) c3427.f11089).mo7564(cls);
        if (interfaceC3452Mo7564.mo7482()) {
            Class cls5 = AbstractC3547.f11198;
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                interfaceC3345M7575 = new C3436(AbstractC3341.f10965, AbstractC3676.f11473, interfaceC3452Mo7564.mo7481());
            } else {
                AbstractC3710 abstractC3710 = AbstractC3341.f10966;
                AbstractC3694 abstractC36942 = AbstractC3676.f11472;
                if (abstractC36942 == null) {
                    C5925.m11311("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                interfaceC3345M7575 = new C3436(abstractC3710, abstractC36942, interfaceC3452Mo7564.mo7481());
            }
        } else {
            Class cls6 = AbstractC3547.f11198;
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                interfaceC3345M7575 = C3437.m7575(interfaceC3452Mo7564, AbstractC3374.f11021, AbstractC3421.f11085, AbstractC3341.f10965, AbstractC3429.f11091[interfaceC3452Mo7564.getSyntax().ordinal()] != 1 ? AbstractC3676.f11473 : null, AbstractC3455.f11127);
            } else {
                InterfaceC3369 interfaceC3369 = AbstractC3374.f11022;
                InterfaceC3424 interfaceC3424 = AbstractC3421.f11086;
                AbstractC3710 abstractC37102 = AbstractC3341.f10966;
                if (AbstractC3429.f11091[interfaceC3452Mo7564.getSyntax().ordinal()] != 1) {
                    AbstractC3694 abstractC36943 = AbstractC3676.f11472;
                    if (abstractC36943 == null) {
                        C5925.m11311("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                    abstractC3694 = abstractC36943;
                } else {
                    abstractC3694 = null;
                }
                interfaceC3345M7575 = C3437.m7575(interfaceC3452Mo7564, interfaceC3369, interfaceC3424, abstractC37102, abstractC3694, AbstractC3455.f11128);
            }
        }
        InterfaceC3345 interfaceC33452 = (InterfaceC3345) concurrentHashMap.putIfAbsent(cls, interfaceC3345M7575);
        return interfaceC33452 != null ? interfaceC33452 : interfaceC3345M7575;
    }
}
