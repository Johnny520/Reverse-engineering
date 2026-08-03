package ac;

import java.util.concurrent.ConcurrentHashMap;
import p136j8.C2104o;

/* JADX INFO: renamed from: ac.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0061n {

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f185c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final String f186a;

    /* JADX INFO: renamed from: b */
    public final String f187b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0061n(String str, String str2) {
        if (str == null || str.isEmpty()) {
            C2104o.m5294t("path is empty");
            throw null;
        }
        if (str2 == null || str2.isEmpty()) {
            C2104o.m5294t("name is empty");
            throw null;
        }
        this.f186a = str.endsWith("/") ? str : str.concat("/");
        this.f187b = str2;
    }
}
