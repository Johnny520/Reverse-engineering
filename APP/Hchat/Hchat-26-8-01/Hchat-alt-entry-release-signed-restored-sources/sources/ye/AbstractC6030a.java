package ye;

import af.C0084g;
import be.AbstractC0283h;
import java.io.InputStream;
import java.util.HashMap;

/* JADX INFO: renamed from: ye.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6030a {

    /* JADX INFO: renamed from: a */
    public static final HashMap f24482a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        try {
            InputStream resourceAsStream = AbstractC6030a.class.getResourceAsStream("/android/res-map.txt");
            try {
                HashMap mapM1139S = AbstractC0283h.m1139S(resourceAsStream);
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                f24482a = mapM1139S;
            } finally {
            }
        } catch (Exception e6) {
            throw new C0084g("Failed to load android resource file (res-map.txt)", e6);
        }
    }
}
