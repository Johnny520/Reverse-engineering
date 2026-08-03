package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: uE */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2580uE {

    /* JADX INFO: renamed from: a */
    public final HashMap f8938a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f8939b = new LinkedHashSet();

    /* JADX INFO: renamed from: c */
    public volatile boolean f8940c = false;

    /* JADX INFO: renamed from: a */
    public static void m5082a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo297b() {
    }
}
