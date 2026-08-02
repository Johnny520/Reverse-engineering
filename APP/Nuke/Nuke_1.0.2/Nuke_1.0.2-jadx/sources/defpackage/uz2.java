package defpackage;

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
    public final /* synthetic */ int l;
    public int m;
    public final /* synthetic */ b03 n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uz2(b03 b03Var, t00 t00Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.n = b03Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.l;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                long j = ((rs1) obj).a;
                return new uz2(this.n, (t00) obj2, 0).r(a83Var);
            case 1:
                return ((uz2) p((t00) obj2, (j20) obj)).r(a83Var);
            default:
                return ((uz2) p((t00) obj2, (j20) obj)).r(a83Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.l;
        b03 b03Var = this.n;
        switch (i) {
            case 0:
                return new uz2(b03Var, t00Var, 0);
            case 1:
                return new uz2(b03Var, t00Var, 1);
            default:
                return new uz2(b03Var, t00Var, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0159  */
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) {
        int i;
        sd sdVarA;
        rt rtVar;
        Object qtVar;
        Object sdVar;
        CharSequence text;
        CharSequence charSequence;
        int i2;
        Parcel parcel;
        sd sdVar2;
        int i3 = this.l;
        tr0 tr0Var = tr0.h;
        k20 k20Var = k20.h;
        b03 b03Var = this.n;
        a83 a83Var = a83.a;
        switch (i3) {
            case 0:
                int i4 = this.m;
                if (i4 != 0) {
                    if (i4 == 1) {
                        fg1.T(obj);
                    } else if (i4 != 2) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fg1.T(obj);
                    }
                    break;
                } else {
                    fg1.T(obj);
                    this.m = 1;
                    if (b03Var.s(this) == k20Var) {
                    }
                }
                ow1 ow1VarA = b03.a(b03Var);
                if (ow1VarA != null) {
                    String str = (String) ow1VarA.h;
                    long j = ((f13) ow1VarA.i).a;
                    p02 p02Var = b03Var.j;
                    if (p02Var != null) {
                        this.m = 2;
                        Object objR = (str.length() == 0 || f13.c(j)) ? a83Var : p7.R(p02Var.a, new k9(p02Var, new f2(j, null, p02Var, str), null, 7), this);
                        if (objR != k20Var) {
                            objR = a83Var;
                        }
                        if (objR == k20Var) {
                        }
                    }
                }
                break;
            case 1:
                int i5 = this.m;
                if (i5 != 0) {
                    if (i5 != 1) {
                        s.l("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        fg1.T(obj);
                    }
                    break;
                } else {
                    fg1.T(obj);
                    if (f13.c(b03Var.n().b) || !b03Var.j() || (b03Var.f instanceof tx1)) {
                        i = 1;
                        sdVarA = null;
                    } else {
                        sdVarA = t11.A(b03Var.n());
                        sd sdVarC = t11.C(b03Var.n(), b03Var.n().a.i.length());
                        sd sdVarB = t11.B(b03Var.n(), b03Var.n().a.i.length());
                        qd qdVar = new qd(sdVarC);
                        qdVar.a(sdVarB);
                        sd sdVarB2 = qdVar.b();
                        int iF = f13.f(b03Var.n().b);
                        b03Var.c.j(b03.e(sdVarB2, fg1.i(iF, iF)));
                        b03Var.q(tr0Var);
                        i = 1;
                        b03Var.a.e = true;
                    }
                    if (sdVarA != null && (rtVar = b03Var.h) != null) {
                        qt qtVarA = op0.A(sdVarA);
                        this.m = i;
                        ((i6) rtVar).a(qtVarA);
                        if (a83Var == k20Var) {
                        }
                    }
                }
                break;
            default:
                int i6 = this.m;
                if (i6 == 0) {
                    fg1.T(obj);
                    rt rtVar2 = b03Var.h;
                    if (rtVar2 != null) {
                        this.m = 1;
                        ClipData primaryClip = ((i6) rtVar2).a.a().getPrimaryClip();
                        qtVar = primaryClip != null ? new qt(primaryClip) : null;
                        if (qtVar == k20Var) {
                        }
                    }
                } else if (i6 == 1) {
                    fg1.T(obj);
                    qtVar = obj;
                } else if (i6 != 2) {
                    s.l("call to 'resume' before 'invoke' with coroutine");
                } else {
                    fg1.T(obj);
                    sdVar = obj;
                    sdVar2 = (sd) sdVar;
                    if (sdVar2 != null && b03Var.j()) {
                        qd qdVar2 = new qd(t11.C(b03Var.n(), b03Var.n().a.i.length()));
                        qdVar2.a(sdVar2);
                        sd sdVarB3 = qdVar2.b();
                        sd sdVarB4 = t11.B(b03Var.n(), b03Var.n().a.i.length());
                        qd qdVar3 = new qd(sdVarB3);
                        qdVar3.a(sdVarB4);
                        sd sdVarB5 = qdVar3.b();
                        int length = sdVar2.i.length() + f13.f(b03Var.n().b);
                        b03Var.c.j(b03.e(sdVarB5, fg1.i(length, length)));
                        b03Var.q(tr0Var);
                        b03Var.a.e = true;
                    }
                }
                qt qtVar2 = (qt) qtVar;
                if (qtVar2 != null) {
                    this.m = 2;
                    int i7 = 0;
                    ClipData.Item itemAt = qtVar2.a.getItemAt(0);
                    if (itemAt == null || (text = itemAt.getText()) == null) {
                        sdVar = null;
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
                                if (t11.l(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned.getSpanStart(annotation);
                                    int spanEnd = spanned.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    u40 u40Var = new u40();
                                    Parcel parcelObtain = Parcel.obtain();
                                    u40Var.a = parcelObtain;
                                    byte[] bArrDecode = Base64.decode(value, i7);
                                    charSequence = text;
                                    parcelObtain.unmarshall(bArrDecode, i7, bArrDecode.length);
                                    parcelObtain.setDataPosition(i7);
                                    Parcel parcel2 = u40Var.a;
                                    long jA = ju.g;
                                    long jA2 = jA;
                                    long jB = p13.c;
                                    long jB2 = jB;
                                    im0 im0Var = null;
                                    gm0 gm0Var = null;
                                    hm0 hm0Var = null;
                                    String string = null;
                                    xj xjVar = null;
                                    m03 m03Var = null;
                                    gz2 gz2Var = null;
                                    bq2 bq2Var = null;
                                    while (true) {
                                        if (parcel2.dataAvail() > 1) {
                                            byte b = parcel2.readByte();
                                            i2 = i7;
                                            if (b == 1) {
                                                if (parcel2.dataAvail() >= 8) {
                                                    jA = u40Var.a();
                                                    i7 = i2;
                                                }
                                            } else if (b == 2) {
                                                if (parcel2.dataAvail() >= 5) {
                                                    jB = u40Var.b();
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
                                                        jB2 = u40Var.b();
                                                    }
                                                } else if (b == 8) {
                                                    if (parcel2.dataAvail() >= 4) {
                                                        i7 = i2;
                                                        xjVar = new xj(parcel2.readFloat());
                                                    }
                                                } else if (b == 9) {
                                                    if (parcel2.dataAvail() >= 8) {
                                                        m03Var = new m03(parcel2.readFloat(), parcel2.readFloat());
                                                    }
                                                } else if (b == 10) {
                                                    if (parcel2.dataAvail() >= 8) {
                                                        jA2 = u40Var.a();
                                                    }
                                                } else if (b != 11) {
                                                    parcel = parcel2;
                                                    if (b != 12) {
                                                        i7 = i2;
                                                        parcel2 = parcel;
                                                    } else if (parcel.dataAvail() >= 20) {
                                                        i7 = i2;
                                                        parcel2 = parcel;
                                                        bq2Var = new bq2(u40Var.a(), (((long) Float.floatToRawIntBits(parcel.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcel.readFloat())) & 4294967295L), parcel.readFloat());
                                                    }
                                                } else if (parcel2.dataAvail() >= 4) {
                                                    int i9 = parcel2.readInt();
                                                    int i10 = (i9 & 2) != 0 ? 1 : i2;
                                                    int i11 = (i9 & 1) != 0 ? 1 : i2;
                                                    gz2 gz2Var2 = gz2.d;
                                                    parcel = parcel2;
                                                    gz2 gz2Var3 = gz2.c;
                                                    if (i10 != 0 && i11 != 0) {
                                                        List listP = eu.P(gz2Var2, gz2Var3);
                                                        Integer numValueOf = Integer.valueOf(i2);
                                                        int size = listP.size();
                                                        int i12 = i2;
                                                        while (i12 < size) {
                                                            numValueOf = Integer.valueOf(((gz2) listP.get(i12)).a | numValueOf.intValue());
                                                            i12++;
                                                            listP = listP;
                                                        }
                                                        gz2Var = new gz2(numValueOf.intValue());
                                                    } else if (i10 != 0) {
                                                        gz2Var = gz2Var2;
                                                    } else {
                                                        if (i11 == 0) {
                                                            gz2Var3 = gz2.b;
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
                                    arrayList.add(new rd(spanStart, spanEnd, new lt2(jA, jB, im0Var, gm0Var, hm0Var, (mx2) null, string, jB2, xjVar, m03Var, (kc1) null, jA2, gz2Var, bq2Var, 49152)));
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
                        sd sdVar3 = td.a;
                        sdVar = new sd(arrayList.isEmpty() ? null : arrayList, string2);
                    } else {
                        sdVar = new sd(text.toString());
                    }
                    if (sdVar == k20Var) {
                    }
                    sdVar2 = (sd) sdVar;
                    if (sdVar2 != null) {
                        qd qdVar22 = new qd(t11.C(b03Var.n(), b03Var.n().a.i.length()));
                        qdVar22.a(sdVar2);
                        sd sdVarB32 = qdVar22.b();
                        sd sdVarB42 = t11.B(b03Var.n(), b03Var.n().a.i.length());
                        qd qdVar32 = new qd(sdVarB32);
                        qdVar32.a(sdVarB42);
                        sd sdVarB52 = qdVar32.b();
                        int length3 = sdVar2.i.length() + f13.f(b03Var.n().b);
                        b03Var.c.j(b03.e(sdVarB52, fg1.i(length3, length3)));
                        b03Var.q(tr0Var);
                        b03Var.a.e = true;
                    }
                }
                break;
        }
        return a83Var;
    }
}
