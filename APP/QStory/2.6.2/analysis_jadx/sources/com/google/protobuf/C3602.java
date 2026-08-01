package com.google.protobuf;

import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪兰世哲苏子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3602 extends AbstractC3581 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C3601 f11237;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC3440 f11238;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f11239;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3440 f11240;

    public C3602(InterfaceC3440 interfaceC3440, Object obj, InterfaceC3440 interfaceC34402, C3601 c3601) {
        if (interfaceC3440 == null) {
            C5919.m11249("Null containingTypeDefaultInstance");
            throw null;
        }
        if (c3601.f11235 == WireFormat$FieldType.MESSAGE && interfaceC34402 == null) {
            C5919.m11249("Null messageDefaultInstance");
            throw null;
        }
        this.f11240 = interfaceC3440;
        this.f11239 = obj;
        this.f11238 = interfaceC34402;
        this.f11237 = c3601;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m7822(Object obj) {
        return this.f11237.f11235.getJavaType() == WireFormat$JavaType.ENUM ? Integer.valueOf(((InterfaceC3398) obj).getNumber()) : obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m7823(Object obj) {
        C3601 c3601 = this.f11237;
        return c3601.f11235.getJavaType() == WireFormat$JavaType.ENUM ? c3601.f11236.mo7359(((Integer) obj).intValue()) : obj;
    }
}
