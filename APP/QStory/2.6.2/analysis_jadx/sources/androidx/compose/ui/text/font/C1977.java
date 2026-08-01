package androidx.compose.ui.text.font;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1977 implements InterfaceC1982 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f5861;

    public C1977(int i) {
        this.f5861 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1977) && this.f5861 == ((C1977) obj).f5861;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5861);
    }

    public final String toString() {
        return AbstractC0053.m154(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f5861, ')');
    }
}
