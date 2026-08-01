package p069i;

import android.content.Context;
import android.view.View;
import android.view.Window;
import p068h.C0582a;

/* JADX INFO: renamed from: i.l1 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0694l1 implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final C0582a f2343b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0697m1 f2344c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnClickListenerC0694l1(C0697m1 c0697m1) {
        this.f2344c = c0697m1;
        Context context = c0697m1.f2351a.getContext();
        CharSequence charSequence = c0697m1.f2358h;
        C0582a c0582a = new C0582a();
        c0582a.f1967e = 4096;
        c0582a.f1969g = 4096;
        c0582a.f1974l = null;
        c0582a.f1975m = null;
        c0582a.f1976n = false;
        c0582a.f1977o = false;
        c0582a.f1978p = 16;
        c0582a.f1971i = context;
        c0582a.f1963a = charSequence;
        this.f2343b = c0582a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0697m1 c0697m1 = this.f2344c;
        Window.Callback callback = c0697m1.f2361k;
        if (callback == null || !c0697m1.f2362l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2343b);
    }
}
