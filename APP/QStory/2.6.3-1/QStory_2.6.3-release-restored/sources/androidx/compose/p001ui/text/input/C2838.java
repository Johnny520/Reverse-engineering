package androidx.compose.p001ui.text.input;

import androidx.compose.p001ui.text.C2902;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2838 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC2856 f6254;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2902 f6255;

    public C2838(C2902 c2902, InterfaceC2856 interfaceC2856) {
        this.f6255 = c2902;
        this.f6254 = interfaceC2856;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2838)) {
            return false;
        }
        C2838 c2838 = (C2838) obj;
        return AbstractC5227.m9466(this.f6255, c2838.f6255) && this.f6254.equals(c2838.f6254);
    }

    public final int hashCode() {
        return this.f6254.hashCode() + (this.f6255.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f6255) + ", offsetMapping=" + this.f6254 + ')';
    }
}
