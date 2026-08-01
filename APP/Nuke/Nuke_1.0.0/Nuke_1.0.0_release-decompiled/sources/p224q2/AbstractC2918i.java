package p224q2;

/* JADX INFO: renamed from: q2.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2918i {

    /* JADX INFO: renamed from: a */
    public static final int f9217a;

    static {
        int i5;
        String property = System.getProperty("java.version");
        try {
            String[] strArrSplit = property.split("[._]", 3);
            i5 = Integer.parseInt(strArrSplit[0]);
            if (i5 == 1 && strArrSplit.length > 1) {
                i5 = Integer.parseInt(strArrSplit[1]);
            }
        } catch (NumberFormatException unused) {
            i5 = -1;
        }
        if (i5 == -1) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i6 = 0; i6 < property.length(); i6++) {
                    char cCharAt = property.charAt(i6);
                    if (!Character.isDigit(cCharAt)) {
                        break;
                    }
                    sb.append(cCharAt);
                }
                i5 = Integer.parseInt(sb.toString());
            } catch (NumberFormatException unused2) {
                i5 = -1;
            }
        }
        if (i5 == -1) {
            i5 = 6;
        }
        f9217a = i5;
    }
}
