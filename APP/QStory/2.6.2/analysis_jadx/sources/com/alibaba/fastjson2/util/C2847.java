package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.reader.InterfaceC2787;
import java.lang.reflect.Type;
import java.util.function.BiFunction;
import p293.AbstractC8575;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2847 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final BiFunction f8873;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Type f8874;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type f8875;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f8872 = AbstractC2859.m5729("left");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final long f8871 = AbstractC2859.m5729("right");

    public C2847(Class cls, Type type, Type type2) {
        this.f8875 = type;
        this.f8874 = type2;
        try {
            this.f8873 = AbstractC8575.m14122(cls.getMethod("of", Object.class, Object.class));
        } catch (NoSuchMethodException e) {
            C0276.m842("Pair.of method not found", e);
            throw null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        Object objMo6093;
        Object objMo60932;
        if (abstractC2898.mo6087()) {
            return null;
        }
        boolean zMo6102 = abstractC2898.mo6102();
        Type type2 = this.f8875;
        Type type3 = this.f8874;
        if (zMo6102) {
            objMo6093 = null;
            objMo60932 = null;
            for (int i = 0; i < 100 && !abstractC2898.mo6106(); i++) {
                if (abstractC2898.mo6133()) {
                    long jMo6083 = abstractC2898.mo6083();
                    if (jMo6083 == f8872) {
                        objMo6093 = abstractC2898.mo6093(type2);
                    } else if (jMo6083 == f8871) {
                        objMo60932 = abstractC2898.mo6093(type3);
                    } else if (i == 0) {
                        objMo6093 = abstractC2898.mo6058();
                        abstractC2898.mo6098(':');
                        objMo60932 = abstractC2898.mo6093(type3);
                    } else {
                        abstractC2898.mo6188();
                    }
                } else {
                    if (i != 0) {
                        C0276.m849(abstractC2898.mo6124("not support input"));
                        return null;
                    }
                    objMo6093 = abstractC2898.mo6093(type2);
                    abstractC2898.mo6098(':');
                    objMo60932 = abstractC2898.mo6093(type3);
                }
            }
        } else {
            if (!abstractC2898.mo6095()) {
                C0276.m849(abstractC2898.mo6124("not support input"));
                return null;
            }
            objMo6093 = abstractC2898.mo6093(type2);
            objMo60932 = abstractC2898.mo6093(type3);
            if (!abstractC2898.mo6096()) {
                C0276.m849(abstractC2898.mo6124("not support input"));
                return null;
            }
        }
        return this.f8873.apply(objMo6093, objMo60932);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        Object objMo6093;
        Object objMo60932;
        if (abstractC2898.mo6087()) {
            return null;
        }
        if (abstractC2898.mo6097((byte) -110)) {
            long jMo6194 = abstractC2898.mo6194();
            if (jMo6194 != 4645080105124911238L && jMo6194 != -2802985644706367574L && jMo6194 != 8310287657375596772L) {
                C0276.m840(abstractC2898.mo6055(), "not support inputType : ");
                return null;
            }
        }
        boolean zMo6102 = abstractC2898.mo6102();
        Type type2 = this.f8875;
        Type type3 = this.f8874;
        if (zMo6102) {
            objMo6093 = null;
            objMo60932 = null;
            for (int i = 0; i < 100 && !abstractC2898.mo6106(); i++) {
                if (abstractC2898.mo6133()) {
                    long jMo6083 = abstractC2898.mo6083();
                    if (jMo6083 == f8872) {
                        objMo6093 = abstractC2898.mo6093(type2);
                    } else if (jMo6083 == f8871) {
                        objMo60932 = abstractC2898.mo6093(type3);
                    } else if (i == 0) {
                        objMo6093 = abstractC2898.mo6058();
                        objMo60932 = abstractC2898.mo6093(type3);
                    } else {
                        abstractC2898.mo6188();
                    }
                } else {
                    if (i != 0) {
                        C0276.m849(abstractC2898.mo6124("not support input"));
                        return null;
                    }
                    objMo6093 = abstractC2898.mo6093(type2);
                    objMo60932 = abstractC2898.mo6093(type3);
                }
            }
        } else {
            if (!abstractC2898.mo6123()) {
                C0276.m849(abstractC2898.mo6124("not support input"));
                return null;
            }
            if (abstractC2898.mo6187() != 2) {
                C0276.m849(abstractC2898.mo6124("not support input"));
                return null;
            }
            objMo6093 = abstractC2898.mo6093(type2);
            objMo60932 = abstractC2898.mo6093(type3);
        }
        return this.f8873.apply(objMo6093, objMo60932);
    }
}
