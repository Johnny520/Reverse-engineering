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

    public /* synthetic */ RunnableC0711y0(int i2, Activity activity, int i3) {
        this.f2241a = i3;
        this.f2242b = i2;
        this.f2243c = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objM116u;
        switch (this.f2241a) {
            case 0:
                int i2 = this.f2242b;
                Activity activity = this.f2243c;
                AbstractC0307g.m703e(activity, "$activity");
                if (i2 == C0580D0.f1745w) {
                    C0580D0 c0580d0 = C0580D0.f1723a;
                    if (!C0580D0.m1401h(false)) {
                        C0580D0.m1411r(false);
                    } else if (C0580D0.f1735m == 0) {
                        boolean z2 = SystemClock.uptimeMillis() - C0580D0.f1720A < 600;
                        if (!C0580D0.f1748z) {
                            if (!z2) {
                                Object obj = C0590G1.f1792a;
                                if (C0590G1.m1458p(activity)) {
                                    C0580D0.m1412s("apply skip: chattingForeground -> set chattingOpen");
                                    C0580D0.f1748z = true;
                                    C0580D0.m1411r(false);
                                    AbstractC0358S.m898n(false);
                                }
                            }
                            try {
                                View viewM1398e = C0580D0.m1398e(activity);
                                ImageView imageView = C0580D0.f1730h;
                                if (imageView != null) {
                                    C0580D0.m1406m(imageView);
                                }
                                C0580D0.m1411r(true);
                                ViewParent parent = viewM1398e.getParent();
                                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                                if (viewGroup != null) {
                                    if (viewGroup.indexOfChild(viewM1398e) != viewGroup.getChildCount() - 1) {
                                        viewM1398e.bringToFront();
                                    }
                                    if (viewGroup.indexOfChild(viewM1398e) != viewGroup.getChildCount() - 1) {
                                        viewGroup.bringToFront();
                                    }
                                }
                                ImageView imageView2 = C0580D0.f1730h;
                                if (C0580D0.f1737o.length() == 0 || imageView2 == null || imageView2.getDrawable() == null || C0580D0.m1402i(imageView2)) {
                                    if (imageView2 != null) {
                                        C0580D0.m1395b(imageView2, false);
                                    }
                                }
                                C0580D0.m1407n(activity);
                                C0580D0.m1412s("apply ok tab=" + C0580D0.f1735m + " vis=" + viewM1398e.getVisibility());
                                objM116u = C0146l.f339a;
                            } catch (Throwable th) {
                                objM116u = AbstractC0040p.m116u(th);
                            }
                            Throwable thM465a = AbstractC0141g.m465a(objM116u);
                            if (thM465a != null) {
                                C0580D0.m1412s("apply fail: " + thM465a.getMessage());
                            }
                        } else {
                            C0580D0.m1412s("apply skip: chattingOpen");
                            C0580D0.m1411r(false);
                            AbstractC0358S.m898n(false);
                        }
                    } else {
                        C0580D0.m1411r(false);
                    }
                    break;
                }
                break;
            default:
                int i3 = this.f2242b;
                Activity activity2 = this.f2243c;
                AbstractC0307g.m703e(activity2, "$activity");
                if (i3 == C0580D0.f1747y && !activity2.isFinishing()) {
                    Object obj2 = C0590G1.f1792a;
                    boolean zM1458p = C0590G1.m1458p(activity2);
                    C0580D0 c0580d02 = C0580D0.f1723a;
                    if (!zM1458p) {
                        if (C0580D0.f1748z) {
                            C0580D0.m1412s("chat probe -> exit, restore");
                            C0580D0.f1748z = false;
                            C0580D0.f1720A = SystemClock.uptimeMillis();
                            C0580D0.m1410q(activity2);
                        }
                    } else if (!C0580D0.f1748z) {
                        C0580D0.m1412s("chat probe -> open, hide");
                        C0580D0.f1748z = true;
                        C0580D0.m1411r(false);
                        AbstractC0358S.m898n(false);
                    }
                    break;
                }
                break;
        }
    }
}
