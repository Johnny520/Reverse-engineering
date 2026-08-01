package com.materialkolor.dynamiccolor;

import androidx.activity.AbstractC0053;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6558;
import p265.C8260;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3806 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC6558 f11985;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6558 f11986;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f11987;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6558 f11988;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6558 f11989;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f11990;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC6558 f11991;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC6558 f11992;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final HashMap f11993;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC6558 f11994;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC6558 f11995;

    public C3806(String str, InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582, boolean z, InterfaceC6558 interfaceC65583, InterfaceC6558 interfaceC65584, InterfaceC6558 interfaceC65585, InterfaceC6558 interfaceC65586, InterfaceC6558 interfaceC65587, InterfaceC6558 interfaceC65588) {
        str.getClass();
        interfaceC6558.getClass();
        this.f11990 = str;
        this.f11989 = interfaceC6558;
        this.f11988 = interfaceC65582;
        this.f11987 = z;
        this.f11986 = interfaceC65583;
        this.f11985 = interfaceC65584;
        this.f11992 = interfaceC65585;
        this.f11991 = interfaceC65586;
        this.f11994 = interfaceC65587;
        this.f11995 = interfaceC65588;
        this.f11993 = new HashMap();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3806)) {
            return false;
        }
        C3806 c3806 = (C3806) obj;
        return AbstractC4395.m8907(this.f11990, c3806.f11990) && AbstractC4395.m8907(this.f11989, c3806.f11989) && this.f11988.equals(c3806.f11988) && this.f11987 == c3806.f11987 && AbstractC4395.m8907(this.f11986, c3806.f11986) && AbstractC4395.m8907(this.f11985, c3806.f11985) && AbstractC4395.m8907(this.f11992, c3806.f11992) && AbstractC4395.m8907(this.f11991, c3806.f11991) && AbstractC4395.m8907(this.f11994, c3806.f11994) && AbstractC4395.m8907(this.f11995, c3806.f11995);
    }

    public final int hashCode() {
        int iM141 = AbstractC0053.m141((this.f11988.hashCode() + ((this.f11989.hashCode() + (this.f11990.hashCode() * 31)) * 31)) * 31, 31, this.f11987);
        InterfaceC6558 interfaceC6558 = this.f11986;
        int iHashCode = (iM141 + (interfaceC6558 == null ? 0 : interfaceC6558.hashCode())) * 31;
        InterfaceC6558 interfaceC65582 = this.f11985;
        int iHashCode2 = (iHashCode + (interfaceC65582 == null ? 0 : interfaceC65582.hashCode())) * 31;
        InterfaceC6558 interfaceC65583 = this.f11992;
        int iHashCode3 = (iHashCode2 + (interfaceC65583 == null ? 0 : interfaceC65583.hashCode())) * 31;
        InterfaceC6558 interfaceC65584 = this.f11991;
        int iHashCode4 = (iHashCode3 + (interfaceC65584 == null ? 0 : interfaceC65584.hashCode())) * 31;
        InterfaceC6558 interfaceC65585 = this.f11994;
        int iHashCode5 = (iHashCode4 + (interfaceC65585 == null ? 0 : interfaceC65585.hashCode())) * 31;
        InterfaceC6558 interfaceC65586 = this.f11995;
        return iHashCode5 + (interfaceC65586 != null ? interfaceC65586.hashCode() : 0);
    }

    public final String toString() {
        return "DynamicColor(name=" + this.f11990 + ", palette=" + this.f11989 + ", tone=" + this.f11988 + ", isBackground=" + this.f11987 + ", chromaMultiplier=" + this.f11986 + ", background=" + this.f11985 + ", secondBackground=" + this.f11992 + ", contrastCurve=" + this.f11991 + ", toneDeltaPair=" + this.f11994 + ", opacity=" + this.f11995 + ")";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3805 m8135() {
        C3805 c3805 = new C3805();
        String str = this.f11990;
        str.getClass();
        c3805.f11980 = str;
        InterfaceC6558 interfaceC6558 = this.f11989;
        interfaceC6558.getClass();
        c3805.f11979 = interfaceC6558;
        c3805.f11978 = this.f11988;
        c3805.f11977 = this.f11987;
        c3805.f11976 = this.f11986;
        c3805.f11975 = this.f11985;
        c3805.f11982 = this.f11992;
        c3805.f11981 = this.f11991;
        c3805.f11983 = this.f11994;
        c3805.f11984 = this.f11995;
        return c3805;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final double m8136(C8260 c8260) {
        c8260.getClass();
        return (c8260.f22871 == ColorSpec$SpecVersion.SPEC_2025 ? AbstractC3804.f11973 : AbstractC3804.f11974).mo8170(c8260, this);
    }
}
