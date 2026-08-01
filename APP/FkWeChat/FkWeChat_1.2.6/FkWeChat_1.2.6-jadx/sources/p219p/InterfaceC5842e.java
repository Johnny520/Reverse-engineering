package p219p;

import p163l.AbstractC4322l;
import p163l.InterfaceC4317k;

/* JADX INFO: renamed from: p.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5842e {

    /* JADX INFO: renamed from: a */
    public static final a f18329a = a.f18330a;

    /* JADX INFO: renamed from: p.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f18330a = new a();

        /* JADX INFO: renamed from: b */
        public static final InterfaceC4317k f18331b = AbstractC4322l.m16974j(0.0f, 0.0f, null, 7, null);

        /* JADX INFO: renamed from: c */
        public static final InterfaceC5842e f18332c = new C10175a();

        /* JADX INFO: renamed from: p.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10175a implements InterfaceC5842e {
        }

        /* JADX INFO: renamed from: a */
        public final float m23538a(float f10, float f11, float f12) {
            float f13 = f11 + f10;
            if (f10 >= 0.0f && f13 <= f12) {
                return 0.0f;
            }
            if (f10 < 0.0f && f13 > f12) {
                return 0.0f;
            }
            float f14 = f13 - f12;
            return Math.abs(f10) < Math.abs(f14) ? f10 : f14;
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC5842e m23539b() {
            return f18332c;
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC4317k m23540c() {
            return f18331b;
        }
    }

    /* JADX INFO: renamed from: a */
    default float mo23536a(float f10, float f11, float f12) {
        return f18329a.m23538a(f10, f11, f12);
    }

    /* JADX INFO: renamed from: b */
    default InterfaceC4317k m23537b() {
        return f18329a.m23540c();
    }
}
