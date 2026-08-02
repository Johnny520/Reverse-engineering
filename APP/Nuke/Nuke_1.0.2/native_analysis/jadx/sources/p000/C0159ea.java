package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: ea */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0159ea extends w51 implements xm0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f2368i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f2369j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0159ea(int i, Object obj) {
        super(0);
        this.f2368i = i;
        this.f2369j = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    @Override // p000.xm0
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6a() {
        C0220fy c0220fy;
        int i = this.f2368i;
        Context context = null;
        c61Var = null;
        c61 c61Var = null;
        context = null;
        boolean z = false;
        a83 a83Var = a83.f116a;
        Object obj = this.f2369j;
        switch (i) {
            case 0:
                AbstractC0731te.m5226o(((C0233ga) obj).f3373j, null);
                return a83Var;
            case 1:
                return a83Var;
            case 2:
                y33 y33Var = (y33) obj;
                Object objM6213c = y33Var.m6213c();
                if0 if0Var = if0.f4589j;
                if (objM6213c == if0Var && y33Var.f13292d.getValue() == if0Var) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                return new u70(((C0769ud) obj).f11235i);
            case 4:
                return (o62) obj;
            case 5:
                return new u70(((C0784us) obj).f11457j);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                boolean zM2041a = h11.m2041a(0L, 0L);
                View view = ((C0440lx) obj).f6348a;
                if (!zM2041a) {
                    return new k70(0L, AbstractC0691se.m4842m(view.getContext()).mo703y(s11.m4715q0(0L)));
                }
                Context context2 = view.getContext();
                Context baseContext = context2;
                while (baseContext instanceof ContextWrapper) {
                    if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
                        context = baseContext;
                        if (context == null) {
                        }
                    } else {
                        ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                        if (contextWrapper.getBaseContext() == null) {
                            if (context == null) {
                                Configuration configuration = context2.getResources().getConfiguration();
                                i70 i70VarM4842m = AbstractC0691se.m4842m(context2);
                                long jM3765a = AbstractC0570p7.m3765a(configuration.screenWidthDp, configuration.screenHeightDp);
                                long jMo694d0 = i70VarM4842m.mo694d0(jM3765a);
                                return new k70((((long) ((int) Float.intBitsToFloat((int) (jMo694d0 >> 32)))) << 32) | (((long) ((int) Float.intBitsToFloat((int) (jMo694d0 & 4294967295L)))) & 4294967295L), jM3765a);
                            }
                            nf3.f7145a.getClass();
                            of3 of3Var = mf3.f6635b;
                            of3Var.getClass();
                            ContextWrapper contextWrapper2 = (ContextWrapper) context;
                            int i2 = Build.VERSION.SDK_INT;
                            lf3 lf3VarMo1810d = (i2 >= 34 ? g70.f3336i : i2 >= 30 ? C0966zl.f13941i : C0700sn.f10220X).mo1810d(contextWrapper2, of3Var.f7669b);
                            long jHeight = (((long) lf3VarMo1810d.m2903a().height()) & 4294967295L) | (((long) lf3VarMo1810d.m2903a().width()) << 32);
                            return new k70(jHeight, AbstractC0691se.m4842m(context).mo703y(s11.m4715q0(jHeight)));
                        }
                        baseContext = contextWrapper.getBaseContext();
                    }
                }
                if (context == null) {
                }
                break;
            case 7:
                return i80.m2302e(((y70) obj).f13329c);
            case 8:
                g80 g80Var = (g80) obj;
                return "(" + AbstractC0142du.m1165u0(g80Var.f3348c, "", null, null, C0799v6.f11752E, 30) + ")" + i80.m2302e(g80Var.f3349d);
            case 9:
                return new y70(((ji0) obj).f5048k);
            case 10:
                ((pl0) obj).m3873O0();
                return a83Var;
            case 11:
                Object systemService = ((View) ((C0043b5) obj).f562i).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 12:
                v61 v61Var = ((r61) obj).f9373N;
                v61Var.f11795p.f6606F = true;
                qd1 qd1Var = v61Var.f11796q;
                if (qd1Var != null) {
                    qd1Var.f8920z = true;
                }
                return a83Var;
            case 13:
                x61 x61Var = (x61) obj;
                if (!((Boolean) x61Var.f12848g.getValue()).booleanValue() && (c0220fy = x61Var.f12844c) != null) {
                    c0220fy.m1741l();
                }
                return a83Var;
            case 14:
                le1 le1Var = (le1) ((na1) obj).f7082a.f6983i;
                if (!le1Var.f6078i) {
                    if (le1Var.f6079j) {
                        k22.m2599a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    le1Var.m2902a();
                    le1Var.f6079j = true;
                }
                return a83Var;
            case 15:
                return new g80(((ug1) obj).f11292k);
            case 16:
                return ((tm1) obj).f10848d;
            case 17:
                return ((xm1) obj).m6159M0();
            case 18:
                d22 d22Var = (d22) obj;
                c61 parentLayoutCoordinates = d22Var.getParentLayoutCoordinates();
                if (parentLayoutCoordinates != null && parentLayoutCoordinates.mo653w()) {
                    c61Var = parentLayoutCoordinates;
                }
                if (c61Var != null && d22Var.m6534getPopupContentSizebOM6tXw() != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 19:
                q62 q62Var = (q62) obj;
                q62Var.f8757h = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    q62Var.m4061a();
                    return a83Var;
                } finally {
                    Trace.endSection();
                }
            case AIChatConfig.MaxContextRounds /* 20 */:
                f71 f71VarM2233a = ((hw2) obj).m2233a();
                r61 r61Var = f71VarM2233a.f2826h;
                if (f71VarM2233a.f2839u != ((zk1) ((jk1) r61Var.m4383o()).f5084i).f13936j) {
                    rk1 rk1Var = f71VarM2233a.f2831m;
                    Object[] objArr = rk1Var.f9620c;
                    long[] jArr = rk1Var.f9618a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((255 & j) < 128) {
                                        ((x61) objArr[(i3 << 3) + i5]).f12845d = true;
                                    }
                                    j >>= 8;
                                }
                                if (i4 == 8) {
                                    if (i3 != length) {
                                        i3++;
                                    }
                                }
                            }
                        }
                    }
                    if (r61Var.f9391o != null) {
                        if (!r61Var.f9373N.f11784e) {
                            r61.m4340T(r61Var, false, 7);
                        }
                    } else if (!r61Var.m4385q()) {
                        r61.m4341V(r61Var, false, 7);
                    }
                }
                return a83Var;
            case 21:
                return new BaseInputConnection(((q03) obj).f8667a, false);
            default:
                ((u93) obj).f11175h.setValue(a83Var);
                return a83Var;
        }
    }
}
