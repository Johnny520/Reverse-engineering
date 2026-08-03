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

    public /* synthetic */ RunnableC0833l(InterfaceC0275a r1, int r2) {
        this.f3014a = r2;
        this.f3015b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f3014a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        InterfaceC0275a r1 = this.f3015b;
        AbstractC0307g.m703e(r1, "$refresh");
        r1.invoke();
        return;
    L6:
        InterfaceC0275a r12 = this.f3015b;
        AbstractC0307g.m703e(r12, "$refresh");
        r12.invoke();
    }
}
