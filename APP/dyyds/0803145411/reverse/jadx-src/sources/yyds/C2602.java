package yyds;

import java.time.OffsetDateTime;

/* JADX INFO: renamed from: yyds.ᲈᛲᛲᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2602 extends AbstractC2019 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final OffsetDateTime f12803;

    public C2602(String str) {
        this.f12803 = OffsetDateTime.parse(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2602) || (obj instanceof C2114)) {
            return this.f12803.compareTo(((AbstractC2019) obj).mo3895().f12803) == 0;
        }
        return false;
    }

    public final String toString() {
        return this.f12803.toString();
    }

    @Override // yyds.AbstractC2019
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final C2114 mo3452() {
        return new C2114(this.f12803.toString(), false);
    }

    @Override // yyds.AbstractC2019
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final C2602 mo3895() {
        return this;
    }

    @Override // yyds.AbstractC2019
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final Class mo1345(C0864 c0864) {
        return C2602.class;
    }
}
