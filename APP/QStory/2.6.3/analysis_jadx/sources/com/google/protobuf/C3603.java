package com.google.protobuf;

import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰世哲苏子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3603 extends AbstractC3582 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C3602 f11242;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC3441 f11243;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f11244;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3441 f11245;

    public C3603(InterfaceC3441 interfaceC3441, Object obj, InterfaceC3441 interfaceC34412, C3602 c3602) {
        if (interfaceC3441 == null) {
            C5925.m11310("Null containingTypeDefaultInstance");
            throw null;
        }
        if (c3602.f11240 == WireFormat$FieldType.MESSAGE && interfaceC34412 == null) {
            C5925.m11310("Null messageDefaultInstance");
            throw null;
        }
        this.f11245 = interfaceC3441;
        this.f11244 = obj;
        this.f11243 = interfaceC34412;
        this.f11242 = c3602;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m7809(Object obj) {
        return this.f11242.f11240.getJavaType() == WireFormat$JavaType.ENUM ? Integer.valueOf(((InterfaceC3399) obj).getNumber()) : obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m7810(Object obj) {
        C3602 c3602 = this.f11242;
        return c3602.f11240.getJavaType() == WireFormat$JavaType.ENUM ? c3602.f11241.mo7346(((Integer) obj).intValue()) : obj;
    }
}
