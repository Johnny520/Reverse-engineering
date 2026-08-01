package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.graphics.AbstractC1598;
import java.util.List;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1530 extends AbstractC1538 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final float f4429;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final float f4430;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final float f4431;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final float f4432;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final int f4433;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final float f4434;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC1598 f4435;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final float f4436;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final int f4437;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC1598 f4438;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final float f4439;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f4440;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f4441;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f4442;

    public C1530(String str, List list, int i, AbstractC1598 abstractC1598, float f, AbstractC1598 abstractC15982, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.f4442 = str;
        this.f4440 = list;
        this.f4441 = i;
        this.f4435 = abstractC1598;
        this.f4434 = f;
        this.f4438 = abstractC15982;
        this.f4439 = f2;
        this.f4436 = f3;
        this.f4437 = i2;
        this.f4433 = i3;
        this.f4432 = f4;
        this.f4431 = f5;
        this.f4430 = f6;
        this.f4429 = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1530.class != obj.getClass()) {
            return false;
        }
        C1530 c1530 = (C1530) obj;
        return this.f4442.equals(c1530.f4442) && AbstractC4394.m8917(this.f4435, c1530.f4435) && this.f4434 == c1530.f4434 && AbstractC4394.m8917(this.f4438, c1530.f4438) && this.f4439 == c1530.f4439 && this.f4436 == c1530.f4436 && this.f4437 == c1530.f4437 && this.f4433 == c1530.f4433 && this.f4432 == c1530.f4432 && this.f4431 == c1530.f4431 && this.f4430 == c1530.f4430 && this.f4429 == c1530.f4429 && this.f4441 == c1530.f4441 && AbstractC4394.m8917(this.f4440, c1530.f4440);
    }

    public final int hashCode() {
        int iM159 = AbstractC0053.m159(this.f4440, this.f4442.hashCode() * 31, 31);
        AbstractC1598 abstractC1598 = this.f4435;
        int iM144 = AbstractC0053.m144((iM159 + (abstractC1598 != null ? abstractC1598.hashCode() : 0)) * 31, this.f4434, 31);
        AbstractC1598 abstractC15982 = this.f4438;
        return Integer.hashCode(this.f4441) + AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m143(this.f4433, AbstractC0053.m143(this.f4437, AbstractC0053.m144(AbstractC0053.m144((iM144 + (abstractC15982 != null ? abstractC15982.hashCode() : 0)) * 31, this.f4439, 31), this.f4436, 31), 31), 31), this.f4432, 31), this.f4431, 31), this.f4430, 31), this.f4429, 31);
    }
}
