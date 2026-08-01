package androidx.compose.foundation.gestures;

import androidx.activity.AbstractC0053;
import p112.C7329;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0559 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f1608;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f1609;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f1610;

    public C0559(long j, long j2, boolean z) {
        this.f1610 = j;
        this.f1609 = j2;
        this.f1608 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0559)) {
            return false;
        }
        C0559 c0559 = (C0559) obj;
        return C7329.m12528(this.f1610, c0559.f1610) && this.f1609 == c0559.f1609 && this.f1608 == c0559.f1608;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1608) + AbstractC0053.m142(Long.hashCode(this.f1610) * 31, 31, this.f1609);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MouseWheelScrollDelta(value=");
        sb.append((Object) C7329.m12531(this.f1610));
        sb.append(", timeMillis=");
        sb.append(this.f1609);
        sb.append(", shouldApplyImmediately=");
        return AbstractC0053.m152(sb, this.f1608, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0559 m1352(C0559 c0559) {
        return new C0559(C7329.m12525(this.f1610, c0559.f1610), Math.max(this.f1609, c0559.f1609), this.f1608);
    }
}
