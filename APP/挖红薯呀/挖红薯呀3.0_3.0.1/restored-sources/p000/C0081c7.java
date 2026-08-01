package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: c7 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0081c7 implements InterfaceC0298hw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f716d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f717e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f718f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0081c7(int i, Object obj, Object obj2) {
        this.f716d = i;
        this.f717e = obj;
        this.f718f = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x013a, code lost:
    
        r6 = new p000.lk0(r4, java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    @Override // p000.InterfaceC0298hw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        lk0 lk0Var;
        List listM5249S;
        int i = this.f716d;
        na1 na1Var = na1.f4229a;
        Object obj = this.f718f;
        Object obj2 = this.f717e;
        switch (i) {
            case 0:
                ((InterfaceC0470md) obj2).mo1710s(obj);
                return na1Var;
            case 1:
                C0756t9 c0756t9 = (C0756t9) obj2;
                d60 d60Var = (d60) obj;
                c0756t9.f5961x = c0756t9.f5956s.mo737a(d60Var.f976d.mo649c(), d60Var.getLayoutDirection(), d60Var);
                return na1Var;
            case 2:
                C0616pi c0616pi = ((C0890wi) obj2).f7134d;
                w11 w11Var = c0616pi.f4882c;
                v11 v11VarM4829c = w11Var.m4829c();
                int i2 = 0;
                while (true) {
                    try {
                        lk0Var = null;
                        if (i2 < w11Var.f6894e) {
                            if (v11VarM4829c.m4376l(i2)) {
                                Object objM4378n = v11VarM4829c.m4378n(i2);
                                if (objM4378n != obj) {
                                    ku0 ku0Var = objM4378n instanceof ku0 ? (ku0) objM4378n : null;
                                    if ((ku0Var != null ? ku0Var.f3270a : null) == obj) {
                                    }
                                }
                            }
                            int[] iArr = v11VarM4829c.f6375b;
                            int i3 = i2 + 1;
                            int iM5200b = (i3 < v11VarM4829c.f6376c ? iArr[(i3 * 5) + 4] : v11VarM4829c.f6378e) - y11.m5200b(iArr, i2);
                            int i4 = 0;
                            while (i4 < iM5200b) {
                                Object objM4372h = v11VarM4829c.m4372h(i2, i4);
                                if (objM4372h != obj) {
                                    ku0 ku0Var2 = objM4372h instanceof ku0 ? (ku0) objM4372h : null;
                                    if ((ku0Var2 != null ? ku0Var2.f3270a : null) != obj) {
                                        i4++;
                                    }
                                }
                                break;
                            }
                            i2 = i3;
                        }
                    } finally {
                    }
                    break;
                }
                lk0 lk0Var2 = new lk0(i2, null);
                v11VarM4829c.m4367c();
                lk0Var = lk0Var2;
                if (lk0Var != null) {
                    int i5 = lk0Var.f3511a;
                    Integer num = lk0Var.f3512b;
                    v11VarM4829c = w11Var.m4829c();
                    try {
                        ArrayList arrayListM2989Y = p30.m2989Y(v11VarM4829c, i5, num);
                        v11VarM4829c.m4367c();
                        listM5249S = AbstractC0960ye.m5249S(arrayListM2989Y, c0616pi.m3073E());
                    } finally {
                    }
                } else {
                    listM5249S = C0294hs.f2354d;
                }
                return new C0093ci(listM5249S);
            case 3:
                ((zt0) obj2).f7995d = pf1.m3058r((C0260gv) obj, vq0.f6807a);
                return na1Var;
            case 4:
                C0399km c0399km = (C0399km) obj;
                wn0 wn0Var = (wn0) ((C0135dn) obj2).getValue();
                return new xn0(c0399km, wn0Var, new C0791u5((z20) c0399km.f3543d.f870f.getValue(), wn0Var));
            case 5:
                return new f90((zw0) obj2, C0330is.f2614d, (yw0) obj);
            case 6:
                return zc0.m5512U((Context) obj2, (Bitmap) obj);
            case 7:
                return vf0.m4554S1((Context) obj2, (TextView) obj);
            case 8:
                it0 it0Var = (it0) obj;
                if (((C0238g9) ((C0541o8) obj2).f4480a).get() == 0) {
                    it0Var.invoke();
                }
                return na1Var;
            case 9:
                return ck0.m557H((TextView) obj2, (GradientDrawable) obj);
            case 10:
                kh0 kh0Var = (kh0) obj2;
                C0964yi c0964yi = (C0964yi) obj;
                Object[] objArr = kh0Var.f3151b;
                long[] jArr = kh0Var.f3150a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j = jArr[i6];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                            for (int i8 = 0; i8 < i7; i8++) {
                                if ((255 & j) < 128) {
                                    c0964yi.m5258A(objArr[(i6 << 3) + i8]);
                                }
                                j >>= 8;
                            }
                            if (i7 == 8) {
                                if (i6 != length) {
                                    i6++;
                                }
                            }
                        }
                    }
                }
                return na1Var;
            default:
                CharSequence charSequence = (CharSequence) obj;
                charSequence.getClass();
                Matcher matcher = ((du0) obj2).f1193d.matcher(charSequence);
                matcher.getClass();
                return g60.m1204c(matcher, 0, charSequence);
        }
    }
}
