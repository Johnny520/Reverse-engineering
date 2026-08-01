package androidx.appcompat.widget;

import androidx.core.view.InterfaceC2283;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0190 implements InterfaceC2283 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f743;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f744;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f745;

    public C0190(AbstractC4878 abstractC4878, int i, boolean z) {
        this.f743 = abstractC4878;
        this.f745 = i;
        this.f744 = z;
    }

    @Override // androidx.core.view.InterfaceC2283
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo324() {
        if (this.f744) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f743;
        actionBarContextView.f413 = null;
        super/*android.view.View*/.setVisibility(this.f745);
    }

    @Override // androidx.core.view.InterfaceC2283
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo325() {
        super/*android.view.View*/.setVisibility(0);
        this.f744 = false;
    }

    @Override // androidx.core.view.InterfaceC2283
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo608() {
        this.f744 = true;
    }
}
