package com.typesafe.config.impl;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3852 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3857 f12075;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC3842 f12076;

    public C3852(AbstractC3842 abstractC3842, C3857 c3857) {
        this.f12076 = abstractC3842;
        this.f12075 = c3857;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3852) {
            C3852 c3852 = (C3852) obj;
            if (c3852.f12076 != this.f12076) {
                return false;
            }
            C3857 c3857 = c3852.f12075;
            C3857 c38572 = this.f12075;
            if (c3857 == c38572) {
                return true;
            }
            if (c3857 != null && c38572 != null) {
                return c3857.equals(c38572);
            }
        }
        return false;
    }

    public final int hashCode() {
        int iIdentityHashCode = System.identityHashCode(this.f12076);
        C3857 c3857 = this.f12075;
        return c3857 != null ? ((c3857.hashCode() + 41) * 41) + iIdentityHashCode : iIdentityHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MemoKey(");
        AbstractC3842 abstractC3842 = this.f12076;
        sb.append(abstractC3842);
        sb.append("@");
        sb.append(System.identityHashCode(abstractC3842));
        sb.append(",");
        sb.append(this.f12075);
        sb.append(")");
        return sb.toString();
    }
}
