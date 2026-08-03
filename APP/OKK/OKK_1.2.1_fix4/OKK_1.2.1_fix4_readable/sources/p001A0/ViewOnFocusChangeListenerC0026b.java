package p001A0;

import android.view.View;

/* JADX INFO: renamed from: A0.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0026b implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0046v f67b;

    public /* synthetic */ ViewOnFocusChangeListenerC0026b(AbstractC0046v abstractC0046v, int i2) {
        this.f66a = i2;
        this.f67b = abstractC0046v;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        switch (this.f66a) {
            case 0:
                C0030f c0030f = (C0030f) this.f67b;
                c0030f.m67t(c0030f.m68u());
                break;
            default:
                C0039o c0039o = (C0039o) this.f67b;
                c0039o.f101l = z2;
                c0039o.m156q();
                if (!z2) {
                    c0039o.m77t(false);
                    c0039o.f102m = false;
                }
                break;
        }
    }
}
