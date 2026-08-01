package p074k0;

import p004C.C0066j;
import p071j.ThreadFactoryC0733b;

/* JADX INFO: renamed from: k0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0742b {

    /* JADX INFO: renamed from: a */
    public static final int f2506a;

    /* JADX INFO: renamed from: b */
    public static final int f2507b;

    /* JADX INFO: renamed from: c */
    public static final ThreadFactoryC0733b f2508c;

    /* JADX INFO: renamed from: d */
    public static final C0066j f2509d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f2506a = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
        f2507b = (iAvailableProcessors * 2) + 1;
        f2508c = new ThreadFactoryC0733b(1);
        f2509d = new C0066j();
    }
}
