package yyds;

/* JADX INFO: renamed from: yyds.ᛳᲈᛲᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0739 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public float f3431;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public float f3432;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public float f3433;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public float f3434;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f3435;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public float f3436;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public float f3437;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public float f3438;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0739)) {
            return false;
        }
        C0739 c0739 = (C0739) obj;
        return Float.compare(this.f3433, c0739.f3433) == 0 && Float.compare(this.f3434, c0739.f3434) == 0 && Float.compare(this.f3436, c0739.f3436) == 0 && Float.compare(this.f3438, c0739.f3438) == 0 && Float.compare(this.f3432, c0739.f3432) == 0 && Float.compare(this.f3437, c0739.f3437) == 0 && this.f3435 == c0739.f3435 && Float.compare(this.f3431, c0739.f3431) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f3431) + AbstractC2104.m4018(this.f3435, (Float.hashCode(this.f3437) + ((Float.hashCode(this.f3432) + ((Float.hashCode(this.f3438) + ((Float.hashCode(this.f3436) + ((Float.hashCode(this.f3434) + (Float.hashCode(this.f3433) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1589360810689390L));
        sb.append(this.f3433);
        sb.append(AbstractC2328.m4341(-1589425235198830L));
        sb.append(this.f3434);
        sb.append(AbstractC2328.m4341(-1589451005002606L));
        sb.append(this.f3436);
        sb.append(AbstractC2328.m4341(-1589493954675566L));
        sb.append(this.f3438);
        sb.append(AbstractC2328.m4341(-1589562674152302L));
        sb.append(this.f3432);
        sb.append(AbstractC2328.m4341(-1589588443956078L));
        sb.append(this.f3437);
        sb.append(AbstractC2328.m4341(-1589614213759854L));
        AbstractC2104.m4007(sb, this.f3435, -1589652868465518L);
        sb.append(this.f3431);
        sb.append(')');
        return sb.toString();
    }
}
