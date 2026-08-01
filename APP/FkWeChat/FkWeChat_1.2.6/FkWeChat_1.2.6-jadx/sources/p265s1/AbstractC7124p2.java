package p265s1;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p250r1.AbstractC6460j;
import p250r1.C6457g;
import p250r1.C6459i;

/* JADX INFO: renamed from: s1.p2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7124p2 {

    /* JADX INFO: renamed from: s1.p2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC7124p2 {

        /* JADX INFO: renamed from: a */
        public final InterfaceC7144t2 f23636a;

        public a(InterfaceC7144t2 interfaceC7144t2) {
            super(null);
            this.f23636a = interfaceC7144t2;
        }

        @Override // p265s1.AbstractC7124p2
        /* JADX INFO: renamed from: a */
        public C6457g mo28086a() {
            return this.f23636a.getBounds();
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC7144t2 m28087b() {
            return this.f23636a;
        }
    }

    /* JADX INFO: renamed from: s1.p2$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC7124p2 {

        /* JADX INFO: renamed from: a */
        public final C6457g f23637a;

        public b(C6457g c6457g) {
            super(null);
            this.f23637a = c6457g;
        }

        @Override // p265s1.AbstractC7124p2
        /* JADX INFO: renamed from: a */
        public C6457g mo28086a() {
            return this.f23637a;
        }

        /* JADX INFO: renamed from: b */
        public final C6457g m28088b() {
            return this.f23637a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC1061t.m3842c(this.f23637a, ((b) obj).f23637a);
        }

        public int hashCode() {
            return this.f23637a.hashCode();
        }
    }

    /* JADX INFO: renamed from: s1.p2$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC7124p2 {

        /* JADX INFO: renamed from: a */
        public final C6459i f23638a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7144t2 f23639b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(C6459i c6459i) {
            super(0 == true ? 1 : 0);
            InterfaceC7144t2 interfaceC7144t2 = null;
            this.f23638a = c6459i;
            if (!AbstractC6460j.m25612e(c6459i)) {
                InterfaceC7144t2 interfaceC7144t2M28224a = AbstractC7147u0.m28224a();
                InterfaceC7144t2.m28219i(interfaceC7144t2M28224a, c6459i, null, 2, null);
                interfaceC7144t2 = interfaceC7144t2M28224a;
            }
            this.f23639b = interfaceC7144t2;
        }

        @Override // p265s1.AbstractC7124p2
        /* JADX INFO: renamed from: a */
        public C6457g mo28086a() {
            return AbstractC6460j.m25611d(this.f23638a);
        }

        /* JADX INFO: renamed from: b */
        public final C6459i m28089b() {
            return this.f23638a;
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC7144t2 m28090c() {
            return this.f23639b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC1061t.m3842c(this.f23638a, ((c) obj).f23638a);
        }

        public int hashCode() {
            return this.f23638a.hashCode();
        }
    }

    public /* synthetic */ AbstractC7124p2(AbstractC1043k abstractC1043k) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract C6457g mo28086a();

    public AbstractC7124p2() {
    }
}
