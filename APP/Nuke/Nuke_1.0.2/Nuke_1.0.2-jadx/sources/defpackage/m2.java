package defpackage;

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
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m2 implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ m2(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    /* JADX DEBUG: Class process forced to load method for inline: ra2.a(ra2):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
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
        int i = this.h;
        Boolean bool = null;
        Object x92Var2 = a83.a;
        int i2 = 0;
        Object obj = this.i;
        switch (i) {
            case 0:
                ((o2) obj).c();
                return;
            case 1:
                h7 h7Var = (h7) obj;
                Trace.beginSection("measureAndLayout");
                try {
                    h7Var.k.v(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        h7Var.g();
                        Trace.endSection();
                        h7Var.P = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 2:
                w7 w7Var = (w7) obj;
                boolean zH = w7Var.h();
                b7 b7Var = w7Var.h;
                if (zH) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        b7Var.v(true);
                        zj1 zj1Var = w7Var.r;
                        int[] iArr = zj1Var.b;
                        long[] jArr = zj1Var.a;
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
                                            if (w7Var.f().a(i6)) {
                                                j = j2;
                                            } else {
                                                j = j2;
                                                w7Var.k.add(new zz(i6, w7Var.q, a00.i, null));
                                                w7Var.o.s(x92Var2);
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
                        w7Var.j(b7Var.getSemanticsOwner().a(), w7Var.s);
                        Trace.endSection();
                        w7Var.d(w7Var.f());
                        w7Var.n();
                        w7Var.t = false;
                        return;
                    } finally {
                    }
                }
                return;
            case 3:
                ActionMode actionMode = ((nb) obj).h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 4:
                Object obj2 = ((jg3) obj).a.thisObject;
                obj2.getClass();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((ImageView) obj2, "rotation", 0.0f, 360.0f);
                cs.d.getClass();
                objectAnimatorOfFloat.setDuration(cs.q().a);
                objectAnimatorOfFloat.setRepeatCount(-1);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat.start();
                return;
            case 5:
                aw awVar = (aw) obj;
                Runnable runnable = awVar.i;
                if (runnable != null) {
                    runnable.run();
                    awVar.i = null;
                    return;
                }
                return;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                p80.a((p80) obj);
                return;
            case 7:
                ((s1) obj).a();
                return;
            case 8:
                ta taVar = (ta) obj;
                try {
                    ThreadLocal threadLocal = am1.a;
                    ThreadLocal threadLocal2 = am1.a;
                    ReentrantLock reentrantLock = am1.c;
                    reentrantLock.lock();
                    try {
                        Boolean bool2 = (Boolean) threadLocal2.get();
                        threadLocal2.set(Boolean.TRUE);
                        try {
                            am1.c();
                            taVar.a();
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
                vj[] vjVarArr = (vj[]) obj;
                pp1 pp1Var = pp1.a;
                try {
                    AtomicBoolean atomicBoolean = vr1.a;
                    String strB = vr1.b(pp1.d());
                    if (te.S(pp1.d())) {
                        vjVarArr.getClass();
                        ArrayList arrayList = new ArrayList();
                        boolean zF = pp1.f();
                        rg3.i = vjVarArr;
                        for (vj vjVar : vjVarArr) {
                            if (!(vjVar instanceof tb1)) {
                                if (vjVar instanceof gw) {
                                    arrayList.add(vjVar);
                                }
                                op0.q(vjVar, zF);
                            }
                        }
                        gw[] gwVarArr = (gw[]) arrayList.toArray(new gw[0]);
                        gwVarArr.getClass();
                        rg3.j = gwVarArr;
                        vr1.c(strB, pp1.d());
                    } else {
                        te.i0(vjVarArr, pp1.d());
                    }
                    x92Var = x92Var2;
                } catch (Throwable th2) {
                    x92Var = new x92(th2);
                }
                Throwable thA = y92.a(x92Var);
                if (thA != null) {
                    String string = "Nuke init failed: ".concat(fg1.Q(thA)).toString();
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
                b5 b5Var = q03Var.b;
                q03Var.n = null;
                zk1 zk1Var = q03Var.m;
                View view = q03Var.a;
                if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                    zk1Var.g();
                    return;
                }
                Object[] objArr = zk1Var.h;
                int i7 = zk1Var.j;
                Boolean boolValueOf = null;
                for (int i8 = 0; i8 < i7; i8++) {
                    p03 p03Var = (p03) objArr[i8];
                    int iOrdinal = p03Var.ordinal();
                    if (iOrdinal == 0) {
                        bool = Boolean.TRUE;
                    } else if (iOrdinal == 1) {
                        bool = Boolean.FALSE;
                    } else if (iOrdinal != 2 && iOrdinal != 3) {
                        c80.s();
                        return;
                    } else {
                        if (!t11.l(bool, Boolean.FALSE)) {
                            boolValueOf = Boolean.valueOf(p03Var == p03.j);
                        }
                    }
                    boolValueOf = bool;
                }
                zk1Var.g();
                if (t11.l(bool, Boolean.TRUE)) {
                    ((InputMethodManager) ((j71) b5Var.j).getValue()).restartInput((View) b5Var.i);
                }
                if (boolValueOf != null) {
                    if (boolValueOf.booleanValue()) {
                        ((hh1) ((hh1) b5Var.k).i).G();
                    } else {
                        ((hh1) ((hh1) b5Var.k).i).A();
                    }
                }
                if (t11.l(bool, Boolean.FALSE)) {
                    ((InputMethodManager) ((j71) b5Var.j).getValue()).restartInput((View) b5Var.i);
                    return;
                }
                return;
        }
    }
}
