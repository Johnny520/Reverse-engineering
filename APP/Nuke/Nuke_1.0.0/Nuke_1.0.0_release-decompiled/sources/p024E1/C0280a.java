package p024E1;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import p002A1.C0115D;
import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: E1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0280a {

    /* JADX INFO: renamed from: a */
    public final C0115D f902a = new C0115D(9);

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f903b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f904c = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    public volatile boolean f905d;

    /* JADX INFO: renamed from: a */
    public static void m486a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                AbstractC0231b.m407r(autoCloseable);
            } catch (Exception e5) {
                throw new RuntimeException(e5);
            }
        }
    }
}
