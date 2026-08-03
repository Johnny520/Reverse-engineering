package p057g;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import p055f.MenuItemC0780k;

/* JADX INFO: renamed from: g.G0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0861G0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3104a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3105b;

    public ViewOnClickListenerC0861G0(C0873M0 c0873m0) {
        this.f3105b = c0873m0;
        c0873m0.f3122a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3104a) {
            case 0:
                C0865I0 c0865i0 = ((Toolbar) this.f3105b).f1221K;
                MenuItemC0780k menuItemC0780k = c0865i0 == null ? null : c0865i0.f3108b;
                if (menuItemC0780k != null) {
                    menuItemC0780k.collapseActionView();
                }
                break;
            default:
                C0873M0 c0873m0 = (C0873M0) this.f3105b;
                if (c0873m0.f3132k != null) {
                    c0873m0.getClass();
                }
                break;
        }
    }

    public ViewOnClickListenerC0861G0(Toolbar toolbar) {
        this.f3105b = toolbar;
    }
}
