package p000;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mc0 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3914d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f3915e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f3916f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f3917g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ mc0(int i, ArrayList arrayList, Context context) {
        this.f3914d = 0;
        this.f3915e = i;
        this.f3916f = arrayList;
        this.f3917g = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        InterfaceC0690ri interfaceC0690ri;
        InterfaceC0690ri interfaceC0690ri2;
        int i;
        boolean z;
        int i2 = this.f3914d;
        int i3 = 0;
        na1 na1Var = na1.f4229a;
        Object obj2 = this.f3917g;
        int i4 = this.f3915e;
        Object obj3 = this.f3916f;
        switch (i2) {
            case 0:
                break;
            case 1:
                ht0 ht0Var = (ht0) obj3;
                ch0 ch0Var = (ch0) obj2;
                InterfaceC0690ri interfaceC0690ri3 = (InterfaceC0690ri) obj;
                if (ht0Var.f2363e == i4 && p30.m3002l(ch0Var, ht0Var.f2364f) && (interfaceC0690ri3 instanceof C0964yi)) {
                    long[] jArr = ch0Var.f810a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = i3;
                                while (i8 < i7) {
                                    if ((255 & j) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        Object obj4 = ch0Var.f811b[i9];
                                        boolean z2 = ch0Var.f812c[i9] != i4;
                                        if (z2) {
                                            i = i6;
                                            C0964yi c0964yi = (C0964yi) interfaceC0690ri3;
                                            interfaceC0690ri2 = interfaceC0690ri3;
                                            jh0 jh0Var = c0964yi.f7631j;
                                            u50.m4281x(jh0Var, obj4, ht0Var);
                                            z = z2;
                                            if (obj4 instanceof C0135dn) {
                                                C0135dn c0135dn = (C0135dn) obj4;
                                                if (!jh0Var.m1697c(c0135dn)) {
                                                    u50.m4282y(c0964yi.f7634m, c0135dn);
                                                }
                                                jh0 jh0Var2 = ht0Var.f2365g;
                                                if (jh0Var2 != null) {
                                                    jh0Var2.m1705k(obj4);
                                                }
                                            }
                                        } else {
                                            interfaceC0690ri2 = interfaceC0690ri3;
                                            z = z2;
                                            i = i6;
                                        }
                                        if (z) {
                                            ch0Var.m536f(i9);
                                        }
                                    } else {
                                        interfaceC0690ri2 = interfaceC0690ri3;
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                    interfaceC0690ri3 = interfaceC0690ri2;
                                }
                                interfaceC0690ri = interfaceC0690ri3;
                                if (i7 != i6) {
                                    break;
                                }
                            } else {
                                interfaceC0690ri = interfaceC0690ri3;
                            }
                            if (i5 != length) {
                                i5++;
                                interfaceC0690ri3 = interfaceC0690ri;
                                i3 = 0;
                            }
                        }
                    }
                }
                break;
            default:
                ly0 ly0Var = (ly0) obj3;
                xq0 xq0Var = (xq0) obj2;
                wq0 wq0Var = (wq0) obj;
                int iM720g = ly0Var.f3619r.f4988a.m720g();
                if (iM720g < 0) {
                    iM720g = 0;
                }
                if (iM720g <= i4) {
                    i4 = iM720g;
                }
                int i10 = -i4;
                boolean z3 = ly0Var.f3620s;
                int i11 = z3 ? 0 : i10;
                if (!z3) {
                    i10 = 0;
                }
                wq0Var.f7170d = true;
                wq0.m5018l(wq0Var, xq0Var, i11, i10);
                wq0Var.f7170d = false;
                break;
        }
        return na1Var;
    }

    public /* synthetic */ mc0(int i, int i2, Object obj, Object obj2) {
        this.f3914d = i2;
        this.f3916f = obj;
        this.f3915e = i;
        this.f3917g = obj2;
    }
}
