package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.util.function.Function;
import p291.InterfaceC8523;
import p293.AbstractC8567;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2847 implements InterfaceC8523 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public byte[] f8868;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Function f8869;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Function f8870;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f8871;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f8872;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final byte[] f8867 = InterfaceC2912.m6355("left");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final byte[] f8866 = InterfaceC2912.m6355("right");

    public C2847(Class cls) {
        String name = cls.getName();
        this.f8872 = name;
        this.f8871 = AbstractC2860.m5774(name);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m5680(Object obj) {
        Class<?> cls = obj.getClass();
        if (this.f8869 == null) {
            try {
                this.f8869 = AbstractC8567.m14139(cls.getMethod("getRight", null));
            } catch (NoSuchMethodException e) {
                C0276.m843("getRight method not found", e);
                return null;
            }
        }
        return this.f8869.apply(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m5681(Object obj) {
        Class<?> cls = obj.getClass();
        if (this.f8870 == null) {
            try {
                this.f8870 = AbstractC8567.m14139(cls.getMethod("getLeft", null));
            } catch (NoSuchMethodException e) {
                C0276.m843("getLeft method not found", e);
                return null;
            }
        }
        return this.f8870.apply(obj);
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2897.mo5967();
            return;
        }
        if ((abstractC2897.m6078(j) & JSONWriter$Feature.WriteClassName.mask) != 0) {
            if (this.f8868 == null) {
                this.f8868 = InterfaceC2912.m6355(this.f8872);
            }
            abstractC2897.mo6043(this.f8871, this.f8868);
        }
        abstractC2897.mo5997();
        Object objM5681 = m5681(obj);
        Object objM5680 = m5680(obj);
        abstractC2897.mo6033(C2848.f8874, f8867);
        abstractC2897.mo6037(objM5681);
        abstractC2897.mo6033(C2848.f8873, f8866);
        abstractC2897.mo6037(objM5680);
        abstractC2897.mo5994();
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2897.mo5967();
            return;
        }
        Object objM5681 = m5681(obj);
        Object objM5680 = m5680(obj);
        abstractC2897.mo5997();
        if ((abstractC2897.m6078(j) & JSONWriter$Feature.WritePairAsJavaBean.mask) != 0) {
            abstractC2897.mo6031("left");
            abstractC2897.mo5979();
            abstractC2897.mo6037(objM5681);
            abstractC2897.mo6031("right");
        } else {
            if (abstractC2897.f9172) {
                abstractC2897.f9172 = false;
            } else {
                abstractC2897.mo5982();
            }
            abstractC2897.mo6037(objM5681);
        }
        abstractC2897.mo5979();
        abstractC2897.mo6037(objM5680);
        abstractC2897.mo5994();
    }
}
