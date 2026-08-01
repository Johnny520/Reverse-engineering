package p335x2;

import android.os.Build;
import android.text.StaticLayout;

/* JADX INFO: renamed from: x2.p0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9350p0 implements InterfaceC9319d1 {
    @Override // p335x2.InterfaceC9319d1
    /* JADX INFO: renamed from: a */
    public StaticLayout mo36296a(C9322e1 c9322e1) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(c9322e1.m36320r(), c9322e1.m36319q(), c9322e1.m36307e(), c9322e1.m36317o(), c9322e1.m36323u());
        builderObtain.setTextDirection(c9322e1.m36321s());
        builderObtain.setAlignment(c9322e1.m36303a());
        builderObtain.setMaxLines(c9322e1.m36316n());
        builderObtain.setEllipsize(c9322e1.m36305c());
        builderObtain.setEllipsizedWidth(c9322e1.m36306d());
        builderObtain.setLineSpacing(c9322e1.m36314l(), c9322e1.m36315m());
        builderObtain.setIncludePad(c9322e1.m36309g());
        builderObtain.setBreakStrategy(c9322e1.m36304b());
        builderObtain.setHyphenationFrequency(c9322e1.m36308f());
        builderObtain.setIndents(c9322e1.m36311i(), c9322e1.m36318p());
        C9352q0.m36450a(builderObtain, c9322e1.m36310h());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            C9356s0.m36454a(builderObtain, c9322e1.m36322t());
        }
        if (i10 >= 33) {
            C9370z0.m36479b(builderObtain, c9322e1.m36312j(), c9322e1.m36313k());
        }
        if (i10 >= 35) {
            C9313b1.m36287a(builderObtain);
        }
        return builderObtain.build();
    }

    @Override // p335x2.InterfaceC9319d1
    /* JADX INFO: renamed from: b */
    public boolean mo36297b(StaticLayout staticLayout, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return C9370z0.m36478a(staticLayout);
        }
        if (i10 >= 28) {
            return z10;
        }
        return false;
    }
}
