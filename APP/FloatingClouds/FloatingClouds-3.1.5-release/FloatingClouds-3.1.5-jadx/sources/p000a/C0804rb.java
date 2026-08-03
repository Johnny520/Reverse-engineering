package p000a;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: a.rb */
/* JADX INFO: loaded from: classes.dex */
public final class C0804rb {

    /* JADX INFO: renamed from: a */
    public static final C0804rb f3191a = new C0804rb();

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f3192b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public static final LinkedHashMap f3193c = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m1879a(String str) {
        Boolean bool;
        bool = (Boolean) f3192b.get(str);
        return bool != null ? bool.booleanValue() : false;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m1880b(String str) {
        f3192b.put(str, Boolean.TRUE);
    }
}
