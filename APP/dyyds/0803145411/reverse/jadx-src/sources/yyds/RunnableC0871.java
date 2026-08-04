package yyds;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.EditText;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: yyds.ᛴᛶᛳᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0871 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f3988;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f3989;

    public /* synthetic */ RunnableC0871(int i, Object obj) {
        this.f3988 = i;
        this.f3989 = obj;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0243  */
    /* JADX WARN: Type inference failed for: r12v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r2v19, types: [yyds.ᛵᲇᛲᛱ] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int paddingLeft;
        long j;
        long j2;
        int iM4493;
        ?? M4493;
        int height;
        AbstractC0677 abstractC0677M508;
        long jNanoTime;
        C1313 c1313;
        int i = 2;
        ?? r12 = 0;
        r12 = 0;
        r12 = 0;
        switch (this.f3988) {
            case 0:
                Process.setThreadPriority(10);
                ((Runnable) this.f3989).run();
                return;
            case 1:
                C0644 c0644 = (C0644) this.f3989;
                while (true) {
                    try {
                        c0644.m1549((C0501) ((ReferenceQueue) c0644.f3102).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            case 2:
                ViewOnTouchListenerC0386 viewOnTouchListenerC0386 = (ViewOnTouchListenerC0386) this.f3989;
                C2045 c2045 = viewOnTouchListenerC0386.f1974;
                C1651 c1651 = viewOnTouchListenerC0386.f1982;
                if (viewOnTouchListenerC0386.f1983) {
                    if (viewOnTouchListenerC0386.f1970) {
                        viewOnTouchListenerC0386.f1970 = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c1651.f8436 = jCurrentAnimationTimeMillis;
                        c1651.f8439 = -1L;
                        c1651.f8441 = jCurrentAnimationTimeMillis;
                        c1651.f8434 = 0.5f;
                    }
                    if ((c1651.f8439 > 0 && AnimationUtils.currentAnimationTimeMillis() > c1651.f8439 + ((long) c1651.f8435)) || !viewOnTouchListenerC0386.m1109()) {
                        viewOnTouchListenerC0386.f1983 = false;
                        return;
                    }
                    if (viewOnTouchListenerC0386.f1975) {
                        viewOnTouchListenerC0386.f1975 = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        c2045.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (c1651.f8441 == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fM3375 = c1651.m3375(jCurrentAnimationTimeMillis2);
                    long j3 = jCurrentAnimationTimeMillis2 - c1651.f8441;
                    c1651.f8441 = jCurrentAnimationTimeMillis2;
                    viewOnTouchListenerC0386.f1976.scrollListBy((int) (j3 * ((fM3375 * 4.0f) + ((-4.0f) * fM3375 * fM3375)) * c1651.f8442));
                    WeakHashMap weakHashMap = AbstractC1640.f8352;
                    c2045.postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                ((C1022) this.f3989).mo1719();
                return;
            case 4:
                ((DialogInterfaceOnCancelListenerC2238) this.f3989).f11041.getClass();
                return;
            case 5:
                C0291 c0291 = (C0291) this.f3989;
                while (c0291.f1553) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - c0291.f1551;
                    long j4 = c0291.f1547;
                    if (jCurrentTimeMillis < j4) {
                        float interpolation = jCurrentTimeMillis / j4;
                        Interpolator interpolator = c0291.f1552;
                        if (interpolator != null) {
                            interpolation = interpolator.getInterpolation(interpolation);
                        }
                        float f = c0291.f1548;
                        float f2 = ((c0291.f1543 - f) * interpolation) + f;
                        if (c0291.f1545 != null) {
                            Handler handler = c0291.f1546;
                            if (handler == null) {
                                handler = new Handler(Looper.getMainLooper());
                                c0291.f1546 = handler;
                            }
                            handler.post(new RunnableC2056(this, f2));
                        }
                    } else {
                        c0291.f1553 = false;
                        int i2 = c0291.f1544;
                        if (i2 == -1 || c0291.f1550 < i2) {
                            c0291.f1550++;
                            c0291.f1551 = System.currentTimeMillis();
                            c0291.f1553 = true;
                        }
                    }
                    try {
                        Thread.sleep(c0291.f1549);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                return;
            case 6:
                C2045 c20452 = (C2045) this.f3989;
                c20452.f10166 = null;
                c20452.drawableStateChanged();
                return;
            case 7:
                C2777 c2777 = (C2777) this.f3989;
                ValueAnimator valueAnimator = c2777.f13545;
                int i3 = c2777.f13536;
                if (i3 == 1) {
                    valueAnimator.cancel();
                } else if (i3 != 2) {
                    return;
                }
                c2777.f13536 = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 8:
                AbstractComponentCallbacksC2473 abstractComponentCallbacksC2473 = (AbstractComponentCallbacksC2473) this.f3989;
                if (abstractComponentCallbacksC2473.f12222 == null || abstractComponentCallbacksC2473.f12222 != null) {
                    return;
                }
                C0644 c06442 = new C0644(16, (boolean) r12);
                Object obj = AbstractComponentCallbacksC2473.f12218;
                c06442.f3099 = obj;
                c06442.f3102 = obj;
                c06442.f3101 = obj;
                abstractComponentCallbacksC2473.f12222 = c06442;
                return;
            case 9:
                ((C2791) this.f3989).m4910();
                throw null;
            case 10:
                C1877 c1877 = (C1877) this.f3989;
                AbstractC2450 abstractC2450 = c1877.f9442;
                if (c1877.f9463 != null) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    long j5 = c1877.f9460;
                    long j6 = j5 != Long.MIN_VALUE ? jCurrentTimeMillis2 - j5 : 0L;
                    AbstractC2551 layoutManager = c1877.f9450.getLayoutManager();
                    Rect rect = c1877.f9443;
                    if (rect == null) {
                        rect = new Rect();
                        c1877.f9443 = rect;
                    }
                    View view = c1877.f9463.f1093;
                    C1213 c1213 = layoutManager.f12600;
                    if (c1213 == null) {
                        rect.set(0, 0, 0, 0);
                    } else {
                        rect.set(c1213.m2450(view));
                    }
                    if (layoutManager.mo206()) {
                        int i4 = (int) (c1877.f9461 + c1877.f9441);
                        paddingLeft = (i4 - c1877.f9443.left) - c1877.f9450.getPaddingLeft();
                        float f3 = c1877.f9441;
                        if ((f3 >= 0.0f || paddingLeft >= 0) && (f3 <= 0.0f || (paddingLeft = ((c1877.f9463.f1093.getWidth() + i4) + c1877.f9443.right) - (c1877.f9450.getWidth() - c1877.f9450.getPaddingRight())) <= 0)) {
                            paddingLeft = 0;
                        }
                    }
                    if (layoutManager.mo174()) {
                        int i5 = (int) (c1877.f9458 + c1877.f9444);
                        int paddingTop = (i5 - c1877.f9443.top) - c1877.f9450.getPaddingTop();
                        float f4 = c1877.f9444;
                        if (f4 < 0.0f && paddingTop < 0) {
                            r12 = paddingTop;
                        } else if (f4 > 0.0f && (height = ((c1877.f9463.f1093.getHeight() + i5) + c1877.f9443.bottom) - (c1877.f9450.getHeight() - c1877.f9450.getPaddingBottom())) > 0) {
                            r12 = height;
                        }
                    }
                    if (paddingLeft != 0) {
                        C1213 c12132 = c1877.f9450;
                        int width = c1877.f9463.f1093.getWidth();
                        c1877.f9450.getWidth();
                        j = j6;
                        j2 = Long.MIN_VALUE;
                        iM4493 = abstractC2450.m4493(c12132, width, paddingLeft, j);
                    } else {
                        j = j6;
                        j2 = Long.MIN_VALUE;
                        iM4493 = paddingLeft;
                    }
                    if (r12 != 0) {
                        C1213 c12133 = c1877.f9450;
                        int height2 = c1877.f9463.f1093.getHeight();
                        c1877.f9450.getHeight();
                        M4493 = abstractC2450.m4493(c12133, height2, r12 == true ? 1 : 0, j);
                    } else {
                        M4493 = r12;
                    }
                    if (iM4493 == 0 && M4493 == 0) {
                        c1877.f9460 = j2;
                        return;
                    }
                    if (c1877.f9460 == j2) {
                        c1877.f9460 = jCurrentTimeMillis2;
                    }
                    c1877.f9450.scrollBy(iM4493, M4493);
                    AbstractC0185 abstractC0185 = c1877.f9463;
                    if (abstractC0185 != null) {
                        c1877.m3664(abstractC0185);
                    }
                    c1877.f9450.removeCallbacks(c1877.f9462);
                    C1213 c12134 = c1877.f9450;
                    WeakHashMap weakHashMap2 = AbstractC1640.f8352;
                    c12134.postOnAnimation(this);
                    return;
                }
                return;
            case 11:
                C2283 c2283 = (C2283) ((C0599) this.f3989).f2829;
                EditText editText = c2283.f11239;
                if (editText == null || !(((C1188) c2283.f11233).f5446 instanceof C2059)) {
                    return;
                }
                editText.requestFocus();
                c2283.f11239.setFocusableInTouchMode(true);
                ((C1188) c2283.f11233).m281(c2283.f11239, true);
                EditText editText2 = c2283.f11239;
                editText2.setSelection(editText2.getText().length());
                if (((C1188) c2283.f11233).f5440 != null) {
                    c2283.f11239.selectAll();
                    return;
                }
                return;
            case 12:
                C2283 c22832 = (C2283) this.f3989;
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) c22832.f11231;
                if (dialogXBaseRelativeLayout != null) {
                    dialogXBaseRelativeLayout.setVisibility(8);
                }
                AbstractC0041.m260(((C1188) c22832.f11233).m279());
                return;
            case 13:
                ((C0301) this.f3989).mo956();
                return;
            case 14:
                ComponentCallbacks2C2272 componentCallbacks2C2272 = (ComponentCallbacks2C2272) this.f3989;
                componentCallbacks2C2272.f11195.mo246(componentCallbacks2C2272);
                return;
            case 15:
                ((StaggeredGridLayoutManager) this.f3989).m225();
                return;
            case 16:
                C0105 c0105 = (C0105) this.f3989;
                synchronized (c0105) {
                    c0105.f744++;
                    abstractC0677M508 = c0105.m508();
                }
                if (abstractC0677M508 == null) {
                    return;
                }
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                do {
                    AbstractC0677 abstractC0677 = abstractC0677M508;
                    try {
                        threadCurrentThread.setName(abstractC0677.f3223);
                        Logger logger = ((C0105) this.f3989).f743;
                        C0153 c0153 = abstractC0677.f3225;
                        boolean zIsLoggable = logger.isLoggable(Level.FINE);
                        if (zIsLoggable) {
                            C0105 c01052 = c0153.f950;
                            jNanoTime = System.nanoTime();
                            AbstractC2328.m4331(logger, abstractC0677, c0153, "starting");
                        } else {
                            jNanoTime = -1;
                        }
                        try {
                            long jMo426 = abstractC0677.mo426();
                            if (zIsLoggable) {
                                C0105 c01053 = c0153.f950;
                                AbstractC2328.m4331(logger, abstractC0677, c0153, "finished run in " + AbstractC2328.m4339(System.nanoTime() - jNanoTime));
                            }
                            C0105 c01054 = (C0105) this.f3989;
                            synchronized (c01054) {
                                c01054.m507(abstractC0677, jMo426, true);
                                abstractC0677M508 = c01054.m508();
                            }
                        } catch (Throwable th) {
                            if (zIsLoggable) {
                                C0105 c01055 = c0153.f950;
                                AbstractC2328.m4331(logger, abstractC0677, c0153, "failed a run in " + AbstractC2328.m4339(System.nanoTime() - jNanoTime));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            C0105 c01056 = (C0105) this.f3989;
                            synchronized (c01056) {
                                c01056.m507(abstractC0677, -1L, false);
                                if (!(th2 instanceof InterruptedException)) {
                                    throw th2;
                                }
                                Thread.currentThread().interrupt();
                            }
                        } catch (Throwable th3) {
                            threadCurrentThread.setName(name);
                            throw th3;
                        }
                    }
                } while (abstractC0677M508 != null);
                threadCurrentThread.setName(name);
                return;
            case 17:
                ActionMenuView actionMenuView = ((Toolbar) this.f3989).f234;
                if (actionMenuView == null || (c1313 = actionMenuView.f139) == null) {
                    return;
                }
                c1313.m2604();
                return;
            case 18:
                C2458 c2458 = (C2458) ((C0599) this.f3989).f2829;
                if (c2458.f12153.m282() == null) {
                    return;
                }
                C1624 c1624 = c2458.f12153;
                C2207 c2207 = c1624.f8270;
                if (c2207 == null) {
                    c2207 = new C2207(i, c2458);
                    c1624.f8270 = c2207;
                }
                c2207.m4196(c1624);
                new C1344().m2748();
                c2458.f12153.m291(EnumC1464.f6968);
                return;
            case 19:
                C2458 c24582 = ((RunnableC2177) this.f3989).f10664;
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout2 = c24582.f12151;
                if (dialogXBaseRelativeLayout2 != null) {
                    dialogXBaseRelativeLayout2.setVisibility(8);
                }
                WeakReference weakReference = c24582.f12153.f8271;
                AbstractC0041.m260(weakReference != null ? (View) weakReference.get() : null);
                return;
            default:
                C2458 c24583 = (C2458) ((RunnableC1873) this.f3989).f9425.f6712;
                if (c24583.f12153.f8269 > -1) {
                    c24583.m4498(null);
                    return;
                }
                return;
        }
    }
}
