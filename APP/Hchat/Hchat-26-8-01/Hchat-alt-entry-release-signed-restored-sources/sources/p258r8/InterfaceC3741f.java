package p258r8;

import p300ub.AbstractC4302b;
import p300ub.C4301a;

/* JADX INFO: renamed from: r8.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3741f {
    /* JADX INFO: renamed from: a */
    String mo297a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    default boolean mo4940b(C3742g c3742g) {
        c3742g.getClass();
        C4301a c4301a = c3742g.f12149g;
        String strConcat = mo297a().concat("_enabled");
        c4301a.getClass();
        try {
            return AbstractC4302b.m8640c(c4301a.f14345a, "Hchat_global_config").getBoolean(strConcat, true);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: c */
    void mo4941c(C3742g c3742g);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    default void mo4988d(C3742g c3742g) {
        c3742g.getClass();
    }

    String name();
}
