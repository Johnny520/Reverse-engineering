package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.Toast;
import com.bumptech.glide.a;
import com.dokar.quickjs.QuickJs;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import me.dartcv.nuke.R;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d2 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ d2(int i, Object obj, Object obj2) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.dokar.quickjs.QuickJs.b(com.dokar.quickjs.QuickJs, zt2, java.lang.Throwable):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0177  */
    @Override // defpackage.in0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj) {
        Object x92Var;
        boolean z;
        Intent intent;
        String str;
        int i = this.h;
        int i2 = 2;
        int i3 = 1;
        a83 a83Var = a83.a;
        Object obj2 = this.j;
        Object obj3 = this.i;
        switch (i) {
            case 0:
                ((bk1) obj3).b((y22) obj2);
                return a83Var;
            case 1:
                xk1 xk1Var = (xk1) obj2;
                String str2 = (String) obj;
                str2.getClass();
                if (!sp0.R((Context) obj3, str2)) {
                    xk1Var.setValue(Boolean.TRUE);
                }
                return a83Var;
            case 2:
                ImageView imageView = (ImageView) obj;
                imageView.getClass();
                ((s82) ((s82) ((s82) a.c((Context) obj3).b(((s62) obj2).c).d()).n()).i()).C(imageView);
                return a83Var;
            case 3:
                ImageView imageView2 = (ImageView) obj;
                imageView2.getClass();
                ((s82) ((s82) ((s82) a.c((Context) obj3).b(((g33) obj2).c).d()).n()).i()).C(imageView2);
                return a83Var;
            case 4:
                yi yiVar = (yi) obj3;
                zi ziVar = (zi) obj2;
                g23 g23Var = yiVar.v;
                if (g23Var != null) {
                    g23Var.b();
                }
                yiVar.v = null;
                hv hvVar = ziVar.b;
                if (hvVar != null) {
                    hvVar.T(a83Var);
                }
                ziVar.b = null;
                return a83Var;
            case 5:
                gj gjVar = (gj) obj3;
                sw swVar = (sw) obj2;
                gjVar.a(swVar);
                return new lj(z ? 1 : 0, gjVar, swVar);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                an anVar = (an) obj2;
                t61 t61Var = (t61) obj;
                t61Var.a();
                nc0.v(t61Var, (y9) obj3, anVar, 0.0f, null, 60);
                return a83Var;
            case 7:
                t61 t61Var2 = (t61) obj;
                t61Var2.a();
                nc0.v(t61Var2, ((sv1) obj3).j, (an) obj2, 0.0f, null, 60);
                return a83Var;
            case 8:
                ((lm) obj3).a.j((d00) obj2);
                return a83Var;
            case 9:
                jo2 jo2Var = (jo2) obj;
                jo2Var.getClass();
                jr.d.getClass();
                String str3 = jr.h;
                String str4 = ((zq) obj3).b;
                String str5 = ((by0) obj2).a;
                String lowerCase = jo2Var.a.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                io2 io2Var = jo2Var.b;
                String str6 = jo2Var.c;
                StringBuilder sbO = vi0.o("Auto reply failed: task=", str4, ", talker=", str5, ", type=");
                sbO.append(lowerCase);
                sbO.append(", code=");
                sbO.append(io2Var);
                sbO.append(", reason=");
                sbO.append(str6);
                hg3.d(str3, sbO.toString());
                return a83Var;
            case 10:
                y62 y62Var = (y62) obj2;
                z = y62Var.h || ((uo0) obj).M((oy0) obj3);
                y62Var.h = z;
                break;
            case 11:
                y62 y62Var2 = (y62) obj2;
                z = y62Var2.h || ((uo0) obj).f((o12) obj3);
                y62Var2.h = z;
                break;
            case 12:
                t91 t91Var = (t91) obj3;
                an anVar2 = (an) obj2;
                t61 t61Var3 = (t61) obj;
                t61Var3.a();
                if (((Boolean) t91Var.s.getValue()).booleanValue() || ((Boolean) t91Var.t.getValue()).booleanValue()) {
                    nc0.F(t61Var3, anVar2, 0L, 0L, 0.0f, null, 126);
                }
                return a83Var;
            case 13:
                ((bk1) obj3).b((j11) obj2);
                return a83Var;
            case 14:
                ((vr0) obj3).j.removeCallbacks((t7) obj2);
                return a83Var;
            case 15:
                ((mn0) obj3).g((yp2) obj2, (rs1) obj);
                return a83Var;
            case 16:
                xm0 xm0Var = (xm0) obj;
                xm0Var.getClass();
                ((mn0) obj3).g((gw) obj2, xm0Var);
                return a83Var;
            case 17:
                ((ep1) obj3).b((rs1) obj, (xm0) obj2);
                return a83Var;
            case 18:
                cz0 cz0Var = (cz0) obj3;
                az0 az0Var = (az0) obj2;
                cz0Var.a.b(az0Var);
                cz0Var.b.setValue(Boolean.TRUE);
                return new lj(i3, cz0Var, az0Var);
            case 19:
                g91 g91Var = (g91) obj3;
                g91Var.j.i(obj2);
                return new lj(i2, g91Var, obj2);
            case AIChatConfig.MaxContextRounds /* 20 */:
                return new g91((fc2) obj3, (Map) obj, (dc2) obj2);
            case 21:
                ((qj1) obj3).j.add(new nj1(obj, (ho2) obj2));
                return a83Var;
            case 22:
                qj1 qj1Var = (qj1) obj2;
                if (((Set) obj3).contains(obj)) {
                    rk1 rk1Var = qj1Var.i;
                    sk1 sk1Var = qj1Var.k;
                    Object objG = rk1Var.g(obj);
                    if (objG != null) {
                        if (objG instanceof sk1) {
                            sk1 sk1Var2 = (sk1) objG;
                            Object[] objArr = sk1Var2.b;
                            long[] jArr = sk1Var2.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i4 = 0;
                                while (true) {
                                    long j = jArr[i4];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                                        for (int i6 = 0; i6 < i5; i6++) {
                                            if ((255 & j) < 128) {
                                                sk1Var.a((ho2) objArr[(i4 << 3) + i6]);
                                            }
                                            j >>= 8;
                                        }
                                        if (i5 == 8) {
                                            if (i4 != length) {
                                                i4++;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            sk1Var.a((ho2) objG);
                        }
                    }
                }
                return a83Var;
            case 23:
                ((in0) obj3).j(obj);
                ((yk1) obj2).c.setValue(Boolean.FALSE);
                return a83Var;
            case 24:
                vs1 vs1Var = (vs1) obj3;
                sz1 sz1Var = (sz1) obj2;
                rz1 rz1Var = (rz1) obj;
                boolean z2 = vs1Var.x;
                float f = vs1Var.v;
                if (z2) {
                    rz1.i(rz1Var, sz1Var, rz1Var.T(f), rz1Var.T(vs1Var.w));
                } else {
                    rz1.g(rz1Var, sz1Var, rz1Var.T(f), rz1Var.T(vs1Var.w));
                }
                return a83Var;
            case 25:
                Activity activity = (Activity) obj3;
                xm0 xm0Var2 = (xm0) obj2;
                String str7 = (String) obj;
                str7.getClass();
                au1.d.getClass();
                String str8 = au1.h;
                String string = pv2.I0(str7).toString();
                if (string.length() == 0) {
                    z = false;
                } else {
                    try {
                        intent = new Intent();
                        str = up0.n;
                    } catch (Throwable th) {
                        x92Var = new x92(th);
                    }
                    if (str == null) {
                        t11.S("hostPkgName");
                        throw null;
                    }
                    intent.setComponent(new ComponentName(str, "com.tencent.mm.plugin.profile.ui.ContactInfoUI"));
                    intent.putExtra("Contact_User", string);
                    activity.startActivity(intent);
                    hg3.f(str8, "Opening user card: username=".concat(string));
                    x92Var = a83Var;
                    Throwable thA = y92.a(x92Var);
                    if (thA != null) {
                        hg3.d(str8, "Open user card failed: ".concat(fg1.Q(thA)));
                    }
                    z = !(x92Var instanceof x92);
                }
                if (z) {
                    Toast.makeText(activity, R.string.open_user_card_success, 0).show();
                    xm0Var2.a();
                } else {
                    Toast.makeText(activity, R.string.open_user_card_failed, 0).show();
                }
                return a83Var;
            case 26:
                hw1 hw1Var = (hw1) obj3;
                sz1 sz1Var2 = (sz1) obj2;
                rz1 rz1Var2 = (rz1) obj;
                boolean z3 = hw1Var.z;
                float f2 = hw1Var.v;
                if (z3) {
                    rz1.i(rz1Var2, sz1Var2, rz1Var2.T(f2), rz1Var2.T(hw1Var.w));
                } else {
                    rz1.g(rz1Var2, sz1Var2, rz1Var2.T(f2), rz1Var2.T(hw1Var.w));
                }
                return a83Var;
            case 27:
                gj gjVar2 = (gj) obj3;
                yw ywVar = (yw) obj2;
                gjVar2.a(ywVar);
                return new lj(3, gjVar2, ywVar);
            case 28:
                QuickJs.invokeAsyncFunction$lambda$1((QuickJs) obj3, (zt2) obj2, (Throwable) obj);
                return a83Var;
            default:
                sk1 sk1Var3 = (sk1) obj2;
                ((fy) obj3).z(obj);
                if (sk1Var3 != null) {
                    sk1Var3.a(obj);
                }
                return a83Var;
        }
        return Boolean.valueOf(!z);
    }
}
