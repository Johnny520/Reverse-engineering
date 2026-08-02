package defpackage;

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

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class x9 implements tw1 {
    public final String a;
    public final m13 b;
    public final List c;
    public final List d;
    public final xl0 e;
    public final e70 f;
    public final qb g;
    public final CharSequence h;
    public final g61 i;
    public vu2 j;
    public final int k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: java.lang.String */
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
    public x9(String str, m13 m13Var, List list, List list2, xl0 xl0Var, e70 e70Var) {
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
        w9 w9Var;
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
        this.a = str;
        this.b = m13Var;
        this.c = list;
        this.d = list2;
        this.e = xl0Var;
        this.f = e70Var;
        float fB = e70Var.b();
        qb qbVar = new qb(1);
        ((TextPaint) qbVar).density = fB;
        qbVar.b = gz2.b;
        qbVar.c = 3;
        qbVar.d = bq2.d;
        this.g = qbVar;
        qp0.i(m13Var);
        vw1 vw1Var = m13Var.b;
        int i13 = vw1Var.b;
        lt2 lt2Var2 = m13Var.a;
        kc1 kc1Var = lt2Var2.k;
        int i14 = 0;
        if (i13 != 4) {
            if (i13 != 5) {
                if (i13 == 1) {
                    i = 0;
                } else if (i13 == 2) {
                    i = 1;
                } else {
                    if (i13 != 3 && i13 != 0) {
                        s.l("Invalid TextDirection.");
                        throw null;
                    }
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((kc1Var == null || (locale = ((jc1) kc1Var.h.get(0)).a) == null) ? Locale.getDefault() : locale);
                    i = (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) ? 2 : 3;
                }
            }
        }
        this.k = i;
        w9 w9Var2 = new w9(i14, this);
        d13 d13Var = vw1Var.i;
        d13Var = d13Var == null ? d13.c : d13Var;
        qbVar.setFlags(d13Var.b ? qbVar.getFlags() | 128 : qbVar.getFlags() & (-129));
        int i15 = d13Var.a;
        if (i15 == 1) {
            qbVar.setFlags(qbVar.getFlags() | 64);
            qbVar.setHinting(0);
        } else if (i15 == 2) {
            qbVar.getFlags();
            qbVar.setHinting(1);
        } else if (i15 == 3) {
            qbVar.getFlags();
            qbVar.setHinting(0);
        } else {
            qbVar.getFlags();
        }
        int size4 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size4) {
                obj = null;
                break;
            }
            obj = list.get(i16);
            if (((rd) obj).a instanceof lt2) {
                break;
            } else {
                i16++;
            }
        }
        boolean z3 = obj != null;
        long j5 = lt2Var2.b;
        im0 im0Var = lt2Var2.c;
        gm0 gm0Var = lt2Var2.d;
        String str2 = lt2Var2.g;
        kc1 kc1Var2 = lt2Var2.k;
        l03 l03Var = lt2Var2.a;
        m03 m03Var = lt2Var2.j;
        long j6 = lt2Var2.h;
        long jB = p13.b(j5);
        if (q13.a(jB, 4294967296L)) {
            qbVar.setTextSize(e70Var.h0(j5));
        } else if (q13.a(jB, 8589934592L)) {
            qbVar.setTextSize(p13.c(j5) * qbVar.getTextSize());
        }
        mx2 mx2Var = lt2Var2.f;
        if (mx2Var != null || gm0Var != null || im0Var != null) {
            im0Var = im0Var == null ? im0.j : im0Var;
            int i17 = gm0Var != null ? gm0Var.a : 0;
            hm0 hm0Var = lt2Var2.e;
            int i18 = hm0Var != null ? hm0Var.a : 65535;
            x9 x9Var = (x9) w9Var2.i;
            m63 m63VarB = ((yl0) x9Var.e).b(mx2Var, im0Var, i17, i18);
            if (m63VarB instanceof m63) {
                Object obj2 = m63VarB.h;
                obj2.getClass();
                typeface = (Typeface) obj2;
            } else {
                vu2 vu2Var = new vu2(m63VarB, x9Var.j);
                x9Var.j = vu2Var;
                Object obj3 = vu2Var.c;
                obj3.getClass();
                typeface = (Typeface) obj3;
            }
            qbVar.setTypeface(typeface);
        }
        if (kc1Var2 != null) {
            kc1 kc1Var3 = kc1.j;
            if (!kc1Var2.equals(d02.a.r())) {
                ArrayList arrayList3 = new ArrayList(eu.B(kc1Var2, 10));
                Iterator it = kc1Var2.h.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((jc1) it.next()).a);
                }
                Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                qbVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            }
        }
        if (str2 != null && !str2.equals("")) {
            qbVar.setFontFeatureSettings(str2);
        }
        if (m03Var != null && !m03Var.equals(m03.c)) {
            qbVar.setTextScaleX(qbVar.getTextScaleX() * m03Var.a);
            qbVar.setTextSkewX(qbVar.getTextSkewX() + m03Var.b);
        }
        qbVar.d(l03Var.b());
        qbVar.c(l03Var.k(), 9205357640488583168L, l03Var.a());
        qbVar.f(lt2Var2.n);
        qbVar.g(lt2Var2.m);
        qbVar.e(lt2Var2.o);
        if (!q13.a(p13.b(j6), 4294967296L) || p13.c(j6) == 0.0f) {
            j = j6;
            if (q13.a(p13.b(j), 8589934592L)) {
                qbVar.setLetterSpacing(p13.c(j));
            }
        } else {
            float textScaleX = qbVar.getTextScaleX() * qbVar.getTextSize();
            j = j6;
            float fH0 = e70Var.h0(j);
            if (textScaleX != 0.0f) {
                qbVar.setLetterSpacing(fH0 / textScaleX);
            }
        }
        long j7 = lt2Var2.l;
        xj xjVar = lt2Var2.i;
        boolean z4 = z3 && q13.a(p13.b(j), 4294967296L) && p13.c(j) != 0.0f;
        long j8 = ju.g;
        boolean z5 = (ju.c(j7, j8) || ju.c(j7, ju.f)) ? false : true;
        boolean z6 = (xjVar == null || Float.compare(xjVar.a, 0.0f) == 0) ? false : true;
        lt2 lt2Var3 = (z4 || z5 || z6) ? new lt2(0L, 0L, (im0) null, (gm0) null, (hm0) null, (mx2) null, (String) null, z4 ? j : p13.c, z6 ? xjVar : null, (m03) null, (kc1) null, z5 ? j7 : j8, (gz2) null, (bq2) null, 63103) : null;
        List list6 = this.c;
        if (lt2Var3 != null) {
            int size5 = list6.size() + 1;
            ArrayList arrayList4 = new ArrayList(size5);
            int i19 = 0;
            while (i19 < size5) {
                arrayList4.add(i19 == 0 ? new rd(0, this.a.length(), lt2Var3) : (rd) this.c.get(i19 - 1));
                i19++;
            }
            list6 = arrayList4;
        }
        String str3 = this.a;
        float textSize = this.g.getTextSize();
        m13 m13Var2 = this.b;
        List list7 = this.d;
        e70 e70Var3 = this.f;
        u9 u9Var = v9.a;
        if (list6.isEmpty() && list7.isEmpty() && t11.l(m13Var2.b.d, n03.c)) {
            j2 = 0;
            charSequence = str3;
            if ((m13Var2.b.c & 1095216660480L) != 0) {
            }
            this.h = charSequence;
            this.i = new g61(charSequence, this.g, this.k);
        }
        j2 = 0;
        Spannable spannableString = str3 instanceof Spannable ? (Spannable) str3 : new SpannableString(str3);
        lt2 lt2Var4 = m13Var2.a;
        vw1 vw1Var2 = m13Var2.b;
        if (t11.l(lt2Var4.m, gz2.c)) {
            f = 0.0f;
            spannableString.setSpan(v9.a, 0, str3.length(), 33);
        } else {
            f = 0.0f;
        }
        w02 w02Var = m13Var2.c;
        if (!((w02Var == null || (k02Var = w02Var.a) == null) ? false : k02Var.a) || vw1Var2.f != null) {
            j3 = 1095216660480L;
            ya1 ya1Var = vw1Var2.f;
            ya1Var = ya1Var == null ? ya1.d : ya1Var;
            float fU = eu.U(vw1Var2.c, textSize, e70Var3);
            if (!Float.isNaN(fU)) {
                if (spannableString.length() != 0) {
                    if (spannableString.length() == 0) {
                        um2.i("Char sequence is empty.");
                        throw null;
                    }
                    int length = spannableString.charAt(spannableString.length() + (-1)) == '\n' ? spannableString.length() + 1 : spannableString.length();
                    int i20 = length;
                    int i21 = ya1Var.b;
                    i2 = 0;
                    spannableString.setSpan(new za1(fU, i20, (i21 & 1) > 0, (i21 & 16) > 0, ya1Var.a, ya1Var.c), 0, spannableString.length(), 33);
                }
                this.h = charSequence;
                this.i = new g61(charSequence, this.g, this.k);
            }
            n03Var = vw1Var2.d;
            if (n03Var == null) {
                long j9 = n03Var.a;
                int i22 = i2;
                long j10 = n03Var.b;
                list3 = list7;
                if ((!p13.a(j9, rg3.D(i22)) || !p13.a(j10, rg3.D(i22))) && (j9 & j3) != j2 && (j10 & j3) != j2) {
                    long jB2 = p13.b(j9);
                    w9Var = w9Var2;
                    float fH02 = q13.a(jB2, 4294967296L) ? e70Var3.h0(j9) : q13.a(jB2, 8589934592L) ? p13.c(j9) * textSize : f;
                    long jB3 = p13.b(j10);
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fH02), (int) Math.ceil(q13.a(jB3, 4294967296L) ? e70Var3.h0(j10) : q13.a(jB3, 8589934592L) ? textSize * p13.c(j10) : f)), 0, spannableString.length(), 33);
                }
                arrayList = new ArrayList(list6.size());
                size = list6.size();
                for (i3 = 0; i3 < size; i3++) {
                    rd rdVar = (rd) list6.get(i3);
                    Object obj4 = rdVar.a;
                    if (obj4 instanceof lt2) {
                        lt2 lt2Var5 = (lt2) obj4;
                        if (((lt2Var5.f == null && lt2Var5.d == null && lt2Var5.c == null) ? false : true) || ((lt2) obj4).e != null) {
                            arrayList.add(rdVar);
                        }
                    }
                }
                lt2 lt2Var6 = m13Var2.a;
                mx2 mx2Var2 = lt2Var6.f;
                lt2 lt2Var7 = ((mx2Var2 != null || lt2Var6.d != null || lt2Var6.c != null) && lt2Var6.e == null) ? null : new lt2(0L, 0L, lt2Var6.c, lt2Var6.d, lt2Var6.e, mx2Var2, (String) null, 0L, (xj) null, (m03) null, (kc1) null, 0L, (gz2) null, (bq2) null, 65475);
                x xVar = new x(12, spannableString, w9Var);
                if (arrayList.size() <= 1) {
                    int size6 = arrayList.size();
                    int i23 = size6 * 2;
                    int[] iArr = new int[i23];
                    int size7 = arrayList.size();
                    for (int i24 = 0; i24 < size7; i24++) {
                        rd rdVar2 = (rd) arrayList.get(i24);
                        iArr[i24] = rdVar2.b;
                        iArr[i24 + size6] = rdVar2.c;
                    }
                    if (i23 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i23 == 0) {
                        um2.i("Array is empty.");
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
                            lt2 lt2VarC = lt2Var7;
                            int i28 = 0;
                            while (i28 < size8) {
                                ArrayList arrayList5 = arrayList;
                                rd rdVar3 = (rd) arrayList.get(i28);
                                lt2 lt2Var8 = lt2Var7;
                                int i29 = rdVar3.b;
                                int i30 = i26;
                                int i31 = rdVar3.c;
                                if (i29 != i31 && td.b(i25, i27, i29, i31)) {
                                    lt2 lt2Var9 = (lt2) rdVar3.a;
                                    lt2VarC = lt2VarC == null ? lt2Var9 : lt2VarC.c(lt2Var9);
                                }
                                i28++;
                                lt2Var7 = lt2Var8;
                                arrayList = arrayList5;
                                i26 = i30;
                            }
                            arrayList2 = arrayList;
                            lt2Var = lt2Var7;
                            i4 = i26;
                            if (lt2VarC != null) {
                                xVar.e(lt2VarC, Integer.valueOf(i25), Integer.valueOf(i27));
                            }
                            i25 = i27;
                        }
                        i26 = i4 + 1;
                        list3 = list4;
                        lt2Var7 = lt2Var;
                        arrayList = arrayList2;
                    }
                } else if (!arrayList.isEmpty()) {
                    lt2 lt2Var10 = (lt2) ((rd) arrayList.get(0)).a;
                    xVar.e(lt2Var7 != null ? lt2Var7.c(lt2Var10) : lt2Var10, Integer.valueOf(((rd) arrayList.get(0)).b), Integer.valueOf(((rd) arrayList.get(0)).c));
                }
                list5 = list3;
                i5 = 0;
                z = false;
                for (size2 = list6.size(); i5 < size2; size2 = i9) {
                    rd rdVar4 = (rd) list6.get(i5);
                    Object obj5 = rdVar4.a;
                    if (obj5 instanceof lt2) {
                        int i32 = rdVar4.b;
                        int i33 = rdVar4.c;
                        if (i32 < 0 || i32 >= spannableString.length() || i33 <= i32 || i33 > spannableString.length()) {
                            i9 = size2;
                            i10 = i5;
                            z2 = z;
                            e70Var2 = e70Var3;
                        } else {
                            lt2 lt2Var11 = (lt2) obj5;
                            long j11 = lt2Var11.h;
                            xj xjVar2 = lt2Var11.i;
                            l03 l03Var2 = lt2Var11.a;
                            if (xjVar2 != null) {
                                i9 = size2;
                                spannableString.setSpan(new yj(xjVar2.a, 0), i32, i33, 33);
                            } else {
                                i9 = size2;
                            }
                            eu.W(spannableString, l03Var2.b(), i32, i33);
                            an anVarK = l03Var2.k();
                            float fA = l03Var2.a();
                            if (anVarK != null) {
                                if (anVarK instanceof ft2) {
                                    eu.W(spannableString, ((ft2) anVarK).a, i32, i33);
                                } else {
                                    spannableString.setSpan(new aq2((zp2) anVarK, fA), i32, i33, 33);
                                }
                            }
                            gz2 gz2Var = lt2Var11.m;
                            if (gz2Var != null) {
                                int i34 = gz2Var.a;
                                i11 = 33;
                                spannableString.setSpan(new hz2((i34 | 1) == i34, (i34 | 2) == i34), i32, i33, 33);
                            } else {
                                i11 = 33;
                            }
                            eu.X(spannableString, lt2Var11.b, e70Var3, i32, i33);
                            String str4 = lt2Var11.g;
                            if (str4 != null) {
                                spannableString.setSpan(new am0(0, str4), i32, i33, i11);
                            }
                            m03 m03Var2 = lt2Var11.j;
                            if (m03Var2 != null) {
                                spannableString.setSpan(new ScaleXSpan(m03Var2.a), i32, i33, i11);
                                spannableString.setSpan(new yj(m03Var2.b, 1), i32, i33, i11);
                            }
                            eu.Y(spannableString, lt2Var11.k, i32, i33);
                            e70Var2 = e70Var3;
                            long j12 = lt2Var11.l;
                            if (j12 != 16) {
                                spannableString.setSpan(new BackgroundColorSpan(sp0.j0(j12)), i32, i33, i11);
                            }
                            bq2 bq2Var = lt2Var11.n;
                            if (bq2Var != null) {
                                long j13 = bq2Var.b;
                                i10 = i5;
                                z2 = z;
                                int iJ0 = sp0.j0(bq2Var.a);
                                j4 = j11;
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j13));
                                float f2 = bq2Var.c;
                                dq2 dq2Var = new dq2(iJ0, fIntBitsToFloat, fIntBitsToFloat2, f2 == f ? Float.MIN_VALUE : f2);
                                i12 = 33;
                                spannableString.setSpan(dq2Var, i32, i33, 33);
                            } else {
                                i10 = i5;
                                z2 = z;
                                j4 = j11;
                                i12 = i11;
                            }
                            op0 op0Var = lt2Var11.o;
                            if (op0Var != null) {
                                spannableString.setSpan(new oc0(op0Var), i32, i33, i12);
                            }
                            z = (q13.a(p13.b(j4), 4294967296L) || q13.a(p13.b(j4), 8589934592L)) ? true : z;
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
                        rd rdVar5 = (rd) list6.get(i35);
                        od odVar = (od) rdVar5.a;
                        if (odVar instanceof lt2) {
                            int i36 = rdVar5.b;
                            int i37 = rdVar5.c;
                            if (i36 < 0 || i36 >= spannableString.length() || i37 <= i36 || i37 > spannableString.length()) {
                                i7 = size9;
                                i8 = i35;
                            } else {
                                long j14 = ((lt2) odVar).h;
                                long jB4 = p13.b(j14);
                                i7 = size9;
                                i8 = i35;
                                Object w91Var = q13.a(jB4, 4294967296L) ? new w91(e70Var4.h0(j14)) : q13.a(jB4, 8589934592L) ? new v91(p13.c(j14)) : null;
                                if (w91Var != null) {
                                    spannableString.setSpan(w91Var, i36, i37, 33);
                                }
                            }
                        }
                        i35 = i8 + 1;
                        size9 = i7;
                    }
                }
                n03Var2 = vw1Var2.d;
                if (n03Var2 != null) {
                    long j15 = n03Var2.a;
                    long jB5 = p13.b(j15);
                    if (q13.a(jB5, 4294967296L)) {
                        e70Var4.h0(j15);
                    } else if (q13.a(jB5, 8589934592L)) {
                        p13.c(j15);
                    }
                }
                size3 = list6.size();
                for (i6 = 0; i6 < size3; i6++) {
                    Object obj6 = ((rd) list6.get(i6)).a;
                }
                if (list5.size() > 0) {
                    charSequence = spannableString;
                    this.h = charSequence;
                    this.i = new g61(charSequence, this.g, this.k);
                }
                rd rdVar6 = (rd) list5.get(0);
                if (rdVar6.a != null) {
                    c80.g();
                    throw null;
                }
                for (Object obj7 : spannableString.getSpans(rdVar6.b, rdVar6.c, vd0.class)) {
                    if (obj7 != null) {
                        c80.g();
                        throw null;
                    }
                    spannableString.removeSpan(null);
                }
                throw null;
            }
            list3 = list7;
            w9Var = w9Var2;
            arrayList = new ArrayList(list6.size());
            size = list6.size();
            while (i3 < size) {
            }
            lt2 lt2Var62 = m13Var2.a;
            mx2 mx2Var22 = lt2Var62.f;
            if (mx2Var22 != null) {
                if (mx2Var22 != null || lt2Var62.d != null || lt2Var62.c != null) {
                    x xVar2 = new x(12, spannableString, w9Var);
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
                    n03Var2 = vw1Var2.d;
                    if (n03Var2 != null) {
                    }
                    size3 = list6.size();
                    while (i6 < size3) {
                    }
                    if (list5.size() > 0) {
                    }
                }
            }
            this.h = charSequence;
            this.i = new g61(charSequence, this.g, this.k);
        }
        j3 = 1095216660480L;
        float fU2 = eu.U(vw1Var2.c, textSize, e70Var3);
        if (!Float.isNaN(fU2)) {
            spannableString.setSpan(new ua1(fU2), 0, spannableString.length(), 33);
        }
        i2 = 0;
        n03Var = vw1Var2.d;
        if (n03Var == null) {
        }
        w9Var = w9Var2;
        arrayList = new ArrayList(list6.size());
        size = list6.size();
        while (i3 < size) {
        }
        lt2 lt2Var622 = m13Var2.a;
        mx2 mx2Var222 = lt2Var622.f;
        this.h = charSequence;
        this.i = new g61(charSequence, this.g, this.k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.tw1
    public final float a() {
        g61 g61Var = this.i;
        float f = g61Var.e;
        TextPaint textPaint = g61Var.b;
        if (!Float.isNaN(f)) {
            return g61Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = g61Var.a;
        lineInstance.setText(new uq(charSequence, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, gf1.c);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new c11(i, next, 1));
            } else {
                c11 c11Var = (c11) priorityQueue.peek();
                if (c11Var != null && c11Var.i - c11Var.h < next - i) {
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
                um2.b();
                return 0.0f;
            }
            c11 c11Var2 = (c11) it.next();
            desiredWidth = Layout.getDesiredWidth(g61Var.b(), c11Var2.h, c11Var2.i, textPaint);
            while (it.hasNext()) {
                c11 c11Var3 = (c11) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(g61Var.b(), c11Var3.h, c11Var3.i, textPaint));
            }
        }
        g61Var.e = desiredWidth;
        return desiredWidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.tw1
    public final boolean b() {
        vu2 vu2Var = this.j;
        if (vu2Var != null ? vu2Var.a() : false) {
            return true;
        }
        if (qp0.i(this.b)) {
            int i = sp0.f;
            if (Boolean.FALSE.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.tw1
    public final float c() {
        return this.i.c();
    }
}
