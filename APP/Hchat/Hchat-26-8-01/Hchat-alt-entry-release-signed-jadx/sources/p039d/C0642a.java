package p039d;

import java.util.concurrent.Executors;
import p219oh.AbstractC3165h;

/* JADX INFO: renamed from: d.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0642a extends AbstractC3165h {

    /* JADX INFO: renamed from: d */
    public static volatile C0642a f2002d;

    /* JADX INFO: renamed from: c */
    public final Object f2003c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0642a(int i9) {
        switch (i9) {
            case 1:
                this.f2003c = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC0643b(0));
                break;
            default:
                this.f2003c = new C0642a(1);
                break;
        }
    }
}
