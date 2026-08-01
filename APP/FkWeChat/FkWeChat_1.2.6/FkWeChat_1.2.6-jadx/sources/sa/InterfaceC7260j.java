package sa;

import p229p9.InterfaceC5983a;
import p229p9.InterfaceC5995e;

/* JADX INFO: renamed from: sa.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC7260j {

    /* JADX INFO: renamed from: sa.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum a {
        CONFLICTS_ONLY,
        SUCCESS_ONLY,
        BOTH
    }

    /* JADX INFO: renamed from: sa.j$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum b {
        OVERRIDABLE,
        INCOMPATIBLE,
        UNKNOWN
    }

    /* JADX INFO: renamed from: a */
    a mo28774a();

    /* JADX INFO: renamed from: b */
    b mo28775b(InterfaceC5983a interfaceC5983a, InterfaceC5983a interfaceC5983a2, InterfaceC5995e interfaceC5995e);
}
