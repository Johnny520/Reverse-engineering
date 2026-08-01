package p247u2;

import java.sql.Date;
import java.sql.Timestamp;
import p247u2.C3331a;
import p247u2.C3332b;

/* JADX INFO: renamed from: u2.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3336f {

    /* JADX INFO: renamed from: a */
    public static final boolean f10376a;

    /* JADX INFO: renamed from: b */
    public static final C3335e f10377b;

    /* JADX INFO: renamed from: c */
    public static final C3335e f10378c;

    /* JADX INFO: renamed from: d */
    public static final C3331a.a f10379d;

    /* JADX INFO: renamed from: e */
    public static final C3332b.a f10380e;

    /* JADX INFO: renamed from: f */
    public static final C3333c f10381f;

    static {
        boolean z5;
        try {
            Class.forName("java.sql.Date");
            z5 = true;
        } catch (ClassNotFoundException unused) {
            z5 = false;
        }
        f10376a = z5;
        if (z5) {
            f10377b = new C3335e(0, Date.class);
            f10378c = new C3335e(1, Timestamp.class);
            f10379d = C3331a.f10369b;
            f10380e = C3332b.f10371b;
            f10381f = C3334d.f10373b;
            return;
        }
        f10377b = null;
        f10378c = null;
        f10379d = null;
        f10380e = null;
        f10381f = null;
    }
}
