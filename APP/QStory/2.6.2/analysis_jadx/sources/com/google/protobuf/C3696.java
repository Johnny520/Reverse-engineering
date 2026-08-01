package com.google.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪苏子哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C3696 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3696 f11495 = new C3696(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static volatile C3696 f11496;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Map f11497;

    public C3696(C3696 c3696) {
        if (c3696 == f11495) {
            this.f11497 = Collections.EMPTY_MAP;
        } else {
            this.f11497 = Collections.unmodifiableMap(c3696.f11497);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C3696 m7960() {
        C3696 c3696;
        Class cls = AbstractC3546.f11193;
        C3696 c36962 = f11496;
        if (c36962 != null) {
            return c36962;
        }
        synchronized (C3696.class) {
            try {
                c3696 = f11496;
                if (c3696 == null) {
                    Class cls2 = AbstractC3691.f11486;
                    C3696 c36963 = null;
                    if (cls2 != null) {
                        try {
                            c36963 = (C3696) cls2.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c3696 = c36963 != null ? c36963 : f11495;
                    f11496 = c3696;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3696;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3602 m7961(int i, InterfaceC3440 interfaceC3440) {
        return (C3602) this.f11497.get(new C3695(i, interfaceC3440));
    }

    public C3696() {
        this.f11497 = new HashMap();
    }

    public C3696(int i) {
        this.f11497 = Collections.EMPTY_MAP;
    }
}
