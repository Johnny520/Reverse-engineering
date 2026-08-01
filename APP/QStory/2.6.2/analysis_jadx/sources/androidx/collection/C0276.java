package androidx.collection;

import androidx.compose.animation.core.InterfaceC0335;
import androidx.compose.runtime.InterfaceC1342;
import androidx.compose.runtime.InterfaceC1352;
import androidx.compose.ui.graphics.colorspace.C1489;
import androidx.compose.ui.graphics.colorspace.InterfaceC1497;
import com.alibaba.fastjson2.JSONException;
import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0276 implements InterfaceC0335, InterfaceC1352, InterfaceC1497, InterfaceC1342 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f983;

    public /* synthetic */ C0276(int i) {
        this.f983 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m837(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m838(int i, String str) {
        throw new JSONException(str + ((char) i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m839() {
        throw new ConcurrentModificationException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static /* synthetic */ void m840(Object obj, String str) {
        throw new JSONException(str + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static /* synthetic */ void m841(int i, String str) {
        throw new JSONException(str + ((char) i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static /* synthetic */ void m842(String str, Throwable th) {
        throw new JSONException(str, th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static /* synthetic */ void m843(int i, String str) {
        throw new JSONException(str + i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static /* synthetic */ void m844(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m845(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static /* synthetic */ void m846(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static /* synthetic */ void m847(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static /* synthetic */ void m848(Object obj, String str, Object obj2) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static /* synthetic */ void m849(String str) {
        throw new JSONException(str);
    }

    @Override // androidx.compose.runtime.InterfaceC1342
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean mo851() {
        return false;
    }

    @Override // androidx.compose.ui.graphics.colorspace.InterfaceC1497
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public double mo852(double d) {
        switch (this.f983) {
            case 9:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 10:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 11:
                float[] fArr = C1489.f4215;
                return C1489.m2649(C1489.f4213, d);
            case 12:
                float[] fArr2 = C1489.f4215;
                return C1489.m2650(C1489.f4213, d);
            case 13:
                float[] fArr3 = C1489.f4215;
                return C1489.m2647(C1489.f4212, d);
            case 14:
                float[] fArr4 = C1489.f4215;
                return C1489.m2648(C1489.f4212, d);
            default:
                return d;
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1352
    public void cancel() {
    }

    @Override // androidx.compose.animation.core.InterfaceC0335
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float mo850(float f) {
        return f;
    }
}
