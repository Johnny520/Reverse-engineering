package p144k;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import p174m.EnumC2640p1;
import p293u2.C4242l;

/* JADX INFO: renamed from: k.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2172g0 {

    /* JADX INFO: renamed from: a */
    public final Context f7209a;

    /* JADX INFO: renamed from: b */
    public final int f7210b;

    /* JADX INFO: renamed from: c */
    public long f7211c = 0;

    /* JADX INFO: renamed from: d */
    public EdgeEffect f7212d;

    /* JADX INFO: renamed from: e */
    public EdgeEffect f7213e;

    /* JADX INFO: renamed from: f */
    public EdgeEffect f7214f;

    /* JADX INFO: renamed from: g */
    public EdgeEffect f7215g;

    /* JADX INFO: renamed from: h */
    public EdgeEffect f7216h;

    /* JADX INFO: renamed from: i */
    public EdgeEffect f7217i;

    /* JADX INFO: renamed from: j */
    public EdgeEffect f7218j;

    /* JADX INFO: renamed from: k */
    public EdgeEffect f7219k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2172g0(Context context, int i9) {
        this.f7209a = context;
        this.f7210b = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m5399f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m5400g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? AbstractC2186l.m5421b(edgeEffect) : 0.0f) == 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final EdgeEffect m5401a(EnumC2640p1 enumC2640p1) {
        int i9 = Build.VERSION.SDK_INT;
        Context context = this.f7209a;
        EdgeEffect edgeEffectM5420a = i9 >= 31 ? AbstractC2186l.m5420a(context) : new C2190m0(context);
        edgeEffectM5420a.setColor(this.f7210b);
        if (!C4242l.m8534a(this.f7211c, 0L)) {
            long j3 = this.f7211c;
            if (enumC2640p1 == EnumC2640p1.f8622g) {
                edgeEffectM5420a.setSize((int) (j3 >> 32), (int) (j3 & 4294967295L));
                return edgeEffectM5420a;
            }
            edgeEffectM5420a.setSize((int) (4294967295L & j3), (int) (j3 >> 32));
        }
        return edgeEffectM5420a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final EdgeEffect m5402b() {
        EdgeEffect edgeEffect = this.f7213e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM5401a = m5401a(EnumC2640p1.f8622g);
        this.f7213e = edgeEffectM5401a;
        return edgeEffectM5401a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final EdgeEffect m5403c() {
        EdgeEffect edgeEffect = this.f7214f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM5401a = m5401a(EnumC2640p1.f8623h);
        this.f7214f = edgeEffectM5401a;
        return edgeEffectM5401a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final EdgeEffect m5404d() {
        EdgeEffect edgeEffect = this.f7215g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM5401a = m5401a(EnumC2640p1.f8623h);
        this.f7215g = edgeEffectM5401a;
        return edgeEffectM5401a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final EdgeEffect m5405e() {
        EdgeEffect edgeEffect = this.f7212d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM5401a = m5401a(EnumC2640p1.f8622g);
        this.f7212d = edgeEffectM5401a;
        return edgeEffectM5401a;
    }
}
