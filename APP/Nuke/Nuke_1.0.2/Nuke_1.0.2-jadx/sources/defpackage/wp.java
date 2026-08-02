package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class wp extends kj0 implements Comparable {
    public static final wp j = new wp(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kj0, defpackage.t23
    public final String b() {
        return i("", "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final int compareTo(wp wpVar) {
        if (this != wpVar) {
            int length = this.i.length;
            int length2 = wpVar.i.length;
            int iMin = Math.min(length, length2);
            for (int i = 0; i < iMin; i++) {
                int iA = ((vp) e(i)).compareTo((vp) wpVar.e(i));
                if (iA != 0) {
                    return iA;
                }
            }
            if (length < length2) {
                return -1;
            }
            if (length > length2) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String i(String str, String str2) {
        StringBuilder sb = new StringBuilder(100);
        Object[] objArr = this.i;
        int length = objArr.length;
        sb.append(str);
        sb.append(str2);
        sb.append("catch ");
        for (int i = 0; i < length; i++) {
            vp vpVar = (vp) e(i);
            if (i != 0) {
                sb.append(",\n");
                sb.append(str);
                sb.append("  ");
            }
            if (i != length - 1) {
                sb.append(vpVar.h.h.b());
            } else {
                int length2 = objArr.length;
                if (length2 == 0 ? false : ((vp) e(length2 - 1)).h.equals(r30.k)) {
                    sb.append("<any>");
                }
            }
            sb.append(" -> ");
            int i2 = vpVar.i;
            sb.append(i2 == ((char) i2) ? pp0.J(i2) : pp0.K(i2));
        }
        return sb.toString();
    }
}
