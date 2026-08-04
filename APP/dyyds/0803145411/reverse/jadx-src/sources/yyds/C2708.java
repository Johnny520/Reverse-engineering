package yyds;

import java.util.List;

/* JADX INFO: renamed from: yyds.ᲈᛷᲁᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2708 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final List f13290;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean f13291;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean f13292;

    public C2708(List list, boolean z, boolean z2) {
        AbstractC2328.m4341(-958095107457902L);
        this.f13290 = list;
        this.f13291 = z;
        this.f13292 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2708)) {
            return false;
        }
        C2708 c2708 = (C2708) obj;
        return this.f13290.equals(c2708.f13290) && this.f13291 == c2708.f13291 && this.f13292 == c2708.f13292;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13292) + AbstractC2104.m4021(this.f13290.hashCode() * 31, 31, this.f13291);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-958198186673006L));
        sb.append(this.f13290);
        sb.append(AbstractC2328.m4341(-958327035691886L));
        AbstractC2104.m4017(sb, this.f13291, -958374280332142L);
        return AbstractC0897.m1986(sb, this.f13292, ')');
    }
}
