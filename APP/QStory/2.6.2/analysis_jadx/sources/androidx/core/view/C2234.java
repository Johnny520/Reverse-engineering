package androidx.core.view;

import android.view.WindowInsets;
import p164.C7664;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2234 extends AbstractC2223 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final WindowInsets.Builder f6528;

    public C2234(C2225 c2225) {
        super(c2225);
        WindowInsets windowInsetsM4059 = c2225.m4059();
        this.f6528 = windowInsetsM4059 != null ? AbstractC2230.m4118(windowInsetsM4059) : AbstractC2230.m4099();
    }

    @Override // androidx.core.view.AbstractC2223
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo4044(C7664 c7664) {
        this.f6528.setStableInsets(c7664.m12913());
    }

    @Override // androidx.core.view.AbstractC2223
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo4045(C7664 c7664) {
        this.f6528.setMandatorySystemGestureInsets(c7664.m12913());
    }

    @Override // androidx.core.view.AbstractC2223
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C2225 mo4046() {
        m4047();
        C2225 c2225M4053 = C2225.m4053(null, this.f6528.build());
        C7664[] c7664Arr = this.f6517;
        C2238 c2238 = c2225M4053.f6520;
        c2238.mo4033(c7664Arr);
        c2238.mo4036(null);
        c2238.mo4025(this.f6516);
        c2238.mo4024(this.f6515);
        return c2225M4053;
    }

    @Override // androidx.core.view.AbstractC2223
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo4048(C7664 c7664) {
        this.f6528.setSystemWindowInsets(c7664.m12913());
    }

    @Override // androidx.core.view.AbstractC2223
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public void mo4049(C7664 c7664) {
        this.f6528.setSystemGestureInsets(c7664.m12913());
    }

    @Override // androidx.core.view.AbstractC2223
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public void mo4050(C7664 c7664) {
        this.f6528.setTappableElementInsets(c7664.m12913());
    }

    public C2234() {
        this.f6528 = AbstractC2230.m4099();
    }
}
