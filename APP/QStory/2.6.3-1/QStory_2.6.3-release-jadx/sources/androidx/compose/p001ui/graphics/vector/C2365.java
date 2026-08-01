package androidx.compose.p001ui.graphics.vector;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.graphics.AbstractC2433;
import java.util.List;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2365 extends AbstractC2373 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final float f4775;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final float f4776;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final float f4777;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final float f4778;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final int f4779;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final float f4780;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC2433 f4781;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final float f4782;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int f4783;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC2433 f4784;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final float f4785;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f4786;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f4787;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f4788;

    public C2365(String str, List list, int i, AbstractC2433 abstractC2433, float f, AbstractC2433 abstractC24332, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.f4788 = str;
        this.f4786 = list;
        this.f4787 = i;
        this.f4781 = abstractC2433;
        this.f4780 = f;
        this.f4784 = abstractC24332;
        this.f4785 = f2;
        this.f4782 = f3;
        this.f4783 = i2;
        this.f4779 = i3;
        this.f4778 = f4;
        this.f4777 = f5;
        this.f4776 = f6;
        this.f4775 = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2365.class != obj.getClass()) {
            return false;
        }
        C2365 c2365 = (C2365) obj;
        return this.f4788.equals(c2365.f4788) && AbstractC5227.m9466(this.f4781, c2365.f4781) && this.f4780 == c2365.f4780 && AbstractC5227.m9466(this.f4784, c2365.f4784) && this.f4785 == c2365.f4785 && this.f4782 == c2365.f4782 && this.f4783 == c2365.f4783 && this.f4779 == c2365.f4779 && this.f4778 == c2365.f4778 && this.f4777 == c2365.f4777 && this.f4776 == c2365.f4776 && this.f4775 == c2365.f4775 && this.f4787 == c2365.f4787 && AbstractC5227.m9466(this.f4786, c2365.f4786);
    }

    public final int hashCode() {
        int iM720 = AbstractC0900.m720(this.f4786, this.f4788.hashCode() * 31, 31);
        AbstractC2433 abstractC2433 = this.f4781;
        int iM705 = AbstractC0900.m705((iM720 + (abstractC2433 != null ? abstractC2433.hashCode() : 0)) * 31, this.f4780, 31);
        AbstractC2433 abstractC24332 = this.f4784;
        return Integer.hashCode(this.f4787) + AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m704(this.f4779, AbstractC0900.m704(this.f4783, AbstractC0900.m705(AbstractC0900.m705((iM705 + (abstractC24332 != null ? abstractC24332.hashCode() : 0)) * 31, this.f4785, 31), this.f4782, 31), 31), 31), this.f4778, 31), this.f4777, 31), this.f4776, 31), this.f4775, 31);
    }
}
