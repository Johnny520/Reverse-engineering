package androidx.compose.ui.text.input;

import androidx.compose.ui.text.C2068;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2004 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC2022 f5908;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2068 f5909;

    public C2004(C2068 c2068, InterfaceC2022 interfaceC2022) {
        this.f5909 = c2068;
        this.f5908 = interfaceC2022;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2004)) {
            return false;
        }
        C2004 c2004 = (C2004) obj;
        return AbstractC4394.m8917(this.f5909, c2004.f5909) && this.f5908.equals(c2004.f5908);
    }

    public final int hashCode() {
        return this.f5908.hashCode() + (this.f5909.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f5909) + ", offsetMapping=" + this.f5908 + ')';
    }
}
