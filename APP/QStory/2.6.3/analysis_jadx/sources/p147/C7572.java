package p147;

import androidx.activity.AbstractC0053;
import java.math.BigInteger;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.text.AbstractC5144;
import net.bytebuddy.pool.TypePool;
import p116.C7342;

/* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7572 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C7572 f20492;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC5184 f20493 = AbstractC5187.m10214(new C7342(this, 6));

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f20494;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f20495;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f20496;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f20497;

    static {
        new C7572(0, 0, "", 0);
        f20492 = new C7572(0, 1, "", 0);
        new C7572(1, 0, "", 0);
    }

    public C7572(int i, int i2, String str, int i3) {
        this.f20497 = i;
        this.f20495 = i2;
        this.f20496 = i3;
        this.f20494 = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C7572 c7572 = (C7572) obj;
        c7572.getClass();
        Object value = this.f20493.getValue();
        value.getClass();
        Object value2 = c7572.f20493.getValue();
        value2.getClass();
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7572)) {
            return false;
        }
        C7572 c7572 = (C7572) obj;
        return this.f20497 == c7572.f20497 && this.f20495 == c7572.f20495 && this.f20496 == c7572.f20496;
    }

    public final int hashCode() {
        return ((((527 + this.f20497) * 31) + this.f20495) * 31) + this.f20496;
    }

    public final String toString() {
        String str = this.f20494;
        String strConcat = !AbstractC5144.m10172(str) ? "-".concat(str) : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20497);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f20495);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        return AbstractC0053.m147(sb, strConcat, this.f20496);
    }
}
