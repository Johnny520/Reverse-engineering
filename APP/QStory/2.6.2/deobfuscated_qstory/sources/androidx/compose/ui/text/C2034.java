package androidx.compose.ui.text;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.text.font.InterfaceC1996;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p205.C7897;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2034 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f5991;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f5992;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f5993;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f5994;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2031 f5995;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2068 f5996;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final LayoutDirection f5997;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC7895 f5998;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC1996 f5999;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long f6000;

    public C2034(C2068 c2068, C2031 c2031, List list, int i, boolean z, int i2, InterfaceC7895 interfaceC7895, LayoutDirection layoutDirection, InterfaceC1996 interfaceC1996, long j) {
        this.f5996 = c2068;
        this.f5995 = c2031;
        this.f5994 = list;
        this.f5993 = i;
        this.f5992 = z;
        this.f5991 = i2;
        this.f5998 = interfaceC7895;
        this.f5997 = layoutDirection;
        this.f5999 = interfaceC1996;
        this.f6000 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2034)) {
            return false;
        }
        C2034 c2034 = (C2034) obj;
        return AbstractC4394.m8917(this.f5996, c2034.f5996) && AbstractC4394.m8917(this.f5995, c2034.f5995) && AbstractC4394.m8917(this.f5994, c2034.f5994) && this.f5993 == c2034.f5993 && this.f5992 == c2034.f5992 && this.f5991 == c2034.f5991 && AbstractC4394.m8917(this.f5998, c2034.f5998) && this.f5997 == c2034.f5997 && AbstractC4394.m8917(this.f5999, c2034.f5999) && C7897.m13307(this.f6000, c2034.f6000);
    }

    public final int hashCode() {
        return Long.hashCode(this.f6000) + ((this.f5999.hashCode() + ((this.f5997.hashCode() + ((this.f5998.hashCode() + AbstractC0053.m143(this.f5991, AbstractC0053.m140((AbstractC0053.m159(this.f5994, AbstractC6136.m11540(this.f5996.hashCode() * 31, 31, this.f5995), 31) + this.f5993) * 31, 31, this.f5992), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.f5996);
        sb.append(", style=");
        sb.append(this.f5995);
        sb.append(", placeholders=");
        sb.append(this.f5994);
        sb.append(", maxLines=");
        sb.append(this.f5993);
        sb.append(", softWrap=");
        sb.append(this.f5992);
        sb.append(", overflow=");
        int i = this.f5991;
        sb.append((Object) (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.f5998);
        sb.append(", layoutDirection=");
        sb.append(this.f5997);
        sb.append(", fontFamilyResolver=");
        sb.append(this.f5999);
        sb.append(", constraints=");
        sb.append((Object) C7897.m13311(this.f6000));
        sb.append(')');
        return sb.toString();
    }
}
