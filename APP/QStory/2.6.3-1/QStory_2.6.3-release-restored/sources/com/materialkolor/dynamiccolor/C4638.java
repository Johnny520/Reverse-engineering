package com.materialkolor.dynamiccolor;

import androidx.activity.AbstractC0900;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7387;
import p281.C9089;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4638 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC7387 f12330;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC7387 f12331;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f12332;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7387 f12333;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7387 f12334;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f12335;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC7387 f12336;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC7387 f12337;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final HashMap f12338;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC7387 f12339;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC7387 f12340;

    public C4638(String str, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872, boolean z, InterfaceC7387 interfaceC73873, InterfaceC7387 interfaceC73874, InterfaceC7387 interfaceC73875, InterfaceC7387 interfaceC73876, InterfaceC7387 interfaceC73877, InterfaceC7387 interfaceC73878) {
        str.getClass();
        interfaceC7387.getClass();
        this.f12335 = str;
        this.f12334 = interfaceC7387;
        this.f12333 = interfaceC73872;
        this.f12332 = z;
        this.f12331 = interfaceC73873;
        this.f12330 = interfaceC73874;
        this.f12337 = interfaceC73875;
        this.f12336 = interfaceC73876;
        this.f12339 = interfaceC73877;
        this.f12340 = interfaceC73878;
        this.f12338 = new HashMap();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4638)) {
            return false;
        }
        C4638 c4638 = (C4638) obj;
        return AbstractC5227.m9466(this.f12335, c4638.f12335) && AbstractC5227.m9466(this.f12334, c4638.f12334) && this.f12333.equals(c4638.f12333) && this.f12332 == c4638.f12332 && AbstractC5227.m9466(this.f12331, c4638.f12331) && AbstractC5227.m9466(this.f12330, c4638.f12330) && AbstractC5227.m9466(this.f12337, c4638.f12337) && AbstractC5227.m9466(this.f12336, c4638.f12336) && AbstractC5227.m9466(this.f12339, c4638.f12339) && AbstractC5227.m9466(this.f12340, c4638.f12340);
    }

    public final int hashCode() {
        int iM701 = AbstractC0900.m701((this.f12333.hashCode() + ((this.f12334.hashCode() + (this.f12335.hashCode() * 31)) * 31)) * 31, 31, this.f12332);
        InterfaceC7387 interfaceC7387 = this.f12331;
        int iHashCode = (iM701 + (interfaceC7387 == null ? 0 : interfaceC7387.hashCode())) * 31;
        InterfaceC7387 interfaceC73872 = this.f12330;
        int iHashCode2 = (iHashCode + (interfaceC73872 == null ? 0 : interfaceC73872.hashCode())) * 31;
        InterfaceC7387 interfaceC73873 = this.f12337;
        int iHashCode3 = (iHashCode2 + (interfaceC73873 == null ? 0 : interfaceC73873.hashCode())) * 31;
        InterfaceC7387 interfaceC73874 = this.f12336;
        int iHashCode4 = (iHashCode3 + (interfaceC73874 == null ? 0 : interfaceC73874.hashCode())) * 31;
        InterfaceC7387 interfaceC73875 = this.f12339;
        int iHashCode5 = (iHashCode4 + (interfaceC73875 == null ? 0 : interfaceC73875.hashCode())) * 31;
        InterfaceC7387 interfaceC73876 = this.f12340;
        return iHashCode5 + (interfaceC73876 != null ? interfaceC73876.hashCode() : 0);
    }

    public final String toString() {
        return "DynamicColor(name=" + this.f12335 + ", palette=" + this.f12334 + ", tone=" + this.f12333 + ", isBackground=" + this.f12332 + ", chromaMultiplier=" + this.f12331 + ", background=" + this.f12330 + ", secondBackground=" + this.f12337 + ", contrastCurve=" + this.f12336 + ", toneDeltaPair=" + this.f12339 + ", opacity=" + this.f12340 + ")";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4637 m8694() {
        C4637 c4637 = new C4637();
        String str = this.f12335;
        str.getClass();
        c4637.f12325 = str;
        InterfaceC7387 interfaceC7387 = this.f12334;
        interfaceC7387.getClass();
        c4637.f12324 = interfaceC7387;
        c4637.f12323 = this.f12333;
        c4637.f12322 = this.f12332;
        c4637.f12321 = this.f12331;
        c4637.f12320 = this.f12330;
        c4637.f12327 = this.f12337;
        c4637.f12326 = this.f12336;
        c4637.f12328 = this.f12339;
        c4637.f12329 = this.f12340;
        return c4637;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final double m8695(C9089 c9089) {
        c9089.getClass();
        return (c9089.f23216 == ColorSpec$SpecVersion.SPEC_2025 ? AbstractC4636.f12318 : AbstractC4636.f12319).mo8729(c9089, this);
    }
}
