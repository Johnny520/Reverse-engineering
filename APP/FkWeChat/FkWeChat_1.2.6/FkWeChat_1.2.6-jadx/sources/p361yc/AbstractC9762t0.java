package p361yc;

import p300uc.InterfaceC8647b;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9487e;
import p345xc.InterfaceC9488f;

/* JADX INFO: renamed from: yc.t0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9762t0 {

    /* JADX INFO: renamed from: yc.t0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC9732n0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC8647b f33037a;

        public a(InterfaceC8647b interfaceC8647b) {
            this.f33037a = interfaceC8647b;
        }

        @Override // p300uc.InterfaceC8647b, p300uc.InterfaceC8662p, p300uc.InterfaceC8645a
        /* JADX INFO: renamed from: a */
        public InterfaceC9218f mo15953a() {
            throw new IllegalStateException("unsupported");
        }

        @Override // p300uc.InterfaceC8662p
        /* JADX INFO: renamed from: b */
        public void mo15954b(InterfaceC9488f interfaceC9488f, Object obj) {
            interfaceC9488f.getClass();
            throw new IllegalStateException("unsupported");
        }

        @Override // p361yc.InterfaceC9732n0
        /* JADX INFO: renamed from: c */
        public InterfaceC8647b[] mo15955c() {
            return super.mo15955c();
        }

        @Override // p300uc.InterfaceC8645a
        /* JADX INFO: renamed from: d */
        public Object mo15956d(InterfaceC9487e interfaceC9487e) {
            interfaceC9487e.getClass();
            throw new IllegalStateException("unsupported");
        }

        @Override // p361yc.InterfaceC9732n0
        /* JADX INFO: renamed from: e */
        public InterfaceC8647b[] mo15957e() {
            return new InterfaceC8647b[]{this.f33037a};
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC9218f m38055a(String str, InterfaceC8647b interfaceC8647b) {
        str.getClass();
        interfaceC8647b.getClass();
        return new C9757s0(str, new a(interfaceC8647b));
    }
}
