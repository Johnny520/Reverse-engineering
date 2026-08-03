package p050c0;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.AbstractC0762d;
import de.robv.android.xposed.C0760b;
import java.lang.ref.WeakReference;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p052d0.C0753n;
import p052d0.C0756q;

/* JADX INFO: renamed from: c0.B0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0574B0 extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1699b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0580D0 f1700c;

    public C0574B0(int i2) {
        this.f1699b = i2;
        switch (i2) {
            case 1:
                this.f1700c = C0580D0.f1723a;
                break;
            case 2:
                this.f1700c = C0580D0.f1723a;
                break;
            case 3:
                this.f1700c = C0580D0.f1723a;
                break;
            case 4:
                this.f1700c = C0580D0.f1723a;
                break;
            case 5:
                this.f1700c = C0580D0.f1723a;
                break;
            case 6:
                this.f1700c = C0580D0.f1723a;
                break;
            case 7:
                this.f1700c = C0580D0.f1723a;
                break;
            case 8:
                this.f1700c = C0580D0.f1723a;
                break;
            case 9:
                this.f1700c = C0580D0.f1723a;
                break;
            case 10:
                this.f1700c = C0580D0.f1723a;
                break;
            case 11:
                this.f1700c = C0580D0.f1723a;
                break;
            default:
                this.f1700c = C0580D0.f1723a;
                break;
        }
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b c0760b) {
        Activity activity;
        Activity activity2;
        Activity activity3;
        Object objM116u;
        Object objM116u2;
        switch (this.f1699b) {
            case 2:
                Object[] objArr = c0760b.f2670c;
                AbstractC0307g.m702d(objArr, "args");
                Object objM537n0 = AbstractC0179j.m537n0(0, objArr);
                Integer num = objM537n0 instanceof Integer ? (Integer) objM537n0 : null;
                if (num != null && num.intValue() == 0) {
                    C0580D0.f1748z = false;
                    C0580D0.f1720A = SystemClock.uptimeMillis();
                    Activity activityM1394a = C0580D0.m1394a(c0760b.f2669b);
                    if (activityM1394a == null) {
                        WeakReference weakReference = C0580D0.f1729g;
                        Activity activity4 = weakReference != null ? (Activity) weakReference.get() : null;
                        if (activity4 != null) {
                            activityM1394a = activity4;
                        }
                    }
                    this.f1700c.getClass();
                    C0580D0.m1410q(activityM1394a);
                }
                break;
            case 3:
                C0580D0.f1748z = false;
                C0580D0.f1720A = SystemClock.uptimeMillis();
                Activity activityM1394a2 = C0580D0.m1394a(c0760b.f2669b);
                if (activityM1394a2 == null) {
                    WeakReference weakReference2 = C0580D0.f1729g;
                    Activity activity5 = weakReference2 != null ? (Activity) weakReference2.get() : null;
                    if (activity5 != null) {
                        activityM1394a2 = activity5;
                    }
                }
                this.f1700c.getClass();
                C0580D0.m1410q(activityM1394a2);
                break;
            case 4:
                if (!AbstractC0425j.m1005J0(C0580D0.f1722C, "LauncherUI", false) && !AbstractC0425j.m1005J0(C0580D0.f1722C, "MainTabUI", false)) {
                    this.f1700c.getClass();
                    C0580D0.m1412s("dialog show on non-home -> hide avatar");
                    this.f1700c.getClass();
                    C0580D0.m1411r(false);
                    break;
                }
                break;
            case 5:
                WeakReference weakReference3 = C0580D0.f1729g;
                if (weakReference3 != null && (activity = (Activity) weakReference3.get()) != null) {
                    this.f1700c.getClass();
                    C0580D0.m1404k(activity);
                    break;
                }
                break;
            case 6:
                Object[] objArr2 = c0760b.f2670c;
                AbstractC0307g.m702d(objArr2, "args");
                Object objM537n02 = AbstractC0179j.m537n0(0, objArr2);
                Boolean bool = objM537n02 instanceof Boolean ? (Boolean) objM537n02 : null;
                if (bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    Object obj = c0760b.f2669b;
                    Activity activity6 = obj instanceof Activity ? (Activity) obj : null;
                    if (activity6 != null) {
                        C0580D0 c0580d0 = this.f1700c;
                        if (!zBooleanValue) {
                            c0580d0.getClass();
                            C0580D0.m1412s("launcher focus lost (keep avatar)");
                        } else {
                            c0580d0.getClass();
                            C0580D0.m1412s("launcher focus gained -> tick");
                            C0580D0.m1404k(activity6);
                        }
                        break;
                    }
                }
                break;
            case 7:
                Object obj2 = c0760b.f2669b;
                Activity activity7 = obj2 instanceof Activity ? (Activity) obj2 : null;
                if (activity7 != null) {
                    C0580D0.f1748z = false;
                    C0580D0.f1720A = SystemClock.uptimeMillis();
                    this.f1700c.getClass();
                    C0580D0.m1410q(activity7);
                    break;
                }
                break;
            case 8:
                Object[] objArr3 = c0760b.f2670c;
                AbstractC0307g.m702d(objArr3, "args");
                Object objM537n03 = AbstractC0179j.m537n0(0, objArr3);
                Integer num2 = objM537n03 instanceof Integer ? (Integer) objM537n03 : null;
                C0580D0.f1735m = num2 != null ? num2.intValue() : 0;
                WeakReference weakReference4 = C0580D0.f1729g;
                if (weakReference4 != null && (activity2 = (Activity) weakReference4.get()) != null) {
                    this.f1700c.getClass();
                    C0580D0.m1404k(activity2);
                    break;
                }
                break;
            case 9:
                C0580D0 c0580d02 = this.f1700c;
                Object obj3 = c0760b.f2669b;
                c0580d02.getClass();
                if (obj3 != null && !C0580D0.f1721B) {
                    try {
                        objM116u = C0580D0.m1400g(obj3);
                    } catch (Throwable th) {
                        objM116u = AbstractC0040p.m116u(th);
                    }
                    boolean z2 = objM116u instanceof C0140f;
                    Object obj4 = objM116u;
                    if (z2) {
                        obj4 = null;
                    }
                    View view = (View) obj4;
                    if (view != null) {
                        Class<?> cls = view.getClass();
                        try {
                            AbstractC0762d.m1951a(cls, "onInterceptTouchEvent", new C0574B0(10));
                            AbstractC0762d.m1951a(cls, "onTouchEvent", new C0574B0(11));
                            C0580D0.f1721B = true;
                            C0580D0.m1412s("hooked tab ViewPager " + cls + " edge intercept+touch");
                            objM116u2 = C0146l.f339a;
                        } catch (Throwable th2) {
                            objM116u2 = AbstractC0040p.m116u(th2);
                        }
                        Throwable thM465a = AbstractC0141g.m465a(objM116u2);
                        if (thM465a != null) {
                            C0580D0 c0580d03 = C0580D0.f1723a;
                            C0580D0.m1412s("hookTabViewPagerSwipe fail: " + thM465a.getMessage());
                        }
                    }
                }
                Object[] objArr4 = c0760b.f2670c;
                AbstractC0307g.m702d(objArr4, "args");
                Object objM536m0 = AbstractC0179j.m536m0(objArr4);
                Integer num3 = objM536m0 instanceof Integer ? (Integer) objM536m0 : null;
                C0580D0.f1735m = num3 != null ? num3.intValue() : C0580D0.f1735m;
                WeakReference weakReference5 = C0580D0.f1729g;
                if (weakReference5 != null && (activity3 = (Activity) weakReference5.get()) != null) {
                    this.f1700c.getClass();
                    C0580D0.m1404k(activity3);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo1386b(C0760b c0760b) {
        FrameLayout frameLayout;
        C0753n c0753nM871W;
        switch (this.f1699b) {
            case 0:
                C0580D0.f1748z = true;
                this.f1700c.getClass();
                C0580D0.m1411r(false);
                AbstractC0358S.m898n(false);
                break;
            case 1:
                C0580D0.f1748z = true;
                this.f1700c.getClass();
                C0580D0.m1411r(false);
                AbstractC0358S.m898n(false);
                break;
            case 10:
                Object obj = c0760b.f2669b;
                View view = obj instanceof View ? (View) obj : null;
                if (view != null) {
                    Object[] objArr = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr, "args");
                    Object objM537n0 = AbstractC0179j.m537n0(0, objArr);
                    MotionEvent motionEvent = objM537n0 instanceof MotionEvent ? (MotionEvent) objM537n0 : null;
                    if (motionEvent != null) {
                        C0580D0 c0580d0 = this.f1700c;
                        Context context = view.getContext();
                        c0580d0.getClass();
                        Activity activityM1399f = C0580D0.m1399f(context);
                        if (activityM1399f != null) {
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 0) {
                                FrameLayout frameLayout2 = AbstractC0358S.f736p;
                                if (((frameLayout2 != null ? frameLayout2.getParent() : null) == null || (frameLayout = AbstractC0358S.f736p) == null || frameLayout.getVisibility() != 0) && !AbstractC0358S.f739s && !AbstractC0358S.f742v) {
                                    float f2 = activityM1399f.getResources().getDisplayMetrics().density;
                                    float rawX = motionEvent.getRawX();
                                    float rawY = motionEvent.getRawY();
                                    if (rawX <= ((int) ((72 * f2) + 0.5f))) {
                                        if (rawY >= (activityM1399f.getResources().getIdentifier("status_bar_height", "dimen", "android") > 0 ? activityM1399f.getResources().getDimensionPixelSize(r2) : (int) (28 * activityM1399f.getResources().getDisplayMetrics().density)) + ((int) ((74 * f2) + 0.5f))) {
                                            AbstractC0358S.f742v = true;
                                            AbstractC0358S.f743w = false;
                                            AbstractC0358S.f744x = rawX;
                                            AbstractC0358S.f745y = rawY;
                                            break;
                                        }
                                    }
                                }
                            } else {
                                if (actionMasked != 1) {
                                    if (actionMasked == 2) {
                                        if (AbstractC0358S.f742v) {
                                            float rawX2 = motionEvent.getRawX() - AbstractC0358S.f744x;
                                            float fAbs = Math.abs(motionEvent.getRawY() - AbstractC0358S.f745y);
                                            float f3 = (int) ((8 * activityM1399f.getResources().getDisplayMetrics().density) + 0.5f);
                                            if (Math.abs(rawX2) > f3 && Math.abs(rawX2) > fAbs) {
                                                AbstractC0358S.f743w = true;
                                                c0760b.m1946c(Boolean.TRUE);
                                            } else if (fAbs > f3) {
                                                AbstractC0358S.f742v = false;
                                            }
                                            break;
                                        }
                                    } else if (actionMasked != 3) {
                                    }
                                }
                                if (AbstractC0358S.f742v) {
                                    AbstractC0358S.f742v = false;
                                    AbstractC0358S.f743w = false;
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 11:
                Object obj2 = c0760b.f2669b;
                View view2 = obj2 instanceof View ? (View) obj2 : null;
                if (view2 != null) {
                    Object[] objArr2 = c0760b.f2670c;
                    AbstractC0307g.m702d(objArr2, "args");
                    Object objM537n02 = AbstractC0179j.m537n0(0, objArr2);
                    MotionEvent motionEvent2 = objM537n02 instanceof MotionEvent ? (MotionEvent) objM537n02 : null;
                    if (motionEvent2 != null) {
                        C0580D0 c0580d02 = this.f1700c;
                        Context context2 = view2.getContext();
                        c0580d02.getClass();
                        Activity activityM1399f2 = C0580D0.m1399f(context2);
                        if (activityM1399f2 != null && AbstractC0358S.f742v && AbstractC0358S.f743w) {
                            int actionMasked2 = motionEvent2.getActionMasked();
                            if (actionMasked2 == 1) {
                                AbstractC0358S.f742v = false;
                                AbstractC0358S.f743w = false;
                                float rawX3 = motionEvent2.getRawX() - AbstractC0358S.f744x;
                                c0753nM871W = AbstractC0358S.m871W();
                                if (c0753nM871W != null) {
                                    if (motionEvent2.getActionMasked() == 3 || Math.abs(rawX3) < c0753nM871W.f2628c * 0.28f) {
                                        AbstractC0358S.m898n(true);
                                    } else {
                                        View view3 = c0753nM871W.f2626a;
                                        View view4 = c0753nM871W.f2627b;
                                        AbstractC0358S.f739s = true;
                                        AnimatorSet animatorSet = new AnimatorSet();
                                        animatorSet.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.TRANSLATION_X, view3.getTranslationX(), 0.0f), ObjectAnimator.ofFloat(view4, (Property<View, Float>) View.ALPHA, view4.getAlpha(), 0.42f));
                                        animatorSet.setDuration(200L);
                                        animatorSet.setInterpolator(new PathInterpolator(0.4f, 0.0f, 0.2f, 1.0f));
                                        animatorSet.addListener(new C0756q());
                                        animatorSet.start();
                                    }
                                }
                            } else if (actionMasked2 != 2) {
                                if (actionMasked2 != 3) {
                                }
                                AbstractC0358S.f742v = false;
                                AbstractC0358S.f743w = false;
                                float rawX32 = motionEvent2.getRawX() - AbstractC0358S.f744x;
                                c0753nM871W = AbstractC0358S.m871W();
                                if (c0753nM871W != null) {
                                }
                            } else {
                                float rawX4 = motionEvent2.getRawX() - AbstractC0358S.f744x;
                                C0753n c0753nM871W2 = AbstractC0358S.m871W();
                                if (c0753nM871W2 == null) {
                                    C0753n c0753nM881d = AbstractC0358S.m881d(activityM1399f2);
                                    if (c0753nM881d == null) {
                                        AbstractC0358S.f742v = false;
                                    } else {
                                        c0753nM881d.f2626a.setTranslationX(-c0753nM881d.f2628c);
                                        c0753nM881d.f2627b.setAlpha(0.0f);
                                    }
                                } else {
                                    float fAbs2 = Math.abs(rawX4);
                                    View view5 = c0753nM871W2.f2626a;
                                    float f4 = c0753nM871W2.f2628c;
                                    view5.setTranslationX(AbstractC0040p.m110o(fAbs2 - f4, -f4, 0.0f));
                                    c0753nM871W2.f2627b.setAlpha(AbstractC0040p.m110o(AbstractC0040p.m110o(fAbs2 / c0753nM871W2.f2628c, 0.0f, 1.0f) * 0.42f, 0.0f, 0.42f));
                                }
                            }
                            c0760b.m1946c(Boolean.TRUE);
                        }
                        break;
                    }
                }
                break;
        }
    }
}
