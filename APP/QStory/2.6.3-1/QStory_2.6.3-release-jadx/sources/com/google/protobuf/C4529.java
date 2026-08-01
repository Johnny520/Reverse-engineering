package com.google.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言楪苏子哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C4529 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4529 f11845 = new C4529(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static volatile C4529 f11846;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Map f11847;

    public C4529(C4529 c4529) {
        if (c4529 == f11845) {
            this.f11847 = Collections.EMPTY_MAP;
        } else {
            this.f11847 = Collections.unmodifiableMap(c4529.f11847);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C4529 m8506() {
        C4529 c4529;
        Class cls = AbstractC4379.f11543;
        C4529 c45292 = f11846;
        if (c45292 != null) {
            return c45292;
        }
        synchronized (C4529.class) {
            try {
                c4529 = f11846;
                if (c4529 == null) {
                    Class cls2 = AbstractC4524.f11836;
                    C4529 c45293 = null;
                    if (cls2 != null) {
                        try {
                            c45293 = (C4529) cls2.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c4529 = c45293 != null ? c45293 : f11845;
                    f11846 = c4529;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4529;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4435 m8507(int i, InterfaceC4273 interfaceC4273) {
        return (C4435) this.f11847.get(new C4528(i, interfaceC4273));
    }

    public C4529() {
        this.f11847 = new HashMap();
    }

    public C4529(int i) {
        this.f11847 = Collections.EMPTY_MAP;
    }
}
