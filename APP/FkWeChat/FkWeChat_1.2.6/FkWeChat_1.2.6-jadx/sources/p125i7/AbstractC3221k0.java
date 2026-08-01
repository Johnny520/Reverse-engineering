package p125i7;

/* JADX INFO: renamed from: i7.k0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3221k0 {

    /* JADX INFO: renamed from: i7.k0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC3219j0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC3219j0 f8621a;

        /* JADX INFO: renamed from: b */
        public final int f8622b;

        public a(InterfaceC3219j0 interfaceC3219j0, int i10) {
            this.f8621a = interfaceC3219j0;
            this.f8622b = i10;
        }

        @Override // p125i7.InterfaceC3219j0
        /* JADX INFO: renamed from: a */
        public int mo12226a() {
            return this.f8622b;
        }

        @Override // p125i7.InterfaceC3219j0
        /* JADX INFO: renamed from: b */
        public String mo12227b() {
            return this.f8621a.mo12227b();
        }

        @Override // p125i7.InterfaceC3219j0
        public C3234r getType() {
            return this.f8621a.getType();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC3219j0 m12240a(InterfaceC3219j0 interfaceC3219j0, int i10) {
        interfaceC3219j0.getClass();
        return new a(interfaceC3219j0, i10);
    }
}
