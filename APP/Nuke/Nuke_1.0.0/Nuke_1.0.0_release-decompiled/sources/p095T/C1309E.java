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

    public C1309E(long j5) {
        super(j5);
        C2444z c2444z = AbstractC2412I.f7812a;
        AbstractC1665j.m2983c(c2444z, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.f4677e = c2444z;
        this.f4678f = f4674h;
    }

    @Override // p158f0.AbstractC2092x
    /* JADX INFO: renamed from: a */
    public final void mo2405a(AbstractC2092x abstractC2092x) {
        AbstractC1665j.m2983c(abstractC2092x, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        C1309E c1309e = (C1309E) abstractC2092x;
        this.f4677e = c1309e.f4677e;
        this.f4678f = c1309e.f4678f;
        this.f4679g = c1309e.f4679g;
    }

    @Override // p158f0.AbstractC2092x
    /* JADX INFO: renamed from: b */
    public final AbstractC2092x mo2406b(long j5) {
        return new C1309E(j5);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2407c(p095T.C1311F r7, p158f0.AbstractC2074f r8) {
        /*
            r6 = this;
            java.lang.Object r0 = p158f0.AbstractC2082n.f6972c
            monitor-enter(r0)
            long r1 = r6.f4675c     // Catch: java.lang.Throwable -> L1a
            long r3 = r8.mo3791g()     // Catch: java.lang.Throwable -> L1a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L1c
            int r1 = r6.f4676d     // Catch: java.lang.Throwable -> L1a
            int r4 = r8.mo3804h()     // Catch: java.lang.Throwable -> L1a
            if (r1 == r4) goto L18
            goto L1c
        L18:
            r1 = r3
            goto L1d
        L1a:
            r7 = move-exception
            goto L47
        L1c:
            r1 = r2
        L1d:
            monitor-exit(r0)
            java.lang.Object r4 = r6.f4678f
            java.lang.Object r5 = p095T.C1309E.f4674h
            if (r4 == r5) goto L2f
            if (r1 == 0) goto L30
            int r4 = r6.f4679g
            int r7 = r6.m2408d(r7, r8)
            if (r4 != r7) goto L2f
            goto L30
        L2f:
            r2 = r3
        L30:
            if (r2 == 0) goto L46
            if (r1 == 0) goto L46
            monitor-enter(r0)
            long r3 = r8.mo3791g()     // Catch: java.lang.Throwable -> L43
            r6.f4675c = r3     // Catch: java.lang.Throwable -> L43
            int r7 = r8.mo3804h()     // Catch: java.lang.Throwable -> L43
            r6.f4676d = r7     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            return r2
        L43:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L46:
            return r2
        L47:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p095T.C1309E.m2407c(T.F, f0.f):boolean");
    }

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
