package p145jc;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: jc.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3819m0 {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11001b = AtomicIntegerFieldUpdater.newUpdater(C3819m0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a */
    public InterfaceC3821n0[] f11002a;

    /* JADX INFO: renamed from: a */
    public final void m15203a(InterfaceC3821n0 interfaceC3821n0) {
        interfaceC3821n0.mo7808c(this);
        InterfaceC3821n0[] interfaceC3821n0ArrM15208g = m15208g();
        int iM15205c = m15205c();
        m15212k(iM15205c + 1);
        interfaceC3821n0ArrM15208g[iM15205c] = interfaceC3821n0;
        interfaceC3821n0.setIndex(iM15205c);
        m15214m(iM15205c);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC3821n0 m15204b() {
        InterfaceC3821n0[] interfaceC3821n0Arr = this.f11002a;
        if (interfaceC3821n0Arr != null) {
            return interfaceC3821n0Arr[0];
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m15205c() {
        return f11001b.get(this);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m15206e() {
        return m15205c() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC3821n0 m15207f() {
        InterfaceC3821n0 interfaceC3821n0M15204b;
        synchronized (this) {
            interfaceC3821n0M15204b = m15204b();
        }
        return interfaceC3821n0M15204b;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC3821n0[] m15208g() {
        InterfaceC3821n0[] interfaceC3821n0Arr = this.f11002a;
        if (interfaceC3821n0Arr == null) {
            InterfaceC3821n0[] interfaceC3821n0Arr2 = new InterfaceC3821n0[4];
            this.f11002a = interfaceC3821n0Arr2;
            return interfaceC3821n0Arr2;
        }
        if (m15205c() < interfaceC3821n0Arr.length) {
            return interfaceC3821n0Arr;
        }
        InterfaceC3821n0[] interfaceC3821n0Arr3 = (InterfaceC3821n0[]) Arrays.copyOf(interfaceC3821n0Arr, m15205c() * 2);
        this.f11002a = interfaceC3821n0Arr3;
        return interfaceC3821n0Arr3;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m15209h(InterfaceC3821n0 interfaceC3821n0) {
        boolean z10;
        synchronized (this) {
            if (interfaceC3821n0.mo7809g() == null) {
                z10 = false;
            } else {
                m15210i(interfaceC3821n0.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p145jc.InterfaceC3821n0 m15210i(int r6) {
        /*
            r5 = this;
            jc.n0[] r0 = r5.f11002a
            r0.getClass()
            int r1 = r5.m15205c()
            r2 = -1
            int r1 = r1 + r2
            r5.m15212k(r1)
            int r1 = r5.m15205c()
            if (r6 >= r1) goto L3d
            int r1 = r5.m15205c()
            r5.m15215n(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            r3.getClass()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            r4.getClass()
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.m15215n(r6, r1)
            r5.m15214m(r1)
            goto L3d
        L3a:
            r5.m15213l(r6)
        L3d:
            int r6 = r5.m15205c()
            r6 = r0[r6]
            r6.getClass()
            r1 = 0
            r6.mo7808c(r1)
            r6.setIndex(r2)
            int r2 = r5.m15205c()
            r0[r2] = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p145jc.C3819m0.m15210i(int):jc.n0");
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC3821n0 m15211j() {
        InterfaceC3821n0 interfaceC3821n0M15210i;
        synchronized (this) {
            interfaceC3821n0M15210i = m15205c() > 0 ? m15210i(0) : null;
        }
        return interfaceC3821n0M15210i;
    }

    /* JADX INFO: renamed from: k */
    public final void m15212k(int i10) {
        f11001b.set(this, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m15213l(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.m15205c()
            if (r1 < r2) goto Lb
            goto L3e
        Lb:
            jc.n0[] r2 = r5.f11002a
            r2.getClass()
            int r0 = r0 + 2
            int r3 = r5.m15205c()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            r3.getClass()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            r4.getClass()
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            r1.getClass()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            r2.getClass()
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
        L3e:
            return
        L3f:
            r5.m15215n(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: p145jc.C3819m0.m15213l(int):void");
    }

    /* JADX INFO: renamed from: m */
    public final void m15214m(int i10) {
        while (i10 > 0) {
            InterfaceC3821n0[] interfaceC3821n0Arr = this.f11002a;
            interfaceC3821n0Arr.getClass();
            int i11 = (i10 - 1) / 2;
            InterfaceC3821n0 interfaceC3821n0 = interfaceC3821n0Arr[i11];
            interfaceC3821n0.getClass();
            InterfaceC3821n0 interfaceC3821n02 = interfaceC3821n0Arr[i10];
            interfaceC3821n02.getClass();
            if (((Comparable) interfaceC3821n0).compareTo(interfaceC3821n02) <= 0) {
                return;
            }
            m15215n(i10, i11);
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m15215n(int i10, int i11) {
        InterfaceC3821n0[] interfaceC3821n0Arr = this.f11002a;
        interfaceC3821n0Arr.getClass();
        InterfaceC3821n0 interfaceC3821n0 = interfaceC3821n0Arr[i11];
        interfaceC3821n0.getClass();
        InterfaceC3821n0 interfaceC3821n02 = interfaceC3821n0Arr[i10];
        interfaceC3821n02.getClass();
        interfaceC3821n0Arr[i10] = interfaceC3821n0;
        interfaceC3821n0Arr[i11] = interfaceC3821n02;
        interfaceC3821n0.setIndex(i10);
        interfaceC3821n02.setIndex(i11);
    }
}
