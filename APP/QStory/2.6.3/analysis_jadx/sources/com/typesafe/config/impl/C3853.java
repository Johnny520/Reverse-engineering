package com.typesafe.config.impl;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3853 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3858 f12080;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC3843 f12081;

    public C3853(AbstractC3843 abstractC3843, C3858 c3858) {
        this.f12081 = abstractC3843;
        this.f12080 = c3858;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3853) {
            C3853 c3853 = (C3853) obj;
            if (c3853.f12081 != this.f12081) {
                return false;
            }
            C3858 c3858 = c3853.f12080;
            C3858 c38582 = this.f12080;
            if (c3858 == c38582) {
                return true;
            }
            if (c3858 != null && c38582 != null) {
                return c3858.equals(c38582);
            }
        }
        return false;
    }

    public final int hashCode() {
        int iIdentityHashCode = System.identityHashCode(this.f12081);
        C3858 c3858 = this.f12080;
        return c3858 != null ? ((c3858.hashCode() + 41) * 41) + iIdentityHashCode : iIdentityHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MemoKey(");
        AbstractC3843 abstractC3843 = this.f12081;
        sb.append(abstractC3843);
        sb.append("@");
        sb.append(System.identityHashCode(abstractC3843));
        sb.append(",");
        sb.append(this.f12080);
        sb.append(")");
        return sb.toString();
    }
}
