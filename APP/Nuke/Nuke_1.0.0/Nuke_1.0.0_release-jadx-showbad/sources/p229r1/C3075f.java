package p229r1;

import java.util.Objects;

/* JADX INFO: renamed from: r1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3075f {

    /* JADX INFO: renamed from: a */
    public final C3073e f9790a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new C3075f(0, 0, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3075f(int i5, int i6, String str) {
        this.f9790a = new C3073e(i5, i6, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C3075f m5397a(int i5, int i6, boolean z5, int i7, int i8, int i9, int i10) {
        String string;
        if (z5) {
            int i11 = i5 / 2;
            int i12 = i6 / 2;
            string = "M0," + i12 + " A" + i11 + "," + i12 + " 0 1,1 " + i5 + "," + i12 + " A" + i11 + "," + i12 + " 0 1,1 0," + i12 + " Z";
        } else {
            StringBuilder sb = new StringBuilder("M ");
            int iMin = Math.min(i5 / 2, i6 / 2);
            int iMin2 = Math.min(iMin, i7);
            int iMin3 = Math.min(iMin, i8);
            int iMin4 = Math.min(iMin, i9);
            int iMin5 = Math.min(iMin, i10);
            sb.append(iMin2);
            sb.append(",0 L ");
            sb.append(i5 - iMin3);
            sb.append(",0");
            if (iMin3 > 0) {
                sb.append(" A ");
                sb.append(iMin3);
                sb.append(",");
                sb.append(iMin3);
                sb.append(" 0 0,1 ");
                sb.append(i5);
                sb.append(",");
                sb.append(iMin3);
            }
            sb.append(" L ");
            sb.append(i5);
            sb.append(",");
            sb.append(i6 - iMin4);
            if (iMin4 > 0) {
                sb.append(" A ");
                sb.append(iMin4);
                sb.append(",");
                sb.append(iMin4);
                sb.append(" 0 0,1 ");
                sb.append(i5 - iMin4);
                sb.append(",");
                sb.append(i6);
            }
            sb.append(" L ");
            sb.append(iMin5);
            sb.append(",");
            sb.append(i6);
            if (iMin5 > 0) {
                sb.append(" A ");
                sb.append(iMin5);
                sb.append(",");
                sb.append(iMin5);
                sb.append(" 0 0,1 0,");
                sb.append(i6 - iMin5);
            }
            if (iMin2 > 0) {
                sb.append(" L 0,");
                sb.append(iMin2);
                sb.append(" A ");
                sb.append(iMin2);
                sb.append(",");
                sb.append(iMin2);
                sb.append(" 0 0,1 ");
                sb.append(iMin2);
                sb.append(",0");
            }
            sb.append(" Z");
            string = sb.toString();
        }
        return new C3075f(i5, i6, string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3075f) {
            return Objects.equals(this.f9790a, ((C3075f) obj).f9790a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Objects.hashCode(this.f9790a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f9790a.toString();
    }
}
