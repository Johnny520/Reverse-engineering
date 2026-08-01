package p210o7;

import p299ub.AbstractC8644z;

/* JADX INFO: renamed from: o7.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5649a {
    /* JADX INFO: renamed from: a */
    public static final long m22849a() {
        Long lM33254u;
        String property = System.getProperty("io.ktor.server.request.formFieldLimit");
        if (property == null || (lM33254u = AbstractC8644z.m33254u(property)) == null) {
            return 52428800L;
        }
        return lM33254u.longValue();
    }
}
