package p134j6;

/* JADX INFO: renamed from: j6.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2071i {

    /* JADX INFO: renamed from: a */
    public static final int f6954a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i9;
        String property = System.getProperty("java.version");
        try {
            String[] strArrSplit = property.split("[._]", 3);
            i9 = Integer.parseInt(strArrSplit[0]);
            if (i9 == 1 && strArrSplit.length > 1) {
                i9 = Integer.parseInt(strArrSplit[1]);
            }
        } catch (NumberFormatException unused) {
            i9 = -1;
        }
        if (i9 == -1) {
            try {
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 0; i10 < property.length(); i10++) {
                    char cCharAt = property.charAt(i10);
                    if (!Character.isDigit(cCharAt)) {
                        break;
                    }
                    sb2.append(cCharAt);
                }
                i9 = Integer.parseInt(sb2.toString());
            } catch (NumberFormatException unused2) {
                i9 = -1;
            }
        }
        if (i9 == -1) {
            i9 = 6;
        }
        f6954a = i9;
    }
}
