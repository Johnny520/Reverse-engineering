package androidx.compose.ui.text.input;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.text.C2068;
import androidx.window.area.AbstractC2567;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2010 implements InterfaceC2005 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f5933;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2068 f5934;

    public C2010(String str, int i) {
        this(new C2068(str), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2010)) {
            return false;
        }
        C2010 c2010 = (C2010) obj;
        return AbstractC4395.m8907(this.f5934.f6129, c2010.f5934.f6129) && this.f5933 == c2010.f5933;
    }

    public final int hashCode() {
        return (this.f5934.f6129.hashCode() * 31) + this.f5933;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.f5934.f6129);
        sb.append("', newCursorPosition=");
        return AbstractC0053.m156(sb, this.f5933, ')');
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2005
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo1692(C2023 c2023) {
        int i = c2023.f5962;
        C2068 c2068 = this.f5934;
        if (i != -1) {
            c2023.m3729(i, c2023.f5961, c2068.f6129);
        } else {
            c2023.m3729(c2023.f5964, c2023.f5965, c2068.f6129);
        }
        int i2 = c2023.f5964;
        int i3 = c2023.f5965;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.f5933;
        int iM5090 = AbstractC2567.m5090(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - c2068.f6129.length(), 0, ((C2019) c2023.f5963).m3720());
        c2023.m3727(iM5090, iM5090);
    }

    public C2010(C2068 c2068, int i) {
        this.f5934 = c2068;
        this.f5933 = i;
    }
}
