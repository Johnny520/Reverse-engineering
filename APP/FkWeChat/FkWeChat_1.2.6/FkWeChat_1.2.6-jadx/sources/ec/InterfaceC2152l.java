package ec;

import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: ec.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2152l extends InterfaceC2151k2 {

    /* JADX INFO: renamed from: ec.l$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC2152l {

        /* JADX INFO: renamed from: a */
        public final InterfaceC0184l f5981a;

        public a(InterfaceC0184l interfaceC0184l) {
            this.f5981a = interfaceC0184l;
        }

        @Override // ec.InterfaceC2152l
        /* JADX INFO: renamed from: a */
        public void mo7747a(Throwable th) {
            this.f5981a.mo27m(th);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + AbstractC2181s0.m7898a(this.f5981a) + '@' + AbstractC2181s0.m7899b(this) + ']';
        }
    }

    /* JADX INFO: renamed from: a */
    void mo7747a(Throwable th);
}
