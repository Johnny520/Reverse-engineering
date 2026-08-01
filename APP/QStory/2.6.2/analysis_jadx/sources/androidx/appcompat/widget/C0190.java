package androidx.appcompat.widget;

import androidx.core.view.InterfaceC2283;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0190 implements InterfaceC2283 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f743;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f744;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f745;

    public C0190(AbstractC4877 abstractC4877, int i, boolean z) {
        this.f743 = abstractC4877;
        this.f745 = i;
        this.f744 = z;
    }

    @Override // androidx.core.view.InterfaceC2283
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo323() {
        if (this.f744) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f743;
        actionBarContextView.f413 = null;
        super/*android.view.View*/.setVisibility(this.f745);
    }

    @Override // androidx.core.view.InterfaceC2283
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo324() {
        super/*android.view.View*/.setVisibility(0);
        this.f744 = false;
    }

    @Override // androidx.core.view.InterfaceC2283
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo607() {
        this.f744 = true;
    }
}
