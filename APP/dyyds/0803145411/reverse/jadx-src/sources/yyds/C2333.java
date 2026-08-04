package yyds;

/* JADX INFO: renamed from: yyds.ᲁᲁᛷᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2333 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final float f11482;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final float f11483;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int f11484;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f11485;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final float f11486;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final float f11487;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final float f11488;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final float f11489;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final float f11490;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final float f11491;

    public C2333(String str, float f, float f2, float f3, int i, float f4, float f5, float f6, float f7, float f8) {
        AbstractC2328.m4341(-1715224827298670L);
        this.f11485 = str;
        this.f11486 = f;
        this.f11489 = f2;
        this.f11491 = f3;
        this.f11484 = i;
        this.f11490 = f4;
        this.f11487 = f5;
        this.f11482 = f6;
        this.f11483 = f7;
        this.f11488 = f8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2333)) {
            return false;
        }
        C2333 c2333 = (C2333) obj;
        return AbstractC1544.m3188(this.f11485, c2333.f11485) && Float.compare(this.f11486, c2333.f11486) == 0 && Float.compare(this.f11489, c2333.f11489) == 0 && Float.compare(this.f11491, c2333.f11491) == 0 && this.f11484 == c2333.f11484 && Float.compare(this.f11490, c2333.f11490) == 0 && Float.compare(this.f11487, c2333.f11487) == 0 && Float.compare(this.f11482, c2333.f11482) == 0 && Float.compare(this.f11483, c2333.f11483) == 0 && Float.compare(this.f11488, c2333.f11488) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11488) + ((Float.hashCode(this.f11483) + ((Float.hashCode(this.f11482) + ((Float.hashCode(this.f11487) + ((Float.hashCode(this.f11490) + AbstractC2104.m4018(this.f11484, (Float.hashCode(this.f11491) + ((Float.hashCode(this.f11489) + ((Float.hashCode(this.f11486) + (this.f11485.hashCode() * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-1715276366906222L));
        AbstractC0897.m2002(sb, this.f11485, -1715345086382958L);
        sb.append(this.f11486);
        sb.append(AbstractC2328.m4341(-1715366561219438L));
        sb.append(this.f11489);
        sb.append(AbstractC2328.m4341(-1715388036055918L));
        sb.append(this.f11491);
        sb.append(AbstractC2328.m4341(-1715430985728878L));
        AbstractC2104.m4007(sb, this.f11484, -1715469640434542L);
        sb.append(this.f11490);
        sb.append(AbstractC2328.m4341(-1715508295140206L));
        sb.append(this.f11487);
        sb.append(AbstractC2328.m4341(-1715546949845870L));
        sb.append(this.f11482);
        sb.append(AbstractC2328.m4341(-1715581309584238L));
        sb.append(this.f11483);
        sb.append(AbstractC2328.m4341(-1715615669322606L));
        sb.append(this.f11488);
        sb.append(')');
        return sb.toString();
    }
}
