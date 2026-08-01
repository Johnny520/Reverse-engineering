package p079f8;

import ec.AbstractC2144j;
import ec.InterfaceC2165o0;
import ec.InterfaceC2198w1;
import io.ktor.utils.p131io.AbstractC3470h;
import io.ktor.utils.p131io.AbstractC3472j;
import io.ktor.utils.p131io.InterfaceC3468g;
import java.io.InputStream;
import p010a9.InterfaceC0188p;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: f8.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2351a {
    /* JADX INFO: renamed from: a */
    public static final InputStream m8534a(InterfaceC3468g interfaceC3468g, InterfaceC2198w1 interfaceC2198w1) {
        interfaceC3468g.getClass();
        return new a(interfaceC3468g);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InputStream m8535b(InterfaceC3468g interfaceC3468g, InterfaceC2198w1 interfaceC2198w1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC2198w1 = null;
        }
        return m8534a(interfaceC3468g, interfaceC2198w1);
    }

    /* JADX INFO: renamed from: f8.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends InputStream {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC3468g f6459q;

        /* JADX INFO: renamed from: f8.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10083a extends AbstractC6544m implements InterfaceC0188p {

            /* JADX INFO: renamed from: q */
            public int f6460q;

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ InterfaceC3468g f6461r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10083a(InterfaceC3468g interfaceC3468g, InterfaceC5976f interfaceC5976f) {
                super(2, interfaceC5976f);
                this.f6461r = interfaceC3468g;
            }

            @Override // p257r8.AbstractC6532a
            public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
                return new C10083a(this.f6461r, interfaceC5976f);
            }

            @Override // p010a9.InterfaceC0188p
            public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
                return ((C10083a) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
            }

            @Override // p257r8.AbstractC6532a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM24992g = AbstractC6325c.m24992g();
                int i10 = this.f6460q;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC4713t.m18808b(obj);
                        return obj;
                    }
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
                InterfaceC3468g interfaceC3468g = this.f6461r;
                this.f6460q = 1;
                Object objM12941a = InterfaceC3468g.b.m12941a(interfaceC3468g, 0, this, 1, null);
                return objM12941a == objM24992g ? objM24992g : objM12941a;
            }
        }

        public a(InterfaceC3468g interfaceC3468g) {
            this.f6459q = interfaceC3468g;
        }

        /* JADX INFO: renamed from: c */
        public final void m8536c() {
            AbstractC2144j.m7786b(null, new C10083a(this.f6459q, null), 1, null);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            AbstractC3470h.m12943a(this.f6459q);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            bArr.getClass();
            if (this.f6459q.mo8544h()) {
                return -1;
            }
            if (this.f6459q.mo8542e().mo23108g()) {
                m8536c();
            }
            int iMo23098H = this.f6459q.mo8542e().mo23098H(bArr, i10, Math.min(AbstractC3472j.m12950g(this.f6459q), i11) + i10);
            return iMo23098H >= 0 ? iMo23098H : this.f6459q.mo8544h() ? -1 : 0;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f6459q.mo8544h()) {
                return -1;
            }
            if (this.f6459q.mo8542e().mo23108g()) {
                m8536c();
            }
            if (this.f6459q.mo8544h()) {
                return -1;
            }
            return this.f6459q.mo8542e().readByte() & 255;
        }
    }
}
