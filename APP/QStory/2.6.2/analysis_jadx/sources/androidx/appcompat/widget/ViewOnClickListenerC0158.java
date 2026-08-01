package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.Window;
import p190.C7783;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0158 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0146 f641;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C7783 f642;

    public ViewOnClickListenerC0158(C0146 c0146) {
        this.f641 = c0146;
        Context context = c0146.f612.getContext();
        CharSequence charSequence = c0146.f616;
        C7783 c7783 = new C7783();
        c7783.f21178 = 4096;
        c7783.f21183 = 4096;
        c7783.f21174 = null;
        c7783.f21173 = null;
        c7783.f21172 = false;
        c7783.f21171 = false;
        c7783.f21177 = 16;
        c7783.f21181 = context;
        c7783.f21186 = charSequence;
        this.f642 = c7783;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0146 c0146 = this.f641;
        Window.Callback callback = c0146.f618;
        if (callback == null || !c0146.f619) {
            return;
        }
        callback.onMenuItemSelected(0, this.f642);
    }
}
