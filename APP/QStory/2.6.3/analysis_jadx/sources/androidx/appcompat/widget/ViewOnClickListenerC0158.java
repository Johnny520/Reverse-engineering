package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.Window;
import p190.C7784;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0158 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0146 f641;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C7784 f642;

    public ViewOnClickListenerC0158(C0146 c0146) {
        this.f641 = c0146;
        Context context = c0146.f612.getContext();
        CharSequence charSequence = c0146.f616;
        C7784 c7784 = new C7784();
        c7784.f21175 = 4096;
        c7784.f21180 = 4096;
        c7784.f21171 = null;
        c7784.f21170 = null;
        c7784.f21169 = false;
        c7784.f21168 = false;
        c7784.f21174 = 16;
        c7784.f21178 = context;
        c7784.f21183 = charSequence;
        this.f642 = c7784;
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
