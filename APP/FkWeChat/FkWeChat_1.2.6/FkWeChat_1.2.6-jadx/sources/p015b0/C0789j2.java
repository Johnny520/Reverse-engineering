package p015b0;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: b0.j2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0789j2 {

    /* JADX INFO: renamed from: g */
    public static final a f2389g = new a(null);

    /* JADX INFO: renamed from: h */
    public static final C0789j2 f2390h = new C0789j2(null, null, null, null, null, null, 63, null);

    /* JADX INFO: renamed from: a */
    public final InterfaceC0184l f2391a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0184l f2392b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0184l f2393c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0184l f2394d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0184l f2395e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0184l f2396f;

    public /* synthetic */ C0789j2(InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, InterfaceC0184l interfaceC0184l3, InterfaceC0184l interfaceC0184l4, InterfaceC0184l interfaceC0184l5, InterfaceC0184l interfaceC0184l6, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? null : interfaceC0184l, (i10 & 2) != 0 ? null : interfaceC0184l2, (i10 & 4) != 0 ? null : interfaceC0184l3, (i10 & 8) != 0 ? null : interfaceC0184l4, (i10 & 16) != 0 ? null : interfaceC0184l5, (i10 & 32) != 0 ? null : interfaceC0184l6);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0184l m2956b() {
        return this.f2391a;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC0184l m2957c() {
        return this.f2392b;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC0184l m2958d() {
        return this.f2393c;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC0184l m2959e() {
        return this.f2394d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0789j2)) {
            return false;
        }
        C0789j2 c0789j2 = (C0789j2) obj;
        return this.f2391a == c0789j2.f2391a && this.f2392b == c0789j2.f2392b && this.f2393c == c0789j2.f2393c && this.f2394d == c0789j2.f2394d && this.f2395e == c0789j2.f2395e && this.f2396f == c0789j2.f2396f;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC0184l m2960f() {
        return this.f2395e;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC0184l m2961g() {
        return this.f2396f;
    }

    public int hashCode() {
        InterfaceC0184l interfaceC0184l = this.f2391a;
        int iHashCode = (interfaceC0184l != null ? interfaceC0184l.hashCode() : 0) * 31;
        InterfaceC0184l interfaceC0184l2 = this.f2392b;
        int iHashCode2 = (iHashCode + (interfaceC0184l2 != null ? interfaceC0184l2.hashCode() : 0)) * 31;
        InterfaceC0184l interfaceC0184l3 = this.f2393c;
        int iHashCode3 = (iHashCode2 + (interfaceC0184l3 != null ? interfaceC0184l3.hashCode() : 0)) * 31;
        InterfaceC0184l interfaceC0184l4 = this.f2394d;
        int iHashCode4 = (iHashCode3 + (interfaceC0184l4 != null ? interfaceC0184l4.hashCode() : 0)) * 31;
        InterfaceC0184l interfaceC0184l5 = this.f2395e;
        int iHashCode5 = (iHashCode4 + (interfaceC0184l5 != null ? interfaceC0184l5.hashCode() : 0)) * 31;
        InterfaceC0184l interfaceC0184l6 = this.f2396f;
        return iHashCode5 + (interfaceC0184l6 != null ? interfaceC0184l6.hashCode() : 0);
    }

    /* JADX INFO: renamed from: b0.j2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C0789j2 m2962a() {
            return C0789j2.f2390h;
        }

        public a() {
        }
    }

    public C0789j2(InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, InterfaceC0184l interfaceC0184l3, InterfaceC0184l interfaceC0184l4, InterfaceC0184l interfaceC0184l5, InterfaceC0184l interfaceC0184l6) {
        this.f2391a = interfaceC0184l;
        this.f2392b = interfaceC0184l2;
        this.f2393c = interfaceC0184l3;
        this.f2394d = interfaceC0184l4;
        this.f2395e = interfaceC0184l5;
        this.f2396f = interfaceC0184l6;
    }
}
