package p046Z;

import java.sql.Date;
import java.sql.Timestamp;
import p042W.C0329a;

/* JADX INFO: renamed from: Z.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0360c {

    /* JADX INFO: renamed from: a */
    public static final boolean f841a;

    /* JADX INFO: renamed from: b */
    public static final C0359b f842b;

    /* JADX INFO: renamed from: c */
    public static final C0359b f843c;

    /* JADX INFO: renamed from: d */
    public static final C0329a f844d;

    /* JADX INFO: renamed from: e */
    public static final C0329a f845e;

    /* JADX INFO: renamed from: f */
    public static final C0329a f846f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        boolean z2;
        try {
            Class.forName("java.sql.Date");
            z2 = true;
        } catch (ClassNotFoundException unused) {
            z2 = false;
        }
        f841a = z2;
        if (z2) {
            f842b = new C0359b(Date.class, 0);
            f843c = new C0359b(Timestamp.class, 1);
            f844d = C0358a.f835c;
            f845e = C0358a.f836d;
            f846f = C0358a.f837e;
            return;
        }
        f842b = null;
        f843c = null;
        f844d = null;
        f845e = null;
        f846f = null;
    }
}
