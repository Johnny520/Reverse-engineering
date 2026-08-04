package yyds;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: yyds.ᛳᛶᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0616 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1175 f2982;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C2780 f2983;

    public ViewOnClickListenerC0616(C2780 c2780) {
        this.f2983 = c2780;
        Context context = c2780.f13571.getContext();
        CharSequence charSequence = c2780.f13567;
        C1175 c1175 = new C1175();
        c1175.f5392 = 4096;
        c1175.f5387 = 4096;
        c1175.f5384 = null;
        c1175.f5389 = null;
        c1175.f5397 = false;
        c1175.f5391 = false;
        c1175.f5390 = 16;
        c1175.f5393 = context;
        c1175.f5396 = charSequence;
        this.f2982 = c1175;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2780 c2780 = this.f2983;
        Window.Callback callback = c2780.f13575;
        if (callback == null || !c2780.f13576) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2982);
    }
}
