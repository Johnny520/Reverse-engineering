package androidx.fragment.app;

import android.view.View;
import lin.xposed.hook.javaplugin.C5553;
import p392.AbstractC9124;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2341 extends AbstractC9124 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractComponentCallbacksC2338 f6924;

    public C2341(AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338) {
        this.f6924 = abstractComponentCallbacksC2338;
    }

    @Override // p392.AbstractC9124
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final boolean mo4406() {
        return this.f6924.f6880 != null;
    }

    @Override // p392.AbstractC9124
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final View mo4407(int i) {
        AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338 = this.f6924;
        View view = abstractComponentCallbacksC2338.f6880;
        if (view != null) {
            return view.findViewById(i);
        }
        C5553.m10826(abstractComponentCallbacksC2338, "Fragment ", " does not have a view");
        return null;
    }
}
