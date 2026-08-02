package p000;

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
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: ta */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0727ta implements xm0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f10651h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f10652i;

    public /* synthetic */ C0727ta(int i, Object obj) {
        this.f10651h = i;
        this.f10652i = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6a() throws PendingIntent.CanceledException {
        Object x92Var;
        int i;
        int i2 = 2;
        switch (this.f10651h) {
            case 0:
                ci0.m788M((C0766ua) this.f10652i);
                return a83.f116a;
            case 1:
                return ((ry2) this.f10652i).mo1769v0();
            case 2:
                Object[] objArr = (Object[]) this.f10652i;
                objArr.getClass();
                return new C0717t2(objArr);
            case 3:
                return (o62) this.f10652i;
            case 4:
                return new tz2((qv1) this.f10652i, 0.0f);
            case 5:
                return ((t91) this.f10652i).m5146d();
            case AIChatConfig.DefaultContextRounds /* 6 */:
                ((cz2) this.f10652i).close();
                return a83.f116a;
            case 7:
                return Float.valueOf(((jx1) ((sz0) this.f10652i).f10437j).m2591g());
            case 8:
                return (List) this.f10652i;
            case 9:
                ((in0) this.f10652i).mo5j(new C0074c0(29));
                return a83.f116a;
            case 10:
                qv0 qv0Var = (qv0) this.f10652i;
                qv0Var.getClass();
                try {
                    qv0Var.f9183D.m6352j(2, 0, false);
                    break;
                } catch (IOException e) {
                    cg0 cg0Var = cg0.PROTOCOL_ERROR;
                    qv0Var.m4281b(cg0Var, cg0Var, e);
                }
                return a83.f116a;
            case 11:
                return Float.valueOf(AbstractC0731te.m5177F(((j20) this.f10652i).mo705g()));
            case 12:
                Object systemService = ((View) ((sz0) this.f10652i).f10436i).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 13:
                return Integer.valueOf(((d91) this.f10652i).m973g().f12887n);
            case 14:
                return new BaseInputConnection(((u91) this.f10652i).f11157a, false);
            case 15:
                n31 n31Var = (n31) this.f10652i;
                Object obj = a83.f116a;
                ThreadLocal threadLocal = am1.f250a;
                am1.m203c();
                if (!((Boolean) n31Var.mo6a()).booleanValue()) {
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
                return Float.valueOf(((Number) ((ep1) this.f10652i).f2549b.m4788d()).floatValue());
            case 17:
                return new mt1((ot1) this.f10652i);
            case 18:
                bc2 bc2Var = (bc2) this.f10652i;
                wc2 wc2Var = bc2Var.f778h;
                Object obj2 = bc2Var.f781k;
                if (obj2 != null) {
                    return wc2Var.mo138m(bc2Var, obj2);
                }
                C0676s.m4651j("Value should be initialized");
                return null;
            case 19:
                rc2 rc2Var = ((ic2) this.f10652i).f4558j;
                if (rc2Var == null) {
                    return null;
                }
                Bundle bundleM5313l = AbstractC0738tl.m5313l((ow1[]) Arrays.copyOf(new ow1[0], 0));
                rc2Var.m4433b(bundleM5313l);
                if (bundleM5313l.isEmpty()) {
                    return null;
                }
                return bundleM5313l;
            case AIChatConfig.MaxContextRounds /* 20 */:
                tc2 tc2Var = (tc2) this.f10652i;
                tc2Var.getLifecycle().mo505a(new n62(0, tc2Var));
                return a83.f116a;
            case 21:
                vn1 vn1Var = (vn1) ((dq1) this.f10652i).f2147i;
                return ((df2) vn1Var.f12033d).f2026d.mo686d(((u22) vn1Var.f12031b).f11075a);
            case 22:
                pl2 pl2Var = (pl2) this.f10652i;
                C0725t8 c0725t8 = (C0725t8) p40.m3733p(pl2Var, xv1.f13194a);
                pl2Var.f8397G = c0725t8;
                pl2Var.f8398H = c0725t8 != null ? new C0685s8(c0725t8.f10599a, c0725t8.f10600b, c0725t8.f10601c, c0725t8.f10602d) : null;
                return a83.f116a;
            case 23:
                return this.f10652i;
            case 24:
                ap2 ap2Var = (ap2) this.f10652i;
                return Integer.valueOf(sp0.m4910F(ap2Var, ap2Var.f330j));
            case 25:
                aq2 aq2Var = (aq2) this.f10652i;
                nx1 nx1Var = aq2Var.f338j;
                if (((gr2) nx1Var.getValue()).f3684a == 9205357640488583168L || gr2.m2021c(((gr2) nx1Var.getValue()).f3684a)) {
                    return null;
                }
                return aq2Var.f336h.mo507b(((gr2) nx1Var.getValue()).f3684a);
            case 26:
                ts2 ts2Var = (ts2) this.f10652i;
                while (true) {
                    synchronized (ts2Var.f10953g) {
                        try {
                            if (!ts2Var.f10949c) {
                                ts2Var.f10949c = true;
                                try {
                                    zk1 zk1Var = ts2Var.f10952f;
                                    Object[] objArr2 = zk1Var.f13934h;
                                    int i3 = zk1Var.f13936j;
                                    int i4 = 0;
                                    while (i4 < i3) {
                                        ss2 ss2Var = (ss2) objArr2[i4];
                                        sk1 sk1Var = ss2Var.f10355g;
                                        in0 in0Var = ss2Var.f10349a;
                                        Object[] objArr3 = sk1Var.f10175b;
                                        long[] jArr = sk1Var.f10174a;
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
                                                            in0Var.mo5j(objArr3[(i5 << 3) + i8]);
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
                                        sk1Var.m4883b();
                                        i4++;
                                        i2 = 2;
                                    }
                                    ts2Var.f10949c = false;
                                } catch (Throwable th2) {
                                    ts2Var.f10949c = false;
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (!ts2Var.m5435b()) {
                        return a83.f116a;
                    }
                    i2 = 2;
                }
                break;
            case 27:
                PendingIntent actionIntent = ((RemoteAction) this.f10652i).getActionIntent();
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
                return a83.f116a;
            case 28:
                fz2 fz2Var = (fz2) this.f10652i;
                return fz2Var.f10770u ? pp0.m3917o(fz2Var) : qy2.f9289b;
            default:
                l13 l13Var = (l13) this.f10652i;
                l13Var.f5886F = null;
                qp0.m4223E(l13Var);
                gf1.m1853A(l13Var);
                ci0.m788M(l13Var);
                return Boolean.TRUE;
        }
    }
}
