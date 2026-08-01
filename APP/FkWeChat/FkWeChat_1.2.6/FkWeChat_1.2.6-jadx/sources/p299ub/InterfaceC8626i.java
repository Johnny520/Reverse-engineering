package p299ub;

import java.util.List;
import p080f9.C2363j;

/* JADX INFO: renamed from: ub.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC8626i {

    /* JADX INFO: renamed from: ub.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static b m33185a(InterfaceC8626i interfaceC8626i) {
            return new b(interfaceC8626i);
        }
    }

    /* JADX INFO: renamed from: ub.i$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final InterfaceC8626i f28691a;

        public b(InterfaceC8626i interfaceC8626i) {
            interfaceC8626i.getClass();
            this.f28691a = interfaceC8626i;
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC8626i m33186a() {
            return this.f28691a;
        }
    }

    /* JADX INFO: renamed from: a */
    b mo33181a();

    /* JADX INFO: renamed from: b */
    List mo33182b();

    /* JADX INFO: renamed from: c */
    InterfaceC8624h mo33183c();

    /* JADX INFO: renamed from: d */
    C2363j mo33184d();

    String getValue();

    InterfaceC8626i next();
}
