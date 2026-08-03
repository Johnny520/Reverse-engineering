package p053df;

import java.util.HashMap;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Settings;

/* JADX INFO: renamed from: df.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0776d {

    /* JADX INFO: renamed from: a */
    public static final double[] f2335a = {0.00390625d, 3.0517578125E-5d, 1.1920928955078125E-7d, 4.656612873077393E-10d};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int iM2002a = m2002a(4);
        int iM2002a2 = m2002a(5);
        int iM2002a3 = m2002a(6);
        int iM2002a4 = m2002a(7);
        int iM2002a5 = m2002a(8);
        int iM2002a6 = m2002a(9);
        HashMap map = new HashMap();
        map.put(Integer.valueOf(iM2002a), "other");
        map.put(Integer.valueOf(iM2002a2), "zero");
        map.put(Integer.valueOf(iM2002a3), "one");
        map.put(Integer.valueOf(iM2002a4), "two");
        map.put(Integer.valueOf(iM2002a5), "few");
        map.put(Integer.valueOf(iM2002a6), "many");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m2002a(int i9) {
        return (i9 & Settings.DEFAULT_INITIAL_WINDOW_SIZE) | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
    }
}
