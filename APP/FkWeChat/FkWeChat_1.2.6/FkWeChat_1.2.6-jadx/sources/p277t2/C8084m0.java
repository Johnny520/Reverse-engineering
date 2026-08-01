package p277t2;

import java.util.Comparator;
import p172l8.C4711r;
import p250r1.C6457g;

/* JADX INFO: renamed from: t2.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8084m0 implements Comparator {

    /* JADX INFO: renamed from: a */
    public static final C8084m0 f26990a = new C8084m0();

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(C4711r c4711r, C4711r c4711r2) {
        int iCompare = Float.compare(((C6457g) c4711r.m18795e()).m25586o(), ((C6457g) c4711r2.m18795e()).m25586o());
        return iCompare != 0 ? iCompare : Float.compare(((C6457g) c4711r.m18795e()).m25580i(), ((C6457g) c4711r2.m18795e()).m25580i());
    }
}
