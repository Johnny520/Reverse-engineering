package p179i4;

import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: i4.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2355j {
    /* JADX INFO: renamed from: a */
    public static boolean m4214a() {
        Conscrypt.Version version = Conscrypt.version();
        if (version == null) {
            return false;
        }
        if (version.major() != 2) {
            if (version.major() <= 2) {
                return false;
            }
        } else if (version.minor() != 1) {
            if (version.minor() <= 1) {
                return false;
            }
        } else if (version.patch() < 0) {
            return false;
        }
        return true;
    }
}
