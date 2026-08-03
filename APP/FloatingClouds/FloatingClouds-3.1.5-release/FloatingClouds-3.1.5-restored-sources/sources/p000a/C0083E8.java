package p000a;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: a.E8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0083E8 {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap<String, C0101F8> f263a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    public static volatile int f264b = -1;

    /* JADX INFO: renamed from: a */
    public static void m208a(String str, String str2, String str3, String str4) {
        String str5 = str + "/" + str2;
        ConcurrentHashMap<String, C0101F8> concurrentHashMap = f263a;
        C0101F8 c0101f8 = concurrentHashMap.get(str5);
        if (c0101f8 == null) {
            int i = f264b;
            System.currentTimeMillis();
            C0101F8 c0101f82 = new C0101F8(str5, str, str2, str3, i);
            C0101F8 c0101f8PutIfAbsent = concurrentHashMap.putIfAbsent(str5, c0101f82);
            c0101f8 = c0101f8PutIfAbsent == null ? c0101f82 : c0101f8PutIfAbsent;
        }
        C0053Ce.m143X(str4, 200);
        System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: b */
    public static void m209b(String str, String str2, String str3) {
        C0631i9.m1482e(str2, "hookId");
        C0631i9.m1482e(str3, "target");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String strM2228h = C0944z.m2228h(sb, "/", str2);
        ConcurrentHashMap<String, C0101F8> concurrentHashMap = f263a;
        C0101F8 c0101f8 = concurrentHashMap.get(strM2228h);
        if (c0101f8 == null) {
            int i = f264b;
            System.currentTimeMillis();
            C0101F8 c0101f82 = new C0101F8(strM2228h, str, str2, str3, i);
            C0101F8 c0101f8PutIfAbsent = concurrentHashMap.putIfAbsent(strM2228h, c0101f82);
            c0101f8 = c0101f8PutIfAbsent == null ? c0101f82 : c0101f8PutIfAbsent;
        }
    }
}
