package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: androidx.lifecycle.L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0460L {

    /* JADX INFO: renamed from: a */
    public final HashMap f1491a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f1492b = new LinkedHashSet();

    /* JADX INFO: renamed from: c */
    public volatile boolean f1493c = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m917a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void mo339b() {
    }
}
