package ec;

import ec.InterfaceC2198w1;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import p010a9.InterfaceC0184l;
import p024b9.C1055q;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6325c;
import p314vb.C8897d;

/* JADX INFO: renamed from: ec.a2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2108a2 {

    /* JADX INFO: renamed from: ec.a2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a extends C1055q implements InterfaceC0184l {
        public a(Object obj) {
            super(1, obj, AbstractC2113b2.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m7617y((Throwable) obj);
            return C4700i0.f13910a;
        }

        /* JADX INFO: renamed from: y */
        public final void m7617y(Throwable th) {
            ((AbstractC2113b2) this.f3190r).mo7633x(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2208z m7601a(InterfaceC2198w1 interfaceC2198w1) {
        return new C2206y1(interfaceC2198w1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC2208z m7602b(InterfaceC2198w1 interfaceC2198w1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC2198w1 = null;
        }
        return AbstractC2210z1.m7948a(interfaceC2198w1);
    }

    /* JADX INFO: renamed from: c */
    public static final void m7603c(InterfaceC2198w1 interfaceC2198w1, String str, Throwable th) {
        interfaceC2198w1.mo7696n(AbstractC2162n1.m7845a(str, th));
    }

    /* JADX INFO: renamed from: d */
    public static final void m7604d(InterfaceC5980j interfaceC5980j, CancellationException cancellationException) {
        InterfaceC2198w1 interfaceC2198w1 = (InterfaceC2198w1) interfaceC5980j.mo1654h(InterfaceC2198w1.f6022g);
        if (interfaceC2198w1 != null) {
            interfaceC2198w1.mo7696n(cancellationException);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m7605e(InterfaceC2198w1 interfaceC2198w1, String str, Throwable th, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th = null;
        }
        AbstractC2210z1.m7950c(interfaceC2198w1, str, th);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m7606f(InterfaceC5980j interfaceC5980j, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        AbstractC2210z1.m7951d(interfaceC5980j, cancellationException);
    }

    /* JADX INFO: renamed from: g */
    public static final Object m7607g(InterfaceC2198w1 interfaceC2198w1, InterfaceC5976f interfaceC5976f) {
        InterfaceC2198w1.a.m7920a(interfaceC2198w1, null, 1, null);
        Object objMo7657J0 = interfaceC2198w1.mo7657J0(interfaceC5976f);
        return objMo7657J0 == AbstractC6325c.m24992g() ? objMo7657J0 : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m7608h(InterfaceC2198w1 interfaceC2198w1, CancellationException cancellationException) {
        Iterator it = interfaceC2198w1.mo7686f().iterator();
        while (it.hasNext()) {
            ((InterfaceC2198w1) it.next()).mo7696n(cancellationException);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m7609i(InterfaceC2198w1 interfaceC2198w1, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        AbstractC2210z1.m7955h(interfaceC2198w1, cancellationException);
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC2126e1 m7610j(InterfaceC2198w1 interfaceC2198w1, InterfaceC2126e1 interfaceC2126e1) {
        return m7615o(interfaceC2198w1, false, new C2134g1(interfaceC2126e1), 1, null);
    }

    /* JADX INFO: renamed from: k */
    public static final void m7611k(InterfaceC2198w1 interfaceC2198w1) {
        if (!interfaceC2198w1.mo7586c()) {
            throw interfaceC2198w1.mo7669T();
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m7612l(InterfaceC5980j interfaceC5980j) {
        InterfaceC2198w1 interfaceC2198w1 = (InterfaceC2198w1) interfaceC5980j.mo1654h(InterfaceC2198w1.f6022g);
        if (interfaceC2198w1 != null) {
            AbstractC2210z1.m7958k(interfaceC2198w1);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final InterfaceC2198w1 m7613m(InterfaceC5980j interfaceC5980j) {
        InterfaceC2198w1 interfaceC2198w1 = (InterfaceC2198w1) interfaceC5980j.mo1654h(InterfaceC2198w1.f6022g);
        if (interfaceC2198w1 != null) {
            return interfaceC2198w1;
        }
        C8897d.m34134a("Current context doesn't contain Job in it: ", interfaceC5980j);
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static final InterfaceC2126e1 m7614n(InterfaceC2198w1 interfaceC2198w1, boolean z10, AbstractC2113b2 abstractC2113b2) {
        return interfaceC2198w1 instanceof C2118c2 ? ((C2118c2) interfaceC2198w1).m7704z0(z10, abstractC2113b2) : interfaceC2198w1.mo7697n0(abstractC2113b2.mo7632w(), z10, new a(abstractC2113b2));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ InterfaceC2126e1 m7615o(InterfaceC2198w1 interfaceC2198w1, boolean z10, AbstractC2113b2 abstractC2113b2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return AbstractC2210z1.m7961n(interfaceC2198w1, z10, abstractC2113b2);
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m7616p(InterfaceC5980j interfaceC5980j) {
        InterfaceC2198w1 interfaceC2198w1 = (InterfaceC2198w1) interfaceC5980j.mo1654h(InterfaceC2198w1.f6022g);
        if (interfaceC2198w1 != null) {
            return interfaceC2198w1.mo7586c();
        }
        return true;
    }
}
