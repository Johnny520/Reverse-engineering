package p000;

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
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: x9 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0878x9 implements tw1 {

    /* JADX INFO: renamed from: a */
    public final String f12900a;

    /* JADX INFO: renamed from: b */
    public final m13 f12901b;

    /* JADX INFO: renamed from: c */
    public final List f12902c;

    /* JADX INFO: renamed from: d */
    public final List f12903d;

    /* JADX INFO: renamed from: e */
    public final xl0 f12904e;

    /* JADX INFO: renamed from: f */
    public final e70 f12905f;

    /* JADX INFO: renamed from: g */
    public final C0613qb f12906g;

    /* JADX INFO: renamed from: h */
    public final CharSequence f12907h;

    /* JADX INFO: renamed from: i */
    public final g61 f12908i;

    /* JADX INFO: renamed from: j */
    public vu2 f12909j;

    /* JADX INFO: renamed from: k */
    public final int f12910k;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0815 A[LOOP:6: B:398:0x0813->B:399:0x0815, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0878x9(String str, m13 m13Var, List list, List list2, xl0 xl0Var, e70 e70Var) {
        Locale locale;
        int i;
        Object obj;
        Typeface typeface;
        long j;
        long j2;
        CharSequence charSequence;
        float f;
        long j3;
        int i2;
        n03 n03Var;
        List list3;
        C0839w9 c0839w9;
        ArrayList arrayList;
        int size;
        int i3;
        List list4;
        ArrayList arrayList2;
        lt2 lt2Var;
        int i4;
        List list5;
        int size2;
        int i5;
        boolean z;
        n03 n03Var2;
        int size3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        e70 e70Var2;
        int i11;
        long j4;
        int i12;
        k02 k02Var;
        this.f12900a = str;
        this.f12901b = m13Var;
        this.f12902c = list;
        this.f12903d = list2;
        this.f12904e = xl0Var;
        this.f12905f = e70Var;
        float fMo693b = e70Var.mo693b();
        C0613qb c0613qb = new C0613qb(1);
        ((TextPaint) c0613qb).density = fMo693b;
        c0613qb.f8864b = gz2.f3746b;
        c0613qb.f8865c = 3;
        c0613qb.f8866d = bq2.f985d;
        this.f12906g = c0613qb;
        qp0.m4254i(m13Var);
        vw1 vw1Var = m13Var.f6436b;
        int i13 = vw1Var.f12199b;
        lt2 lt2Var2 = m13Var.f6435a;
        kc1 kc1Var = lt2Var2.f6311k;
        int i14 = 0;
        if (i13 != 4) {
            if (i13 != 5) {
                if (i13 == 1) {
                    i = 0;
                } else if (i13 == 2) {
                    i = 1;
                } else {
                    if (i13 != 3 && i13 != 0) {
                        C0676s.m4653l("Invalid TextDirection.");
                        throw null;
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((kc1Var == null || (locale = ((jc1) kc1Var.f5454h.get(0)).f4962a) == null) ? Locale.getDefault() : locale);
                    i = (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) ? 2 : 3;
                }
            }
        }
        this.f12910k = i;
        C0839w9 c0839w92 = new C0839w9(i14, this);
        d13 d13Var = vw1Var.f12206i;
        d13Var = d13Var == null ? d13.f1812c : d13Var;
        c0613qb.setFlags(d13Var.f1815b ? c0613qb.getFlags() | 128 : c0613qb.getFlags() & (-129));
        int i15 = d13Var.f1814a;
        if (i15 == 1) {
            c0613qb.setFlags(c0613qb.getFlags() | 64);
            c0613qb.setHinting(0);
        } else if (i15 == 2) {
            c0613qb.getFlags();
            c0613qb.setHinting(1);
        } else if (i15 == 3) {
            c0613qb.getFlags();
            c0613qb.setHinting(0);
        } else {
            c0613qb.getFlags();
        }
        int size4 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size4) {
                obj = null;
                break;
            }
            obj = list.get(i16);
            if (((C0652rd) obj).f9514a instanceof lt2) {
                break;
            } else {
                i16++;
            }
        }
        boolean z3 = obj != null;
        long j5 = lt2Var2.f6302b;
        im0 im0Var = lt2Var2.f6303c;
        gm0 gm0Var = lt2Var2.f6304d;
        String str2 = lt2Var2.f6307g;
        kc1 kc1Var2 = lt2Var2.f6311k;
        l03 l03Var = lt2Var2.f6301a;
        m03 m03Var = lt2Var2.f6310j;
        long j6 = lt2Var2.f6308h;
        long jM3674b = p13.m3674b(j5);
        if (q13.m4041a(jM3674b, 4294967296L)) {
            c0613qb.setTextSize(e70Var.mo695h0(j5));
        } else if (q13.m4041a(jM3674b, 8589934592L)) {
            c0613qb.setTextSize(p13.m3675c(j5) * c0613qb.getTextSize());
        }
        mx2 mx2Var = lt2Var2.f6306f;
        if (mx2Var != null || gm0Var != null || im0Var != null) {
            im0Var = im0Var == null ? im0.f4680j : im0Var;
            int i17 = gm0Var != null ? gm0Var.f3581a : 0;
            hm0 hm0Var = lt2Var2.f6305e;
            int i18 = hm0Var != null ? hm0Var.f4076a : 65535;
            C0878x9 c0878x9 = (C0878x9) c0839w92.f12409i;
            m63 m63VarM6288b = ((yl0) c0878x9.f12904e).m6288b(mx2Var, im0Var, i17, i18);
            if (m63VarM6288b instanceof m63) {
                Object obj2 = m63VarM6288b.f6489h;
                obj2.getClass();
                typeface = (Typeface) obj2;
            } else {
                vu2 vu2Var = new vu2(m63VarM6288b, c0878x9.f12909j);
                c0878x9.f12909j = vu2Var;
                Object obj3 = vu2Var.f12180c;
                obj3.getClass();
                typeface = (Typeface) obj3;
            }
            c0613qb.setTypeface(typeface);
        }
        if (kc1Var2 != null) {
            kc1 kc1Var3 = kc1.f5453j;
            if (!kc1Var2.equals(d02.f1801a.m431r())) {
                ArrayList arrayList3 = new ArrayList(AbstractC0179eu.m1421B(kc1Var2, 10));
                Iterator it = kc1Var2.f5454h.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((jc1) it.next()).f4962a);
                }
                Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                c0613qb.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            }
        }
        if (str2 != null && !str2.equals("")) {
            c0613qb.setFontFeatureSettings(str2);
        }
        if (m03Var != null && !m03Var.equals(m03.f6426c)) {
            c0613qb.setTextScaleX(c0613qb.getTextScaleX() * m03Var.f6427a);
            c0613qb.setTextSkewX(c0613qb.getTextSkewX() + m03Var.f6428b);
        }
        c0613qb.m4109d(l03Var.mo864b());
        c0613qb.m4108c(l03Var.mo865k(), 9205357640488583168L, l03Var.mo863a());
        c0613qb.m4111f(lt2Var2.f6314n);
        c0613qb.m4112g(lt2Var2.f6313m);
        c0613qb.m4110e(lt2Var2.f6315o);
        if (!q13.m4041a(p13.m3674b(j6), 4294967296L) || p13.m3675c(j6) == 0.0f) {
            j = j6;
            if (q13.m4041a(p13.m3674b(j), 8589934592L)) {
                c0613qb.setLetterSpacing(p13.m3675c(j));
            }
        } else {
            float textScaleX = c0613qb.getTextScaleX() * c0613qb.getTextSize();
            j = j6;
            float fMo695h0 = e70Var.mo695h0(j);
            if (textScaleX != 0.0f) {
                c0613qb.setLetterSpacing(fMo695h0 / textScaleX);
            }
        }
        long j7 = lt2Var2.f6312l;
        C0888xj c0888xj = lt2Var2.f6309i;
        boolean z4 = z3 && q13.m4041a(p13.m3674b(j), 4294967296L) && p13.m3675c(j) != 0.0f;
        long j8 = C0363ju.f5217g;
        boolean z5 = (C0363ju.m2566c(j7, j8) || C0363ju.m2566c(j7, C0363ju.f5216f)) ? false : true;
        boolean z6 = (c0888xj == null || Float.compare(c0888xj.f13048a, 0.0f) == 0) ? false : true;
        lt2 lt2Var3 = (z4 || z5 || z6) ? new lt2(0L, 0L, (im0) null, (gm0) null, (hm0) null, (mx2) null, (String) null, z4 ? j : p13.f7928c, z6 ? c0888xj : null, (m03) null, (kc1) null, z5 ? j7 : j8, (gz2) null, (bq2) null, 63103) : null;
        List list6 = this.f12902c;
        if (lt2Var3 != null) {
            int size5 = list6.size() + 1;
            ArrayList arrayList4 = new ArrayList(size5);
            int i19 = 0;
            while (i19 < size5) {
                arrayList4.add(i19 == 0 ? new C0652rd(0, this.f12900a.length(), lt2Var3) : (C0652rd) this.f12902c.get(i19 - 1));
                i19++;
            }
            list6 = arrayList4;
        }
        String str3 = this.f12900a;
        float textSize = this.f12906g.getTextSize();
        m13 m13Var2 = this.f12901b;
        List list7 = this.f12903d;
        e70 e70Var3 = this.f12905f;
        C0765u9 c0765u9 = AbstractC0802v9.f11845a;
        if (list6.isEmpty() && list7.isEmpty() && t11.m5086l(m13Var2.f6436b.f12201d, n03.f6960c)) {
            j2 = 0;
            charSequence = str3;
            if ((m13Var2.f6436b.f12200c & 1095216660480L) != 0) {
            }
            this.f12907h = charSequence;
            this.f12908i = new g61(charSequence, this.f12906g, this.f12910k);
        }
        j2 = 0;
        Spannable spannableString = str3 instanceof Spannable ? (Spannable) str3 : new SpannableString(str3);
        lt2 lt2Var4 = m13Var2.f6435a;
        vw1 vw1Var2 = m13Var2.f6436b;
        if (t11.m5086l(lt2Var4.f6313m, gz2.f3747c)) {
            f = 0.0f;
            spannableString.setSpan(AbstractC0802v9.f11845a, 0, str3.length(), 33);
        } else {
            f = 0.0f;
        }
        w02 w02Var = m13Var2.f6437c;
        if (!((w02Var == null || (k02Var = w02Var.f12240a) == null) ? false : k02Var.f5294a) || vw1Var2.f12203f != null) {
            j3 = 1095216660480L;
            ya1 ya1Var = vw1Var2.f12203f;
            ya1Var = ya1Var == null ? ya1.f13380d : ya1Var;
            float fM1440U = AbstractC0179eu.m1440U(vw1Var2.f12200c, textSize, e70Var3);
            if (!Float.isNaN(fM1440U)) {
                if (spannableString.length() != 0) {
                    if (spannableString.length() == 0) {
                        um2.m5519i("Char sequence is empty.");
                        throw null;
                    }
                    int length = spannableString.charAt(spannableString.length() + (-1)) == '\n' ? spannableString.length() + 1 : spannableString.length();
                    int i20 = length;
                    int i21 = ya1Var.f13382b;
                    i2 = 0;
                    spannableString.setSpan(new za1(fM1440U, i20, (i21 & 1) > 0, (i21 & 16) > 0, ya1Var.f13381a, ya1Var.f13383c), 0, spannableString.length(), 33);
                }
                this.f12907h = charSequence;
                this.f12908i = new g61(charSequence, this.f12906g, this.f12910k);
            }
            n03Var = vw1Var2.f12201d;
            if (n03Var == null) {
                long j9 = n03Var.f6961a;
                int i22 = i2;
                long j10 = n03Var.f6962b;
                list3 = list7;
                if ((!p13.m3673a(j9, rg3.m4450D(i22)) || !p13.m3673a(j10, rg3.m4450D(i22))) && (j9 & j3) != j2 && (j10 & j3) != j2) {
                    long jM3674b2 = p13.m3674b(j9);
                    c0839w9 = c0839w92;
                    float fMo695h02 = q13.m4041a(jM3674b2, 4294967296L) ? e70Var3.mo695h0(j9) : q13.m4041a(jM3674b2, 8589934592L) ? p13.m3675c(j9) * textSize : f;
                    long jM3674b3 = p13.m3674b(j10);
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fMo695h02), (int) Math.ceil(q13.m4041a(jM3674b3, 4294967296L) ? e70Var3.mo695h0(j10) : q13.m4041a(jM3674b3, 8589934592L) ? textSize * p13.m3675c(j10) : f)), 0, spannableString.length(), 33);
                }
                arrayList = new ArrayList(list6.size());
                size = list6.size();
                for (i3 = 0; i3 < size; i3++) {
                    C0652rd c0652rd = (C0652rd) list6.get(i3);
                    Object obj4 = c0652rd.f9514a;
                    if (obj4 instanceof lt2) {
                        lt2 lt2Var5 = (lt2) obj4;
                        if (((lt2Var5.f6306f == null && lt2Var5.f6304d == null && lt2Var5.f6303c == null) ? false : true) || ((lt2) obj4).f6305e != null) {
                            arrayList.add(c0652rd);
                        }
                    }
                }
                lt2 lt2Var6 = m13Var2.f6435a;
                mx2 mx2Var2 = lt2Var6.f6306f;
                lt2 lt2Var7 = ((mx2Var2 != null || lt2Var6.f6304d != null || lt2Var6.f6303c != null) && lt2Var6.f6305e == null) ? null : new lt2(0L, 0L, lt2Var6.f6303c, lt2Var6.f6304d, lt2Var6.f6305e, mx2Var2, (String) null, 0L, (C0888xj) null, (m03) null, (kc1) null, 0L, (gz2) null, (bq2) null, 65475);
                C0866x c0866x = new C0866x(12, spannableString, c0839w9);
                if (arrayList.size() <= 1) {
                    int size6 = arrayList.size();
                    int i23 = size6 * 2;
                    int[] iArr = new int[i23];
                    int size7 = arrayList.size();
                    for (int i24 = 0; i24 < size7; i24++) {
                        C0652rd c0652rd2 = (C0652rd) arrayList.get(i24);
                        iArr[i24] = c0652rd2.f9515b;
                        iArr[i24 + size6] = c0652rd2.f9516c;
                    }
                    if (i23 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i23 == 0) {
                        um2.m5519i("Array is empty.");
                        throw null;
                    }
                    int i25 = iArr[0];
                    int i26 = 0;
                    while (i26 < i23) {
                        int i27 = iArr[i26];
                        if (i27 == i25) {
                            list4 = list3;
                            arrayList2 = arrayList;
                            lt2Var = lt2Var7;
                            i4 = i26;
                        } else {
                            int size8 = arrayList.size();
                            list4 = list3;
                            lt2 lt2VarM2973c = lt2Var7;
                            int i28 = 0;
                            while (i28 < size8) {
                                ArrayList arrayList5 = arrayList;
                                C0652rd c0652rd3 = (C0652rd) arrayList.get(i28);
                                lt2 lt2Var8 = lt2Var7;
                                int i29 = c0652rd3.f9515b;
                                int i30 = i26;
                                int i31 = c0652rd3.f9516c;
                                if (i29 != i31 && AbstractC0730td.m5163b(i25, i27, i29, i31)) {
                                    lt2 lt2Var9 = (lt2) c0652rd3.f9514a;
                                    lt2VarM2973c = lt2VarM2973c == null ? lt2Var9 : lt2VarM2973c.m2973c(lt2Var9);
                                }
                                i28++;
                                lt2Var7 = lt2Var8;
                                arrayList = arrayList5;
                                i26 = i30;
                            }
                            arrayList2 = arrayList;
                            lt2Var = lt2Var7;
                            i4 = i26;
                            if (lt2VarM2973c != null) {
                                c0866x.mo489e(lt2VarM2973c, Integer.valueOf(i25), Integer.valueOf(i27));
                            }
                            i25 = i27;
                        }
                        i26 = i4 + 1;
                        list3 = list4;
                        lt2Var7 = lt2Var;
                        arrayList = arrayList2;
                    }
                } else if (!arrayList.isEmpty()) {
                    lt2 lt2Var10 = (lt2) ((C0652rd) arrayList.get(0)).f9514a;
                    c0866x.mo489e(lt2Var7 != null ? lt2Var7.m2973c(lt2Var10) : lt2Var10, Integer.valueOf(((C0652rd) arrayList.get(0)).f9515b), Integer.valueOf(((C0652rd) arrayList.get(0)).f9516c));
                }
                list5 = list3;
                i5 = 0;
                z = false;
                for (size2 = list6.size(); i5 < size2; size2 = i9) {
                    C0652rd c0652rd4 = (C0652rd) list6.get(i5);
                    Object obj5 = c0652rd4.f9514a;
                    if (obj5 instanceof lt2) {
                        int i32 = c0652rd4.f9515b;
                        int i33 = c0652rd4.f9516c;
                        if (i32 < 0 || i32 >= spannableString.length() || i33 <= i32 || i33 > spannableString.length()) {
                            i9 = size2;
                            i10 = i5;
                            z2 = z;
                            e70Var2 = e70Var3;
                        } else {
                            lt2 lt2Var11 = (lt2) obj5;
                            long j11 = lt2Var11.f6308h;
                            C0888xj c0888xj2 = lt2Var11.f6309i;
                            l03 l03Var2 = lt2Var11.f6301a;
                            if (c0888xj2 != null) {
                                i9 = size2;
                                spannableString.setSpan(new C0925yj(c0888xj2.f13048a, 0), i32, i33, 33);
                            } else {
                                i9 = size2;
                            }
                            AbstractC0179eu.m1442W(spannableString, l03Var2.mo864b(), i32, i33);
                            AbstractC0024an abstractC0024anMo865k = l03Var2.mo865k();
                            float fMo863a = l03Var2.mo863a();
                            if (abstractC0024anMo865k != null) {
                                if (abstractC0024anMo865k instanceof ft2) {
                                    AbstractC0179eu.m1442W(spannableString, ((ft2) abstractC0024anMo865k).f3140a, i32, i33);
                                } else {
                                    spannableString.setSpan(new aq2((zp2) abstractC0024anMo865k, fMo863a), i32, i33, 33);
                                }
                            }
                            gz2 gz2Var = lt2Var11.f6313m;
                            if (gz2Var != null) {
                                int i34 = gz2Var.f3749a;
                                i11 = 33;
                                spannableString.setSpan(new hz2((i34 | 1) == i34, (i34 | 2) == i34), i32, i33, 33);
                            } else {
                                i11 = 33;
                            }
                            AbstractC0179eu.m1443X(spannableString, lt2Var11.f6302b, e70Var3, i32, i33);
                            String str4 = lt2Var11.f6307g;
                            if (str4 != null) {
                                spannableString.setSpan(new am0(0, str4), i32, i33, i11);
                            }
                            m03 m03Var2 = lt2Var11.f6310j;
                            if (m03Var2 != null) {
                                spannableString.setSpan(new ScaleXSpan(m03Var2.f6427a), i32, i33, i11);
                                spannableString.setSpan(new C0925yj(m03Var2.f6428b, 1), i32, i33, i11);
                            }
                            AbstractC0179eu.m1444Y(spannableString, lt2Var11.f6311k, i32, i33);
                            e70Var2 = e70Var3;
                            long j12 = lt2Var11.f6312l;
                            if (j12 != 16) {
                                spannableString.setSpan(new BackgroundColorSpan(sp0.m4947j0(j12)), i32, i33, i11);
                            }
                            bq2 bq2Var = lt2Var11.f6314n;
                            if (bq2Var != null) {
                                long j13 = bq2Var.f987b;
                                i10 = i5;
                                z2 = z;
                                int iM4947j0 = sp0.m4947j0(bq2Var.f986a);
                                j4 = j11;
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j13));
                                float f2 = bq2Var.f988c;
                                dq2 dq2Var = new dq2(iM4947j0, fIntBitsToFloat, fIntBitsToFloat2, f2 == f ? Float.MIN_VALUE : f2);
                                i12 = 33;
                                spannableString.setSpan(dq2Var, i32, i33, 33);
                            } else {
                                i10 = i5;
                                z2 = z;
                                j4 = j11;
                                i12 = i11;
                            }
                            op0 op0Var = lt2Var11.f6315o;
                            if (op0Var != null) {
                                spannableString.setSpan(new oc0(op0Var), i32, i33, i12);
                            }
                            z = (q13.m4041a(p13.m3674b(j4), 4294967296L) || q13.m4041a(p13.m3674b(j4), 8589934592L)) ? true : z;
                        }
                        z = z2;
                    }
                    i5 = i10 + 1;
                    e70Var3 = e70Var2;
                }
                e70 e70Var4 = e70Var3;
                if (z) {
                    int size9 = list6.size();
                    int i35 = 0;
                    while (i35 < size9) {
                        C0652rd c0652rd5 = (C0652rd) list6.get(i35);
                        InterfaceC0539od interfaceC0539od = (InterfaceC0539od) c0652rd5.f9514a;
                        if (interfaceC0539od instanceof lt2) {
                            int i36 = c0652rd5.f9515b;
                            int i37 = c0652rd5.f9516c;
                            if (i36 < 0 || i36 >= spannableString.length() || i37 <= i36 || i37 > spannableString.length()) {
                                i7 = size9;
                                i8 = i35;
                            } else {
                                long j14 = ((lt2) interfaceC0539od).f6308h;
                                long jM3674b4 = p13.m3674b(j14);
                                i7 = size9;
                                i8 = i35;
                                Object w91Var = q13.m4041a(jM3674b4, 4294967296L) ? new w91(e70Var4.mo695h0(j14)) : q13.m4041a(jM3674b4, 8589934592L) ? new v91(p13.m3675c(j14)) : null;
                                if (w91Var != null) {
                                    spannableString.setSpan(w91Var, i36, i37, 33);
                                }
                            }
                        }
                        i35 = i8 + 1;
                        size9 = i7;
                    }
                }
                n03Var2 = vw1Var2.f12201d;
                if (n03Var2 != null) {
                    long j15 = n03Var2.f6961a;
                    long jM3674b5 = p13.m3674b(j15);
                    if (q13.m4041a(jM3674b5, 4294967296L)) {
                        e70Var4.mo695h0(j15);
                    } else if (q13.m4041a(jM3674b5, 8589934592L)) {
                        p13.m3675c(j15);
                    }
                }
                size3 = list6.size();
                for (i6 = 0; i6 < size3; i6++) {
                    Object obj6 = ((C0652rd) list6.get(i6)).f9514a;
                }
                if (list5.size() > 0) {
                    charSequence = spannableString;
                    this.f12907h = charSequence;
                    this.f12908i = new g61(charSequence, this.f12906g, this.f12910k);
                }
                C0652rd c0652rd6 = (C0652rd) list5.get(0);
                if (c0652rd6.f9514a != null) {
                    c80.m664g();
                    throw null;
                }
                for (Object obj7 : spannableString.getSpans(c0652rd6.f9515b, c0652rd6.f9516c, vd0.class)) {
                    if (obj7 != null) {
                        c80.m664g();
                        throw null;
                    }
                    spannableString.removeSpan(null);
                }
                throw null;
            }
            list3 = list7;
            c0839w9 = c0839w92;
            arrayList = new ArrayList(list6.size());
            size = list6.size();
            while (i3 < size) {
            }
            lt2 lt2Var62 = m13Var2.f6435a;
            mx2 mx2Var22 = lt2Var62.f6306f;
            if (mx2Var22 != null) {
                if (mx2Var22 != null || lt2Var62.f6304d != null || lt2Var62.f6303c != null) {
                    C0866x c0866x2 = new C0866x(12, spannableString, c0839w9);
                    if (arrayList.size() <= 1) {
                    }
                    list5 = list3;
                    i5 = 0;
                    z = false;
                    while (i5 < size2) {
                    }
                    e70 e70Var42 = e70Var3;
                    if (z) {
                    }
                    n03Var2 = vw1Var2.f12201d;
                    if (n03Var2 != null) {
                    }
                    size3 = list6.size();
                    while (i6 < size3) {
                    }
                    if (list5.size() > 0) {
                    }
                }
            }
            this.f12907h = charSequence;
            this.f12908i = new g61(charSequence, this.f12906g, this.f12910k);
        }
        j3 = 1095216660480L;
        float fM1440U2 = AbstractC0179eu.m1440U(vw1Var2.f12200c, textSize, e70Var3);
        if (!Float.isNaN(fM1440U2)) {
            spannableString.setSpan(new ua1(fM1440U2), 0, spannableString.length(), 33);
        }
        i2 = 0;
        n03Var = vw1Var2.f12201d;
        if (n03Var == null) {
        }
        c0839w9 = c0839w92;
        arrayList = new ArrayList(list6.size());
        size = list6.size();
        while (i3 < size) {
        }
        lt2 lt2Var622 = m13Var2.f6435a;
        mx2 mx2Var222 = lt2Var622.f6306f;
        this.f12907h = charSequence;
        this.f12908i = new g61(charSequence, this.f12906g, this.f12910k);
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: a */
    public final float mo826a() {
        g61 g61Var = this.f12908i;
        float f = g61Var.f3325e;
        TextPaint textPaint = g61Var.f3322b;
        if (!Float.isNaN(f)) {
            return g61Var.f3325e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = g61Var.f3321a;
        lineInstance.setText(new C0782uq(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, gf1.f3486c);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new c11(i, next, 1));
            } else {
                c11 c11Var = (c11) priorityQueue.peek();
                if (c11Var != null && c11Var.f26i - c11Var.f25h < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new c11(i, next, 1));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                um2.m5513b();
                return 0.0f;
            }
            c11 c11Var2 = (c11) it.next();
            desiredWidth = Layout.getDesiredWidth(g61Var.m1808b(), c11Var2.f25h, c11Var2.f26i, textPaint);
            while (it.hasNext()) {
                c11 c11Var3 = (c11) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(g61Var.m1808b(), c11Var3.f25h, c11Var3.f26i, textPaint));
            }
        }
        g61Var.f3325e = desiredWidth;
        return desiredWidth;
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: b */
    public final boolean mo827b() {
        vu2 vu2Var = this.f12909j;
        if (vu2Var != null ? vu2Var.m5800a() : false) {
            return true;
        }
        if (qp0.m4254i(this.f12901b)) {
            int i = sp0.f10265f;
            if (Boolean.FALSE.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: c */
    public final float mo828c() {
        return this.f12908i.m1809c();
    }
}
