package androidx.fragment.app;

import android.view.View;
import p006D.AbstractC0079h;

/* JADX INFO: renamed from: androidx.fragment.app.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0432j extends AbstractC0079h {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractComponentCallbacksC0434l f1335d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0432j(AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l) {
        this.f1335d = abstractComponentCallbacksC0434l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p006D.AbstractC0079h
    /* JADX INFO: renamed from: G */
    public final View mo201G(int i2) {
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = this.f1335d;
        View view = abstractComponentCallbacksC0434l.f1353F;
        if (view != null) {
            return view.findViewById(i2);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0434l + " does not have a view");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p006D.AbstractC0079h
    /* JADX INFO: renamed from: H */
    public final boolean mo202H() {
        return this.f1335d.f1353F != null;
    }
}
