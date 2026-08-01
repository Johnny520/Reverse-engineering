package androidx.compose.ui.text.input;

import androidx.compose.ui.text.C2068;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2004 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC2022 f5909;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2068 f5910;

    public C2004(C2068 c2068, InterfaceC2022 interfaceC2022) {
        this.f5910 = c2068;
        this.f5909 = interfaceC2022;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2004)) {
            return false;
        }
        C2004 c2004 = (C2004) obj;
        return AbstractC4395.m8907(this.f5910, c2004.f5910) && this.f5909.equals(c2004.f5909);
    }

    public final int hashCode() {
        return this.f5909.hashCode() + (this.f5910.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f5910) + ", offsetMapping=" + this.f5909 + ')';
    }
}
