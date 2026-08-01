package p057e1;

import androidx.compose.runtime.C0575r2;
import androidx.compose.runtime.InterfaceC0502h;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.C1046l0;
import p117i.C3076o0;
import p172l8.C4700i0;

/* JADX INFO: renamed from: e1.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1977e {

    /* JADX INFO: renamed from: b */
    public Throwable f5491b;

    /* JADX INFO: renamed from: d */
    public C3076o0 f5493d;

    /* JADX INFO: renamed from: e */
    public C3076o0 f5494e;

    /* JADX INFO: renamed from: a */
    public final Object f5490a = new Object();

    /* JADX INFO: renamed from: c */
    public final C1974c f5492c = AbstractC1970a.m7125b();

    /* JADX INFO: renamed from: e1.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public abstract void mo1656a();

        /* JADX INFO: renamed from: b */
        public abstract void mo1657b(Throwable th);
    }

    public C1977e() {
        int i10 = 0;
        int i11 = 1;
        AbstractC1043k abstractC1043k = null;
        this.f5493d = new C3076o0(i10, i11, abstractC1043k);
        this.f5494e = new C3076o0(i10, i11, abstractC1043k);
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m7143a(a aVar, C1977e c1977e, C1046l0 c1046l0) {
        int i10;
        aVar.mo1656a();
        C1974c c1974c = c1977e.f5492c;
        int i11 = c1046l0.f3205q;
        do {
            i10 = c1974c.get();
        } while (!c1974c.compareAndSet(i10, ((i10 >>> 27) & 15) == i11 ? i10 - 1 : i10));
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0502h m7144b(final a aVar, InterfaceC0173a interfaceC0173a) {
        int i10;
        int i11;
        final C1046l0 c1046l0 = new C1046l0();
        c1046l0.f3205q = -1;
        synchronized (this.f5490a) {
            Throwable th = this.f5491b;
            if (th != null) {
                aVar.mo1657b(th);
                return InterfaceC0502h.f1384a.m1690b();
            }
            C1974c c1974c = this.f5492c;
            do {
                i10 = c1974c.get();
                i11 = i10 + 1;
            } while (!c1974c.compareAndSet(i10, i11));
            boolean z10 = true;
            if ((134217727 & i11) != 1) {
                z10 = false;
            }
            c1046l0.f3205q = (i11 >>> 27) & 15;
            this.f5493d.m11461n(aVar);
            if (z10 && interfaceC0173a != null) {
                try {
                    interfaceC0173a.invoke();
                } catch (Throwable th2) {
                    m7145c(th2);
                }
            }
            return new C0575r2(new InterfaceC0173a() { // from class: e1.d
                @Override // p010a9.InterfaceC0173a
                public final Object invoke() {
                    return C1977e.m7143a(aVar, this, c1046l0);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7145c(Throwable th) {
        int i10;
        synchronized (this.f5490a) {
            try {
                if (this.f5491b != null) {
                    return;
                }
                this.f5491b = th;
                C3076o0 c3076o0 = this.f5493d;
                Object[] objArr = c3076o0.f8235a;
                int i11 = c3076o0.f8236b;
                for (int i12 = 0; i12 < i11; i12++) {
                    ((a) objArr[i12]).mo1657b(th);
                }
                this.f5493d.m11468u();
                C1974c c1974c = this.f5492c;
                do {
                    i10 = c1974c.get();
                } while (!c1974c.compareAndSet(i10, AbstractC1970a.m7127d(c1974c, ((i10 >>> 27) & 15) + 1, 0)));
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7146d(InterfaceC0184l interfaceC0184l) {
        int i10;
        int i11;
        synchronized (this.f5490a) {
            try {
                C3076o0 c3076o0 = this.f5493d;
                this.f5493d = this.f5494e;
                this.f5494e = c3076o0;
                C1974c c1974c = this.f5492c;
                do {
                    i10 = c1974c.get();
                } while (!c1974c.compareAndSet(i10, AbstractC1970a.m7127d(c1974c, ((i10 >>> 27) & 15) + 1, 0)));
                int iM11587e = c3076o0.m11587e();
                for (i11 = 0; i11 < iM11587e; i11++) {
                    interfaceC0184l.mo27m(c3076o0.m11586d(i11));
                }
                c3076o0.m11468u();
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m7147e() {
        return (this.f5492c.get() & 134217727) > 0;
    }
}
