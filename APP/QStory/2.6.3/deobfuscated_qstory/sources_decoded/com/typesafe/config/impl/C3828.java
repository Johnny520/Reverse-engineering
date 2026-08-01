package com.typesafe.config.impl;

import androidx.activity.AbstractC0053;
import p009.AbstractC6183;
import p250.InterfaceC8161;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3828 extends C3837 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f12028;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f12029;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f12030;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Throwable f12031;

    public C3828(InterfaceC8161 interfaceC8161, String str, String str2, boolean z, Throwable th) {
        super(TokenType.PROBLEM, interfaceC8161, null, null);
        this.f12030 = str;
        this.f12029 = str2;
        this.f12028 = z;
        this.f12031 = th;
    }

    @Override // com.typesafe.config.impl.C3837
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        C3828 c3828 = (C3828) obj;
        return c3828.f12030.equals(this.f12030) && c3828.f12029.equals(this.f12029) && c3828.f12028 == this.f12028 && AbstractC3864.m8249(c3828.f12031, this.f12031);
    }

    @Override // com.typesafe.config.impl.C3837
    public final int hashCode() {
        int iHashCode = (Boolean.valueOf(this.f12028).hashCode() + AbstractC6183.m11572(AbstractC6183.m11572((this.f12053.hashCode() + 41) * 41, 41, this.f12030), 41, this.f12029)) * 41;
        Throwable th = this.f12031;
        return th != null ? (th.hashCode() + iHashCode) * 41 : iHashCode;
    }

    @Override // com.typesafe.config.impl.C3837
    public final String toString() {
        StringBuilder sb = new StringBuilder("'");
        sb.append(this.f12030);
        sb.append("' (");
        return AbstractC0053.m151(sb, this.f12029, ")");
    }

    @Override // com.typesafe.config.impl.C3837
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo8197(C3837 c3837) {
        return c3837 instanceof C3828;
    }
}
