package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: renamed from: hB */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1489hB {

    /* JADX INFO: renamed from: a */
    public static final Logger f5259a = null;

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f5260b = null;

    static {
        f5259a = Logger.getLogger(AbstractC1489hB.class.getName());
        f5260b = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2848a() {
        if (f5260b.get() == false) goto L6;
        return true;
    L6:
        return false;
    }
}
