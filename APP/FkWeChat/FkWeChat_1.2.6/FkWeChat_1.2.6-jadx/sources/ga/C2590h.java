package ga;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: ga.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2590h {

    /* JADX INFO: renamed from: e */
    public static final a f6880e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final C2590h f6881f = new C2590h(null, null, false, false, 8, null);

    /* JADX INFO: renamed from: a */
    public final EnumC2599k f6882a;

    /* JADX INFO: renamed from: b */
    public final EnumC2593i f6883b;

    /* JADX INFO: renamed from: c */
    public final boolean f6884c;

    /* JADX INFO: renamed from: d */
    public final boolean f6885d;

    public C2590h(EnumC2599k enumC2599k, EnumC2593i enumC2593i, boolean z10, boolean z11) {
        this.f6882a = enumC2599k;
        this.f6883b = enumC2593i;
        this.f6884c = z10;
        this.f6885d = z11;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C2590h m9248c(C2590h c2590h, EnumC2599k enumC2599k, EnumC2593i enumC2593i, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC2599k = c2590h.f6882a;
        }
        if ((i10 & 2) != 0) {
            enumC2593i = c2590h.f6883b;
        }
        if ((i10 & 4) != 0) {
            z10 = c2590h.f6884c;
        }
        if ((i10 & 8) != 0) {
            z11 = c2590h.f6885d;
        }
        return c2590h.m9249b(enumC2599k, enumC2593i, z10, z11);
    }

    /* JADX INFO: renamed from: b */
    public final C2590h m9249b(EnumC2599k enumC2599k, EnumC2593i enumC2593i, boolean z10, boolean z11) {
        return new C2590h(enumC2599k, enumC2593i, z10, z11);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9250d() {
        return this.f6884c;
    }

    /* JADX INFO: renamed from: e */
    public final EnumC2593i m9251e() {
        return this.f6883b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2590h)) {
            return false;
        }
        C2590h c2590h = (C2590h) obj;
        return this.f6882a == c2590h.f6882a && this.f6883b == c2590h.f6883b && this.f6884c == c2590h.f6884c && this.f6885d == c2590h.f6885d;
    }

    /* JADX INFO: renamed from: f */
    public final EnumC2599k m9252f() {
        return this.f6882a;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m9253g() {
        return this.f6885d;
    }

    public int hashCode() {
        EnumC2599k enumC2599k = this.f6882a;
        int iHashCode = (enumC2599k == null ? 0 : enumC2599k.hashCode()) * 31;
        EnumC2593i enumC2593i = this.f6883b;
        return ((((iHashCode + (enumC2593i != null ? enumC2593i.hashCode() : 0)) * 31) + Boolean.hashCode(this.f6884c)) * 31) + Boolean.hashCode(this.f6885d);
    }

    public String toString() {
        return "JavaTypeQualifiers(nullability=" + this.f6882a + ", mutability=" + this.f6883b + ", definitelyNotNull=" + this.f6884c + ", isNullabilityQualifierForWarning=" + this.f6885d + ')';
    }

    /* JADX INFO: renamed from: ga.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C2590h m9254a() {
            return C2590h.f6881f;
        }

        public a() {
        }
    }

    public /* synthetic */ C2590h(EnumC2599k enumC2599k, EnumC2593i enumC2593i, boolean z10, boolean z11, int i10, AbstractC1043k abstractC1043k) {
        this(enumC2599k, enumC2593i, z10, (i10 & 8) != 0 ? false : z11);
    }
}
