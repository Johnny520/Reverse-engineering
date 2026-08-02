package defpackage;

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

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cj implements tw1 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cj(sd sdVar, m13 m13Var, List list, e70 e70Var, xl0 xl0Var) {
        int i;
        String str;
        int i2;
        List list2;
        sd sdVar2 = sdVar;
        m13 m13Var2 = m13Var;
        this.a = sdVar2;
        this.b = list;
        final int i3 = 0;
        xm0 xm0Var = new xm0(this) { // from class: mj1
            public final /* synthetic */ cj i;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.i = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // defpackage.xm0
            public final Object a() {
                int i4 = i3;
                Object obj = null;
                int i5 = 1;
                cj cjVar = this.i;
                switch (i4) {
                    case 0:
                        ArrayList arrayList = (ArrayList) cjVar.e;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fA = ((sw1) obj2).a.a();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i5);
                                    float fA2 = ((sw1) obj3).a.a();
                                    if (Float.compare(fA, fA2) < 0) {
                                        obj2 = obj3;
                                        fA = fA2;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        sw1 sw1Var = (sw1) obj;
                        return Float.valueOf(sw1Var != null ? sw1Var.a.a() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) cjVar.e;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fC = ((sw1) obj4).a.i.c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i5);
                                    float fC2 = ((sw1) obj5).a.i.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj4 = obj5;
                                        fC = fC2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        sw1 sw1Var2 = (sw1) obj;
                        return Float.valueOf(sw1Var2 != null ? sw1Var2.a.i.c() : 0.0f);
                }
            }
        };
        i91 i91Var = i91.i;
        this.c = p7.B(i91Var, xm0Var);
        final int i4 = 1;
        this.d = p7.B(i91Var, new xm0(this) { // from class: mj1
            public final /* synthetic */ cj i;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.i = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // defpackage.xm0
            public final Object a() {
                int i42 = i4;
                Object obj = null;
                int i5 = 1;
                cj cjVar = this.i;
                switch (i42) {
                    case 0:
                        ArrayList arrayList = (ArrayList) cjVar.e;
                        if (!arrayList.isEmpty()) {
                            Object obj2 = arrayList.get(0);
                            float fA = ((sw1) obj2).a.a();
                            int size = arrayList.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj3 = arrayList.get(i5);
                                    float fA2 = ((sw1) obj3).a.a();
                                    if (Float.compare(fA, fA2) < 0) {
                                        obj2 = obj3;
                                        fA = fA2;
                                    }
                                    if (i5 != size) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj2;
                        }
                        sw1 sw1Var = (sw1) obj;
                        return Float.valueOf(sw1Var != null ? sw1Var.a.a() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) cjVar.e;
                        if (!arrayList2.isEmpty()) {
                            Object obj4 = arrayList2.get(0);
                            float fC = ((sw1) obj4).a.i.c();
                            int size2 = arrayList2.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj5 = arrayList2.get(i5);
                                    float fC2 = ((sw1) obj5).a.i.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj4 = obj5;
                                        fC = fC2;
                                    }
                                    if (i5 != size2) {
                                        i5++;
                                    }
                                }
                            }
                            obj = obj4;
                        }
                        sw1 sw1Var2 = (sw1) obj;
                        return Float.valueOf(sw1Var2 != null ? sw1Var2.a.i.c() : 0.0f);
                }
            }
        });
        vw1 vw1Var = m13Var2.b;
        sd sdVar3 = td.a;
        ArrayList arrayList = sdVar2.k;
        String str2 = sdVar2.i;
        be0 be0Var = be0.h;
        List listA0 = arrayList != null ? du.A0(arrayList, new sl0(6)) : be0Var;
        ArrayList arrayList2 = new ArrayList();
        ag agVar = new ag();
        int size = listA0.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            rd rdVar = (rd) listA0.get(i5);
            vw1 vw1VarA = vw1Var.a((vw1) rdVar.a);
            int i7 = rdVar.b;
            int i8 = rdVar.c;
            if (i7 > i8) {
                lz0.a("Reversed range is not supported");
            }
            while (i6 < i7 && !agVar.isEmpty()) {
                rd rdVar2 = (rd) agVar.last();
                List list3 = listA0;
                int i9 = rdVar2.c;
                be0 be0Var2 = be0Var;
                Object obj = rdVar2.a;
                if (i7 < i9) {
                    arrayList2.add(new rd(i6, i7, obj));
                    i6 = i7;
                    listA0 = list3;
                    be0Var = be0Var2;
                } else {
                    int i10 = size;
                    arrayList2.add(new rd(i6, i9, obj));
                    i6 = rdVar2.c;
                    while (!agVar.isEmpty() && i6 == ((rd) agVar.last()).c) {
                        agVar.removeLast();
                    }
                    listA0 = list3;
                    be0Var = be0Var2;
                    size = i10;
                }
            }
            List list4 = listA0;
            be0 be0Var3 = be0Var;
            int i11 = size;
            if (i6 < i7) {
                arrayList2.add(new rd(i6, i7, vw1Var));
                i6 = i7;
            }
            rd rdVar3 = (rd) agVar.f();
            if (rdVar3 != null) {
                int i12 = rdVar3.c;
                Object obj2 = rdVar3.a;
                int i13 = rdVar3.b;
                if (i13 == i7 && i12 == i8) {
                    agVar.removeLast();
                    agVar.addLast(new rd(i7, i8, ((vw1) obj2).a(vw1VarA)));
                } else if (i13 == i12) {
                    arrayList2.add(new rd(i13, i12, obj2));
                    agVar.removeLast();
                    agVar.addLast(new rd(i7, i8, vw1VarA));
                } else {
                    if (i12 < i8) {
                        throw new IllegalArgumentException();
                    }
                    agVar.addLast(new rd(i7, i8, ((vw1) obj2).a(vw1VarA)));
                }
            } else {
                agVar.addLast(new rd(i7, i8, vw1VarA));
            }
            i5++;
            listA0 = list4;
            be0Var = be0Var3;
            size = i11;
        }
        be0 be0Var4 = be0Var;
        while (i6 <= str2.length() && !agVar.isEmpty()) {
            rd rdVar4 = (rd) agVar.last();
            Object obj3 = rdVar4.a;
            int i14 = rdVar4.c;
            arrayList2.add(new rd(i6, i14, obj3));
            while (!agVar.isEmpty() && i14 == ((rd) agVar.last()).c) {
                agVar.removeLast();
            }
            i6 = i14;
        }
        if (i6 < str2.length()) {
            arrayList2.add(new rd(i6, str2.length(), vw1Var));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new rd(0, 0, vw1Var));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i15 = i;
        while (i15 < size2) {
            rd rdVar5 = (rd) arrayList2.get(i15);
            int i16 = rdVar5.b;
            int i17 = rdVar5.c;
            String strSubstring = i16 != i17 ? str2.substring(i16, i17) : "";
            List listA = td.a(sdVar2, i16, i17, new w(4));
            sd sdVar4 = new sd(strSubstring, listA == null ? be0Var4 : listA);
            vw1 vw1Var2 = (vw1) rdVar5.a;
            if (vw1Var2.b == 0) {
                str = str2;
                i2 = size2;
                vw1Var2 = new vw1(vw1Var2.a, vw1Var.b, vw1Var2.c, vw1Var2.d, vw1Var2.e, vw1Var2.f, vw1Var2.g, vw1Var2.h, vw1Var2.i);
            } else {
                str = str2;
                i2 = size2;
            }
            m13 m13Var3 = new m13(m13Var2.a, vw1Var.a(vw1Var2));
            List list5 = sdVar4.h;
            List list6 = list5 == null ? be0Var4 : list5;
            List list7 = (List) this.b;
            ArrayList arrayList4 = new ArrayList(list7.size());
            int size3 = list7.size();
            int i18 = 0;
            while (i18 < size3) {
                rd rdVar6 = (rd) list7.get(i18);
                int i19 = rdVar6.b;
                vw1 vw1Var3 = vw1Var;
                int i20 = rdVar6.c;
                if (td.b(i16, i17, i19, i20)) {
                    if (i16 > i19 || i20 > i17) {
                        lz0.a("placeholder can not overlap with paragraph.");
                    }
                    list2 = list7;
                    arrayList4.add(new rd(i19 - i16, i20 - i16, rdVar6.a));
                } else {
                    list2 = list7;
                }
                i18++;
                list7 = list2;
                vw1Var = vw1Var3;
            }
            arrayList3.add(new sw1(new x9(strSubstring, m13Var3, list6, arrayList4, xl0Var, e70Var), i16, i17));
            i15++;
            sdVar2 = sdVar;
            m13Var2 = m13Var;
            str2 = str;
            size2 = i2;
        }
        this.e = arrayList3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.tw1
    public float a() {
        return ((Number) ((j71) this.c).getValue()).floatValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.tw1
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((sw1) arrayList.get(i)).a.b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.tw1
    public float c() {
        return ((Number) ((j71) this.d).getValue()).floatValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public np d(bj bjVar, xm0 xm0Var) {
        int i;
        int i2;
        int i3;
        a72 a72Var = new a72();
        a72Var.h = -1;
        synchronized (this.a) {
            Throwable th = (Throwable) this.b;
            if (th != null) {
                bjVar.b(th);
                return sn.A;
            }
            xg xgVar = (xg) this.c;
            do {
                i = xgVar.get();
                i2 = i + 1;
            } while (!xgVar.compareAndSet(i, i2));
            boolean z = (134217727 & i2) == 1;
            a72Var.h = (i2 >>> 27) & 15;
            ((lk1) this.d).a(bjVar);
            if (z && xm0Var != null) {
                try {
                    xm0Var.a();
                } catch (Throwable th2) {
                    synchronized (this.a) {
                        try {
                            if (((Throwable) this.b) == null) {
                                this.b = th2;
                                lk1 lk1Var = (lk1) this.d;
                                Object[] objArr = lk1Var.a;
                                int i4 = lk1Var.b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    ((bj) objArr[i5]).b(th2);
                                }
                                ((lk1) this.d).d();
                                xg xgVar2 = (xg) this.c;
                                do {
                                    i3 = xgVar2.get();
                                } while (!xgVar2.compareAndSet(i3, ((((i3 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new dq1(new s1(bjVar, this, a72Var, 3));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bidi e(int i) {
        Bidi bidi;
        Layout layout = (Layout) this.a;
        ArrayList arrayList = (ArrayList) this.b;
        ArrayList arrayList2 = (ArrayList) this.c;
        boolean[] zArr = (boolean[]) this.d;
        if (zArr[i]) {
            return (Bidi) arrayList2.get(i);
        }
        int iIntValue = i == 0 ? 0 : ((Number) arrayList.get(i - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i)).intValue();
        int i2 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.e;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(k(i))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.e;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.e = cArr2;
        return bidi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yo f(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.e;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            yo yoVarA = ((xo) list.get(i)).a(type, annotationArr);
            if (yoVarA != null) {
                return yoVarA;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((xo) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void g(in0 in0Var) {
        int i;
        synchronized (this.a) {
            try {
                lk1 lk1Var = (lk1) this.d;
                this.d = (lk1) this.e;
                this.e = lk1Var;
                xg xgVar = (xg) this.c;
                do {
                    i = xgVar.get();
                } while (!xgVar.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = lk1Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    in0Var.j(lk1Var.f(i3));
                }
                lk1Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float h(int i, boolean z) {
        Layout layout = (Layout) this.a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float i(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.a;
        if (!z2) {
            return h(i, z);
        }
        int iV = up0.v(layout, i, z2);
        int lineStart = layout.getLineStart(iV);
        int lineEnd = layout.getLineEnd(iV);
        if (i != lineStart && i != lineEnd) {
            return h(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return h(i, z);
        }
        int iJ = j(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(k(iJ))) == -1;
        int iM = m(lineEnd, lineStart);
        int iK = k(iJ);
        int i4 = lineStart - iK;
        int i5 = iM - iK;
        Bidi bidiE = e(iJ);
        Bidi bidiCreateLineBidi = bidiE != null ? bidiE.createLineBidi(i4, i5) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == zIsRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(iV) : layout.getLineRight(iV);
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
                if (f61VarArr[i8].a == i) {
                    i3 = i8;
                    break;
                }
                i8++;
            }
            boolean z4 = (z || z3 == f61VarArr[i3].c) ? !z3 : z3;
            return (i3 == 0 && z4) ? layout.getLineLeft(iV) : (i3 != runCount - 1 || z4) ? z4 ? layout.getPrimaryHorizontal(f61VarArr[i3 - 1].a) : layout.getPrimaryHorizontal(f61VarArr[i3 + 1].a) : layout.getLineRight(iV);
        }
        int iM2 = i > iM ? m(i, lineStart) : i;
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                i2 = -1;
                break;
            }
            if (f61VarArr[i9].b == iM2) {
                i2 = i9;
                break;
            }
            i9++;
        }
        boolean z5 = (z || z3 == f61VarArr[i2].c) ? z3 : !z3;
        return (i2 == 0 && z5) ? layout.getLineLeft(iV) : (i2 != runCount - 1 || z5) ? z5 ? layout.getPrimaryHorizontal(f61VarArr[i2 - 1].b) : layout.getPrimaryHorizontal(f61VarArr[i2 + 1].b) : layout.getLineRight(iV);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int j(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.b;
        int iY = eu.y(arrayList, Integer.valueOf(i));
        int i2 = iY < 0 ? -(iY + 1) : iY + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int k(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.b).get(i - 1)).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void l(String str, String str2) {
        str2.getClass();
        ye0 ye0Var = (ye0) this.c;
        ye0Var.getClass();
        n93.c(str);
        n93.d(str2, str);
        ye0Var.n(str);
        n93.a(ye0Var, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int m(int i, int i2) {
        while (i > i2) {
            char cCharAt = ((Layout) this.a).getText().charAt(i - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((t11.o(cCharAt, 8192) < 0 || t11.o(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void n(String str, o82 o82Var) {
        str.getClass();
        if (str.length() <= 0) {
            s.j("method.isEmpty() == true");
            return;
        }
        if (o82Var == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                s.c(vi0.j("method ", str, " must have a request body."));
                return;
            }
        } else if (!fg1.I(str)) {
            s.c(vi0.j("method ", str, " must not have a request body."));
            return;
        }
        this.b = str;
        this.d = o82Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x00 o(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = (List) this.d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            x00 x00VarA = ((w00) list.get(i)).a(type);
            if (x00VarA != null) {
                return x00VarA;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x00 p(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i = iIndexOf; i < size; i++) {
            x00 x00VarB = ((w00) list.get(i)).b(type, annotationArr, this);
            if (x00VarB != null) {
                return x00VarB;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void q(String str, Object obj) {
        str.getClass();
        ((LinkedHashMap) this.a).put(str, obj);
        ju2 ju2Var = (ju2) ((LinkedHashMap) this.c).get(str);
        if (ju2Var != null) {
            ju2Var.g(obj);
        }
        ju2 ju2Var2 = (ju2) ((LinkedHashMap) this.d).get(str);
        if (ju2Var2 != null) {
            ju2Var2.g(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void r(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = (List) this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((w00) list.get(i)).getClass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void s(String str) {
        if (wv2.d0(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (wv2.d0(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        xw0 xw0Var = new xw0();
        xw0Var.e(null, str);
        this.a = xw0Var.b();
    }

    public cj(int i) {
        switch (i) {
            case 4:
                this.e = ie0.n;
                this.b = "GET";
                this.c = new ye0(1);
                break;
            default:
                this.a = new Object();
                this.c = new xg(0);
                this.d = new lk1();
                this.e = new lk1();
                break;
        }
    }

    public cj(Map map) {
        map.getClass();
        this.a = new LinkedHashMap(map);
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new uv(2, this);
    }
}
