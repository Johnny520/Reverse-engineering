package p278t3;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: renamed from: t3.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8100c {

    /* JADX INFO: renamed from: t3.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static LocaleList m31316a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C8102e m31315a(Configuration configuration) {
        return C8102e.m31320c(a.m31316a(configuration));
    }
}
