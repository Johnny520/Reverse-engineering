package androidx.collection;

import androidx.compose.animation.core.InterfaceC1181;
import androidx.compose.p001ui.graphics.colorspace.C2324;
import androidx.compose.p001ui.graphics.colorspace.InterfaceC2332;
import androidx.compose.runtime.InterfaceC2177;
import androidx.compose.runtime.InterfaceC2187;
import com.alibaba.fastjson2.JSONException;
import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1123 implements InterfaceC1181, InterfaceC2187, InterfaceC2332, InterfaceC2177 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1328;

    public /* synthetic */ C1123(int i) {
        this.f1328 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m1398(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static /* synthetic */ void m1399(int i, String str) {
        throw new JSONException(str + ((char) i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m1400() {
        throw new ConcurrentModificationException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m1401(Object obj, String str) {
        throw new JSONException(str + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m1402(int i, String str) {
        throw new JSONException(str + ((char) i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static /* synthetic */ void m1403(String str, Throwable th) {
        throw new JSONException(str, th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static /* synthetic */ void m1404(int i, String str) {
        throw new JSONException(str + i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static /* synthetic */ void m1405(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m1406(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static /* synthetic */ void m1407(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static /* synthetic */ void m1408(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static /* synthetic */ void m1409(Object obj, String str, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static /* synthetic */ void m1410(String str) {
        throw new JSONException(str);
    }

    @Override // androidx.compose.runtime.InterfaceC2177
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean mo1412() {
        return false;
    }

    @Override // androidx.compose.p001ui.graphics.colorspace.InterfaceC2332
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public double mo1413(double d) {
        switch (this.f1328) {
            case 9:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 10:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 11:
                float[] fArr = C2324.f4561;
                return C2324.m3219(C2324.f4559, d);
            case 12:
                float[] fArr2 = C2324.f4561;
                return C2324.m3220(C2324.f4559, d);
            case 13:
                float[] fArr3 = C2324.f4561;
                return C2324.m3217(C2324.f4558, d);
            case 14:
                float[] fArr4 = C2324.f4561;
                return C2324.m3218(C2324.f4558, d);
            default:
                return d;
        }
    }

    @Override // androidx.compose.runtime.InterfaceC2187
    public void cancel() {
    }

    @Override // androidx.compose.animation.core.InterfaceC1181
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public float mo1411(float f) {
        return f;
    }
}
