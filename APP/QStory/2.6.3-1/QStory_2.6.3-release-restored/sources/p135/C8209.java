package p135;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;

/* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8209 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String f20348;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f20349;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f20347 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C8200 f20346 = null;

    public C8209(String str, String str2) {
        this.f20349 = str;
        this.f20348 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8209)) {
            return false;
        }
        C8209 c8209 = (C8209) obj;
        return AbstractC5227.m9466(this.f20349, c8209.f20349) && AbstractC5227.m9466(this.f20348, c8209.f20348) && this.f20347 == c8209.f20347 && AbstractC5227.m9466(this.f20346, c8209.f20346);
    }

    public final int hashCode() {
        int iM701 = AbstractC0900.m701(AbstractC7012.m12131(this.f20349.hashCode() * 31, 31, this.f20348), 31, this.f20347);
        C8200 c8200 = this.f20346;
        return iM701 + (c8200 == null ? 0 : c8200.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
        sb.append(this.f20346);
        sb.append(", isShowingSubstitution=");
        return AbstractC0900.m712(sb, this.f20347, ')');
    }
}
