package p000;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gb3 {

    /* JADX INFO: renamed from: a */
    public final ix2 f3388a = new ix2(0);

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f3389b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f3390c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    public volatile boolean f3391d;

    /* JADX INFO: renamed from: a */
    public static void m1828a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                hk1.m2215n(autoCloseable);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
