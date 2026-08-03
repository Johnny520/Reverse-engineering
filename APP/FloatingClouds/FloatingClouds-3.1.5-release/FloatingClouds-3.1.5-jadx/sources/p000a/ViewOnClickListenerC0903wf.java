package p000a;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.C1041d;

/* JADX INFO: renamed from: a.wf */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0903wf implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final C0254O f3504a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1041d f3505b;

    public ViewOnClickListenerC0903wf(C1041d c1041d) {
        this.f3505b = c1041d;
        Context context = c1041d.f4123a.getContext();
        CharSequence charSequence = c1041d.f4130h;
        C0254O c0254o = new C0254O();
        c0254o.f874e = 4096;
        c0254o.f876g = 4096;
        c0254o.f881l = null;
        c0254o.f882m = null;
        c0254o.f883n = false;
        c0254o.f884o = false;
        c0254o.f885p = 16;
        c0254o.f878i = context;
        c0254o.f870a = charSequence;
        this.f3504a = c0254o;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1041d c1041d = this.f3505b;
        Window.Callback callback = c1041d.f4133k;
        if (callback == null || !c1041d.f4134l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f3504a);
    }
}
