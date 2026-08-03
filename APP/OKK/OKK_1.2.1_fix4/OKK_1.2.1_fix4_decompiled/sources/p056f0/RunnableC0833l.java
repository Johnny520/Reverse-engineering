package p056f0;

import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: f0.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0833l implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3014a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0275a f3015b;

    public /* synthetic */ RunnableC0833l(InterfaceC0275a interfaceC0275a, int i2) {
        this.f3014a = i2;
        this.f3015b = interfaceC0275a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3014a) {
            case 0:
                InterfaceC0275a interfaceC0275a = this.f3015b;
                AbstractC0307g.m703e(interfaceC0275a, "$refresh");
                interfaceC0275a.invoke();
                break;
            default:
                InterfaceC0275a interfaceC0275a2 = this.f3015b;
                AbstractC0307g.m703e(interfaceC0275a2, "$refresh");
                interfaceC0275a2.invoke();
                break;
        }
    }
}
