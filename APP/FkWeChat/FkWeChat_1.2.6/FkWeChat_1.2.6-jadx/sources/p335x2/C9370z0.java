package p335x2;

import android.text.StaticLayout;

/* JADX INFO: renamed from: x2.z0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9370z0 {

    /* JADX INFO: renamed from: a */
    public static final C9370z0 f31955a = new C9370z0();

    /* JADX INFO: renamed from: a */
    public static final boolean m36478a(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    /* JADX INFO: renamed from: b */
    public static final void m36479b(StaticLayout.Builder builder, int i10, int i11) {
        builder.setLineBreakConfig(AbstractC9358t0.m36456a().setLineBreakStyle(i10).setLineBreakWordStyle(i11).build());
    }
}
