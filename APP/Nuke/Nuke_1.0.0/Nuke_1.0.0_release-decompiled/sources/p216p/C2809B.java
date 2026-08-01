package p216p;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import p153e1.C2016l;
import p227r.EnumC2983d0;

/* JADX INFO: renamed from: p.B */
/* JADX INFO: loaded from: classes.dex */
public final class C2809B {

    /* JADX INFO: renamed from: a */
    public final Context f8841a;

    /* JADX INFO: renamed from: b */
    public final int f8842b;

    /* JADX INFO: renamed from: c */
    public long f8843c = 0;

    /* JADX INFO: renamed from: d */
    public EdgeEffect f8844d;

    /* JADX INFO: renamed from: e */
    public EdgeEffect f8845e;

    /* JADX INFO: renamed from: f */
    public EdgeEffect f8846f;

    /* JADX INFO: renamed from: g */
    public EdgeEffect f8847g;

    /* JADX INFO: renamed from: h */
    public EdgeEffect f8848h;

    /* JADX INFO: renamed from: i */
    public EdgeEffect f8849i;

    /* JADX INFO: renamed from: j */
    public EdgeEffect f8850j;

    /* JADX INFO: renamed from: k */
    public EdgeEffect f8851k;

    public C2809B(Context context, int i5) {
        this.f8841a = context;
        this.f8842b = i5;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m5007f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m5008g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? AbstractC2853k.m5045b(edgeEffect) : 0.0f) == 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public final EdgeEffect m5009a(EnumC2983d0 enumC2983d0) {
        int i5 = Build.VERSION.SDK_INT;
        Context context = this.f8841a;
        EdgeEffect edgeEffectM5044a = i5 >= 31 ? AbstractC2853k.m5044a(context) : new C2813F(context);
        edgeEffectM5044a.setColor(this.f8842b);
        if (!C2016l.m3704a(this.f8843c, 0L)) {
            if (enumC2983d0 == EnumC2983d0.f9447d) {
                long j5 = this.f8843c;
                edgeEffectM5044a.setSize((int) (j5 >> 32), (int) (j5 & 4294967295L));
                return edgeEffectM5044a;
            }
            long j6 = this.f8843c;
            edgeEffectM5044a.setSize((int) (j6 & 4294967295L), (int) (j6 >> 32));
        }
        return edgeEffectM5044a;
    }

    /* JADX INFO: renamed from: b */
    public final EdgeEffect m5010b() {
        EdgeEffect edgeEffect = this.f8845e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM5009a = m5009a(EnumC2983d0.f9447d);
        this.f8845e = edgeEffectM5009a;
        return edgeEffectM5009a;
    }

    /* JADX INFO: renamed from: c */
    public final EdgeEffect m5011c() {
        EdgeEffect edgeEffect = this.f8846f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM5009a = m5009a(EnumC2983d0.f9448e);
        this.f8846f = edgeEffectM5009a;
        return edgeEffectM5009a;
    }

    /* JADX INFO: renamed from: d */
    public final EdgeEffect m5012d() {
        EdgeEffect edgeEffect = this.f8847g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM5009a = m5009a(EnumC2983d0.f9448e);
        this.f8847g = edgeEffectM5009a;
        return edgeEffectM5009a;
    }

    /* JADX INFO: renamed from: e */
    public final EdgeEffect m5013e() {
        EdgeEffect edgeEffect = this.f8844d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectM5009a = m5009a(EnumC2983d0.f9447d);
        this.f8844d = edgeEffectM5009a;
        return edgeEffectM5009a;
    }
}
