package p319w2;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p319w2.C9058e;

/* JADX INFO: renamed from: w2.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9083j implements C9058e.a {

    /* JADX INFO: renamed from: w2.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC9083j {

        /* JADX INFO: renamed from: a */
        public final String f31136a;

        /* JADX INFO: renamed from: b */
        public final C9127r3 f31137b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC9088k f31138c;

        public a(String str, C9127r3 c9127r3, InterfaceC9088k interfaceC9088k) {
            super(null);
            this.f31136a = str;
            this.f31137b = c9127r3;
            this.f31138c = interfaceC9088k;
        }

        @Override // p319w2.AbstractC9083j
        /* JADX INFO: renamed from: a */
        public InterfaceC9088k mo35303a() {
            return this.f31138c;
        }

        @Override // p319w2.AbstractC9083j
        /* JADX INFO: renamed from: b */
        public C9127r3 mo35304b() {
            return this.f31137b;
        }

        /* JADX INFO: renamed from: c */
        public final String m35305c() {
            return this.f31136a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC1061t.m3842c(this.f31136a, aVar.f31136a) && AbstractC1061t.m3842c(mo35304b(), aVar.mo35304b()) && AbstractC1061t.m3842c(mo35303a(), aVar.mo35303a());
        }

        public int hashCode() {
            int iHashCode = this.f31136a.hashCode() * 31;
            C9127r3 c9127r3Mo35304b = mo35304b();
            int iHashCode2 = (iHashCode + (c9127r3Mo35304b != null ? c9127r3Mo35304b.hashCode() : 0)) * 31;
            InterfaceC9088k interfaceC9088kMo35303a = mo35303a();
            return iHashCode2 + (interfaceC9088kMo35303a != null ? interfaceC9088kMo35303a.hashCode() : 0);
        }

        public String toString() {
            return "LinkAnnotation.Clickable(tag=" + this.f31136a + ')';
        }
    }

    public /* synthetic */ AbstractC9083j(AbstractC1043k abstractC1043k) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC9088k mo35303a();

    /* JADX INFO: renamed from: b */
    public abstract C9127r3 mo35304b();

    public AbstractC9083j() {
    }

    /* JADX INFO: renamed from: w2.j$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC9083j {

        /* JADX INFO: renamed from: a */
        public final String f31139a;

        /* JADX INFO: renamed from: b */
        public final C9127r3 f31140b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC9088k f31141c;

        public /* synthetic */ b(String str, C9127r3 c9127r3, InterfaceC9088k interfaceC9088k, int i10, AbstractC1043k abstractC1043k) {
            this(str, (i10 & 2) != 0 ? null : c9127r3, (i10 & 4) != 0 ? null : interfaceC9088k);
        }

        @Override // p319w2.AbstractC9083j
        /* JADX INFO: renamed from: a */
        public InterfaceC9088k mo35303a() {
            return this.f31141c;
        }

        @Override // p319w2.AbstractC9083j
        /* JADX INFO: renamed from: b */
        public C9127r3 mo35304b() {
            return this.f31140b;
        }

        /* JADX INFO: renamed from: c */
        public final String m35306c() {
            return this.f31139a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC1061t.m3842c(this.f31139a, bVar.f31139a) && AbstractC1061t.m3842c(mo35304b(), bVar.mo35304b()) && AbstractC1061t.m3842c(mo35303a(), bVar.mo35303a());
        }

        public int hashCode() {
            int iHashCode = this.f31139a.hashCode() * 31;
            C9127r3 c9127r3Mo35304b = mo35304b();
            int iHashCode2 = (iHashCode + (c9127r3Mo35304b != null ? c9127r3Mo35304b.hashCode() : 0)) * 31;
            InterfaceC9088k interfaceC9088kMo35303a = mo35303a();
            return iHashCode2 + (interfaceC9088kMo35303a != null ? interfaceC9088kMo35303a.hashCode() : 0);
        }

        public String toString() {
            return "LinkAnnotation.Url(url=" + this.f31139a + ')';
        }

        public b(String str, C9127r3 c9127r3, InterfaceC9088k interfaceC9088k) {
            super(null);
            this.f31139a = str;
            this.f31140b = c9127r3;
            this.f31141c = interfaceC9088k;
        }
    }
}
