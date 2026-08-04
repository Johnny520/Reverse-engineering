package yyds;

/* JADX INFO: renamed from: yyds.ᛶᲀᛳᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1404 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f6639;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f6640;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f6641;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f6642;

    public C1404(int i, int i2, int i3, int i4) {
        this.f6639 = i;
        this.f6640 = i2;
        this.f6641 = i3;
        this.f6642 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1404)) {
            return false;
        }
        C1404 c1404 = (C1404) obj;
        return this.f6639 == c1404.f6639 && this.f6640 == c1404.f6640 && this.f6641 == c1404.f6641 && this.f6642 == c1404.f6642;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6642) + AbstractC2104.m4018(this.f6641, AbstractC2104.m4018(this.f6640, Integer.hashCode(this.f6639) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1675878631900014L));
        AbstractC2104.m4007(sb, this.f6639, -1676020365820782L);
        AbstractC2104.m4007(sb, this.f6640, -1676080495362926L);
        AbstractC2104.m4007(sb, this.f6641, -1676149214839662L);
        return AbstractC0897.m1999(sb, this.f6642, ')');
    }
}
