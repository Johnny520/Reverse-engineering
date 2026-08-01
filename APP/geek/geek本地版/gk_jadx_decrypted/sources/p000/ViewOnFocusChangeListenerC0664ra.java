package p000;

import android.view.View;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: ra */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0664ra implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4255a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0226fj f4256b;

    public /* synthetic */ ViewOnFocusChangeListenerC0664ra(AbstractC0226fj abstractC0226fj, int i) {
        this.f4255a = i;
        this.f4256b = abstractC0226fj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.f4255a) {
            case Base64.DEFAULT /* 0 */:
                C0775ua c0775ua = (C0775ua) this.f4256b;
                c0775ua.m2432s(c0775ua.m2433t());
                break;
            default:
                C0597ph c0597ph = (C0597ph) this.f4256b;
                c0597ph.f3898l = z;
                c0597ph.m1228p();
                if (!z) {
                    c0597ph.m2117s(false);
                    c0597ph.f3899m = false;
                }
                break;
        }
    }
}
