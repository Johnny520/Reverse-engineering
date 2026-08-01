package ec;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p024b9.AbstractC1061t;
import p172l8.C4700i0;
import p172l8.C4712s;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6324b;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6539h;

/* JADX INFO: renamed from: ec.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2124e {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5945b = AtomicIntegerFieldUpdater.newUpdater(C2124e.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a */
    public final InterfaceC2193v0[] f5946a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: renamed from: ec.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class a extends AbstractC2113b2 {

        /* JADX INFO: renamed from: x */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f5947x = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* JADX INFO: renamed from: u */
        public final InterfaceC2156m f5948u;

        /* JADX INFO: renamed from: v */
        public InterfaceC2126e1 f5949v;

        public a(InterfaceC2156m interfaceC2156m) {
            this.f5948u = interfaceC2156m;
        }

        /* JADX INFO: renamed from: A */
        public final b m7743A() {
            return (b) f5947x.get(this);
        }

        /* JADX INFO: renamed from: B */
        public final InterfaceC2126e1 m7744B() {
            InterfaceC2126e1 interfaceC2126e1 = this.f5949v;
            if (interfaceC2126e1 != null) {
                return interfaceC2126e1;
            }
            AbstractC1061t.m3851l("handle");
            return null;
        }

        /* JADX INFO: renamed from: D */
        public final void m7745D(b bVar) {
            f5947x.set(this, bVar);
        }

        /* JADX INFO: renamed from: E */
        public final void m7746E(InterfaceC2126e1 interfaceC2126e1) {
            this.f5949v = interfaceC2126e1;
        }

        @Override // ec.AbstractC2113b2
        /* JADX INFO: renamed from: w */
        public boolean mo7632w() {
            return false;
        }

        @Override // ec.AbstractC2113b2
        /* JADX INFO: renamed from: x */
        public void mo7633x(Throwable th) {
            if (th != null) {
                Object objMo7837z = this.f5948u.mo7837z(th);
                if (objMo7837z != null) {
                    this.f5948u.mo7832Q(objMo7837z);
                    b bVarM7743A = m7743A();
                    if (bVarM7743A != null) {
                        bVarM7743A.m7748b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C2124e.m7740d().decrementAndGet(C2124e.this) == 0) {
                InterfaceC2156m interfaceC2156m = this.f5948u;
                InterfaceC2193v0[] interfaceC2193v0Arr = C2124e.this.f5946a;
                ArrayList arrayList = new ArrayList(interfaceC2193v0Arr.length);
                for (InterfaceC2193v0 interfaceC2193v0 : interfaceC2193v0Arr) {
                    arrayList.add(interfaceC2193v0.mo7916t());
                }
                interfaceC2156m.resumeWith(C4712s.m18798b(arrayList));
            }
        }
    }

    /* JADX INFO: renamed from: ec.e$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class b implements InterfaceC2152l {

        /* JADX INFO: renamed from: a */
        public final a[] f5951a;

        public b(a[] aVarArr) {
            this.f5951a = aVarArr;
        }

        @Override // ec.InterfaceC2152l
        /* JADX INFO: renamed from: a */
        public void mo7747a(Throwable th) {
            m7748b();
        }

        /* JADX INFO: renamed from: b */
        public final void m7748b() {
            for (a aVar : this.f5951a) {
                aVar.m7744B().mo7628a();
            }
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f5951a + ']';
        }
    }

    public C2124e(InterfaceC2193v0[] interfaceC2193v0Arr) {
        this.f5946a = interfaceC2193v0Arr;
        this.notCompletedCount$volatile = interfaceC2193v0Arr.length;
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater m7740d() {
        return f5945b;
    }

    /* JADX INFO: renamed from: c */
    public final Object m7741c(InterfaceC5976f interfaceC5976f) {
        C2164o c2164o = new C2164o(AbstractC6324b.m24989d(interfaceC5976f), 1);
        c2164o.m7851E();
        int length = this.f5946a.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            InterfaceC2193v0 interfaceC2193v0 = this.f5946a[i10];
            interfaceC2193v0.start();
            a aVar = new a(c2164o);
            aVar.m7746E(AbstractC2108a2.m7615o(interfaceC2193v0, false, aVar, 1, null));
            C4700i0 c4700i0 = C4700i0.f13910a;
            aVarArr[i10] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].m7745D(bVar);
        }
        if (c2164o.mo7834l()) {
            bVar.m7748b();
        } else {
            AbstractC2172q.m7889c(c2164o, bVar);
        }
        Object objM7875w = c2164o.m7875w();
        if (objM7875w == AbstractC6325c.m24992g()) {
            AbstractC6539h.m25860c(interfaceC5976f);
        }
        return objM7875w;
    }
}
