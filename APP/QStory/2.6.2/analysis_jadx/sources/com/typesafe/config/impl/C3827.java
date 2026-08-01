package com.typesafe.config.impl;

import androidx.activity.AbstractC0053;
import p007.AbstractC6136;
import p250.InterfaceC8160;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3827 extends C3836 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f12023;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f12024;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f12025;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Throwable f12026;

    public C3827(InterfaceC8160 interfaceC8160, String str, String str2, boolean z, Throwable th) {
        super(TokenType.PROBLEM, interfaceC8160, null, null);
        this.f12025 = str;
        this.f12024 = str2;
        this.f12023 = z;
        this.f12026 = th;
    }

    @Override // com.typesafe.config.impl.C3836
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        C3827 c3827 = (C3827) obj;
        return c3827.f12025.equals(this.f12025) && c3827.f12024.equals(this.f12024) && c3827.f12023 == this.f12023 && AbstractC3863.m8262(c3827.f12026, this.f12026);
    }

    @Override // com.typesafe.config.impl.C3836
    public final int hashCode() {
        int iHashCode = (Boolean.valueOf(this.f12023).hashCode() + AbstractC6136.m11539(AbstractC6136.m11539((this.f12048.hashCode() + 41) * 41, 41, this.f12025), 41, this.f12024)) * 41;
        Throwable th = this.f12026;
        return th != null ? (th.hashCode() + iHashCode) * 41 : iHashCode;
    }

    @Override // com.typesafe.config.impl.C3836
    public final String toString() {
        StringBuilder sb = new StringBuilder("'");
        sb.append(this.f12025);
        sb.append("' (");
        return AbstractC0053.m146(sb, this.f12024, ")");
    }

    @Override // com.typesafe.config.impl.C3836
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo8210(C3836 c3836) {
        return c3836 instanceof C3827;
    }
}
