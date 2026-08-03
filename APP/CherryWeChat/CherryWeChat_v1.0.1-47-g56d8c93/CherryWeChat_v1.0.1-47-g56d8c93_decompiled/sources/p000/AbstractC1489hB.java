package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: renamed from: hB */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1489hB {

    /* JADX INFO: renamed from: a */
    public static final Logger f5259a = Logger.getLogger(AbstractC1489hB.class.getName());

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f5260b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static boolean m2848a() {
        return f5260b.get();
    }
}
