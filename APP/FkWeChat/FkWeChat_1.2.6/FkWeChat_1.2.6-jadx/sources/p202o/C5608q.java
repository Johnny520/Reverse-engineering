package p202o;

import androidx.compose.runtime.AbstractC0522j5;
import androidx.compose.runtime.InterfaceC0512i2;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p250r1.C6455e;
import p263s.AbstractC6635e;

/* JADX INFO: renamed from: o.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5608q {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0512i2 f17552a;

    public C5608q(a aVar) {
        this.f17552a = AbstractC0522j5.m1773e(aVar, null, 2, null);
    }

    /* JADX INFO: renamed from: a */
    public final a m22739a() {
        return (a) this.f17552a.getValue();
    }

    /* JADX INFO: renamed from: b */
    public final void m22740b(a aVar) {
        this.f17552a.setValue(aVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5608q) {
            return AbstractC1061t.m3842c(((C5608q) obj).m22739a(), m22739a());
        }
        return false;
    }

    public int hashCode() {
        return m22739a().hashCode();
    }

    public String toString() {
        return "ContextMenuState(status=" + m22739a() + ')';
    }

    /* JADX INFO: renamed from: o.q$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class a {

        /* JADX INFO: renamed from: o.q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10169a extends a {

            /* JADX INFO: renamed from: a */
            public static final C10169a f17553a = new C10169a();

            public C10169a() {
                super(null);
            }

            public String toString() {
                return "Closed";
            }
        }

        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }

        /* JADX INFO: renamed from: o.q$a$b */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class b extends a {

            /* JADX INFO: renamed from: a */
            public final long f17554a;

            public b(long j10) {
                super(null);
                this.f17554a = j10;
                if ((j10 & 9223372034707292159L) != 9205357640488583168L) {
                    return;
                }
                AbstractC6635e.m26320c("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
            }

            /* JADX INFO: renamed from: a */
            public final long m22741a() {
                return this.f17554a;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof b) {
                    return C6455e.m25556j(this.f17554a, ((b) obj).f17554a);
                }
                return false;
            }

            public int hashCode() {
                return C6455e.m25561o(this.f17554a);
            }

            public String toString() {
                return "Open(offset=" + ((Object) C6455e.m25565s(this.f17554a)) + ')';
            }

            public /* synthetic */ b(long j10, AbstractC1043k abstractC1043k) {
                this(j10);
            }
        }
    }

    public /* synthetic */ C5608q(a aVar, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? a.C10169a.f17553a : aVar);
    }
}
