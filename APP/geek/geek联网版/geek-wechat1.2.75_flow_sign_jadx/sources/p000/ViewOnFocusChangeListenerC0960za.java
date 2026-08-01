package p000;

import android.view.View;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: za */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0960za implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5562a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0300hj f5563b;

    public /* synthetic */ ViewOnFocusChangeListenerC0960za(AbstractC0300hj abstractC0300hj, int i) {
        this.f5562a = i;
        this.f5563b = abstractC0300hj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.f5562a) {
            case Base64.DEFAULT /* 0 */:
                C0098cb c0098cb = (C0098cb) this.f5563b;
                c0098cb.m608s(c0098cb.m609t());
                break;
            default:
                C0670rh c0670rh = (C0670rh) this.f5563b;
                c0670rh.f4137l = z;
                c0670rh.m1403p();
                if (!z) {
                    c0670rh.m2291s(false);
                    c0670rh.f4138m = false;
                }
                break;
        }
    }
}
