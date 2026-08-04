package yyds;

/* JADX INFO: renamed from: yyds.ᛲᛴᲀᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0336 implements Cloneable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public /* synthetic */ int f1756;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public /* synthetic */ int[] f1757;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public /* synthetic */ Object[] f1758;

    public final Object clone() {
        C0336 c0336 = (C0336) super.clone();
        c0336.f1757 = (int[]) this.f1757.clone();
        c0336.f1758 = (Object[]) this.f1758.clone();
        return c0336;
    }

    public final String toString() {
        int i = this.f1756;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.f1756;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f1757[i3]);
            sb.append('=');
            Object[] objArr = this.f1758;
            if (i3 >= objArr.length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            Object obj = objArr[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
