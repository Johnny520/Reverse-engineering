package p006a5;

/* JADX INFO: renamed from: a5.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0066b {
    /* JADX INFO: renamed from: a */
    public static String m220a(int i10) {
        String str = "039";
        if (i10 < 28) {
            if (i10 >= 10000) {
                str = "040";
            } else if (i10 < 28) {
                str = i10 >= 26 ? "038" : i10 >= 24 ? "037" : "035";
            }
        }
        return "dex\n" + str + "\u0000";
    }
}
