package yyds;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: yyds.ᲁᲈᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2358 implements InterfaceC2172 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public volatile boolean f11580 = false;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final ConcurrentHashMap f11581 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final LinkedBlockingQueue f11579 = new LinkedBlockingQueue();

    @Override // yyds.InterfaceC2172
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final synchronized InterfaceC0732 mo607(String str) {
        C1064 c1064;
        c1064 = (C1064) this.f11581.get(str);
        if (c1064 == null) {
            c1064 = new C1064(str, this.f11579, this.f11580);
            this.f11581.put(str, c1064);
        }
        return c1064;
    }
}
