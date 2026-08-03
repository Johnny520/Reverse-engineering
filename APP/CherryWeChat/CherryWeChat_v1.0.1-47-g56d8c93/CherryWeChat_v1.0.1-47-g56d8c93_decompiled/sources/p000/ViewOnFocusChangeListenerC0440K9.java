package p000;

import android.view.View;

/* JADX INFO: renamed from: K9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0440K9 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1440a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC1221bg f1441b;

    public /* synthetic */ ViewOnFocusChangeListenerC0440K9(AbstractC1221bg abstractC1221bg, int i) {
        this.f1440a = i;
        this.f1441b = abstractC1221bg;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.f1440a) {
            case 0:
                C0569N9 c0569n9 = (C0569N9) this.f1441b;
                c0569n9.m1114s(c0569n9.m1115t());
                break;
            default:
                C0494Le c0494Le = (C0494Le) this.f1441b;
                c0494Le.f1613l = z;
                c0494Le.m2348p();
                if (!z) {
                    c0494Le.m959s(false);
                    c0494Le.f1614m = false;
                }
                break;
        }
    }
}
