package p014C1;

import android.text.Layout;
import com.bumptech.glide.AbstractC1922d;
import com.bumptech.glide.AbstractC1923e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.text.Bidi;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p000A.C0038T0;
import p011B4.AbstractC0231b;
import p014C1.C0240b;
import p016C3.C0244a;
import p027E4.AbstractC0319f;
import p027E4.AbstractC0326m;
import p027E4.C0307V;
import p027E4.InterfaceC0320g;
import p027E4.InterfaceC0327n;
import p049I2.AbstractC0797o;
import p056K2.EnumC0880f;
import p061L2.AbstractC0973m;
import p061L2.C0971k;
import p061L2.C0981u;
import p081Q.C1160c;
import p092S0.AbstractC1270h;
import p092S0.C1260M;
import p092S0.C1267e;
import p092S0.C1268f;
import p092S0.C1269g;
import p092S0.C1280r;
import p092S0.C1282t;
import p092S0.InterfaceC1281s;
import p095T.C1357e;
import p095T.InterfaceC1359f;
import p096T0.AbstractC1407g;
import p096T0.C1404d;
import p110W0.InterfaceC1580e;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p117X2.C1673r;
import p118X3.AbstractC1682D;
import p118X3.C1706p;
import p118X3.C1708r;
import p120Y0.AbstractC1732a;
import p121Y1.C1753n;
import p123Y3.C1770a;
import p130a1.C1791d;
import p136b0.AbstractC1840b;
import p136b0.C1839a;
import p149d3.AbstractC1983k;
import p153e1.InterfaceC2007c;
import p178i3.C2318C;
import p178i3.InterfaceC2334o;
import p179i4.AbstractC2352g;
import p184j3.AbstractC2384c;
import p186k.C2404A;

/* JADX INFO: renamed from: C1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0240b implements InterfaceC1281s {

    /* JADX INFO: renamed from: a */
    public Object f808a;

    /* JADX INFO: renamed from: b */
    public Object f809b;

    /* JADX INFO: renamed from: c */
    public Object f810c;

    /* JADX INFO: renamed from: d */
    public Object f811d;

    /* JADX INFO: renamed from: e */
    public Object f812e;

    public C0240b(Map map) {
        AbstractC1665j.m2985e(map, "initialState");
        this.f808a = new LinkedHashMap(map);
        this.f809b = new LinkedHashMap();
        this.f810c = new LinkedHashMap();
        this.f811d = new LinkedHashMap();
        this.f812e = new C0239a(0, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [K2.e, java.lang.Object] */
    @Override // p092S0.InterfaceC1281s
    /* JADX INFO: renamed from: a */
    public float mo424a() {
        return ((Number) this.f810c.getValue()).floatValue();
    }

    @Override // p092S0.InterfaceC1281s
    /* JADX INFO: renamed from: b */
    public boolean mo425b() {
        ArrayList arrayList = (ArrayList) this.f812e;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (((C1280r) arrayList.get(i5)).f4602a.mo425b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [K2.e, java.lang.Object] */
    @Override // p092S0.InterfaceC1281s
    /* JADX INFO: renamed from: c */
    public float mo426c() {
        return ((Number) this.f811d.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC1359f m427d(AbstractC1840b abstractC1840b, InterfaceC1599a interfaceC1599a) {
        int i5;
        int i6;
        int i7;
        C1673r c1673r = new C1673r();
        c1673r.f5707d = -1;
        synchronized (this.f808a) {
            Throwable th = (Throwable) this.f809b;
            if (th != null) {
                abstractC1840b.mo2501b(th);
                return C1357e.f4793e;
            }
            C1839a c1839a = (C1839a) this.f810c;
            do {
                i5 = c1839a.get();
                i6 = i5 + 1;
            } while (!c1839a.compareAndSet(i5, i6));
            boolean z5 = (134217727 & i6) == 1;
            c1673r.f5707d = (i6 >>> 27) & 15;
            ((C2404A) this.f811d).m4243a(abstractC1840b);
            if (z5 && interfaceC1599a != null) {
                try {
                    interfaceC1599a.mo6a();
                } catch (Throwable th2) {
                    synchronized (this.f808a) {
                        try {
                            if (((Throwable) this.f809b) == null) {
                                this.f809b = th2;
                                C2404A c2404a = (C2404A) this.f811d;
                                Object[] objArr = c2404a.f7766a;
                                int i8 = c2404a.f7767b;
                                for (int i9 = 0; i9 < i8; i9++) {
                                    ((AbstractC1840b) objArr[i9]).mo2501b(th2);
                                }
                                ((C2404A) this.f811d).m4246d();
                                C1839a c1839a2 = (C1839a) this.f810c;
                                do {
                                    i7 = c1839a2.get();
                                } while (!c1839a2.compareAndSet(i7, ((((i7 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return new C0038T0(new C0244a(abstractC1840b, this, c1673r, 6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.text.Bidi m428e(int r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f808a
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.Object r1 = r14.f809b
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r14.f810c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r14.f811d
            boolean[] r3 = (boolean[]) r3
            boolean r4 = r3[r15]
            if (r4 == 0) goto L1b
            java.lang.Object r15 = r2.get(r15)
            java.text.Bidi r15 = (java.text.Bidi) r15
            return r15
        L1b:
            r4 = 0
            if (r15 != 0) goto L20
            r5 = r4
            goto L2c
        L20:
            int r5 = r15 + (-1)
            java.lang.Object r5 = r1.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L2c:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r11 = r1 - r5
            java.lang.Object r6 = r14.f812e
            char[] r6 = (char[]) r6
            if (r6 == 0) goto L44
            int r7 = r6.length
            if (r7 >= r11) goto L42
            goto L44
        L42:
            r7 = r6
            goto L47
        L44:
            char[] r6 = new char[r11]
            goto L42
        L47:
            java.lang.CharSequence r6 = r0.getText()
            android.text.TextUtils.getChars(r6, r5, r1, r7, r4)
            boolean r1 = java.text.Bidi.requiresBidi(r7, r4, r11)
            r5 = 0
            r13 = 1
            if (r1 == 0) goto L76
            int r1 = r14.m435l(r15)
            int r1 = r0.getLineForOffset(r1)
            int r0 = r0.getParagraphDirection(r1)
            r1 = -1
            if (r0 != r1) goto L67
            r12 = r13
            goto L68
        L67:
            r12 = r4
        L68:
            java.text.Bidi r6 = new java.text.Bidi
            r9 = 0
            r10 = 0
            r8 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r13) goto L77
        L76:
            r6 = r5
        L77:
            r2.set(r15, r6)
            r3[r15] = r13
            if (r6 == 0) goto L87
            java.lang.Object r15 = r14.f812e
            char[] r15 = (char[]) r15
            if (r7 != r15) goto L86
            r7 = r5
            goto L87
        L86:
            r7 = r15
        L87:
            r14.f812e = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p014C1.C0240b.m428e(int):java.text.Bidi");
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC0320g m429f(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f812e;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i5 = iIndexOf; i5 < size; i5++) {
            InterfaceC0320g interfaceC0320gMo551a = ((AbstractC0319f) list.get(i5)).mo551a(type, annotationArr);
            if (interfaceC0320gMo551a != null) {
                return interfaceC0320gMo551a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC0319f) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: g */
    public Object m430g(Class cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C0307V(this, cls));
    }

    /* JADX INFO: renamed from: h */
    public void m431h(InterfaceC1601c interfaceC1601c) {
        int i5;
        synchronized (this.f808a) {
            try {
                C2404A c2404a = (C2404A) this.f811d;
                this.f811d = (C2404A) this.f812e;
                this.f812e = c2404a;
                C1839a c1839a = (C1839a) this.f810c;
                do {
                    i5 = c1839a.get();
                } while (!c1839a.compareAndSet(i5, ((((i5 >>> 27) & 15) + 1) & 15) << 27));
                int i6 = c2404a.f7767b;
                for (int i7 = 0; i7 < i6; i7++) {
                    interfaceC1601c.mo1h(c2404a.m4248f(i7));
                }
                c2404a.m4246d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public float m432i(int i5, boolean z5) {
        Layout layout = (Layout) this.f808a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i5));
        if (i5 > lineEnd) {
            i5 = lineEnd;
        }
        return z5 ? layout.getPrimaryHorizontal(i5) : layout.getSecondaryHorizontal(i5);
    }

    /* JADX INFO: renamed from: j */
    public float m433j(int i5, boolean z5, boolean z6) {
        int i6;
        int i7;
        int iM437n = i5;
        Layout layout = (Layout) this.f808a;
        if (!z6) {
            return m432i(i5, z5);
        }
        int iM2701d = AbstractC1407g.m2701d(layout, iM437n, z6);
        int lineStart = layout.getLineStart(iM2701d);
        int lineEnd = layout.getLineEnd(iM2701d);
        if (iM437n != lineStart && iM437n != lineEnd) {
            return m432i(i5, z5);
        }
        if (iM437n == 0 || iM437n == layout.getText().length()) {
            return m432i(i5, z5);
        }
        int iM434k = m434k(iM437n, z6);
        boolean z7 = layout.getParagraphDirection(layout.getLineForOffset(m435l(iM434k))) == -1;
        int iM437n2 = m437n(lineEnd, lineStart);
        int iM435l = m435l(iM434k);
        int i8 = lineStart - iM435l;
        int i9 = iM437n2 - iM435l;
        Bidi bidiM428e = m428e(iM434k);
        Bidi bidiCreateLineBidi = bidiM428e != null ? bidiM428e.createLineBidi(i8, i9) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z5 || z7 == zIsRtlCharAt) {
                z7 = !z7;
            }
            return iM437n == lineStart ? z7 : !z7 ? layout.getLineLeft(iM2701d) : layout.getLineRight(iM2701d);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        C1404d[] c1404dArr = new C1404d[runCount];
        for (int i10 = 0; i10 < runCount; i10++) {
            c1404dArr[i10] = new C1404d(bidiCreateLineBidi.getRunStart(i10) + lineStart, bidiCreateLineBidi.getRunLimit(i10) + lineStart, bidiCreateLineBidi.getRunLevel(i10) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i11 = 0; i11 < runCount2; i11++) {
            bArr[i11] = (byte) bidiCreateLineBidi.getRunLevel(i11);
        }
        Bidi.reorderVisually(bArr, 0, c1404dArr, 0, runCount);
        if (iM437n == lineStart) {
            int i12 = 0;
            while (true) {
                if (i12 >= runCount) {
                    i7 = -1;
                    break;
                }
                if (c1404dArr[i12].f5025a == iM437n) {
                    i7 = i12;
                    break;
                }
                i12++;
            }
            boolean z8 = (z5 || z7 == c1404dArr[i7].f5027c) ? !z7 : z7;
            return (i7 == 0 && z8) ? layout.getLineLeft(iM2701d) : (i7 != runCount - 1 || z8) ? z8 ? layout.getPrimaryHorizontal(c1404dArr[i7 - 1].f5025a) : layout.getPrimaryHorizontal(c1404dArr[i7 + 1].f5025a) : layout.getLineRight(iM2701d);
        }
        if (iM437n > iM437n2) {
            iM437n = m437n(iM437n, lineStart);
        }
        int i13 = 0;
        while (true) {
            if (i13 >= runCount) {
                i6 = -1;
                break;
            }
            if (c1404dArr[i13].f5026b == iM437n) {
                i6 = i13;
                break;
            }
            i13++;
        }
        boolean z9 = (z5 || z7 == c1404dArr[i6].f5027c) ? z7 : !z7;
        return (i6 == 0 && z9) ? layout.getLineLeft(iM2701d) : (i6 != runCount - 1 || z9) ? z9 ? layout.getPrimaryHorizontal(c1404dArr[i6 - 1].f5026b) : layout.getPrimaryHorizontal(c1404dArr[i6 + 1].f5026b) : layout.getLineRight(iM2701d);
    }

    /* JADX INFO: renamed from: k */
    public int m434k(int i5, boolean z5) {
        ArrayList arrayList = (ArrayList) this.f809b;
        int iM4198k = AbstractC2352g.m4198k(arrayList, Integer.valueOf(i5));
        int i6 = iM4198k < 0 ? -(iM4198k + 1) : iM4198k + 1;
        if (z5 && i6 > 0) {
            int i7 = i6 - 1;
            if (i5 == ((Number) arrayList.get(i7)).intValue()) {
                return i7;
            }
        }
        return i6;
    }

    /* JADX INFO: renamed from: l */
    public int m435l(int i5) {
        if (i5 == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f809b).get(i5 - 1)).intValue();
    }

    /* JADX INFO: renamed from: m */
    public void m436m(String str, String str2) {
        AbstractC1665j.m2985e(str2, "value");
        C1706p c1706p = (C1706p) this.f810c;
        c1706p.getClass();
        AbstractC1923e.m3446E(str);
        AbstractC1923e.m3447F(str2, str);
        c1706p.m3036o(str);
        AbstractC1923e.m3477o(c1706p, str, str2);
    }

    /* JADX INFO: renamed from: n */
    public int m437n(int i5, int i6) {
        while (i5 > i6) {
            char cCharAt = ((Layout) this.f808a).getText().charAt(i5 - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((AbstractC1665j.m2987g(cCharAt, 8192) < 0 || AbstractC1665j.m2987g(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i5;
            }
            i5--;
        }
        return i5;
    }

    /* JADX INFO: renamed from: o */
    public void m438o(String str, AbstractC1682D abstractC1682D) {
        AbstractC1665j.m2985e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (abstractC1682D == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                throw new IllegalArgumentException(AbstractC0231b.m400k("method ", str, " must have a request body.").toString());
            }
        } else if (!AbstractC1922d.m3442z(str)) {
            throw new IllegalArgumentException(AbstractC0231b.m400k("method ", str, " must not have a request body.").toString());
        }
        this.f809b = str;
        this.f811d = abstractC1682D;
    }

    /* JADX INFO: renamed from: p */
    public InterfaceC0327n m439p(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        List list = (List) this.f811d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i5 = iIndexOf; i5 < size; i5++) {
            InterfaceC0327n interfaceC0327nMo549a = ((AbstractC0326m) list.get(i5)).mo549a(type);
            if (interfaceC0327nMo549a != null) {
                return interfaceC0327nMo549a;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC0326m) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: q */
    public InterfaceC0327n m440q(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        List list = (List) this.f811d;
        int iIndexOf = list.indexOf(null) + 1;
        int size = list.size();
        for (int i5 = iIndexOf; i5 < size; i5++) {
            InterfaceC0327n interfaceC0327nMo550b = ((AbstractC0326m) list.get(i5)).mo550b(type, annotationArr, this);
            if (interfaceC0327nMo550b != null) {
                return interfaceC0327nMo550b;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n  Tried:");
        int size2 = list.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(((AbstractC0326m) list.get(iIndexOf)).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: r */
    public void m441r(Object obj, String str) {
        C1753n c1753n = AbstractC2384c.f7730b;
        AbstractC1665j.m2985e(str, "key");
        ((LinkedHashMap) this.f808a).put(str, obj);
        InterfaceC2334o interfaceC2334o = (InterfaceC2334o) ((LinkedHashMap) this.f810c).get(str);
        if (interfaceC2334o != null) {
            ((C2318C) interfaceC2334o).m4147g(null, obj == null ? c1753n : obj);
        }
        InterfaceC2334o interfaceC2334o2 = (InterfaceC2334o) ((LinkedHashMap) this.f811d).get(str);
        if (interfaceC2334o2 != null) {
            C2318C c2318c = (C2318C) interfaceC2334o2;
            if (obj == null) {
                obj = c1753n;
            }
            c2318c.m4147g(null, obj);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m442s(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        List list = (List) this.f811d;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((AbstractC0326m) list.get(i5)).getClass();
        }
    }

    /* JADX INFO: renamed from: t */
    public void m443t(String str) {
        AbstractC1665j.m2985e(str, "url");
        if (AbstractC1983k.m3656S(str, "ws:", true)) {
            String strSubstring = str.substring(3);
            AbstractC1665j.m2984d(strSubstring, "substring(...)");
            str = "http:".concat(strSubstring);
        } else if (AbstractC1983k.m3656S(str, "wss:", true)) {
            String strSubstring2 = str.substring(4);
            AbstractC1665j.m2984d(strSubstring2, "substring(...)");
            str = "https:".concat(strSubstring2);
        }
        AbstractC1665j.m2985e(str, "<this>");
        C1708r c1708r = new C1708r();
        c1708r.m3045c(null, str);
        this.f808a = c1708r.m3043a();
    }

    public C0240b(C1269g c1269g, C1260M c1260m, List list, InterfaceC2007c interfaceC2007c, InterfaceC1580e interfaceC1580e) {
        int i5;
        String strSubstring;
        ArrayList arrayList;
        String str;
        List list2;
        C1269g c1269g2 = c1269g;
        C1260M c1260m2 = c1260m;
        this.f808a = c1269g2;
        this.f809b = list;
        final int i6 = 0;
        InterfaceC1599a interfaceC1599a = new InterfaceC1599a(this) { // from class: S0.p

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ C0240b f4594e;

            {
                this.f4594e = this;
            }

            @Override // p112W2.InterfaceC1599a
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                Object obj;
                Object obj2;
                switch (i6) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.f4594e.f812e;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float fMo424a = ((C1280r) obj3).f4602a.mo424a();
                            int iM4208u = AbstractC2352g.m4208u(arrayList2);
                            int i7 = 1;
                            if (1 <= iM4208u) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i7);
                                    float fMo424a2 = ((C1280r) obj4).f4602a.mo424a();
                                    if (Float.compare(fMo424a, fMo424a2) < 0) {
                                        obj3 = obj4;
                                        fMo424a = fMo424a2;
                                    }
                                    if (i7 != iM4208u) {
                                        i7++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        C1280r c1280r = (C1280r) obj;
                        return Float.valueOf(c1280r != null ? c1280r.f4602a.mo424a() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.f4594e.f812e;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float fM2693c = ((C1280r) obj5).f4602a.f6115i.m2693c();
                            int iM4208u2 = AbstractC2352g.m4208u(arrayList3);
                            int i8 = 1;
                            if (1 <= iM4208u2) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i8);
                                    float fM2693c2 = ((C1280r) obj6).f4602a.f6115i.m2693c();
                                    if (Float.compare(fM2693c, fM2693c2) < 0) {
                                        obj5 = obj6;
                                        fM2693c = fM2693c2;
                                    }
                                    if (i8 != iM4208u2) {
                                        i8++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        C1280r c1280r2 = (C1280r) obj2;
                        return Float.valueOf(c1280r2 != null ? c1280r2.f4602a.f6115i.m2693c() : 0.0f);
                }
            }
        };
        EnumC0880f enumC0880f = EnumC0880f.f2767e;
        this.f810c = AbstractC0797o.m1395t(enumC0880f, interfaceC1599a);
        final int i7 = 1;
        this.f811d = AbstractC0797o.m1395t(enumC0880f, new InterfaceC1599a(this) { // from class: S0.p

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ C0240b f4594e;

            {
                this.f4594e = this;
            }

            @Override // p112W2.InterfaceC1599a
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                Object obj;
                Object obj2;
                switch (i7) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.f4594e.f812e;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float fMo424a = ((C1280r) obj3).f4602a.mo424a();
                            int iM4208u = AbstractC2352g.m4208u(arrayList2);
                            int i72 = 1;
                            if (1 <= iM4208u) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i72);
                                    float fMo424a2 = ((C1280r) obj4).f4602a.mo424a();
                                    if (Float.compare(fMo424a, fMo424a2) < 0) {
                                        obj3 = obj4;
                                        fMo424a = fMo424a2;
                                    }
                                    if (i72 != iM4208u) {
                                        i72++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        C1280r c1280r = (C1280r) obj;
                        return Float.valueOf(c1280r != null ? c1280r.f4602a.mo424a() : 0.0f);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.f4594e.f812e;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float fM2693c = ((C1280r) obj5).f4602a.f6115i.m2693c();
                            int iM4208u2 = AbstractC2352g.m4208u(arrayList3);
                            int i8 = 1;
                            if (1 <= iM4208u2) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i8);
                                    float fM2693c2 = ((C1280r) obj6).f4602a.f6115i.m2693c();
                                    if (Float.compare(fM2693c, fM2693c2) < 0) {
                                        obj5 = obj6;
                                        fM2693c = fM2693c2;
                                    }
                                    if (i8 != iM4208u2) {
                                        i8++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        C1280r c1280r2 = (C1280r) obj2;
                        return Float.valueOf(c1280r2 != null ? c1280r2.f4602a.f6115i.m2693c() : 0.0f);
                }
            }
        });
        C1282t c1282t = c1260m2.f4541b;
        C1269g c1269g3 = AbstractC1270h.f4566a;
        ArrayList arrayList2 = c1269g2.f4565g;
        String str2 = c1269g2.f4563e;
        C0981u c0981u = C0981u.f3047d;
        List listM2021b0 = arrayList2 != null ? AbstractC0973m.m2021b0(arrayList2, new C1268f(i7)) : c0981u;
        ArrayList arrayList3 = new ArrayList();
        C0971k c0971k = new C0971k();
        int size = listM2021b0.size();
        int i8 = 0;
        int i9 = 0;
        while (i8 < size) {
            C1267e c1267e = (C1267e) listM2021b0.get(i8);
            C1282t c1282tM2375a = c1282t.m2375a((C1282t) c1267e.f4557a);
            int i10 = c1267e.f4558b;
            int i11 = c1267e.f4559c;
            if (i10 > i11) {
                AbstractC1732a.m3085a("Reversed range is not supported");
            }
            while (i9 < i10 && !c0971k.isEmpty()) {
                C1267e c1267e2 = (C1267e) c0971k.last();
                List list3 = listM2021b0;
                int i12 = c1267e2.f4559c;
                C0981u c0981u2 = c0981u;
                Object obj = c1267e2.f4557a;
                if (i10 < i12) {
                    arrayList3.add(new C1267e(i9, i10, obj));
                    i9 = i10;
                    listM2021b0 = list3;
                    c0981u = c0981u2;
                } else {
                    int i13 = size;
                    arrayList3.add(new C1267e(i9, i12, obj));
                    i9 = c1267e2.f4559c;
                    while (!c0971k.isEmpty() && i9 == ((C1267e) c0971k.last()).f4559c) {
                        c0971k.removeLast();
                    }
                    listM2021b0 = list3;
                    c0981u = c0981u2;
                    size = i13;
                }
            }
            List list4 = listM2021b0;
            C0981u c0981u3 = c0981u;
            int i14 = size;
            if (i9 < i10) {
                arrayList3.add(new C1267e(i9, i10, c1282t));
                i9 = i10;
            }
            C1267e c1267e3 = (C1267e) c0971k.m1982f();
            if (c1267e3 != null) {
                int i15 = c1267e3.f4559c;
                Object obj2 = c1267e3.f4557a;
                int i16 = c1267e3.f4558b;
                if (i16 == i10 && i15 == i11) {
                    c0971k.removeLast();
                    c0971k.addLast(new C1267e(i10, i11, ((C1282t) obj2).m2375a(c1282tM2375a)));
                } else if (i16 == i15) {
                    arrayList3.add(new C1267e(i16, i15, obj2));
                    c0971k.removeLast();
                    c0971k.addLast(new C1267e(i10, i11, c1282tM2375a));
                } else if (i15 >= i11) {
                    c0971k.addLast(new C1267e(i10, i11, ((C1282t) obj2).m2375a(c1282tM2375a)));
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                c0971k.addLast(new C1267e(i10, i11, c1282tM2375a));
            }
            i8++;
            listM2021b0 = list4;
            c0981u = c0981u3;
            size = i14;
        }
        C0981u c0981u4 = c0981u;
        while (i9 <= str2.length() && !c0971k.isEmpty()) {
            C1267e c1267e4 = (C1267e) c0971k.last();
            Object obj3 = c1267e4.f4557a;
            int i17 = c1267e4.f4559c;
            arrayList3.add(new C1267e(i9, i17, obj3));
            while (!c0971k.isEmpty() && i17 == ((C1267e) c0971k.last()).f4559c) {
                c0971k.removeLast();
            }
            i9 = i17;
        }
        if (i9 < str2.length()) {
            arrayList3.add(new C1267e(i9, str2.length(), c1282t));
        }
        if (arrayList3.isEmpty()) {
            i5 = 0;
            arrayList3.add(new C1267e(0, 0, c1282t));
        } else {
            i5 = 0;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i18 = i5;
        while (i18 < size2) {
            C1267e c1267e5 = (C1267e) arrayList3.get(i18);
            int i19 = c1267e5.f4558b;
            int i20 = c1267e5.f4559c;
            if (i19 != i20) {
                strSubstring = str2.substring(i19, i20);
                AbstractC1665j.m2984d(strSubstring, "substring(...)");
            } else {
                strSubstring = "";
            }
            List listM2356a = AbstractC1270h.m2356a(c1269g2, i19, i20, new C1160c(3));
            C1269g c1269g4 = new C1269g(strSubstring, listM2356a == null ? c0981u4 : listM2356a);
            C1282t c1282t2 = (C1282t) c1267e5.f4557a;
            if (c1282t2.f4606b == 0) {
                arrayList = arrayList3;
                str = str2;
                c1282t2 = new C1282t(c1282t2.f4605a, c1282t.f4606b, c1282t2.f4607c, c1282t2.f4608d, c1282t2.f4609e, c1282t2.f4610f, c1282t2.f4611g, c1282t2.f4612h, c1282t2.f4613i);
            } else {
                arrayList = arrayList3;
                str = str2;
            }
            C1260M c1260m3 = new C1260M(c1260m2.f4540a, c1282t.m2375a(c1282t2));
            List list5 = c1269g4.f4562d;
            List list6 = list5 == null ? c0981u4 : list5;
            List list7 = (List) this.f809b;
            ArrayList arrayList5 = new ArrayList(list7.size());
            int size3 = list7.size();
            int i21 = 0;
            while (i21 < size3) {
                C1267e c1267e6 = (C1267e) list7.get(i21);
                int i22 = c1267e6.f4558b;
                C1282t c1282t3 = c1282t;
                int i23 = c1267e6.f4559c;
                if (AbstractC1270h.m2357b(i19, i20, i22, i23)) {
                    if (i19 > i22 || i23 > i20) {
                        AbstractC1732a.m3085a("placeholder can not overlap with paragraph.");
                    }
                    list2 = list7;
                    arrayList5.add(new C1267e(i22 - i19, i23 - i19, c1267e6.f4557a));
                } else {
                    list2 = list7;
                }
                i21++;
                list7 = list2;
                c1282t = c1282t3;
            }
            arrayList4.add(new C1280r(new C1791d(strSubstring, c1260m3, list6, arrayList5, interfaceC1580e, interfaceC2007c), i19, i20));
            i18++;
            c1269g2 = c1269g;
            c1260m2 = c1260m;
            str2 = str;
            arrayList3 = arrayList;
        }
        this.f812e = arrayList4;
    }

    public C0240b(int i5) {
        switch (i5) {
            case 5:
                this.f808a = new Object();
                this.f810c = new C1839a(0);
                this.f811d = new C2404A();
                this.f812e = new C2404A();
                break;
            default:
                this.f812e = C1770a.f6065h;
                this.f809b = "GET";
                this.f810c = new C1706p(0);
                break;
        }
    }
}
