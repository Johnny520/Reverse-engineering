package defpackage;

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
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ea extends w51 implements xm0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea(int i, Object obj) {
        super(0);
        this.i = i;
        this.j = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    @Override // defpackage.xm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        fy fyVar;
        int i = this.i;
        Context context = null;
        c61Var = null;
        c61 c61Var = null;
        context = null;
        boolean z = false;
        a83 a83Var = a83.a;
        Object obj = this.j;
        switch (i) {
            case 0:
                te.o(((ga) obj).j, null);
                return a83Var;
            case 1:
                return a83Var;
            case 2:
                y33 y33Var = (y33) obj;
                Object objC = y33Var.c();
                if0 if0Var = if0.j;
                if (objC == if0Var && y33Var.d.getValue() == if0Var) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                return new u70(((ud) obj).i);
            case 4:
                return (o62) obj;
            case 5:
                return new u70(((us) obj).j);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                boolean zA = h11.a(0L, 0L);
                View view = ((lx) obj).a;
                if (!zA) {
                    return new k70(0L, se.m(view.getContext()).y(s11.q0(0L)));
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
                                i70 i70VarM = se.m(context2);
                                long jA = p7.a(configuration.screenWidthDp, configuration.screenHeightDp);
                                long jD0 = i70VarM.d0(jA);
                                return new k70((((long) ((int) Float.intBitsToFloat((int) (jD0 >> 32)))) << 32) | (((long) ((int) Float.intBitsToFloat((int) (jD0 & 4294967295L)))) & 4294967295L), jA);
                            }
                            nf3.a.getClass();
                            of3 of3Var = mf3.b;
                            of3Var.getClass();
                            ContextWrapper contextWrapper2 = (ContextWrapper) context;
                            int i2 = Build.VERSION.SDK_INT;
                            lf3 lf3VarD = (i2 >= 34 ? g70.i : i2 >= 30 ? zl.i : sn.X).d(contextWrapper2, of3Var.b);
                            long jHeight = (((long) lf3VarD.a().height()) & 4294967295L) | (((long) lf3VarD.a().width()) << 32);
                            return new k70(jHeight, se.m(context).y(s11.q0(jHeight)));
                        }
                        baseContext = contextWrapper.getBaseContext();
                    }
                }
                if (context == null) {
                }
                break;
            case 7:
                return i80.e(((y70) obj).c);
            case 8:
                g80 g80Var = (g80) obj;
                return "(" + du.u0(g80Var.c, "", null, null, v6.E, 30) + ")" + i80.e(g80Var.d);
            case 9:
                return new y70(((ji0) obj).k);
            case 10:
                ((pl0) obj).O0();
                return a83Var;
            case 11:
                Object systemService = ((View) ((b5) obj).i).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 12:
                v61 v61Var = ((r61) obj).N;
                v61Var.p.F = true;
                qd1 qd1Var = v61Var.q;
                if (qd1Var != null) {
                    qd1Var.z = true;
                }
                return a83Var;
            case 13:
                x61 x61Var = (x61) obj;
                if (!((Boolean) x61Var.g.getValue()).booleanValue() && (fyVar = x61Var.c) != null) {
                    fyVar.l();
                }
                return a83Var;
            case 14:
                le1 le1Var = (le1) ((na1) obj).a.i;
                if (!le1Var.i) {
                    if (le1Var.j) {
                        k22.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    le1Var.a();
                    le1Var.j = true;
                }
                return a83Var;
            case 15:
                return new g80(((ug1) obj).k);
            case 16:
                return ((tm1) obj).d;
            case 17:
                return ((xm1) obj).M0();
            case 18:
                d22 d22Var = (d22) obj;
                c61 parentLayoutCoordinates = d22Var.getParentLayoutCoordinates();
                if (parentLayoutCoordinates != null && parentLayoutCoordinates.w()) {
                    c61Var = parentLayoutCoordinates;
                }
                if (c61Var != null && d22Var.m12getPopupContentSizebOM6tXw() != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 19:
                q62 q62Var = (q62) obj;
                q62Var.h = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    q62Var.a();
                    return a83Var;
                } finally {
                    Trace.endSection();
                }
            case AIChatConfig.MaxContextRounds /* 20 */:
                f71 f71VarA = ((hw2) obj).a();
                r61 r61Var = f71VarA.h;
                if (f71VarA.u != ((zk1) ((jk1) r61Var.o()).i).j) {
                    rk1 rk1Var = f71VarA.m;
                    Object[] objArr = rk1Var.c;
                    long[] jArr = rk1Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((255 & j) < 128) {
                                        ((x61) objArr[(i3 << 3) + i5]).d = true;
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
                    if (r61Var.o != null) {
                        if (!r61Var.N.e) {
                            r61.T(r61Var, false, 7);
                        }
                    } else if (!r61Var.q()) {
                        r61.V(r61Var, false, 7);
                    }
                }
                return a83Var;
            case 21:
                return new BaseInputConnection(((q03) obj).a, false);
            default:
                ((u93) obj).h.setValue(a83Var);
                return a83Var;
        }
    }
}
