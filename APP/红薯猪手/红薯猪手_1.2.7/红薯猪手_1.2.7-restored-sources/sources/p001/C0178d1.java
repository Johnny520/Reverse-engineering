package p001;

/* JADX INFO: renamed from: ۟.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0178d1 {

    /* JADX INFO: renamed from: ۥ */
    public static final C0286kb f750 = new C0286kb(a.f752);

    /* JADX INFO: renamed from: ۥ۟ */
    public static InterfaceC0451x3 f751;

    /* JADX INFO: renamed from: ۟.d1$a */
    public static final class a extends AbstractC0335o4 implements InterfaceC0208f3<InterfaceC0451x3> {

        /* JADX INFO: renamed from: ۥ */
        public static final a f752 = new a();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final InterfaceC0451x3 mo7() {
            InterfaceC0451x3 interfaceC0451x3 = C0178d1.f751;
            if (interfaceC0451x3 != null) {
                return interfaceC0451x3;
            }
            throw new NullPointerException("data center is null,please call init() first");
        }
    }

    /* JADX INFO: renamed from: ۟.d1$b */
    public static final class b {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: ۥ */
        public static InterfaceC0451x3 m841() {
            return (InterfaceC0451x3) C0178d1.f750.m886();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static void m842(C0201ea c0201ea) {
            "impl";
            C0178d1.f751 = c0201ea;
        }
    }
}
