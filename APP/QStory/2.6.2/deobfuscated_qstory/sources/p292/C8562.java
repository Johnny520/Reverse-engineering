package p292;

import com.android.dex.MethodHandle$MethodHandleType;
import p316.C8675;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8562 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f23877;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f23878;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final MethodHandle$MethodHandleType f23879;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f23880;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8566 f23881;

    public C8562(C8566 c8566, MethodHandle$MethodHandleType methodHandle$MethodHandleType, int i, int i2, int i3) {
        this.f23881 = c8566;
        this.f23879 = methodHandle$MethodHandleType;
        this.f23880 = i;
        this.f23878 = i2;
        this.f23877 = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C8562 c8562 = (C8562) obj;
        MethodHandle$MethodHandleType methodHandle$MethodHandleType = c8562.f23879;
        MethodHandle$MethodHandleType methodHandle$MethodHandleType2 = this.f23879;
        return methodHandle$MethodHandleType2 != methodHandle$MethodHandleType ? methodHandle$MethodHandleType2.compareTo(methodHandle$MethodHandleType) : C8675.m14367(this.f23878, c8562.f23878);
    }

    public final String toString() {
        int i = this.f23878;
        C8566 c8566 = this.f23881;
        MethodHandle$MethodHandleType methodHandle$MethodHandleType = this.f23879;
        if (c8566 == null) {
            return methodHandle$MethodHandleType + " " + i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(methodHandle$MethodHandleType);
        sb.append(" ");
        sb.append(methodHandle$MethodHandleType.isField() ? (Comparable) c8566.f23900.get(i) : (Comparable) c8566.f23902.get(i));
        return sb.toString();
    }
}
