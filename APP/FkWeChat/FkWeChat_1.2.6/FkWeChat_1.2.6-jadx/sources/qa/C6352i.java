package qa;

import bsh.C1193i2;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p376zd.C9987e;
import qa.AbstractC6354k;
import qa.AbstractC6369z;
import qa.InterfaceC6360q;

/* JADX INFO: renamed from: qa.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6352i {

    /* JADX INFO: renamed from: d */
    public static final C6352i f19995d = new C6352i(true);

    /* JADX INFO: renamed from: b */
    public boolean f19997b;

    /* JADX INFO: renamed from: c */
    public boolean f19998c = false;

    /* JADX INFO: renamed from: a */
    public final AbstractC6365v f19996a = AbstractC6365v.m25296p(16);

    /* JADX INFO: renamed from: qa.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19999a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f20000b;

        static {
            int[] iArr = new int[AbstractC6369z.b.values().length];
            f20000b = iArr;
            try {
                iArr[AbstractC6369z.b.f20083s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20000b[AbstractC6369z.b.f20084t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20000b[AbstractC6369z.b.f20085u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20000b[AbstractC6369z.b.f20086v.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20000b[AbstractC6369z.b.f20087w.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20000b[AbstractC6369z.b.f20088x.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20000b[AbstractC6369z.b.f20089y.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20000b[AbstractC6369z.b.f20090z.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20000b[AbstractC6369z.b.f20072A.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20000b[AbstractC6369z.b.f20075D.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f20000b[AbstractC6369z.b.f20076E.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f20000b[AbstractC6369z.b.f20078G.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f20000b[AbstractC6369z.b.f20079H.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f20000b[AbstractC6369z.b.f20080I.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f20000b[AbstractC6369z.b.f20081J.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f20000b[AbstractC6369z.b.f20073B.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f20000b[AbstractC6369z.b.f20074C.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f20000b[AbstractC6369z.b.f20077F.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[AbstractC6369z.c.values().length];
            f19999a = iArr2;
            try {
                iArr2[AbstractC6369z.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f19999a[AbstractC6369z.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f19999a[AbstractC6369z.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f19999a[AbstractC6369z.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f19999a[AbstractC6369z.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f19999a[AbstractC6369z.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f19999a[AbstractC6369z.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f19999a[AbstractC6369z.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f19999a[AbstractC6369z.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: qa.i$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface b extends Comparable {
        /* JADX INFO: renamed from: b */
        int mo25211b();

        /* JADX INFO: renamed from: d */
        InterfaceC6360q.a mo25212d(InterfaceC6360q.a aVar, InterfaceC6360q interfaceC6360q);

        /* JADX INFO: renamed from: e */
        boolean mo25213e();

        /* JADX INFO: renamed from: f */
        AbstractC6369z.b mo25214f();

        /* JADX INFO: renamed from: o */
        AbstractC6369z.c mo25215o();

        /* JADX INFO: renamed from: q */
        boolean mo25216q();
    }

    public C6352i(boolean z10) {
        m25207q();
    }

    /* JADX INFO: renamed from: d */
    public static int m25185d(AbstractC6369z.b bVar, int i10, Object obj) {
        int iM25106C = C6350g.m25106C(i10);
        if (bVar == AbstractC6369z.b.f20073B) {
            iM25106C *= 2;
        }
        return iM25106C + m25186e(bVar, obj);
    }

    /* JADX INFO: renamed from: e */
    public static int m25186e(AbstractC6369z.b bVar, Object obj) {
        switch (a.f20000b[bVar.ordinal()]) {
            case 1:
                return C6350g.m25118g(((Double) obj).doubleValue());
            case 2:
                return C6350g.m25124m(((Float) obj).floatValue());
            case 3:
                return C6350g.m25128q(((Long) obj).longValue());
            case 4:
                return C6350g.m25108E(((Long) obj).longValue());
            case 5:
                return C6350g.m25127p(((Integer) obj).intValue());
            case 6:
                return C6350g.m25122k(((Long) obj).longValue());
            case 7:
                return C6350g.m25121j(((Integer) obj).intValue());
            case 8:
                return C6350g.m25113b(((Boolean) obj).booleanValue());
            case 9:
                return C6350g.m25105B((String) obj);
            case 10:
                return obj instanceof AbstractC6348e ? C6350g.m25116e((AbstractC6348e) obj) : C6350g.m25114c((byte[]) obj);
            case Opcodes.FCONST_0 /* 11 */:
                return C6350g.m25107D(((Integer) obj).intValue());
            case Opcodes.FCONST_1 /* 12 */:
                return C6350g.m25134w(((Integer) obj).intValue());
            case Opcodes.FCONST_2 /* 13 */:
                return C6350g.m25135x(((Long) obj).longValue());
            case Opcodes.DCONST_0 /* 14 */:
                return C6350g.m25136y(((Integer) obj).intValue());
            case 15:
                return C6350g.m25104A(((Long) obj).longValue());
            case 16:
                return C6350g.m25125n((InterfaceC6360q) obj);
            case Opcodes.SIPUSH /* 17 */:
                return C6350g.m25130s((InterfaceC6360q) obj);
            case Opcodes.LDC /* 18 */:
                return obj instanceof AbstractC6354k.a ? C6350g.m25120i(((AbstractC6354k.a) obj).mo14092b()) : C6350g.m25120i(((Integer) obj).intValue());
            default:
                C1193i2.m4438a("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m25187f(b bVar, Object obj) {
        AbstractC6369z.b bVarMo25214f = bVar.mo25214f();
        int iMo25211b = bVar.mo25211b();
        if (!bVar.mo25213e()) {
            return m25185d(bVarMo25214f, iMo25211b, obj);
        }
        int iM25185d = 0;
        if (bVar.mo25216q()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iM25185d += m25186e(bVarMo25214f, it.next());
            }
            return C6350g.m25106C(iMo25211b) + iM25185d + C6350g.m25132u(iM25185d);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iM25185d += m25185d(bVarMo25214f, iMo25211b, it2.next());
        }
        return iM25185d;
    }

    /* JADX INFO: renamed from: g */
    public static C6352i m25188g() {
        return f19995d;
    }

    /* JADX INFO: renamed from: l */
    public static int m25189l(AbstractC6369z.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.m25337c();
    }

    /* JADX INFO: renamed from: t */
    public static C6352i m25190t() {
        return new C6352i();
    }

    /* JADX INFO: renamed from: u */
    public static Object m25191u(C6349f c6349f, AbstractC6369z.b bVar, boolean z10) {
        switch (a.f20000b[bVar.ordinal()]) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                if (!z10) {
                }
                break;
            case 10:
                break;
            case Opcodes.FCONST_0 /* 11 */:
                break;
            case Opcodes.FCONST_1 /* 12 */:
                break;
            case Opcodes.FCONST_2 /* 13 */:
                break;
            case Opcodes.DCONST_0 /* 14 */:
                break;
            case 15:
                break;
            case 16:
                C9987e.m38645a("readPrimitiveField() cannot handle nested groups.");
                break;
            case Opcodes.SIPUSH /* 17 */:
                C9987e.m38645a("readPrimitiveField() cannot handle embedded messages.");
                break;
            case Opcodes.LDC /* 18 */:
                C9987e.m38645a("readPrimitiveField() cannot handle enums.");
                break;
            default:
                C1193i2.m4438a("There is no way to get here, but the compiler thinks otherwise.");
                break;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m25192w(qa.AbstractC6369z.b r2, java.lang.Object r3) {
        /*
            r3.getClass()
            int[] r0 = qa.C6352i.a.f19999a
            qa.z$c r2 = r2.m25336a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L3c;
                case 2: goto L39;
                case 3: goto L36;
                case 4: goto L33;
                case 5: goto L30;
                case 6: goto L2d;
                case 7: goto L24;
                case 8: goto L18;
                case 9: goto L15;
                default: goto L14;
            }
        L14:
            goto L3e
        L15:
            boolean r1 = r3 instanceof qa.InterfaceC6360q
            goto L3e
        L18:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L22
            boolean r2 = r3 instanceof qa.AbstractC6354k.a
            if (r2 == 0) goto L21
            goto L22
        L21:
            r0 = r1
        L22:
            r1 = r0
            goto L3e
        L24:
            boolean r2 = r3 instanceof qa.AbstractC6348e
            if (r2 != 0) goto L22
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L21
            goto L22
        L2d:
            boolean r1 = r3 instanceof java.lang.String
            goto L3e
        L30:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L3e
        L33:
            boolean r1 = r3 instanceof java.lang.Double
            goto L3e
        L36:
            boolean r1 = r3 instanceof java.lang.Float
            goto L3e
        L39:
            boolean r1 = r3 instanceof java.lang.Long
            goto L3e
        L3c:
            boolean r1 = r3 instanceof java.lang.Integer
        L3e:
            if (r1 == 0) goto L41
            return
        L41:
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            p376zd.C9987e.m38645a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qa.C6352i.m25192w(qa.z$b, java.lang.Object):void");
    }

    /* JADX INFO: renamed from: x */
    public static void m25193x(C6350g c6350g, AbstractC6369z.b bVar, int i10, Object obj) throws IOException {
        if (bVar == AbstractC6369z.b.f20073B) {
            c6350g.m25153X(i10, (InterfaceC6360q) obj);
        } else {
            c6350g.m25177v0(i10, m25189l(bVar, false));
            m25194y(c6350g, bVar, obj);
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m25194y(C6350g c6350g, AbstractC6369z.b bVar, Object obj) throws IOException {
        switch (a.f20000b[bVar.ordinal()]) {
            case 1:
                c6350g.m25146Q(((Double) obj).doubleValue());
                break;
            case 2:
                c6350g.m25152W(((Float) obj).floatValue());
                break;
            case 3:
                c6350g.m25157b0(((Long) obj).longValue());
                break;
            case 4:
                c6350g.m25180y0(((Long) obj).longValue());
                break;
            case 5:
                c6350g.m25156a0(((Integer) obj).intValue());
                break;
            case 6:
                c6350g.m25150U(((Long) obj).longValue());
                break;
            case 7:
                c6350g.m25149T(((Integer) obj).intValue());
                break;
            case 8:
                c6350g.m25141L(((Boolean) obj).booleanValue());
                break;
            case 9:
                c6350g.m25176u0((String) obj);
                break;
            case 10:
                if (!(obj instanceof AbstractC6348e)) {
                    c6350g.m25142M((byte[]) obj);
                } else {
                    c6350g.m25144O((AbstractC6348e) obj);
                }
                break;
            case Opcodes.FCONST_0 /* 11 */:
                c6350g.m25179x0(((Integer) obj).intValue());
                break;
            case Opcodes.FCONST_1 /* 12 */:
                c6350g.m25171p0(((Integer) obj).intValue());
                break;
            case Opcodes.FCONST_2 /* 13 */:
                c6350g.m25172q0(((Long) obj).longValue());
                break;
            case Opcodes.DCONST_0 /* 14 */:
                c6350g.m25173r0(((Integer) obj).intValue());
                break;
            case 15:
                c6350g.m25175t0(((Long) obj).longValue());
                break;
            case 16:
                c6350g.m25154Y((InterfaceC6360q) obj);
                break;
            case Opcodes.SIPUSH /* 17 */:
                c6350g.m25159d0((InterfaceC6360q) obj);
                break;
            case Opcodes.LDC /* 18 */:
                if (!(obj instanceof AbstractC6354k.a)) {
                    c6350g.m25148S(((Integer) obj).intValue());
                } else {
                    c6350g.m25148S(((AbstractC6354k.a) obj).mo14092b());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m25195z(b bVar, Object obj, C6350g c6350g) throws IOException {
        AbstractC6369z.b bVarMo25214f = bVar.mo25214f();
        int iMo25211b = bVar.mo25211b();
        if (!bVar.mo25213e()) {
            m25193x(c6350g, bVarMo25214f, iMo25211b, obj);
            return;
        }
        List list = (List) obj;
        if (!bVar.mo25216q()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m25193x(c6350g, bVarMo25214f, iMo25211b, it.next());
            }
            return;
        }
        c6350g.m25177v0(iMo25211b, 2);
        Iterator it2 = list.iterator();
        int iM25186e = 0;
        while (it2.hasNext()) {
            iM25186e += m25186e(bVarMo25214f, it2.next());
        }
        c6350g.m25169n0(iM25186e);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            m25194y(c6350g, bVarMo25214f, it3.next());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m25196a(b bVar, Object obj) {
        List arrayList;
        if (!bVar.mo25213e()) {
            C9987e.m38645a("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        m25192w(bVar.mo25214f(), obj);
        Object objM25199h = m25199h(bVar);
        if (objM25199h == null) {
            arrayList = new ArrayList();
            this.f19996a.m25306q(bVar, arrayList);
        } else {
            arrayList = (List) objM25199h;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C6352i clone() {
        AbstractC6365v abstractC6365v;
        C6352i c6352iM25190t = m25190t();
        int i10 = 0;
        while (true) {
            int iM25301k = this.f19996a.m25301k();
            abstractC6365v = this.f19996a;
            if (i10 >= iM25301k) {
                break;
            }
            Map.Entry entryM25300j = abstractC6365v.m25300j(i10);
            c6352iM25190t.m25210v((b) entryM25300j.getKey(), entryM25300j.getValue());
            i10++;
        }
        for (Map.Entry entry : abstractC6365v.m25302l()) {
            c6352iM25190t.m25210v((b) entry.getKey(), entry.getValue());
        }
        c6352iM25190t.f19998c = this.f19998c;
        return c6352iM25190t;
    }

    /* JADX INFO: renamed from: c */
    public final Object m25198c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: h */
    public Object m25199h(b bVar) {
        return this.f19996a.get(bVar);
    }

    /* JADX INFO: renamed from: i */
    public Object m25200i(b bVar, int i10) {
        if (!bVar.mo25213e()) {
            C9987e.m38645a("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
        Object objM25199h = m25199h(bVar);
        if (objM25199h != null) {
            return ((List) objM25199h).get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: j */
    public int m25201j(b bVar) {
        if (!bVar.mo25213e()) {
            C9987e.m38645a("getRepeatedField() can only be called on repeated fields.");
            return 0;
        }
        Object objM25199h = m25199h(bVar);
        if (objM25199h == null) {
            return 0;
        }
        return ((List) objM25199h).size();
    }

    /* JADX INFO: renamed from: k */
    public int m25202k() {
        AbstractC6365v abstractC6365v;
        int i10 = 0;
        int iM25187f = 0;
        while (true) {
            int iM25301k = this.f19996a.m25301k();
            abstractC6365v = this.f19996a;
            if (i10 >= iM25301k) {
                break;
            }
            Map.Entry entryM25300j = abstractC6365v.m25300j(i10);
            iM25187f += m25187f((b) entryM25300j.getKey(), entryM25300j.getValue());
            i10++;
        }
        for (Map.Entry entry : abstractC6365v.m25302l()) {
            iM25187f += m25187f((b) entry.getKey(), entry.getValue());
        }
        return iM25187f;
    }

    /* JADX INFO: renamed from: m */
    public boolean m25203m(b bVar) {
        if (!bVar.mo25213e()) {
            return this.f19996a.get(bVar) != null;
        }
        C9987e.m38645a("hasField() can only be called on non-repeated fields.");
        return false;
    }

    /* JADX INFO: renamed from: n */
    public boolean m25204n() {
        int i10 = 0;
        while (true) {
            int iM25301k = this.f19996a.m25301k();
            AbstractC6365v abstractC6365v = this.f19996a;
            if (i10 >= iM25301k) {
                Iterator it = abstractC6365v.m25302l().iterator();
                while (it.hasNext()) {
                    if (!m25205o((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!m25205o(abstractC6365v.m25300j(i10))) {
                return false;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m25205o(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        if (bVar.mo25215o() != AbstractC6369z.c.MESSAGE) {
            return true;
        }
        if (bVar.mo25213e()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!((InterfaceC6360q) it.next()).mo13991a()) {
                    return false;
                }
            }
            return true;
        }
        Object value = entry.getValue();
        if (value instanceof InterfaceC6360q) {
            return ((InterfaceC6360q) value).mo13991a();
        }
        C9987e.m38645a("Wrong object type used with protocol message reflection.");
        return false;
    }

    /* JADX INFO: renamed from: p */
    public Iterator m25206p() {
        boolean z10 = this.f19998c;
        AbstractC6365v abstractC6365v = this.f19996a;
        return z10 ? new C6356m(abstractC6365v.entrySet().iterator()) : abstractC6365v.entrySet().iterator();
    }

    /* JADX INFO: renamed from: q */
    public void m25207q() {
        if (this.f19997b) {
            return;
        }
        this.f19996a.mo25305o();
        this.f19997b = true;
    }

    /* JADX INFO: renamed from: r */
    public void m25208r(C6352i c6352i) {
        AbstractC6365v abstractC6365v;
        int i10 = 0;
        while (true) {
            int iM25301k = c6352i.f19996a.m25301k();
            abstractC6365v = c6352i.f19996a;
            if (i10 >= iM25301k) {
                break;
            }
            m25209s(abstractC6365v.m25300j(i10));
            i10++;
        }
        Iterator it = abstractC6365v.m25302l().iterator();
        while (it.hasNext()) {
            m25209s((Map.Entry) it.next());
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m25209s(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.mo25213e()) {
            Object objM25199h = m25199h(bVar);
            if (objM25199h == null) {
                objM25199h = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objM25199h).add(m25198c(it.next()));
            }
            this.f19996a.m25306q(bVar, objM25199h);
            return;
        }
        if (bVar.mo25215o() != AbstractC6369z.c.MESSAGE) {
            this.f19996a.m25306q(bVar, m25198c(value));
            return;
        }
        Object objM25199h2 = m25199h(bVar);
        if (objM25199h2 == null) {
            this.f19996a.m25306q(bVar, m25198c(value));
        } else {
            this.f19996a.m25306q(bVar, bVar.mo25212d(((InterfaceC6360q) objM25199h2).mo13992c(), (InterfaceC6360q) value).build());
        }
    }

    /* JADX INFO: renamed from: v */
    public void m25210v(b bVar, Object obj) {
        if (!bVar.mo25213e()) {
            m25192w(bVar.mo25214f(), obj);
        } else {
            if (!(obj instanceof List)) {
                C9987e.m38645a("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m25192w(bVar.mo25214f(), it.next());
            }
            obj = arrayList;
        }
        this.f19996a.m25306q(bVar, obj);
    }

    public C6352i() {
    }
}
