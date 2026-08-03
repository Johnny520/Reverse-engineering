package p057g;

/* JADX INFO: renamed from: g.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0911k0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3231a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0919o0 f3232b;

    public /* synthetic */ RunnableC0911k0(AbstractC0919o0 abstractC0919o0, int i2) {
        this.f3231a = i2;
        this.f3232b = abstractC0919o0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3231a) {
            case 0:
                C0927s0 c0927s0 = this.f3232b.f3253c;
                if (c0927s0 != null) {
                    c0927s0.setListSelectionHidden(true);
                    c0927s0.requestLayout();
                }
                break;
            default:
                AbstractC0919o0 abstractC0919o0 = this.f3232b;
                C0927s0 c0927s02 = abstractC0919o0.f3253c;
                if (c0927s02 != null && c0927s02.isAttachedToWindow() && abstractC0919o0.f3253c.getCount() > abstractC0919o0.f3253c.getChildCount() && abstractC0919o0.f3253c.getChildCount() <= Integer.MAX_VALUE) {
                    abstractC0919o0.f3272v.setInputMethodMode(2);
                    abstractC0919o0.mo1980f();
                    break;
                }
                break;
        }
    }
}
