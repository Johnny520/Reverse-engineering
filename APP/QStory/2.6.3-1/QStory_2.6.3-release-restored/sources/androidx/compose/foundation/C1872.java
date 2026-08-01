package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.gestures.Orientation;
import p221.C8735;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1872 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public EdgeEffect f3375;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public EdgeEffect f3376;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public EdgeEffect f3377;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public long f3378 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f3379;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f3380;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public EdgeEffect f3381;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public EdgeEffect f3382;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public EdgeEffect f3383;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public EdgeEffect f3384;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public EdgeEffect f3385;

    public C1872(Context context, int i) {
        this.f3380 = context;
        this.f3379 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean m2497(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static boolean m2498(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? AbstractC1907.m2537(edgeEffect) : 0.0f) == 0.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final EdgeEffect m2499() {
        EdgeEffect edgeEffect = this.f3377;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM2503 = m2503(Orientation.Vertical);
        this.f3377 = edgeEffectM2503;
        return edgeEffectM2503;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final EdgeEffect m2500() {
        EdgeEffect edgeEffect = this.f3382;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM2503 = m2503(Orientation.Horizontal);
        this.f3382 = edgeEffectM2503;
        return edgeEffectM2503;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final EdgeEffect m2501() {
        EdgeEffect edgeEffect = this.f3375;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM2503 = m2503(Orientation.Horizontal);
        this.f3375 = edgeEffectM2503;
        return edgeEffectM2503;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final EdgeEffect m2502() {
        EdgeEffect edgeEffect = this.f3376;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM2503 = m2503(Orientation.Vertical);
        this.f3376 = edgeEffectM2503;
        return edgeEffectM2503;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final EdgeEffect m2503(Orientation orientation) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.f3380;
        EdgeEffect edgeEffectM2538 = i >= 31 ? AbstractC1907.m2538(context) : new C1860(context);
        edgeEffectM2538.setColor(this.f3379);
        if (!C8735.m13916(this.f3378, 0L)) {
            Orientation orientation2 = Orientation.Vertical;
            long j = this.f3378;
            if (orientation == orientation2) {
                edgeEffectM2538.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return edgeEffectM2538;
            }
            edgeEffectM2538.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return edgeEffectM2538;
    }
}
