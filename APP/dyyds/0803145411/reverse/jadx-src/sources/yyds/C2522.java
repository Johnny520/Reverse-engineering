package yyds;

import java.io.File;

/* JADX INFO: renamed from: yyds.ᲇᲀᲈᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2522 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final File f12445;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean f12446;

    public C2522(File file, boolean z) {
        AbstractC2328.m4341(-145268251722606L);
        this.f12445 = file;
        this.f12446 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2522)) {
            return false;
        }
        C2522 c2522 = (C2522) obj;
        return AbstractC1544.m3188(this.f12445, c2522.f12445) && this.f12446 == c2522.f12446;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12446) + (this.f12445.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-145311201395566L));
        sb.append(this.f12445);
        sb.append(AbstractC2328.m4341(-145375625905006L));
        return AbstractC0897.m1986(sb, this.f12446, ')');
    }
}
