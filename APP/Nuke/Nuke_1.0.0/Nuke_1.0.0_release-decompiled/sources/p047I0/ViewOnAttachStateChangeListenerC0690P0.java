package p047I0;

import android.view.View;
import android.view.ViewParent;
import java.util.Iterator;
import me.dartcv.nuke.R;
import p000A.C0099z;
import p117X2.AbstractC1665j;
import p143c3.C1902d;
import p143c3.C1904f;
import p229r1.C3093w;

/* JADX INFO: renamed from: I0.P0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0690P0 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2208d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC0713b f2209e;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0690P0(AbstractC0713b abstractC0713b, int i5) {
        this.f2208d = i5;
        this.f2209e = abstractC0713b;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i5 = this.f2208d;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean z5;
        switch (this.f2208d) {
            case 0:
                this.f2209e.m1212d();
                break;
            default:
                AbstractC0713b abstractC0713b = this.f2209e;
                ViewParent parent = abstractC0713b.getParent();
                Iterator it = (parent == null ? C1902d.f6468a : new C1904f(new C0099z(17, parent), C3093w.f9812k, 1)).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            AbstractC1665j.m2985e(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z5 = true;
                            }
                        }
                    }
                }
                if (!z5) {
                    abstractC0713b.m1212d();
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m1197a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m1198b(View view) {
    }
}
