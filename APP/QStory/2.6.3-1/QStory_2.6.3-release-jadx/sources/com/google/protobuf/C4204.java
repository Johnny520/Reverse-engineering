package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世哲楪兰苏子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4204 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4204 f11363 = new C4204();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ConcurrentHashMap f11364 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4259 f11365 = new C4259(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC4177 m8039(Class cls) {
        AbstractC4526 abstractC4526;
        InterfaceC4177 interfaceC4177M8134;
        AbstractC4234.m8064(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f11364;
        InterfaceC4177 interfaceC4177 = (InterfaceC4177) concurrentHashMap.get(cls);
        if (interfaceC4177 != null) {
            return interfaceC4177;
        }
        C4259 c4259 = this.f11365;
        c4259.getClass();
        Class cls2 = AbstractC4173.f11312;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            Class cls3 = AbstractC4379.f11543;
            Class cls4 = AbstractC4173.f11312;
            if (cls4 != null && !cls4.isAssignableFrom(cls)) {
                C6755.m11869("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                return null;
            }
        }
        InterfaceC4284 interfaceC4284Mo8123 = ((C4260) c4259.f11434).mo8123(cls);
        if (interfaceC4284Mo8123.mo8041()) {
            Class cls5 = AbstractC4379.f11543;
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                interfaceC4177M8134 = new C4268(AbstractC4173.f11310, AbstractC4508.f11818, interfaceC4284Mo8123.mo8040());
            } else {
                AbstractC4542 abstractC4542 = AbstractC4173.f11311;
                AbstractC4526 abstractC45262 = AbstractC4508.f11817;
                if (abstractC45262 == null) {
                    C6755.m11870("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                interfaceC4177M8134 = new C4268(abstractC4542, abstractC45262, interfaceC4284Mo8123.mo8040());
            }
        } else {
            Class cls6 = AbstractC4379.f11543;
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                interfaceC4177M8134 = C4269.m8134(interfaceC4284Mo8123, AbstractC4206.f11366, AbstractC4253.f11430, AbstractC4173.f11310, AbstractC4261.f11436[interfaceC4284Mo8123.getSyntax().ordinal()] != 1 ? AbstractC4508.f11818 : null, AbstractC4287.f11472);
            } else {
                InterfaceC4201 interfaceC4201 = AbstractC4206.f11367;
                InterfaceC4256 interfaceC4256 = AbstractC4253.f11431;
                AbstractC4542 abstractC45422 = AbstractC4173.f11311;
                if (AbstractC4261.f11436[interfaceC4284Mo8123.getSyntax().ordinal()] != 1) {
                    AbstractC4526 abstractC45263 = AbstractC4508.f11817;
                    if (abstractC45263 == null) {
                        C6755.m11870("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                    abstractC4526 = abstractC45263;
                } else {
                    abstractC4526 = null;
                }
                interfaceC4177M8134 = C4269.m8134(interfaceC4284Mo8123, interfaceC4201, interfaceC4256, abstractC45422, abstractC4526, AbstractC4287.f11473);
            }
        }
        InterfaceC4177 interfaceC41772 = (InterfaceC4177) concurrentHashMap.putIfAbsent(cls, interfaceC4177M8134);
        return interfaceC41772 != null ? interfaceC41772 : interfaceC4177M8134;
    }
}
