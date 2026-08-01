package p034c7;

import p098g9.InterfaceC2556j;
import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: c7.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1360d0 {

    /* JADX INFO: renamed from: a */
    public static final a f4022a = a.f4023a;

    /* JADX INFO: renamed from: c7.d0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f4023a = new a();

        /* JADX INFO: renamed from: b */
        public static final InterfaceC1360d0 f4024b = C10072a.f4025b;

        /* JADX INFO: renamed from: c7.d0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10072a implements InterfaceC1360d0 {

            /* JADX INFO: renamed from: b */
            public static final C10072a f4025b = new C10072a();

            @Override // p034c7.InterfaceC1360d0
            /* JADX INFO: renamed from: a */
            public final Object mo5388a(C1353a c1353a, InterfaceC2556j interfaceC2556j, InterfaceC5976f interfaceC5976f) {
                throw new IllegalArgumentException("No module injector configured");
            }
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC1360d0 m5389a() {
            return f4024b;
        }
    }

    /* JADX INFO: renamed from: a */
    Object mo5388a(C1353a c1353a, InterfaceC2556j interfaceC2556j, InterfaceC5976f interfaceC5976f);
}
