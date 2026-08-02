package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import de.robv.android.xposed.XposedBridge;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ta implements xm0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ta(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    @Override // defpackage.xm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() throws PendingIntent.CanceledException {
        Object x92Var;
        int i;
        int i2 = 2;
        switch (this.h) {
            case 0:
                ci0.M((ua) this.i);
                return a83.a;
            case 1:
                return ((ry2) this.i).v0();
            case 2:
                Object[] objArr = (Object[]) this.i;
                objArr.getClass();
                return new t2(objArr);
            case 3:
                return (o62) this.i;
            case 4:
                return new tz2((qv1) this.i, 0.0f);
            case 5:
                return ((t91) this.i).d();
            case AIChatConfig.DefaultContextRounds /* 6 */:
                ((cz2) this.i).close();
                return a83.a;
            case 7:
                return Float.valueOf(((jx1) ((sz0) this.i).j).g());
            case 8:
                return (List) this.i;
            case 9:
                ((in0) this.i).j(new c0(29));
                return a83.a;
            case 10:
                qv0 qv0Var = (qv0) this.i;
                qv0Var.getClass();
                try {
                    qv0Var.D.j(2, 0, false);
                    break;
                } catch (IOException e) {
                    cg0 cg0Var = cg0.PROTOCOL_ERROR;
                    qv0Var.b(cg0Var, cg0Var, e);
                }
                return a83.a;
            case 11:
                return Float.valueOf(te.F(((j20) this.i).g()));
            case 12:
                Object systemService = ((View) ((sz0) this.i).i).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 13:
                return Integer.valueOf(((d91) this.i).g().n);
            case 14:
                return new BaseInputConnection(((u91) this.i).a, false);
            case 15:
                n31 n31Var = (n31) this.i;
                Object obj = a83.a;
                ThreadLocal threadLocal = am1.a;
                am1.c();
                if (!((Boolean) n31Var.a()).booleanValue()) {
                    try {
                        XposedBridge.log("[NukeNativePerf]native probe failed");
                        x92Var = obj;
                    } catch (Throwable th) {
                        x92Var = new x92(th);
                    }
                    if (x92Var instanceof x92) {
                        Log.println(6, "NukeNativePerf", "native probe failed");
                    }
                }
                return obj;
            case 16:
                return Float.valueOf(((Number) ((ep1) this.i).b.d()).floatValue());
            case 17:
                return new mt1((ot1) this.i);
            case 18:
                bc2 bc2Var = (bc2) this.i;
                wc2 wc2Var = bc2Var.h;
                Object obj2 = bc2Var.k;
                if (obj2 != null) {
                    return wc2Var.m(bc2Var, obj2);
                }
                s.j("Value should be initialized");
                return null;
            case 19:
                rc2 rc2Var = ((ic2) this.i).j;
                if (rc2Var == null) {
                    return null;
                }
                Bundle bundleL = tl.l((ow1[]) Arrays.copyOf(new ow1[0], 0));
                rc2Var.b(bundleL);
                if (bundleL.isEmpty()) {
                    return null;
                }
                return bundleL;
            case AIChatConfig.MaxContextRounds /* 20 */:
                tc2 tc2Var = (tc2) this.i;
                tc2Var.getLifecycle().a(new n62(0, tc2Var));
                return a83.a;
            case 21:
                vn1 vn1Var = (vn1) ((dq1) this.i).i;
                return ((df2) vn1Var.d).d.d(((u22) vn1Var.b).a);
            case 22:
                pl2 pl2Var = (pl2) this.i;
                t8 t8Var = (t8) p40.p(pl2Var, xv1.a);
                pl2Var.G = t8Var;
                pl2Var.H = t8Var != null ? new s8(t8Var.a, t8Var.b, t8Var.c, t8Var.d) : null;
                return a83.a;
            case 23:
                return this.i;
            case 24:
                ap2 ap2Var = (ap2) this.i;
                return Integer.valueOf(sp0.F(ap2Var, ap2Var.j));
            case 25:
                aq2 aq2Var = (aq2) this.i;
                nx1 nx1Var = aq2Var.j;
                if (((gr2) nx1Var.getValue()).a == 9205357640488583168L || gr2.c(((gr2) nx1Var.getValue()).a)) {
                    return null;
                }
                return aq2Var.h.b(((gr2) nx1Var.getValue()).a);
            case 26:
                ts2 ts2Var = (ts2) this.i;
                while (true) {
                    synchronized (ts2Var.g) {
                        try {
                            if (!ts2Var.c) {
                                ts2Var.c = true;
                                try {
                                    zk1 zk1Var = ts2Var.f;
                                    Object[] objArr2 = zk1Var.h;
                                    int i3 = zk1Var.j;
                                    int i4 = 0;
                                    while (i4 < i3) {
                                        ss2 ss2Var = (ss2) objArr2[i4];
                                        sk1 sk1Var = ss2Var.g;
                                        in0 in0Var = ss2Var.a;
                                        Object[] objArr3 = sk1Var.b;
                                        long[] jArr = sk1Var.a;
                                        int length = jArr.length - i2;
                                        if (length >= 0) {
                                            int i5 = 0;
                                            while (true) {
                                                long j = jArr[i5];
                                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i6 = 8;
                                                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                                                    int i8 = 0;
                                                    while (i8 < i7) {
                                                        if ((j & 255) < 128) {
                                                            i = i6;
                                                            in0Var.j(objArr3[(i5 << 3) + i8]);
                                                        } else {
                                                            i = i6;
                                                        }
                                                        j >>= i;
                                                        i8++;
                                                        i6 = i;
                                                    }
                                                    if (i7 == i6) {
                                                        if (i5 != length) {
                                                            i5++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        sk1Var.b();
                                        i4++;
                                        i2 = 2;
                                    }
                                    ts2Var.c = false;
                                } catch (Throwable th2) {
                                    ts2Var.c = false;
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (!ts2Var.b()) {
                        return a83.a;
                    }
                    i2 = 2;
                }
                break;
            case 27:
                PendingIntent actionIntent = ((RemoteAction) this.i).getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        actionIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                    } catch (PendingIntent.CanceledException e2) {
                        Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e2);
                    }
                    break;
                } else {
                    actionIntent.send();
                }
                return a83.a;
            case 28:
                fz2 fz2Var = (fz2) this.i;
                return fz2Var.u ? pp0.o(fz2Var) : qy2.b;
            default:
                l13 l13Var = (l13) this.i;
                l13Var.F = null;
                qp0.E(l13Var);
                gf1.A(l13Var);
                ci0.M(l13Var);
                return Boolean.TRUE;
        }
    }
}
