package p000;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.Toast;
import com.bumptech.glide.ComponentCallbacks2C0099a;
import com.dokar.quickjs.QuickJs;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import me.dartcv.nuke.R;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: d2 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0115d2 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1816h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1817i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f1818j;

    public /* synthetic */ C0115d2(int i, Object obj, Object obj2) {
        this.f1816h = i;
        this.f1817i = obj;
        this.f1818j = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0177  */
    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5j(Object obj) {
        Object x92Var;
        boolean z;
        Intent intent;
        String str;
        int i = this.f1816h;
        int i2 = 2;
        int i3 = 1;
        a83 a83Var = a83.f116a;
        Object obj2 = this.f1818j;
        Object obj3 = this.f1817i;
        switch (i) {
            case 0:
                ((bk1) obj3).m555b((y22) obj2);
                return a83Var;
            case 1:
                xk1 xk1Var = (xk1) obj2;
                String str2 = (String) obj;
                str2.getClass();
                if (!sp0.m4919R((Context) obj3, str2)) {
                    xk1Var.setValue(Boolean.TRUE);
                }
                return a83Var;
            case 2:
                ImageView imageView = (ImageView) obj;
                imageView.getClass();
                ((s82) ((s82) ((s82) ComponentCallbacks2C0099a.m870c((Context) obj3).m6049b(((s62) obj2).f9946c).m5905d()).m5912n()).m5908i()).m4764C(imageView);
                return a83Var;
            case 3:
                ImageView imageView2 = (ImageView) obj;
                imageView2.getClass();
                ((s82) ((s82) ((s82) ComponentCallbacks2C0099a.m870c((Context) obj3).m6049b(((g33) obj2).f3300c).m5905d()).m5912n()).m5908i()).m4764C(imageView2);
                return a83Var;
            case 4:
                C0924yi c0924yi = (C0924yi) obj3;
                C0963zi c0963zi = (C0963zi) obj2;
                g23 g23Var = c0924yi.f13465v;
                if (g23Var != null) {
                    g23Var.m1790b();
                }
                c0924yi.f13465v = null;
                C0291hv c0291hv = c0963zi.f13916b;
                if (c0291hv != null) {
                    c0291hv.m4317T(a83Var);
                }
                c0963zi.f13916b = null;
                return a83Var;
            case 5:
                C0242gj c0242gj = (C0242gj) obj3;
                C0710sw c0710sw = (C0710sw) obj2;
                c0242gj.m1926a(c0710sw);
                return new C0426lj(z ? 1 : 0, c0242gj, c0710sw);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                AbstractC0024an abstractC0024an = (AbstractC0024an) obj2;
                t61 t61Var = (t61) obj;
                t61Var.m5125a();
                nc0.m3272v(t61Var, (C0915y9) obj3, abstractC0024an, 0.0f, null, 60);
                return a83Var;
            case 7:
                t61 t61Var2 = (t61) obj;
                t61Var2.m5125a();
                nc0.m3272v(t61Var2, ((sv1) obj3).f10384j, (AbstractC0024an) obj2, 0.0f, null, 60);
                return a83Var;
            case 8:
                ((C0429lm) obj3).f6190a.m6431j((d00) obj2);
                return a83Var;
            case 9:
                jo2 jo2Var = (jo2) obj;
                jo2Var.getClass();
                C0360jr.f5166d.getClass();
                String str3 = C0360jr.f5170h;
                String str4 = ((C0971zq) obj3).f14023b;
                String str5 = ((by0) obj2).f1074a;
                String lowerCase = jo2Var.f5130a.name().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                io2 io2Var = jo2Var.f5131b;
                String str6 = jo2Var.f5132c;
                StringBuilder sbM5696o = vi0.m5696o("Auto reply failed: task=", str4, ", talker=", str5, ", type=");
                sbM5696o.append(lowerCase);
                sbM5696o.append(", code=");
                sbM5696o.append(io2Var);
                sbM5696o.append(", reason=");
                sbM5696o.append(str6);
                hg3.m2166d(str3, sbM5696o.toString());
                return a83Var;
            case 10:
                y62 y62Var = (y62) obj2;
                z = y62Var.f13324h || ((uo0) obj).mo216M((oy0) obj3);
                y62Var.f13324h = z;
                break;
            case 11:
                y62 y62Var2 = (y62) obj2;
                z = y62Var2.f13324h || ((uo0) obj).mo230f((o12) obj3);
                y62Var2.f13324h = z;
                break;
            case 12:
                t91 t91Var = (t91) obj3;
                AbstractC0024an abstractC0024an2 = (AbstractC0024an) obj2;
                t61 t61Var3 = (t61) obj;
                t61Var3.m5125a();
                if (((Boolean) t91Var.f10640s.getValue()).booleanValue() || ((Boolean) t91Var.f10641t.getValue()).booleanValue()) {
                    nc0.m3266F(t61Var3, abstractC0024an2, 0L, 0L, 0.0f, null, 126);
                }
                return a83Var;
            case 13:
                ((bk1) obj3).m555b((j11) obj2);
                return a83Var;
            case 14:
                ((vr0) obj3).f12141j.removeCallbacks((RunnableC0724t7) obj2);
                return a83Var;
            case 15:
                ((mn0) obj3).mo12g((yp2) obj2, (rs1) obj);
                return a83Var;
            case 16:
                xm0 xm0Var = (xm0) obj;
                xm0Var.getClass();
                ((mn0) obj3).mo12g((AbstractC0255gw) obj2, xm0Var);
                return a83Var;
            case 17:
                ((ep1) obj3).m1404b((rs1) obj, (xm0) obj2);
                return a83Var;
            case 18:
                cz0 cz0Var = (cz0) obj3;
                az0 az0Var = (az0) obj2;
                cz0Var.f1788a.m6423b(az0Var);
                cz0Var.f1789b.setValue(Boolean.TRUE);
                return new C0426lj(i3, cz0Var, az0Var);
            case 19:
                g91 g91Var = (g91) obj3;
                g91Var.f3367j.m4890i(obj2);
                return new C0426lj(i2, g91Var, obj2);
            case AIChatConfig.MaxContextRounds /* 20 */:
                return new g91((fc2) obj3, (Map) obj, (dc2) obj2);
            case 21:
                ((qj1) obj3).f8999j.add(new nj1(obj, (ho2) obj2));
                return a83Var;
            case 22:
                qj1 qj1Var = (qj1) obj2;
                if (((Set) obj3).contains(obj)) {
                    rk1 rk1Var = qj1Var.f8998i;
                    sk1 sk1Var = qj1Var.f9000k;
                    Object objM4505g = rk1Var.m4505g(obj);
                    if (objM4505g != null) {
                        if (objM4505g instanceof sk1) {
                            sk1 sk1Var2 = (sk1) objM4505g;
                            Object[] objArr = sk1Var2.f10175b;
                            long[] jArr = sk1Var2.f10174a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i4 = 0;
                                while (true) {
                                    long j = jArr[i4];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                                        for (int i6 = 0; i6 < i5; i6++) {
                                            if ((255 & j) < 128) {
                                                sk1Var.m4882a((ho2) objArr[(i4 << 3) + i6]);
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
                            sk1Var.m4882a((ho2) objM4505g);
                        }
                    }
                }
                return a83Var;
            case 23:
                ((in0) obj3).mo5j(obj);
                ((yk1) obj2).f13501c.setValue(Boolean.FALSE);
                return a83Var;
            case 24:
                vs1 vs1Var = (vs1) obj3;
                sz1 sz1Var = (sz1) obj2;
                rz1 rz1Var = (rz1) obj;
                boolean z2 = vs1Var.f12165x;
                float f = vs1Var.f12163v;
                if (z2) {
                    rz1.m4641i(rz1Var, sz1Var, rz1Var.mo692T(f), rz1Var.mo692T(vs1Var.f12164w));
                } else {
                    rz1.m4639g(rz1Var, sz1Var, rz1Var.mo692T(f), rz1Var.mo692T(vs1Var.f12164w));
                }
                return a83Var;
            case 25:
                Activity activity = (Activity) obj3;
                xm0 xm0Var2 = (xm0) obj2;
                String str7 = (String) obj;
                str7.getClass();
                au1.f395d.getClass();
                String str8 = au1.f399h;
                String string = pv2.m3993I0(str7).toString();
                if (string.length() == 0) {
                    z = false;
                } else {
                    try {
                        intent = new Intent();
                        str = up0.f11406n;
                    } catch (Throwable th) {
                        x92Var = new x92(th);
                    }
                    if (str == null) {
                        t11.m5067S("hostPkgName");
                        throw null;
                    }
                    intent.setComponent(new ComponentName(str, "com.tencent.mm.plugin.profile.ui.ContactInfoUI"));
                    intent.putExtra("Contact_User", string);
                    activity.startActivity(intent);
                    hg3.m2168f(str8, "Opening user card: username=".concat(string));
                    x92Var = a83Var;
                    Throwable thM6237a = y92.m6237a(x92Var);
                    if (thM6237a != null) {
                        hg3.m2166d(str8, "Open user card failed: ".concat(fg1.m1624Q(thM6237a)));
                    }
                    z = !(x92Var instanceof x92);
                }
                if (z) {
                    Toast.makeText(activity, R.string.open_user_card_success, 0).show();
                    xm0Var2.mo6a();
                } else {
                    Toast.makeText(activity, R.string.open_user_card_failed, 0).show();
                }
                return a83Var;
            case 26:
                hw1 hw1Var = (hw1) obj3;
                sz1 sz1Var2 = (sz1) obj2;
                rz1 rz1Var2 = (rz1) obj;
                boolean z3 = hw1Var.f4160z;
                float f2 = hw1Var.f4156v;
                if (z3) {
                    rz1.m4641i(rz1Var2, sz1Var2, rz1Var2.mo692T(f2), rz1Var2.mo692T(hw1Var.f4157w));
                } else {
                    rz1.m4639g(rz1Var2, sz1Var2, rz1Var2.mo692T(f2), rz1Var2.mo692T(hw1Var.f4157w));
                }
                return a83Var;
            case 27:
                C0242gj c0242gj2 = (C0242gj) obj3;
                C0940yw c0940yw = (C0940yw) obj2;
                c0242gj2.m1926a(c0940yw);
                return new C0426lj(3, c0242gj2, c0940yw);
            case 28:
                QuickJs.invokeAsyncFunction$lambda$1((QuickJs) obj3, (zt2) obj2, (Throwable) obj);
                return a83Var;
            default:
                sk1 sk1Var3 = (sk1) obj2;
                ((C0220fy) obj3).m1755z(obj);
                if (sk1Var3 != null) {
                    sk1Var3.m4882a(obj);
                }
                return a83Var;
        }
        return Boolean.valueOf(!z);
    }
}
