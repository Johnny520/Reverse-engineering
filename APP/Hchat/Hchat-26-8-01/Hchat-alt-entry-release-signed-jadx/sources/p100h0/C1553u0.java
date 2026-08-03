package p100h0;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import ci.C0579e;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Settings;
import p000a.AbstractC0000a;
import p027c0.C0364i;
import p057e1.C0807b;
import p071f1.C1024q0;
import p071f1.C1034w;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p119i2.AbstractC1923e0;
import p119i2.AbstractC1928h;
import p119i2.C1920d;
import p119i2.C1922e;
import p119i2.C1925f0;
import p119i2.C1926g;
import p119i2.C1939m0;
import p129ig.AbstractC2043a;
import p136j8.C2104o;
import p177m2.AbstractC2772p;
import p177m2.C2765i;
import p177m2.C2766j;
import p177m2.C2767k;
import p201o.AbstractC3028d;
import p201o.C3025a;
import p225p2.C3290b;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3958e;
import p276sf.C3967n;
import p280t2.C4085a;
import p280t2.C4096l;
import p280t2.C4100p;
import p293u2.C4245o;
import p321w.EnumC4602h0;
import p352xf.EnumC5799a;
import p357y1.C5886h;
import p357y1.C5951x0;
import p357y1.InterfaceC5955y0;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: h0.u0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1553u0 extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5181h;

    /* JADX INFO: renamed from: i */
    public int f5182i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1511d1 f5183j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1553u0(C1511d1 c1511d1, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f5181h = i9;
        this.f5183j = c1511d1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f5181h) {
            case 0:
                C1553u0 c1553u0 = new C1553u0(this.f5183j, interfaceC5557c, 0);
                long j3 = ((C0807b) obj).f2414a;
                return c1553u0;
            case 1:
                return new C1553u0(this.f5183j, interfaceC5557c, 1);
            default:
                return new C1553u0(this.f5183j, interfaceC5557c, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5181h) {
            case 0:
                long j3 = ((C0807b) obj).f2414a;
                break;
        }
        return ((C1553u0) create((InterfaceC3599t) obj, (InterfaceC5557c) obj2)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015f  */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i9;
        C1926g c1926gM5052z;
        InterfaceC5955y0 interfaceC5955y0;
        Object c5951x0;
        Object c1926g;
        CharSequence text;
        CharSequence charSequence;
        Spanned spanned;
        int i10;
        Annotation[] annotationArr;
        Parcel parcel;
        C1926g c1926g2;
        int i11 = this.f5181h;
        EnumC4602h0 enumC4602h0 = EnumC4602h0.f15180g;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        C1511d1 c1511d1 = this.f5183j;
        C3967n c3967n = C3967n.f12976a;
        switch (i11) {
            case 0:
                int i12 = this.f5182i;
                if (i12 != 0) {
                    if (i12 == 1) {
                        AbstractC1089i.m2732I0(obj);
                    } else if (i12 != 2) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        AbstractC1089i.m2732I0(obj);
                    }
                    break;
                } else {
                    AbstractC1089i.m2732I0(obj);
                    this.f5182i = 1;
                    if (c1511d1.m4033s(this) == enumC5799a) {
                    }
                }
                C3958e c3958eM4015a = C1511d1.m4015a(c1511d1);
                if (c3958eM4015a != null) {
                    String str = (String) c3958eM4015a.f12961g;
                    long j3 = ((C1939m0) c3958eM4015a.f12962h).f6575a;
                    C1542p c1542p = c1511d1.f5037i;
                    if (c1542p != null) {
                        this.f5182i = 2;
                        Object objM7570x = (str.length() == 0 || C1939m0.m4813c(j3)) ? c3967n : AbstractC3603v.m7570x(c1542p.f5142a, new C0579e(c1542p, new C0364i(c1542p, str, j3, (InterfaceC5557c) null, 2), (InterfaceC5557c) null), this);
                        if (objM7570x != enumC5799a) {
                            objM7570x = c3967n;
                        }
                        if (objM7570x == enumC5799a) {
                        }
                    }
                }
                break;
            case 1:
                int i13 = this.f5182i;
                if (i13 != 0) {
                    if (i13 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        AbstractC1089i.m2732I0(obj);
                    }
                    break;
                } else {
                    AbstractC1089i.m2732I0(obj);
                    if (C1939m0.m4813c(c1511d1.m4028n().f9317b) || !c1511d1.m4024j()) {
                        i9 = 1;
                        c1926gM5052z = null;
                    } else {
                        c1926gM5052z = AbstractC2043a.m5052z(c1511d1.m4028n());
                        C1926g c1926gM4997C = AbstractC2043a.m4997C(c1511d1.m4028n(), c1511d1.m4028n().f9316a.f6529h.length());
                        C1926g c1926gM4996B = AbstractC2043a.m4996B(c1511d1.m4028n(), c1511d1.m4028n().f9316a.f6529h.length());
                        C1920d c1920d = new C1920d(c1926gM4997C);
                        c1920d.m4776a(c1926gM4996B);
                        C1926g c1926gM4780e = c1920d.m4780e();
                        int iM4816f = C1939m0.m4816f(c1511d1.m4028n().f9317b);
                        c1511d1.f5031c.invoke(C1511d1.m4018e(c1926gM4780e, AbstractC1923e0.m4784b(iM4816f, iM4816f)));
                        c1511d1.m4031q(enumC4602h0);
                        i9 = 1;
                        c1511d1.f5029a.f15356e = true;
                    }
                    if (c1926gM5052z != null && (interfaceC5955y0 = c1511d1.f5035g) != null) {
                        C5951x0 c5951x0M6433a = AbstractC3028d.m6433a(c1926gM5052z);
                        this.f5182i = i9;
                        ((C5886h) interfaceC5955y0).m10607a(c5951x0M6433a);
                        if (c3967n == enumC5799a) {
                        }
                    }
                }
                break;
            default:
                int i14 = this.f5182i;
                if (i14 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    InterfaceC5955y0 interfaceC5955y02 = c1511d1.f5035g;
                    if (interfaceC5955y02 != null) {
                        this.f5182i = 1;
                        ClipData primaryClip = ((C5886h) interfaceC5955y02).f23887a.m10610a().getPrimaryClip();
                        c5951x0 = primaryClip != null ? new C5951x0(primaryClip) : null;
                        if (c5951x0 == enumC5799a) {
                        }
                    }
                } else if (i14 == 1) {
                    AbstractC1089i.m2732I0(obj);
                    c5951x0 = obj;
                } else if (i14 != 2) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                    c1926g = obj;
                    c1926g2 = (C1926g) c1926g;
                    if (c1926g2 != null && c1511d1.m4024j()) {
                        C1920d c1920d2 = new C1920d(AbstractC2043a.m4997C(c1511d1.m4028n(), c1511d1.m4028n().f9316a.f6529h.length()));
                        c1920d2.m4776a(c1926g2);
                        C1926g c1926gM4780e2 = c1920d2.m4780e();
                        C1926g c1926gM4996B2 = AbstractC2043a.m4996B(c1511d1.m4028n(), c1511d1.m4028n().f9316a.f6529h.length());
                        C1920d c1920d3 = new C1920d(c1926gM4780e2);
                        c1920d3.m4776a(c1926gM4996B2);
                        C1926g c1926gM4780e3 = c1920d3.m4780e();
                        int length = c1926g2.f6529h.length() + C1939m0.m4816f(c1511d1.m4028n().f9317b);
                        c1511d1.f5031c.invoke(C1511d1.m4018e(c1926gM4780e3, AbstractC1923e0.m4784b(length, length)));
                        c1511d1.m4031q(enumC4602h0);
                        c1511d1.f5029a.f15356e = true;
                    }
                }
                C5951x0 c5951x02 = (C5951x0) c5951x0;
                if (c5951x02 != null) {
                    this.f5182i = 2;
                    ClipData clipData = c5951x02.f24180a;
                    int i15 = 0;
                    ClipData.Item itemAt = clipData.getItemAt(0);
                    if (itemAt == null || (text = itemAt.getText()) == null) {
                        c1926g = null;
                    } else if (text instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text;
                        Annotation[] annotationArr2 = (Annotation[]) spanned2.getSpans(0, spanned2.length(), Annotation.class);
                        ArrayList arrayList = new ArrayList();
                        annotationArr2.getClass();
                        int length2 = annotationArr2.length - 1;
                        if (length2 >= 0) {
                            int i16 = 0;
                            while (true) {
                                Annotation annotation = annotationArr2[i16];
                                if (AbstractC1416l.m3825a(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                    int spanStart = spanned2.getSpanStart(annotation);
                                    int spanEnd = spanned2.getSpanEnd(annotation);
                                    String value = annotation.getValue();
                                    C3025a c3025a = new C3025a();
                                    charSequence = text;
                                    Parcel parcelObtain = Parcel.obtain();
                                    c3025a.f9830a = parcelObtain;
                                    byte[] bArrDecode = Base64.decode(value, i15);
                                    spanned = spanned2;
                                    parcelObtain.unmarshall(bArrDecode, i15, bArrDecode.length);
                                    parcelObtain.setDataPosition(i15);
                                    Parcel parcel2 = c3025a.f9830a;
                                    long jM6423a = C1034w.f3263g;
                                    long jM6423a2 = jM6423a;
                                    long jM6424b = C4245o.f13924c;
                                    long jM6424b2 = jM6424b;
                                    C2767k c2767k = null;
                                    C2765i c2765i = null;
                                    C2766j c2766j = null;
                                    String string = null;
                                    C4085a c4085a = null;
                                    C4100p c4100p = null;
                                    C4096l c4096l = null;
                                    C1024q0 c1024q0 = null;
                                    while (true) {
                                        if (parcel2.dataAvail() > 1) {
                                            byte b10 = parcel2.readByte();
                                            i10 = i15;
                                            if (b10 == 1) {
                                                if (parcel2.dataAvail() >= 8) {
                                                    jM6423a = c3025a.m6423a();
                                                    i15 = i10;
                                                }
                                            } else if (b10 == 2) {
                                                if (parcel2.dataAvail() >= 5) {
                                                    jM6424b = c3025a.m6424b();
                                                    i15 = i10;
                                                }
                                            } else if (b10 == 3) {
                                                if (parcel2.dataAvail() >= 4) {
                                                    c2767k = new C2767k(parcel2.readInt());
                                                    i15 = i10;
                                                }
                                            } else if (b10 == 4) {
                                                if (parcel2.dataAvail() >= 1) {
                                                    byte b11 = parcel2.readByte();
                                                    c2765i = new C2765i((b11 != 0 && b11 == 1) ? 1 : i10);
                                                    i15 = i10;
                                                }
                                            } else if (b10 != 5) {
                                                if (b10 == 6) {
                                                    string = parcel2.readString();
                                                } else if (b10 == 7) {
                                                    if (parcel2.dataAvail() >= 5) {
                                                        jM6424b2 = c3025a.m6424b();
                                                    }
                                                } else if (b10 == 8) {
                                                    if (parcel2.dataAvail() >= 4) {
                                                        c4085a = new C4085a(parcel2.readFloat());
                                                    }
                                                } else if (b10 == 9) {
                                                    if (parcel2.dataAvail() >= 8) {
                                                        c4100p = new C4100p(parcel2.readFloat(), parcel2.readFloat());
                                                    }
                                                } else if (b10 == 10) {
                                                    if (parcel2.dataAvail() >= 8) {
                                                        jM6423a2 = c3025a.m6423a();
                                                    }
                                                } else if (b10 != 11) {
                                                    parcel = parcel2;
                                                    if (b10 != 12) {
                                                        i15 = i10;
                                                        parcel2 = parcel;
                                                    } else if (parcel.dataAvail() >= 20) {
                                                        annotationArr2 = annotationArr2;
                                                        i15 = i10;
                                                        parcel2 = parcel;
                                                        c1024q0 = new C1024q0(parcel.readFloat(), c3025a.m6423a(), (((long) Float.floatToRawIntBits(parcel.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcel.readFloat())) & 4294967295L));
                                                    }
                                                } else if (parcel2.dataAvail() >= 4) {
                                                    int i17 = parcel2.readInt();
                                                    int i18 = (i17 & 2) != 0 ? 1 : i10;
                                                    int i19 = (i17 & 1) != 0 ? 1 : i10;
                                                    C4096l c4096l2 = C4096l.f13560d;
                                                    parcel = parcel2;
                                                    C4096l c4096l3 = C4096l.f13559c;
                                                    if (i18 != 0 && i19 != 0) {
                                                        List listM101y0 = AbstractC0000a.m101y0(c4096l2, c4096l3);
                                                        Integer numValueOf = Integer.valueOf(i10);
                                                        int size = listM101y0.size();
                                                        int i20 = i10;
                                                        while (i20 < size) {
                                                            numValueOf = Integer.valueOf(((C4096l) listM101y0.get(i20)).f13561a | numValueOf.intValue());
                                                            i20++;
                                                            listM101y0 = listM101y0;
                                                        }
                                                        c4096l = new C4096l(numValueOf.intValue());
                                                    } else if (i18 != 0) {
                                                        c4096l = c4096l2;
                                                    } else {
                                                        if (i19 == 0) {
                                                            c4096l3 = C4096l.f13558b;
                                                        }
                                                        c4096l = c4096l3;
                                                    }
                                                    i15 = i10;
                                                    parcel2 = parcel;
                                                }
                                                i15 = i10;
                                            } else if (parcel2.dataAvail() >= 1) {
                                                byte b12 = parcel2.readByte();
                                                if (b12 != 0) {
                                                    int i21 = b12 == 1 ? Settings.DEFAULT_INITIAL_WINDOW_SIZE : b12 == 3 ? 2 : b12 == 2 ? 1 : i10;
                                                    c2766j = new C2766j(i21);
                                                    i15 = i10;
                                                }
                                            }
                                        } else {
                                            i10 = i15;
                                        }
                                    }
                                    annotationArr = annotationArr2;
                                    arrayList.add(new C1922e(spanStart, spanEnd, new C1925f0(jM6423a, jM6424b, c2767k, c2765i, c2766j, (AbstractC2772p) null, string, jM6424b2, c4085a, c4100p, (C3290b) null, jM6423a2, c4096l, c1024q0, 49152)));
                                } else {
                                    charSequence = text;
                                    i10 = i15;
                                    spanned = spanned2;
                                    annotationArr = annotationArr2;
                                }
                                if (i16 != length2) {
                                    i16++;
                                    text = charSequence;
                                    annotationArr2 = annotationArr;
                                    spanned2 = spanned;
                                    i15 = i10;
                                }
                            }
                        } else {
                            charSequence = text;
                        }
                        String string2 = charSequence.toString();
                        C1926g c1926g3 = AbstractC1928h.f6536a;
                        c1926g = new C1926g(arrayList.isEmpty() ? null : arrayList, string2);
                    } else {
                        c1926g = new C1926g(text.toString());
                    }
                    if (c1926g == enumC5799a) {
                    }
                    c1926g2 = (C1926g) c1926g;
                    if (c1926g2 != null) {
                        C1920d c1920d22 = new C1920d(AbstractC2043a.m4997C(c1511d1.m4028n(), c1511d1.m4028n().f9316a.f6529h.length()));
                        c1920d22.m4776a(c1926g2);
                        C1926g c1926gM4780e22 = c1920d22.m4780e();
                        C1926g c1926gM4996B22 = AbstractC2043a.m4996B(c1511d1.m4028n(), c1511d1.m4028n().f9316a.f6529h.length());
                        C1920d c1920d32 = new C1920d(c1926gM4780e22);
                        c1920d32.m4776a(c1926gM4996B22);
                        C1926g c1926gM4780e32 = c1920d32.m4780e();
                        int length3 = c1926g2.f6529h.length() + C1939m0.m4816f(c1511d1.m4028n().f9317b);
                        c1511d1.f5031c.invoke(C1511d1.m4018e(c1926gM4780e32, AbstractC1923e0.m4784b(length3, length3)));
                        c1511d1.m4031q(enumC4602h0);
                        c1511d1.f5029a.f15356e = true;
                    }
                }
                break;
        }
        return c3967n;
    }
}
