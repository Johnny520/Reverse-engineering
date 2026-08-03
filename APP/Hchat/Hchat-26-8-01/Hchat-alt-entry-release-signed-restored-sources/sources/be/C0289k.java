package be;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.Layout;
import android.text.TextUtils;
import be.C0289k;
import gg.AbstractC1416l;
import gg.C1423s;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import na.C2913a;
import na.C2914b;
import na.C2923k;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p011ab.C0045e;
import p014b.C0126e;
import p020b5.C0184c;
import p025bc.AbstractC0255e;
import p069f.C0933f0;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p088g0.C1271o;
import p117i0.C1823e;
import p117i0.InterfaceC1827f;
import p119i2.AbstractC1928h;
import p119i2.C1922e;
import p119i2.C1924f;
import p119i2.C1926g;
import p119i2.C1941n0;
import p119i2.C1948s;
import p119i2.C1950u;
import p119i2.InterfaceC1949t;
import p133j2.AbstractC2057g;
import p133j2.C2055e;
import p136j8.C2104o;
import p162l3.C2458l;
import p177m2.InterfaceC2760d;
import p204o2.AbstractC3042a;
import p215od.C3130c;
import p215od.C3131d;
import p218og.AbstractC3149m;
import p237q2.C3430d;
import p266s0.AbstractC3872b;
import p266s0.C3871a;
import p276sf.EnumC3957d;
import p293u2.InterfaceC4233c;
import p300ub.AbstractC4302b;
import p302ud.C4309e;
import p332wb.AbstractC4855en;
import sa.C3949c;
import tf.AbstractC4166m;
import tf.C4164k;
import tf.C4173t;

/* JADX INFO: renamed from: be.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0289k implements InterfaceC1949t {

    /* JADX INFO: renamed from: a */
    public Object f838a;

    /* JADX INFO: renamed from: b */
    public final Object f839b;

    /* JADX INFO: renamed from: c */
    public final Object f840c;

    /* JADX INFO: renamed from: d */
    public Object f841d;

    /* JADX INFO: renamed from: e */
    public Object f842e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0289k(C1926g c1926g, C1941n0 c1941n0, List list, InterfaceC4233c interfaceC4233c, InterfaceC2760d interfaceC2760d) {
        int i9;
        ArrayList arrayList;
        String str;
        List list2;
        C1926g c1926g2 = c1926g;
        C1941n0 c1941n02 = c1941n0;
        this.f839b = c1926g2;
        this.f840c = list;
        final int i10 = 0;
        InterfaceC1220a interfaceC1220a = new InterfaceC1220a(this) { // from class: i2.p

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C0289k f6593h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f6593h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i10) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.f6593h.f838a;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float fMo1193b = ((C1948s) obj3).f6603a.mo1193b();
                            int i11 = 1;
                            int size = arrayList2.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i11);
                                    float fMo1193b2 = ((C1948s) obj4).f6603a.mo1193b();
                                    if (Float.compare(fMo1193b, fMo1193b2) < 0) {
                                        obj3 = obj4;
                                        fMo1193b = fMo1193b2;
                                    }
                                    if (i11 != size) {
                                        i11++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        C1948s c1948s = (C1948s) obj;
                        return Float.valueOf(c1948s != null ? c1948s.f6603a.mo1193b() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.f6593h.f838a;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float fM5100c = ((C1948s) obj5).f6603a.f11107i.m5100c();
                            int i12 = 1;
                            int size2 = arrayList3.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i12);
                                    float fM5100c2 = ((C1948s) obj6).f6603a.f11107i.m5100c();
                                    if (Float.compare(fM5100c, fM5100c2) < 0) {
                                        obj5 = obj6;
                                        fM5100c = fM5100c2;
                                    }
                                    if (i12 != size2) {
                                        i12++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        C1948s c1948s2 = (C1948s) obj2;
                        return Float.valueOf(c1948s2 != null ? c1948s2.f6603a.f11107i.m5100c() : 0.0f);
                }
            }
        };
        EnumC3957d enumC3957d = EnumC3957d.f12959h;
        this.f841d = AbstractC0283h.m1127G(enumC3957d, interfaceC1220a);
        final int i11 = 1;
        this.f842e = AbstractC0283h.m1127G(enumC3957d, new InterfaceC1220a(this) { // from class: i2.p

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C0289k f6593h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f6593h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i11) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.f6593h.f838a;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float fMo1193b = ((C1948s) obj3).f6603a.mo1193b();
                            int i112 = 1;
                            int size = arrayList2.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i112);
                                    float fMo1193b2 = ((C1948s) obj4).f6603a.mo1193b();
                                    if (Float.compare(fMo1193b, fMo1193b2) < 0) {
                                        obj3 = obj4;
                                        fMo1193b = fMo1193b2;
                                    }
                                    if (i112 != size) {
                                        i112++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        C1948s c1948s = (C1948s) obj;
                        return Float.valueOf(c1948s != null ? c1948s.f6603a.mo1193b() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.f6593h.f838a;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float fM5100c = ((C1948s) obj5).f6603a.f11107i.m5100c();
                            int i12 = 1;
                            int size2 = arrayList3.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i12);
                                    float fM5100c2 = ((C1948s) obj6).f6603a.f11107i.m5100c();
                                    if (Float.compare(fM5100c, fM5100c2) < 0) {
                                        obj5 = obj6;
                                        fM5100c = fM5100c2;
                                    }
                                    if (i12 != size2) {
                                        i12++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        C1948s c1948s2 = (C1948s) obj2;
                        return Float.valueOf(c1948s2 != null ? c1948s2.f6603a.f11107i.m5100c() : 0.0f);
                }
            }
        });
        C1950u c1950u = c1941n02.f6581b;
        C1926g c1926g3 = AbstractC1928h.f6536a;
        ArrayList arrayList2 = c1926g2.f6531j;
        String str2 = c1926g2.f6529h;
        C4173t c4173t = C4173t.f13710g;
        List listM8402K1 = arrayList2 != null ? AbstractC4166m.m8402K1(arrayList2, new C1924f(i11)) : c4173t;
        ArrayList arrayList3 = new ArrayList();
        C4164k c4164k = new C4164k();
        int size = listM8402K1.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            C1922e c1922e = (C1922e) listM8402K1.get(i12);
            C1922e c1922eM4782a = C1922e.m4782a(c1922e, c1950u.m4839a((C1950u) c1922e.f6503a), i10, 14);
            Object obj = c1922eM4782a.f6503a;
            int i14 = c1922eM4782a.f6505c;
            int i15 = c1922eM4782a.f6504b;
            while (i13 < i15 && !c4164k.isEmpty()) {
                C1922e c1922e2 = (C1922e) c4164k.last();
                List list3 = listM8402K1;
                int i16 = c1922e2.f6505c;
                C4173t c4173t2 = c4173t;
                Object obj2 = c1922e2.f6503a;
                if (i15 < i16) {
                    arrayList3.add(new C1922e(i13, i15, obj2));
                    i13 = i15;
                    listM8402K1 = list3;
                    c4173t = c4173t2;
                } else {
                    int i17 = size;
                    arrayList3.add(new C1922e(i13, i16, obj2));
                    i13 = c1922e2.f6505c;
                    while (!c4164k.isEmpty() && i13 == ((C1922e) c4164k.last()).f6505c) {
                        c4164k.removeLast();
                    }
                    listM8402K1 = list3;
                    c4173t = c4173t2;
                    size = i17;
                }
            }
            List list4 = listM8402K1;
            C4173t c4173t3 = c4173t;
            int i18 = size;
            if (i13 < i15) {
                arrayList3.add(new C1922e(i13, i15, c1950u));
                i13 = i15;
            }
            C1922e c1922e3 = (C1922e) c4164k.m8359g();
            if (c1922e3 != null) {
                int i19 = c1922e3.f6505c;
                Object obj3 = c1922e3.f6503a;
                int i20 = c1922e3.f6504b;
                if (i20 == i15 && i19 == i14) {
                    c4164k.removeLast();
                    c4164k.addLast(new C1922e(i15, i14, ((C1950u) obj3).m4839a((C1950u) obj)));
                } else if (i20 == i19) {
                    arrayList3.add(new C1922e(i20, i19, obj3));
                    c4164k.removeLast();
                    c4164k.addLast(new C1922e(i15, i14, obj));
                } else {
                    if (i19 < i14) {
                        C2104o.m5289o();
                        throw null;
                    }
                    c4164k.addLast(new C1922e(i15, i14, ((C1950u) obj3).m4839a((C1950u) obj)));
                }
            } else {
                c4164k.addLast(new C1922e(i15, i14, obj));
            }
            i12++;
            listM8402K1 = list4;
            c4173t = c4173t3;
            size = i18;
            i10 = 0;
        }
        C4173t c4173t4 = c4173t;
        while (i13 <= str2.length() && !c4164k.isEmpty()) {
            C1922e c1922e4 = (C1922e) c4164k.last();
            Object obj4 = c1922e4.f6503a;
            int i21 = c1922e4.f6505c;
            arrayList3.add(new C1922e(i13, i21, obj4));
            while (!c4164k.isEmpty() && i21 == ((C1922e) c4164k.last()).f6505c) {
                c4164k.removeLast();
            }
            i13 = i21;
        }
        if (i13 < str2.length()) {
            arrayList3.add(new C1922e(i13, str2.length(), c1950u));
        }
        if (arrayList3.isEmpty()) {
            i9 = 0;
            arrayList3.add(new C1922e(0, 0, c1950u));
        } else {
            i9 = 0;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i22 = i9;
        while (i22 < size2) {
            C1922e c1922e5 = (C1922e) arrayList3.get(i22);
            int i23 = c1922e5.f6504b;
            int i24 = c1922e5.f6505c;
            String strSubstring = i23 != i24 ? str2.substring(i23, i24) : HttpUrl.FRAGMENT_ENCODE_SET;
            List listM4797a = AbstractC1928h.m4797a(c1926g2, i23, i24, new C1271o(29));
            C1926g c1926g4 = new C1926g(strSubstring, listM4797a == null ? c4173t4 : listM4797a);
            C1950u c1950u2 = (C1950u) c1922e5.f6503a;
            if (c1950u2.f6607b == 0) {
                arrayList = arrayList3;
                str = str2;
                c1950u2 = new C1950u(c1950u2.f6606a, c1950u.f6607b, c1950u2.f6608c, c1950u2.f6609d, c1950u2.f6610e, c1950u2.f6611f, c1950u2.f6612g, c1950u2.f6613h, c1950u2.f6614i);
            } else {
                arrayList = arrayList3;
                str = str2;
            }
            C1941n0 c1941n03 = new C1941n0(c1941n02.f6580a, c1950u.m4839a(c1950u2));
            List list5 = c1926g4.f6528g;
            List list6 = list5 == null ? c4173t4 : list5;
            List list7 = (List) this.f840c;
            ArrayList arrayList5 = new ArrayList(list7.size());
            int size3 = list7.size();
            int i25 = 0;
            while (i25 < size3) {
                C1922e c1922e6 = (C1922e) list7.get(i25);
                int i26 = c1922e6.f6504b;
                C1950u c1950u3 = c1950u;
                int i27 = c1922e6.f6505c;
                if (AbstractC1928h.m4798b(i23, i24, i26, i27)) {
                    if (i23 > i26 || i27 > i24) {
                        AbstractC3042a.m6486a("placeholder can not overlap with paragraph.");
                    }
                    list2 = list7;
                    arrayList5.add(new C1922e(i26 - i23, i27 - i23, c1922e6.f6503a));
                } else {
                    list2 = list7;
                }
                i25++;
                list7 = list2;
                c1950u = c1950u3;
            }
            arrayList4.add(new C1948s(new C3430d(strSubstring, c1941n03, list6, arrayList5, interfaceC2760d, interfaceC4233c), i23, i24));
            i22++;
            c1926g2 = c1926g;
            c1941n02 = c1941n0;
            str2 = str;
            arrayList3 = arrayList;
        }
        this.f838a = arrayList4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p119i2.InterfaceC1949t
    /* JADX INFO: renamed from: a */
    public boolean mo1192a() {
        ArrayList arrayList = (ArrayList) this.f838a;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((C1948s) arrayList.get(i9)).f6603a.mo1192a()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, sf.c] */
    @Override // p119i2.InterfaceC1949t
    /* JADX INFO: renamed from: b */
    public float mo1193b() {
        return ((Number) this.f841d.getValue()).floatValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, sf.c] */
    @Override // p119i2.InterfaceC1949t
    /* JADX INFO: renamed from: c */
    public float mo1194c() {
        return ((Number) this.f842e.getValue()).floatValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public InterfaceC1827f m1195d(AbstractC3872b abstractC3872b, InterfaceC1220a interfaceC1220a) {
        int i9;
        int i10;
        int i11;
        C1423s c1423s = new C1423s();
        c1423s.f4736g = -1;
        synchronized (this.f839b) {
            Throwable th2 = (Throwable) this.f838a;
            if (th2 != null) {
                abstractC3872b.mo4453b(th2);
                return C1823e.f6047h;
            }
            C3871a c3871a = (C3871a) this.f840c;
            do {
                i9 = c3871a.get();
                i10 = i9 + 1;
            } while (!c3871a.compareAndSet(i9, i10));
            boolean z9 = (134217727 & i10) == 1;
            c1423s.f4736g = (i10 >>> 27) & 15;
            ((C0933f0) this.f841d).m2286a(abstractC3872b);
            if (z9 && interfaceC1220a != null) {
                try {
                    interfaceC1220a.invoke();
                } catch (Throwable th3) {
                    synchronized (this.f839b) {
                        try {
                            if (((Throwable) this.f838a) == null) {
                                this.f838a = th3;
                                C0933f0 c0933f0 = (C0933f0) this.f841d;
                                Object[] objArr = c0933f0.f2923a;
                                int i12 = c0933f0.f2924b;
                                for (int i13 = 0; i13 < i12; i13++) {
                                    ((AbstractC3872b) objArr[i13]).mo4453b(th3);
                                }
                                ((C0933f0) this.f841d).m2289d();
                                C3871a c3871a2 = (C3871a) this.f840c;
                                do {
                                    i11 = c3871a2.get();
                                } while (!c3871a2.compareAndSet(i11, ((((i11 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            }
            return new C0126e(new C0045e(abstractC3872b, this, c1423s, 12));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bidi m1196e(int i9) {
        Bidi bidi;
        Layout layout = (Layout) this.f839b;
        ArrayList arrayList = (ArrayList) this.f838a;
        ArrayList arrayList2 = (ArrayList) this.f840c;
        boolean[] zArr = (boolean[]) this.f841d;
        if (zArr[i9]) {
            return (Bidi) arrayList2.get(i9);
        }
        int iIntValue = i9 == 0 ? 0 : ((Number) arrayList.get(i9 - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i9)).intValue();
        int i10 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.f842e;
        if (cArr == null || cArr.length < i10) {
            cArr = new char[i10];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i10)) {
            bidi = new Bidi(cArr2, 0, null, 0, i10, layout.getParagraphDirection(layout.getLineForOffset(m1202k(i9))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i9, bidi);
        zArr[i9] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.f842e;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f842e = cArr2;
        return bidi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public void m1197f(InterfaceC1231l interfaceC1231l) {
        int i9;
        synchronized (this.f839b) {
            try {
                C0933f0 c0933f0 = (C0933f0) this.f841d;
                this.f841d = (C0933f0) this.f842e;
                this.f842e = c0933f0;
                C3871a c3871a = (C3871a) this.f840c;
                do {
                    i9 = c3871a.get();
                } while (!c3871a.compareAndSet(i9, ((((i9 >>> 27) & 15) + 1) & 15) << 27));
                int i10 = c0933f0.f2924b;
                for (int i11 = 0; i11 < i10; i11++) {
                    interfaceC1231l.invoke(c0933f0.m2291f(i11));
                }
                c0933f0.m2289d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public float m1198g(int i9, boolean z9) {
        Layout layout = (Layout) this.f839b;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i9));
        if (i9 > lineEnd) {
            i9 = lineEnd;
        }
        return z9 ? layout.getPrimaryHorizontal(i9) : layout.getSecondaryHorizontal(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public C3130c m1199h(C3130c c3130c) {
        synchronized (((HashMap) this.f838a)) {
            try {
                C3130c c3130c2 = (C3130c) ((HashMap) this.f838a).get(c3130c);
                if (c3130c2 != null) {
                    return c3130c2;
                }
                ((HashMap) this.f838a).put(c3130c, c3130c);
                return c3130c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public float m1200i(int i9, boolean z9, boolean z10) {
        int i10;
        int i11;
        int iM1203l = i9;
        Layout layout = (Layout) this.f839b;
        if (!z10) {
            return m1198g(i9, z9);
        }
        int iM5104d = AbstractC2057g.m5104d(layout, iM1203l, z10);
        int lineStart = layout.getLineStart(iM5104d);
        int lineEnd = layout.getLineEnd(iM5104d);
        if (iM1203l != lineStart && iM1203l != lineEnd) {
            return m1198g(i9, z9);
        }
        if (iM1203l == 0 || iM1203l == layout.getText().length()) {
            return m1198g(i9, z9);
        }
        int iM1201j = m1201j(iM1203l, z10);
        boolean z11 = layout.getParagraphDirection(layout.getLineForOffset(m1202k(iM1201j))) == -1;
        int iM1203l2 = m1203l(lineEnd, lineStart);
        int iM1202k = m1202k(iM1201j);
        int i12 = lineStart - iM1202k;
        int i13 = iM1203l2 - iM1202k;
        Bidi bidiM1196e = m1196e(iM1201j);
        Bidi bidiCreateLineBidi = bidiM1196e != null ? bidiM1196e.createLineBidi(i12, i13) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z9 || z11 == zIsRtlCharAt) {
                z11 = !z11;
            }
            return iM1203l == lineStart ? z11 : !z11 ? layout.getLineLeft(iM5104d) : layout.getLineRight(iM5104d);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        C2055e[] c2055eArr = new C2055e[runCount];
        for (int i14 = 0; i14 < runCount; i14++) {
            c2055eArr[i14] = new C2055e(bidiCreateLineBidi.getRunStart(i14) + lineStart, bidiCreateLineBidi.getRunLimit(i14) + lineStart, bidiCreateLineBidi.getRunLevel(i14) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i15 = 0; i15 < runCount2; i15++) {
            bArr[i15] = (byte) bidiCreateLineBidi.getRunLevel(i15);
        }
        Bidi.reorderVisually(bArr, 0, c2055eArr, 0, runCount);
        if (iM1203l == lineStart) {
            int i16 = 0;
            while (true) {
                if (i16 >= runCount) {
                    i11 = -1;
                    break;
                }
                if (c2055eArr[i16].f6900a == iM1203l) {
                    i11 = i16;
                    break;
                }
                i16++;
            }
            boolean z12 = (z9 || z11 == c2055eArr[i11].f6902c) ? !z11 : z11;
            return (i11 == 0 && z12) ? layout.getLineLeft(iM5104d) : (i11 != runCount - 1 || z12) ? z12 ? layout.getPrimaryHorizontal(c2055eArr[i11 - 1].f6900a) : layout.getPrimaryHorizontal(c2055eArr[i11 + 1].f6900a) : layout.getLineRight(iM5104d);
        }
        if (iM1203l > iM1203l2) {
            iM1203l = m1203l(iM1203l, lineStart);
        }
        int i17 = 0;
        while (true) {
            if (i17 >= runCount) {
                i10 = -1;
                break;
            }
            if (c2055eArr[i17].f6901b == iM1203l) {
                i10 = i17;
                break;
            }
            i17++;
        }
        boolean z13 = (z9 || z11 == c2055eArr[i10].f6902c) ? z11 : !z11;
        return (i10 == 0 && z13) ? layout.getLineLeft(iM5104d) : (i10 != runCount - 1 || z13) ? z13 ? layout.getPrimaryHorizontal(c2055eArr[i10 - 1].f6901b) : layout.getPrimaryHorizontal(c2055eArr[i10 + 1].f6901b) : layout.getLineRight(iM5104d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public int m1201j(int i9, boolean z9) {
        ArrayList arrayList = (ArrayList) this.f838a;
        int iM82p = AbstractC0000a.m82p(arrayList, Integer.valueOf(i9));
        int i10 = iM82p < 0 ? -(iM82p + 1) : iM82p + 1;
        if (z9 && i10 > 0) {
            int i11 = i10 - 1;
            if (i9 == ((Number) arrayList.get(i11)).intValue()) {
                return i11;
            }
        }
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public int m1202k(int i9) {
        if (i9 == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f838a).get(i9 - 1)).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public int m1203l(int i9, int i10) {
        while (i9 > i10) {
            char cCharAt = ((Layout) this.f839b).getText().charAt(i9 - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((AbstractC1416l.m3827c(cCharAt, 8192) < 0 || AbstractC1416l.m3827c(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i9;
            }
            i9--;
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m1204m(String str, String str2, String str3, C2913a c2913a) {
        boolean z9;
        C0184c c0184c = (C0184c) this.f842e;
        String strM1207p = m1207p(str, str2);
        C0184c c0184c2 = (C0184c) this.f840c;
        Context context = (Context) c0184c2.f469a;
        C2923k c2923k = (C2923k) c0184c2.f470b;
        if (TextUtils.isEmpty(str2)) {
            z9 = false;
        } else if (!TextUtils.isEmpty(str2) && str2 != null) {
            if (!c2923k.f9538a.contains(str2)) {
                String strM2790s0 = AbstractC1089i.m2790s0(str2);
                if (TextUtils.isEmpty(strM2790s0) || !c2923k.f9539b.contains(strM2790s0)) {
                    String strM2790s02 = AbstractC1089i.m2790s0(str2);
                    String strConcat = !TextUtils.isEmpty(strM2790s02) ? "sendid:".concat(strM2790s02) : str2 != null ? str2 : HttpUrl.FRAGMENT_ENCODE_SET;
                    if (TextUtils.isEmpty(strConcat) || !c2923k.f9540c.contains(strConcat)) {
                        try {
                            z9 = AbstractC4302b.m8640c(context, "Hchat_redpacket_config").getBoolean(C0184c.m782e(str2), false);
                        } catch (Throwable unused) {
                            z9 = false;
                        }
                    }
                }
            }
            z9 = true;
        }
        if (z9) {
            return;
        }
        String strM1021j = TextUtils.isEmpty(str2) ? AbstractC0255e.m1021j("f_", strM1207p, "_", str3) : str2;
        String str4 = !TextUtils.isEmpty(str2) ? str2 : strM1021j;
        if (!TextUtils.isEmpty(str4)) {
            String strM9263g = AbstractC4855en.m9263g("stat:", str4);
            if (!TextUtils.isEmpty(strM9263g) && c2923k.f9542e.add(strM9263g)) {
                try {
                    SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_redpacket_config");
                    sharedPreferencesM8640c.edit().putInt("hb_stats_failed", sharedPreferencesM8640c.getInt("hb_stats_failed", 0) + 1).apply();
                } catch (Throwable unused2) {
                }
            }
        }
        boolean z10 = c2913a.f9416E;
        boolean z11 = c2913a.f9417F;
        if (z10 || z11) {
            boolean z12 = c2913a.f9446y;
            boolean z13 = c2913a.f9412A;
            boolean z14 = false;
            String str5 = c2913a.f9413B;
            C2923k c2923k2 = (C2923k) this.f838a;
            String strM9263g2 = AbstractC4855en.m9263g("notify:", strM1021j);
            if (!TextUtils.isEmpty(strM9263g2) && c2923k2.f9542e.add(strM9263g2)) {
                z14 = true;
            }
            if (z14) {
                C3949c c3949c = (C3949c) this.f841d;
                String strM817n = c0184c.m817n(((C2458l) this.f839b).m5855d("hb_notify_failed_title", "未抢到红包"), HttpUrl.FRAGMENT_ENCODE_SET, strM1207p, str2);
                String str6 = c2913a.f9418G;
                if (TextUtils.isEmpty(str6)) {
                    str6 = "未抢到红包";
                }
                String strM817n2 = c0184c.m817n(str6, HttpUrl.FRAGMENT_ENCODE_SET, strM1207p, str2);
                String str7 = c2913a.f9419H;
                c3949c.m8172b(strM817n, strM817n2, c0184c.m817n(TextUtils.isEmpty(str7) ? "未抢到红包" : str7, HttpUrl.FRAGMENT_ENCODE_SET, strM1207p, str2), strM1207p, str2, 100000, z10, z11, z12, z13, str5);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m1205n(String str, String str2, String str3, C2913a c2913a) {
        C0184c c0184c;
        String strReplaceAll;
        int iRound;
        C0184c c0184c2 = (C0184c) this.f842e;
        String strM1207p = m1207p(str2, str3);
        C0184c c0184c3 = (C0184c) this.f840c;
        Set set = ((C2923k) c0184c3.f470b).f9540c;
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str)) {
            c0184c = c0184c2;
        } else if (TextUtils.isEmpty(str)) {
            iRound = 0;
            if (iRound > 0) {
                try {
                    SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c((Context) c0184c3.f469a, "Hchat_redpacket_config");
                    String strM782e = C0184c.m782e(str3);
                    if (!sharedPreferencesM8640c.getBoolean(strM782e, false)) {
                        String strM2790s0 = AbstractC1089i.m2790s0(str3);
                        int i9 = iRound;
                        String strConcat = !TextUtils.isEmpty(strM2790s0) ? "sendid:".concat(strM2790s0) : str3 != null ? str3 : HttpUrl.FRAGMENT_ENCODE_SET;
                        c0184c = c0184c2;
                        if (!TextUtils.isEmpty(strConcat)) {
                            try {
                                boolean z9 = set.contains(strConcat);
                                if (!z9) {
                                    String strM2790s02 = AbstractC1089i.m2790s0(str3);
                                    String strConcat2 = !TextUtils.isEmpty(strM2790s02) ? "sendid:".concat(strM2790s02) : str3 != null ? str3 : HttpUrl.FRAGMENT_ENCODE_SET;
                                    if (!TextUtils.isEmpty(strConcat2) && set.add(strConcat2)) {
                                        sharedPreferencesM8640c.edit().putInt("hb_stats_amount", sharedPreferencesM8640c.getInt("hb_stats_amount", 0) + i9).putBoolean(strM782e, true).apply();
                                        ((C2914b) c0184c3.f471c).f9449h.m6327d("记录本人实收金额: " + str + "元");
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
        } else {
            try {
                strReplaceAll = str.replaceAll("[^0-9.\\-]", HttpUrl.FRAGMENT_ENCODE_SET);
            } catch (Throwable unused3) {
            }
            if (!TextUtils.isEmpty(strReplaceAll)) {
                iRound = (int) Math.round(Double.parseDouble(strReplaceAll) * 100.0d);
                if (iRound > 0) {
                }
            }
            iRound = 0;
            if (iRound > 0) {
            }
        }
        boolean z10 = c2913a.f9444w;
        boolean z11 = c2913a.f9445x;
        if (z10 || z11) {
            boolean z12 = c2913a.f9446y;
            boolean z13 = c2913a.f9412A;
            String str4 = c2913a.f9413B;
            String strM1021j = TextUtils.isEmpty(str3) ? AbstractC0255e.m1021j("t_", strM1207p, "_", str) : str3;
            C2923k c2923k = (C2923k) this.f838a;
            if (TextUtils.isEmpty(strM1021j)) {
                return;
            }
            Set set2 = c2923k.f9541d;
            if (strM1021j == null) {
                strM1021j = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (set2.add(strM1021j)) {
                String strReplace = TextUtils.isEmpty(str) ? "未知" : str.replace("元", HttpUrl.FRAGMENT_ENCODE_SET);
                C3949c c3949c = (C3949c) this.f841d;
                C0184c c0184c4 = c0184c;
                String strM817n = c0184c4.m817n(((C2458l) this.f839b).m5855d("hb_notify_title", "自动抢红包"), strReplace, strM1207p, str3);
                String str5 = c2913a.f9414C;
                if (TextUtils.isEmpty(str5)) {
                    str5 = "抢到红包 {amount} 元";
                }
                String strM817n2 = c0184c4.m817n(str5, strReplace, strM1207p, str3);
                String str6 = c2913a.f9415D;
                c3949c.m8172b(strM817n, strM817n2, c0184c4.m817n(TextUtils.isEmpty(str6) ? "抢到红包 {amount} 元" : str6, strReplace, strM1207p, str3), strM1207p, str3, 0, z10, z11, z12, z13, str4);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public C3131d m1206o(C3131d c3131d) {
        synchronized (((HashMap) this.f840c)) {
            try {
                C3131d c3131d2 = (C3131d) ((HashMap) this.f840c).get(c3131d);
                if (c3131d2 != null) {
                    return c3131d2;
                }
                ((HashMap) this.f840c).put(c3131d, c3131d);
                return c3131d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public String m1207p(String str, String str2) {
        return (TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) ? (String) ((C2923k) this.f838a).f9545h.get(str2) : str;
    }

    public C0289k(C2458l c2458l, C2923k c2923k, C0184c c0184c, C3949c c3949c, C0184c c0184c2) {
        this.f839b = c2458l;
        this.f838a = c2923k;
        this.f840c = c0184c;
        this.f841d = c3949c;
        this.f842e = c0184c2;
    }

    public C0289k(Layout layout) {
        this.f839b = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iM6718q0 = AbstractC3149m.m6718q0(((Layout) this.f839b).getText(), '\n', length, 4);
            length = iM6718q0 < 0 ? ((Layout) this.f839b).getText().length() : iM6718q0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.f839b).getText().length());
        this.f838a = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i9 = 0; i9 < size; i9++) {
            arrayList2.add(null);
        }
        this.f840c = arrayList2;
        this.f841d = new boolean[((ArrayList) this.f838a).size()];
        ((ArrayList) this.f838a).size();
    }

    public C0289k(int i9) {
        switch (i9) {
            case 4:
                this.f839b = new Object();
                this.f840c = new C3871a(0);
                this.f841d = new C0933f0();
                this.f842e = new C0933f0();
                break;
            default:
                this.f839b = new HashMap();
                this.f838a = new HashMap();
                this.f840c = new HashMap();
                this.f841d = new HashMap();
                this.f842e = new HashMap();
                break;
        }
    }

    public C0289k(C4309e c4309e, ArrayList arrayList) {
        this.f840c = new ArrayList();
        this.f839b = c4309e;
        this.f838a = arrayList;
    }
}
