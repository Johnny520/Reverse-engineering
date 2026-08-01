package p292;

import androidx.window.area.AbstractC2567;
import com.android.dex.MethodHandle$MethodHandleType;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8554 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f23868;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f23869;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final MethodHandle$MethodHandleType f23870;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f23871;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8558 f23872;

    public C8554(C8558 c8558, MethodHandle$MethodHandleType methodHandle$MethodHandleType, int i, int i2, int i3) {
        this.f23872 = c8558;
        this.f23870 = methodHandle$MethodHandleType;
        this.f23871 = i;
        this.f23869 = i2;
        this.f23868 = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C8554 c8554 = (C8554) obj;
        MethodHandle$MethodHandleType methodHandle$MethodHandleType = c8554.f23870;
        MethodHandle$MethodHandleType methodHandle$MethodHandleType2 = this.f23870;
        return methodHandle$MethodHandleType2 != methodHandle$MethodHandleType ? methodHandle$MethodHandleType2.compareTo(methodHandle$MethodHandleType) : AbstractC2567.m5093(this.f23869, c8554.f23869);
    }

    public final String toString() {
        int i = this.f23869;
        C8558 c8558 = this.f23872;
        MethodHandle$MethodHandleType methodHandle$MethodHandleType = this.f23870;
        if (c8558 == null) {
            return methodHandle$MethodHandleType + " " + i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(methodHandle$MethodHandleType);
        sb.append(" ");
        sb.append(methodHandle$MethodHandleType.isField() ? (Comparable) c8558.f23891.get(i) : (Comparable) c8558.f23893.get(i));
        return sb.toString();
    }
}
