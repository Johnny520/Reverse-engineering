package p000;

import java.sql.Date;
import java.sql.Timestamp;
import p000.rt2;
import p000.st2;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wt2 {

    /* JADX INFO: renamed from: a */
    public static final boolean f12644a;

    /* JADX INFO: renamed from: b */
    public static final rt2.C0669a f12645b;

    /* JADX INFO: renamed from: c */
    public static final st2.C0707a f12646c;

    /* JADX INFO: renamed from: d */
    public static final tt2 f12647d;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f12644a = z;
        if (!z) {
            f12645b = null;
            f12646c = null;
            f12647d = null;
        } else {
            new vt2(0, Date.class);
            new vt2(1, Timestamp.class);
            f12645b = rt2.f9753b;
            f12646c = st2.f10366b;
            f12647d = ut2.f11478b;
        }
    }
}
