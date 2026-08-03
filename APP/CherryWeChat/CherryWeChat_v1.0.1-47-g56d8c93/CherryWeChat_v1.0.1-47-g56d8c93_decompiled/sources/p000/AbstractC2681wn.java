package p000;

import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: wn */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2681wn {

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArrayList f9241a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a */
    public static C0175E2 m5250a(String str) throws GeneralSecurityException {
        boolean zStartsWith;
        for (C0175E2 c0175e2 : f9241a) {
            synchronized (c0175e2) {
                zStartsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (zStartsWith) {
                return c0175e2;
            }
        }
        throw new GeneralSecurityException(AbstractC0213Ey.m420r("No KMS client does support: ", str));
    }
}
