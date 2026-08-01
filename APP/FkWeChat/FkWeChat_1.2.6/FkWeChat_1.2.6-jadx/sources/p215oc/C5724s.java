package p215oc;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p024b9.AbstractC1061t;
import p080f9.AbstractC2368o;
import p097g8.AbstractC2543b;
import p299ub.AbstractC8644z;
import p376zd.C9987e;

/* JADX INFO: renamed from: oc.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5724s {

    /* JADX INFO: renamed from: a */
    public static final C5724s f18059a = new C5724s();

    /* JADX INFO: renamed from: b */
    public static final int f18060b = 65536;

    /* JADX INFO: renamed from: c */
    public static final C5721p f18061c = C5721p.f18051h.m23168b(new byte[0], 0, 0, null, false);

    /* JADX INFO: renamed from: d */
    public static final int f18062d;

    /* JADX INFO: renamed from: e */
    public static final int f18063e;

    /* JADX INFO: renamed from: f */
    public static final String f18064f;

    /* JADX INFO: renamed from: g */
    public static final int f18065g;

    /* JADX INFO: renamed from: h */
    public static final int f18066h;

    /* JADX INFO: renamed from: i */
    public static final AtomicReferenceArray f18067i;

    /* JADX INFO: renamed from: j */
    public static final AtomicReferenceArray f18068j;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f18062d = iHighestOneBit;
        int iM8578e = AbstractC2368o.m8578e(iHighestOneBit / 2, 1);
        f18063e = iM8578e;
        String str = AbstractC1061t.m3842c(System.getProperty("java.vm.name"), "Dalvik") ? "0" : "4194304";
        f18064f = str;
        String property = System.getProperty("kotlinx.io.pool.size.bytes", str);
        property.getClass();
        Integer numM33252s = AbstractC8644z.m33252s(property);
        int iM8578e2 = numM33252s != null ? AbstractC2368o.m8578e(numM33252s.intValue(), 0) : 0;
        f18065g = iM8578e2;
        f18066h = AbstractC2368o.m8578e(iM8578e2 / iM8578e, 8192);
        f18067i = new AtomicReferenceArray(iHighestOneBit);
        f18068j = new AtomicReferenceArray(iM8578e);
    }

    /* JADX INFO: renamed from: d */
    public static final void m23171d(C5721p c5721p) {
        c5721p.getClass();
        if (c5721p.m23145e() != null || c5721p.m23147g() != null) {
            C9987e.m38645a("Failed requirement.");
            return;
        }
        AbstractC5722q abstractC5722qM23143c = c5721p.m23143c();
        if (abstractC5722qM23143c != null && abstractC5722qM23143c.mo23136c()) {
            return;
        }
        AtomicReferenceArray atomicReferenceArray = f18067i;
        int iM23177b = f18059a.m23177b();
        c5721p.m23158r(0);
        c5721p.f18056e = true;
        while (true) {
            C5721p c5721p2 = (C5721p) atomicReferenceArray.get(iM23177b);
            if (c5721p2 != f18061c) {
                int iM23144d = c5721p2 != null ? c5721p2.m23144d() : 0;
                if (iM23144d >= f18060b) {
                    if (f18065g > 0) {
                        m23172e(c5721p);
                        return;
                    }
                    return;
                } else {
                    c5721p.m23157q(c5721p2);
                    c5721p.m23156p(iM23144d + 8192);
                    if (AbstractC2543b.m9063a(atomicReferenceArray, iM23177b, c5721p2, c5721p)) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m23172e(C5721p c5721p) {
        c5721p.m23158r(0);
        c5721p.f18056e = true;
        int iM23178c = f18059a.m23178c();
        AtomicReferenceArray atomicReferenceArray = f18068j;
        int i10 = 0;
        while (true) {
            C5721p c5721p2 = (C5721p) atomicReferenceArray.get(iM23178c);
            if (c5721p2 != f18061c) {
                int iM23144d = (c5721p2 != null ? c5721p2.m23144d() : 0) + 8192;
                if (iM23144d > f18066h) {
                    int i11 = f18063e;
                    if (i10 >= i11) {
                        return;
                    }
                    i10++;
                    iM23178c = (iM23178c + 1) & (i11 - 1);
                } else {
                    c5721p.m23157q(c5721p2);
                    c5721p.m23156p(iM23144d);
                    if (AbstractC2543b.m9063a(atomicReferenceArray, iM23178c, c5721p2, c5721p)) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static final C5721p m23173f() {
        C5721p c5721p;
        C5721p c5721p2;
        AtomicReferenceArray atomicReferenceArray = f18067i;
        int iM23177b = f18059a.m23177b();
        do {
            c5721p = f18061c;
            c5721p2 = (C5721p) atomicReferenceArray.getAndSet(iM23177b, c5721p);
        } while (AbstractC1061t.m3842c(c5721p2, c5721p));
        if (c5721p2 == null) {
            atomicReferenceArray.set(iM23177b, null);
            return f18065g > 0 ? m23174g() : C5721p.f18051h.m23167a();
        }
        atomicReferenceArray.set(iM23177b, c5721p2.m23145e());
        c5721p2.m23157q(null);
        c5721p2.m23156p(0);
        return c5721p2;
    }

    /* JADX INFO: renamed from: g */
    public static final C5721p m23174g() {
        AtomicReferenceArray atomicReferenceArray = f18068j;
        int iM23178c = f18059a.m23178c();
        int i10 = 0;
        while (true) {
            C5721p c5721p = f18061c;
            C5721p c5721p2 = (C5721p) atomicReferenceArray.getAndSet(iM23178c, c5721p);
            if (!AbstractC1061t.m3842c(c5721p2, c5721p)) {
                if (c5721p2 != null) {
                    atomicReferenceArray.set(iM23178c, c5721p2.m23145e());
                    c5721p2.m23157q(null);
                    c5721p2.m23156p(0);
                    return c5721p2;
                }
                atomicReferenceArray.set(iM23178c, null);
                int i11 = f18063e;
                if (i10 >= i11) {
                    return C5721p.f18051h.m23167a();
                }
                iM23178c = (iM23178c + 1) & (i11 - 1);
                i10++;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static final AbstractC5722q m23175h() {
        return new C5720o();
    }

    /* JADX INFO: renamed from: a */
    public final int m23176a(long j10) {
        return (int) (j10 & Thread.currentThread().getId());
    }

    /* JADX INFO: renamed from: b */
    public final int m23177b() {
        return m23176a(((long) f18062d) - 1);
    }

    /* JADX INFO: renamed from: c */
    public final int m23178c() {
        return m23176a(((long) f18063e) - 1);
    }
}
