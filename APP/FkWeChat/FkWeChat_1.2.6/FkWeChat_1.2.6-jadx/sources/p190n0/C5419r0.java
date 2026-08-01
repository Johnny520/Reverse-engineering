package p190n0;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p104h3.EnumC2856i;

/* JADX INFO: renamed from: n0.r0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5419r0 {

    /* JADX INFO: renamed from: a */
    public final a f16719a;

    /* JADX INFO: renamed from: b */
    public final a f16720b;

    /* JADX INFO: renamed from: c */
    public final boolean f16721c;

    /* JADX INFO: renamed from: n0.r0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final EnumC2856i f16722a;

        /* JADX INFO: renamed from: b */
        public final int f16723b;

        /* JADX INFO: renamed from: c */
        public final long f16724c;

        public a(EnumC2856i enumC2856i, int i10, long j10) {
            this.f16722a = enumC2856i;
            this.f16723b = i10;
            this.f16724c = j10;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m22117b(a aVar, EnumC2856i enumC2856i, int i10, long j10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                enumC2856i = aVar.f16722a;
            }
            if ((i11 & 2) != 0) {
                i10 = aVar.f16723b;
            }
            if ((i11 & 4) != 0) {
                j10 = aVar.f16724c;
            }
            return aVar.m22118a(enumC2856i, i10, j10);
        }

        /* JADX INFO: renamed from: a */
        public final a m22118a(EnumC2856i enumC2856i, int i10, long j10) {
            return new a(enumC2856i, i10, j10);
        }

        /* JADX INFO: renamed from: c */
        public final EnumC2856i m22119c() {
            return this.f16722a;
        }

        /* JADX INFO: renamed from: d */
        public final int m22120d() {
            return this.f16723b;
        }

        /* JADX INFO: renamed from: e */
        public final long m22121e() {
            return this.f16724c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f16722a == aVar.f16722a && this.f16723b == aVar.f16723b && this.f16724c == aVar.f16724c;
        }

        public int hashCode() {
            return (((this.f16722a.hashCode() * 31) + Integer.hashCode(this.f16723b)) * 31) + Long.hashCode(this.f16724c);
        }

        public String toString() {
            return "AnchorInfo(direction=" + this.f16722a + ", offset=" + this.f16723b + ", selectableId=" + this.f16724c + ')';
        }
    }

    public C5419r0(a aVar, a aVar2, boolean z10) {
        this.f16719a = aVar;
        this.f16720b = aVar2;
        this.f16721c = z10;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C5419r0 m22111b(C5419r0 c5419r0, a aVar, a aVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = c5419r0.f16719a;
        }
        if ((i10 & 2) != 0) {
            aVar2 = c5419r0.f16720b;
        }
        if ((i10 & 4) != 0) {
            z10 = c5419r0.f16721c;
        }
        return c5419r0.m22112a(aVar, aVar2, z10);
    }

    /* JADX INFO: renamed from: a */
    public final C5419r0 m22112a(a aVar, a aVar2, boolean z10) {
        return new C5419r0(aVar, aVar2, z10);
    }

    /* JADX INFO: renamed from: c */
    public final a m22113c() {
        return this.f16720b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m22114d() {
        return this.f16721c;
    }

    /* JADX INFO: renamed from: e */
    public final a m22115e() {
        return this.f16719a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5419r0)) {
            return false;
        }
        C5419r0 c5419r0 = (C5419r0) obj;
        return AbstractC1061t.m3842c(this.f16719a, c5419r0.f16719a) && AbstractC1061t.m3842c(this.f16720b, c5419r0.f16720b) && this.f16721c == c5419r0.f16721c;
    }

    /* JADX INFO: renamed from: f */
    public final C5419r0 m22116f(C5419r0 c5419r0) {
        if (c5419r0 == null) {
            return this;
        }
        boolean z10 = this.f16721c;
        if (z10 || c5419r0.f16721c) {
            return new C5419r0(c5419r0.f16721c ? c5419r0.f16719a : c5419r0.f16720b, z10 ? this.f16720b : this.f16719a, true);
        }
        return m22111b(this, null, c5419r0.f16720b, false, 5, null);
    }

    public int hashCode() {
        return (((this.f16719a.hashCode() * 31) + this.f16720b.hashCode()) * 31) + Boolean.hashCode(this.f16721c);
    }

    public String toString() {
        return "Selection(start=" + this.f16719a + ", end=" + this.f16720b + ", handlesCrossed=" + this.f16721c + ')';
    }

    public /* synthetic */ C5419r0(a aVar, a aVar2, boolean z10, int i10, AbstractC1043k abstractC1043k) {
        this(aVar, aVar2, (i10 & 4) != 0 ? false : z10);
    }
}
