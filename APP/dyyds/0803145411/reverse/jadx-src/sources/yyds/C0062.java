package yyds;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: yyds.ᛱᛱᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0062 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C0469 f587 = new C0469(14);

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final LinkedHashMap f588 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final ReentrantLock f589;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C2133 f590;

    public C0062(String str, boolean z) {
        ReentrantLock reentrantLock;
        synchronized (f587) {
            try {
                LinkedHashMap linkedHashMap = f588;
                Object reentrantLock2 = linkedHashMap.get(str);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(str, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f589 = reentrantLock;
        this.f590 = z ? new C2133(str) : null;
    }
}
