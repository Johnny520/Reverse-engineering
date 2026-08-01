package com.google.protobuf;

import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰世哲苏子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4435 extends AbstractC4414 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4434 f11587;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC4273 f11588;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f11589;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC4273 f11590;

    public C4435(InterfaceC4273 interfaceC4273, Object obj, InterfaceC4273 interfaceC42732, C4434 c4434) {
        if (interfaceC4273 == null) {
            C6755.m11869("Null containingTypeDefaultInstance");
            throw null;
        }
        if (c4434.f11585 == WireFormat$FieldType.MESSAGE && interfaceC42732 == null) {
            C6755.m11869("Null messageDefaultInstance");
            throw null;
        }
        this.f11590 = interfaceC4273;
        this.f11589 = obj;
        this.f11588 = interfaceC42732;
        this.f11587 = c4434;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m8368(Object obj) {
        return this.f11587.f11585.getJavaType() == WireFormat$JavaType.ENUM ? Integer.valueOf(((InterfaceC4231) obj).getNumber()) : obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m8369(Object obj) {
        C4434 c4434 = this.f11587;
        return c4434.f11585.getJavaType() == WireFormat$JavaType.ENUM ? c4434.f11586.mo7905(((Integer) obj).intValue()) : obj;
    }
}
