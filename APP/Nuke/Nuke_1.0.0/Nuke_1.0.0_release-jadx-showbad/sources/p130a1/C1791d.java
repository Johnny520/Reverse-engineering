package p130a1;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import com.bumptech.glide.AbstractC1926h;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import p000A.C0072l0;
import p041H0.C0549A;
import p049I2.AbstractC0797o;
import p056K2.C0882h;
import p058L.C0904F;
import p061L2.AbstractC0974n;
import p092S0.AbstractC1270h;
import p092S0.C1252E;
import p092S0.C1260M;
import p092S0.C1267e;
import p092S0.C1282t;
import p092S0.C1284v;
import p092S0.C1285w;
import p092S0.InterfaceC1264b;
import p092S0.InterfaceC1281s;
import p096T0.C1402b;
import p096T0.C1405e;
import p106V0.C1487a;
import p106V0.C1488b;
import p106V0.C1491e;
import p106V0.C1492f;
import p106V0.C1493g;
import p106V0.C1494h;
import p106V0.C1496j;
import p106V0.C1497k;
import p110W0.AbstractC1592q;
import p110W0.C1581f;
import p110W0.C1585j;
import p110W0.C1586k;
import p110W0.C1587l;
import p110W0.C1594s;
import p110W0.InterfaceC1580e;
import p117X2.AbstractC1665j;
import p125Z0.AbstractC1782c;
import p125Z0.C1780a;
import p125Z0.C1781b;
import p141c1.C1888a;
import p141c1.C1889b;
import p147d1.C1951a;
import p147d1.C1959i;
import p147d1.C1962l;
import p147d1.C1966p;
import p147d1.C1967q;
import p147d1.C1969s;
import p147d1.InterfaceC1965o;
import p149d3.AbstractC1976d;
import p153e1.C2019o;
import p153e1.C2020p;
import p153e1.InterfaceC2007c;
import p211o0.AbstractC2736K;
import p211o0.AbstractC2758q;
import p211o0.AbstractC2767z;
import p211o0.C2737L;
import p211o0.C2740O;
import p211o0.C2762u;
import p222q0.AbstractC2902c;
import p262x1.AbstractC3447a;

/* JADX INFO: renamed from: a1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1791d implements InterfaceC1281s {

    /* JADX INFO: renamed from: a */
    public final String f6107a;

    /* JADX INFO: renamed from: b */
    public final C1260M f6108b;

    /* JADX INFO: renamed from: c */
    public final List f6109c;

    /* JADX INFO: renamed from: d */
    public final List f6110d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1580e f6111e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2007c f6112f;

    /* JADX INFO: renamed from: g */
    public final C1793f f6113g;

    /* JADX INFO: renamed from: h */
    public final CharSequence f6114h;

    /* JADX INFO: renamed from: i */
    public final C1405e f6115i;

    /* JADX INFO: renamed from: j */
    public C0072l0 f6116j;

    /* JADX INFO: renamed from: k */
    public final int f6117k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:422:0x0309 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x076e  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0805 A[LOOP:6: B:395:0x0803->B:396:0x0805, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x084c  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004b  */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v99 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1791d(String str, C1260M c1260m, List list, List list2, InterfaceC1580e interfaceC1580e, InterfaceC2007c interfaceC2007c) {
        Locale locale;
        int i5;
        Object obj;
        Typeface typeface;
        long j5;
        ?? arrayList;
        long j6;
        ?? r12;
        float f2;
        long j7;
        InterfaceC2007c interfaceC2007c2;
        List list3;
        ArrayList arrayList2;
        int size;
        int i6;
        ArrayList arrayList3;
        C1252E c1252e;
        int i7;
        int size2;
        int i8;
        boolean z5;
        C1967q c1967q;
        int size3;
        int i9;
        int i10;
        int i11;
        boolean z6;
        int i12;
        int i13;
        long j8;
        float fM3710c;
        C1284v c1284v;
        this.f6107a = str;
        this.f6108b = c1260m;
        this.f6109c = list;
        this.f6110d = list2;
        this.f6111e = interfaceC1580e;
        this.f6112f = interfaceC2007c;
        float fMo272b = interfaceC2007c.mo272b();
        C1793f c1793f = new C1793f(1);
        ((TextPaint) c1793f).density = fMo272b;
        c1793f.f6121b = C1962l.f6640b;
        c1793f.f6122c = 3;
        c1793f.f6123d = C2737L.f8703d;
        this.f6113g = c1793f;
        AbstractC1796i.m3267a(c1260m);
        C1282t c1282t = c1260m.f4541b;
        int i14 = c1282t.f4606b;
        C1252E c1252e2 = c1260m.f4540a;
        C1781b c1781b = c1252e2.f4504k;
        int i15 = 0;
        if (i14 != 4) {
            if (i14 != 5) {
                if (i14 == 1) {
                    i5 = 0;
                } else if (i14 == 2) {
                    i5 = 1;
                } else {
                    if (i14 != 3 && i14 != 0) {
                        throw new IllegalStateException("Invalid TextDirection.");
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((c1781b == null || (locale = ((C1780a) c1781b.f6090d.get(0)).f6088a) == null) ? Locale.getDefault() : locale);
                    i5 = (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) ? 2 : 3;
                }
            }
        }
        this.f6117k = i5;
        C1790c c1790c = new C1790c(i15, this);
        C1969s c1969s = c1282t.f4613i;
        c1969s = c1969s == null ? C1969s.f6653c : c1969s;
        c1793f.setFlags(c1969s.f6656b ? c1793f.getFlags() | 128 : c1793f.getFlags() & (-129));
        int i16 = c1969s.f6655a;
        if (i16 == 1) {
            c1793f.setFlags(c1793f.getFlags() | 64);
            c1793f.setHinting(0);
        } else if (i16 == 2) {
            c1793f.getFlags();
            c1793f.setHinting(1);
        } else if (i16 == 3) {
            c1793f.getFlags();
            c1793f.setHinting(0);
        } else {
            c1793f.getFlags();
        }
        int size4 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size4) {
                obj = null;
                break;
            }
            obj = list.get(i17);
            if (((C1267e) obj).f4557a instanceof C1252E) {
                break;
            } else {
                i17++;
            }
        }
        boolean z7 = obj != null;
        long j9 = c1252e2.f4495b;
        C1587l c1587l = c1252e2.f4496c;
        C1585j c1585j = c1252e2.f4497d;
        String str2 = c1252e2.f4500g;
        C1781b c1781b2 = c1252e2.f4504k;
        InterfaceC1965o interfaceC1965o = c1252e2.f4494a;
        C1966p c1966p = c1252e2.f4503j;
        long j10 = c1252e2.f4501h;
        long jM3709b = C2019o.m3709b(j9);
        if (C2020p.m3712a(jM3709b, 4294967296L)) {
            c1793f.setTextSize(interfaceC2007c.mo276e0(j9));
        } else if (C2020p.m3712a(jM3709b, 8589934592L)) {
            c1793f.setTextSize(C2019o.m3710c(j9) * c1793f.getTextSize());
        }
        AbstractC1592q abstractC1592q = c1252e2.f4499f;
        if (abstractC1592q != null || c1585j != null || c1587l != null) {
            c1587l = c1587l == null ? C1587l.f5502f : c1587l;
            int i18 = c1585j != null ? c1585j.f5499a : 0;
            C1586k c1586k = c1252e2.f4498e;
            int i19 = c1586k != null ? c1586k.f5500a : 65535;
            C1791d c1791d = (C1791d) c1790c.f6106e;
            C1594s c1594sM2854b = ((C1581f) c1791d.f6111e).m2854b(abstractC1592q, c1587l, i18, i19);
            if (c1594sM2854b instanceof C1594s) {
                Object obj2 = c1594sM2854b.f5520d;
                AbstractC1665j.m2983c(obj2, "null cannot be cast to non-null type android.graphics.Typeface");
                typeface = (Typeface) obj2;
            } else {
                C0072l0 c0072l0 = new C0072l0(c1594sM2854b, c1791d.f6116j);
                c1791d.f6116j = c0072l0;
                Object obj3 = c0072l0.f309g;
                AbstractC1665j.m2983c(obj3, "null cannot be cast to non-null type android.graphics.Typeface");
                typeface = (Typeface) obj3;
            }
            c1793f.setTypeface(typeface);
        }
        if (c1781b2 != null) {
            C1781b c1781b3 = C1781b.f6089f;
            if (!c1781b2.equals(AbstractC1782c.f6092a.m107k())) {
                ArrayList arrayList4 = new ArrayList(AbstractC0974n.m2029K(c1781b2, 10));
                Iterator it = c1781b2.f6090d.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((C1780a) it.next()).f6088a);
                }
                Locale[] localeArr = (Locale[]) arrayList4.toArray(new Locale[0]);
                c1793f.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            }
        }
        if (str2 != null && !str2.equals("")) {
            c1793f.setFontFeatureSettings(str2);
        }
        if (c1966p != null && !c1966p.equals(C1966p.f6646c)) {
            c1793f.setTextScaleX(c1793f.getTextScaleX() * c1966p.f6647a);
            c1793f.setTextSkewX(c1793f.getTextSkewX() + c1966p.f6648b);
        }
        c1793f.m3263d(interfaceC1965o.mo3620b());
        c1793f.m3262c(interfaceC1965o.mo3621c(), 9205357640488583168L, interfaceC1965o.mo3619a());
        c1793f.m3265f(c1252e2.f4507n);
        c1793f.m3266g(c1252e2.f4506m);
        c1793f.m3264e(c1252e2.f4508o);
        if (!C2020p.m3712a(C2019o.m3709b(j10), 4294967296L) || C2019o.m3710c(j10) == 0.0f) {
            j5 = j10;
            if (C2020p.m3712a(C2019o.m3709b(j5), 8589934592L)) {
                c1793f.setLetterSpacing(C2019o.m3710c(j5));
            }
        } else {
            float textScaleX = c1793f.getTextScaleX() * c1793f.getTextSize();
            j5 = j10;
            float fMo276e0 = interfaceC2007c.mo276e0(j5);
            if (textScaleX != 0.0f) {
                c1793f.setLetterSpacing(fMo276e0 / textScaleX);
            }
        }
        long j11 = c1252e2.f4505l;
        C1951a c1951a = c1252e2.f4502i;
        boolean z8 = z7 && C2020p.m3712a(C2019o.m3709b(j5), 4294967296L) && C2019o.m3710c(j5) != 0.0f;
        long j12 = C2762u.f8762g;
        boolean z9 = (C2762u.m4921c(j11, j12) || C2762u.m4921c(j11, C2762u.f8761f)) ? false : true;
        boolean z10 = (c1951a == null || Float.compare(c1951a.f6619a, 0.0f) == 0) ? false : true;
        C1252E c1252e3 = (z8 || z9 || z10) ? new C1252E(0L, 0L, (C1587l) null, (C1585j) null, (C1586k) null, (AbstractC1592q) null, (String) null, z8 ? j5 : C2019o.f6747c, z10 ? c1951a : null, (C1966p) null, (C1781b) null, z9 ? j11 : j12, (C1962l) null, (C2737L) null, 63103) : null;
        if (c1252e3 != null) {
            int size5 = this.f6109c.size() + 1;
            arrayList = new ArrayList(size5);
            int i20 = 0;
            while (i20 < size5) {
                arrayList.add(i20 == 0 ? new C1267e(0, this.f6107a.length(), c1252e3) : (C1267e) this.f6109c.get(i20 - 1));
                i20++;
            }
        } else {
            arrayList = this.f6109c;
        }
        ?? r13 = this.f6107a;
        float textSize = this.f6113g.getTextSize();
        C1260M c1260m2 = this.f6108b;
        List list4 = this.f6110d;
        InterfaceC2007c interfaceC2007c3 = this.f6112f;
        C1788a c1788a = AbstractC1789b.f6104a;
        if (arrayList.isEmpty() && list4.isEmpty() && AbstractC1665j.m2981a(c1260m2.f4541b.f4608d, C1967q.f6649c)) {
            j6 = 0;
            r12 = r13;
            if ((c1260m2.f4541b.f4607c & 1095216660480L) != 0) {
            }
            this.f6114h = r12;
            this.f6115i = new C1405e(r12, this.f6113g, this.f6117k);
        }
        j6 = 0;
        Spannable spannableString = r13 instanceof Spannable ? (Spannable) r13 : new SpannableString(r13);
        C1252E c1252e4 = c1260m2.f4540a;
        C1282t c1282t2 = c1260m2.f4541b;
        if (AbstractC1665j.m2981a(c1252e4.f4506m, C1962l.f6641c)) {
            f2 = 0.0f;
            spannableString.setSpan(AbstractC1789b.f6104a, 0, r13.length(), 33);
        } else {
            f2 = 0.0f;
        }
        C1285w c1285w = c1260m2.f4542c;
        if (((c1285w == null || (c1284v = c1285w.f4618a) == null) ? false : c1284v.f4616a) && c1282t2.f4610f == null) {
            j7 = 1095216660480L;
            float fM1401z = AbstractC0797o.m1401z(c1282t2.f4607c, textSize, interfaceC2007c3);
            if (!Float.isNaN(fM1401z)) {
                spannableString.setSpan(new C1493g(fM1401z), 0, spannableString.length(), 33);
            }
        } else {
            j7 = 1095216660480L;
            C1959i c1959i = c1282t2.f4610f;
            c1959i = c1959i == null ? C1959i.f6632d : c1959i;
            float fM1401z2 = AbstractC0797o.m1401z(c1282t2.f4607c, textSize, interfaceC2007c3);
            if (!Float.isNaN(fM1401z2)) {
                if (spannableString.length() != 0) {
                    if (spannableString.length() == 0) {
                        throw new NoSuchElementException("Char sequence is empty.");
                    }
                    int length = spannableString.charAt(AbstractC1976d.m3632Z(spannableString)) == '\n' ? spannableString.length() + 1 : spannableString.length();
                    int i21 = length;
                    int i22 = c1959i.f6634b;
                    spannableString.setSpan(new C1494h(fM1401z2, i21, (i22 & 1) > 0, (i22 & 16) > 0, c1959i.f6633a, c1959i.f6635c), 0, spannableString.length(), 33);
                }
                this.f6114h = r12;
                this.f6115i = new C1405e(r12, this.f6113g, this.f6117k);
            }
        }
        C1967q c1967q2 = c1282t2.f4608d;
        if (c1967q2 != null) {
            long j13 = c1967q2.f6650a;
            long j14 = c1967q2.f6651b;
            if ((!C2019o.m3708a(j13, AbstractC1926h.m3579v(0)) || !C2019o.m3708a(j14, AbstractC1926h.m3579v(0))) && (j13 & j7) != j6 && (j14 & j7) != j6) {
                long jM3709b2 = C2019o.m3709b(j13);
                list3 = list4;
                if (C2020p.m3712a(jM3709b2, 4294967296L)) {
                    interfaceC2007c2 = interfaceC2007c3;
                    fM3710c = interfaceC2007c2.mo276e0(j13);
                } else {
                    interfaceC2007c2 = interfaceC2007c3;
                    fM3710c = C2020p.m3712a(jM3709b2, 8589934592L) ? C2019o.m3710c(j13) * textSize : f2;
                }
                long jM3709b3 = C2019o.m3709b(j14);
                spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fM3710c), (int) Math.ceil(C2020p.m3712a(jM3709b3, 4294967296L) ? interfaceC2007c2.mo276e0(j14) : C2020p.m3712a(jM3709b3, 8589934592L) ? C2019o.m3710c(j14) * textSize : f2)), 0, spannableString.length(), 33);
                arrayList2 = new ArrayList(arrayList.size());
                size = arrayList.size();
                for (i6 = 0; i6 < size; i6++) {
                    C1267e c1267e = (C1267e) arrayList.get(i6);
                    Object obj4 = c1267e.f4557a;
                    if (obj4 instanceof C1252E) {
                        C1252E c1252e5 = (C1252E) obj4;
                        if (((c1252e5.f4499f == null && c1252e5.f4497d == null && c1252e5.f4496c == null) ? false : true) || ((C1252E) obj4).f4498e != null) {
                            arrayList2.add(c1267e);
                        }
                    }
                }
                C1252E c1252e6 = c1260m2.f4540a;
                AbstractC1592q abstractC1592q2 = c1252e6.f4499f;
                C1252E c1252e7 = ((abstractC1592q2 == null || c1252e6.f4497d != null || c1252e6.f4496c != null) && c1252e6.f4498e == null) ? null : new C1252E(0L, 0L, c1252e6.f4496c, c1252e6.f4497d, c1252e6.f4498e, abstractC1592q2, (String) null, 0L, (C1951a) null, (C1966p) null, (C1781b) null, 0L, (C1962l) null, (C2737L) null, 65475);
                C0904F c0904f = new C0904F(3, spannableString, c1790c);
                if (arrayList2.size() <= 1) {
                    int size6 = arrayList2.size();
                    int i23 = size6 * 2;
                    int[] iArr = new int[i23];
                    int size7 = arrayList2.size();
                    for (int i24 = 0; i24 < size7; i24++) {
                        C1267e c1267e2 = (C1267e) arrayList2.get(i24);
                        iArr[i24] = c1267e2.f4558b;
                        iArr[i24 + size6] = c1267e2.f4559c;
                    }
                    if (i23 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i23 == 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    int i25 = iArr[0];
                    int i26 = 0;
                    while (i26 < i23) {
                        int i27 = iArr[i26];
                        if (i27 == i25) {
                            arrayList3 = arrayList2;
                            c1252e = c1252e7;
                            i7 = i23;
                        } else {
                            int size8 = arrayList2.size();
                            C1252E c1252eM2322c = c1252e7;
                            int i28 = 0;
                            while (i28 < size8) {
                                ArrayList arrayList5 = arrayList2;
                                C1267e c1267e3 = (C1267e) arrayList2.get(i28);
                                C1252E c1252e8 = c1252e7;
                                int i29 = c1267e3.f4558b;
                                int i30 = i23;
                                int i31 = c1267e3.f4559c;
                                if (i29 != i31 && AbstractC1270h.m2357b(i25, i27, i29, i31)) {
                                    C1252E c1252e9 = (C1252E) c1267e3.f4557a;
                                    c1252eM2322c = c1252eM2322c != null ? c1252eM2322c.m2322c(c1252e9) : c1252e9;
                                }
                                i28++;
                                arrayList2 = arrayList5;
                                c1252e7 = c1252e8;
                                i23 = i30;
                            }
                            arrayList3 = arrayList2;
                            c1252e = c1252e7;
                            i7 = i23;
                            if (c1252eM2322c != null) {
                                c0904f.mo5f(c1252eM2322c, Integer.valueOf(i25), Integer.valueOf(i27));
                            }
                            i25 = i27;
                        }
                        i26++;
                        arrayList2 = arrayList3;
                        c1252e7 = c1252e;
                        i23 = i7;
                    }
                } else if (!arrayList2.isEmpty()) {
                    C1252E c1252e10 = (C1252E) ((C1267e) arrayList2.get(0)).f4557a;
                    c0904f.mo5f(c1252e7 != null ? c1252e7.m2322c(c1252e10) : c1252e10, Integer.valueOf(((C1267e) arrayList2.get(0)).f4558b), Integer.valueOf(((C1267e) arrayList2.get(0)).f4559c));
                }
                size2 = arrayList.size();
                i8 = 0;
                z5 = false;
                while (i8 < size2) {
                    C1267e c1267e4 = (C1267e) arrayList.get(i8);
                    Object obj5 = c1267e4.f4557a;
                    if (obj5 instanceof C1252E) {
                        int i32 = c1267e4.f4558b;
                        int i33 = c1267e4.f4559c;
                        if (i32 < 0 || i32 >= spannableString.length() || i33 <= i32 || i33 > spannableString.length()) {
                            i10 = size2;
                            i11 = i8;
                            z6 = z5;
                        } else {
                            C1252E c1252e11 = (C1252E) obj5;
                            long j15 = c1252e11.f4501h;
                            C1951a c1951a2 = c1252e11.f4502i;
                            InterfaceC1965o interfaceC1965o2 = c1252e11.f4494a;
                            if (c1951a2 != null) {
                                i10 = size2;
                                spannableString.setSpan(new C1487a(c1951a2.f6619a, 0), i32, i33, 33);
                            } else {
                                i10 = size2;
                            }
                            int i34 = i8;
                            AbstractC0797o.m1373A(spannableString, interfaceC1965o2.mo3620b(), i32, i33);
                            AbstractC2758q abstractC2758qMo3621c = interfaceC1965o2.mo3621c();
                            float fMo3619a = interfaceC1965o2.mo3619a();
                            if (abstractC2758qMo3621c != null) {
                                if (abstractC2758qMo3621c instanceof C2740O) {
                                    AbstractC0797o.m1373A(spannableString, ((C2740O) abstractC2758qMo3621c).f8719a, i32, i33);
                                } else {
                                    spannableString.setSpan(new C1889b((AbstractC2736K) abstractC2758qMo3621c, fMo3619a), i32, i33, 33);
                                }
                            }
                            C1962l c1962l = c1252e11.f4506m;
                            if (c1962l != null) {
                                int i35 = c1962l.f6643a;
                                C1497k c1497k = new C1497k((i35 | 1) == i35, (i35 | 2) == i35);
                                i12 = 33;
                                spannableString.setSpan(c1497k, i32, i33, 33);
                            } else {
                                i12 = 33;
                            }
                            InterfaceC2007c interfaceC2007c4 = interfaceC2007c2;
                            AbstractC0797o.m1374B(spannableString, c1252e11.f4495b, interfaceC2007c4, i32, i33);
                            String str3 = c1252e11.f4500g;
                            if (str3 != null) {
                                spannableString.setSpan(new C1488b(0, str3), i32, i33, i12);
                            }
                            C1966p c1966p2 = c1252e11.f4503j;
                            if (c1966p2 != null) {
                                spannableString.setSpan(new ScaleXSpan(c1966p2.f6647a), i32, i33, i12);
                                spannableString.setSpan(new C1487a(c1966p2.f6648b, 1), i32, i33, i12);
                            }
                            AbstractC0797o.m1375C(spannableString, c1252e11.f4504k, i32, i33);
                            interfaceC2007c2 = interfaceC2007c4;
                            long j16 = c1252e11.f4505l;
                            if (j16 != 16) {
                                spannableString.setSpan(new BackgroundColorSpan(AbstractC2767z.m4952w(j16)), i32, i33, i12);
                            }
                            C2737L c2737l = c1252e11.f4507n;
                            if (c2737l != null) {
                                long j17 = c2737l.f8705b;
                                z6 = z5;
                                i11 = i34;
                                int iM4952w = AbstractC2767z.m4952w(c2737l.f8704a);
                                j8 = j15;
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (j17 >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j17));
                                float f5 = c2737l.f8706c;
                                C1496j c1496j = new C1496j(fIntBitsToFloat, fIntBitsToFloat2, f5 == f2 ? Float.MIN_VALUE : f5, iM4952w);
                                i13 = 33;
                                spannableString.setSpan(c1496j, i32, i33, 33);
                            } else {
                                i13 = i12;
                                z6 = z5;
                                i11 = i34;
                                j8 = j15;
                            }
                            AbstractC2902c abstractC2902c = c1252e11.f4508o;
                            if (abstractC2902c != null) {
                                spannableString.setSpan(new C1888a(abstractC2902c), i32, i33, i13);
                            }
                            z5 = (C2020p.m3712a(C2019o.m3709b(j8), 4294967296L) || C2020p.m3712a(C2019o.m3709b(j8), 8589934592L)) ? true : z5;
                        }
                        z5 = z6;
                    }
                    i8 = i11 + 1;
                    size2 = i10;
                }
                if (z5) {
                    int size9 = arrayList.size();
                    for (int i36 = 0; i36 < size9; i36++) {
                        C1267e c1267e5 = (C1267e) arrayList.get(i36);
                        InterfaceC1264b interfaceC1264b = (InterfaceC1264b) c1267e5.f4557a;
                        if (interfaceC1264b instanceof C1252E) {
                            int i37 = c1267e5.f4558b;
                            int i38 = c1267e5.f4559c;
                            if (i37 >= 0 && i37 < spannableString.length() && i38 > i37 && i38 <= spannableString.length()) {
                                long j18 = ((C1252E) interfaceC1264b).f4501h;
                                long jM3709b4 = C2019o.m3709b(j18);
                                Object c1492f = C2020p.m3712a(jM3709b4, 4294967296L) ? new C1492f(interfaceC2007c2.mo276e0(j18)) : C2020p.m3712a(jM3709b4, 8589934592L) ? new C1491e(C2019o.m3710c(j18)) : null;
                                if (c1492f != null) {
                                    spannableString.setSpan(c1492f, i37, i38, 33);
                                }
                            }
                        }
                    }
                }
                c1967q = c1282t2.f4608d;
                if (c1967q != null) {
                    long j19 = c1967q.f6650a;
                    long jM3709b5 = C2019o.m3709b(j19);
                    if (C2020p.m3712a(jM3709b5, 4294967296L)) {
                        interfaceC2007c2.mo276e0(j19);
                    } else if (C2020p.m3712a(jM3709b5, 8589934592L)) {
                        C2019o.m3710c(j19);
                    }
                }
                size3 = arrayList.size();
                for (i9 = 0; i9 < size3; i9++) {
                    Object obj6 = ((C1267e) arrayList.get(i9)).f4557a;
                }
                if (list3.size() > 0) {
                    r12 = spannableString;
                    this.f6114h = r12;
                    this.f6115i = new C1405e(r12, this.f6113g, this.f6117k);
                }
                C1267e c1267e6 = (C1267e) list3.get(0);
                if (c1267e6.f4557a != null) {
                    throw new ClassCastException();
                }
                for (Object obj7 : spannableString.getSpans(c1267e6.f4558b, c1267e6.f4559c, AbstractC3447a.class)) {
                    if (obj7 != null) {
                        throw new ClassCastException();
                    }
                    spannableString.removeSpan(null);
                }
                throw null;
            }
            interfaceC2007c2 = interfaceC2007c3;
        } else {
            interfaceC2007c2 = interfaceC2007c3;
        }
        list3 = list4;
        arrayList2 = new ArrayList(arrayList.size());
        size = arrayList.size();
        while (i6 < size) {
        }
        C1252E c1252e62 = c1260m2.f4540a;
        AbstractC1592q abstractC1592q22 = c1252e62.f4499f;
        if (abstractC1592q22 == null) {
            if (abstractC1592q22 == null || c1252e62.f4497d != null || c1252e62.f4496c != null) {
                C0904F c0904f2 = new C0904F(3, spannableString, c1790c);
                if (arrayList2.size() <= 1) {
                }
                size2 = arrayList.size();
                i8 = 0;
                z5 = false;
                while (i8 < size2) {
                }
                if (z5) {
                }
                c1967q = c1282t2.f4608d;
                if (c1967q != null) {
                }
                size3 = arrayList.size();
                while (i9 < size3) {
                }
                if (list3.size() > 0) {
                }
            }
        }
        this.f6114h = r12;
        this.f6115i = new C1405e(r12, this.f6113g, this.f6117k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p092S0.InterfaceC1281s
    /* JADX INFO: renamed from: a */
    public final float mo424a() {
        float f2;
        C1405e c1405e = this.f6115i;
        float f5 = c1405e.f5032e;
        TextPaint textPaint = c1405e.f5029b;
        if (!Float.isNaN(f5)) {
            return c1405e.f5032e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = c1405e.f5028a;
        lineInstance.setText(new C1402b(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new C0549A(2));
        int i5 = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new C0882h(Integer.valueOf(i5), Integer.valueOf(next)));
            } else {
                C0882h c0882h = (C0882h) priorityQueue.peek();
                if (c0882h != null && ((Number) c0882h.f2770e).intValue() - ((Number) c0882h.f2769d).intValue() < next - i5) {
                    priorityQueue.poll();
                    priorityQueue.add(new C0882h(Integer.valueOf(i5), Integer.valueOf(next)));
                }
            }
            i5 = next;
        }
        if (priorityQueue.isEmpty()) {
            f2 = 0.0f;
        } else {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            C0882h c0882h2 = (C0882h) it.next();
            float desiredWidth = Layout.getDesiredWidth(c1405e.m2692b(), ((Number) c0882h2.f2769d).intValue(), ((Number) c0882h2.f2770e).intValue(), textPaint);
            while (it.hasNext()) {
                C0882h c0882h3 = (C0882h) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(c1405e.m2692b(), ((Number) c0882h3.f2769d).intValue(), ((Number) c0882h3.f2770e).intValue(), textPaint));
            }
            f2 = desiredWidth;
        }
        c1405e.f5032e = f2;
        return f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p092S0.InterfaceC1281s
    /* JADX INFO: renamed from: b */
    public final boolean mo425b() {
        C0072l0 c0072l0 = this.f6116j;
        if (c0072l0 != null ? c0072l0.m113s() : false) {
            return true;
        }
        return AbstractC1796i.m3267a(this.f6108b) && Boolean.FALSE.booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p092S0.InterfaceC1281s
    /* JADX INFO: renamed from: c */
    public final float mo426c() {
        return this.f6115i.m2693c();
    }
}
