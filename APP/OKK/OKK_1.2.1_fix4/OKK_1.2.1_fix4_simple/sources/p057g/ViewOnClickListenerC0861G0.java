package p057g;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import p055f.MenuItemC0780k;

/* JADX INFO: renamed from: g.G0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0861G0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3104a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3105b;

    public ViewOnClickListenerC0861G0(C0873M0 r2) {
        this.f3104a = 1;
        this.f3105b = r2;
        r2.f3122a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r2) {
        switch(this.f3104a) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        C0873M0 r22 = (C0873M0) this.f3105b;
        if (r22.f3132k == null) goto L15;
        r22.getClass();
        return;
    L15:
        return;
    L8:
        C0865I0 r23 = ((Toolbar) this.f3105b).f1221K;
        if (r23 != null) goto L11;
        MenuItemC0780k r24 = null;
    L12:
        if (r24 == null) goto L16;
        r24.collapseActionView();
        return;
    L16:
        return;
    L11:
        r24 = r23.f3108b;
        goto L12
    }

    public ViewOnClickListenerC0861G0(Toolbar r2) {
        this.f3104a = 0;
        this.f3105b = r2;
    }
}
