package yyds;

import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᛴᲁᛲᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0949 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final String f4412;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f4413;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2767 f4414;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Object[] f4415;

    public C0949(String str, String str2, C2767 c2767, Object... objArr) {
        this.f4412 = str;
        this.f4413 = str2;
        this.f4414 = c2767;
        this.f4415 = objArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0949)) {
            return false;
        }
        C0949 c0949 = (C0949) obj;
        return this.f4412.equals(c0949.f4412) && this.f4413.equals(c0949.f4413) && this.f4414.equals(c0949.f4414) && Arrays.equals(this.f4415, c0949.f4415);
    }

    public final int hashCode() {
        return Integer.rotateLeft(Arrays.hashCode(this.f4415), 24) ^ ((this.f4412.hashCode() ^ Integer.rotateLeft(this.f4413.hashCode(), 8)) ^ Integer.rotateLeft(this.f4414.hashCode(), 16));
    }

    public final String toString() {
        String string = Arrays.toString(this.f4415);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4412);
        sb.append(" : ");
        sb.append(this.f4413);
        sb.append(" ");
        sb.append(this.f4414);
        return AbstractC2104.m4015(sb, " ", string);
    }
}
