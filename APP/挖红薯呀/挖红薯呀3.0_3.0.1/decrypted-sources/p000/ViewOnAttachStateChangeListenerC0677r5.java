package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import org.luckypray.dexkit.C0587R;

/* JADX INFO: renamed from: r5 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0677r5 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5295d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f5296e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnAttachStateChangeListenerC0677r5(int i, Object obj) {
        this.f5295d = i;
        this.f5296e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f5295d) {
            case 0:
                C0714s5 c0714s5 = (C0714s5) this.f5296e;
                Context context = view.getContext();
                if (!c0714s5.f5642c) {
                    context.getApplicationContext().registerComponentCallbacks(c0714s5.f5643d);
                    c0714s5.f5642c = true;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.f5295d;
        Object obj = this.f5296e;
        switch (i) {
            case 0:
                C0714s5 c0714s5 = (C0714s5) obj;
                Context context = view.getContext();
                if (c0714s5.f5642c) {
                    context.getApplicationContext().unregisterComponentCallbacks(c0714s5.f5643d);
                    c0714s5.f5642c = false;
                }
                break;
            case 1:
                AbstractC0671r abstractC0671r = (AbstractC0671r) obj;
                ViewParent parent = abstractC0671r.getParent();
                for (Object obj2 : parent == null ? C0405ks.f3259a : new C0447lx(new C0381k6(11, parent), oc1.f4516d)) {
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        view2.getClass();
                        Object tag = view2.getTag(C0587R.id.is_pooling_container_tag);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            break;
                        }
                    }
                }
                we1 we1Var = abstractC0671r.f5254f;
                if (we1Var != null) {
                    we1Var.m5011d();
                }
                abstractC0671r.f5254f = null;
                abstractC0671r.requestLayout();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((r31) obj).mo478a(null);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m3385a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m3386b(View view) {
    }
}
