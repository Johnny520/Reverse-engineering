package androidx.compose.p001ui.text.input;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.text.C2902;
import androidx.window.area.AbstractC3400;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2844 implements InterfaceC2839 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6278;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2902 f6279;

    public C2844(String str, int i) {
        this(new C2902(str), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2844)) {
            return false;
        }
        C2844 c2844 = (C2844) obj;
        return AbstractC5227.m9466(this.f6279.f6474, c2844.f6279.f6474) && this.f6278 == c2844.f6278;
    }

    public final int hashCode() {
        return (this.f6279.f6474.hashCode() * 31) + this.f6278;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.f6279.f6474);
        sb.append("', newCursorPosition=");
        return AbstractC0900.m716(sb, this.f6278, ')');
    }

    @Override // androidx.compose.p001ui.text.input.InterfaceC2839
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2252(C2857 c2857) {
        int i = c2857.f6307;
        C2902 c2902 = this.f6279;
        if (i != -1) {
            c2857.m4289(i, c2857.f6306, c2902.f6474);
        } else {
            c2857.m4289(c2857.f6309, c2857.f6310, c2902.f6474);
        }
        int i2 = c2857.f6309;
        int i3 = c2857.f6310;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.f6278;
        int iM5650 = AbstractC3400.m5650(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - c2902.f6474.length(), 0, ((C2853) c2857.f6308).m4280());
        c2857.m4287(iM5650, iM5650);
    }

    public C2844(C2902 c2902, int i) {
        this.f6279 = c2902;
        this.f6278 = i;
    }
}
