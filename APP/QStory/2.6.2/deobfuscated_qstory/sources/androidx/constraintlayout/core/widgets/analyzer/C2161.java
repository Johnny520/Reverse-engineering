package androidx.constraintlayout.core.widgets.analyzer;

import p203.C7878;
import p203.C7888;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2161 extends AbstractC2154 {
    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo3879() {
        this.f6362.m3869();
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo3880() {
        C7878 c7878 = this.f6360;
        int i = ((C7888) c7878).f21852;
        C2145 c2145 = this.f6362;
        if (i == 1) {
            c7878.f21761 = c2145.f6327;
        } else {
            c7878.f21758 = c2145.f6327;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo3881() {
        C7878 c7878 = this.f6360;
        C7888 c7888 = (C7888) c7878;
        int i = c7888.f21853;
        int i2 = c7888.f21856;
        int i3 = c7888.f21852;
        C2145 c2145 = this.f6362;
        if (i3 == 1) {
            if (i != -1) {
                c2145.f6329.add(c7878.f21694.f21720.f6362);
                this.f6360.f21694.f21720.f6362.f6328.add(c2145);
                c2145.f6320 = i;
            } else if (i2 != -1) {
                c2145.f6329.add(c7878.f21694.f21720.f6364);
                this.f6360.f21694.f21720.f6364.f6328.add(c2145);
                c2145.f6320 = -i2;
            } else {
                c2145.f6324 = true;
                c2145.f6329.add(c7878.f21694.f21720.f6364);
                this.f6360.f21694.f21720.f6364.f6328.add(c2145);
            }
            m3909(this.f6360.f21720.f6362);
            m3909(this.f6360.f21720.f6364);
            return;
        }
        if (i != -1) {
            c2145.f6329.add(c7878.f21694.f21719.f6362);
            this.f6360.f21694.f21719.f6362.f6328.add(c2145);
            c2145.f6320 = i;
        } else if (i2 != -1) {
            c2145.f6329.add(c7878.f21694.f21719.f6364);
            this.f6360.f21694.f21719.f6364.f6328.add(c2145);
            c2145.f6320 = -i2;
        } else {
            c2145.f6324 = true;
            c2145.f6329.add(c7878.f21694.f21719.f6364);
            this.f6360.f21694.f21719.f6364.f6328.add(c2145);
        }
        m3909(this.f6360.f21719.f6362);
        m3909(this.f6360.f21719.f6364);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.InterfaceC2147
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo3871(InterfaceC2147 interfaceC2147) {
        C2145 c2145 = this.f6362;
        if (c2145.f6323 && !c2145.f6331) {
            c2145.mo3868((int) ((((C2145) c2145.f6329.get(0)).f6327 * ((C7888) this.f6360).f21854) + 0.5f));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m3909(C2145 c2145) {
        C2145 c21452 = this.f6362;
        c21452.f6328.add(c2145);
        c2145.f6329.add(c21452);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.AbstractC2154
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo3884() {
        return false;
    }
}
