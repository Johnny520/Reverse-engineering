package com.materialkolor.dynamiccolor;

import androidx.activity.AbstractC0053;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6557;
import p265.C8259;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3805 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC6557 f11980;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6557 f11981;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f11982;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6557 f11983;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6557 f11984;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f11985;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC6557 f11986;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC6557 f11987;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final HashMap f11988;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC6557 f11989;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC6557 f11990;

    public C3805(String str, InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572, boolean z, InterfaceC6557 interfaceC65573, InterfaceC6557 interfaceC65574, InterfaceC6557 interfaceC65575, InterfaceC6557 interfaceC65576, InterfaceC6557 interfaceC65577, InterfaceC6557 interfaceC65578) {
        str.getClass();
        interfaceC6557.getClass();
        this.f11985 = str;
        this.f11984 = interfaceC6557;
        this.f11983 = interfaceC65572;
        this.f11982 = z;
        this.f11981 = interfaceC65573;
        this.f11980 = interfaceC65574;
        this.f11987 = interfaceC65575;
        this.f11986 = interfaceC65576;
        this.f11989 = interfaceC65577;
        this.f11990 = interfaceC65578;
        this.f11988 = new HashMap();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3805)) {
            return false;
        }
        C3805 c3805 = (C3805) obj;
        return AbstractC4394.m8917(this.f11985, c3805.f11985) && AbstractC4394.m8917(this.f11984, c3805.f11984) && this.f11983.equals(c3805.f11983) && this.f11982 == c3805.f11982 && AbstractC4394.m8917(this.f11981, c3805.f11981) && AbstractC4394.m8917(this.f11980, c3805.f11980) && AbstractC4394.m8917(this.f11987, c3805.f11987) && AbstractC4394.m8917(this.f11986, c3805.f11986) && AbstractC4394.m8917(this.f11989, c3805.f11989) && AbstractC4394.m8917(this.f11990, c3805.f11990);
    }

    public final int hashCode() {
        int iM140 = AbstractC0053.m140((this.f11983.hashCode() + ((this.f11984.hashCode() + (this.f11985.hashCode() * 31)) * 31)) * 31, 31, this.f11982);
        InterfaceC6557 interfaceC6557 = this.f11981;
        int iHashCode = (iM140 + (interfaceC6557 == null ? 0 : interfaceC6557.hashCode())) * 31;
        InterfaceC6557 interfaceC65572 = this.f11980;
        int iHashCode2 = (iHashCode + (interfaceC65572 == null ? 0 : interfaceC65572.hashCode())) * 31;
        InterfaceC6557 interfaceC65573 = this.f11987;
        int iHashCode3 = (iHashCode2 + (interfaceC65573 == null ? 0 : interfaceC65573.hashCode())) * 31;
        InterfaceC6557 interfaceC65574 = this.f11986;
        int iHashCode4 = (iHashCode3 + (interfaceC65574 == null ? 0 : interfaceC65574.hashCode())) * 31;
        InterfaceC6557 interfaceC65575 = this.f11989;
        int iHashCode5 = (iHashCode4 + (interfaceC65575 == null ? 0 : interfaceC65575.hashCode())) * 31;
        InterfaceC6557 interfaceC65576 = this.f11990;
        return iHashCode5 + (interfaceC65576 != null ? interfaceC65576.hashCode() : 0);
    }

    public final String toString() {
        return "DynamicColor(name=" + this.f11985 + ", palette=" + this.f11984 + ", tone=" + this.f11983 + ", isBackground=" + this.f11982 + ", chromaMultiplier=" + this.f11981 + ", background=" + this.f11980 + ", secondBackground=" + this.f11987 + ", contrastCurve=" + this.f11986 + ", toneDeltaPair=" + this.f11989 + ", opacity=" + this.f11990 + ")";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3804 m8148() {
        C3804 c3804 = new C3804();
        String str = this.f11985;
        str.getClass();
        c3804.f11975 = str;
        InterfaceC6557 interfaceC6557 = this.f11984;
        interfaceC6557.getClass();
        c3804.f11974 = interfaceC6557;
        c3804.f11973 = this.f11983;
        c3804.f11972 = this.f11982;
        c3804.f11971 = this.f11981;
        c3804.f11970 = this.f11980;
        c3804.f11977 = this.f11987;
        c3804.f11976 = this.f11986;
        c3804.f11978 = this.f11989;
        c3804.f11979 = this.f11990;
        return c3804;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final double m8149(C8259 c8259) {
        c8259.getClass();
        return (c8259.f22872 == ColorSpec$SpecVersion.SPEC_2025 ? AbstractC3803.f11968 : AbstractC3803.f11969).mo8183(c8259, this);
    }
}
