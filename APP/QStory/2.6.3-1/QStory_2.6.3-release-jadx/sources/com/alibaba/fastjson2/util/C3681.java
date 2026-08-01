package com.alibaba.fastjson2.util;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.reader.InterfaceC3621;
import java.lang.reflect.Type;
import java.util.function.BiFunction;
import p309.AbstractC9396;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3681 implements InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final BiFunction f9220;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Type f9221;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type f9222;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long f9219 = AbstractC3693.m6334("left");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final long f9218 = AbstractC3693.m6334("right");

    public C3681(Class cls, Type type, Type type2) {
        this.f9222 = type;
        this.f9221 = type2;
        try {
            this.f9220 = AbstractC9396.m14700(cls.getMethod("of", Object.class, Object.class));
        } catch (NoSuchMethodException e) {
            C1123.m1403("Pair.of method not found", e);
            throw null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        Object objMo6699;
        Object objMo66992;
        if (abstractC3732.mo6693()) {
            return null;
        }
        boolean zMo6708 = abstractC3732.mo6708();
        Type type2 = this.f9222;
        Type type3 = this.f9221;
        if (zMo6708) {
            objMo6699 = null;
            objMo66992 = null;
            for (int i = 0; i < 100 && !abstractC3732.mo6712(); i++) {
                if (abstractC3732.mo6739()) {
                    long jMo6689 = abstractC3732.mo6689();
                    if (jMo6689 == f9219) {
                        objMo6699 = abstractC3732.mo6699(type2);
                    } else if (jMo6689 == f9218) {
                        objMo66992 = abstractC3732.mo6699(type3);
                    } else if (i == 0) {
                        objMo6699 = abstractC3732.mo6664();
                        abstractC3732.mo6704(':');
                        objMo66992 = abstractC3732.mo6699(type3);
                    } else {
                        abstractC3732.mo6793();
                    }
                } else {
                    if (i != 0) {
                        C1123.m1410(abstractC3732.mo6730("not support input"));
                        return null;
                    }
                    objMo6699 = abstractC3732.mo6699(type2);
                    abstractC3732.mo6704(':');
                    objMo66992 = abstractC3732.mo6699(type3);
                }
            }
        } else {
            if (!abstractC3732.mo6701()) {
                C1123.m1410(abstractC3732.mo6730("not support input"));
                return null;
            }
            objMo6699 = abstractC3732.mo6699(type2);
            objMo66992 = abstractC3732.mo6699(type3);
            if (!abstractC3732.mo6702()) {
                C1123.m1410(abstractC3732.mo6730("not support input"));
                return null;
            }
        }
        return this.f9220.apply(objMo6699, objMo66992);
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        Object objMo6699;
        Object objMo66992;
        if (abstractC3732.mo6693()) {
            return null;
        }
        if (abstractC3732.mo6703((byte) -110)) {
            long jMo6799 = abstractC3732.mo6799();
            if (jMo6799 != 4645080105124911238L && jMo6799 != -2802985644706367574L && jMo6799 != 8310287657375596772L) {
                C1123.m1401(abstractC3732.mo6660(), "not support inputType : ");
                return null;
            }
        }
        boolean zMo6708 = abstractC3732.mo6708();
        Type type2 = this.f9222;
        Type type3 = this.f9221;
        if (zMo6708) {
            objMo6699 = null;
            objMo66992 = null;
            for (int i = 0; i < 100 && !abstractC3732.mo6712(); i++) {
                if (abstractC3732.mo6739()) {
                    long jMo6689 = abstractC3732.mo6689();
                    if (jMo6689 == f9219) {
                        objMo6699 = abstractC3732.mo6699(type2);
                    } else if (jMo6689 == f9218) {
                        objMo66992 = abstractC3732.mo6699(type3);
                    } else if (i == 0) {
                        objMo6699 = abstractC3732.mo6664();
                        objMo66992 = abstractC3732.mo6699(type3);
                    } else {
                        abstractC3732.mo6793();
                    }
                } else {
                    if (i != 0) {
                        C1123.m1410(abstractC3732.mo6730("not support input"));
                        return null;
                    }
                    objMo6699 = abstractC3732.mo6699(type2);
                    objMo66992 = abstractC3732.mo6699(type3);
                }
            }
        } else {
            if (!abstractC3732.mo6729()) {
                C1123.m1410(abstractC3732.mo6730("not support input"));
                return null;
            }
            if (abstractC3732.mo6792() != 2) {
                C1123.m1410(abstractC3732.mo6730("not support input"));
                return null;
            }
            objMo6699 = abstractC3732.mo6699(type2);
            objMo66992 = abstractC3732.mo6699(type3);
        }
        return this.f9220.apply(objMo6699, objMo66992);
    }
}
