package p000;

import android.text.Layout;
import android.text.TextUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: cj */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0093cj implements tw1 {

    /* JADX INFO: renamed from: a */
    public Object f1579a;

    /* JADX INFO: renamed from: b */
    public Object f1580b;

    /* JADX INFO: renamed from: c */
    public Object f1581c;

    /* JADX INFO: renamed from: d */
    public Object f1582d;

    /* JADX INFO: renamed from: e */
    public Object f1583e;

    public C0093cj(C0690sd c0690sd, m13 m13Var, List list, e70 e70Var, xl0 xl0Var) {
        int i;
        String str;
        int i2;
        List list2;
        C0690sd c0690sd2 = c0690sd;
        m13 m13Var2 = m13Var;
        this.f1579a = c0690sd2;
        this.f1580b = list;
        final int i3 = 0;
        xm0 xm0Var = new xm0(this) { // from class: mj1

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ C0093cj f6687i;

            {
                this.f6687i = this;
            }

            @Override // p000.xm0
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                int i4 = i3;
                Object obj = null;
                int i5 = 1;
                C0093cj c0093cj = this.f6687i;
                switch (i4) {
                    case 0:
                        ArrayList arrayList = (ArrayList) c0093cj.f1583e;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fMo826a = ((sw1) obj2).f10386a.mo826a();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i5);
                                    float fMo826a2 = ((sw1) obj3).f10386a.mo826a();
                                    if (Float.compare(fMo826a, fMo826a2) < 0) {
                                        obj2 = obj3;
                                        fMo826a = fMo826a2;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        sw1 sw1Var = (sw1) obj;
                        return Float.valueOf(sw1Var != null ? sw1Var.f10386a.mo826a() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) c0093cj.f1583e;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fM1809c = ((sw1) obj4).f10386a.f12908i.m1809c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i5);
                                    float fM1809c2 = ((sw1) obj5).f10386a.f12908i.m1809c();
                                    if (Float.compare(fM1809c, fM1809c2) < 0) {
                                        obj4 = obj5;
                                        fM1809c = fM1809c2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        sw1 sw1Var2 = (sw1) obj;
                        return Float.valueOf(sw1Var2 != null ? sw1Var2.f10386a.f12908i.m1809c() : 0.0f);
                }
            }
        };
        i91 i91Var = i91.f4498i;
        this.f1581c = AbstractC0570p7.m3746B(i91Var, xm0Var);
        final int i4 = 1;
        this.f1582d = AbstractC0570p7.m3746B(i91Var, new xm0(this) { // from class: mj1

            /* JADX INFO: renamed from: i */
            public final /* synthetic */ C0093cj f6687i;

            {
                this.f6687i = this;
            }

            @Override // p000.xm0
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                int i42 = i4;
                Object obj = null;
                int i5 = 1;
                C0093cj c0093cj = this.f6687i;
                switch (i42) {
                    case 0:
                        ArrayList arrayList = (ArrayList) c0093cj.f1583e;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fMo826a = ((sw1) obj2).f10386a.mo826a();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i5);
                                    float fMo826a2 = ((sw1) obj3).f10386a.mo826a();
                                    if (Float.compare(fMo826a, fMo826a2) < 0) {
                                        obj2 = obj3;
                                        fMo826a = fMo826a2;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        sw1 sw1Var = (sw1) obj;
                        return Float.valueOf(sw1Var != null ? sw1Var.f10386a.mo826a() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) c0093cj.f1583e;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fM1809c = ((sw1) obj4).f10386a.f12908i.m1809c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i5);
                                    float fM1809c2 = ((sw1) obj5).f10386a.f12908i.m1809c();
                                    if (Float.compare(fM1809c, fM1809c2) < 0) {
                                        obj4 = obj5;
                                        fM1809c = fM1809c2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        sw1 sw1Var2 = (sw1) obj;
                        return Float.valueOf(sw1Var2 != null ? sw1Var2.f10386a.f12908i.m1809c() : 0.0f);
                }
            }
        });
        vw1 vw1Var = m13Var2.f6436b;
        C0690sd c0690sd3 = AbstractC0730td.f10680a;
        ArrayList arrayList = c0690sd2.f10053k;
        String str2 = c0690sd2.f10051i;
        be0 be0Var = be0.f819h;
        List listM1143A0 = arrayList != null ? AbstractC0142du.m1143A0(arrayList, new sl0(6)) : be0Var;
        ArrayList arrayList2 = new ArrayList();
        C0017ag c0017ag = new C0017ag();
        int size = listM1143A0.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            C0652rd c0652rd = (C0652rd) listM1143A0.get(i5);
            vw1 vw1VarM5803a = vw1Var.m5803a((vw1) c0652rd.f9514a);
            int i7 = c0652rd.f9515b;
            int i8 = c0652rd.f9516c;
            if (i7 > i8) {
                lz0.m2988a("Reversed range is not supported");
            }
            while (i6 < i7 && !c0017ag.isEmpty()) {
                C0652rd c0652rd2 = (C0652rd) c0017ag.last();
                List list3 = listM1143A0;
                int i9 = c0652rd2.f9516c;
                be0 be0Var2 = be0Var;
                Object obj = c0652rd2.f9514a;
                if (i7 < i9) {
                    arrayList2.add(new C0652rd(i6, i7, obj));
                    i6 = i7;
                    listM1143A0 = list3;
                    be0Var = be0Var2;
                } else {
                    int i10 = size;
                    arrayList2.add(new C0652rd(i6, i9, obj));
                    i6 = c0652rd2.f9516c;
                    while (!c0017ag.isEmpty() && i6 == ((C0652rd) c0017ag.last()).f9516c) {
                        c0017ag.removeLast();
                    }
                    listM1143A0 = list3;
                    be0Var = be0Var2;
                    size = i10;
                }
            }
            List list4 = listM1143A0;
            be0 be0Var3 = be0Var;
            int i11 = size;
            if (i6 < i7) {
                arrayList2.add(new C0652rd(i6, i7, vw1Var));
                i6 = i7;
            }
            C0652rd c0652rd3 = (C0652rd) c0017ag.m157f();
            if (c0652rd3 != null) {
                int i12 = c0652rd3.f9516c;
                Object obj2 = c0652rd3.f9514a;
                int i13 = c0652rd3.f9515b;
                if (i13 == i7 && i12 == i8) {
                    c0017ag.removeLast();
                    c0017ag.addLast(new C0652rd(i7, i8, ((vw1) obj2).m5803a(vw1VarM5803a)));
                } else if (i13 == i12) {
                    arrayList2.add(new C0652rd(i13, i12, obj2));
                    c0017ag.removeLast();
                    c0017ag.addLast(new C0652rd(i7, i8, vw1VarM5803a));
                } else {
                    if (i12 < i8) {
                        throw new IllegalArgumentException();
                    }
                    c0017ag.addLast(new C0652rd(i7, i8, ((vw1) obj2).m5803a(vw1VarM5803a)));
                }
            } else {
                c0017ag.addLast(new C0652rd(i7, i8, vw1VarM5803a));
            }
            i5++;
            listM1143A0 = list4;
            be0Var = be0Var3;
            size = i11;
        }
        be0 be0Var4 = be0Var;
        while (i6 <= str2.length() && !c0017ag.isEmpty()) {
            C0652rd c0652rd4 = (C0652rd) c0017ag.last();
            Object obj3 = c0652rd4.f9514a;
            int i14 = c0652rd4.f9516c;
            arrayList2.add(new C0652rd(i6, i14, obj3));
            while (!c0017ag.isEmpty() && i14 == ((C0652rd) c0017ag.last()).f9516c) {
                c0017ag.removeLast();
            }
            i6 = i14;
        }
        if (i6 < str2.length()) {
            arrayList2.add(new C0652rd(i6, str2.length(), vw1Var));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new C0652rd(0, 0, vw1Var));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i15 = i;
        while (i15 < size2) {
            C0652rd c0652rd5 = (C0652rd) arrayList2.get(i15);
            int i16 = c0652rd5.f9515b;
            int i17 = c0652rd5.f9516c;
            String strSubstring = i16 != i17 ? str2.substring(i16, i17) : "";
            List listM5162a = AbstractC0730td.m5162a(c0690sd2, i16, i17, new C0829w(4));
            C0690sd c0690sd4 = new C0690sd(strSubstring, listM5162a == null ? be0Var4 : listM5162a);
            vw1 vw1Var2 = (vw1) c0652rd5.f9514a;
            if (vw1Var2.f12199b == 0) {
                str = str2;
                i2 = size2;
                vw1Var2 = new vw1(vw1Var2.f12198a, vw1Var.f12199b, vw1Var2.f12200c, vw1Var2.f12201d, vw1Var2.f12202e, vw1Var2.f12203f, vw1Var2.f12204g, vw1Var2.f12205h, vw1Var2.f12206i);
            } else {
                str = str2;
                i2 = size2;
            }
            m13 m13Var3 = new m13(m13Var2.f6435a, vw1Var.m5803a(vw1Var2));
            List list5 = c0690sd4.f10050h;
            List list6 = list5 == null ? be0Var4 : list5;
            List list7 = (List) this.f1580b;
            ArrayList arrayList4 = new ArrayList(list7.size());
            int size3 = list7.size();
            int i18 = 0;
            while (i18 < size3) {
                C0652rd c0652rd6 = (C0652rd) list7.get(i18);
                int i19 = c0652rd6.f9515b;
                vw1 vw1Var3 = vw1Var;
                int i20 = c0652rd6.f9516c;
                if (AbstractC0730td.m5163b(i16, i17, i19, i20)) {
                    if (i16 > i19 || i20 > i17) {
                        lz0.m2988a("placeholder can not overlap with paragraph.");
                    }
                    list2 = list7;
                    arrayList4.add(new C0652rd(i19 - i16, i20 - i16, c0652rd6.f9514a));
                } else {
                    list2 = list7;
                }
                i18++;
                list7 = list2;
                vw1Var = vw1Var3;
            }
            arrayList3.add(new sw1(new C0878x9(strSubstring, m13Var3, list6, arrayList4, xl0Var, e70Var), i16, i17));
            i15++;
            c0690sd2 = c0690sd;
            m13Var2 = m13Var;
            str2 = str;
            size2 = i2;
        }
        this.f1583e = arrayList3;
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: a */
    public float mo826a() {
        return ((Number) ((j71) this.f1581c).getValue()).floatValue();
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: b */
    public boolean mo827b() {
        ArrayList arrayList = (ArrayList) this.f1583e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((sw1) arrayList.get(i)).f10386a.mo827b()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.tw1
    /* JADX INFO: renamed from: c */
    public float mo828c() {
        return ((Number) ((j71) this.f1582d).getValue()).floatValue();
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC0508np m829d(AbstractC0057bj abstractC0057bj, xm0 xm0Var) {
        int i;
        int i2;
        int i3;
        a72 a72Var = new a72();
        a72Var.f108h = -1;
        synchronized (this.f1579a) {
            Throwable th = (Throwable) this.f1580b;
            if (th != null) {
                abstractC0057bj.mo551b(th);
                return C0700sn.f10197A;
            }
            C0885xg c0885xg = (C0885xg) this.f1581c;
            do {
                i = c0885xg.get();
                i2 = i + 1;
            } while (!c0885xg.compareAndSet(i, i2));
            boolean z = (134217727 & i2) == 1;
            a72Var.f108h = (i2 >>> 27) & 15;
            ((lk1) this.f1582d).m2925a(abstractC0057bj);
            if (z && xm0Var != null) {
                try {
                    xm0Var.mo6a();
                } catch (Throwable th2) {
                    synchronized (this.f1579a) {
                        try {
                            if (((Throwable) this.f1580b) == null) {
                                this.f1580b = th2;
                                lk1 lk1Var = (lk1) this.f1582d;
                                Object[] objArr = lk1Var.f6163a;
                                int i4 = lk1Var.f6164b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    ((AbstractC0057bj) objArr[i5]).mo551b(th2);
                                }
                                ((lk1) this.f1582d).m2928d();
                                C0885xg c0885xg2 = (C0885xg) this.f1581c;
                                do {
                                    i3 = c0885xg2.get();
                                } while (!c0885xg2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new dq1(new C0678s1(abstractC0057bj, this, a72Var, 3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bidi m830e(int i) {
        Bidi bidi;
        Layout layout = (Layout) this.f1579a;
        ArrayList arrayList = (ArrayList) this.f1580b;
        ArrayList arrayList2 = (ArrayList) this.f1581c;
        boolean[] zArr = (boolean[]) this.f1582d;
        if (zArr[i]) {
            return (Bidi) arrayList2.get(i);
        }
        int iIntValue = i == 0 ? 0 : ((Number) arrayList.get(i - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i)).intValue();
        int i2 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.f1583e;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(m836k(i))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.f1583e;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f1583e = cArr2;
        return bidi;
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC0930yo m831f(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f1583e;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            InterfaceC0930yo interfaceC0930yoMo439a = ((AbstractC0893xo) list.get(i)).mo439a(type, annotationArr);
            if (interfaceC0930yoMo439a != null) {
                return interfaceC0930yoMo439a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC0893xo) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: g */
    public void m832g(in0 in0Var) {
        int i;
        synchronized (this.f1579a) {
            try {
                lk1 lk1Var = (lk1) this.f1582d;
                this.f1582d = (lk1) this.f1583e;
                this.f1583e = lk1Var;
                C0885xg c0885xg = (C0885xg) this.f1581c;
                do {
                    i = c0885xg.get();
                } while (!c0885xg.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = lk1Var.f6164b;
                for (int i3 = 0; i3 < i2; i3++) {
                    in0Var.mo5j(lk1Var.m2930f(i3));
                }
                lk1Var.m2928d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public float m833h(int i, boolean z) {
        Layout layout = (Layout) this.f1579a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    /* JADX INFO: renamed from: i */
    public float m834i(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.f1579a;
        if (!z2) {
            return m833h(i, z);
        }
        int iM5556v = up0.m5556v(layout, i, z2);
        int lineStart = layout.getLineStart(iM5556v);
        int lineEnd = layout.getLineEnd(iM5556v);
        if (i != lineStart && i != lineEnd) {
            return m833h(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return m833h(i, z);
        }
        int iM835j = m835j(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(m836k(iM835j))) == -1;
        int iM838m = m838m(lineEnd, lineStart);
        int iM836k = m836k(iM835j);
        int i4 = lineStart - iM836k;
        int i5 = iM838m - iM836k;
        Bidi bidiM830e = m830e(iM835j);
        Bidi bidiCreateLineBidi = bidiM830e != null ? bidiM830e.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(iM5556v) : layout.getLineRight(iM5556v);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        f61[] f61VarArr = new f61[runCount];
        for (int i6 = 0; i6 < runCount; i6++) {
            f61VarArr[i6] = new f61(bidiCreateLineBidi.getRunStart(i6) + lineStart, bidiCreateLineBidi.getRunLimit(i6) + lineStart, bidiCreateLineBidi.getRunLevel(i6) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i7 = 0; i7 < runCount2; i7++) {
            bArr[i7] = (byte) bidiCreateLineBidi.getRunLevel(i7);
        }
        Bidi.reorderVisually(bArr, 0, f61VarArr, 0, runCount);
        if (i == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (f61VarArr[i8].f2813a == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == f61VarArr[i3].f2815c) ? !z3 : z3;
            return (i3 == 0 && z4) ? layout.getLineLeft(iM5556v) : (i3 != runCount - 1 || z4) ? z4 ? layout.getPrimaryHorizontal(f61VarArr[i3 - 1].f2813a) : layout.getPrimaryHorizontal(f61VarArr[i3 + 1].f2813a) : layout.getLineRight(iM5556v);
        }
        int iM838m2 = i > iM838m ? m838m(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (f61VarArr[i9].f2814b == iM838m2) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == f61VarArr[i2].f2815c) ? z3 : !z3;
        return (i2 == 0 && z5) ? layout.getLineLeft(iM5556v) : (i2 != runCount - 1 || z5) ? z5 ? layout.getPrimaryHorizontal(f61VarArr[i2 - 1].f2814b) : layout.getPrimaryHorizontal(f61VarArr[i2 + 1].f2814b) : layout.getLineRight(iM5556v);
    }

    /* JADX INFO: renamed from: j */
    public int m835j(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.f1580b;
        int iM1475y = AbstractC0179eu.m1475y(arrayList, Integer.valueOf(i));
        int i2 = iM1475y < 0 ? -(iM1475y + 1) : iM1475y + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: k */
    public int m836k(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f1580b).get(i - 1)).intValue();
    }

    /* JADX INFO: renamed from: l */
    public void m837l(String str, String str2) {
        str2.getClass();
        ye0 ye0Var = (ye0) this.f1581c;
        ye0Var.getClass();
        n93.m3262c(str);
        n93.m3263d(str2, str);
        ye0Var.m6262n(str);
        n93.m3260a(ye0Var, str, str2);
    }

    /* JADX INFO: renamed from: m */
    public int m838m(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.f1579a).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((t11.m5089o(cCharAt, 8192) < 0 || t11.m5089o(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    /* JADX INFO: renamed from: n */
    public void m839n(String str, o82 o82Var) {
        str.getClass();
        if (str.length() <= 0) {
            C0676s.m4651j("method.isEmpty() == true");
            return;
        }
        if (o82Var == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                C0676s.m4645c(vi0.m5691j("method ", str, " must have a request body."));
                return;
            }
        } else if (!fg1.m1617I(str)) {
            C0676s.m4645c(vi0.m5691j("method ", str, " must not have a request body."));
            return;
        }
        this.f1580b = str;
        this.f1582d = o82Var;
    }

    /* JADX INFO: renamed from: o */
    public x00 m840o(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = (List) this.f1582d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            x00 x00VarMo2549a = ((w00) list.get(i)).mo2549a(type);
            if (x00VarMo2549a != null) {
                return x00VarMo2549a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((w00) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: p */
    public x00 m841p(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f1582d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            x00 x00VarMo2550b = ((w00) list.get(i)).mo2550b(type, annotationArr, this);
            if (x00VarMo2550b != null) {
                return x00VarMo2550b;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((w00) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: q */
    public void m842q(String str, Object obj) {
        str.getClass();
        ((LinkedHashMap) this.f1579a).put(str, obj);
        ju2 ju2Var = (ju2) ((LinkedHashMap) this.f1581c).get(str);
        if (ju2Var != null) {
            ju2Var.m2575g(obj);
        }
        ju2 ju2Var2 = (ju2) ((LinkedHashMap) this.f1582d).get(str);
        if (ju2Var2 != null) {
            ju2Var2.m2575g(obj);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m843r(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = (List) this.f1582d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((w00) list.get(i)).getClass();
        }
    }

    /* JADX INFO: renamed from: s */
    public void m844s(String str) {
        if (wv2.m6012d0(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (wv2.m6012d0(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        xw0 xw0Var = new xw0();
        xw0Var.m6196e(null, str);
        this.f1579a = xw0Var.m6193b();
    }

    public C0093cj(int i) {
        switch (i) {
            case 4:
                this.f1583e = ie0.f4582n;
                this.f1580b = "GET";
                this.f1581c = new ye0(1);
                break;
            default:
                this.f1579a = new Object();
                this.f1581c = new C0885xg(0);
                this.f1582d = new lk1();
                this.f1583e = new lk1();
                break;
        }
    }

    public C0093cj(Map map) {
        map.getClass();
        this.f1579a = new LinkedHashMap(map);
        this.f1580b = new LinkedHashMap();
        this.f1581c = new LinkedHashMap();
        this.f1582d = new LinkedHashMap();
        this.f1583e = new C0787uv(2, this);
    }
}
