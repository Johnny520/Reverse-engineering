package p000;

import android.view.View;

/* JADX INFO: renamed from: kl */
/* JADX INFO: loaded from: classes.dex */
public final class C0415kl extends AbstractC0346ip {

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ AbstractComponentCallbacksC0489ml f2912C;

    public C0415kl(AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml) {
        this.f2912C = abstractComponentCallbacksC0489ml;
    }

    @Override // p000.AbstractC0346ip
    /* JADX INFO: renamed from: G */
    public final View mo1513G(int i) {
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = this.f2912C;
        View view = abstractComponentCallbacksC0489ml.f3229E;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0489ml + " does not have a view");
    }

    @Override // p000.AbstractC0346ip
    /* JADX INFO: renamed from: H */
    public final boolean mo1514H() {
        return this.f2912C.f3229E != null;
    }
}
