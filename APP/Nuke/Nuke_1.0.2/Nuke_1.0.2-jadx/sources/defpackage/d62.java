package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.a;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import me.dartcv.nuke.R;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d62 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ d62(int i, Object obj, Object obj2) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        i41 i41VarA;
        int i = 4;
        switch (this.h) {
            case 0:
                i62 i62Var = (i62) this.i;
                Throwable th = (Throwable) this.j;
                Throwable th2 = (Throwable) obj;
                synchronized (i62Var.c) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                fg1.m(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    i62Var.e = th;
                    ju2 ju2Var = i62Var.u;
                    f62 f62Var = f62.h;
                    ju2Var.getClass();
                    ju2Var.h(null, f62Var);
                }
                return a83.a;
            case 1:
                kf2 kf2Var = (kf2) this.i;
                Context context = (Context) this.j;
                String str = (String) obj;
                str.getClass();
                if2 if2Var = kf2Var.o;
                if (if2Var != null) {
                    int iOrdinal = if2Var.a.ordinal();
                    if (iOrdinal == 0) {
                        String lowerCase = str.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (lowerCase.equals("true")) {
                            i41VarA = l31.a(Boolean.TRUE);
                        } else {
                            if (!lowerCase.equals("false")) {
                                s.j(context.getString(R.string.script_settings_boolean_list_values));
                                return null;
                            }
                            i41VarA = l31.a(Boolean.FALSE);
                        }
                    } else if (iOrdinal == 1) {
                        Long lG0 = wv2.g0(str, 10);
                        if (lG0 == null) {
                            s.j(context.getString(R.string.script_settings_invalid_list_integer, str));
                            return null;
                        }
                        i41VarA = l31.b(lG0);
                    } else {
                        if (iOrdinal == 2) {
                            Double dV = vv2.V(str);
                            if (dV != null) {
                                if (Math.abs(dV.doubleValue()) > Double.MAX_VALUE) {
                                    dV = null;
                                }
                                if (dV != null) {
                                    i41VarA = l31.b(dV);
                                }
                            }
                            s.j(context.getString(R.string.script_settings_invalid_list_number, str));
                            return null;
                        }
                        if (iOrdinal != 3) {
                            if (iOrdinal != 4) {
                                c80.s();
                                return null;
                            }
                            s.j(context.getString(R.string.script_settings_nested_array_unsupported));
                            return null;
                        }
                        i41VarA = l31.c(str);
                    }
                    i41 i41Var = i41VarA;
                    if (i41Var != null) {
                        return i41Var;
                    }
                }
                return l31.c(str);
            case 2:
                gm2 gm2Var = (gm2) this.i;
                im2 im2Var = (im2) this.j;
                nb0 nb0Var = (nb0) obj;
                float f = nb0Var.b ? -1.0f : 1.0f;
                long j = nb0Var.a;
                gm2Var.a(rs1.f(f, im2Var.d == qv1.i ? rs1.a(0.0f, 1, j) : rs1.a(0.0f, 2, j)), 1);
                return a83.a;
            case 3:
                in0 in0Var = (in0) this.i;
                xk1 xk1Var = (xk1) this.j;
                x13 x13Var = (x13) obj;
                x13Var.getClass();
                xk1Var.setValue(x13Var);
                in0Var.j(p7.O(gf1.U(x13Var)));
                return a83.a;
            case 4:
                p7.A((j20) this.i, null, new lu2((y33) this.j, null), 1);
                return new ka(3);
            case 5:
                y33 y33Var = (y33) this.i;
                y33 y33Var2 = (y33) this.j;
                y33Var.j.add(y33Var2);
                return new lj(i, y33Var, y33Var2);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return new lj(5, (y33) this.i, (u33) this.j);
            case 7:
                p83 p83Var = (p83) this.i;
                in0 in0Var2 = (in0) this.j;
                ((Long) obj).getClass();
                float f2 = p83Var.e;
                p83Var.e = 0.0f;
                in0Var2.j(Float.valueOf(f2));
                return a83.a;
            case 8:
                Context context2 = (Context) this.i;
                jc3 jc3Var = (jc3) this.j;
                ImageView imageView = (ImageView) obj;
                imageView.getClass();
                ((s82) ((s82) ((s82) a.c(context2).b(jc3Var.c).d()).n()).i()).C(imageView);
                return a83.a;
            default:
                ff3 ff3Var = (ff3) this.i;
                View view = (View) this.j;
                c01 c01Var = ff3Var.u;
                if (ff3Var.t == 0) {
                    int i2 = wa3.a;
                    ra3.b(view, c01Var);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(c01Var);
                    wa3.b(view, c01Var);
                }
                ff3Var.t++;
                return new lj(6, ff3Var, view);
        }
    }
}
