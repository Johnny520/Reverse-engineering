package p000;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class jd0 {

    /* JADX INFO: renamed from: a */
    public final Context f4969a;

    /* JADX INFO: renamed from: b */
    public final int f4970b;

    /* JADX INFO: renamed from: c */
    public long f4971c = 0;

    /* JADX INFO: renamed from: d */
    public EdgeEffect f4972d;

    /* JADX INFO: renamed from: e */
    public EdgeEffect f4973e;

    /* JADX INFO: renamed from: f */
    public EdgeEffect f4974f;

    /* JADX INFO: renamed from: g */
    public EdgeEffect f4975g;

    /* JADX INFO: renamed from: h */
    public EdgeEffect f4976h;

    /* JADX INFO: renamed from: i */
    public EdgeEffect f4977i;

    /* JADX INFO: renamed from: j */
    public EdgeEffect f4978j;

    /* JADX INFO: renamed from: k */
    public EdgeEffect f4979k;

    public jd0(Context context, int i) {
        this.f4969a = context;
        this.f4970b = i;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m2482f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2483g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? AbstractC0495ne.m3288c(edgeEffect) : 0.0f) == 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public final EdgeEffect m2484a(qv1 qv1Var) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.f4969a;
        EdgeEffect edgeEffectM3286a = i >= 31 ? AbstractC0495ne.m3286a(context) : new jq0(context);
        edgeEffectM3286a.setColor(this.f4970b);
        if (!h11.m2041a(this.f4971c, 0L)) {
            long j = this.f4971c;
            if (qv1Var == qv1.f9205h) {
                edgeEffectM3286a.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return edgeEffectM3286a;
            }
            edgeEffectM3286a.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return edgeEffectM3286a;
    }

    /* JADX INFO: renamed from: b */
    public final EdgeEffect m2485b() {
        EdgeEffect edgeEffect = this.f4973e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM2484a = m2484a(qv1.f9205h);
        this.f4973e = edgeEffectM2484a;
        return edgeEffectM2484a;
    }

    /* JADX INFO: renamed from: c */
    public final EdgeEffect m2486c() {
        EdgeEffect edgeEffect = this.f4974f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM2484a = m2484a(qv1.f9206i);
        this.f4974f = edgeEffectM2484a;
        return edgeEffectM2484a;
    }

    /* JADX INFO: renamed from: d */
    public final EdgeEffect m2487d() {
        EdgeEffect edgeEffect = this.f4975g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM2484a = m2484a(qv1.f9206i);
        this.f4975g = edgeEffectM2484a;
        return edgeEffectM2484a;
    }

    /* JADX INFO: renamed from: e */
    public final EdgeEffect m2488e() {
        EdgeEffect edgeEffect = this.f4972d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM2484a = m2484a(qv1.f9205h);
        this.f4972d = edgeEffectM2484a;
        return edgeEffectM2484a;
    }
}
