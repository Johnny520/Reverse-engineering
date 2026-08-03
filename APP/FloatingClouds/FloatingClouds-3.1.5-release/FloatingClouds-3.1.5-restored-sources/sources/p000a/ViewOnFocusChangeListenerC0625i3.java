package p000a;

import android.view.View;

/* JADX INFO: renamed from: a.i3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0625i3 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2302a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0514c6 f2303b;

    public /* synthetic */ ViewOnFocusChangeListenerC0625i3(AbstractC0514c6 abstractC0514c6, int i) {
        this.f2302a = i;
        this.f2303b = abstractC0514c6;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.f2302a) {
            case 0:
                C0682l3 c0682l3 = (C0682l3) this.f2303b;
                c0682l3.m1548t(c0682l3.m1549u());
                break;
            default:
                C0098F5 c0098f5 = (C0098F5) this.f2303b;
                c0098f5.f318l = z;
                c0098f5.m1269q();
                if (!z) {
                    c0098f5.m274t(false);
                    c0098f5.f319m = false;
                }
                break;
        }
    }
}
