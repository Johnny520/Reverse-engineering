package androidx.fragment.app;

import android.view.View;
import lin.xposed.hook.javaplugin.C6385;
import p267.AbstractC9004;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3174 extends AbstractC9004 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractComponentCallbacksC3171 f7270;

    public C3174(AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171) {
        this.f7270 = abstractComponentCallbacksC3171;
    }

    @Override // p267.AbstractC9004
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final boolean mo4976() {
        return this.f7270.f7226 != null;
    }

    @Override // p267.AbstractC9004
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final View mo4977(int i) {
        AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171 = this.f7270;
        View view = abstractComponentCallbacksC3171.f7226;
        if (view != null) {
            return view.findViewById(i);
        }
        C6385.m11442(abstractComponentCallbacksC3171, "Fragment ", " does not have a view");
        return null;
    }
}
