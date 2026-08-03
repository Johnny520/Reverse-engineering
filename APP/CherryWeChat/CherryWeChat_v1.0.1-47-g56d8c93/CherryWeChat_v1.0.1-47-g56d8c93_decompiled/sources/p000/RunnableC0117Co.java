package p000;

/* JADX INFO: renamed from: Co */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0117Co implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f285a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0289Go f286b;

    public /* synthetic */ RunnableC0117Co(C0289Go c0289Go, int i) {
        this.f285a = i;
        this.f286b = c0289Go;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f285a) {
            case 0:
                C0365Ie c0365Ie = this.f286b.f939c;
                if (c0365Ie != null) {
                    c0365Ie.setListSelectionHidden(true);
                    c0365Ie.requestLayout();
                }
                break;
            default:
                C0289Go c0289Go = this.f286b;
                C0365Ie c0365Ie2 = c0289Go.f939c;
                if (c0365Ie2 != null && c0365Ie2.isAttachedToWindow() && c0289Go.f939c.getCount() > c0289Go.f939c.getChildCount() && c0289Go.f939c.getChildCount() <= c0289Go.f949m) {
                    c0289Go.f962z.setInputMethodMode(2);
                    c0289Go.mo577c();
                    break;
                }
                break;
        }
    }
}
