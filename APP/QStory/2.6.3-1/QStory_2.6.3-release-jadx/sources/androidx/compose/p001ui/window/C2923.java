package androidx.compose.p001ui.window;

import androidx.activity.AbstractC0900;
import androidx.compose.runtime.C2193;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2923 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f6536;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f6537;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f6538;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f6539;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f6540;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f6541;

    public C2923(boolean z, SecureFlagPolicy secureFlagPolicy, boolean z2) {
        C2193 c2193 = AbstractC2924.f6543;
        int i = !z ? 262152 : 262144;
        i = secureFlagPolicy == SecureFlagPolicy.SecureOn ? i | 8192 : i;
        i = z2 ? i : i | 512;
        boolean z3 = secureFlagPolicy == SecureFlagPolicy.Inherit;
        this.f6541 = i;
        this.f6540 = z3;
        this.f6539 = true;
        this.f6538 = true;
        this.f6537 = true;
        this.f6536 = 1002;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2923)) {
            return false;
        }
        C2923 c2923 = (C2923) obj;
        return this.f6541 == c2923.f6541 && this.f6540 == c2923.f6540 && this.f6539 == c2923.f6539 && this.f6538 == c2923.f6538 && this.f6537 == c2923.f6537 && this.f6536 == c2923.f6536;
    }

    public final int hashCode() {
        return (AbstractC0900.m701(AbstractC0900.m701(AbstractC0900.m701(AbstractC0900.m701(AbstractC0900.m701(this.f6541 * 31, 31, this.f6540), 31, this.f6539), 31, this.f6538), 31, this.f6537), 31, false) + this.f6536) * 31;
    }

    public C2923(int i) {
        this((i & 1) == 0, SecureFlagPolicy.Inherit, true);
    }
}
