package p065eb;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p036c9.ThreadFactoryC0478q;
import p218og.C3147k;

/* JADX INFO: renamed from: eb.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0866f {

    /* JADX INFO: renamed from: c */
    public static volatile boolean f2662c;

    /* JADX INFO: renamed from: a */
    public static final C0866f f2660a = new C0866f();

    /* JADX INFO: renamed from: b */
    public static final C3147k f2661b = new C3147k("[a-z0-9_\\-.]{3,}");

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f2663d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public static final ExecutorService f2664e = Executors.newSingleThreadExecutor(new ThreadFactoryC0478q(5));
}
