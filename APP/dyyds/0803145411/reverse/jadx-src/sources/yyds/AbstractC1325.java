package yyds;

import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: renamed from: yyds.ᛶᛴᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1325 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static volatile C1966 f6087;

    static {
        try {
            for (Map.Entry entry : AbstractC2691.f13230.entrySet()) {
                AbstractC2691.m4782((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e) {
            System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
        f6087 = new C1966();
        Logger.getLogger(C1284.class.getName());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
