package p000;

import android.graphics.Typeface;
import android.text.Spannable;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qn0 implements InterfaceC0941xw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5201d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f5202e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f5203f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ qn0(int i, Object obj, Object obj2) {
        this.f5201d = i;
        this.f5202e = obj;
        this.f5203f = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0110  */
    @Override // p000.InterfaceC0941xw
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo353a(Object obj, Object obj2, Object obj3) {
        int i;
        Typeface typeface;
        int i2 = this.f5201d;
        Object obj4 = this.f5203f;
        Object obj5 = this.f5202e;
        switch (i2) {
            case 0:
                C0399km c0399km = (C0399km) obj5;
                k50 k50Var = (k50) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                float fFloatValue2 = ((Float) obj2).floatValue();
                float fFloatValue3 = ((Float) obj3).floatValue();
                boolean zM4275r = u50.m4275r(c0399km, fFloatValue);
                if (c0399km.m2038m().f7941e != um0.f6264d && k50Var != k50.f3015d) {
                    zM4275r = !zM4275r;
                }
                int i3 = c0399km.m2038m().f7938b;
                float fM4267h = i3 == 0 ? 0.0f : u50.m4267h(c0399km) / i3;
                float f = fM4267h - ((int) fM4267h);
                i = Math.abs(fFloatValue) >= c0399km.f3556q.mo654p(400.0f) ? fFloatValue > 0.0f ? 1 : 2 : 0;
                if (i == 0) {
                    if (Math.abs(f) <= 0.5f) {
                        float fAbs = Math.abs(fM4267h);
                        InterfaceC0968ym interfaceC0968ym = c0399km.f3556q;
                        no0 no0Var = oo0.f4599a;
                        if (fAbs < Math.abs(Math.min(interfaceC0968ym.mo654p(56.0f), c0399km.m2039o() / 2.0f) / c0399km.m2039o()) ? Math.abs(fFloatValue2) >= Math.abs(fFloatValue3) : !zM4275r) {
                        }
                    } else if (zM4275r) {
                        fFloatValue2 = fFloatValue3;
                    }
                } else if (i != 1) {
                    if (i != 2) {
                        fFloatValue2 = 0.0f;
                    }
                }
                return Float.valueOf(fFloatValue2);
            default:
                Spannable spannable = (Spannable) obj5;
                C0044b6 c0044b6 = (C0044b6) obj4;
                j31 j31Var = (j31) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int iIntValue2 = ((Integer) obj3).intValue();
                z51 z51Var = j31Var.f2675f;
                C1018zv c1018zv = j31Var.f2672c;
                if (c1018zv == null) {
                    c1018zv = C1018zv.f8005f;
                }
                C0940xv c0940xv = j31Var.f2673d;
                i = c0940xv != null ? c0940xv.f7426a : 0;
                C0977yv c0977yv = j31Var.f2674e;
                int i4 = c0977yv != null ? c0977yv.f7696a : 65535;
                C0080c6 c0080c6 = (C0080c6) c0044b6.f383e;
                ba1 ba1VarM1958b = ((C0408kv) c0080c6.f699e).m1958b(z51Var, c1018zv, i, i4);
                if (ba1VarM1958b instanceof ba1) {
                    Object obj6 = ba1VarM1958b.f482d;
                    obj6.getClass();
                    typeface = (Typeface) obj6;
                } else {
                    C0541o8 c0541o8 = new C0541o8(ba1VarM1958b, c0080c6.f704j);
                    c0080c6.f704j = c0541o8;
                    Object obj7 = c0541o8.f4482c;
                    obj7.getClass();
                    typeface = (Typeface) obj7;
                }
                spannable.setSpan(new C0488mv(1, typeface), iIntValue, iIntValue2, 33);
                return na1.f4229a;
        }
    }
}
