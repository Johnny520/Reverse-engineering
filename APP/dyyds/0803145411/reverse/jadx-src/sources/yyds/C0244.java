package yyds;

import java.util.List;

/* JADX INFO: renamed from: yyds.ᛱᲇᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0244 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final List f1346;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean f1347;

    public C0244(List list, boolean z) {
        AbstractC2328.m4341(-599302129484654L);
        this.f1346 = list;
        this.f1347 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0244)) {
            return false;
        }
        C0244 c0244 = (C0244) obj;
        return AbstractC1544.m3188(this.f1346, c0244.f1346) && this.f1347 == c0244.f1347;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1347) + (this.f1346.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-599345079157614L));
        sb.append(this.f1346);
        sb.append(AbstractC2328.m4341(-599435273470830L));
        return AbstractC0897.m1986(sb, this.f1347, ')');
    }
}
