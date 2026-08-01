package p264s0;

import java.util.Locale;
import p215oc.C5725t;

/* JADX INFO: renamed from: s0.e2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC6706e2 {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ String m26645a(InterfaceC6706e2 interfaceC6706e2, Long l10, Locale locale, boolean z10, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: formatDate");
            return null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return interfaceC6706e2.mo26646b(l10, locale, z10);
    }

    /* JADX INFO: renamed from: b */
    String mo26646b(Long l10, Locale locale, boolean z10);

    /* JADX INFO: renamed from: c */
    String mo26647c(Long l10, Locale locale);
}
