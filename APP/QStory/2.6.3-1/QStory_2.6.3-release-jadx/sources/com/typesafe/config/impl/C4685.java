package com.typesafe.config.impl;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4685 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4690 f12425;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC4675 f12426;

    public C4685(AbstractC4675 abstractC4675, C4690 c4690) {
        this.f12426 = abstractC4675;
        this.f12425 = c4690;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4685) {
            C4685 c4685 = (C4685) obj;
            if (c4685.f12426 != this.f12426) {
                return false;
            }
            C4690 c4690 = c4685.f12425;
            C4690 c46902 = this.f12425;
            if (c4690 == c46902) {
                return true;
            }
            if (c4690 != null && c46902 != null) {
                return c4690.equals(c46902);
            }
        }
        return false;
    }

    public final int hashCode() {
        int iIdentityHashCode = System.identityHashCode(this.f12426);
        C4690 c4690 = this.f12425;
        return c4690 != null ? ((c4690.hashCode() + 41) * 41) + iIdentityHashCode : iIdentityHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MemoKey(");
        AbstractC4675 abstractC4675 = this.f12426;
        sb.append(abstractC4675);
        sb.append("@");
        sb.append(System.identityHashCode(abstractC4675));
        sb.append(",");
        sb.append(this.f12425);
        sb.append(")");
        return sb.toString();
    }
}
