package p158f0;

import java.util.ArrayList;
import java.util.HashMap;
import p056K2.C0882h;
import p061L2.AbstractC0973m;
import p061L2.C0981u;
import p092S0.C1286x;
import p095T.AbstractC1380p0;
import p105V.C1486h;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p186k.AbstractC2416M;
import p186k.C2409F;

/* JADX INFO: renamed from: f0.b */
/* JADX INFO: loaded from: classes.dex */
public class C2070b extends AbstractC2074f {

    /* JADX INFO: renamed from: n */
    public static final int[] f6929n = new int[0];

    /* JADX INFO: renamed from: e */
    public final InterfaceC1601c f6930e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1601c f6931f;

    /* JADX INFO: renamed from: g */
    public int f6932g;

    /* JADX INFO: renamed from: h */
    public C2409F f6933h;

    /* JADX INFO: renamed from: i */
    public ArrayList f6934i;

    /* JADX INFO: renamed from: j */
    public C2080l f6935j;

    /* JADX INFO: renamed from: k */
    public int[] f6936k;

    /* JADX INFO: renamed from: l */
    public int f6937l;

    /* JADX INFO: renamed from: m */
    public boolean f6938m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2070b(long j5, C2080l c2080l, InterfaceC1601c interfaceC1601c, InterfaceC1601c interfaceC1601c2) {
        super(j5, c2080l);
        this.f6930e = interfaceC1601c;
        this.f6931f = interfaceC1601c2;
        this.f6935j = C2080l.f6962h;
        this.f6936k = f6929n;
        this.f6937l = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final void m3801A(long j5) {
        synchronized (AbstractC2082n.f6972c) {
            this.f6935j = this.f6935j.m3824e(j5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public void mo3802B(C2409F c2409f) {
        this.f6933h = c2409f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public C2070b mo3799C(InterfaceC1601c interfaceC1601c, InterfaceC1601c interfaceC1601c2) throws Throwable {
        if (this.f6947c) {
            AbstractC1380p0.m2542a("Cannot use a disposed snapshot");
        }
        if (this.f6938m && this.f6948d < 0) {
            AbstractC1380p0.m2543b("Unsupported operation on a disposed or applied snapshot");
        }
        m3801A(mo3791g());
        Object obj = AbstractC2082n.f6972c;
        synchronized (obj) {
            try {
                long j5 = AbstractC2082n.f6974e;
                long j6 = 1;
                AbstractC2082n.f6974e = j5 + j6;
                AbstractC2082n.f6973d = AbstractC2082n.f6973d.m3824e(j5);
                C2080l c2080lMo3788d = mo3788d();
                mo3815r(c2080lMo3788d.m3824e(j5));
                try {
                    C2071c c2071c = new C2071c(j5, AbstractC2082n.m3828d(c2080lMo3788d, mo3791g() + j6, j5), AbstractC2082n.m3835k(interfaceC1601c, mo3789e(), true), AbstractC2082n.m3836l(interfaceC1601c2, mo3792i()), this);
                    if (this.f6938m || this.f6947c) {
                        return c2071c;
                    }
                    long jMo3791g = mo3791g();
                    synchronized (obj) {
                        long j7 = AbstractC2082n.f6974e;
                        AbstractC2082n.f6974e = j7 + j6;
                        mo3816s(j7);
                        AbstractC2082n.f6973d = AbstractC2082n.f6973d.m3824e(mo3791g());
                    }
                    mo3815r(AbstractC2082n.m3828d(mo3788d(), jMo3791g + j6, mo3791g()));
                    return c2071c;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: b */
    public final void mo3803b() {
        AbstractC2082n.f6973d = AbstractC2082n.f6973d.m3821b(mo3791g()).m3820a(this.f6935j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: c */
    public void mo3787c() {
        if (this.f6947c) {
            return;
        }
        this.f6947c = true;
        synchronized (AbstractC2082n.f6972c) {
            m3814o();
        }
        mo3794l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: f */
    public boolean mo3790f() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: h */
    public int mo3804h() {
        return this.f6932g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: i */
    public InterfaceC1601c mo3792i() {
        return this.f6931f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: k */
    public void mo3793k() {
        this.f6937l++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo3794l() {
        if (this.f6937l <= 0) {
            AbstractC1380p0.m2542a("no pending nested snapshots");
        }
        int i5 = this.f6937l - 1;
        this.f6937l = i5;
        if (i5 != 0 || this.f6938m) {
            return;
        }
        C2409F c2409fMo3808x = mo3808x();
        if (c2409fMo3808x != null) {
            if (this.f6938m) {
                AbstractC1380p0.m2543b("Unsupported operation on a snapshot that has been applied");
            }
            mo3802B(null);
            long jMo3791g = mo3791g();
            Object[] objArr = c2409fMo3808x.f7794b;
            long[] jArr = c2409fMo3808x.f7793a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i6 = 0;
                while (true) {
                    long j5 = jArr[i6];
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        for (int i8 = 0; i8 < i7; i8++) {
                            if ((255 & j5) < 128) {
                                for (AbstractC2092x abstractC2092xMo2410a = ((InterfaceC2090v) objArr[(i6 << 3) + i8]).mo2410a(); abstractC2092xMo2410a != null; abstractC2092xMo2410a = abstractC2092xMo2410a.f7011b) {
                                    long j6 = abstractC2092xMo2410a.f7010a;
                                    if (j6 == jMo3791g || AbstractC0973m.m2010Q(this.f6935j, Long.valueOf(j6))) {
                                        C1286x c1286x = AbstractC2082n.f6970a;
                                        abstractC2092xMo2410a.f7010a = 0L;
                                    }
                                }
                            }
                            j5 >>= 8;
                        }
                        if (i7 != 8) {
                            break;
                        } else if (i6 == length) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                }
            }
        }
        m3812a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: m */
    public void mo3795m() {
        if (this.f6938m || this.f6947c) {
            return;
        }
        m3807v();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: n */
    public void mo3796n(InterfaceC2090v interfaceC2090v) {
        C2409F c2409fMo3808x = mo3808x();
        if (c2409fMo3808x == null) {
            C2409F c2409f = AbstractC2416M.f7817a;
            c2409fMo3808x = new C2409F();
            mo3802B(c2409fMo3808x);
        }
        c2409fMo3808x.m4279a(interfaceC2090v);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: p */
    public final void mo3805p() {
        int length = this.f6936k.length;
        for (int i5 = 0; i5 < length; i5++) {
            AbstractC2082n.m3845u(this.f6936k[i5]);
        }
        m3814o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: t */
    public void mo3806t(int i5) {
        this.f6932g = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: u */
    public AbstractC2074f mo3797u(InterfaceC1601c interfaceC1601c) throws Throwable {
        if (this.f6947c) {
            AbstractC1380p0.m2542a("Cannot use a disposed snapshot");
        }
        if (this.f6938m && this.f6948d < 0) {
            AbstractC1380p0.m2543b("Unsupported operation on a disposed or applied snapshot");
        }
        long jMo3791g = mo3791g();
        m3801A(mo3791g());
        Object obj = AbstractC2082n.f6972c;
        synchronized (obj) {
            try {
                long j5 = AbstractC2082n.f6974e;
                long j6 = 1;
                AbstractC2082n.f6974e = j5 + j6;
                AbstractC2082n.f6973d = AbstractC2082n.f6973d.m3824e(j5);
                try {
                    C2072d c2072d = new C2072d(j5, AbstractC2082n.m3828d(mo3788d(), jMo3791g + j6, j5), AbstractC2082n.m3835k(interfaceC1601c, mo3789e(), true), this);
                    if (this.f6938m || this.f6947c) {
                        return c2072d;
                    }
                    long jMo3791g2 = mo3791g();
                    synchronized (obj) {
                        long j7 = AbstractC2082n.f6974e;
                        AbstractC2082n.f6974e = j7 + j6;
                        mo3816s(j7);
                        AbstractC2082n.f6973d = AbstractC2082n.f6973d.m3824e(mo3791g());
                    }
                    mo3815r(AbstractC2082n.m3828d(mo3788d(), jMo3791g2 + j6, mo3791g()));
                    return c2072d;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final void m3807v() {
        long j5;
        m3801A(mo3791g());
        if (this.f6938m || this.f6947c) {
            return;
        }
        long jMo3791g = mo3791g();
        synchronized (AbstractC2082n.f6972c) {
            long j6 = AbstractC2082n.f6974e;
            j5 = 1;
            AbstractC2082n.f6974e = j6 + j5;
            mo3816s(j6);
            AbstractC2082n.f6973d = AbstractC2082n.f6973d.m3824e(mo3791g());
        }
        mo3815r(AbstractC2082n.m3828d(mo3788d(), jMo3791g + j5, mo3791g()));
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
    public AbstractC2086r mo3800w() {
        HashMap mapM3826b;
        ?? r32;
        C2409F c2409f;
        long j5;
        long j6;
        C2409F c2409fMo3808x = mo3808x();
        if (c2409fMo3808x != null) {
            long j7 = AbstractC2082n.f6979j.f6946b;
            mapM3826b = AbstractC2082n.m3826b(j7, this, AbstractC2082n.f6973d.m3821b(j7));
        } else {
            mapM3826b = null;
        }
        C0981u c0981u = C0981u.f3047d;
        synchronized (AbstractC2082n.f6972c) {
            try {
                AbstractC2082n.m3827c(this);
                if (c2409fMo3808x == null || c2409fMo3808x.f7796d == 0) {
                    mo3803b();
                    C2069a c2069a = AbstractC2082n.f6979j;
                    C2409F c2409f2 = c2069a.f6933h;
                    AbstractC2082n.m3846v(c2069a, AbstractC2082n.f6970a);
                    if (c2409f2 == null || !c2409f2.m4286h()) {
                        r32 = c0981u;
                        c2409f = null;
                    } else {
                        r32 = AbstractC2082n.f6977h;
                        c2409f = c2409f2;
                    }
                } else {
                    C2069a c2069a2 = AbstractC2082n.f6979j;
                    AbstractC2086r abstractC2086rM3810z = m3810z(AbstractC2082n.f6974e, c2409fMo3808x, mapM3826b, AbstractC2082n.f6973d.m3821b(c2069a2.f6946b));
                    if (!abstractC2086rM3810z.equals(C2077i.f6950b)) {
                        return abstractC2086rM3810z;
                    }
                    mo3803b();
                    c2409f = c2069a2.f6933h;
                    AbstractC2082n.m3846v(c2069a2, AbstractC2082n.f6970a);
                    mo3802B(null);
                    c2069a2.f6933h = null;
                    r32 = AbstractC2082n.f6977h;
                }
                this.f6938m = true;
                if (c2409f != null) {
                    C1486h c1486h = new C1486h(c2409f);
                    if (!c2409f.m4285g()) {
                        int size = r32.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            ((InterfaceC1603e) r32.get(i5)).mo0g(c1486h, this);
                        }
                    }
                }
                if (c2409fMo3808x != null && c2409fMo3808x.m4286h()) {
                    C1486h c1486h2 = new C1486h(c2409fMo3808x);
                    int size2 = r32.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        ((InterfaceC1603e) r32.get(i6)).mo0g(c1486h2, this);
                    }
                }
                synchronized (AbstractC2082n.f6972c) {
                    try {
                        mo3805p();
                        AbstractC2082n.m3830f();
                        if (c2409f != null) {
                            Object[] objArr = c2409f.f7794b;
                            long[] jArr = c2409f.f7793a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i7 = 0;
                                j5 = 128;
                                while (true) {
                                    long j8 = jArr[i7];
                                    j6 = 255;
                                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                                        for (int i9 = 0; i9 < i8; i9++) {
                                            if ((j8 & 255) < 128) {
                                                AbstractC2082n.m3841q((InterfaceC2090v) objArr[(i7 << 3) + i9]);
                                            }
                                            j8 >>= 8;
                                        }
                                        if (i8 != 8) {
                                            break;
                                        }
                                        if (i7 == length) {
                                            break;
                                        }
                                        i7++;
                                    }
                                }
                            } else {
                                j5 = 128;
                                j6 = 255;
                            }
                        }
                        if (c2409fMo3808x != null) {
                            Object[] objArr2 = c2409fMo3808x.f7794b;
                            long[] jArr2 = c2409fMo3808x.f7793a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i10 = 0;
                                while (true) {
                                    long j9 = jArr2[i10];
                                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j9 & j6) < j5) {
                                                AbstractC2082n.m3841q((InterfaceC2090v) objArr2[(i10 << 3) + i12]);
                                            }
                                            j9 >>= 8;
                                        }
                                        if (i11 != 8) {
                                            break;
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                    }
                                }
                            }
                        }
                        ArrayList arrayList = this.f6934i;
                        if (arrayList != null) {
                            int size3 = arrayList.size();
                            for (int i13 = 0; i13 < size3; i13++) {
                                AbstractC2082n.m3841q((InterfaceC2090v) arrayList.get(i13));
                            }
                        }
                        this.f6934i = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return C2077i.f6950b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public C2409F mo3808x() {
        return this.f6933h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: e()LW2/c; */
    @Override // p158f0.AbstractC2074f
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public InterfaceC1601c mo3789e() {
        return this.f6930e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final AbstractC2086r m3810z(long j5, C2409F c2409f, HashMap map, C2080l c2080l) {
        ArrayList arrayList;
        ArrayList arrayListM2019Z;
        ArrayList arrayList2;
        C2080l c2080l2;
        Object[] objArr;
        long[] jArr;
        C2080l c2080l3;
        Object[] objArr2;
        long[] jArr2;
        int i5;
        long j6;
        ArrayList arrayList3;
        AbstractC2092x abstractC2092xMo2505b;
        C2080l c2080lM3823d = mo3788d().m3824e(mo3791g()).m3823d(this.f6935j);
        Object[] objArr3 = c2409f.f7794b;
        long[] jArr3 = c2409f.f7793a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i6 = 0;
            arrayList2 = null;
            arrayListM2019Z = null;
            while (true) {
                long j7 = jArr3[i6];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j7 & 255) < 128) {
                            objArr2 = objArr3;
                            InterfaceC2090v interfaceC2090v = (InterfaceC2090v) objArr3[(i6 << 3) + i8];
                            jArr2 = jArr3;
                            AbstractC2092x abstractC2092xMo2410a = interfaceC2090v.mo2410a();
                            i5 = i8;
                            ArrayList arrayList4 = arrayList2;
                            AbstractC2092x abstractC2092xM3843s = AbstractC2082n.m3843s(abstractC2092xMo2410a, j5, c2080l);
                            if (abstractC2092xM3843s == null) {
                                c2080l3 = c2080lM3823d;
                                arrayList3 = arrayListM2019Z;
                                j6 = j7;
                            } else {
                                arrayList3 = arrayListM2019Z;
                                j6 = j7;
                                AbstractC2092x abstractC2092xM3843s2 = AbstractC2082n.m3843s(abstractC2092xMo2410a, mo3791g(), c2080lM3823d);
                                if (abstractC2092xM3843s2 == null) {
                                    c2080l3 = c2080lM3823d;
                                } else {
                                    c2080l3 = c2080lM3823d;
                                    if (abstractC2092xM3843s2.f7010a != 1 && !abstractC2092xM3843s.equals(abstractC2092xM3843s2)) {
                                        AbstractC2092x abstractC2092xM3843s3 = AbstractC2082n.m3843s(abstractC2092xMo2410a, mo3791g(), mo3788d());
                                        if (abstractC2092xM3843s3 == null) {
                                            AbstractC2082n.m3842r();
                                            throw null;
                                        }
                                        if (map == null || (abstractC2092xMo2505b = (AbstractC2092x) map.get(abstractC2092xM3843s)) == null) {
                                            abstractC2092xMo2505b = interfaceC2090v.mo2505b(abstractC2092xM3843s2, abstractC2092xM3843s, abstractC2092xM3843s3);
                                        }
                                        if (abstractC2092xMo2505b == null) {
                                            return new C2076h(this);
                                        }
                                        if (!abstractC2092xMo2505b.equals(abstractC2092xM3843s3)) {
                                            if (abstractC2092xMo2505b.equals(abstractC2092xM3843s)) {
                                                ArrayList arrayList5 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList5.add(new C0882h(interfaceC2090v, abstractC2092xM3843s.mo2406b(mo3791g())));
                                                arrayListM2019Z = arrayList3 == null ? new ArrayList() : arrayList3;
                                                arrayListM2019Z.add(interfaceC2090v);
                                                arrayList2 = arrayList5;
                                            } else {
                                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                                arrayList2.add(!abstractC2092xMo2505b.equals(abstractC2092xM3843s2) ? new C0882h(interfaceC2090v, abstractC2092xMo2505b) : new C0882h(interfaceC2090v, abstractC2092xM3843s2.mo2406b(mo3791g())));
                                            }
                                        }
                                        arrayListM2019Z = arrayList3;
                                    }
                                }
                            }
                            arrayList2 = arrayList4;
                            arrayListM2019Z = arrayList3;
                        } else {
                            c2080l3 = c2080lM3823d;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i5 = i8;
                            j6 = j7;
                        }
                        j7 = j6 >> 8;
                        i8 = i5 + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        c2080lM3823d = c2080l3;
                    }
                    c2080l2 = c2080lM3823d;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i7 != 8) {
                        break;
                    }
                } else {
                    c2080l2 = c2080lM3823d;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i6 == length) {
                    arrayList = arrayList2;
                    break;
                }
                i6++;
                jArr3 = jArr;
                objArr3 = objArr;
                c2080lM3823d = c2080l2;
            }
        } else {
            arrayList = null;
            arrayListM2019Z = null;
        }
        arrayList2 = arrayList;
        if (arrayList2 != null) {
            m3807v();
            int size = arrayList2.size();
            for (int i9 = 0; i9 < size; i9++) {
                C0882h c0882h = (C0882h) arrayList2.get(i9);
                InterfaceC2090v interfaceC2090v2 = (InterfaceC2090v) c0882h.f2769d;
                AbstractC2092x abstractC2092x = (AbstractC2092x) c0882h.f2770e;
                abstractC2092x.f7010a = j5;
                synchronized (AbstractC2082n.f6972c) {
                    abstractC2092x.f7011b = interfaceC2090v2.mo2410a();
                    interfaceC2090v2.mo2411c(abstractC2092x);
                }
            }
        }
        if (arrayListM2019Z != null) {
            int size2 = arrayListM2019Z.size();
            for (int i10 = 0; i10 < size2; i10++) {
                c2409f.m4290l((InterfaceC2090v) arrayListM2019Z.get(i10));
            }
            ArrayList arrayList6 = this.f6934i;
            if (arrayList6 != null) {
                arrayListM2019Z = AbstractC0973m.m2019Z(arrayList6, arrayListM2019Z);
            }
            this.f6934i = arrayListM2019Z;
        }
        return C2077i.f6950b;
    }
}
