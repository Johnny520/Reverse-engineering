package p147;

import androidx.activity.AbstractC0053;
import java.math.BigInteger;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.text.AbstractC5143;
import net.bytebuddy.pool.TypePool;
import p116.C7341;

/* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7571 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C7571 f20497;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC5183 f20498 = AbstractC5186.m10210(new C7341(this, 6));

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f20499;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f20500;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f20501;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f20502;

    static {
        new C7571(0, 0, "", 0);
        f20497 = new C7571(0, 1, "", 0);
        new C7571(1, 0, "", 0);
    }

    public C7571(int i, int i2, String str, int i3) {
        this.f20502 = i;
        this.f20500 = i2;
        this.f20501 = i3;
        this.f20499 = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C7571 c7571 = (C7571) obj;
        c7571.getClass();
        Object value = this.f20498.getValue();
        value.getClass();
        Object value2 = c7571.f20498.getValue();
        value2.getClass();
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7571)) {
            return false;
        }
        C7571 c7571 = (C7571) obj;
        return this.f20502 == c7571.f20502 && this.f20500 == c7571.f20500 && this.f20501 == c7571.f20501;
    }

    public final int hashCode() {
        return ((((527 + this.f20502) * 31) + this.f20500) * 31) + this.f20501;
    }

    public final String toString() {
        String str = this.f20499;
        String strConcat = !AbstractC5143.m10164(str) ? "-".concat(str) : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20502);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f20500);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        return AbstractC0053.m147(sb, strConcat, this.f20501);
    }
}
