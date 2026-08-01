package p000;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class rc1 {

    /* JADX INFO: renamed from: a */
    public final jo0 f5353a = new jo0(19);

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f5354b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f5355c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    public volatile boolean f5356d;

    /* JADX DEBUG: Class process forced to load method for inline: t1.q(java.lang.AutoCloseable):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m3441a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                AbstractC0748t1.m4159q(autoCloseable);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
