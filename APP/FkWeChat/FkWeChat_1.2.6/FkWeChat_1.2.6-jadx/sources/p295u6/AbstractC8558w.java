package p295u6;

import ec.InterfaceC2193v0;
import io.ktor.utils.p131io.InterfaceC3468g;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p172l8.C4700i0;
import p215oc.InterfaceC5728w;
import p295u6.AbstractC8558w;

/* JADX INFO: renamed from: u6.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8558w {

    /* JADX INFO: renamed from: u6.w$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC8558w {

        /* JADX INFO: renamed from: a */
        public final InterfaceC5728w f28565a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5728w interfaceC5728w) {
            super(null);
            interfaceC5728w.getClass();
            this.f28565a = interfaceC5728w;
        }

        @Override // p295u6.AbstractC8558w
        /* JADX INFO: renamed from: a */
        public void mo32946a() {
            this.f28565a.close();
        }
    }

    /* JADX INFO: renamed from: u6.w$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC8558w {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2193v0 f28566a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC3468g f28567b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC2193v0 interfaceC2193v0, InterfaceC3468g interfaceC3468g) {
            super(null);
            interfaceC2193v0.getClass();
            interfaceC3468g.getClass();
            this.f28566a = interfaceC2193v0;
            this.f28567b = interfaceC3468g;
        }

        /* JADX INFO: renamed from: b */
        public static C4700i0 m32947b(b bVar, Throwable th) {
            if (th != null) {
                ((C8552q) bVar.f28566a.mo7916t()).m32914k();
            }
            return C4700i0.f13910a;
        }

        @Override // p295u6.AbstractC8558w
        /* JADX INFO: renamed from: a */
        public void mo32946a() {
            this.f28566a.mo7650D0(new InterfaceC0184l() { // from class: u6.x
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return AbstractC8558w.b.m32947b(this.f28569q, (Throwable) obj);
                }
            });
            AbstractC8560y.m32950a(this.f28567b);
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC3468g m32948c() {
            return this.f28567b;
        }

        /* JADX INFO: renamed from: d */
        public final InterfaceC2193v0 m32949d() {
            return this.f28566a;
        }
    }

    /* JADX INFO: renamed from: u6.w$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC8558w {

        /* JADX INFO: renamed from: a */
        public final InterfaceC5728w f28568a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC5728w interfaceC5728w) {
            super(null);
            interfaceC5728w.getClass();
            this.f28568a = interfaceC5728w;
        }

        @Override // p295u6.AbstractC8558w
        /* JADX INFO: renamed from: a */
        public void mo32946a() {
            this.f28568a.close();
        }
    }

    public /* synthetic */ AbstractC8558w(AbstractC1043k abstractC1043k) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo32946a();

    public AbstractC8558w() {
    }
}
