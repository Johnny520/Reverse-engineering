package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.reader.InterfaceC2788;
import java.lang.reflect.Type;
import java.util.function.BiFunction;
import p293.AbstractC8567;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2848 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final BiFunction f8875;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Type f8876;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type f8877;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f8874 = AbstractC2860.m5774("left");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final long f8873 = AbstractC2860.m5774("right");

    public C2848(Class cls, Type type, Type type2) {
        this.f8877 = type;
        this.f8876 = type2;
        try {
            this.f8875 = AbstractC8567.m14141(cls.getMethod("of", Object.class, Object.class));
        } catch (NoSuchMethodException e) {
            C0276.m843("Pair.of method not found", e);
            throw null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        Object objMo6139;
        Object objMo61392;
        if (abstractC2899.mo6133()) {
            return null;
        }
        boolean zMo6148 = abstractC2899.mo6148();
        Type type2 = this.f8877;
        Type type3 = this.f8876;
        if (zMo6148) {
            objMo6139 = null;
            objMo61392 = null;
            for (int i = 0; i < 100 && !abstractC2899.mo6152(); i++) {
                if (abstractC2899.mo6179()) {
                    long jMo6129 = abstractC2899.mo6129();
                    if (jMo6129 == f8874) {
                        objMo6139 = abstractC2899.mo6139(type2);
                    } else if (jMo6129 == f8873) {
                        objMo61392 = abstractC2899.mo6139(type3);
                    } else if (i == 0) {
                        objMo6139 = abstractC2899.mo6104();
                        abstractC2899.mo6144(':');
                        objMo61392 = abstractC2899.mo6139(type3);
                    } else {
                        abstractC2899.mo6233();
                    }
                } else {
                    if (i != 0) {
                        C0276.m850(abstractC2899.mo6170("not support input"));
                        return null;
                    }
                    objMo6139 = abstractC2899.mo6139(type2);
                    abstractC2899.mo6144(':');
                    objMo61392 = abstractC2899.mo6139(type3);
                }
            }
        } else {
            if (!abstractC2899.mo6141()) {
                C0276.m850(abstractC2899.mo6170("not support input"));
                return null;
            }
            objMo6139 = abstractC2899.mo6139(type2);
            objMo61392 = abstractC2899.mo6139(type3);
            if (!abstractC2899.mo6142()) {
                C0276.m850(abstractC2899.mo6170("not support input"));
                return null;
            }
        }
        return this.f8875.apply(objMo6139, objMo61392);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        Object objMo6139;
        Object objMo61392;
        if (abstractC2899.mo6133()) {
            return null;
        }
        if (abstractC2899.mo6143((byte) -110)) {
            long jMo6239 = abstractC2899.mo6239();
            if (jMo6239 != 4645080105124911238L && jMo6239 != -2802985644706367574L && jMo6239 != 8310287657375596772L) {
                C0276.m841(abstractC2899.mo6100(), "not support inputType : ");
                return null;
            }
        }
        boolean zMo6148 = abstractC2899.mo6148();
        Type type2 = this.f8877;
        Type type3 = this.f8876;
        if (zMo6148) {
            objMo6139 = null;
            objMo61392 = null;
            for (int i = 0; i < 100 && !abstractC2899.mo6152(); i++) {
                if (abstractC2899.mo6179()) {
                    long jMo6129 = abstractC2899.mo6129();
                    if (jMo6129 == f8874) {
                        objMo6139 = abstractC2899.mo6139(type2);
                    } else if (jMo6129 == f8873) {
                        objMo61392 = abstractC2899.mo6139(type3);
                    } else if (i == 0) {
                        objMo6139 = abstractC2899.mo6104();
                        objMo61392 = abstractC2899.mo6139(type3);
                    } else {
                        abstractC2899.mo6233();
                    }
                } else {
                    if (i != 0) {
                        C0276.m850(abstractC2899.mo6170("not support input"));
                        return null;
                    }
                    objMo6139 = abstractC2899.mo6139(type2);
                    objMo61392 = abstractC2899.mo6139(type3);
                }
            }
        } else {
            if (!abstractC2899.mo6169()) {
                C0276.m850(abstractC2899.mo6170("not support input"));
                return null;
            }
            if (abstractC2899.mo6232() != 2) {
                C0276.m850(abstractC2899.mo6170("not support input"));
                return null;
            }
            objMo6139 = abstractC2899.mo6139(type2);
            objMo61392 = abstractC2899.mo6139(type3);
        }
        return this.f8875.apply(objMo6139, objMo61392);
    }
}
