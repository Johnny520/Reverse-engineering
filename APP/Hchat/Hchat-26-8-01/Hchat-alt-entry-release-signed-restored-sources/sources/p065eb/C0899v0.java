package p065eb;

import android.content.Context;
import android.widget.ImageView;
import android.widget.Toast;
import gg.AbstractC1416l;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import p051db.C0765c;
import p063e9.C0846q;
import p069f.C0925b0;
import p069f.C0943k0;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p117i0.C1871q;
import p117i0.C1876r1;
import p117i0.C1892x;
import p117i0.InterfaceC1809a1;
import p117i0.InterfaceC1859n;
import p119i2.AbstractC1923e0;
import p119i2.C1939m0;
import p144k.C2215u1;
import p154k9.C2360d;
import p154k9.EnumC2359c;
import p174m.EnumC2640p1;
import p190n2.C2884s;
import p190n2.C2891z;
import p218og.AbstractC3149m;
import p276sf.C3967n;
import p308v1.AbstractC4374a1;
import p308v1.AbstractC4377b1;
import p321w.AbstractC4634s;
import p321w.C4609j1;
import p321w.C4618m1;
import p321w.C4633r1;
import p332wb.AbstractC4955ho;

/* JADX INFO: renamed from: eb.v0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0899v0 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2792g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2793h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f2794i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f2795j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0899v0(int i9, Object obj, Object obj2, int i10) {
        this.f2792g = i10;
        this.f2793h = i9;
        this.f2794i = obj;
        this.f2795j = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        InterfaceC1859n interfaceC1859n;
        C3967n c3967n;
        InterfaceC1859n interfaceC1859n2;
        C3967n c3967n2;
        int i9;
        int i10 = this.f2792g;
        int i11 = 0;
        C3967n c3967n3 = C3967n.f12976a;
        Object obj2 = this.f2795j;
        Object obj3 = this.f2794i;
        int i12 = this.f2793h;
        switch (i10) {
            case 0:
                break;
            case 1:
                C1876r1 c1876r1 = (C1876r1) obj3;
                C0925b0 c0925b0 = (C0925b0) obj2;
                InterfaceC1859n interfaceC1859n3 = (InterfaceC1859n) obj;
                if (c1876r1.f6242e == i12 && AbstractC1416l.m3825a(c0925b0, c1876r1.f6243f) && (interfaceC1859n3 instanceof C1871q)) {
                    long[] jArr = c0925b0.f2894a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i13 = 0;
                        while (true) {
                            long j3 = jArr[i13];
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i14 = 8;
                                int i15 = 8 - ((~(i13 - length)) >>> 31);
                                int i16 = i11;
                                while (i16 < i15) {
                                    if ((j3 & 255) < 128) {
                                        int i17 = (i13 << 3) + i16;
                                        Object obj4 = c0925b0.f2895b[i17];
                                        i9 = i14;
                                        boolean z9 = c0925b0.f2896c[i17] != i12;
                                        if (z9) {
                                            C1871q c1871q = (C1871q) interfaceC1859n3;
                                            interfaceC1859n2 = interfaceC1859n3;
                                            C0943k0 c0943k0 = c1871q.f6208m;
                                            AbstractC1089i.m2798w0(c0943k0, obj4, c1876r1);
                                            c3967n2 = c3967n3;
                                            if (obj4 instanceof C1892x) {
                                                C1892x c1892x = (C1892x) obj4;
                                                if (!c0943k0.m2316c(c1892x)) {
                                                    AbstractC1089i.m2799x0(c1871q.f6211p, c1892x);
                                                }
                                                C0943k0 c0943k02 = c1876r1.f6244g;
                                                if (c0943k02 != null) {
                                                    c0943k02.m2324k(obj4);
                                                }
                                            }
                                        } else {
                                            interfaceC1859n2 = interfaceC1859n3;
                                            c3967n2 = c3967n3;
                                        }
                                        if (z9) {
                                            c0925b0.m2272f(i17);
                                        }
                                    } else {
                                        interfaceC1859n2 = interfaceC1859n3;
                                        c3967n2 = c3967n3;
                                        i9 = i14;
                                    }
                                    j3 >>= i9;
                                    i16++;
                                    i14 = i9;
                                    interfaceC1859n3 = interfaceC1859n2;
                                    c3967n3 = c3967n2;
                                }
                                interfaceC1859n = interfaceC1859n3;
                                c3967n = c3967n3;
                                if (i15 != i14) {
                                }
                            } else {
                                interfaceC1859n = interfaceC1859n3;
                                c3967n = c3967n3;
                            }
                            if (i13 != length) {
                                i13++;
                                interfaceC1859n3 = interfaceC1859n;
                                c3967n3 = c3967n;
                                i11 = 0;
                            }
                        }
                    }
                }
                break;
            case 2:
                C2215u1 c2215u1 = (C2215u1) obj3;
                AbstractC4377b1 abstractC4377b1 = (AbstractC4377b1) obj2;
                AbstractC4374a1 abstractC4374a1 = (AbstractC4374a1) obj;
                int iM4492g = c2215u1.f7339u.f7353a.m4492g();
                if (iM4492g < 0) {
                    iM4492g = 0;
                }
                if (iM4492g <= i12) {
                    i12 = iM4492g;
                }
                int i18 = -i12;
                boolean z10 = c2215u1.f7340v;
                int i19 = z10 ? 0 : i18;
                if (!z10) {
                    i18 = 0;
                }
                abstractC4374a1.f14583g = true;
                AbstractC4374a1.m8812F(abstractC4374a1, abstractC4377b1, i19, i18);
                abstractC4374a1.f14583g = false;
                break;
            case 3:
                C4633r1 c4633r1 = (C4633r1) obj3;
                AbstractC4377b1 abstractC4377b12 = (AbstractC4377b1) obj2;
                AbstractC4374a1 abstractC4374a12 = (AbstractC4374a1) obj;
                int i20 = c4633r1.f15364b;
                C4609j1 c4609j1 = c4633r1.f15363a;
                C2891z c2891z = c4633r1.f15365c;
                C4618m1 c4618m1 = (C4618m1) c4633r1.f15366d.invoke();
                c4609j1.m9033a(EnumC2640p1.f8622g, AbstractC4634s.m9068k(abstractC4374a12, i20, c2891z, c4618m1 != null ? c4618m1.f15293a : null, false, abstractC4377b12.f14593g), i12, abstractC4377b12.f14594h);
                AbstractC4374a1.m8811E(abstractC4374a12, abstractC4377b12, 0, Math.round(-c4609j1.f15206a.m4488g()));
                break;
            case 4:
                ImageView imageView = (ImageView) obj;
                imageView.getClass();
                imageView.setContentDescription((String) obj3);
                imageView.setImageDrawable(new C2360d((EnumC2359c) obj2, i12));
                break;
            case 5:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) obj3;
                Context context = (Context) obj2;
                String strM2123h = (String) obj;
                strM2123h.getClass();
                if (!AbstractC3149m.m6721t0(strM2123h)) {
                    if (i12 == 1) {
                        AtomicBoolean atomicBoolean = C0846q.f2580a;
                        strM2123h = C0846q.m2123h(context, strM2123h);
                    }
                    interfaceC1231l.invoke(strM2123h);
                }
                break;
            case 6:
                Context context2 = (Context) obj3;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) obj2;
                List list = (List) obj;
                list.getClass();
                if (i12 == 1 && list.size() > 9) {
                    Toast.makeText(context2, "朋友圈最多保留前 9 张图片", 0).show();
                } else if (i12 == 2 && list.size() > 1) {
                    Toast.makeText(context2, "朋友圈只保留第 1 个视频", 0).show();
                }
                interfaceC1809a1.setValue(AbstractC4955ho.m9628o7((C0765c) interfaceC1809a1.getValue(), i12, list));
                break;
            default:
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) obj3;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) obj2;
                C2884s c2884s = (C2884s) obj;
                c2884s.getClass();
                String strM6701P0 = AbstractC3149m.m6701P0(i12, c2884s.f9316a.f6529h);
                long j4 = c2884s.f9317b;
                int i21 = C1939m0.f6574c;
                int i22 = (int) (j4 >> 32);
                int length2 = strM6701P0.length();
                if (i22 > length2) {
                    i22 = length2;
                }
                int i23 = (int) (j4 & 4294967295L);
                int length3 = strM6701P0.length();
                if (i23 > length3) {
                    i23 = length3;
                }
                interfaceC1809a12.setValue(new C2884s(4, strM6701P0, AbstractC1923e0.m4784b(i22, i23)));
                interfaceC1809a13.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                break;
        }
        return c3967n3;
    }

    public /* synthetic */ C0899v0(Object obj, int i9, Object obj2, int i10) {
        this.f2792g = i10;
        this.f2794i = obj;
        this.f2793h = i9;
        this.f2795j = obj2;
    }

    public /* synthetic */ C0899v0(Object obj, Object obj2, int i9, int i10) {
        this.f2792g = i10;
        this.f2794i = obj;
        this.f2795j = obj2;
        this.f2793h = i9;
    }
}
