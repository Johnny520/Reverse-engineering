package p052d0;

import android.view.View;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: d0.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0745f implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2588a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0275a f2589b;

    public /* synthetic */ ViewOnClickListenerC0745f(InterfaceC0275a r1, int r2) {
        this.f2588a = r2;
        this.f2589b = r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r2) {
        switch(this.f2588a) {
            case 0: goto L16;
            case 1: goto L14;
            case 2: goto L12;
            case 3: goto L10;
            case 4: goto L8;
            case 5: goto L6;
            default: goto L4;
        };
    L4:
        InterfaceC0275a r02 = this.f2589b;
        AbstractC0307g.m703e(r02, "$onClick");
        r02.invoke();
        return;
    L6:
        InterfaceC0275a r03 = this.f2589b;
        AbstractC0307g.m703e(r03, "$onClick");
        r03.invoke();
        return;
    L8:
        InterfaceC0275a r04 = this.f2589b;
        AbstractC0307g.m703e(r04, "$onClick");
        r04.invoke();
        return;
    L10:
        InterfaceC0275a r05 = this.f2589b;
        AbstractC0307g.m703e(r05, "$onClick");
        r05.invoke();
        return;
    L12:
        InterfaceC0275a r06 = this.f2589b;
        AbstractC0307g.m703e(r06, "$click");
        r06.invoke();
        return;
    L14:
        InterfaceC0275a r07 = this.f2589b;
        AbstractC0307g.m703e(r07, "$click");
        r07.invoke();
        return;
    L16:
        InterfaceC0275a r08 = this.f2589b;
        AbstractC0307g.m703e(r08, "$onAction");
        r08.invoke();
    }
}
