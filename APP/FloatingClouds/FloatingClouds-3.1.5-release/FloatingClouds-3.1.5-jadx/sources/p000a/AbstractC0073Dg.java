package p000a;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: a.Dg */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0073Dg {

    /* JADX INFO: renamed from: a */
    public final HashMap f243a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f244b = new LinkedHashSet();

    /* JADX INFO: renamed from: c */
    public volatile boolean f245c = false;

    /* JADX INFO: renamed from: a */
    public static void m173a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo174b() {
    }
}
