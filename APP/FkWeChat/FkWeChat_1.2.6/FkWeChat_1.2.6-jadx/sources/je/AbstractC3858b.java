package je;

import p299ub.AbstractC8610a;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: je.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3858b {
    /* JADX INFO: renamed from: a */
    public static final boolean m15294a(char c10) {
        return AbstractC8621f0.m33124Z("$^`", c10, false, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m15295b(char c10) {
        return m15294a(c10) || ((1676673024 >> Character.getType(c10)) & 1) != 0;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m15296c(char c10) {
        return c10 == 0 || Character.isSpaceChar(c10) || AbstractC8610a.m33055c(c10);
    }
}
