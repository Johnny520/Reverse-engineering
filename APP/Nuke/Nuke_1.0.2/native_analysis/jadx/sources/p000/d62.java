package p000;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C0099a;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import me.dartcv.nuke.R;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d62 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1888h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1889i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1890j;

    public /* synthetic */ d62(int i, Object obj, Object obj2) {
        this.f1888h = i;
        this.f1889i = obj;
        this.f1890j = obj2;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        i41 i41VarM2793a;
        int i = 4;
        switch (this.f1888h) {
            case 0:
                i62 i62Var = (i62) this.f1889i;
                Throwable th = (Throwable) this.f1890j;
                Throwable th2 = (Throwable) obj;
                synchronized (i62Var.f4293c) {
                    if (th == null) {
                        th = null;
                    } else if (th2 != null) {
                        try {
                            if (th2 instanceof CancellationException) {
                                th2 = null;
                            }
                            if (th2 != null) {
                                fg1.m1638m(th, th2);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    i62Var.f4295e = th;
                    ju2 ju2Var = i62Var.f4311u;
                    f62 f62Var = f62.f2816h;
                    ju2Var.getClass();
                    ju2Var.m2576h(null, f62Var);
                }
                return a83.f116a;
            case 1:
                kf2 kf2Var = (kf2) this.f1889i;
                Context context = (Context) this.f1890j;
                String str = (String) obj;
                str.getClass();
                if2 if2Var = kf2Var.f5513o;
                if (if2Var != null) {
                    int iOrdinal = if2Var.f4591a.ordinal();
                    if (iOrdinal == 0) {
                        String lowerCase = str.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (lowerCase.equals("true")) {
                            i41VarM2793a = l31.m2793a(Boolean.TRUE);
                        } else {
                            if (!lowerCase.equals("false")) {
                                C0676s.m4651j(context.getString(R.string.script_settings_boolean_list_values));
                                return null;
                            }
                            i41VarM2793a = l31.m2793a(Boolean.FALSE);
                        }
                    } else if (iOrdinal == 1) {
                        Long lM6015g0 = wv2.m6015g0(str, 10);
                        if (lM6015g0 == null) {
                            C0676s.m4651j(context.getString(R.string.script_settings_invalid_list_integer, str));
                            return null;
                        }
                        i41VarM2793a = l31.m2794b(lM6015g0);
                    } else {
                        if (iOrdinal == 2) {
                            Double dM5802V = vv2.m5802V(str);
                            if (dM5802V != null) {
                                if (Math.abs(dM5802V.doubleValue()) > Double.MAX_VALUE) {
                                    dM5802V = null;
                                }
                                if (dM5802V != null) {
                                    i41VarM2793a = l31.m2794b(dM5802V);
                                }
                            }
                            C0676s.m4651j(context.getString(R.string.script_settings_invalid_list_number, str));
                            return null;
                        }
                        if (iOrdinal != 3) {
                            if (iOrdinal != 4) {
                                c80.m675s();
                                return null;
                            }
                            C0676s.m4651j(context.getString(R.string.script_settings_nested_array_unsupported));
                            return null;
                        }
                        i41VarM2793a = l31.m2795c(str);
                    }
                    i41 i41Var = i41VarM2793a;
                    if (i41Var != null) {
                        return i41Var;
                    }
                }
                return l31.m2795c(str);
            case 2:
                gm2 gm2Var = (gm2) this.f1889i;
                im2 im2Var = (im2) this.f1890j;
                nb0 nb0Var = (nb0) obj;
                float f = nb0Var.f7102b ? -1.0f : 1.0f;
                long j = nb0Var.f7101a;
                gm2Var.m1940a(rs1.m4613f(f, im2Var.f4690d == qv1.f9206i ? rs1.m4608a(0.0f, 1, j) : rs1.m4608a(0.0f, 2, j)), 1);
                return a83.f116a;
            case 3:
                in0 in0Var = (in0) this.f1889i;
                xk1 xk1Var = (xk1) this.f1890j;
                x13 x13Var = (x13) obj;
                x13Var.getClass();
                xk1Var.setValue(x13Var);
                in0Var.mo5j(AbstractC0570p7.m3759O(gf1.m1873U(x13Var)));
                return a83.f116a;
            case 4:
                AbstractC0570p7.m3745A((j20) this.f1889i, null, new lu2((y33) this.f1890j, null), 1);
                return new C0380ka(3);
            case 5:
                y33 y33Var = (y33) this.f1889i;
                y33 y33Var2 = (y33) this.f1890j;
                y33Var.f13298j.add(y33Var2);
                return new C0426lj(i, y33Var, y33Var2);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return new C0426lj(5, (y33) this.f1889i, (u33) this.f1890j);
            case 7:
                p83 p83Var = (p83) this.f1889i;
                in0 in0Var2 = (in0) this.f1890j;
                ((Long) obj).getClass();
                float f2 = p83Var.f8041e;
                p83Var.f8041e = 0.0f;
                in0Var2.mo5j(Float.valueOf(f2));
                return a83.f116a;
            case 8:
                Context context2 = (Context) this.f1889i;
                jc3 jc3Var = (jc3) this.f1890j;
                ImageView imageView = (ImageView) obj;
                imageView.getClass();
                ((s82) ((s82) ((s82) ComponentCallbacks2C0099a.m870c(context2).m6049b(jc3Var.f4966c).m5905d()).m5912n()).m5908i()).m4764C(imageView);
                return a83.f116a;
            default:
                ff3 ff3Var = (ff3) this.f1889i;
                View view = (View) this.f1890j;
                c01 c01Var = ff3Var.f2974u;
                if (ff3Var.f2973t == 0) {
                    int i2 = wa3.f12444a;
                    ra3.m4425b(view, c01Var);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(c01Var);
                    wa3.m5863b(view, c01Var);
                }
                ff3Var.f2973t++;
                return new C0426lj(6, ff3Var, view);
        }
    }
}
