package p057g;

/* JADX INFO: renamed from: g.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0911k0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3231a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0919o0 f3232b;

    public /* synthetic */ RunnableC0911k0(AbstractC0919o0 r1, int r2) {
        this.f3231a = r2;
        this.f3232b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f3231a) {
            case 0: goto L14;
            default: goto L4;
        };
    L4:
        AbstractC0919o0 r02 = this.f3232b;
        C0927s0 r1 = r02.f3253c;
        if (r1 != null) goto L7;
        return;
    L7:
        if (r1.isAttachedToWindow() == true) goto L9;
        return;
    L9:
        if (r02.f3253c.getCount() > r02.f3253c.getChildCount()) goto L11;
        return;
    L11:
        if (r02.f3253c.getChildCount() > Integer.MAX_VALUE) goto L21;
        r02.f3272v.setInputMethodMode(2);
        r02.mo1980f();
        return;
    L21:
        return;
    L14:
        C0927s0 r03 = this.f3232b.f3253c;
        if (r03 == null) goto L22;
        r03.setListSelectionHidden(true);
        r03.requestLayout();
        return;
    }
}
