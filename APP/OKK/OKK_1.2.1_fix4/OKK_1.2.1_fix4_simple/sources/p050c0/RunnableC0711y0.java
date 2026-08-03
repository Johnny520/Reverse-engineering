package p050c0;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0146l;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: c0.y0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0711y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2241a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2242b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Activity f2243c;

    public /* synthetic */ RunnableC0711y0(int r1, Activity r2, int r3) {
        this.f2241a = r3;
        this.f2242b = r1;
        this.f2243c = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f2241a) {
            case 0: goto L18;
            default: goto L4;
        };
    L4:
        int r3 = this.f2242b;
        Activity r4 = this.f2243c;
        AbstractC0307g.m703e(r4, "$activity");
        if (r3 == C0580D0.f1747y) goto L7;
        return;
    L7:
        if (r4.isFinishing() == true) goto L77;
        Object r2 = C0590G1.f1792a;
        boolean r22 = C0590G1.m1458p(r4);
        C0580D0 r32 = C0580D0.f1723a;
        if (r22 == false) goto L15;
        if (C0580D0.f1748z == true) goto L74;
        C0580D0.m1412s("chat probe -> open, hide");
        C0580D0.f1748z = true;
        C0580D0.m1411r(false);
        AbstractC0358S.m898n(false);
        return;
    L74:
        return;
    L15:
        if (C0580D0.f1748z == false) goto L76;
        C0580D0.m1412s("chat probe -> exit, restore");
        C0580D0.f1748z = false;
        C0580D0.f1720A = SystemClock.uptimeMillis();
        C0580D0.m1410q(r4);
        return;
    L76:
        return;
    L77:
        return;
    L18:
        int r33 = this.f2242b;
        Activity r42 = this.f2243c;
        AbstractC0307g.m703e(r42, "$activity");
        if (r33 != C0580D0.f1745w) goto L83;
        C0580D0 r23 = C0580D0.f1723a;
        if (C0580D0.m1401h(false) == true) goto L25;
        C0580D0.m1411r(false);
        return;
    L25:
        if (C0580D0.f1735m == 0) goto L28;
        C0580D0.m1411r(false);
        return;
    L28:
        if ((SystemClock.uptimeMillis() - C0580D0.f1720A) >= 600) goto L30;
        boolean r34 = true;
    L32:
        if (C0580D0.f1748z == false) goto L34;
        C0580D0.m1412s("apply skip: chattingOpen");
        C0580D0.m1411r(false);
        AbstractC0358S.m898n(false);
        return;
    L34:
        if (r34 == true) goto L71;
        Object r35 = C0590G1.f1792a;
        if (C0590G1.m1458p(r42) == false) goto L71;
        C0580D0.m1412s("apply skip: chattingForeground -> set chattingOpen");
        C0580D0.f1748z = true;
        C0580D0.m1411r(false);
        AbstractC0358S.m898n(false);
        return;
    L71:
        View r36 = C0580D0.m1398e(r42);     // Catch: Throwable -> L41
        ImageView r5 = C0580D0.f1730h;     // Catch: Throwable -> L41
        if (r5 == null) goto L43;
        C0580D0.m1406m(r5);     // Catch: Throwable -> L41
    L43:
        C0580D0.m1411r(true);     // Catch: Throwable -> L41
        ViewParent r52 = r36.getParent();     // Catch: Throwable -> L41
        if ((r52 instanceof ViewGroup) == false) goto L46;
        ViewGroup r53 = (ViewGroup) r52;     // Catch: Throwable -> L41
    L47:
        if (r53 != null) goto L49;
    L54:
        ImageView r02 = C0580D0.f1730h;     // Catch: Throwable -> L41
        if (C0580D0.f1737o.length() == 0) goto L62;
        if (r02 == null) goto L62;
        if (r02.getDrawable() == null) goto L62;
        if (C0580D0.m1402i(r02) == true) goto L62;
    L64:
        C0580D0.m1407n(r42);     // Catch: Throwable -> L41
        C0580D0.m1412s("apply ok tab=" + C0580D0.f1735m + " vis=" + r36.getVisibility());     // Catch: Throwable -> L41
        Object r03 = C0146l.f339a;     // Catch: Throwable -> L41
    L67:
        Throwable r04 = AbstractC0141g.m465a(r03);
        if (r04 == null) goto L82;
        C0580D0.m1412s("apply fail: " + r04.getMessage());
        return;
    L82:
        return;
    L62:
        if (r02 == null) goto L64;
        C0580D0.m1395b(r02, false);     // Catch: Throwable -> L41
        goto L64
    L49:
        if (r53.indexOfChild(r36) == (r53.getChildCount() - 1)) goto L52;
        r36.bringToFront();     // Catch: Throwable -> L41
    L52:
        if (r53.indexOfChild(r36) == (r53.getChildCount() - 1)) goto L54;
        r53.bringToFront();     // Catch: Throwable -> L41
        goto L54
    L46:
        r53 = null;
    L41:
        th = move-exception;
        r03 = AbstractC0040p.m116u(th);
        goto L67
    L30:
        r34 = false;
        goto L32
    }
}
