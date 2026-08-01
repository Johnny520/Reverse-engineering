package androidx.core.view;

import android.view.WindowInsets;
import p164.C7665;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2234 extends AbstractC2223 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final WindowInsets.Builder f6529;

    public C2234(C2225 c2225) {
        super(c2225);
        WindowInsets windowInsetsM4069 = c2225.m4069();
        this.f6529 = windowInsetsM4069 != null ? AbstractC2230.m4128(windowInsetsM4069) : AbstractC2230.m4109();
    }

    @Override // androidx.core.view.AbstractC2223
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo4054(C7665 c7665) {
        this.f6529.setStableInsets(c7665.m12942());
    }

    @Override // androidx.core.view.AbstractC2223
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo4055(C7665 c7665) {
        this.f6529.setMandatorySystemGestureInsets(c7665.m12942());
    }

    @Override // androidx.core.view.AbstractC2223
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C2225 mo4056() {
        m4057();
        C2225 c2225M4063 = C2225.m4063(null, this.f6529.build());
        C7665[] c7665Arr = this.f6518;
        C2238 c2238 = c2225M4063.f6521;
        c2238.mo4043(c7665Arr);
        c2238.mo4046(null);
        c2238.mo4035(this.f6517);
        c2238.mo4034(this.f6516);
        return c2225M4063;
    }

    @Override // androidx.core.view.AbstractC2223
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public void mo4058(C7665 c7665) {
        this.f6529.setSystemWindowInsets(c7665.m12942());
    }

    @Override // androidx.core.view.AbstractC2223
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public void mo4059(C7665 c7665) {
        this.f6529.setSystemGestureInsets(c7665.m12942());
    }

    @Override // androidx.core.view.AbstractC2223
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public void mo4060(C7665 c7665) {
        this.f6529.setTappableElementInsets(c7665.m12942());
    }

    public C2234() {
        this.f6529 = AbstractC2230.m4109();
    }
}
