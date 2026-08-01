package androidx.appcompat.widget;

import androidx.core.view.InterfaceC3116;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1037 implements InterfaceC3116 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f1088;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f1089;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f1090;

    public C1037(AbstractC5710 abstractC5710, int i, boolean z) {
        this.f1088 = abstractC5710;
        this.f1090 = i;
        this.f1089 = z;
    }

    @Override // androidx.core.view.InterfaceC3116
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo884() {
        if (this.f1089) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f1088;
        actionBarContextView.f758 = null;
        super/*android.view.View*/.setVisibility(this.f1090);
    }

    @Override // androidx.core.view.InterfaceC3116
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo885() {
        super/*android.view.View*/.setVisibility(0);
        this.f1089 = false;
    }

    @Override // androidx.core.view.InterfaceC3116
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo1168() {
        this.f1089 = true;
    }
}
