package p000;

import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: r9 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0681r9 implements yo0 {

    /* JADX INFO: renamed from: a */
    public final Object f5327a;

    /* JADX INFO: renamed from: b */
    public Object f5328b;

    /* JADX INFO: renamed from: c */
    public final Object f5329c;

    /* JADX INFO: renamed from: d */
    public Object f5330d;

    /* JADX INFO: renamed from: e */
    public Object f5331e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:139:0x01b3 */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0681r9(C0200f8 c0200f8, s71 s71Var, List list, InterfaceC0968ym interfaceC0968ym, InterfaceC0369jv interfaceC0369jv) {
        int i;
        List list2;
        String str;
        int i2;
        ArrayList arrayList;
        C0200f8 c0200f82 = c0200f8;
        s71 s71Var2 = s71Var;
        this.f5327a = c0200f82;
        this.f5328b = list;
        final int i3 = 0;
        this.f5329c = z60.m5422I(new InterfaceC0298hw(this) { // from class: og0

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ C0681r9 f4556e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f4556e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                int i4 = i3;
                Object obj = null;
                int i5 = 1;
                C0681r9 c0681r9 = this.f4556e;
                switch (i4) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) c0681r9.f5331e;
                        if (!arrayList2.isEmpty()) {
                            Object obj2 = arrayList2.get(0);
                            float fMo488a = ((xo0) obj2).f7387a.mo488a();
                            int size = arrayList2.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList2.get(i5);
                                    float fMo488a2 = ((xo0) obj3).f7387a.mo488a();
                                    if (Float.compare(fMo488a, fMo488a2) < 0) {
                                        obj2 = obj3;
                                        fMo488a = fMo488a2;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        xo0 xo0Var = (xo0) obj;
                        return Float.valueOf(xo0Var != null ? xo0Var.f7387a.mo488a() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) c0681r9.f5331e;
                        if (!arrayList3.isEmpty()) {
                            Object obj4 = arrayList3.get(0);
                            float fM3019c = ((xo0) obj4).f7387a.f703i.m3019c();
                            int size2 = arrayList3.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList3.get(i5);
                                    float fM3019c2 = ((xo0) obj5).f7387a.f703i.m3019c();
                                    if (Float.compare(fM3019c, fM3019c2) < 0) {
                                        obj4 = obj5;
                                        fM3019c = fM3019c2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        xo0 xo0Var2 = (xo0) obj;
                        return Float.valueOf(xo0Var2 != null ? xo0Var2.f7387a.f703i.m3019c() : 0.0f);
                }
            }
        });
        final int i4 = 1;
        this.f5330d = z60.m5422I(new InterfaceC0298hw(this) { // from class: og0

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ C0681r9 f4556e;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f4556e = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                int i42 = i4;
                Object obj = null;
                int i5 = 1;
                C0681r9 c0681r9 = this.f4556e;
                switch (i42) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) c0681r9.f5331e;
                        if (!arrayList2.isEmpty()) {
                            Object obj2 = arrayList2.get(0);
                            float fMo488a = ((xo0) obj2).f7387a.mo488a();
                            int size = arrayList2.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList2.get(i5);
                                    float fMo488a2 = ((xo0) obj3).f7387a.mo488a();
                                    if (Float.compare(fMo488a, fMo488a2) < 0) {
                                        obj2 = obj3;
                                        fMo488a = fMo488a2;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        xo0 xo0Var = (xo0) obj;
                        return Float.valueOf(xo0Var != null ? xo0Var.f7387a.mo488a() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) c0681r9.f5331e;
                        if (!arrayList3.isEmpty()) {
                            Object obj4 = arrayList3.get(0);
                            float fM3019c = ((xo0) obj4).f7387a.f703i.m3019c();
                            int size2 = arrayList3.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList3.get(i5);
                                    float fM3019c2 = ((xo0) obj5).f7387a.f703i.m3019c();
                                    if (Float.compare(fM3019c, fM3019c2) < 0) {
                                        obj4 = obj5;
                                        fM3019c = fM3019c2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        xo0 xo0Var2 = (xo0) obj;
                        return Float.valueOf(xo0Var2 != null ? xo0Var2.f7387a.f703i.m3019c() : 0.0f);
                }
            }
        });
        ap0 ap0Var = s71Var2.f5670b;
        int i5 = AbstractC0237g8.f1885a;
        ArrayList arrayList2 = c0200f82.f1627g;
        String str2 = c0200f82.f1625e;
        C0294hs c0294hs = C0294hs.f2354d;
        List listM5250T = arrayList2 != null ? AbstractC0960ye.m5250T(arrayList2, new C0186ev(6)) : c0294hs;
        ArrayList arrayList3 = new ArrayList();
        C0917x8 c0917x8 = new C0917x8();
        int size = listM5250T.size();
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            C0163e8 c0163e8 = (C0163e8) listM5250T.get(i6);
            ap0 ap0VarM195a = ap0Var.m195a((ap0) c0163e8.f1338a);
            int i8 = c0163e8.f1339b;
            int i9 = c0163e8.f1340c;
            if (i8 > i9) {
                x10.m5082a("Reversed range is not supported");
            }
            while (i7 < i8 && !c0917x8.isEmpty()) {
                C0163e8 c0163e82 = (C0163e8) c0917x8.last();
                List list3 = listM5250T;
                int i10 = c0163e82.f1340c;
                C0294hs c0294hs2 = c0294hs;
                Object obj = c0163e82.f1338a;
                if (i8 < i10) {
                    arrayList3.add(new C0163e8(i7, i8, obj));
                    i7 = i8;
                    listM5250T = list3;
                    c0294hs = c0294hs2;
                } else {
                    int i11 = size;
                    arrayList3.add(new C0163e8(i7, i10, obj));
                    i7 = c0163e82.f1340c;
                    while (!c0917x8.isEmpty() && i7 == ((C0163e8) c0917x8.last()).f1340c) {
                        c0917x8.removeLast();
                    }
                    listM5250T = list3;
                    c0294hs = c0294hs2;
                    size = i11;
                }
            }
            List list4 = listM5250T;
            C0294hs c0294hs3 = c0294hs;
            int i12 = size;
            if (i7 < i8) {
                arrayList3.add(new C0163e8(i7, i8, ap0Var));
                i7 = i8;
            }
            C0163e8 c0163e83 = (C0163e8) c0917x8.m5098f();
            if (c0163e83 != null) {
                int i13 = c0163e83.f1340c;
                Object obj2 = c0163e83.f1338a;
                int i14 = c0163e83.f1339b;
                if (i14 == i8 && i13 == i9) {
                    c0917x8.removeLast();
                    c0917x8.addLast(new C0163e8(i8, i9, ((ap0) obj2).m195a(ap0VarM195a)));
                } else if (i14 == i13) {
                    arrayList3.add(new C0163e8(i14, i13, obj2));
                    c0917x8.removeLast();
                    c0917x8.addLast(new C0163e8(i8, i9, ap0VarM195a));
                } else {
                    if (i13 < i9) {
                        throw new IllegalArgumentException();
                    }
                    c0917x8.addLast(new C0163e8(i8, i9, ((ap0) obj2).m195a(ap0VarM195a)));
                }
            } else {
                c0917x8.addLast(new C0163e8(i8, i9, ap0VarM195a));
            }
            i6++;
            listM5250T = list4;
            c0294hs = c0294hs3;
            size = i12;
        }
        C0294hs c0294hs4 = c0294hs;
        while (i7 <= str2.length() && !c0917x8.isEmpty()) {
            C0163e8 c0163e84 = (C0163e8) c0917x8.last();
            Object obj3 = c0163e84.f1338a;
            int i15 = c0163e84.f1340c;
            arrayList3.add(new C0163e8(i7, i15, obj3));
            while (!c0917x8.isEmpty() && i15 == ((C0163e8) c0917x8.last()).f1340c) {
                c0917x8.removeLast();
            }
            i7 = i15;
        }
        if (i7 < str2.length()) {
            arrayList3.add(new C0163e8(i7, str2.length(), ap0Var));
        }
        if (arrayList3.isEmpty()) {
            i = 0;
            arrayList3.add(new C0163e8(0, 0, ap0Var));
        } else {
            i = 0;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i16 = i;
        while (i16 < size2) {
            C0163e8 c0163e85 = (C0163e8) arrayList3.get(i16);
            int i17 = c0163e85.f1339b;
            int i18 = c0163e85.f1340c;
            String strSubstring = i17 != i18 ? str2.substring(i17, i18) : "";
            ArrayList arrayList5 = null;
            if (i17 == i18 || (list2 = c0200f82.f1624d) == null) {
                str = str2;
            } else if (i17 != 0 || i18 < str2.length()) {
                str = str2;
                arrayList5 = new ArrayList(list2.size());
                int size3 = list2.size();
                int i19 = 0;
                while (i19 < size3) {
                    int i20 = size3;
                    C0163e8 c0163e86 = (C0163e8) list2.get(i19);
                    List list5 = list2;
                    Object obj4 = c0163e86.f1338a;
                    int i21 = c0163e86.f1339b;
                    int i22 = i19;
                    if (!(((InterfaceC0120d8) obj4) instanceof ap0)) {
                        int i23 = c0163e86.f1340c;
                        if (AbstractC0237g8.m1232a(i17, i18, i21, i23)) {
                            i2 = size2;
                            arrayList = arrayList3;
                            arrayList5.add(new C0163e8((InterfaceC0120d8) c0163e86.f1338a, w60.m4907n(i21, i17, i18) - i17, w60.m4907n(i23, i17, i18) - i17, c0163e86.f1341d));
                        } else {
                            i2 = size2;
                            arrayList = arrayList3;
                        }
                    }
                    i19 = i22 + 1;
                    list2 = list5;
                    size3 = i20;
                    size2 = i2;
                    arrayList3 = arrayList;
                }
            } else {
                arrayList5 = new ArrayList(list2.size());
                int size4 = list2.size();
                str = str2;
                int i24 = 0;
                while (i24 < size4) {
                    int i25 = size4;
                    Object obj5 = list2.get(i24);
                    int i26 = i24;
                    if (!(((InterfaceC0120d8) ((C0163e8) obj5).f1338a) instanceof ap0)) {
                        arrayList5.add(obj5);
                    }
                    i24 = i26 + 1;
                    size4 = i25;
                }
            }
            int i27 = size2;
            ArrayList arrayList6 = arrayList3;
            C0200f8 c0200f83 = new C0200f8(strSubstring, arrayList5 == null ? c0294hs4 : arrayList5);
            ap0 ap0Var2 = (ap0) c0163e85.f1338a;
            s71 s71Var3 = new s71(s71Var2.f5669a, ap0Var.m195a(ap0Var2.f225b == 0 ? new ap0(ap0Var2.f224a, ap0Var.f225b, ap0Var2.f226c, ap0Var2.f227d, ap0Var2.f228e, ap0Var2.f229f, ap0Var2.f230g, ap0Var2.f231h, ap0Var2.f232i) : ap0Var2));
            List list6 = c0200f83.f1624d;
            List list7 = list6 == null ? c0294hs4 : list6;
            List list8 = (List) this.f5328b;
            ArrayList arrayList7 = new ArrayList(list8.size());
            int size5 = list8.size();
            int i28 = 0;
            while (i28 < size5) {
                C0163e8 c0163e87 = (C0163e8) list8.get(i28);
                int i29 = c0163e87.f1339b;
                List list9 = list8;
                int i30 = c0163e87.f1340c;
                if (AbstractC0237g8.m1232a(i17, i18, i29, i30)) {
                    if (i17 > i29 || i30 > i18) {
                        x10.m5082a("placeholder can not overlap with paragraph.");
                    }
                    arrayList7.add(new C0163e8(i29 - i17, i30 - i17, c0163e87.f1338a));
                }
                i28++;
                list8 = list9;
            }
            arrayList4.add(new xo0(new C0080c6(strSubstring, s71Var3, list7, arrayList7, interfaceC0369jv, interfaceC0968ym), i17, i18));
            i16++;
            c0200f82 = c0200f8;
            s71Var2 = s71Var;
            str2 = str;
            size2 = i27;
            arrayList3 = arrayList6;
        }
        this.f5331e = arrayList4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yo0
    /* JADX INFO: renamed from: a */
    public float mo488a() {
        return ((Number) ((u60) this.f5329c).getValue()).floatValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yo0
    /* JADX INFO: renamed from: b */
    public boolean mo489b() {
        ArrayList arrayList = (ArrayList) this.f5331e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((xo0) arrayList.get(i)).f7387a.mo489b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yo0
    /* JADX INFO: renamed from: c */
    public float mo490c() {
        return ((Number) ((u60) this.f5330d).getValue()).floatValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public InterfaceC0958yc m3429d(AbstractC0644q9 abstractC0644q9, InterfaceC0298hw interfaceC0298hw) {
        int i;
        int i2;
        int i3;
        xt0 xt0Var = new xt0();
        xt0Var.f7423d = -1;
        synchronized (this.f5327a) {
            Throwable th = (Throwable) this.f5328b;
            if (th != null) {
                abstractC0644q9.mo1327b(th);
                return C0496n2.f4160t;
            }
            C0238g9 c0238g9 = (C0238g9) this.f5329c;
            do {
                i = c0238g9.get();
                i2 = i + 1;
            } while (!c0238g9.compareAndSet(i, i2));
            int i4 = 0;
            boolean z = (134217727 & i2) == 1;
            xt0Var.f7423d = (i2 >>> 27) & 15;
            ((dh0) this.f5330d).m697a(abstractC0644q9);
            if (z && interfaceC0298hw != null) {
                try {
                    interfaceC0298hw.invoke();
                } catch (Throwable th2) {
                    synchronized (this.f5327a) {
                        try {
                            if (((Throwable) this.f5328b) == null) {
                                this.f5328b = th2;
                                dh0 dh0Var = (dh0) this.f5330d;
                                Object[] objArr = dh0Var.f1108a;
                                int i5 = dh0Var.f1109b;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    ((AbstractC0644q9) objArr[i6]).mo1327b(th2);
                                }
                                ((dh0) this.f5330d).m700d();
                                C0238g9 c0238g92 = (C0238g9) this.f5329c;
                                do {
                                    i3 = c0238g92.get();
                                } while (!c0238g92.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new C0111d(new C0607p9(abstractC0644q9, this, xt0Var, i4));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void m3430e(InterfaceC0742sw interfaceC0742sw) {
        int i;
        synchronized (this.f5327a) {
            try {
                dh0 dh0Var = (dh0) this.f5330d;
                this.f5330d = (dh0) this.f5331e;
                this.f5331e = dh0Var;
                C0238g9 c0238g9 = (C0238g9) this.f5329c;
                do {
                    i = c0238g9.get();
                } while (!c0238g9.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = dh0Var.f1109b;
                for (int i3 = 0; i3 < i2; i3++) {
                    interfaceC0742sw.invoke(dh0Var.m702f(i3));
                }
                dh0Var.m700d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public float m3431f(int i, boolean z) {
        Layout layout = (Layout) this.f5327a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0157  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float m3432g(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        Bidi bidi;
        boolean z4;
        int i6;
        int i7;
        ArrayList arrayList = (ArrayList) this.f5328b;
        Layout layout = (Layout) this.f5327a;
        if (!z2) {
            return m3431f(i, z);
        }
        int iM3025A = pf1.m3025A(layout, i, z2);
        int lineStart = layout.getLineStart(iM3025A);
        int lineEnd = layout.getLineEnd(iM3025A);
        if (i != lineStart && i != lineEnd) {
            return m3431f(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return m3431f(i, z);
        }
        Integer numValueOf = Integer.valueOf(i);
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        if (size < 0) {
            throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
        }
        if (size > size2) {
            throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
        }
        int i8 = size - 1;
        int i9 = 0;
        while (true) {
            if (i9 > i8) {
                i2 = -(i9 + 1);
                break;
            }
            i2 = (i9 + i8) >>> 1;
            int iM3056p = pf1.m3056p((Comparable) arrayList.get(i2), numValueOf);
            if (iM3056p >= 0) {
                if (iM3056p <= 0) {
                    break;
                }
                i8 = i2 - 1;
            } else {
                i9 = i2 + 1;
            }
        }
        int i10 = i2 < 0 ? -(i2 + 1) : i2 + 1;
        if (z2 && i10 > 0) {
            int i11 = i10 - 1;
            if (i == ((Number) arrayList.get(i11)).intValue()) {
                i10 = i11;
            }
        }
        boolean z5 = layout.getParagraphDirection(layout.getLineForOffset(i10 == 0 ? 0 : ((Number) arrayList.get(i10 + (-1))).intValue())) == -1;
        int iM3433h = m3433h(lineEnd, lineStart);
        int iIntValue = i10 == 0 ? 0 : ((Number) arrayList.get(i10 - 1)).intValue();
        int i12 = lineStart - iIntValue;
        int i13 = iM3433h - iIntValue;
        ArrayList arrayList2 = (ArrayList) this.f5329c;
        boolean[] zArr = (boolean[]) this.f5330d;
        if (zArr[i10]) {
            bidi = (Bidi) arrayList2.get(i10);
            i4 = iM3025A;
            i3 = iM3433h;
            i5 = -1;
        } else {
            int iIntValue2 = i10 == 0 ? 0 : ((Number) arrayList.get(i10 - 1)).intValue();
            int iIntValue3 = ((Number) arrayList.get(i10)).intValue();
            int i14 = iIntValue3 - iIntValue2;
            char[] cArr = (char[]) this.f5331e;
            i3 = iM3433h;
            if (cArr == null || cArr.length < i14) {
                cArr = new char[i14];
            }
            i4 = iM3025A;
            TextUtils.getChars(layout.getText(), iIntValue2, iIntValue3, cArr, 0);
            if (Bidi.requiresBidi(cArr, 0, i14)) {
                i5 = -1;
                Bidi bidi2 = new Bidi(cArr, 0, null, 0, i14, layout.getParagraphDirection(layout.getLineForOffset(i10 == 0 ? 0 : ((Number) arrayList.get(i10 + (-1))).intValue())) == -1 ? 1 : 0);
                z3 = true;
                if (bidi2.getRunCount() != 1) {
                    bidi = bidi2;
                }
                arrayList2.set(i10, bidi);
                zArr[i10] = z3;
                if (bidi != null) {
                    char[] cArr2 = (char[]) this.f5331e;
                    cArr = cArr == cArr2 ? null : cArr2;
                }
                this.f5331e = cArr;
            } else {
                i5 = -1;
                z3 = true;
            }
            bidi = null;
            arrayList2.set(i10, bidi);
            zArr[i10] = z3;
            if (bidi != null) {
            }
            this.f5331e = cArr;
        }
        Bidi bidiCreateLineBidi = bidi != null ? bidi.createLineBidi(i12, i13) : null;
        if (bidiCreateLineBidi == null) {
            z4 = true;
        } else {
            if (bidiCreateLineBidi.getRunCount() != 1) {
                int runCount = bidiCreateLineBidi.getRunCount();
                m50[] m50VarArr = new m50[runCount];
                for (int i15 = 0; i15 < runCount; i15++) {
                    m50VarArr[i15] = new m50(bidiCreateLineBidi.getRunStart(i15) + lineStart, bidiCreateLineBidi.getRunLimit(i15) + lineStart, bidiCreateLineBidi.getRunLevel(i15) % 2 == 1);
                }
                int runCount2 = bidiCreateLineBidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i16 = 0; i16 < runCount2; i16++) {
                    bArr[i16] = (byte) bidiCreateLineBidi.getRunLevel(i16);
                }
                boolean z6 = false;
                Bidi.reorderVisually(bArr, 0, m50VarArr, 0, runCount);
                if (i != lineStart) {
                    int i17 = i4;
                    int iM3433h2 = i > i3 ? m3433h(i, lineStart) : i;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= runCount) {
                            i6 = i5;
                            break;
                        }
                        if (m50VarArr[i18].f3807b == iM3433h2) {
                            i6 = i18;
                            break;
                        }
                        i18++;
                    }
                    m50 m50Var = m50VarArr[i6];
                    if (z || z5 == m50Var.f3808c) {
                        z6 = z5;
                    } else if (!z5) {
                        z6 = true;
                    }
                    return (i6 == 0 && z6) ? layout.getLineLeft(i17) : (i6 != runCount + (-1) || z6) ? z6 ? layout.getPrimaryHorizontal(m50VarArr[i6 - 1].f3807b) : layout.getPrimaryHorizontal(m50VarArr[i6 + 1].f3807b) : layout.getLineRight(i17);
                }
                int i19 = 0;
                while (true) {
                    if (i19 >= runCount) {
                        i7 = i5;
                        break;
                    }
                    if (m50VarArr[i19].f3806a == i) {
                        i7 = i19;
                        break;
                    }
                    i19++;
                }
                m50 m50Var2 = m50VarArr[i7];
                if (!z && z5 != m50Var2.f3808c) {
                    z6 = z5;
                } else if (!z5) {
                    z6 = true;
                }
                if (i7 == 0 && z6) {
                    return layout.getLineLeft(i4);
                }
                return (i7 != runCount + (-1) || z6) ? z6 ? layout.getPrimaryHorizontal(m50VarArr[i7 - 1].f3806a) : layout.getPrimaryHorizontal(m50VarArr[i7 + 1].f3806a) : layout.getLineRight(i4);
            }
            z4 = true;
        }
        int i20 = i4;
        boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
        if (z || z5 == zIsRtlCharAt) {
            z5 = !z5 ? z4 : false;
        }
        return i == lineStart ? z5 : !z5 ? z4 : false ? layout.getLineLeft(i20) : layout.getLineRight(i20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public int m3433h(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.f5327a).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((p30.m3008r(cCharAt, 8192) < 0 || p30.m3008r(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public void m3434i(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.f5327a).put(str, obj);
        z31 z31Var = (z31) ((LinkedHashMap) this.f5329c).get(str);
        if (z31Var != null) {
            z31Var.m5412i(obj);
        }
        z31 z31Var2 = (z31) ((LinkedHashMap) this.f5330d).get(str);
        if (z31Var2 != null) {
            z31Var2.m5412i(obj);
        }
    }

    public C0681r9() {
        this.f5327a = new Object();
        this.f5329c = new C0238g9(0);
        this.f5330d = new dh0();
        this.f5331e = new dh0();
    }

    public C0681r9(Layout layout) {
        this.f5327a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iM1767Y = k41.m1767Y(((Layout) this.f5327a).getText(), '\n', length, 4);
            length = iM1767Y < 0 ? ((Layout) this.f5327a).getText().length() : iM1767Y + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.f5327a).getText().length());
        this.f5328b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.f5329c = arrayList2;
        this.f5330d = new boolean[((ArrayList) this.f5328b).size()];
        ((ArrayList) this.f5328b).size();
    }

    public C0681r9(Map map) {
        map.getClass();
        this.f5327a = new LinkedHashMap(map);
        this.f5328b = new LinkedHashMap();
        this.f5329c = new LinkedHashMap();
        this.f5330d = new LinkedHashMap();
        this.f5331e = new C0925xg(2, this);
    }
}
