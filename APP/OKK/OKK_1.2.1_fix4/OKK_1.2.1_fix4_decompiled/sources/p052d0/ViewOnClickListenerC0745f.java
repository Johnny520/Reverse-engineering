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

    public /* synthetic */ ViewOnClickListenerC0745f(InterfaceC0275a interfaceC0275a, int i2) {
        this.f2588a = i2;
        this.f2589b = interfaceC0275a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2588a) {
            case 0:
                InterfaceC0275a interfaceC0275a = this.f2589b;
                AbstractC0307g.m703e(interfaceC0275a, "$onAction");
                interfaceC0275a.invoke();
                break;
            case 1:
                InterfaceC0275a interfaceC0275a2 = this.f2589b;
                AbstractC0307g.m703e(interfaceC0275a2, "$click");
                interfaceC0275a2.invoke();
                break;
            case 2:
                InterfaceC0275a interfaceC0275a3 = this.f2589b;
                AbstractC0307g.m703e(interfaceC0275a3, "$click");
                interfaceC0275a3.invoke();
                break;
            case 3:
                InterfaceC0275a interfaceC0275a4 = this.f2589b;
                AbstractC0307g.m703e(interfaceC0275a4, "$onClick");
                interfaceC0275a4.invoke();
                break;
            case 4:
                InterfaceC0275a interfaceC0275a5 = this.f2589b;
                AbstractC0307g.m703e(interfaceC0275a5, "$onClick");
                interfaceC0275a5.invoke();
                break;
            case 5:
                InterfaceC0275a interfaceC0275a6 = this.f2589b;
                AbstractC0307g.m703e(interfaceC0275a6, "$onClick");
                interfaceC0275a6.invoke();
                break;
            default:
                InterfaceC0275a interfaceC0275a7 = this.f2589b;
                AbstractC0307g.m703e(interfaceC0275a7, "$onClick");
                interfaceC0275a7.invoke();
                break;
        }
    }
}
