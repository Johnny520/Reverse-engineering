package androidx.compose.foundation.text.selection;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0911 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f2585;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0912 f2586;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0912 f2587;

    public C0911(C0912 c0912, C0912 c09122, boolean z) {
        this.f2587 = c0912;
        this.f2586 = c09122;
        this.f2585 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C0911 m1821(C0911 c0911, C0912 c0912, C0912 c09122, boolean z, int i) {
        if ((i & 1) != 0) {
            c0912 = c0911.f2587;
        }
        if ((i & 2) != 0) {
            c09122 = c0911.f2586;
        }
        c0911.getClass();
        return new C0911(c0912, c09122, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0911)) {
            return false;
        }
        C0911 c0911 = (C0911) obj;
        return AbstractC4395.m8907(this.f2587, c0911.f2587) && AbstractC4395.m8907(this.f2586, c0911.f2586) && this.f2585 == c0911.f2585;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2585) + ((this.f2586.hashCode() + (this.f2587.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.f2587);
        sb.append(", end=");
        sb.append(this.f2586);
        sb.append(", handlesCrossed=");
        return AbstractC0053.m152(sb, this.f2585, ')');
    }
}
