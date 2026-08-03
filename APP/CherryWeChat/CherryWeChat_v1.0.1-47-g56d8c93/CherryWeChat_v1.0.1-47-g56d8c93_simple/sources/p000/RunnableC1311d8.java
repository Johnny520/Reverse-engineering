package p000;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: d8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1311d8 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4764a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f4765b;

    public /* synthetic */ RunnableC1311d8(View r1, int r2) {
        this.f4764a = r2;
        this.f4765b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f4764a) {
            case 0: goto L44;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        View r0 = this.f4765b;
        ((InputMethodManager) r0.getContext().getSystemService(InputMethodManager.class)).showSoftInput(r0, 1);
        return;
    L6:
        this.f4765b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
        return;
    L44:
        View r02 = this.f4765b.getRootView();     // Catch: Throwable -> L43
        if ((r02 instanceof ViewGroup) == false) goto L12;
        ViewGroup r03 = (ViewGroup) r02;     // Catch: Throwable -> L43
    L13:
        if (r03 == null) goto L46;
        View r1 = C1456gf.m2810v(r03, AbstractC0295Gu.m625r(-257874131417141L));     // Catch: Throwable -> L43
        if (r1 == null) goto L28;
        C1456gf.m2807r(r1);     // Catch: Throwable -> L43
        if ((r1 instanceof ViewGroup) == false) goto L20;
        C1442g8.f5046b.getClass();     // Catch: Throwable -> L43
        C1442g8.m2754g((ViewGroup) r1);     // Catch: Throwable -> L43
    L20:
        Object r12 = r1.getParent();     // Catch: Throwable -> L43
        if ((r12 instanceof View) == false) goto L23;
        View r13 = (View) r12;     // Catch: Throwable -> L43
    L24:
        if (r13 == null) goto L28;
        if ((r13.getBackground() instanceof ColorDrawable) == false) goto L28;
        r13.setBackground(null);     // Catch: Throwable -> L43
        goto L28
    L23:
        r13 = null;
    L28:
        View r04 = C1456gf.m2810v(r03, AbstractC0295Gu.m625r(-258067404945461L));     // Catch: Throwable -> L43
        if ((r04 instanceof ViewGroup) == false) goto L31;
        ViewGroup r05 = (ViewGroup) r04;     // Catch: Throwable -> L43
    L32:
        if (r05 != null) goto L34;
        return;
    L34:
        if ((r05.getBackground() instanceof ColorDrawable) == false) goto L36;
        r05.setBackground(null);     // Catch: Throwable -> L43
    L36:
        View r14 = C1456gf.m2788F(r05, new int[]{0});     // Catch: Throwable -> L43
        if (r14 == null) goto L39;
        C1456gf.m2807r(r14);     // Catch: Throwable -> L43
    L39:
        View r06 = C1456gf.m2810v(r05, AbstractC0295Gu.m625r(-256607116064821L));     // Catch: Throwable -> L43
        if (r06 == null) goto L48;
        C1456gf.m2807r(r06);     // Catch: Throwable -> L43
        return;
    L48:
        return;
    L31:
        r05 = null;
        goto L32
    L46:
        return;
    L12:
        r03 = null;
    }
}
