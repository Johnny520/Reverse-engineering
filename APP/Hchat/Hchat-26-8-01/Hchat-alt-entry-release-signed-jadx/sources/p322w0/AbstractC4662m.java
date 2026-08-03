package p322w0;

import ac.C0058k;
import gg.AbstractC1416l;
import java.util.HashMap;
import p020b5.C0184c;
import p069f.C0945l0;
import p074f5.C1071g;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p131j0.C2048d;
import p259r9.C3766p;
import p266s0.C3871a;
import p266s0.C3882l;
import tf.AbstractC4165l;
import tf.C4173t;

/* JADX INFO: renamed from: w0.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4662m {

    /* JADX INFO: renamed from: a */
    public static final C4661l f15510a = new C4661l(0);

    /* JADX INFO: renamed from: b */
    public static final C0184c f15511b = new C0184c(22);

    /* JADX INFO: renamed from: c */
    public static final Object f15512c = new Object();

    /* JADX INFO: renamed from: d */
    public static C4659j f15513d;

    /* JADX INFO: renamed from: e */
    public static long f15514e;

    /* JADX INFO: renamed from: f */
    public static final C1071g f15515f;

    /* JADX INFO: renamed from: g */
    public static final C0058k f15516g;

    /* JADX INFO: renamed from: h */
    public static Object f15517h;

    /* JADX INFO: renamed from: i */
    public static Object f15518i;

    /* JADX INFO: renamed from: j */
    public static final C4650a f15519j;

    /* JADX INFO: renamed from: k */
    public static final C3871a f15520k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C4659j c4659j = C4659j.f15501k;
        f15513d = c4659j;
        long j3 = 1;
        f15514e = j3 + j3;
        C1071g c1071g = new C1071g();
        c1071g.f3452d = new long[16];
        c1071g.f3453e = new int[16];
        int[] iArr = new int[16];
        int i9 = 0;
        while (i9 < 16) {
            int i10 = i9 + 1;
            iArr[i9] = i10;
            i9 = i10;
        }
        c1071g.f3454f = iArr;
        f15515f = c1071g;
        C0058k c0058k = new C0058k(11, (char) 0);
        c0058k.f177i = new int[16];
        c0058k.f178j = new C3882l[16];
        f15516g = c0058k;
        C4173t c4173t = C4173t.f13710g;
        f15517h = c4173t;
        f15518i = c4173t;
        long j4 = f15514e;
        f15514e = j3 + j4;
        C4650a c4650a = new C4650a(j4, c4659j, null, new C3766p(29));
        f15513d = f15513d.m9119f(c4650a.f15490b);
        f15519j = c4650a;
        f15520k = new C3871a(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m9120a() {
        m9124e(f15510a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final HashMap m9121b(long j3, C4651b c4651b, C4659j c4659j) {
        long[] jArr;
        C4659j c4659j2;
        long[] jArr2;
        C4659j c4659j3;
        int i9;
        int i10;
        AbstractC4672w abstractC4672wM9138s;
        C0945l0 c0945l0Mo9103x = c4651b.mo9103x();
        if (c0945l0Mo9103x != null) {
            long jMo9109g = c4651b.mo9109g();
            C4659j c4659jM9118e = c4651b.mo9108d().m9119f(jMo9109g).m9118e(c4651b.f15479j);
            Object[] objArr = c0945l0Mo9103x.f2976b;
            long[] jArr3 = c0945l0Mo9103x.f2975a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i11 = 0;
                HashMap map = null;
                while (true) {
                    long j4 = jArr3[i11];
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j4 & 255) < 128) {
                                InterfaceC4670u interfaceC4670u = (InterfaceC4670u) objArr[(i11 << 3) + i14];
                                AbstractC4672w abstractC4672wMo4484a = interfaceC4670u.mo4484a();
                                jArr2 = jArr3;
                                i9 = i12;
                                i10 = i14;
                                AbstractC4672w abstractC4672wM9138s2 = m9138s(abstractC4672wMo4484a, j3, c4659j);
                                if (abstractC4672wM9138s2 == null || (abstractC4672wM9138s = m9138s(abstractC4672wMo4484a, jMo9109g, c4659jM9118e)) == null || abstractC4672wM9138s2.equals(abstractC4672wM9138s)) {
                                    c4659j3 = c4659jM9118e;
                                } else {
                                    c4659j3 = c4659jM9118e;
                                    AbstractC4672w abstractC4672wM9138s3 = m9138s(abstractC4672wMo4484a, jMo9109g, c4651b.mo9108d());
                                    if (abstractC4672wM9138s3 == null) {
                                        m9137r();
                                        throw null;
                                    }
                                    AbstractC4672w abstractC4672wMo4487d = interfaceC4670u.mo4487d(abstractC4672wM9138s, abstractC4672wM9138s2, abstractC4672wM9138s3);
                                    if (abstractC4672wMo4487d == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(abstractC4672wM9138s2, abstractC4672wMo4487d);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                c4659j3 = c4659jM9118e;
                                i9 = i12;
                                i10 = i14;
                            }
                            j4 >>= i9;
                            i14 = i10 + 1;
                            i12 = i9;
                            jArr3 = jArr2;
                            c4659jM9118e = c4659j3;
                        }
                        jArr = jArr3;
                        c4659j2 = c4659jM9118e;
                        if (i13 != i12) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        c4659j2 = c4659jM9118e;
                    }
                    if (i11 == length) {
                        return map;
                    }
                    i11++;
                    jArr3 = jArr;
                    c4659jM9118e = c4659j2;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m9122c(AbstractC4655f abstractC4655f) {
        long j3;
        if (f15513d.m9117d(abstractC4655f.mo9109g())) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Snapshot is not open: snapshotId=");
        sb2.append(abstractC4655f.mo9109g());
        sb2.append(", disposed=");
        sb2.append(abstractC4655f.f15491c);
        sb2.append(", applied=");
        C4651b c4651b = abstractC4655f instanceof C4651b ? (C4651b) abstractC4655f : null;
        sb2.append(c4651b != null ? Boolean.valueOf(c4651b.f15482m) : "read-only");
        sb2.append(", lowestPin=");
        synchronized (f15512c) {
            C1071g c1071g = f15515f;
            j3 = c1071g.f3450b > 0 ? ((long[]) c1071g.f3452d)[0] : -1L;
        }
        sb2.append(j3);
        throw new IllegalStateException(sb2.toString().toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final C4659j m9123d(C4659j c4659j, long j3, long j4) {
        while (AbstractC1416l.m3828d(j3, j4) < 0) {
            c4659j = c4659j.m9119f(j3);
            j3 += (long) 1;
        }
        return c4659j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9124e(InterfaceC1231l interfaceC1231l) {
        C0945l0 c0945l0;
        Object objM9141v;
        C4650a c4650a = f15519j;
        synchronized (f15512c) {
            try {
                c0945l0 = c4650a.f15477h;
                if (c0945l0 != null) {
                    f15520k.addAndGet(1);
                }
                objM9141v = m9141v(c4650a, interfaceC1231l);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c0945l0 != null) {
            try {
                ?? r42 = f15517h;
                C2048d c2048d = new C2048d(c0945l0);
                int size = r42.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((InterfaceC1235p) r42.get(i9)).invoke(c2048d, c4650a);
                }
            } finally {
                f15520k.addAndGet(-1);
            }
        }
        synchronized (f15512c) {
            m9125f();
            if (c0945l0 != null) {
                Object[] objArr = c0945l0.f2976b;
                long[] jArr = c0945l0.f2975a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j3 = jArr[i10];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j3) < 128) {
                                    m9136q((InterfaceC4670u) objArr[(i10 << 3) + i12]);
                                }
                                j3 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                            if (i10 == length) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
            }
        }
        return objM9141v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final void m9125f() {
        C0058k c0058k = f15516g;
        int i9 = c0058k.f176h;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= i9) {
                break;
            }
            C3882l c3882l = ((C3882l[]) c0058k.f178j)[i10];
            Object obj = c3882l != null ? c3882l.get() : null;
            if (obj != null && m9135p((InterfaceC4670u) obj)) {
                if (i11 != i10) {
                    ((C3882l[]) c0058k.f178j)[i11] = c3882l;
                    int[] iArr = (int[]) c0058k.f177i;
                    iArr[i11] = iArr[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < i9; i12++) {
            ((C3882l[]) c0058k.f178j)[i12] = null;
            ((int[]) c0058k.f177i)[i12] = 0;
        }
        if (i11 != i9) {
            c0058k.f176h = i11;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final AbstractC4655f m9126g(AbstractC4655f abstractC4655f, InterfaceC1231l interfaceC1231l, boolean z9) {
        boolean z10 = abstractC4655f instanceof C4651b;
        if (z10 || abstractC4655f == null) {
            return new C4674y(z10 ? (C4651b) abstractC4655f : null, interfaceC1231l, null, false, z9);
        }
        return new C4675z(abstractC4655f, interfaceC1231l, false, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final AbstractC4672w m9127h(AbstractC4672w abstractC4672w) {
        AbstractC4672w abstractC4672wM9138s;
        AbstractC4655f abstractC4655fM9129j = m9129j();
        AbstractC4672w abstractC4672wM9138s2 = m9138s(abstractC4672w, abstractC4655fM9129j.mo9109g(), abstractC4655fM9129j.mo9108d());
        if (abstractC4672wM9138s2 != null) {
            return abstractC4672wM9138s2;
        }
        synchronized (f15512c) {
            AbstractC4655f abstractC4655fM9129j2 = m9129j();
            abstractC4672wM9138s = m9138s(abstractC4672w, abstractC4655fM9129j2.mo9109g(), abstractC4655fM9129j2.mo9108d());
        }
        if (abstractC4672wM9138s != null) {
            return abstractC4672wM9138s;
        }
        m9137r();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final AbstractC4672w m9128i(AbstractC4672w abstractC4672w, AbstractC4655f abstractC4655f) {
        AbstractC4672w abstractC4672wM9138s;
        AbstractC4672w abstractC4672wM9138s2 = m9138s(abstractC4672w, abstractC4655f.mo9109g(), abstractC4655f.mo9108d());
        if (abstractC4672wM9138s2 != null) {
            return abstractC4672wM9138s2;
        }
        synchronized (f15512c) {
            abstractC4672wM9138s = m9138s(abstractC4672w, abstractC4655f.mo9109g(), abstractC4655f.mo9108d());
        }
        if (abstractC4672wM9138s != null) {
            return abstractC4672wM9138s;
        }
        m9137r();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final AbstractC4655f m9129j() {
        AbstractC4655f abstractC4655f = (AbstractC4655f) f15511b.m818o();
        return abstractC4655f == null ? f15519j : abstractC4655f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final InterfaceC1231l m9130k(InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2, boolean z9) {
        if (!z9) {
            interfaceC1231l2 = null;
        }
        return (interfaceC1231l == null || interfaceC1231l2 == null || interfaceC1231l == interfaceC1231l2) ? interfaceC1231l == null ? interfaceC1231l2 : interfaceC1231l : new C4660k(interfaceC1231l, interfaceC1231l2, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final InterfaceC1231l m9131l(InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2) {
        return (interfaceC1231l == null || interfaceC1231l2 == null || interfaceC1231l == interfaceC1231l2) ? interfaceC1231l == null ? interfaceC1231l2 : interfaceC1231l : new C4660k(interfaceC1231l, interfaceC1231l2, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r3 = r0;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AbstractC4672w m9132m(AbstractC4672w abstractC4672w, InterfaceC4670u interfaceC4670u) {
        AbstractC4672w abstractC4672wMo4484a = interfaceC4670u.mo4484a();
        long j3 = f15514e;
        C1071g c1071g = f15515f;
        if (c1071g.f3450b > 0) {
            j3 = ((long[]) c1071g.f3452d)[0];
        }
        long j4 = j3 - ((long) 1);
        AbstractC4672w abstractC4672w2 = null;
        AbstractC4672w abstractC4672w3 = null;
        while (true) {
            if (abstractC4672wMo4484a == null) {
                break;
            }
            long j5 = abstractC4672wMo4484a.f15550a;
            if (j5 == 0) {
                break;
            }
            if (j5 != 0 && AbstractC1416l.m3828d(j5, j4) <= 0 && !C4659j.f15501k.m9117d(j5)) {
                if (abstractC4672w3 == null) {
                    abstractC4672w3 = abstractC4672wMo4484a;
                } else {
                    if (AbstractC1416l.m3828d(abstractC4672wMo4484a.f15550a, abstractC4672w3.f15550a) < 0) {
                        break;
                    }
                    abstractC4672w2 = abstractC4672w3;
                }
            }
            abstractC4672wMo4484a = abstractC4672wMo4484a.f15551b;
        }
        if (abstractC4672w2 != null) {
            abstractC4672w2.f15550a = Long.MAX_VALUE;
            return abstractC4672w2;
        }
        AbstractC4672w abstractC4672wMo4495b = abstractC4672w.mo4495b(Long.MAX_VALUE);
        abstractC4672wMo4495b.f15551b = interfaceC4670u.mo4484a();
        interfaceC4670u.mo4486c(abstractC4672wMo4495b);
        return abstractC4672wMo4495b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final void m9133n(AbstractC4655f abstractC4655f, InterfaceC4670u interfaceC4670u) {
        abstractC4655f.mo9101t(abstractC4655f.mo9097h() + 1);
        InterfaceC1231l interfaceC1231lMo9098i = abstractC4655f.mo9098i();
        if (interfaceC1231lMo9098i != null) {
            interfaceC1231lMo9098i.invoke(interfaceC4670u);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static final AbstractC4672w m9134o(AbstractC4672w abstractC4672w, AbstractC4671v abstractC4671v, AbstractC4655f abstractC4655f, AbstractC4672w abstractC4672w2) {
        AbstractC4672w abstractC4672wM9132m;
        if (abstractC4655f.mo9096f()) {
            abstractC4655f.mo9099n(abstractC4671v);
        }
        long jMo9109g = abstractC4655f.mo9109g();
        if (abstractC4672w2.f15550a == jMo9109g) {
            return abstractC4672w2;
        }
        synchronized (f15512c) {
            abstractC4672wM9132m = m9132m(abstractC4672w, abstractC4671v);
        }
        abstractC4672wM9132m.f15550a = jMo9109g;
        if (abstractC4672w2.f15550a != 1) {
            abstractC4655f.mo9099n(abstractC4671v);
        }
        return abstractC4672wM9132m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final boolean m9135p(InterfaceC4670u interfaceC4670u) {
        AbstractC4672w abstractC4672w;
        long j3 = f15514e;
        C1071g c1071g = f15515f;
        if (c1071g.f3450b > 0) {
            j3 = ((long[]) c1071g.f3452d)[0];
        }
        AbstractC4672w abstractC4672w2 = null;
        AbstractC4672w abstractC4672wMo4484a = null;
        int i9 = 0;
        for (AbstractC4672w abstractC4672wMo4484a2 = interfaceC4670u.mo4484a(); abstractC4672wMo4484a2 != null; abstractC4672wMo4484a2 = abstractC4672wMo4484a2.f15551b) {
            long j4 = abstractC4672wMo4484a2.f15550a;
            if (j4 != 0) {
                if (AbstractC1416l.m3828d(j4, j3) >= 0) {
                    i9++;
                } else if (abstractC4672w2 == null) {
                    i9++;
                    abstractC4672w2 = abstractC4672wMo4484a2;
                } else {
                    if (AbstractC1416l.m3828d(abstractC4672wMo4484a2.f15550a, abstractC4672w2.f15550a) < 0) {
                        abstractC4672w = abstractC4672w2;
                        abstractC4672w2 = abstractC4672wMo4484a2;
                    } else {
                        abstractC4672w = abstractC4672wMo4484a2;
                    }
                    if (abstractC4672wMo4484a == null) {
                        abstractC4672wMo4484a = interfaceC4670u.mo4484a();
                        AbstractC4672w abstractC4672w3 = abstractC4672wMo4484a;
                        while (true) {
                            if (abstractC4672wMo4484a == null) {
                                abstractC4672wMo4484a = abstractC4672w3;
                                break;
                            }
                            if (AbstractC1416l.m3828d(abstractC4672wMo4484a.f15550a, j3) >= 0) {
                                break;
                            }
                            if (AbstractC1416l.m3828d(abstractC4672w3.f15550a, abstractC4672wMo4484a.f15550a) < 0) {
                                abstractC4672w3 = abstractC4672wMo4484a;
                            }
                            abstractC4672wMo4484a = abstractC4672wMo4484a.f15551b;
                        }
                    }
                    abstractC4672w2.f15550a = 0L;
                    abstractC4672w2.mo4494a(abstractC4672wMo4484a);
                    abstractC4672w2 = abstractC4672w;
                }
            }
        }
        return i9 > 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final void m9136q(InterfaceC4670u interfaceC4670u) {
        if (m9135p(interfaceC4670u)) {
            C0058k c0058k = f15516g;
            int i9 = c0058k.f176h;
            int iIdentityHashCode = System.identityHashCode(interfaceC4670u);
            int i10 = -1;
            if (i9 > 0) {
                int i11 = c0058k.f176h - 1;
                int i12 = 0;
                while (true) {
                    if (i12 > i11) {
                        i10 = -(i12 + 1);
                        break;
                    }
                    int i13 = (i12 + i11) >>> 1;
                    int i14 = ((int[]) c0058k.f177i)[i13];
                    if (i14 < iIdentityHashCode) {
                        i12 = i13 + 1;
                    } else if (i14 > iIdentityHashCode) {
                        i11 = i13 - 1;
                    } else {
                        C3882l c3882l = ((C3882l[]) c0058k.f178j)[i13];
                        if (interfaceC4670u == (c3882l != null ? c3882l.get() : null)) {
                            i10 = i13;
                        } else {
                            for (int i15 = i13 - 1; -1 < i15 && ((int[]) c0058k.f177i)[i15] == iIdentityHashCode; i15--) {
                                C3882l c3882l2 = ((C3882l[]) c0058k.f178j)[i15];
                                if ((c3882l2 != null ? c3882l2.get() : null) == interfaceC4670u) {
                                    i10 = i15;
                                    break;
                                }
                            }
                            i13++;
                            int i16 = c0058k.f176h;
                            while (true) {
                                if (i13 >= i16) {
                                    i10 = -(c0058k.f176h + 1);
                                    break;
                                } else {
                                    if (((int[]) c0058k.f177i)[i13] != iIdentityHashCode) {
                                        i10 = -(i13 + 1);
                                        break;
                                    }
                                    C3882l c3882l3 = ((C3882l[]) c0058k.f178j)[i13];
                                    if ((c3882l3 != null ? c3882l3.get() : null) == interfaceC4670u) {
                                        break;
                                    } else {
                                        i13++;
                                    }
                                }
                            }
                            i10 = i13;
                        }
                    }
                }
                if (i10 >= 0) {
                    return;
                }
            }
            int i17 = -(i10 + 1);
            C3882l[] c3882lArr = (C3882l[]) c0058k.f178j;
            int length = c3882lArr.length;
            if (i9 == length) {
                int i18 = length * 2;
                C3882l[] c3882lArr2 = new C3882l[i18];
                int[] iArr = new int[i18];
                int i19 = i17 + 1;
                System.arraycopy(c3882lArr, i17, c3882lArr2, i19, i9 - i17);
                System.arraycopy((C3882l[]) c0058k.f178j, 0, c3882lArr2, 0, i17);
                AbstractC4165l.m8381p0((int[]) c0058k.f177i, iArr, i19, i17, i9);
                AbstractC4165l.m8384s0((int[]) c0058k.f177i, iArr, 0, i17, 6);
                c0058k.f178j = c3882lArr2;
                c0058k.f177i = iArr;
            } else {
                int i20 = i17 + 1;
                System.arraycopy(c3882lArr, i17, c3882lArr, i20, i9 - i17);
                int[] iArr2 = (int[]) c0058k.f177i;
                AbstractC4165l.m8381p0(iArr2, iArr2, i20, i17, i9);
            }
            ((C3882l[]) c0058k.f178j)[i17] = new C3882l(interfaceC4670u);
            ((int[]) c0058k.f177i)[i17] = iIdentityHashCode;
            c0058k.f176h++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final void m9137r() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final AbstractC4672w m9138s(AbstractC4672w abstractC4672w, long j3, C4659j c4659j) {
        AbstractC4672w abstractC4672w2 = null;
        while (abstractC4672w != null) {
            long j4 = abstractC4672w.f15550a;
            if (j4 != 0 && AbstractC1416l.m3828d(j4, j3) <= 0 && !c4659j.m9117d(j4) && (abstractC4672w2 == null || AbstractC1416l.m3828d(abstractC4672w2.f15550a, abstractC4672w.f15550a) < 0)) {
                abstractC4672w2 = abstractC4672w;
            }
            abstractC4672w = abstractC4672w.f15551b;
        }
        if (abstractC4672w2 != null) {
            return abstractC4672w2;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final AbstractC4672w m9139t(AbstractC4672w abstractC4672w, InterfaceC4670u interfaceC4670u) {
        AbstractC4672w abstractC4672wM9138s;
        AbstractC4655f abstractC4655fM9129j = m9129j();
        InterfaceC1231l interfaceC1231lMo9095e = abstractC4655fM9129j.mo9095e();
        if (interfaceC1231lMo9095e != null) {
            interfaceC1231lMo9095e.invoke(interfaceC4670u);
        }
        AbstractC4672w abstractC4672wM9138s2 = m9138s(abstractC4672w, abstractC4655fM9129j.mo9109g(), abstractC4655fM9129j.mo9108d());
        if (abstractC4672wM9138s2 != null) {
            return abstractC4672wM9138s2;
        }
        synchronized (f15512c) {
            AbstractC4655f abstractC4655fM9129j2 = m9129j();
            AbstractC4672w abstractC4672wMo4484a = interfaceC4670u.mo4484a();
            abstractC4672wMo4484a.getClass();
            abstractC4672wM9138s = m9138s(abstractC4672wMo4484a, abstractC4655fM9129j2.mo9109g(), abstractC4655fM9129j2.mo9108d());
            if (abstractC4672wM9138s == null) {
                m9137r();
                throw null;
            }
        }
        return abstractC4672wM9138s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final void m9140u(int i9) {
        C1071g c1071g = f15515f;
        int i10 = ((int[]) c1071g.f3454f)[i9];
        c1071g.m2701d(i10, c1071g.f3450b - 1);
        c1071g.f3450b--;
        long[] jArr = (long[]) c1071g.f3452d;
        long j3 = jArr[i10];
        int i11 = i10;
        while (i11 > 0) {
            int i12 = ((i11 + 1) >> 1) - 1;
            if (AbstractC1416l.m3828d(jArr[i12], j3) <= 0) {
                break;
            }
            c1071g.m2701d(i12, i11);
            i11 = i12;
        }
        long[] jArr2 = (long[]) c1071g.f3452d;
        int i13 = c1071g.f3450b >> 1;
        while (i10 < i13) {
            int i14 = (i10 + 1) << 1;
            int i15 = i14 - 1;
            if (i14 < c1071g.f3450b && AbstractC1416l.m3828d(jArr2[i14], jArr2[i15]) < 0) {
                if (AbstractC1416l.m3828d(jArr2[i14], jArr2[i10]) >= 0) {
                    break;
                }
                c1071g.m2701d(i14, i10);
                i10 = i14;
            } else {
                if (AbstractC1416l.m3828d(jArr2[i15], jArr2[i10]) >= 0) {
                    break;
                }
                c1071g.m2701d(i15, i10);
                i10 = i15;
            }
        }
        ((int[]) c1071g.f3454f)[i9] = c1071g.f3451c;
        c1071g.f3451c = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final Object m9141v(C4650a c4650a, InterfaceC1231l interfaceC1231l) {
        long j3 = c4650a.f15490b;
        Object objInvoke = interfaceC1231l.invoke(f15513d.m9116c(j3));
        long j4 = f15514e;
        f15514e = ((long) 1) + j4;
        C4659j c4659jM9116c = f15513d.m9116c(j3);
        f15513d = c4659jM9116c;
        c4650a.f15490b = j4;
        c4650a.f15489a = c4659jM9116c;
        c4650a.f15476g = 0;
        c4650a.f15477h = null;
        c4650a.m9111o();
        f15513d = f15513d.m9119f(j4);
        return objInvoke;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static final AbstractC4672w m9142w(AbstractC4672w abstractC4672w, InterfaceC4670u interfaceC4670u, AbstractC4655f abstractC4655f) {
        AbstractC4672w abstractC4672wM9138s;
        if (abstractC4655f.mo9096f()) {
            abstractC4655f.mo9099n(interfaceC4670u);
        }
        long jMo9109g = abstractC4655f.mo9109g();
        AbstractC4672w abstractC4672wM9138s2 = m9138s(abstractC4672w, jMo9109g, abstractC4655f.mo9108d());
        if (abstractC4672wM9138s2 == null) {
            m9137r();
            throw null;
        }
        if (abstractC4672wM9138s2.f15550a == abstractC4655f.mo9109g()) {
            return abstractC4672wM9138s2;
        }
        synchronized (f15512c) {
            abstractC4672wM9138s = m9138s(interfaceC4670u.mo4484a(), jMo9109g, abstractC4655f.mo9108d());
            if (abstractC4672wM9138s == null) {
                m9137r();
                throw null;
            }
            if (abstractC4672wM9138s.f15550a != jMo9109g) {
                AbstractC4672w abstractC4672wM9132m = m9132m(abstractC4672wM9138s, interfaceC4670u);
                abstractC4672wM9132m.mo4494a(abstractC4672wM9138s);
                abstractC4672wM9132m.f15550a = abstractC4655f.mo9109g();
                abstractC4672wM9138s = abstractC4672wM9132m;
            }
        }
        if (abstractC4672wM9138s2.f15550a != 1) {
            abstractC4655f.mo9099n(interfaceC4670u);
        }
        return abstractC4672wM9138s;
    }
}
