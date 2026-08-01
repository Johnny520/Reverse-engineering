package p308;

import androidx.window.area.AbstractC3400;
import com.android.dex.MethodHandle$MethodHandleType;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9383 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f24213;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f24214;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final MethodHandle$MethodHandleType f24215;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f24216;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C9387 f24217;

    public C9383(C9387 c9387, MethodHandle$MethodHandleType methodHandle$MethodHandleType, int i, int i2, int i3) {
        this.f24217 = c9387;
        this.f24215 = methodHandle$MethodHandleType;
        this.f24216 = i;
        this.f24214 = i2;
        this.f24213 = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C9383 c9383 = (C9383) obj;
        MethodHandle$MethodHandleType methodHandle$MethodHandleType = c9383.f24215;
        MethodHandle$MethodHandleType methodHandle$MethodHandleType2 = this.f24215;
        return methodHandle$MethodHandleType2 != methodHandle$MethodHandleType ? methodHandle$MethodHandleType2.compareTo(methodHandle$MethodHandleType) : AbstractC3400.m5653(this.f24214, c9383.f24214);
    }

    public final String toString() {
        int i = this.f24214;
        C9387 c9387 = this.f24217;
        MethodHandle$MethodHandleType methodHandle$MethodHandleType = this.f24215;
        if (c9387 == null) {
            return methodHandle$MethodHandleType + " " + i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(methodHandle$MethodHandleType);
        sb.append(" ");
        sb.append(methodHandle$MethodHandleType.isField() ? (Comparable) c9387.f24236.get(i) : (Comparable) c9387.f24238.get(i));
        return sb.toString();
    }
}
