package p189n;

import android.view.ViewConfiguration;
import p121i3.InterfaceC3175e;

/* JADX INFO: renamed from: n.t0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5283t0 {

    /* JADX INFO: renamed from: a */
    public static final float f16219a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: b */
    public static final double f16220b;

    /* JADX INFO: renamed from: c */
    public static final double f16221c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f16220b = dLog;
        f16221c = dLog - 1.0d;
    }

    /* JADX INFO: renamed from: b */
    public static final float m21549b(InterfaceC3175e interfaceC3175e, float f10) {
        double density = interfaceC3175e.getDensity() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f10) * 0.35f;
        float f11 = f16219a;
        return (float) (((double) f11) * density * Math.exp((f16220b / f16221c) * Math.log(dAbs / (((double) f11) * density))));
    }
}
