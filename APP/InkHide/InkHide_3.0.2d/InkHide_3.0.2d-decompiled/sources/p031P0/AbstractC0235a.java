package p031P0;

import java.util.Random;
import p019J0.AbstractC0160a;
import p033Q0.C0241a;

/* JADX INFO: renamed from: P0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0235a {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0235a f570a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Integer num = AbstractC0160a.f472a;
        f570a = (num == null || num.intValue() >= 34) ? new C0241a() : new C0237c();
    }

    /* JADX INFO: renamed from: a */
    public abstract Random mo446a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m447b() {
        return mo446a().nextInt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public int mo448c() {
        int iM447b;
        int i2;
        do {
            iM447b = m447b() >>> 1;
            i2 = iM447b % 998999;
        } while ((iM447b - i2) + 998998 < 0);
        return 1000 + i2;
    }
}
