package io.ktor.utils.p131io;

import p215oc.C5708d;
import p215oc.C5725t;
import p215oc.InterfaceC5728w;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6533b;

/* JADX INFO: renamed from: io.ktor.utils.io.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3468g {

    /* JADX INFO: renamed from: a */
    public static final a f9594a = a.f9595a;

    /* JADX INFO: renamed from: io.ktor.utils.io.g$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Object m12941a(InterfaceC3468g interfaceC3468g, int i10, InterfaceC5976f interfaceC5976f, int i11, Object obj) {
            if (obj != null) {
                C5725t.m23179a("Super calls with default arguments not supported in this target, function: awaitContent");
                return null;
            }
            if ((i11 & 1) != 0) {
                i10 = 1;
            }
            return interfaceC3468g.mo8541c(i10, interfaceC5976f);
        }
    }

    /* JADX INFO: renamed from: a */
    Throwable mo8540a();

    /* JADX INFO: renamed from: c */
    Object mo8541c(int i10, InterfaceC5976f interfaceC5976f);

    /* JADX INFO: renamed from: e */
    InterfaceC5728w mo8542e();

    /* JADX INFO: renamed from: g */
    void mo8543g(Throwable th);

    /* JADX INFO: renamed from: h */
    boolean mo8544h();

    /* JADX INFO: renamed from: io.ktor.utils.io.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f9595a = new a();

        /* JADX INFO: renamed from: b */
        public static final InterfaceC3468g f9596b = new C10116a();

        /* JADX INFO: renamed from: a */
        public final InterfaceC3468g m12940a() {
            return f9596b;
        }

        /* JADX INFO: renamed from: io.ktor.utils.io.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10116a implements InterfaceC3468g {

            /* JADX INFO: renamed from: b */
            public final Throwable f9597b;

            /* JADX INFO: renamed from: c */
            public final InterfaceC5728w f9598c = new C5708d();

            @Override // io.ktor.utils.p131io.InterfaceC3468g
            /* JADX INFO: renamed from: a */
            public Throwable mo8540a() {
                return this.f9597b;
            }

            @Override // io.ktor.utils.p131io.InterfaceC3468g
            /* JADX INFO: renamed from: c */
            public Object mo8541c(int i10, InterfaceC5976f interfaceC5976f) {
                return AbstractC6533b.m25845a(false);
            }

            @Override // io.ktor.utils.p131io.InterfaceC3468g
            /* JADX INFO: renamed from: e */
            public InterfaceC5728w mo8542e() {
                return this.f9598c;
            }

            @Override // io.ktor.utils.p131io.InterfaceC3468g
            /* JADX INFO: renamed from: h */
            public boolean mo8544h() {
                return true;
            }

            @Override // io.ktor.utils.p131io.InterfaceC3468g
            /* JADX INFO: renamed from: g */
            public void mo8543g(Throwable th) {
            }
        }
    }
}
