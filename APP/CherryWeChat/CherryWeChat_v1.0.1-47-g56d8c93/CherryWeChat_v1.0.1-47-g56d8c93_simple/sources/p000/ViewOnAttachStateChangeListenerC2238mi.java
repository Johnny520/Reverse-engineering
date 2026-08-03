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

    public ViewOnAttachStateChangeListenerC2238mi(LayoutInflaterFactory2C2281ni r1, C0326Hi r2) {
        this.f7889b = r1;
        this.f7888a = r2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r4) {
        C0326Hi r42 = this.f7888a;
        AbstractComponentCallbacksC1503hi r0 = r42.f1110c;
        r42.m704k();
        ViewGroup r43 = (ViewGroup) r0.f5296E.getParent();
        this.f7889b.f8016a.m5383F();
        Object r1 = r43.getTag(R.id.special_effects_controller_view_tag);
        if ((r1 instanceof C2276nd) == false) goto L5;
        C2276nd r12 = (C2276nd) r1;
    L6:
        r12.m4608e();
        return;
    L5:
        r12 = new C2276nd(r43);
        r43.setTag(R.id.special_effects_controller_view_tag, r12);
        goto L6
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r1) {
    }
}
