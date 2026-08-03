package p357y1;

import android.view.View;
import android.view.ViewParent;
import java.util.Iterator;
import ng.C3005c;
import ng.C3009g;
import p078f9.C1091b;
import p091g3.C1331r;
import p099h.Hchat.R;

/* JADX INFO: renamed from: y1.i2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC5893i2 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23952g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC5858a f23953h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnAttachStateChangeListenerC5893i2(AbstractC5858a abstractC5858a, int i9) {
        this.f23952g = i9;
        this.f23953h = abstractC5858a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i9 = this.f23952g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i9 = this.f23952g;
        AbstractC5858a abstractC5858a = this.f23953h;
        switch (i9) {
            case 0:
                abstractC5858a.m10555f();
                break;
            default:
                ViewParent parent = abstractC5858a.getParent();
                int i10 = 1;
                Iterator it = (parent == null ? C3009g.f9799a : new C3005c(new C1091b(parent, i10), C1331r.f4396n)).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj = (ViewParent) it.next();
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            view2.getClass();
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                            }
                        }
                    } else {
                        i10 = 0;
                    }
                }
                if (i10 == 0) {
                    abstractC5858a.m10555f();
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m10614a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m10615b(View view) {
    }
}
