package androidx.compose.ui.text.input;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.text.C2068;
import kotlin.jvm.internal.AbstractC4394;
import p000.AbstractC6087;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2010 implements InterfaceC2005 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f5932;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2068 f5933;

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
        return AbstractC4394.m8917(this.f5933.f6128, c2010.f5933.f6128) && this.f5932 == c2010.f5932;
    }

    public final int hashCode() {
        return (this.f5933.f6128.hashCode() * 31) + this.f5932;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.f5933.f6128);
        sb.append("', newCursorPosition=");
        return AbstractC0053.m154(sb, this.f5932, ')');
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2005
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo1682(C2023 c2023) {
        int i = c2023.f5961;
        C2068 c2068 = this.f5933;
        if (i != -1) {
            c2023.m3719(i, c2023.f5960, c2068.f6128);
        } else {
            c2023.m3719(c2023.f5963, c2023.f5964, c2068.f6128);
        }
        int i2 = c2023.f5963;
        int i3 = c2023.f5964;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.f5932;
        int iM11420 = AbstractC6087.m11420(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - c2068.f6128.length(), 0, ((C2019) c2023.f5962).m3710());
        c2023.m3717(iM11420, iM11420);
    }

    public C2010(C2068 c2068, int i) {
        this.f5933 = c2068;
        this.f5932 = i;
    }
}
