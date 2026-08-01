package p125i7;

import java.io.File;
import java.net.URL;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: i7.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3207d0 {
    /* JADX INFO: renamed from: a */
    public static final boolean m12207a(URL url, String str) {
        char c10;
        String strM33068M;
        url.getClass();
        str.getClass();
        String path = url.getPath();
        if (path == null || (strM33068M = AbstractC8611a0.m33068M(path, (c10 = File.separatorChar), '/', false, 4, null)) == null) {
            return false;
        }
        return AbstractC8621f0.m33122Y(strM33068M, AbstractC8611a0.m33068M(str, c10, '/', false, 4, null), true);
    }
}
