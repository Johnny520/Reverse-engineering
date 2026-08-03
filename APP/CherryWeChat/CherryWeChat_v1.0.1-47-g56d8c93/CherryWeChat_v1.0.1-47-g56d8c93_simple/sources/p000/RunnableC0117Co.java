package p000;

/* JADX INFO: renamed from: Co */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0117Co implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f285a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0289Go f286b;

    public /* synthetic */ RunnableC0117Co(C0289Go r1, int r2) {
        this.f285a = r2;
        this.f286b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f285a) {
            case 0: goto L14;
            default: goto L4;
        };
    L4:
        C0289Go r0 = this.f286b;
        C0365Ie r1 = r0.f939c;
        if (r1 != null) goto L7;
        return;
    L7:
        if (r1.isAttachedToWindow() == true) goto L9;
        return;
    L9:
        if (r0.f939c.getCount() > r0.f939c.getChildCount()) goto L11;
        return;
    L11:
        if (r0.f939c.getChildCount() > r0.f949m) goto L21;
        r0.f962z.setInputMethodMode(2);
        r0.mo577c();
        return;
    L21:
        return;
    L14:
        C0365Ie r02 = this.f286b.f939c;
        if (r02 == null) goto L22;
        r02.setListSelectionHidden(true);
        r02.requestLayout();
        return;
    }
}
