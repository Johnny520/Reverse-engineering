package p163;

import androidx.activity.AbstractC0900;
import java.math.BigInteger;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.text.AbstractC5976;
import net.bytebuddy.pool.TypePool;
import p132.C8171;

/* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8401 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C8401 f20837;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC6016 f20838 = AbstractC6019.m10773(new C8171(this, 6));

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f20839;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f20840;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f20841;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f20842;

    static {
        new C8401(0, 0, "", 0);
        f20837 = new C8401(0, 1, "", 0);
        new C8401(1, 0, "", 0);
    }

    public C8401(int i, int i2, String str, int i3) {
        this.f20842 = i;
        this.f20840 = i2;
        this.f20841 = i3;
        this.f20839 = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C8401 c8401 = (C8401) obj;
        c8401.getClass();
        Object value = this.f20838.getValue();
        value.getClass();
        Object value2 = c8401.f20838.getValue();
        value2.getClass();
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8401)) {
            return false;
        }
        C8401 c8401 = (C8401) obj;
        return this.f20842 == c8401.f20842 && this.f20840 == c8401.f20840 && this.f20841 == c8401.f20841;
    }

    public final int hashCode() {
        return ((((527 + this.f20842) * 31) + this.f20840) * 31) + this.f20841;
    }

    public final String toString() {
        String str = this.f20839;
        String strConcat = !AbstractC5976.m10731(str) ? "-".concat(str) : "";
        StringBuilder sb = new StringBuilder();
        sb.append(this.f20842);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f20840);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        return AbstractC0900.m707(sb, strConcat, this.f20841);
    }
}
