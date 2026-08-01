package androidx.fragment.app;

import android.view.View;
import lin.xposed.hook.javaplugin.C5554;
import p251.AbstractC8175;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2341 extends AbstractC8175 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ AbstractComponentCallbacksC2338 f6925;

    public C2341(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        this.f6925 = abstractComponentCallbacksC2338;
    }

    @Override // p251.AbstractC8175
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final boolean mo4416() {
        return this.f6925.f6881 != null;
    }

    @Override // p251.AbstractC8175
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final View mo4417(int i) {
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6925;
        View view = abstractComponentCallbacksC2338.f6881;
        if (view != null) {
            return view.findViewById(i);
        }
        C5554.m10883(abstractComponentCallbacksC2338, "Fragment ", " does not have a view");
        return null;
    }
}
