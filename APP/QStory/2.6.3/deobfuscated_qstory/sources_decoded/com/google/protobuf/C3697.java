package com.google.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪苏子哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3697 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3697 f11500 = new C3697(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static volatile C3697 f11501;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Map f11502;

    public C3697(C3697 c3697) {
        if (c3697 == f11500) {
            this.f11502 = Collections.EMPTY_MAP;
        } else {
            this.f11502 = Collections.unmodifiableMap(c3697.f11502);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C3697 m7947() {
        C3697 c3697;
        Class cls = AbstractC3547.f11198;
        C3697 c36972 = f11501;
        if (c36972 != null) {
            return c36972;
        }
        synchronized (C3697.class) {
            try {
                c3697 = f11501;
                if (c3697 == null) {
                    Class cls2 = AbstractC3692.f11491;
                    C3697 c36973 = null;
                    if (cls2 != null) {
                        try {
                            c36973 = (C3697) cls2.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c3697 = c36973 != null ? c36973 : f11500;
                    f11501 = c3697;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3697;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3603 m7948(int i, InterfaceC3441 interfaceC3441) {
        return (C3603) this.f11502.get(new C3696(i, interfaceC3441));
    }

    public C3697() {
        this.f11502 = new HashMap();
    }

    public C3697(int i) {
        this.f11502 = Collections.EMPTY_MAP;
    }
}
