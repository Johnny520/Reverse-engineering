package p264s0;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p165l1.InterfaceC4499e;

/* JADX INFO: renamed from: s0.eb */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6715eb {
    public /* synthetic */ AbstractC6715eb(AbstractC1043k abstractC1043k) {
        this();
    }

    public AbstractC6715eb() {
    }

    /* JADX INFO: renamed from: s0.eb$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6715eb {

        /* JADX INFO: renamed from: a */
        public final boolean f21232a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC4499e.b f21233b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC4499e.b f21234c;

        public /* synthetic */ a(boolean z10, InterfaceC4499e.b bVar, InterfaceC4499e.b bVar2, int i10, AbstractC1043k abstractC1043k) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? InterfaceC4499e.f13028a.m17422k() : bVar, (i10 & 4) != 0 ? InterfaceC4499e.f13028a.m17422k() : bVar2);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m26659a() {
            return this.f21232a;
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC4499e.b m26660b() {
            return this.f21234c;
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC4499e.b m26661c() {
            return this.f21233b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f21232a == aVar.f21232a && AbstractC1061t.m3842c(this.f21233b, aVar.f21233b) && AbstractC1061t.m3842c(this.f21234c, aVar.f21234c);
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f21232a) * 31) + this.f21233b.hashCode()) * 31) + this.f21234c.hashCode();
        }

        public String toString() {
            return "Attached(alwaysMinimize=" + this.f21232a + ", minimizedAlignment=" + this.f21233b + ", expandedAlignment=" + this.f21234c + ')';
        }

        public a(boolean z10, InterfaceC4499e.b bVar, InterfaceC4499e.b bVar2) {
            super(null);
            this.f21232a = z10;
            this.f21233b = bVar;
            this.f21234c = bVar2;
        }
    }
}
