package yyds;

/* JADX INFO: renamed from: yyds.ᛴᛷᛳᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0888 implements CharSequence {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public char[] f4070;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public String f4071;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f4070[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f4070.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new String(this.f4070, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.f4071;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f4070);
        this.f4071 = str2;
        return str2;
    }
}
