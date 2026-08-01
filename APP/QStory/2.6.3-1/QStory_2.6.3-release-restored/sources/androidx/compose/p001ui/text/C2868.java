package androidx.compose.p001ui.text;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.text.font.InterfaceC2830;
import androidx.compose.p001ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p221.C8727;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2868 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f6337;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f6338;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f6339;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f6340;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2865 f6341;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2902 f6342;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final LayoutDirection f6343;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC8725 f6344;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC2830 f6345;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long f6346;

    public C2868(C2902 c2902, C2865 c2865, List list, int i, boolean z, int i2, InterfaceC8725 interfaceC8725, LayoutDirection layoutDirection, InterfaceC2830 interfaceC2830, long j) {
        this.f6342 = c2902;
        this.f6341 = c2865;
        this.f6340 = list;
        this.f6339 = i;
        this.f6338 = z;
        this.f6337 = i2;
        this.f6344 = interfaceC8725;
        this.f6343 = layoutDirection;
        this.f6345 = interfaceC2830;
        this.f6346 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2868)) {
            return false;
        }
        C2868 c2868 = (C2868) obj;
        return AbstractC5227.m9466(this.f6342, c2868.f6342) && AbstractC5227.m9466(this.f6341, c2868.f6341) && AbstractC5227.m9466(this.f6340, c2868.f6340) && this.f6339 == c2868.f6339 && this.f6338 == c2868.f6338 && this.f6337 == c2868.f6337 && AbstractC5227.m9466(this.f6344, c2868.f6344) && this.f6343 == c2868.f6343 && AbstractC5227.m9466(this.f6345, c2868.f6345) && C8727.m13894(this.f6346, c2868.f6346);
    }

    public final int hashCode() {
        return Long.hashCode(this.f6346) + ((this.f6345.hashCode() + ((this.f6343.hashCode() + ((this.f6344.hashCode() + AbstractC0900.m704(this.f6337, AbstractC0900.m701((AbstractC0900.m720(this.f6340, AbstractC7012.m12132(this.f6342.hashCode() * 31, 31, this.f6341), 31) + this.f6339) * 31, 31, this.f6338), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.f6342);
        sb.append(", style=");
        sb.append(this.f6341);
        sb.append(", placeholders=");
        sb.append(this.f6340);
        sb.append(", maxLines=");
        sb.append(this.f6339);
        sb.append(", softWrap=");
        sb.append(this.f6338);
        sb.append(", overflow=");
        int i = this.f6337;
        sb.append((Object) (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.f6344);
        sb.append(", layoutDirection=");
        sb.append(this.f6343);
        sb.append(", fontFamilyResolver=");
        sb.append(this.f6345);
        sb.append(", constraints=");
        sb.append((Object) C8727.m13898(this.f6346));
        sb.append(')');
        return sb.toString();
    }
}
