package yyds;

/* JADX INFO: renamed from: yyds.ᲁᛵᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2240 extends Exception {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object f11068;

    public C2240(int i, int i2, Object obj) {
        super(m4240(i, i2, obj));
        this.f11068 = obj;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static String m4240(int i, int i2, Object obj) {
        StringBuilder sb = new StringBuilder();
        if (i2 == 0) {
            sb.append("Unexpected character (");
            sb.append(obj);
            sb.append(") at position ");
            sb.append(i);
            sb.append(".");
        } else if (i2 == 1) {
            sb.append("Unexpected token ");
            sb.append(obj);
            sb.append(" at position ");
            sb.append(i);
            sb.append(".");
        } else if (i2 == 2) {
            sb.append("Unexpected exception ");
            sb.append(obj);
            sb.append(" occur at position ");
            sb.append(i);
            sb.append(".");
        } else if (i2 == 3) {
            sb.append("Unexpected End Of File position ");
            sb.append(i);
            sb.append(": ");
            sb.append(obj);
        } else if (i2 == 4) {
            sb.append("Unexpected unicode escape sequence ");
            sb.append(obj);
            sb.append(" at position ");
            sb.append(i);
            sb.append(".");
        } else if (i2 == 5) {
            sb.append("Unexpected duplicate key:");
            sb.append(obj);
            sb.append(" at position ");
            sb.append(i);
            sb.append(".");
        } else if (i2 == 6) {
            sb.append("Unexpected leading 0 in digit for token:");
            sb.append(obj);
            sb.append(" at position ");
            sb.append(i);
            sb.append(".");
        } else if (i2 == 7) {
            sb.append("Malicious payload, having non natural depths, parsing stoped on ");
            sb.append(obj);
            sb.append(" at position ");
            sb.append(i);
            sb.append(".");
        } else {
            sb.append("Unkown error at position ");
            sb.append(i);
            sb.append(".");
        }
        return sb.toString();
    }
}
