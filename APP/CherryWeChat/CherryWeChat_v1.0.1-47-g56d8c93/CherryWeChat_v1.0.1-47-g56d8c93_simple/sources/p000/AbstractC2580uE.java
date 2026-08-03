package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: uE */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2580uE {

    /* JADX INFO: renamed from: a */
    public final HashMap f8938a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f8939b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f8940c;

    public AbstractC2580uE() {
        this.f8938a = new HashMap();
        this.f8939b = new LinkedHashSet();
        this.f8940c = false;
    }

    /* JADX INFO: renamed from: a */
    public static void m5082a(Object r1) {
        if ((r1 instanceof Closeable) == true) goto L10;
        return;
    L10:
        ((Closeable) r1).close();     // Catch: IOException -> L6
        return;
    L6:
        e = move-exception;
        throw new RuntimeException(e);
    }

    /* JADX INFO: renamed from: b */
    public void mo297b() {
    }
}
