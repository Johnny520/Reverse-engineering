package p119;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;

/* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String f20003;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f20004;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f20002 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C7371 f20001 = null;

    public C7380(String str, String str2) {
        this.f20004 = str;
        this.f20003 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7380)) {
            return false;
        }
        C7380 c7380 = (C7380) obj;
        return AbstractC4395.m8907(this.f20004, c7380.f20004) && AbstractC4395.m8907(this.f20003, c7380.f20003) && this.f20002 == c7380.f20002 && AbstractC4395.m8907(this.f20001, c7380.f20001);
    }

    public final int hashCode() {
        int iM141 = AbstractC0053.m141(AbstractC6183.m11572(this.f20004.hashCode() * 31, 31, this.f20003), 31, this.f20002);
        C7371 c7371 = this.f20001;
        return iM141 + (c7371 == null ? 0 : c7371.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
        sb.append(this.f20001);
        sb.append(", isShowingSubstitution=");
        return AbstractC0053.m152(sb, this.f20002, ')');
    }
}
