package p000a;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: a.Fd */
/* JADX INFO: loaded from: classes.dex */
public final class C0106Fd {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap<String, C0742o6> f365a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    public static C0742o6 m291a(String str) {
        C0742o6 c0742o6PutIfAbsent;
        ConcurrentHashMap<String, C0742o6> concurrentHashMap = f365a;
        C0742o6 c0742o6 = concurrentHashMap.get(str);
        if (c0742o6 == null && (c0742o6PutIfAbsent = concurrentHashMap.putIfAbsent(str, (c0742o6 = new C0742o6(str)))) != null) {
            c0742o6 = c0742o6PutIfAbsent;
        }
        return c0742o6;
    }
}
