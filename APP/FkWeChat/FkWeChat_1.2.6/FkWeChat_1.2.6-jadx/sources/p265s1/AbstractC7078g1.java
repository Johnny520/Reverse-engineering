package p265s1;

import java.util.List;
import p024b9.AbstractC1043k;
import p250r1.C6455e;
import p250r1.C6461k;

/* JADX INFO: renamed from: s1.g1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7078g1 {

    /* JADX INFO: renamed from: b */
    public static final a f23549b = new a(null);

    /* JADX INFO: renamed from: a */
    public final long f23550a;

    public AbstractC7078g1() {
        this.f23550a = C6461k.f20335b.m25626a();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo27855a(long j10, InterfaceC7134r2 interfaceC7134r2, float f10);

    /* JADX INFO: renamed from: s1.g1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ AbstractC7078g1 m27880b(a aVar, List list, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = AbstractC7115n3.f23623a.m28045a();
            }
            return aVar.m27884a(list, f10, f11, i10);
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ AbstractC7078g1 m27881d(a aVar, List list, long j10, long j11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = C6455e.f20314b.m25569c();
            }
            long j12 = j10;
            if ((i11 & 4) != 0) {
                j11 = C6455e.f20314b.m25567a();
            }
            long j13 = j11;
            if ((i11 & 8) != 0) {
                i10 = AbstractC7115n3.f23623a.m28045a();
            }
            return aVar.m27885c(list, j12, j13, i10);
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ AbstractC7078g1 m27882f(a aVar, List list, long j10, float f10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j10 = C6455e.f20314b.m25568b();
            }
            long j11 = j10;
            if ((i11 & 4) != 0) {
                f10 = Float.POSITIVE_INFINITY;
            }
            float f11 = f10;
            if ((i11 & 8) != 0) {
                i10 = AbstractC7115n3.f23623a.m28045a();
            }
            return aVar.m27886e(list, j11, f11, i10);
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ AbstractC7078g1 m27883h(a aVar, List list, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = AbstractC7115n3.f23623a.m28045a();
            }
            return aVar.m27887g(list, f10, f11, i10);
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC7078g1 m27884a(List list, float f10, float f11, int i10) {
            return m27885c(list, C6455e.m25551e((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), C6455e.m25551e((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), i10);
        }

        /* JADX INFO: renamed from: c */
        public final AbstractC7078g1 m27885c(List list, long j10, long j11, int i10) {
            return new C7109m2(list, null, j10, j11, i10, null);
        }

        /* JADX INFO: renamed from: e */
        public final AbstractC7078g1 m27886e(List list, long j10, float f10, int i10) {
            return new C7170z2(list, null, j10, f10, i10, null);
        }

        /* JADX INFO: renamed from: g */
        public final AbstractC7078g1 m27887g(List list, float f10, float f11, int i10) {
            return m27885c(list, C6455e.m25551e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & 4294967295L)), C6455e.m25551e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f11)) & 4294967295L)), i10);
        }

        public a() {
        }
    }

    public /* synthetic */ AbstractC7078g1(AbstractC1043k abstractC1043k) {
        this();
    }
}
