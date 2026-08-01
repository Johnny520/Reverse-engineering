package p095T;

import p105V.C1483e;
import p117X2.AbstractC1665j;
import p158f0.AbstractC2074f;
import p158f0.AbstractC2082n;
import p158f0.AbstractC2092x;
import p158f0.InterfaceC2090v;
import p186k.AbstractC2412I;
import p186k.C2444z;

/* JADX INFO: renamed from: T.E */
/* JADX INFO: loaded from: classes.dex */
public final class C1309E extends AbstractC2092x {

    /* JADX INFO: renamed from: h */
    public static final Object f4674h = new Object();

    /* JADX INFO: renamed from: c */
    public long f4675c;

    /* JADX INFO: renamed from: d */
    public int f4676d;

    /* JADX INFO: renamed from: e */
    public C2444z f4677e;

    /* JADX INFO: renamed from: f */
    public Object f4678f;

    /* JADX INFO: renamed from: g */
    public int f4679g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1309E(long j5) {
        super(j5);
        C2444z c2444z = AbstractC2412I.f7812a;
        AbstractC1665j.m2983c(c2444z, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f4677e = c2444z;
        this.f4678f = f4674h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2092x
    /* JADX INFO: renamed from: a */
    public final void mo2405a(AbstractC2092x abstractC2092x) {
        AbstractC1665j.m2983c(abstractC2092x, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        C1309E c1309e = (C1309E) abstractC2092x;
        this.f4677e = c1309e.f4677e;
        this.f4678f = c1309e.f4678f;
        this.f4679g = c1309e.f4679g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p158f0.AbstractC2092x
    /* JADX INFO: renamed from: b */
    public final AbstractC2092x mo2406b(long j5) {
        return new C1309E(j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2407c(C1311F c1311f, AbstractC2074f abstractC2074f) {
        boolean z5;
        boolean z6;
        Object obj = AbstractC2082n.f6972c;
        synchronized (obj) {
            z5 = true;
            if (this.f4675c == abstractC2074f.mo3791g()) {
                z6 = this.f4676d != abstractC2074f.mo3804h();
            }
        }
        if (this.f4678f == f4674h || (z6 && this.f4679g != m2408d(c1311f, abstractC2074f))) {
            z5 = false;
        }
        if (!z5 || !z6) {
            return z5;
        }
        synchronized (obj) {
            this.f4675c = abstractC2074f.mo3791g();
            this.f4676d = abstractC2074f.mo3804h();
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m2408d(C1311F c1311f, AbstractC2074f abstractC2074f) throws Throwable {
        C2444z c2444z;
        int iIdentityHashCode;
        long[] jArr;
        int i5;
        long[] jArr2;
        int i6;
        int i7;
        AbstractC2092x abstractC2092xM2412g;
        synchronized (AbstractC2082n.f6972c) {
            c2444z = this.f4677e;
        }
        int i8 = 7;
        if (c2444z.f7902e == 0) {
            return 7;
        }
        C1483e c1483eM2623m = AbstractC1385s.m2623m();
        Object[] objArr = c1483eM2623m.f5181d;
        int i9 = c1483eM2623m.f5183f;
        for (int i10 = 0; i10 < i9; i10++) {
            ((C1381q) objArr[i10]).m2545b();
        }
        try {
            Object[] objArr2 = c2444z.f7899b;
            int[] iArr = c2444z.f7900c;
            long[] jArr3 = c2444z.f7898a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                iIdentityHashCode = 7;
                int i11 = 0;
                while (true) {
                    long j5 = jArr3[i11];
                    if ((((~j5) << i8) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8;
                        int i13 = 8 - ((~(i11 - length)) >>> 31);
                        int i14 = 0;
                        while (i14 < i13) {
                            if ((j5 & 255) < 128) {
                                int i15 = (i11 << 3) + i14;
                                Object obj = objArr2[i15];
                                i6 = i8;
                                int i16 = iArr[i15];
                                i7 = i12;
                                InterfaceC2090v interfaceC2090v = (InterfaceC2090v) obj;
                                if (i16 != 1) {
                                    jArr2 = jArr3;
                                } else {
                                    if (interfaceC2090v instanceof C1311F) {
                                        try {
                                            C1311F c1311f2 = (C1311F) interfaceC2090v;
                                            abstractC2092xM2412g = c1311f2.m2412g((C1309E) AbstractC2082n.m3833i(c1311f2.f4684g, abstractC2074f), abstractC2074f, false, c1311f2.f4682e);
                                        } catch (Throwable th) {
                                            th = th;
                                            Object[] objArr3 = c1483eM2623m.f5181d;
                                            int i17 = c1483eM2623m.f5183f;
                                            for (int i18 = 0; i18 < i17; i18++) {
                                                ((C1381q) objArr3[i18]).m2544a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        abstractC2092xM2412g = AbstractC2082n.m3833i(interfaceC2090v.mo2410a(), abstractC2074f);
                                    }
                                    jArr2 = jArr3;
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(abstractC2092xM2412g)) * 31) + Long.hashCode(abstractC2092xM2412g.f7010a);
                                }
                            } else {
                                jArr2 = jArr3;
                                i6 = i8;
                                i7 = i12;
                            }
                            j5 >>= i7;
                            i14++;
                            i8 = i6;
                            jArr3 = jArr2;
                            i12 = i7;
                        }
                        jArr = jArr3;
                        i5 = i8;
                        if (i13 != i12) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i5 = i8;
                    }
                    if (i11 == length) {
                        i8 = iIdentityHashCode;
                        break;
                    }
                    i11++;
                    i8 = i5;
                    jArr3 = jArr;
                }
            }
            iIdentityHashCode = i8;
            Object[] objArr4 = c1483eM2623m.f5181d;
            int i19 = c1483eM2623m.f5183f;
            for (int i20 = 0; i20 < i19; i20++) {
                ((C1381q) objArr4[i20]).m2544a();
            }
            return iIdentityHashCode;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
