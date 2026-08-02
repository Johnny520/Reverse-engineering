package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import java.util.Iterator;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: b9 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0047b9 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f740h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f741i;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0047b9(int i, Object obj) {
        this.f740h = i;
        this.f741i = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f740h) {
            case 0:
                C0083c9 c0083c9 = (C0083c9) this.f741i;
                Context context = view.getContext();
                if (!c0083c9.f1242d) {
                    context.getApplicationContext().registerComponentCallbacks(c0083c9.f1243e);
                    c0083c9.f1242d = true;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.f740h;
        boolean z = false;
        Object obj = this.f741i;
        switch (i) {
            case 0:
                C0083c9 c0083c9 = (C0083c9) obj;
                Context context = view.getContext();
                if (c0083c9.f1242d) {
                    context.getApplicationContext().unregisterComponentCallbacks(c0083c9.f1243e);
                    c0083c9.f1242d = false;
                }
                break;
            case 1:
                AbstractC0526o2 abstractC0526o2 = (AbstractC0526o2) obj;
                ViewParent parent = abstractC0526o2.getParent();
                Iterator it = (parent == null ? ee0.f2413a : new c70(new C0727ta(23, parent), bb3.f768o)).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj2 = (ViewParent) it.next();
                        if (obj2 instanceof View) {
                            View view2 = (View) obj2;
                            view2.getClass();
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    abstractC0526o2.m3468f();
                }
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((zt2) obj).mo1704c(null);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m491a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m492b(View view) {
    }
}
