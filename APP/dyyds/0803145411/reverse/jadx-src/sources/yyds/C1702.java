package yyds;

import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛸᛱᛷᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1702 extends AbstractC1214 implements Iterator {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f8635;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C2598 f8636;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public C2598 f8637;

    public C1702(C2598 c2598, C2598 c25982, int i) {
        this.f8635 = i;
        this.f8636 = c25982;
        this.f8637 = c2598;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8637 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2598 c2598 = this.f8637;
        C2598 c25982 = this.f8636;
        this.f8637 = (c2598 == c25982 || c25982 == null) ? null : m3451(c2598);
        return c2598;
    }

    @Override // yyds.AbstractC1214
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo2473(C2598 c2598) {
        C2598 c25982;
        C2598 c25983 = this.f8636;
        C2598 c2598M3451 = null;
        if (c25983 == c2598 && c2598 == this.f8637) {
            this.f8637 = null;
            this.f8636 = null;
            c25983 = null;
        }
        C2598 c25984 = c25983;
        if (c25983 == c2598) {
            switch (this.f8635) {
                case 0:
                    c25982 = c25983.f12795;
                    break;
                default:
                    c25982 = c25983.f12793;
                    break;
            }
            c25984 = c25982;
            this.f8636 = c25984;
        }
        C2598 c25985 = this.f8637;
        if (c25985 == c2598) {
            if (c25985 != c25984 && c25984 != null) {
                c2598M3451 = m3451(c25985);
            }
            this.f8637 = c2598M3451;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C2598 m3451(C2598 c2598) {
        switch (this.f8635) {
            case 0:
                return c2598.f12793;
            default:
                return c2598.f12795;
        }
    }
}
