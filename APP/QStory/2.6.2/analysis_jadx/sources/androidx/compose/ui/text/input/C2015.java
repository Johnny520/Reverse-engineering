package androidx.compose.ui.text.input;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.text.C2068;
import kotlin.jvm.internal.AbstractC4394;
import p000.AbstractC6087;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2015 implements InterfaceC2005 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f5949;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2068 f5950;

    public C2015(String str, int i) {
        this.f5950 = new C2068(str);
        this.f5949 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2015)) {
            return false;
        }
        C2015 c2015 = (C2015) obj;
        return AbstractC4394.m8917(this.f5950.f6128, c2015.f5950.f6128) && this.f5949 == c2015.f5949;
    }

    public final int hashCode() {
        return (this.f5950.f6128.hashCode() * 31) + this.f5949;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.f5950.f6128);
        sb.append("', newCursorPosition=");
        return AbstractC0053.m154(sb, this.f5949, ')');
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2005
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo1682(C2023 c2023) {
        int i = c2023.f5961;
        C2068 c2068 = this.f5950;
        if (i != -1) {
            int i2 = c2023.f5960;
            String str = c2068.f6128;
            String str2 = c2068.f6128;
            c2023.m3719(i, i2, str);
            if (str2.length() > 0) {
                c2023.m3718(i, str2.length() + i);
            }
        } else {
            int i3 = c2023.f5963;
            int i4 = c2023.f5964;
            String str3 = c2068.f6128;
            String str4 = c2068.f6128;
            c2023.m3719(i3, i4, str3);
            if (str4.length() > 0) {
                c2023.m3718(i3, str4.length() + i3);
            }
        }
        int i5 = c2023.f5963;
        int i6 = c2023.f5964;
        int i7 = i5 == i6 ? i6 : -1;
        int i8 = this.f5949;
        int iM11420 = AbstractC6087.m11420(i8 > 0 ? (i7 + i8) - 1 : (i7 + i8) - c2068.f6128.length(), 0, ((C2019) c2023.f5962).m3710());
        c2023.m3717(iM11420, iM11420);
    }
}
