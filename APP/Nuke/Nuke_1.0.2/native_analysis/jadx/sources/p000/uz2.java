package p000;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uz2 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f11569l;

    /* JADX INFO: renamed from: m */
    public int f11570m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ b03 f11571n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uz2(b03 b03Var, t00 t00Var, int i) {
        super(2, t00Var);
        this.f11569l = i;
        this.f11571n = b03Var;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f11569l;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                long j = ((rs1) obj).f9744a;
                return new uz2(this.f11571n, (t00) obj2, 0).mo7r(a83Var);
            case 1:
                return ((uz2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            default:
                return ((uz2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f11569l;
        b03 b03Var = this.f11571n;
        switch (i) {
            case 0:
                return new uz2(b03Var, t00Var, 0);
            case 1:
                return new uz2(b03Var, t00Var, 1);
            default:
                return new uz2(b03Var, t00Var, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0159  */
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7r(Object obj) {
        int i;
        C0690sd c0690sdM5049A;
        InterfaceC0668rt interfaceC0668rt;
        Object c0631qt;
        Object c0690sd;
        CharSequence text;
        CharSequence charSequence;
        int i2;
        Parcel parcel;
        C0690sd c0690sd2;
        int i3 = this.f11569l;
        tr0 tr0Var = tr0.f10906h;
        k20 k20Var = k20.f5323h;
        b03 b03Var = this.f11571n;
        a83 a83Var = a83.f116a;
        switch (i3) {
            case 0:
                int i4 = this.f11570m;
                if (i4 != 0) {
                    if (i4 == 1) {
                        fg1.m1627T(obj);
                    } else if (i4 != 2) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fg1.m1627T(obj);
                    }
                    break;
                } else {
                    fg1.m1627T(obj);
                    this.f11570m = 1;
                    if (b03Var.m355s(this) == k20Var) {
                    }
                }
                ow1 ow1VarM337a = b03.m337a(b03Var);
                if (ow1VarM337a != null) {
                    String str = (String) ow1VarM337a.f7862h;
                    long j = ((f13) ow1VarM337a.f7863i).f2739a;
                    p02 p02Var = b03Var.f489j;
                    if (p02Var != null) {
                        this.f11570m = 2;
                        Object objM3762R = (str.length() == 0 || f13.m1494c(j)) ? a83Var : AbstractC0570p7.m3762R(p02Var.f7907a, new C0379k9(p02Var, new C0188f2(j, null, p02Var, str), null, 7), this);
                        if (objM3762R != k20Var) {
                            objM3762R = a83Var;
                        }
                        if (objM3762R == k20Var) {
                        }
                    }
                }
                break;
            case 1:
                int i5 = this.f11570m;
                if (i5 != 0) {
                    if (i5 != 1) {
                        C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fg1.m1627T(obj);
                    }
                    break;
                } else {
                    fg1.m1627T(obj);
                    if (f13.m1494c(b03Var.m350n().f5297b) || !b03Var.m346j() || (b03Var.f485f instanceof tx1)) {
                        i = 1;
                        c0690sdM5049A = null;
                    } else {
                        c0690sdM5049A = t11.m5049A(b03Var.m350n());
                        C0690sd c0690sdM5051C = t11.m5051C(b03Var.m350n(), b03Var.m350n().f5296a.f10051i.length());
                        C0690sd c0690sdM5050B = t11.m5050B(b03Var.m350n(), b03Var.m350n().f5296a.f10051i.length());
                        C0615qd c0615qd = new C0615qd(c0690sdM5051C);
                        c0615qd.m4137a(c0690sdM5050B);
                        C0690sd c0690sdM4138b = c0615qd.m4138b();
                        int iM1497f = f13.m1497f(b03Var.m350n().f5297b);
                        b03Var.f482c.mo5j(b03.m340e(c0690sdM4138b, fg1.m1636i(iM1497f, iM1497f)));
                        b03Var.m353q(tr0Var);
                        i = 1;
                        b03Var.f480a.f12390e = true;
                    }
                    if (c0690sdM5049A != null && (interfaceC0668rt = b03Var.f487h) != null) {
                        C0631qt c0631qtM3575A = op0.m3575A(c0690sdM5049A);
                        this.f11570m = i;
                        ((C0303i6) interfaceC0668rt).m2279a(c0631qtM3575A);
                        if (a83Var == k20Var) {
                        }
                    }
                }
                break;
            default:
                int i6 = this.f11570m;
                if (i6 == 0) {
                    fg1.m1627T(obj);
                    InterfaceC0668rt interfaceC0668rt2 = b03Var.f487h;
                    if (interfaceC0668rt2 != null) {
                        this.f11570m = 1;
                        ClipData primaryClip = ((C0303i6) interfaceC0668rt2).f4283a.m2455a().getPrimaryClip();
                        c0631qt = primaryClip != null ? new C0631qt(primaryClip) : null;
                        if (c0631qt == k20Var) {
                        }
                    }
                } else if (i6 == 1) {
                    fg1.m1627T(obj);
                    c0631qt = obj;
                } else if (i6 != 2) {
                    C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.m1627T(obj);
                    c0690sd = obj;
                    c0690sd2 = (C0690sd) c0690sd;
                    if (c0690sd2 != null && b03Var.m346j()) {
                        C0615qd c0615qd2 = new C0615qd(t11.m5051C(b03Var.m350n(), b03Var.m350n().f5296a.f10051i.length()));
                        c0615qd2.m4137a(c0690sd2);
                        C0690sd c0690sdM4138b2 = c0615qd2.m4138b();
                        C0690sd c0690sdM5050B2 = t11.m5050B(b03Var.m350n(), b03Var.m350n().f5296a.f10051i.length());
                        C0615qd c0615qd3 = new C0615qd(c0690sdM4138b2);
                        c0615qd3.m4137a(c0690sdM5050B2);
                        C0690sd c0690sdM4138b3 = c0615qd3.m4138b();
                        int length = c0690sd2.f10051i.length() + f13.m1497f(b03Var.m350n().f5297b);
                        b03Var.f482c.mo5j(b03.m340e(c0690sdM4138b3, fg1.m1636i(length, length)));
                        b03Var.m353q(tr0Var);
                        b03Var.f480a.f12390e = true;
                    }
                }
                C0631qt c0631qt2 = (C0631qt) c0631qt;
                if (c0631qt2 != null) {
                    this.f11570m = 2;
                    int i7 = 0;
                    ClipData.Item itemAt = c0631qt2.f9158a.getItemAt(0);
                    if (itemAt == null || (text = itemAt.getText()) == null) {
                        c0690sd = null;
                    } else if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, spanned.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        annotationArr.getClass();
                        int length2 = annotationArr.length - 1;
                        if (length2 >= 0) {
                            int i8 = 0;
                            while (true) {
                                Annotation annotation = annotationArr[i8];
                                if (t11.m5086l(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned.getSpanStart(annotation);
                                    int spanEnd = spanned.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    u40 u40Var = new u40();
                                    Parcel parcelObtain = Parcel.obtain();
                                    u40Var.f11097a = parcelObtain;
                                    byte[] bArrDecode = Base64.decode(value, i7);
                                    charSequence = text;
                                    parcelObtain.unmarshall(bArrDecode, i7, bArrDecode.length);
                                    parcelObtain.setDataPosition(i7);
                                    Parcel parcel2 = u40Var.f11097a;
                                    long jM5463a = C0363ju.f5217g;
                                    long jM5463a2 = jM5463a;
                                    long jM5464b = p13.f7928c;
                                    long jM5464b2 = jM5464b;
                                    im0 im0Var = null;
                                    gm0 gm0Var = null;
                                    hm0 hm0Var = null;
                                    String string = null;
                                    C0888xj c0888xj = null;
                                    m03 m03Var = null;
                                    gz2 gz2Var = null;
                                    bq2 bq2Var = null;
                                    while (true) {
                                        if (parcel2.dataAvail() > 1) {
                                            byte b = parcel2.readByte();
                                            i2 = i7;
                                            if (b == 1) {
                                                if (parcel2.dataAvail() >= 8) {
                                                    jM5463a = u40Var.m5463a();
                                                    i7 = i2;
                                                }
                                            } else if (b == 2) {
                                                if (parcel2.dataAvail() >= 5) {
                                                    jM5464b = u40Var.m5464b();
                                                    i7 = i2;
                                                }
                                            } else if (b == 3) {
                                                if (parcel2.dataAvail() >= 4) {
                                                    im0Var = new im0(parcel2.readInt());
                                                    i7 = i2;
                                                }
                                            } else if (b == 4) {
                                                if (parcel2.dataAvail() >= 1) {
                                                    byte b2 = parcel2.readByte();
                                                    gm0 gm0Var2 = new gm0((b2 != 0 && b2 == 1) ? 1 : i2);
                                                    i7 = i2;
                                                    gm0Var = gm0Var2;
                                                }
                                            } else if (b != 5) {
                                                if (b == 6) {
                                                    string = parcel2.readString();
                                                } else if (b == 7) {
                                                    if (parcel2.dataAvail() >= 5) {
                                                        jM5464b2 = u40Var.m5464b();
                                                    }
                                                } else if (b == 8) {
                                                    if (parcel2.dataAvail() >= 4) {
                                                        i7 = i2;
                                                        c0888xj = new C0888xj(parcel2.readFloat());
                                                    }
                                                } else if (b == 9) {
                                                    if (parcel2.dataAvail() >= 8) {
                                                        m03Var = new m03(parcel2.readFloat(), parcel2.readFloat());
                                                    }
                                                } else if (b == 10) {
                                                    if (parcel2.dataAvail() >= 8) {
                                                        jM5463a2 = u40Var.m5463a();
                                                    }
                                                } else if (b != 11) {
                                                    parcel = parcel2;
                                                    if (b != 12) {
                                                        i7 = i2;
                                                        parcel2 = parcel;
                                                    } else if (parcel.dataAvail() >= 20) {
                                                        i7 = i2;
                                                        parcel2 = parcel;
                                                        bq2Var = new bq2(u40Var.m5463a(), (((long) Float.floatToRawIntBits(parcel.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcel.readFloat())) & 4294967295L), parcel.readFloat());
                                                    }
                                                } else if (parcel2.dataAvail() >= 4) {
                                                    int i9 = parcel2.readInt();
                                                    int i10 = (i9 & 2) != 0 ? 1 : i2;
                                                    int i11 = (i9 & 1) != 0 ? 1 : i2;
                                                    gz2 gz2Var2 = gz2.f3748d;
                                                    parcel = parcel2;
                                                    gz2 gz2Var3 = gz2.f3747c;
                                                    if (i10 != 0 && i11 != 0) {
                                                        List listM1435P = AbstractC0179eu.m1435P(gz2Var2, gz2Var3);
                                                        Integer numValueOf = Integer.valueOf(i2);
                                                        int size = listM1435P.size();
                                                        int i12 = i2;
                                                        while (i12 < size) {
                                                            numValueOf = Integer.valueOf(((gz2) listM1435P.get(i12)).f3749a | numValueOf.intValue());
                                                            i12++;
                                                            listM1435P = listM1435P;
                                                        }
                                                        gz2Var = new gz2(numValueOf.intValue());
                                                    } else if (i10 != 0) {
                                                        gz2Var = gz2Var2;
                                                    } else {
                                                        if (i11 == 0) {
                                                            gz2Var3 = gz2.f3746b;
                                                        }
                                                        gz2Var = gz2Var3;
                                                    }
                                                    i7 = i2;
                                                    parcel2 = parcel;
                                                }
                                                i7 = i2;
                                            } else if (parcel2.dataAvail() >= 1) {
                                                byte b3 = parcel2.readByte();
                                                if (b3 != 0) {
                                                    int i13 = b3 == 1 ? 65535 : b3 == 3 ? 2 : b3 == 2 ? 1 : i2;
                                                    hm0 hm0Var2 = new hm0(i13);
                                                    i7 = i2;
                                                    hm0Var = hm0Var2;
                                                }
                                            }
                                        } else {
                                            i2 = i7;
                                        }
                                    }
                                    arrayList.add(new C0652rd(spanStart, spanEnd, new lt2(jM5463a, jM5464b, im0Var, gm0Var, hm0Var, (mx2) null, string, jM5464b2, c0888xj, m03Var, (kc1) null, jM5463a2, gz2Var, bq2Var, 49152)));
                                } else {
                                    charSequence = text;
                                    i2 = i7;
                                }
                                if (i8 != length2) {
                                    i8++;
                                    text = charSequence;
                                    i7 = i2;
                                }
                            }
                        } else {
                            charSequence = text;
                        }
                        String string2 = charSequence.toString();
                        C0690sd c0690sd3 = AbstractC0730td.f10680a;
                        c0690sd = new C0690sd(arrayList.isEmpty() ? null : arrayList, string2);
                    } else {
                        c0690sd = new C0690sd(text.toString());
                    }
                    if (c0690sd == k20Var) {
                    }
                    c0690sd2 = (C0690sd) c0690sd;
                    if (c0690sd2 != null) {
                        C0615qd c0615qd22 = new C0615qd(t11.m5051C(b03Var.m350n(), b03Var.m350n().f5296a.f10051i.length()));
                        c0615qd22.m4137a(c0690sd2);
                        C0690sd c0690sdM4138b22 = c0615qd22.m4138b();
                        C0690sd c0690sdM5050B22 = t11.m5050B(b03Var.m350n(), b03Var.m350n().f5296a.f10051i.length());
                        C0615qd c0615qd32 = new C0615qd(c0690sdM4138b22);
                        c0615qd32.m4137a(c0690sdM5050B22);
                        C0690sd c0690sdM4138b32 = c0615qd32.m4138b();
                        int length3 = c0690sd2.f10051i.length() + f13.m1497f(b03Var.m350n().f5297b);
                        b03Var.f482c.mo5j(b03.m340e(c0690sdM4138b32, fg1.m1636i(length3, length3)));
                        b03Var.m353q(tr0Var);
                        b03Var.f480a.f12390e = true;
                    }
                }
                break;
        }
        return a83Var;
    }
}
