package re;

import be.AbstractC1113a;
import java.util.List;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p172l8.AbstractC4717x;
import p172l8.C4711r;
import re.AbstractC6630i;
import re.InterfaceC6627f;

/* JADX INFO: renamed from: re.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6622a {

    /* JADX INFO: renamed from: a */
    public static final a f20734a = new a(null);

    /* JADX INFO: renamed from: a */
    public C4711r m26221a(AbstractC6630i abstractC6630i, AbstractC6630i.a aVar, AbstractC6630i.a aVar2, boolean z10) {
        abstractC6630i.getClass();
        aVar.getClass();
        aVar2.getClass();
        boolean zM26222b = m26222b(aVar, aVar2);
        boolean zM26224d = m26224d(abstractC6630i, aVar, aVar2);
        boolean z11 = z10 ? zM26222b : zM26222b && (!zM26224d || AbstractC6629h.f20760a.m26262b(aVar, -1));
        if (!z10) {
            zM26224d = zM26224d && (!zM26222b || AbstractC6629h.f20760a.m26262b(aVar2, 1));
        }
        return AbstractC4717x.m18815a(Boolean.valueOf(z11), Boolean.valueOf(zM26224d));
    }

    /* JADX INFO: renamed from: b */
    public boolean m26222b(AbstractC6630i.a aVar, AbstractC6630i.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        if (m26225e(aVar2, 1)) {
            return false;
        }
        return !m26223c(aVar2, 1) || m26225e(aVar, -1) || m26223c(aVar, -1);
    }

    /* JADX INFO: renamed from: c */
    public boolean m26223c(AbstractC6630i.a aVar, int i10) {
        aVar.getClass();
        return AbstractC6629h.f20760a.m26262b(aVar, i10);
    }

    /* JADX INFO: renamed from: d */
    public boolean m26224d(AbstractC6630i abstractC6630i, AbstractC6630i.a aVar, AbstractC6630i.a aVar2) {
        abstractC6630i.getClass();
        aVar.getClass();
        aVar2.getClass();
        if (aVar.m26267b(-1) == f20734a.m26226a(aVar) || m26225e(aVar, -1)) {
            return false;
        }
        return !m26223c(aVar, -1) || m26225e(aVar2, 1) || m26223c(aVar2, 1);
    }

    /* JADX INFO: renamed from: e */
    public boolean m26225e(AbstractC6630i.a aVar, int i10) {
        aVar.getClass();
        return AbstractC6629h.f20760a.m26263c(aVar, i10);
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo9942f(AbstractC6630i abstractC6630i, AbstractC6630i.a aVar, List list, InterfaceC6627f.c cVar);

    /* JADX INFO: renamed from: g */
    public abstract int mo9943g(AbstractC6630i abstractC6630i, AbstractC6630i.a aVar, List list);

    /* JADX INFO: renamed from: re.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final char m26226a(AbstractC6630i.a aVar) {
            aVar.getClass();
            return aVar.m26269d();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: re.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final AbstractC1113a f20735a;

        /* JADX INFO: renamed from: b */
        public final int f20736b;

        /* JADX INFO: renamed from: c */
        public final int f20737c;

        /* JADX INFO: renamed from: d */
        public boolean f20738d;

        /* JADX INFO: renamed from: e */
        public boolean f20739e;

        /* JADX INFO: renamed from: f */
        public char f20740f;

        /* JADX INFO: renamed from: g */
        public int f20741g;

        public /* synthetic */ b(AbstractC1113a abstractC1113a, int i10, int i11, boolean z10, boolean z11, char c10, int i12, int i13, AbstractC1043k abstractC1043k) {
            this(abstractC1113a, i10, (i13 & 4) != 0 ? 0 : i11, z10, z11, c10, (i13 & 64) != 0 ? -1 : i12);
        }

        /* JADX INFO: renamed from: a */
        public final boolean m26227a() {
            return this.f20739e;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m26228b() {
            return this.f20738d;
        }

        /* JADX INFO: renamed from: c */
        public final int m26229c() {
            return this.f20741g;
        }

        /* JADX INFO: renamed from: d */
        public final int m26230d() {
            return this.f20737c;
        }

        /* JADX INFO: renamed from: e */
        public final char m26231e() {
            return this.f20740f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC1061t.m3842c(this.f20735a, bVar.f20735a) && this.f20736b == bVar.f20736b && this.f20737c == bVar.f20737c && this.f20738d == bVar.f20738d && this.f20739e == bVar.f20739e && this.f20740f == bVar.f20740f && this.f20741g == bVar.f20741g;
        }

        /* JADX INFO: renamed from: f */
        public final int m26232f() {
            return this.f20736b;
        }

        /* JADX INFO: renamed from: g */
        public final AbstractC1113a m26233g() {
            return this.f20735a;
        }

        /* JADX INFO: renamed from: h */
        public final void m26234h(boolean z10) {
            this.f20739e = z10;
        }

        public int hashCode() {
            return (((((((((((this.f20735a.hashCode() * 31) + Integer.hashCode(this.f20736b)) * 31) + Integer.hashCode(this.f20737c)) * 31) + Boolean.hashCode(this.f20738d)) * 31) + Boolean.hashCode(this.f20739e)) * 31) + Character.hashCode(this.f20740f)) * 31) + Integer.hashCode(this.f20741g);
        }

        /* JADX INFO: renamed from: i */
        public final void m26235i(boolean z10) {
            this.f20738d = z10;
        }

        /* JADX INFO: renamed from: j */
        public final void m26236j(int i10) {
            this.f20741g = i10;
        }

        public String toString() {
            return "Info(tokenType=" + this.f20735a + ", position=" + this.f20736b + ", length=" + this.f20737c + ", canOpen=" + this.f20738d + ", canClose=" + this.f20739e + ", marker=" + this.f20740f + ", closerIndex=" + this.f20741g + ')';
        }

        public b(AbstractC1113a abstractC1113a, int i10, int i11, boolean z10, boolean z11, char c10, int i12) {
            abstractC1113a.getClass();
            this.f20735a = abstractC1113a;
            this.f20736b = i10;
            this.f20737c = i11;
            this.f20738d = z10;
            this.f20739e = z11;
            this.f20740f = c10;
            this.f20741g = i12;
        }
    }
}
