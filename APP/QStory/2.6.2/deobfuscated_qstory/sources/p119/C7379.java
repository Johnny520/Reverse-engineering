package p119;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;

/* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7379 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String f20008;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f20009;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f20007 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C7370 f20006 = null;

    public C7379(String str, String str2) {
        this.f20009 = str;
        this.f20008 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7379)) {
            return false;
        }
        C7379 c7379 = (C7379) obj;
        return AbstractC4394.m8917(this.f20009, c7379.f20009) && AbstractC4394.m8917(this.f20008, c7379.f20008) && this.f20007 == c7379.f20007 && AbstractC4394.m8917(this.f20006, c7379.f20006);
    }

    public final int hashCode() {
        int iM140 = AbstractC0053.m140(AbstractC6136.m11539(this.f20009.hashCode() * 31, 31, this.f20008), 31, this.f20007);
        C7370 c7370 = this.f20006;
        return iM140 + (c7370 == null ? 0 : c7370.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
        sb.append(this.f20006);
        sb.append(", isShowingSubstitution=");
        return AbstractC0053.m150(sb, this.f20007, ')');
    }
}
