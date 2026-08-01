package p189n;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import p049d9.AbstractC1927c;
import p121i3.InterfaceC3175e;

/* JADX INFO: renamed from: n.s0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5278s0 {

    /* JADX INFO: renamed from: a */
    public static final C5278s0 f16212a = new C5278s0();

    /* JADX INFO: renamed from: a */
    public final float m21542a(EdgeEffect edgeEffect, float f10, float f11, InterfaceC3175e interfaceC3175e) {
        if (AbstractC5283t0.m21549b(interfaceC3175e, f10) > m21544c(edgeEffect) * f11) {
            return 0.0f;
        }
        m21545d(edgeEffect, AbstractC1927c.m6980d(f10));
        return f10;
    }

    /* JADX INFO: renamed from: b */
    public final EdgeEffect m21543b(Context context) {
        return Build.VERSION.SDK_INT >= 31 ? C5217g.f16019a.m21393a(context, null) : new C5194b1(context);
    }

    /* JADX INFO: renamed from: c */
    public final float m21544c(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C5217g.f16019a.m21394b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public final void m21545d(EdgeEffect edgeEffect, int i10) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i10);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i10);
        }
    }

    /* JADX INFO: renamed from: e */
    public final float m21546e(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C5217g.f16019a.m21395c(edgeEffect, f10, f11);
        }
        edgeEffect.onPull(f10, f11);
        return f10;
    }

    /* JADX INFO: renamed from: f */
    public final void m21547f(EdgeEffect edgeEffect, float f10) {
        if (edgeEffect instanceof C5194b1) {
            ((C5194b1) edgeEffect).m21290a(f10);
        } else {
            edgeEffect.onRelease();
        }
    }
}
