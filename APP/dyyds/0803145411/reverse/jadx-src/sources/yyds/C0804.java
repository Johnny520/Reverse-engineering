package yyds;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: yyds.ᛴᛲᛷᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0804 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final WeakReference f3687;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public Float f3688;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public boolean f3689;

    public C0804(WeakReference weakReference) {
        AbstractC2328.m4341(-881795013444462L);
        this.f3687 = weakReference;
        this.f3688 = null;
        this.f3689 = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0804)) {
            return false;
        }
        C0804 c0804 = (C0804) obj;
        return this.f3687.equals(c0804.f3687) && AbstractC1544.m3188(this.f3688, c0804.f3688) && this.f3689 == c0804.f3689;
    }

    public final int hashCode() {
        int iHashCode = this.f3687.hashCode() * 31;
        Float f = this.f3688;
        return Boolean.hashCode(this.f3689) + ((iHashCode + (f == null ? 0 : f.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-881898092659566L));
        sb.append(this.f3687);
        sb.append(AbstractC2328.m4341(-882057006449518L));
        sb.append(this.f3688);
        sb.append(AbstractC2328.m4341(-882108546057070L));
        return AbstractC0897.m1986(sb, this.f3689, ')');
    }
}
