package androidx.compose.runtime;

import ec.C2164o;
import ec.InterfaceC2156m;
import java.util.ArrayList;
import java.util.List;
import p010a9.InterfaceC0184l;
import p172l8.C4700i0;
import p172l8.C4712s;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6324b;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6539h;

/* JADX INFO: renamed from: androidx.compose.runtime.t1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0592t1 {

    /* JADX INFO: renamed from: a */
    public final Object f1603a = new Object();

    /* JADX INFO: renamed from: b */
    public List f1604b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public List f1605c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f1606d = true;

    /* JADX INFO: renamed from: androidx.compose.runtime.t1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC2156m f1608r;

        public a(InterfaceC2156m interfaceC2156m) {
            this.f1608r = interfaceC2156m;
        }

        /* JADX INFO: renamed from: a */
        public final void m2224a(Throwable th) {
            Object obj = C0592t1.this.f1603a;
            C0592t1 c0592t1 = C0592t1.this;
            InterfaceC2156m interfaceC2156m = this.f1608r;
            synchronized (obj) {
                c0592t1.f1604b.remove(interfaceC2156m);
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m2224a((Throwable) obj);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m2220c(InterfaceC5976f interfaceC5976f) {
        if (m2222e()) {
            return C4700i0.f13910a;
        }
        C2164o c2164o = new C2164o(AbstractC6324b.m24989d(interfaceC5976f), 1);
        c2164o.m7851E();
        synchronized (this.f1603a) {
            this.f1604b.add(c2164o);
        }
        c2164o.mo7830B(new a(c2164o));
        Object objM7875w = c2164o.m7875w();
        if (objM7875w == AbstractC6325c.m24992g()) {
            AbstractC6539h.m25860c(interfaceC5976f);
        }
        return objM7875w == AbstractC6325c.m24992g() ? objM7875w : C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: d */
    public final void m2221d() {
        synchronized (this.f1603a) {
            this.f1606d = false;
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2222e() {
        boolean z10;
        synchronized (this.f1603a) {
            z10 = this.f1606d;
        }
        return z10;
    }

    /* JADX INFO: renamed from: f */
    public final void m2223f() {
        synchronized (this.f1603a) {
            try {
                if (m2222e()) {
                    return;
                }
                List list = this.f1604b;
                this.f1604b = this.f1605c;
                this.f1605c = list;
                this.f1606d = true;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    InterfaceC5976f interfaceC5976f = (InterfaceC5976f) list.get(i10);
                    C4712s.a aVar = C4712s.f13928r;
                    interfaceC5976f.resumeWith(C4712s.m18798b(C4700i0.f13910a));
                }
                list.clear();
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
