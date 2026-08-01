package p229p9;

/* JADX INFO: renamed from: p9.g1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6003g1 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC6003g1 f18958a = new a();

    /* JADX INFO: renamed from: p9.g1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a implements InterfaceC6003g1 {
        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m24012d(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        @Override // p229p9.InterfaceC6003g1
        /* JADX INFO: renamed from: a */
        public InterfaceC6006h1 mo10689a() {
            InterfaceC6006h1 interfaceC6006h1 = InterfaceC6006h1.f18959a;
            if (interfaceC6006h1 == null) {
                m24012d(0);
            }
            return interfaceC6006h1;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    /* JADX INFO: renamed from: a */
    InterfaceC6006h1 mo10689a();
}
