package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.Orientation;
import p205.C7906;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1034 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public EdgeEffect f3030;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public EdgeEffect f3031;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public EdgeEffect f3032;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public long f3033 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f3034;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f3035;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public EdgeEffect f3036;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public EdgeEffect f3037;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public EdgeEffect f3038;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public EdgeEffect f3039;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public EdgeEffect f3040;

    public C1034(Context context, int i) {
        this.f3035 = context;
        this.f3034 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean m1937(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static boolean m1938(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? AbstractC1069.m1977(edgeEffect) : 0.0f) == 0.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final EdgeEffect m1939() {
        EdgeEffect edgeEffect = this.f3032;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM1943 = m1943(Orientation.Vertical);
        this.f3032 = edgeEffectM1943;
        return edgeEffectM1943;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final EdgeEffect m1940() {
        EdgeEffect edgeEffect = this.f3037;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM1943 = m1943(Orientation.Horizontal);
        this.f3037 = edgeEffectM1943;
        return edgeEffectM1943;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final EdgeEffect m1941() {
        EdgeEffect edgeEffect = this.f3030;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM1943 = m1943(Orientation.Horizontal);
        this.f3030 = edgeEffectM1943;
        return edgeEffectM1943;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final EdgeEffect m1942() {
        EdgeEffect edgeEffect = this.f3031;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM1943 = m1943(Orientation.Vertical);
        this.f3031 = edgeEffectM1943;
        return edgeEffectM1943;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final EdgeEffect m1943(Orientation orientation) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.f3035;
        EdgeEffect edgeEffectM1978 = i >= 31 ? AbstractC1069.m1978(context) : new C1022(context);
        edgeEffectM1978.setColor(this.f3034);
        if (!C7906.m13357(this.f3033, 0L)) {
            Orientation orientation2 = Orientation.Vertical;
            long j = this.f3033;
            if (orientation == orientation2) {
                edgeEffectM1978.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return edgeEffectM1978;
            }
            edgeEffectM1978.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return edgeEffectM1978;
    }
}
