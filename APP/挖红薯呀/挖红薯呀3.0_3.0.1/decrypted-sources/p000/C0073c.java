package p000;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import p000.vf0;
import top.anjao2024.xp1whs.MainActivity;

/* JADX INFO: renamed from: c */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0073c implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f616d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f617e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f618f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0073c(int i, Object obj, Object obj2) {
        this.f616d = i;
        this.f617e = obj;
        this.f618f = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        Object objM1638h0;
        int i = 2;
        int i2 = 1;
        switch (this.f616d) {
            case 0:
                ((xg0) this.f617e).m5136c((is0) this.f618f);
                return na1.f4229a;
            case 1:
                C0503n9 c0503n9 = (C0503n9) this.f617e;
                C0542o9 c0542o9 = (C0542o9) this.f618f;
                na1 na1Var = na1.f4229a;
                d81 d81Var = c0503n9.f4209r;
                if (d81Var != null) {
                    d81Var.m662b();
                }
                c0503n9.f4209r = null;
                C0550og c0550og = c0542o9.f4488b;
                if (c0550og != null) {
                    do {
                        objM1638h0 = c0550og.m1638h0(c0550og.m1622N(), na1Var);
                        if (objM1638h0 != s91.f5710l && objM1638h0 != s91.f5711m) {
                        }
                    } while (objM1638h0 == s91.f5712n);
                }
                c0542o9.f4488b = null;
                return na1Var;
            case 2:
                C0118d6 c0118d6 = (C0118d6) this.f617e;
                pf1 pf1Var = (pf1) this.f618f;
                d60 d60Var = (d60) obj;
                d60Var.m648a();
                InterfaceC0812uq.m4337h0(d60Var, c0118d6, pf1Var, 0.0f, null, 60);
                return na1.f4229a;
            case 3:
                wm0 wm0Var = (wm0) this.f617e;
                pf1 pf1Var2 = (pf1) this.f618f;
                d60 d60Var2 = (d60) obj;
                d60Var2.m648a();
                InterfaceC0812uq.m4337h0(d60Var2, wm0Var.f7150a, pf1Var2, 0.0f, null, 60);
                return na1.f4229a;
            case 4:
                ((C0166eb) this.f617e).f1367a.m4080j((C0965yj) this.f618f);
                return na1.f4229a;
            case 5:
                ((xg0) this.f617e).m5136c((f30) this.f618f);
                return na1.f4229a;
            case 6:
                ((C0300hy) this.f617e).f2372f.removeCallbacks((RunnableC0263gy) this.f618f);
                return na1.f4229a;
            case 7:
                return m00.m2167P2((String) this.f617e, (m00) this.f618f, (Bitmap) obj);
            case 8:
                return m00.m2326x2((String) this.f617e, (ImageView) this.f618f, (Bitmap) obj);
            case 9:
                f90 f90Var = (f90) this.f617e;
                Object obj2 = this.f618f;
                f90Var.f1633f.m1898i(obj2);
                return new C0498n4(i, f90Var, obj2);
            case 10:
                return new f90((zw0) this.f617e, (Map) obj, (yw0) this.f618f);
            case 11:
                return MainActivity.onCreate$lambda$4$lambda$3$lambda$2$lambda$1((MainActivity) this.f617e, (oh0) this.f618f, ((Boolean) obj).booleanValue());
            case 12:
                return vf0.m4492D3((SharedPreferences) this.f617e, (vf0.C0850l) this.f618f, ((Boolean) obj).booleanValue());
            case 13:
                return vf0.m4703x3((SharedPreferences) this.f617e, (vf0.C0849k) this.f618f, ((Boolean) obj).booleanValue());
            case 14:
                in0 in0Var = (in0) this.f617e;
                xq0 xq0Var = (xq0) this.f618f;
                wq0 wq0Var = (wq0) obj;
                boolean z = in0Var.f2591v;
                float f = in0Var.f2587r;
                if (z) {
                    wq0.m5017k(wq0Var, xq0Var, wq0Var.mo641F(f), wq0Var.mo641F(in0Var.f2588s));
                } else {
                    wq0.m5015i(wq0Var, xq0Var, wq0Var.mo641F(f), wq0Var.mo641F(in0Var.f2588s));
                }
                return na1.f4229a;
            case j50.f2734e /* 15 */:
                oh0 oh0Var = (oh0) this.f617e;
                wq0 wq0Var2 = (wq0) obj;
                yc0 yc0Var = new yc0(i2, (ArrayList) this.f618f);
                wq0Var2.f7170d = true;
                yc0Var.invoke(wq0Var2);
                wq0Var2.f7170d = false;
                oh0Var.getValue();
                return na1.f4229a;
            case 16:
                C0964yi c0964yi = (C0964yi) this.f617e;
                kh0 kh0Var = (kh0) this.f618f;
                c0964yi.m5258A(obj);
                if (kh0Var != null) {
                    kh0Var.m1890a(obj);
                }
                return na1.f4229a;
            case 17:
                ot0 ot0Var = (ot0) this.f617e;
                Throwable th = (Throwable) this.f618f;
                Throwable th2 = (Throwable) obj;
                synchronized (ot0Var.f4633c) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                AbstractC0398kl.m1920f(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    ot0Var.f4635e = th;
                    z31 z31Var = ot0Var.f4651u;
                    jt0 jt0Var = jt0.f2941d;
                    z31Var.getClass();
                    z31Var.m5413j(null, jt0Var);
                }
                return na1.f4229a;
            case 18:
                ((uh0) this.f617e).f6227a.setValue(new C0258gt((fd1) this.f618f, (fd1) obj));
                return na1.f4229a;
            case 19:
                jz0 jz0Var = (jz0) this.f617e;
                lz0 lz0Var = (lz0) this.f618f;
                C0027aq c0027aq = (C0027aq) obj;
                float f2 = c0027aq.f234b ? -1.0f : 1.0f;
                long j = c0027aq.f233a;
                jz0Var.m1741a(1, ok0.m2935f(f2, lz0Var.f3624d == um0.f6265e ? ok0.m2930a(1, j) : ok0.m2930a(2, j)));
                return na1.f4229a;
            case 20:
                AbstractC0307i4.m1547w((InterfaceC0966yk) this.f617e, null, new b41((b91) this.f618f, null), 1);
                return new a91();
            case 21:
                b91 b91Var = (b91) this.f617e;
                b91 b91Var2 = (b91) this.f618f;
                b91Var.f468j.add(b91Var2);
                return new C0498n4(3, b91Var, b91Var2);
            case 22:
                return new C0498n4(4, (b91) this.f617e, (w81) this.f618f);
            case 23:
                va1 va1Var = (va1) this.f617e;
                InterfaceC0742sw interfaceC0742sw = (InterfaceC0742sw) this.f618f;
                ((Long) obj).getClass();
                float f3 = va1Var.f6631e;
                va1Var.f6631e = 0.0f;
                interfaceC0742sw.invoke(Float.valueOf(f3));
                return na1.f4229a;
            case 24:
                de1 de1Var = (de1) this.f617e;
                View view = (View) this.f618f;
                m20 m20Var = de1Var.f1083u;
                if (de1Var.f1082t == 0) {
                    int i3 = kc1.f3078a;
                    gc1.m1236a(view, m20Var);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(m20Var);
                    kc1.m1788a(view, m20Var);
                }
                de1Var.f1082t++;
                return new C0498n4(5, de1Var, view);
            default:
                return kf1.m1807I0((kf1) this.f617e, (Activity) this.f618f, ((Boolean) obj).booleanValue());
        }
    }
}
