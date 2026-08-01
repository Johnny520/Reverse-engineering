package re;

import be.AbstractC1113a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p024b9.AbstractC1061t;
import p080f9.C2363j;

/* JADX INFO: renamed from: re.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6627f {

    /* JADX INFO: renamed from: re.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C2363j f20756a;

        /* JADX INFO: renamed from: b */
        public final AbstractC1113a f20757b;

        public a(C2363j c2363j, AbstractC1113a abstractC1113a) {
            c2363j.getClass();
            abstractC1113a.getClass();
            this.f20756a = c2363j;
            this.f20757b = abstractC1113a;
        }

        /* JADX INFO: renamed from: a */
        public final C2363j m26255a() {
            return this.f20756a;
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC1113a m26256b() {
            return this.f20757b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC1061t.m3842c(this.f20756a, aVar.f20756a) && AbstractC1061t.m3842c(this.f20757b, aVar.f20757b);
        }

        public int hashCode() {
            return (this.f20756a.hashCode() * 31) + this.f20757b.hashCode();
        }

        public String toString() {
            return "Node(range=" + this.f20756a + ", type=" + this.f20757b + ')';
        }
    }

    /* JADX INFO: renamed from: re.f$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface b {
        /* JADX INFO: renamed from: a */
        Collection mo26250a();

        /* JADX INFO: renamed from: b */
        Collection mo26251b();
    }

    /* JADX INFO: renamed from: re.f$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements b {

        /* JADX INFO: renamed from: a */
        public final Collection f20758a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final Collection f20759b = new ArrayList();

        @Override // re.InterfaceC6627f.b
        /* JADX INFO: renamed from: a */
        public Collection mo26250a() {
            return this.f20759b;
        }

        @Override // re.InterfaceC6627f.b
        /* JADX INFO: renamed from: b */
        public Collection mo26251b() {
            return this.f20758a;
        }

        /* JADX INFO: renamed from: c */
        public final c m26257c(List list) {
            list.getClass();
            this.f20759b.add(list);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final c m26258d(a aVar) {
            aVar.getClass();
            this.f20758a.add(aVar);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public final c m26259e(b bVar) {
            bVar.getClass();
            this.f20758a.addAll(bVar.mo26251b());
            this.f20759b.addAll(bVar.mo26250a());
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    b mo26237a(AbstractC6630i abstractC6630i, List list);
}
