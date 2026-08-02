package p000;

import android.animation.ObjectAnimator;
import android.os.Trace;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import de.robv.android.xposed.XposedBridge;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: m2 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0446m2 implements Runnable {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f6438h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f6439i;

    public /* synthetic */ RunnableC0446m2(int i, Object obj) {
        this.f6438h = i;
        this.f6439i = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x02cd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02d1, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        Object x92Var;
        View viewFindFocus;
        int i = this.f6438h;
        Boolean bool = null;
        Object x92Var2 = a83.f116a;
        int i2 = 0;
        Object obj = this.f6439i;
        switch (i) {
            case 0:
                ((AbstractC0526o2) obj).m3465c();
                return;
            case 1:
                ViewOnAttachStateChangeListenerC0267h7 viewOnAttachStateChangeListenerC0267h7 = (ViewOnAttachStateChangeListenerC0267h7) obj;
                Trace.beginSection("measureAndLayout");
                try {
                    viewOnAttachStateChangeListenerC0267h7.f3864k.m478v(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        viewOnAttachStateChangeListenerC0267h7.m2101g();
                        Trace.endSection();
                        viewOnAttachStateChangeListenerC0267h7.f3859P = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 2:
                ViewOnAttachStateChangeListenerC0837w7 viewOnAttachStateChangeListenerC0837w7 = (ViewOnAttachStateChangeListenerC0837w7) obj;
                boolean zM5853h = viewOnAttachStateChangeListenerC0837w7.m5853h();
                ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = viewOnAttachStateChangeListenerC0837w7.f12368h;
                if (zM5853h) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        viewTreeObserverOnGlobalLayoutListenerC0045b7.m478v(true);
                        zj1 zj1Var = viewOnAttachStateChangeListenerC0837w7.f12378r;
                        int[] iArr = zj1Var.f12750b;
                        long[] jArr = zj1Var.f12749a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j2 = jArr[i3];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                                    for (int i5 = i2; i5 < i4; i5++) {
                                        if ((255 & j2) < 128) {
                                            int i6 = iArr[(i3 << 3) + i5];
                                            if (viewOnAttachStateChangeListenerC0837w7.m5852f().m6021a(i6)) {
                                                j = j2;
                                            } else {
                                                j = j2;
                                                viewOnAttachStateChangeListenerC0837w7.f12371k.add(new C0980zz(i6, viewOnAttachStateChangeListenerC0837w7.f12377q, a00.f6i, null));
                                                viewOnAttachStateChangeListenerC0837w7.f12375o.mo2225s(x92Var2);
                                            }
                                        }
                                        j2 = j >> 8;
                                    }
                                    if (i4 == 8) {
                                        if (i3 != length) {
                                            i3++;
                                            i2 = 0;
                                        }
                                    }
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        viewOnAttachStateChangeListenerC0837w7.m5855j(viewTreeObserverOnGlobalLayoutListenerC0045b7.getSemanticsOwner().m5334a(), viewOnAttachStateChangeListenerC0837w7.f12379s);
                        Trace.endSection();
                        viewOnAttachStateChangeListenerC0837w7.m5851d(viewOnAttachStateChangeListenerC0837w7.m5852f());
                        viewOnAttachStateChangeListenerC0837w7.m5859n();
                        viewOnAttachStateChangeListenerC0837w7.f12380t = false;
                        return;
                    } finally {
                    }
                }
                return;
            case 3:
                ActionMode actionMode = ((C0492nb) obj).f7098h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 4:
                Object obj2 = ((jg3) obj).f5028a.thisObject;
                obj2.getClass();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((ImageView) obj2, "rotation", 0.0f, 360.0f);
                C0104cs.f1702d.getClass();
                objectAnimatorOfFloat.setDuration(C0104cs.m884q().f1000a);
                objectAnimatorOfFloat.setRepeatCount(-1);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat.start();
                return;
            case 5:
                ViewTreeObserverOnDrawListenerC0033aw viewTreeObserverOnDrawListenerC0033aw = (ViewTreeObserverOnDrawListenerC0033aw) obj;
                Runnable runnable = viewTreeObserverOnDrawListenerC0033aw.f413i;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0033aw.f413i = null;
                    return;
                }
                return;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                p80.m3793a((p80) obj);
                return;
            case 7:
                ((C0678s1) obj).mo6a();
                return;
            case 8:
                C0727ta c0727ta = (C0727ta) obj;
                try {
                    ThreadLocal threadLocal = am1.f250a;
                    ThreadLocal threadLocal2 = am1.f250a;
                    ReentrantLock reentrantLock = am1.f252c;
                    reentrantLock.lock();
                    try {
                        Boolean bool2 = (Boolean) threadLocal2.get();
                        threadLocal2.set(Boolean.TRUE);
                        try {
                            am1.m203c();
                            c0727ta.mo6a();
                            return;
                        } finally {
                            threadLocal2.set(bool2);
                        }
                    } finally {
                        reentrantLock.unlock();
                    }
                } finally {
                    try {
                        break;
                    } catch (Throwable th) {
                    }
                }
            case 9:
                AbstractC0812vj[] abstractC0812vjArr = (AbstractC0812vj[]) obj;
                pp1 pp1Var = pp1.f8445a;
                try {
                    AtomicBoolean atomicBoolean = vr1.f12145a;
                    String strM5781b = vr1.m5781b(pp1.m3932d());
                    if (AbstractC0731te.m5190S(pp1.m3932d())) {
                        abstractC0812vjArr.getClass();
                        ArrayList arrayList = new ArrayList();
                        boolean zM3934f = pp1.m3934f();
                        rg3.f9567i = abstractC0812vjArr;
                        for (AbstractC0812vj abstractC0812vj : abstractC0812vjArr) {
                            if (!(abstractC0812vj instanceof tb1)) {
                                if (abstractC0812vj instanceof AbstractC0255gw) {
                                    arrayList.add(abstractC0812vj);
                                }
                                op0.m3594q(abstractC0812vj, zM3934f);
                            }
                        }
                        AbstractC0255gw[] abstractC0255gwArr = (AbstractC0255gw[]) arrayList.toArray(new AbstractC0255gw[0]);
                        abstractC0255gwArr.getClass();
                        rg3.f9568j = abstractC0255gwArr;
                        vr1.m5782c(strM5781b, pp1.m3932d());
                    } else {
                        AbstractC0731te.m5215i0(abstractC0812vjArr, pp1.m3932d());
                    }
                    x92Var = x92Var2;
                } catch (Throwable th2) {
                    x92Var = new x92(th2);
                }
                Throwable thM6237a = y92.m6237a(x92Var);
                if (thM6237a != null) {
                    String string = "Nuke init failed: ".concat(fg1.m1624Q(thM6237a)).toString();
                    try {
                        XposedBridge.log("[NukeCore]" + string);
                        break;
                    } catch (Throwable th3) {
                        x92Var2 = new x92(th3);
                    }
                    if (x92Var2 instanceof x92) {
                        Log.println(6, "NukeCore", string);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ra2.setRippleState$lambda$1((ra2) obj);
                return;
            default:
                q03 q03Var = (q03) obj;
                C0043b5 c0043b5 = q03Var.f8668b;
                q03Var.f8680n = null;
                zk1 zk1Var = q03Var.f8679m;
                View view = q03Var.f8667a;
                if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    zk1Var.m6428g();
                    return;
                }
                Object[] objArr = zk1Var.f13934h;
                int i7 = zk1Var.f13936j;
                Boolean boolValueOf = null;
                for (int i8 = 0; i8 < i7; i8++) {
                    p03 p03Var = (p03) objArr[i8];
                    int iOrdinal = p03Var.ordinal();
                    if (iOrdinal == 0) {
                        bool = Boolean.TRUE;
                    } else if (iOrdinal == 1) {
                        bool = Boolean.FALSE;
                    } else if (iOrdinal != 2 && iOrdinal != 3) {
                        c80.m675s();
                        return;
                    } else {
                        if (!t11.m5086l(bool, Boolean.FALSE)) {
                            boolValueOf = Boolean.valueOf(p03Var == p03.f7917j);
                        }
                    }
                    boolValueOf = bool;
                }
                zk1Var.m6428g();
                if (t11.m5086l(bool, Boolean.TRUE)) {
                    ((InputMethodManager) ((j71) c0043b5.f563j).getValue()).restartInput((View) c0043b5.f562i);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((hh1) ((hh1) c0043b5.f564k).f4019i).mo1419G();
                    } else {
                        ((hh1) ((hh1) c0043b5.f564k).f4019i).mo1418A();
                    }
                }
                if (t11.m5086l(bool, Boolean.FALSE)) {
                    ((InputMethodManager) ((j71) c0043b5.f563j).getValue()).restartInput((View) c0043b5.f562i);
                    return;
                }
                return;
        }
    }
}
