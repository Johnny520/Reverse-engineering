package p000;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: er */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0182er {

    /* JADX INFO: renamed from: a */
    public final Context f1510a;

    /* JADX INFO: renamed from: b */
    public final int f1511b;

    /* JADX INFO: renamed from: c */
    public long f1512c = 0;

    /* JADX INFO: renamed from: d */
    public EdgeEffect f1513d;

    /* JADX INFO: renamed from: e */
    public EdgeEffect f1514e;

    /* JADX INFO: renamed from: f */
    public EdgeEffect f1515f;

    /* JADX INFO: renamed from: g */
    public EdgeEffect f1516g;

    /* JADX INFO: renamed from: h */
    public EdgeEffect f1517h;

    /* JADX INFO: renamed from: i */
    public EdgeEffect f1518i;

    /* JADX INFO: renamed from: j */
    public EdgeEffect f1519j;

    /* JADX INFO: renamed from: k */
    public EdgeEffect f1520k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0182er(Context context, int i) {
        this.f1510a = context;
        this.f1511b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m959f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m960g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? AbstractC0463m8.m2446c(edgeEffect) : 0.0f) == 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final EdgeEffect m961a(um0 um0Var) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.f1510a;
        EdgeEffect edgeEffectM2444a = i >= 31 ? AbstractC0463m8.m2444a(context) : new C0743sx(context);
        edgeEffectM2444a.setColor(this.f1511b);
        if (!d30.m628a(this.f1512c, 0L)) {
            long j = this.f1512c;
            if (um0Var == um0.f6264d) {
                edgeEffectM2444a.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return edgeEffectM2444a;
            }
            edgeEffectM2444a.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return edgeEffectM2444a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final EdgeEffect m962b() {
        EdgeEffect edgeEffect = this.f1514e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM961a = m961a(um0.f6264d);
        this.f1514e = edgeEffectM961a;
        return edgeEffectM961a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final EdgeEffect m963c() {
        EdgeEffect edgeEffect = this.f1515f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM961a = m961a(um0.f6265e);
        this.f1515f = edgeEffectM961a;
        return edgeEffectM961a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final EdgeEffect m964d() {
        EdgeEffect edgeEffect = this.f1516g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM961a = m961a(um0.f6265e);
        this.f1516g = edgeEffectM961a;
        return edgeEffectM961a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final EdgeEffect m965e() {
        EdgeEffect edgeEffect = this.f1513d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM961a = m961a(um0.f6264d);
        this.f1513d = edgeEffectM961a;
        return edgeEffectM961a;
    }
}
