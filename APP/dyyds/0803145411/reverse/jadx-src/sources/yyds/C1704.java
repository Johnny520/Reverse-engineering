package yyds;

import java.math.BigDecimal;

/* JADX INFO: renamed from: yyds.ᛸᛱᛷᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1704 extends AbstractC2019 {

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C1704 f8640 = new C1704((BigDecimal) null);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final BigDecimal f8641;

    public C1704(CharSequence charSequence) {
        this.f8641 = new BigDecimal(charSequence.toString());
    }

    public final boolean equals(Object obj) {
        C1704 c1704Mo3453;
        if (this == obj) {
            return true;
        }
        return ((obj instanceof C1704) || (obj instanceof C2114)) && (c1704Mo3453 = ((AbstractC2019) obj).mo3453()) != f8640 && this.f8641.compareTo(c1704Mo3453.f8641) == 0;
    }

    public final String toString() {
        return this.f8641.toString();
    }

    @Override // yyds.AbstractC2019
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final C2114 mo3452() {
        return new C2114(this.f8641.toString(), false);
    }

    @Override // yyds.AbstractC2019
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final Class mo1345(C0864 c0864) {
        return Number.class;
    }

    @Override // yyds.AbstractC2019
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1704 mo3453() {
        return this;
    }

    public C1704(BigDecimal bigDecimal) {
        this.f8641 = bigDecimal;
    }
}
