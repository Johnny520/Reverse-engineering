package p058L;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import com.bumptech.glide.AbstractC1922d;
import java.util.ArrayList;
import java.util.List;
import me.dartcv.nuke.BuildConfig;
import p000A.EnumC0052b0;
import p034G.C0462g;
import p047I0.C0734i;
import p047I0.C0741k0;
import p047I0.InterfaceC0744l0;
import p051J.C0810b;
import p056K2.C0882h;
import p056K2.C0891q;
import p061L2.AbstractC0972l;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p092S0.AbstractC1251D;
import p092S0.AbstractC1270h;
import p092S0.C1252E;
import p092S0.C1259L;
import p092S0.C1266d;
import p092S0.C1267e;
import p092S0.C1269g;
import p110W0.AbstractC1592q;
import p110W0.C1585j;
import p110W0.C1586k;
import p110W0.C1587l;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p125Z0.C1781b;
import p127Z2.AbstractC1784a;
import p147d1.C1951a;
import p147d1.C1962l;
import p147d1.C1966p;
import p153e1.C2019o;
import p160f3.AbstractC2162v;
import p160f3.InterfaceC2160t;
import p204n0.C2683b;
import p211o0.C2737L;
import p211o0.C2762u;
import p238t.AbstractC3205c;
import p238t.C3203a;

/* JADX INFO: renamed from: L.N */
/* JADX INFO: loaded from: classes.dex */
public final class C0912N extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2838h;

    /* JADX INFO: renamed from: i */
    public int f2839i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0920W f2840j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0912N(C0920W c0920w, InterfaceC1046d interfaceC1046d, int i5) {
        super(2, interfaceC1046d);
        this.f2838h = i5;
        this.f2840j = c0920w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f2838h) {
            case 0:
                long j5 = ((C2683b) obj).f8556a;
                return new C0912N(this.f2840j, (InterfaceC1046d) obj2, 0).mo8p(C0891q.f2780a);
            case BuildConfig.VERSION_CODE /* 1 */:
                return ((C0912N) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
            default:
                return ((C0912N) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f2838h) {
            case 0:
                return new C0912N(this.f2840j, interfaceC1046d, 0);
            case BuildConfig.VERSION_CODE /* 1 */:
                return new C0912N(this.f2840j, interfaceC1046d, 1);
            default:
                return new C0912N(this.f2840j, interfaceC1046d, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015f  */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) {
        int i5;
        C1269g c1269gM3434p;
        InterfaceC0744l0 interfaceC0744l0;
        Object c0741k0;
        Object c1269g;
        CharSequence text;
        CharSequence charSequence;
        Spanned spanned;
        int i6;
        Annotation[] annotationArr;
        Parcel parcel;
        C1269g c1269g2;
        int i7 = this.f2838h;
        EnumC0052b0 enumC0052b0 = EnumC0052b0.f211d;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        C0920W c0920w = this.f2840j;
        C0891q c0891q = C0891q.f2780a;
        switch (i7) {
            case 0:
                int i8 = this.f2839i;
                if (i8 == 0) {
                    AbstractC1784a.m3205S(obj);
                    this.f2839i = 1;
                    if (c0920w.m1944s(this) == enumC1152a) {
                        return enumC1152a;
                    }
                } else {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1784a.m3205S(obj);
                        return c0891q;
                    }
                    AbstractC1784a.m3205S(obj);
                }
                C0882h c0882hM1926a = C0920W.m1926a(c0920w);
                if (c0882hM1926a != null) {
                    String str = (String) c0882hM1926a.f2769d;
                    long j5 = ((C1259L) c0882hM1926a.f2770e).f4538a;
                    C0943o c0943o = c0920w.f2873i;
                    if (c0943o != null) {
                        this.f2839i = 2;
                        Object objM4001w = (str.length() == 0 || C1259L.m2335c(j5)) ? c0891q : AbstractC2162v.m4001w(c0943o.f2964a, new C0810b(c0943o, new C0462g(j5, c0943o, null, str), null), this);
                        if (objM4001w != enumC1152a) {
                            objM4001w = c0891q;
                        }
                        if (objM4001w == enumC1152a) {
                            return enumC1152a;
                        }
                    }
                }
                return c0891q;
            case BuildConfig.VERSION_CODE /* 1 */:
                int i9 = this.f2839i;
                if (i9 == 0) {
                    AbstractC1784a.m3205S(obj);
                    if (C1259L.m2335c(c0920w.m1939n().f5651b) || !c0920w.m1935j()) {
                        i5 = 1;
                        c1269gM3434p = null;
                    } else {
                        c1269gM3434p = AbstractC1922d.m3434p(c0920w.m1939n());
                        C1269g c1269gM3437t = AbstractC1922d.m3437t(c0920w.m1939n(), c0920w.m1939n().f5650a.f4563e.length());
                        C1269g c1269gM3436s = AbstractC1922d.m3436s(c0920w.m1939n(), c0920w.m1939n().f5650a.f4563e.length());
                        C1266d c1266d = new C1266d(c1269gM3437t);
                        c1266d.m2353a(c1269gM3436s);
                        C1269g c1269gM2354b = c1266d.m2354b();
                        int iM2338f = C1259L.m2338f(c0920w.m1939n().f5651b);
                        c0920w.f2867c.mo1h(C0920W.m1929e(c1269gM2354b, AbstractC1251D.m2313b(iM2338f, iM2338f)));
                        c0920w.m1942q(enumC0052b0);
                        i5 = 1;
                        c0920w.f2865a.f179e = true;
                    }
                    if (c1269gM3434p != null && (interfaceC0744l0 = c0920w.f2871g) != null) {
                        C0741k0 c0741k0M5480a = AbstractC3205c.m5480a(c1269gM3434p);
                        this.f2839i = i5;
                        ((C0734i) interfaceC0744l0).m1230a(c0741k0M5480a);
                        if (c0891q == enumC1152a) {
                            return enumC1152a;
                        }
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return c0891q;
            default:
                int i10 = this.f2839i;
                if (i10 == 0) {
                    AbstractC1784a.m3205S(obj);
                    InterfaceC0744l0 interfaceC0744l02 = c0920w.f2871g;
                    if (interfaceC0744l02 != null) {
                        this.f2839i = 1;
                        ClipData primaryClip = ((C0734i) interfaceC0744l02).f2311a.f2315a.getPrimaryClip();
                        c0741k0 = primaryClip != null ? new C0741k0(primaryClip) : null;
                        if (c0741k0 == enumC1152a) {
                            return enumC1152a;
                        }
                    }
                    return c0891q;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                    c1269g = obj;
                    c1269g2 = (C1269g) c1269g;
                    if (c1269g2 != null && c0920w.m1935j()) {
                        C1266d c1266d2 = new C1266d(AbstractC1922d.m3437t(c0920w.m1939n(), c0920w.m1939n().f5650a.f4563e.length()));
                        c1266d2.m2353a(c1269g2);
                        C1269g c1269gM2354b2 = c1266d2.m2354b();
                        C1269g c1269gM3436s2 = AbstractC1922d.m3436s(c0920w.m1939n(), c0920w.m1939n().f5650a.f4563e.length());
                        C1266d c1266d3 = new C1266d(c1269gM2354b2);
                        c1266d3.m2353a(c1269gM3436s2);
                        C1269g c1269gM2354b3 = c1266d3.m2354b();
                        int length = c1269g2.f4563e.length() + C1259L.m2338f(c0920w.m1939n().f5651b);
                        c0920w.f2867c.mo1h(C0920W.m1929e(c1269gM2354b3, AbstractC1251D.m2313b(length, length)));
                        c0920w.m1942q(enumC0052b0);
                        c0920w.f2865a.f179e = true;
                    }
                    return c0891q;
                }
                AbstractC1784a.m3205S(obj);
                c0741k0 = obj;
                C0741k0 c0741k02 = (C0741k0) c0741k0;
                if (c0741k02 != null) {
                    this.f2839i = 2;
                    ClipData clipData = c0741k02.f2321a;
                    int i11 = 0;
                    ClipData.Item itemAt = clipData.getItemAt(0);
                    if (itemAt == null || (text = itemAt.getText()) == null) {
                        c1269g = null;
                    } else if (text instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text;
                        Annotation[] annotationArr2 = (Annotation[]) spanned2.getSpans(0, spanned2.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        AbstractC1665j.m2985e(annotationArr2, "<this>");
                        int length2 = annotationArr2.length - 1;
                        if (length2 >= 0) {
                            int i12 = 0;
                            while (true) {
                                Annotation annotation = annotationArr2[i12];
                                if (AbstractC1665j.m2981a(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned2.getSpanStart(annotation);
                                    int spanEnd = spanned2.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    C3203a c3203a = new C3203a();
                                    charSequence = text;
                                    Parcel parcelObtain = Parcel.obtain();
                                    c3203a.f9976a = parcelObtain;
                                    byte[] bArrDecode = Base64.decode(value, i11);
                                    spanned = spanned2;
                                    parcelObtain.unmarshall(bArrDecode, i11, bArrDecode.length);
                                    parcelObtain.setDataPosition(i11);
                                    Parcel parcel2 = c3203a.f9976a;
                                    long jM5470a = C2762u.f8762g;
                                    long jM5470a2 = jM5470a;
                                    long jM5471b = C2019o.f6747c;
                                    long jM5471b2 = jM5471b;
                                    C1587l c1587l = null;
                                    C1585j c1585j = null;
                                    C1586k c1586k = null;
                                    String string = null;
                                    C1951a c1951a = null;
                                    C1966p c1966p = null;
                                    C1962l c1962l = null;
                                    C2737L c2737l = null;
                                    while (true) {
                                        if (parcel2.dataAvail() > 1) {
                                            byte b2 = parcel2.readByte();
                                            i6 = i11;
                                            if (b2 == 1) {
                                                if (parcel2.dataAvail() >= 8) {
                                                    jM5470a = c3203a.m5470a();
                                                    i11 = i6;
                                                }
                                            } else if (b2 == 2) {
                                                if (parcel2.dataAvail() >= 5) {
                                                    jM5471b = c3203a.m5471b();
                                                    i11 = i6;
                                                }
                                            } else if (b2 == 3) {
                                                if (parcel2.dataAvail() >= 4) {
                                                    c1587l = new C1587l(parcel2.readInt());
                                                    i11 = i6;
                                                }
                                            } else if (b2 == 4) {
                                                if (parcel2.dataAvail() >= 1) {
                                                    byte b5 = parcel2.readByte();
                                                    c1585j = new C1585j((b5 != 0 && b5 == 1) ? 1 : i6);
                                                    i11 = i6;
                                                }
                                            } else if (b2 != 5) {
                                                if (b2 == 6) {
                                                    string = parcel2.readString();
                                                } else if (b2 == 7) {
                                                    if (parcel2.dataAvail() >= 5) {
                                                        jM5471b2 = c3203a.m5471b();
                                                    }
                                                } else if (b2 == 8) {
                                                    if (parcel2.dataAvail() >= 4) {
                                                        c1951a = new C1951a(parcel2.readFloat());
                                                    }
                                                } else if (b2 == 9) {
                                                    if (parcel2.dataAvail() >= 8) {
                                                        c1966p = new C1966p(parcel2.readFloat(), parcel2.readFloat());
                                                    }
                                                } else if (b2 == 10) {
                                                    if (parcel2.dataAvail() >= 8) {
                                                        jM5470a2 = c3203a.m5470a();
                                                    }
                                                } else if (b2 != 11) {
                                                    parcel = parcel2;
                                                    if (b2 != 12) {
                                                        i11 = i6;
                                                        parcel2 = parcel;
                                                    } else if (parcel.dataAvail() >= 20) {
                                                        annotationArr2 = annotationArr2;
                                                        i11 = i6;
                                                        parcel2 = parcel;
                                                        c2737l = new C2737L(c3203a.m5470a(), (((long) Float.floatToRawIntBits(parcel.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcel.readFloat())) & 4294967295L), parcel.readFloat());
                                                    }
                                                } else if (parcel2.dataAvail() >= 4) {
                                                    int i13 = parcel2.readInt();
                                                    int i14 = (i13 & 2) != 0 ? 1 : i6;
                                                    int i15 = (i13 & 1) != 0 ? 1 : i6;
                                                    C1962l c1962l2 = C1962l.f6642d;
                                                    parcel = parcel2;
                                                    C1962l c1962l3 = C1962l.f6641c;
                                                    if (i14 != 0 && i15 != 0) {
                                                        List listM1987K = AbstractC0972l.m1987K(new C1962l[]{c1962l2, c1962l3});
                                                        Integer numValueOf = Integer.valueOf(i6);
                                                        int size = listM1987K.size();
                                                        int i16 = i6;
                                                        while (i16 < size) {
                                                            numValueOf = Integer.valueOf(((C1962l) listM1987K.get(i16)).f6643a | numValueOf.intValue());
                                                            i16++;
                                                            listM1987K = listM1987K;
                                                        }
                                                        c1962l = new C1962l(numValueOf.intValue());
                                                    } else if (i14 != 0) {
                                                        c1962l = c1962l2;
                                                    } else {
                                                        if (i15 == 0) {
                                                            c1962l3 = C1962l.f6640b;
                                                        }
                                                        c1962l = c1962l3;
                                                    }
                                                    i11 = i6;
                                                    parcel2 = parcel;
                                                }
                                                i11 = i6;
                                            } else if (parcel2.dataAvail() >= 1) {
                                                byte b6 = parcel2.readByte();
                                                if (b6 != 0) {
                                                    int i17 = b6 == 1 ? 65535 : b6 == 3 ? 2 : b6 == 2 ? 1 : i6;
                                                    c1586k = new C1586k(i17);
                                                    i11 = i6;
                                                }
                                            }
                                        } else {
                                            i6 = i11;
                                        }
                                    }
                                    annotationArr = annotationArr2;
                                    arrayList.add(new C1267e(spanStart, spanEnd, new C1252E(jM5470a, jM5471b, c1587l, c1585j, c1586k, (AbstractC1592q) null, string, jM5471b2, c1951a, c1966p, (C1781b) null, jM5470a2, c1962l, c2737l, 49152)));
                                } else {
                                    charSequence = text;
                                    i6 = i11;
                                    spanned = spanned2;
                                    annotationArr = annotationArr2;
                                }
                                if (i12 != length2) {
                                    i12++;
                                    text = charSequence;
                                    annotationArr2 = annotationArr;
                                    spanned2 = spanned;
                                    i11 = i6;
                                }
                            }
                        } else {
                            charSequence = text;
                        }
                        String string2 = charSequence.toString();
                        C1269g c1269g3 = AbstractC1270h.f4566a;
                        c1269g = new C1269g(arrayList.isEmpty() ? null : arrayList, string2);
                    } else {
                        c1269g = new C1269g(text.toString());
                    }
                    if (c1269g == enumC1152a) {
                        return enumC1152a;
                    }
                    c1269g2 = (C1269g) c1269g;
                    if (c1269g2 != null) {
                        C1266d c1266d22 = new C1266d(AbstractC1922d.m3437t(c0920w.m1939n(), c0920w.m1939n().f5650a.f4563e.length()));
                        c1266d22.m2353a(c1269g2);
                        C1269g c1269gM2354b22 = c1266d22.m2354b();
                        C1269g c1269gM3436s22 = AbstractC1922d.m3436s(c0920w.m1939n(), c0920w.m1939n().f5650a.f4563e.length());
                        C1266d c1266d32 = new C1266d(c1269gM2354b22);
                        c1266d32.m2353a(c1269gM3436s22);
                        C1269g c1269gM2354b32 = c1266d32.m2354b();
                        int length3 = c1269g2.f4563e.length() + C1259L.m2338f(c0920w.m1939n().f5651b);
                        c0920w.f2867c.mo1h(C0920W.m1929e(c1269gM2354b32, AbstractC1251D.m2313b(length3, length3)));
                        c0920w.m1942q(enumC0052b0);
                        c0920w.f2865a.f179e = true;
                    }
                }
                return c0891q;
        }
    }
}
