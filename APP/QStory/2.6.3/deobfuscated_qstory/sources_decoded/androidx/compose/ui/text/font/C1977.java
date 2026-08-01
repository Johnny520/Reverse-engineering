package androidx.compose.ui.text.font;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1977 implements InterfaceC1982 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f5862;

    public C1977(int i) {
        this.f5862 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1977) && this.f5862 == ((C1977) obj).f5862;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5862);
    }

    public final String toString() {
        return AbstractC0053.m156(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f5862, ')');
    }
}
