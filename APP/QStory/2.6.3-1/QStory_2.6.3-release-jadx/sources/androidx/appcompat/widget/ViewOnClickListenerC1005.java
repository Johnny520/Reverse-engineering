package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.Window;
import p206.C8613;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1005 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0993 f986;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8613 f987;

    public ViewOnClickListenerC1005(C0993 c0993) {
        this.f986 = c0993;
        Context context = c0993.f957.getContext();
        CharSequence charSequence = c0993.f961;
        C8613 c8613 = new C8613();
        c8613.f21520 = 4096;
        c8613.f21525 = 4096;
        c8613.f21516 = null;
        c8613.f21515 = null;
        c8613.f21514 = false;
        c8613.f21513 = false;
        c8613.f21519 = 16;
        c8613.f21523 = context;
        c8613.f21528 = charSequence;
        this.f987 = c8613;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0993 c0993 = this.f986;
        Window.Callback callback = c0993.f963;
        if (callback == null || !c0993.f964) {
            return;
        }
        callback.onMenuItemSelected(0, this.f987);
    }
}
