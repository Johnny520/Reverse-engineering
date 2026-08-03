package p181m6;

import java.sql.Date;
import java.sql.Timestamp;
import p181m6.C2782a;
import p181m6.C2783b;

/* JADX INFO: renamed from: m6.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2787f {

    /* JADX INFO: renamed from: a */
    public static final boolean f9029a;

    /* JADX INFO: renamed from: b */
    public static final C2786e f9030b;

    /* JADX INFO: renamed from: c */
    public static final C2786e f9031c;

    /* JADX INFO: renamed from: d */
    public static final C2782a.a f9032d;

    /* JADX INFO: renamed from: e */
    public static final C2783b.a f9033e;

    /* JADX INFO: renamed from: f */
    public static final C2784c f9034f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        boolean z9;
        try {
            Class.forName("java.sql.Date");
            z9 = true;
        } catch (ClassNotFoundException unused) {
            z9 = false;
        }
        f9029a = z9;
        if (z9) {
            f9030b = new C2786e(Date.class);
            f9031c = new C2786e(Timestamp.class);
            f9032d = C2782a.f9023b;
            f9033e = C2783b.f9025b;
            f9034f = C2785d.f9027b;
            return;
        }
        f9030b = null;
        f9031c = null;
        f9032d = null;
        f9033e = null;
        f9034f = null;
    }
}
