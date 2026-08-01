package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.Orientation;
import p205.C7905;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1034 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public EdgeEffect f3029;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public EdgeEffect f3030;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public EdgeEffect f3031;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public long f3032 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f3033;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f3034;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public EdgeEffect f3035;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public EdgeEffect f3036;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public EdgeEffect f3037;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public EdgeEffect f3038;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public EdgeEffect f3039;

    public C1034(Context context, int i) {
        this.f3034 = context;
        this.f3033 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean m1927(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static boolean m1928(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? AbstractC1069.m1967(edgeEffect) : 0.0f) == 0.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final EdgeEffect m1929() {
        EdgeEffect edgeEffect = this.f3031;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM1933 = m1933(Orientation.Vertical);
        this.f3031 = edgeEffectM1933;
        return edgeEffectM1933;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final EdgeEffect m1930() {
        EdgeEffect edgeEffect = this.f3036;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM1933 = m1933(Orientation.Horizontal);
        this.f3036 = edgeEffectM1933;
        return edgeEffectM1933;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final EdgeEffect m1931() {
        EdgeEffect edgeEffect = this.f3029;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM1933 = m1933(Orientation.Horizontal);
        this.f3029 = edgeEffectM1933;
        return edgeEffectM1933;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final EdgeEffect m1932() {
        EdgeEffect edgeEffect = this.f3030;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM1933 = m1933(Orientation.Vertical);
        this.f3030 = edgeEffectM1933;
        return edgeEffectM1933;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final EdgeEffect m1933(Orientation orientation) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.f3034;
        EdgeEffect edgeEffectM1968 = i >= 31 ? AbstractC1069.m1968(context) : new C1022(context);
        edgeEffectM1968.setColor(this.f3033);
        if (!C7905.m13329(this.f3032, 0L)) {
            Orientation orientation2 = Orientation.Vertical;
            long j = this.f3032;
            if (orientation == orientation2) {
                edgeEffectM1968.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return edgeEffectM1968;
            }
            edgeEffectM1968.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return edgeEffectM1968;
    }
}
