package p000;

import android.view.View;
import android.view.ViewGroup;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: mi */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2238mi implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0326Hi f7888a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C2281ni f7889b;

    public ViewOnAttachStateChangeListenerC2238mi(LayoutInflaterFactory2C2281ni layoutInflaterFactory2C2281ni, C0326Hi c0326Hi) {
        this.f7889b = layoutInflaterFactory2C2281ni;
        this.f7888a = c0326Hi;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C2276nd c2276nd;
        C0326Hi c0326Hi = this.f7888a;
        AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = c0326Hi.f1110c;
        c0326Hi.m704k();
        ViewGroup viewGroup = (ViewGroup) abstractComponentCallbacksC1503hi.f5296E.getParent();
        this.f7889b.f8016a.m5383F();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C2276nd) {
            c2276nd = (C2276nd) tag;
        } else {
            c2276nd = new C2276nd(viewGroup);
            viewGroup.setTag(R.id.special_effects_controller_view_tag, c2276nd);
        }
        c2276nd.m4608e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
