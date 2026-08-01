package androidx.compose.ui.text.input;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.text.C2068;
import androidx.window.area.AbstractC2567;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2015 implements InterfaceC2005 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f5950;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2068 f5951;

    public C2015(String str, int i) {
        this.f5951 = new C2068(str);
        this.f5950 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2015)) {
            return false;
        }
        C2015 c2015 = (C2015) obj;
        return AbstractC4395.m8907(this.f5951.f6129, c2015.f5951.f6129) && this.f5950 == c2015.f5950;
    }

    public final int hashCode() {
        return (this.f5951.f6129.hashCode() * 31) + this.f5950;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.f5951.f6129);
        sb.append("', newCursorPosition=");
        return AbstractC0053.m156(sb, this.f5950, ')');
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2005
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo1692(C2023 c2023) {
        int i = c2023.f5962;
        C2068 c2068 = this.f5951;
        if (i != -1) {
            int i2 = c2023.f5961;
            String str = c2068.f6129;
            String str2 = c2068.f6129;
            c2023.m3729(i, i2, str);
            if (str2.length() > 0) {
                c2023.m3728(i, str2.length() + i);
            }
        } else {
            int i3 = c2023.f5964;
            int i4 = c2023.f5965;
            String str3 = c2068.f6129;
            String str4 = c2068.f6129;
            c2023.m3729(i3, i4, str3);
            if (str4.length() > 0) {
                c2023.m3728(i3, str4.length() + i3);
            }
        }
        int i5 = c2023.f5964;
        int i6 = c2023.f5965;
        int i7 = i5 == i6 ? i6 : -1;
        int i8 = this.f5950;
        int iM5090 = AbstractC2567.m5090(i8 > 0 ? (i7 + i8) - 1 : (i7 + i8) - c2068.f6129.length(), 0, ((C2019) c2023.f5963).m3720());
        c2023.m3727(iM5090, iM5090);
    }
}
