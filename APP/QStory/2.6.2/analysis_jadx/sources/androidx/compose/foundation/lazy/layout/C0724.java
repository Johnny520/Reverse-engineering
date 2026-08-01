package androidx.compose.foundation.lazy.layout;

import androidx.activity.AbstractC0053;
import p176.AbstractC7740;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0724 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f2033;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f2034;

    public C0724(int i, int i2) {
        this.f2034 = i;
        this.f2033 = i2;
        if (!(i >= 0)) {
            AbstractC7740.m13069("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        AbstractC7740.m13069("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0724)) {
            return false;
        }
        C0724 c0724 = (C0724) obj;
        return this.f2034 == c0724.f2034 && this.f2033 == c0724.f2033;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2033) + (Integer.hashCode(this.f2034) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.f2034);
        sb.append(", end=");
        return AbstractC0053.m154(sb, this.f2033, ')');
    }
}
