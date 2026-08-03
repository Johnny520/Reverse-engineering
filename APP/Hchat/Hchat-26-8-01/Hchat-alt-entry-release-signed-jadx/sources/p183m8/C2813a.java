package p183m8;

import java.util.List;
import p089g1.C1275d;
import p099h.Hchat.dexkit.DexFinder;

/* JADX INFO: renamed from: m8.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2813a {

    /* JADX INFO: renamed from: a */
    public final C2815c f9079a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2813a(C2815c c2815c, C1275d c1275d) {
        this.f9079a = c2815c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m6205a(DexFinder dexFinder) {
        if (dexFinder == null) {
            return;
        }
        if (dexFinder.netQueueClass == null) {
            List<Class<?>> list = dexFinder.netQueueCandidateClasses;
            list.getClass();
            if (list.isEmpty()) {
                return;
            }
        }
        this.f9079a.m6212c(dexFinder.netQueueClass, dexFinder.netQueueCandidateClasses);
    }
}
