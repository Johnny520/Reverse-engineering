package defpackage;

import defpackage.rt2;
import defpackage.st2;
import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wt2 {
    public static final boolean a;
    public static final rt2.a b;
    public static final st2.a c;
    public static final tt2 d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (!z) {
            b = null;
            c = null;
            d = null;
        } else {
            new vt2(0, Date.class);
            new vt2(1, Timestamp.class);
            b = rt2.b;
            c = st2.b;
            d = ut2.b;
        }
    }
}
