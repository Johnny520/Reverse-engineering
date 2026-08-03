package p322w0;

import java.util.ArrayList;
import java.util.HashMap;
import p069f.AbstractC0959s0;
import p069f.C0945l0;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1861n1;
import p131j0.C2048d;
import p276sf.C3958e;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: w0.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C4651b extends AbstractC4655f {

    /* JADX INFO: renamed from: n */
    public static final int[] f15473n = new int[0];

    /* JADX INFO: renamed from: e */
    public final InterfaceC1231l f15474e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1231l f15475f;

    /* JADX INFO: renamed from: g */
    public int f15476g;

    /* JADX INFO: renamed from: h */
    public C0945l0 f15477h;

    /* JADX INFO: renamed from: i */
    public ArrayList f15478i;

    /* JADX INFO: renamed from: j */
    public C4659j f15479j;

    /* JADX INFO: renamed from: k */
    public int[] f15480k;

    /* JADX INFO: renamed from: l */
    public int f15481l;

    /* JADX INFO: renamed from: m */
    public boolean f15482m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4651b(long j3, C4659j c4659j, InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2) {
        super(j3, c4659j);
        this.f15474e = interfaceC1231l;
        this.f15475f = interfaceC1231l2;
        this.f15479j = C4659j.f15501k;
        this.f15480k = f15473n;
        this.f15481l = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final void m9092A(long j3) {
        synchronized (AbstractC4662m.f15512c) {
            this.f15479j = this.f15479j.m9119f(j3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public void mo9093B(C0945l0 c0945l0) {
        this.f15477h = c0945l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public C4651b mo9085C(InterfaceC1231l interfaceC1231l, InterfaceC1231l interfaceC1231l2) throws Throwable {
        if (this.f15491c) {
            AbstractC1861n1.m4583a("Cannot use a disposed snapshot");
        }
        if (this.f15482m && this.f15492d < 0) {
            AbstractC1861n1.m4584b("Unsupported operation on a disposed or applied snapshot");
        }
        m9092A(mo9109g());
        Object obj = AbstractC4662m.f15512c;
        synchronized (obj) {
            try {
                long j3 = AbstractC4662m.f15514e;
                long j4 = 1;
                AbstractC4662m.f15514e = j3 + j4;
                AbstractC4662m.f15513d = AbstractC4662m.f15513d.m9119f(j3);
                C4659j c4659jMo9108d = mo9108d();
                mo9112r(c4659jMo9108d.m9119f(j3));
                try {
                    C4652c c4652c = new C4652c(j3, AbstractC4662m.m9123d(c4659jMo9108d, mo9109g() + j4, j3), AbstractC4662m.m9130k(interfaceC1231l, mo9095e(), true), AbstractC4662m.m9131l(interfaceC1231l2, mo9098i()), this);
                    if (this.f15482m || this.f15491c) {
                        return c4652c;
                    }
                    long jMo9109g = mo9109g();
                    synchronized (obj) {
                        long j5 = AbstractC4662m.f15514e;
                        AbstractC4662m.f15514e = j5 + j4;
                        mo9113s(j5);
                        AbstractC4662m.f15513d = AbstractC4662m.f15513d.m9119f(mo9109g());
                    }
                    mo9112r(AbstractC4662m.m9123d(mo9108d(), jMo9109g + j4, mo9109g()));
                    return c4652c;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: b */
    public final void mo9094b() {
        AbstractC4662m.f15513d = AbstractC4662m.f15513d.m9116c(mo9109g()).m9115a(this.f15479j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: c */
    public void mo9086c() {
        if (this.f15491c) {
            return;
        }
        this.f15491c = true;
        synchronized (AbstractC4662m.f15512c) {
            m9111o();
        }
        mo9088l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: f */
    public boolean mo9096f() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: h */
    public int mo9097h() {
        return this.f15476g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: i */
    public InterfaceC1231l mo9098i() {
        return this.f15475f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: k */
    public void mo9087k() {
        this.f15481l++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo9088l() {
        if (this.f15481l <= 0) {
            AbstractC1861n1.m4583a("no pending nested snapshots");
        }
        int i9 = this.f15481l - 1;
        this.f15481l = i9;
        if (i9 != 0 || this.f15482m) {
            return;
        }
        C0945l0 c0945l0Mo9103x = mo9103x();
        if (c0945l0Mo9103x != null) {
            if (this.f15482m) {
                AbstractC1861n1.m4584b("Unsupported operation on a snapshot that has been applied");
            }
            mo9093B(null);
            long jMo9109g = mo9109g();
            Object[] objArr = c0945l0Mo9103x.f2976b;
            long[] jArr = c0945l0Mo9103x.f2975a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j3 = jArr[i10];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j3) < 128) {
                                for (AbstractC4672w abstractC4672wMo4484a = ((InterfaceC4670u) objArr[(i10 << 3) + i12]).mo4484a(); abstractC4672wMo4484a != null; abstractC4672wMo4484a = abstractC4672wMo4484a.f15551b) {
                                    long j4 = abstractC4672wMo4484a.f15550a;
                                    if (j4 == jMo9109g || AbstractC4166m.m8417o1(this.f15479j, Long.valueOf(j4))) {
                                        C4661l c4661l = AbstractC4662m.f15510a;
                                        abstractC4672wMo4484a.f15550a = 0L;
                                    }
                                }
                            }
                            j3 >>= 8;
                        }
                        if (i11 != 8) {
                            break;
                        } else if (i10 == length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        }
        m9107a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: m */
    public void mo9089m() {
        if (this.f15482m || this.f15491c) {
            return;
        }
        m9102v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: n */
    public void mo9099n(InterfaceC4670u interfaceC4670u) {
        C0945l0 c0945l0Mo9103x = mo9103x();
        if (c0945l0Mo9103x == null) {
            C0945l0 c0945l0 = AbstractC0959s0.f3019a;
            c0945l0Mo9103x = new C0945l0();
            mo9093B(c0945l0Mo9103x);
        }
        c0945l0Mo9103x.m2328a(interfaceC4670u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: p */
    public final void mo9100p() {
        int length = this.f15480k.length;
        for (int i9 = 0; i9 < length; i9++) {
            AbstractC4662m.m9140u(this.f15480k[i9]);
        }
        m9111o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: t */
    public void mo9101t(int i9) {
        this.f15476g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: u */
    public AbstractC4655f mo9090u(InterfaceC1231l interfaceC1231l) throws Throwable {
        if (this.f15491c) {
            AbstractC1861n1.m4583a("Cannot use a disposed snapshot");
        }
        if (this.f15482m && this.f15492d < 0) {
            AbstractC1861n1.m4584b("Unsupported operation on a disposed or applied snapshot");
        }
        long jMo9109g = mo9109g();
        m9092A(mo9109g());
        Object obj = AbstractC4662m.f15512c;
        synchronized (obj) {
            try {
                long j3 = AbstractC4662m.f15514e;
                long j4 = 1;
                AbstractC4662m.f15514e = j3 + j4;
                AbstractC4662m.f15513d = AbstractC4662m.f15513d.m9119f(j3);
                try {
                    C4653d c4653d = new C4653d(j3, AbstractC4662m.m9123d(mo9108d(), jMo9109g + j4, j3), AbstractC4662m.m9130k(interfaceC1231l, mo9095e(), true), this);
                    if (this.f15482m || this.f15491c) {
                        return c4653d;
                    }
                    long jMo9109g2 = mo9109g();
                    synchronized (obj) {
                        long j5 = AbstractC4662m.f15514e;
                        AbstractC4662m.f15514e = j5 + j4;
                        mo9113s(j5);
                        AbstractC4662m.f15513d = AbstractC4662m.f15513d.m9119f(mo9109g());
                    }
                    mo9112r(AbstractC4662m.m9123d(mo9108d(), jMo9109g2 + j4, mo9109g()));
                    return c4653d;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final void m9102v() {
        long j3;
        m9092A(mo9109g());
        if (this.f15482m || this.f15491c) {
            return;
        }
        long jMo9109g = mo9109g();
        synchronized (AbstractC4662m.f15512c) {
            long j4 = AbstractC4662m.f15514e;
            j3 = 1;
            AbstractC4662m.f15514e = j4 + j3;
            mo9113s(j4);
            AbstractC4662m.f15513d = AbstractC4662m.f15513d.m9119f(mo9109g());
        }
        mo9112r(AbstractC4662m.m9123d(mo9108d(), jMo9109g + j3, mo9109g()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC4666q mo9091w() {
        HashMap mapM9121b;
        ?? r32;
        C0945l0 c0945l0;
        long j3;
        long j4;
        C0945l0 c0945l0Mo9103x = mo9103x();
        if (c0945l0Mo9103x != null) {
            long j5 = AbstractC4662m.f15519j.f15490b;
            mapM9121b = AbstractC4662m.m9121b(j5, this, AbstractC4662m.f15513d.m9116c(j5));
        } else {
            mapM9121b = null;
        }
        C4173t c4173t = C4173t.f13710g;
        synchronized (AbstractC4662m.f15512c) {
            try {
                AbstractC4662m.m9122c(this);
                if (c0945l0Mo9103x == null || c0945l0Mo9103x.f2978d == 0) {
                    mo9094b();
                    C4650a c4650a = AbstractC4662m.f15519j;
                    C0945l0 c0945l02 = c4650a.f15477h;
                    AbstractC4662m.m9141v(c4650a, AbstractC4662m.f15510a);
                    if (c0945l02 == null || !c0945l02.m2335h()) {
                        r32 = c4173t;
                        c0945l0 = null;
                    } else {
                        r32 = AbstractC4662m.f15517h;
                        c0945l0 = c0945l02;
                    }
                } else {
                    C4650a c4650a2 = AbstractC4662m.f15519j;
                    AbstractC4666q abstractC4666qM9105z = m9105z(AbstractC4662m.f15514e, c0945l0Mo9103x, mapM9121b, AbstractC4662m.f15513d.m9116c(c4650a2.f15490b));
                    if (!abstractC4666qM9105z.equals(C4657h.f15494b)) {
                        return abstractC4666qM9105z;
                    }
                    mo9094b();
                    c0945l0 = c4650a2.f15477h;
                    AbstractC4662m.m9141v(c4650a2, AbstractC4662m.f15510a);
                    mo9093B(null);
                    c4650a2.f15477h = null;
                    r32 = AbstractC4662m.f15517h;
                }
                this.f15482m = true;
                if (c0945l0 != null) {
                    C2048d c2048d = new C2048d(c0945l0);
                    if (!c0945l0.m2334g()) {
                        int size = r32.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            ((InterfaceC1235p) r32.get(i9)).invoke(c2048d, this);
                        }
                    }
                }
                if (c0945l0Mo9103x != null && c0945l0Mo9103x.m2335h()) {
                    C2048d c2048d2 = new C2048d(c0945l0Mo9103x);
                    int size2 = r32.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((InterfaceC1235p) r32.get(i10)).invoke(c2048d2, this);
                    }
                }
                synchronized (AbstractC4662m.f15512c) {
                    try {
                        mo9100p();
                        AbstractC4662m.m9125f();
                        if (c0945l0 != null) {
                            Object[] objArr = c0945l0.f2976b;
                            long[] jArr = c0945l0.f2975a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i11 = 0;
                                j3 = 128;
                                while (true) {
                                    long j10 = jArr[i11];
                                    j4 = 255;
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                                        for (int i13 = 0; i13 < i12; i13++) {
                                            if ((j10 & 255) < 128) {
                                                AbstractC4662m.m9136q((InterfaceC4670u) objArr[(i11 << 3) + i13]);
                                            }
                                            j10 >>= 8;
                                        }
                                        if (i12 != 8) {
                                            break;
                                        }
                                        if (i11 == length) {
                                            break;
                                        }
                                        i11++;
                                    }
                                }
                            } else {
                                j3 = 128;
                                j4 = 255;
                            }
                        }
                        if (c0945l0Mo9103x != null) {
                            Object[] objArr2 = c0945l0Mo9103x.f2976b;
                            long[] jArr2 = c0945l0Mo9103x.f2975a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i14 = 0;
                                while (true) {
                                    long j11 = jArr2[i14];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                        for (int i16 = 0; i16 < i15; i16++) {
                                            if ((j11 & j4) < j3) {
                                                AbstractC4662m.m9136q((InterfaceC4670u) objArr2[(i14 << 3) + i16]);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i15 != 8) {
                                            break;
                                        }
                                        if (i14 == length2) {
                                            break;
                                        }
                                        i14++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.f15478i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i17 = 0; i17 < size3; i17++) {
                                AbstractC4662m.m9136q((InterfaceC4670u) arrayList.get(i17));
                            }
                        }
                        this.f15478i = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return C4657h.f15494b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public C0945l0 mo9103x() {
        return this.f15477h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: e()Lfg/l; */
    @Override // p322w0.AbstractC4655f
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public InterfaceC1231l mo9095e() {
        return this.f15474e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final AbstractC4666q m9105z(long j3, C0945l0 c0945l0, HashMap map, C4659j c4659j) {
        ArrayList arrayList;
        ArrayList arrayListM8397F1;
        ArrayList arrayList2;
        C4659j c4659j2;
        Object[] objArr;
        long[] jArr;
        C4659j c4659j3;
        Object[] objArr2;
        long[] jArr2;
        int i9;
        long j4;
        ArrayList arrayList3;
        AbstractC4672w abstractC4672wMo4487d;
        C4659j c4659jM9118e = mo9108d().m9119f(mo9109g()).m9118e(this.f15479j);
        Object[] objArr3 = c0945l0.f2976b;
        long[] jArr3 = c0945l0.f2975a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i10 = 0;
            arrayList2 = null;
            arrayListM8397F1 = null;
            while (true) {
                long j5 = jArr3[i10];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j5 & 255) < 128) {
                            objArr2 = objArr3;
                            InterfaceC4670u interfaceC4670u = (InterfaceC4670u) objArr3[(i10 << 3) + i12];
                            jArr2 = jArr3;
                            AbstractC4672w abstractC4672wMo4484a = interfaceC4670u.mo4484a();
                            i9 = i12;
                            ArrayList arrayList4 = arrayList2;
                            AbstractC4672w abstractC4672wM9138s = AbstractC4662m.m9138s(abstractC4672wMo4484a, j3, c4659j);
                            if (abstractC4672wM9138s == null) {
                                c4659j3 = c4659jM9118e;
                                arrayList3 = arrayListM8397F1;
                                j4 = j5;
                            } else {
                                arrayList3 = arrayListM8397F1;
                                j4 = j5;
                                AbstractC4672w abstractC4672wM9138s2 = AbstractC4662m.m9138s(abstractC4672wMo4484a, mo9109g(), c4659jM9118e);
                                if (abstractC4672wM9138s2 == null) {
                                    c4659j3 = c4659jM9118e;
                                } else {
                                    c4659j3 = c4659jM9118e;
                                    if (abstractC4672wM9138s2.f15550a != 1 && !abstractC4672wM9138s.equals(abstractC4672wM9138s2)) {
                                        AbstractC4672w abstractC4672wM9138s3 = AbstractC4662m.m9138s(abstractC4672wMo4484a, mo9109g(), mo9108d());
                                        if (abstractC4672wM9138s3 == null) {
                                            AbstractC4662m.m9137r();
                                            throw null;
                                        }
                                        if (map == null || (abstractC4672wMo4487d = (AbstractC4672w) map.get(abstractC4672wM9138s)) == null) {
                                            abstractC4672wMo4487d = interfaceC4670u.mo4487d(abstractC4672wM9138s2, abstractC4672wM9138s, abstractC4672wM9138s3);
                                        }
                                        if (abstractC4672wMo4487d == null) {
                                            return new C4656g(this);
                                        }
                                        if (!abstractC4672wMo4487d.equals(abstractC4672wM9138s3)) {
                                            if (abstractC4672wMo4487d.equals(abstractC4672wM9138s)) {
                                                ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList5.add(new C3958e(interfaceC4670u, abstractC4672wM9138s.mo4495b(mo9109g())));
                                                arrayListM8397F1 = arrayList3 == null ? new ArrayList() : arrayList3;
                                                arrayListM8397F1.add(interfaceC4670u);
                                                arrayList2 = arrayList5;
                                            } else {
                                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList2.add(!abstractC4672wMo4487d.equals(abstractC4672wM9138s2) ? new C3958e(interfaceC4670u, abstractC4672wMo4487d) : new C3958e(interfaceC4670u, abstractC4672wM9138s2.mo4495b(mo9109g())));
                                            }
                                        }
                                        arrayListM8397F1 = arrayList3;
                                    }
                                }
                            }
                            arrayList2 = arrayList4;
                            arrayListM8397F1 = arrayList3;
                        } else {
                            c4659j3 = c4659jM9118e;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i9 = i12;
                            j4 = j5;
                        }
                        j5 = j4 >> 8;
                        i12 = i9 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        c4659jM9118e = c4659j3;
                    }
                    c4659j2 = c4659jM9118e;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i11 != 8) {
                        break;
                    }
                } else {
                    c4659j2 = c4659jM9118e;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i10 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i10++;
                jArr3 = jArr;
                objArr3 = objArr;
                c4659jM9118e = c4659j2;
            }
        } else {
            arrayList = null;
            arrayListM8397F1 = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            m9102v();
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                C3958e c3958e = (C3958e) arrayList2.get(i13);
                InterfaceC4670u interfaceC4670u2 = (InterfaceC4670u) c3958e.f12961g;
                AbstractC4672w abstractC4672w = (AbstractC4672w) c3958e.f12962h;
                abstractC4672w.f15550a = j3;
                synchronized (AbstractC4662m.f15512c) {
                    abstractC4672w.f15551b = interfaceC4670u2.mo4484a();
                    interfaceC4670u2.mo4486c(abstractC4672w);
                }
            }
        }
        if (arrayListM8397F1 != null) {
            int size2 = arrayListM8397F1.size();
            for (int i14 = 0; i14 < size2; i14++) {
                c0945l0.m2339l((InterfaceC4670u) arrayListM8397F1.get(i14));
            }
            ArrayList arrayList6 = this.f15478i;
            if (arrayList6 != null) {
                arrayListM8397F1 = AbstractC4166m.m8397F1(arrayList6, arrayListM8397F1);
            }
            this.f15478i = arrayListM8397F1;
        }
        return C4657h.f15494b;
    }
}
