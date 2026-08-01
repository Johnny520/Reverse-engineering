package p000;

import android.view.View;

/* JADX INFO: renamed from: ml */
/* JADX INFO: loaded from: classes.dex */
public final class C0489ml extends AbstractC0259gf {

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractComponentCallbacksC0563ol f3157y;

    public C0489ml(AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol) {
        this.f3157y = abstractComponentCallbacksC0563ol;
    }

    @Override // p000.AbstractC0259gf
    /* JADX INFO: renamed from: K */
    public final View mo1264K(int i) {
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = this.f3157y;
        View view = abstractComponentCallbacksC0563ol.f3474E;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0563ol + " does not have a view");
    }

    @Override // p000.AbstractC0259gf
    /* JADX INFO: renamed from: L */
    public final boolean mo1265L() {
        return this.f3157y.f3474E != null;
    }
}
