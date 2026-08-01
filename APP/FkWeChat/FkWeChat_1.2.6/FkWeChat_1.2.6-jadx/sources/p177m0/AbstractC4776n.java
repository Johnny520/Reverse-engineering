package p177m0;

import p010a9.InterfaceC0173a;
import p015b0.InterfaceC0790j3;
import p135j2.InterfaceC3578w;
import p165l1.InterfaceC4507m;
import p190n0.AbstractC5396n1;
import p190n0.AbstractC5398n3;
import p190n0.InterfaceC5356g3;
import p190n0.InterfaceC5412q;
import p190n0.InterfaceC5455x0;
import p250r1.C6455e;

/* JADX INFO: renamed from: m0.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4776n {

    /* JADX INFO: renamed from: m0.n$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC5412q {

        /* JADX INFO: renamed from: a */
        public long f14195a = C6455e.f20314b.m25569c();

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0173a f14196b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC5356g3 f14197c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f14198d;

        public b(InterfaceC0173a interfaceC0173a, InterfaceC5356g3 interfaceC5356g3, long j10) {
            this.f14196b = interfaceC0173a;
            this.f14197c = interfaceC5356g3;
            this.f14198d = j10;
        }

        @Override // p190n0.InterfaceC5412q
        /* JADX INFO: renamed from: a */
        public boolean mo19131a(long j10) {
            InterfaceC3578w interfaceC3578w = (InterfaceC3578w) this.f14196b.invoke();
            if (interfaceC3578w == null) {
                return true;
            }
            InterfaceC5356g3 interfaceC5356g3 = this.f14197c;
            long j11 = this.f14198d;
            if (!interfaceC3578w.mo13245d() || !AbstractC5398n3.m21968c(interfaceC5356g3, j11)) {
                return false;
            }
            if (!interfaceC5356g3.mo21845i(interfaceC3578w, j10, this.f14195a, false, InterfaceC5455x0.f16784a.m22221g(), false)) {
                return true;
            }
            this.f14195a = j10;
            return true;
        }

        @Override // p190n0.InterfaceC5412q
        /* JADX INFO: renamed from: b */
        public void mo19132b() {
            this.f14197c.mo21840d();
        }

        @Override // p190n0.InterfaceC5412q
        /* JADX INFO: renamed from: c */
        public boolean mo19133c(long j10, InterfaceC5455x0 interfaceC5455x0, int i10) {
            InterfaceC3578w interfaceC3578w = (InterfaceC3578w) this.f14196b.invoke();
            if (interfaceC3578w == null) {
                return false;
            }
            InterfaceC5356g3 interfaceC5356g3 = this.f14197c;
            long j11 = this.f14198d;
            if (!interfaceC3578w.mo13245d()) {
                return false;
            }
            interfaceC5356g3.mo21842f(interfaceC3578w, j10, interfaceC5455x0, false);
            this.f14195a = j10;
            return AbstractC5398n3.m21968c(interfaceC5356g3, j11);
        }

        @Override // p190n0.InterfaceC5412q
        /* JADX INFO: renamed from: d */
        public boolean mo19134d(long j10, InterfaceC5455x0 interfaceC5455x0) {
            InterfaceC3578w interfaceC3578w = (InterfaceC3578w) this.f14196b.invoke();
            if (interfaceC3578w == null) {
                return true;
            }
            InterfaceC5356g3 interfaceC5356g3 = this.f14197c;
            long j11 = this.f14198d;
            if (!interfaceC3578w.mo13245d() || !AbstractC5398n3.m21968c(interfaceC5356g3, j11)) {
                return false;
            }
            if (!interfaceC5356g3.mo21845i(interfaceC3578w, j10, this.f14195a, false, interfaceC5455x0, false)) {
                return true;
            }
            this.f14195a = j10;
            return true;
        }

        @Override // p190n0.InterfaceC5412q
        /* JADX INFO: renamed from: e */
        public boolean mo19135e(long j10) {
            InterfaceC3578w interfaceC3578w = (InterfaceC3578w) this.f14196b.invoke();
            if (interfaceC3578w == null) {
                return false;
            }
            InterfaceC5356g3 interfaceC5356g3 = this.f14197c;
            long j11 = this.f14198d;
            if (!interfaceC3578w.mo13245d()) {
                return false;
            }
            if (interfaceC5356g3.mo21845i(interfaceC3578w, j10, this.f14195a, false, InterfaceC5455x0.f16784a.m22221g(), false)) {
                this.f14195a = j10;
            }
            return AbstractC5398n3.m21968c(interfaceC5356g3, j11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC4507m m19130b(InterfaceC5356g3 interfaceC5356g3, long j10, InterfaceC0173a interfaceC0173a) {
        a aVar = new a(interfaceC0173a, interfaceC5356g3, j10);
        return AbstractC5396n1.m21961l(InterfaceC4507m.f13080a, new b(interfaceC0173a, interfaceC5356g3, j10), aVar);
    }

    /* JADX INFO: renamed from: m0.n$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0790j3 {

        /* JADX INFO: renamed from: a */
        public long f14190a;

        /* JADX INFO: renamed from: b */
        public long f14191b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC0173a f14192c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ InterfaceC5356g3 f14193d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ long f14194e;

        public a(InterfaceC0173a interfaceC0173a, InterfaceC5356g3 interfaceC5356g3, long j10) {
            this.f14192c = interfaceC0173a;
            this.f14193d = interfaceC5356g3;
            this.f14194e = j10;
            C6455e.a aVar = C6455e.f20314b;
            this.f14190a = aVar.m25569c();
            this.f14191b = aVar.m25569c();
        }

        @Override // p015b0.InterfaceC0790j3
        /* JADX INFO: renamed from: b */
        public void mo2964b(long j10) {
            InterfaceC3578w interfaceC3578w = (InterfaceC3578w) this.f14192c.invoke();
            if (interfaceC3578w != null) {
                InterfaceC5356g3 interfaceC5356g3 = this.f14193d;
                if (!interfaceC3578w.mo13245d()) {
                    return;
                }
                interfaceC5356g3.mo21842f(interfaceC3578w, j10, InterfaceC5455x0.f16784a.m22223i(), true);
                this.f14190a = j10;
            }
            if (AbstractC5398n3.m21968c(this.f14193d, this.f14194e)) {
                this.f14191b = C6455e.f20314b.m25569c();
            }
        }

        @Override // p015b0.InterfaceC0790j3
        /* JADX INFO: renamed from: c */
        public void mo2965c() {
            if (AbstractC5398n3.m21968c(this.f14193d, this.f14194e)) {
                this.f14193d.mo21840d();
            }
        }

        @Override // p015b0.InterfaceC0790j3
        /* JADX INFO: renamed from: e */
        public void mo2967e(long j10) {
            InterfaceC3578w interfaceC3578w = (InterfaceC3578w) this.f14192c.invoke();
            if (interfaceC3578w != null) {
                InterfaceC5356g3 interfaceC5356g3 = this.f14193d;
                long j11 = this.f14194e;
                if (interfaceC3578w.mo13245d() && AbstractC5398n3.m21968c(interfaceC5356g3, j11)) {
                    long jM25563q = C6455e.m25563q(this.f14191b, j10);
                    this.f14191b = jM25563q;
                    long jM25563q2 = C6455e.m25563q(this.f14190a, jM25563q);
                    if (interfaceC5356g3.mo21845i(interfaceC3578w, jM25563q2, this.f14190a, false, InterfaceC5455x0.f16784a.m22223i(), true)) {
                        this.f14190a = jM25563q2;
                        this.f14191b = C6455e.f20314b.m25569c();
                    }
                }
            }
        }

        @Override // p015b0.InterfaceC0790j3
        public void onCancel() {
            if (AbstractC5398n3.m21968c(this.f14193d, this.f14194e)) {
                this.f14193d.mo21840d();
            }
        }

        @Override // p015b0.InterfaceC0790j3
        /* JADX INFO: renamed from: d */
        public void mo2966d() {
        }

        @Override // p015b0.InterfaceC0790j3
        /* JADX INFO: renamed from: a */
        public void mo2963a(long j10) {
        }
    }
}
