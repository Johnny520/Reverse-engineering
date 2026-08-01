package p006D;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AnimationAnimationListenerC0427e;
import androidx.fragment.app.C0448z;
import java.util.WeakHashMap;
import p004C.C0066j;
import p069i.C0689k;
import p069i.C0717t0;
import p099y.AbstractC1048L;

/* JADX INFO: renamed from: D.b */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0073b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f335a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f336b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0073b(int i2, Object obj) {
        this.f335a = i2;
        this.f336b = obj;
    }

    /* JADX DEBUG: Class process forced to load method for inline: androidx.activity.g.e(e.i):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        C0689k c0689k;
        Object obj = this.f336b;
        switch (this.f335a) {
            case 0:
                ViewOnTouchListenerC0081j viewOnTouchListenerC0081j = (ViewOnTouchListenerC0081j) obj;
                if (viewOnTouchListenerC0081j.f355p) {
                    boolean z2 = viewOnTouchListenerC0081j.f353n;
                    C0072a c0072a = viewOnTouchListenerC0081j.f341b;
                    if (z2) {
                        viewOnTouchListenerC0081j.f353n = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c0072a.f330e = jCurrentAnimationTimeMillis;
                        c0072a.f332g = -1L;
                        c0072a.f331f = jCurrentAnimationTimeMillis;
                        c0072a.f333h = 0.5f;
                    }
                    if ((c0072a.f332g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0072a.f332g + ((long) c0072a.f334i)) || !viewOnTouchListenerC0081j.m219e()) {
                        viewOnTouchListenerC0081j.f355p = false;
                        return;
                    }
                    boolean z3 = viewOnTouchListenerC0081j.f354o;
                    ListView listView = viewOnTouchListenerC0081j.f343d;
                    if (z3) {
                        viewOnTouchListenerC0081j.f354o = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (c0072a.f331f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fM154a = c0072a.m154a(jCurrentAnimationTimeMillis2);
                    long j2 = jCurrentAnimationTimeMillis2 - c0072a.f331f;
                    c0072a.f331f = jCurrentAnimationTimeMillis2;
                    viewOnTouchListenerC0081j.f357r.scrollListBy((int) (j2 * ((fM154a * 4.0f) + ((-4.0f) * fM154a * fM154a)) * c0072a.f329d));
                    WeakHashMap weakHashMap = AbstractC1048L.f3662a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e2) {
                    if (!TextUtils.equals(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e2;
                    }
                    return;
                }
            case 2:
                AnimationAnimationListenerC0427e animationAnimationListenerC0427e = (AnimationAnimationListenerC0427e) obj;
                animationAnimationListenerC0427e.f1322a.endViewTransition(animationAnimationListenerC0427e.f1323b);
                animationAnimationListenerC0427e.f1324c.m826d();
                return;
            case 3:
                ((C0448z) obj).m899v(true);
                return;
            case 4:
                C0717t0 c0717t0 = (C0717t0) obj;
                c0717t0.f2435n = null;
                c0717t0.drawableStateChanged();
                return;
            case 5:
                ActionMenuView actionMenuView = ((Toolbar) obj).f1084b;
                if (actionMenuView == null || (c0689k = actionMenuView.f1006u) == null) {
                    return;
                }
                c0689k.m1311l();
                return;
            default:
                Object obj2 = ((C0066j) obj).f312c;
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public RunnableC0073b(C0066j c0066j, int i2) {
        this.f335a = 6;
        this.f336b = c0066j;
    }
}
