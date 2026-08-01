package p277t2;

import java.util.Comparator;
import p250r1.C6457g;

/* JADX INFO: renamed from: t2.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8081l implements Comparator {

    /* JADX INFO: renamed from: a */
    public static final C8081l f26977a = new C8081l();

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(C8094w c8094w, C8094w c8094w2) {
        C6457g c6457gM31286l = c8094w.m31286l();
        C6457g c6457gM31286l2 = c8094w2.m31286l();
        int iCompare = Float.compare(c6457gM31286l2.m25584m(), c6457gM31286l.m25584m());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Float.compare(c6457gM31286l.m25586o(), c6457gM31286l2.m25586o());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Float.compare(c6457gM31286l.m25580i(), c6457gM31286l2.m25580i());
        return iCompare3 != 0 ? iCompare3 : Float.compare(c6457gM31286l2.m25583l(), c6457gM31286l.m25583l());
    }
}
