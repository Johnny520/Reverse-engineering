package com.alibaba.fastjson2.util;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.InterfaceC2911;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.util.function.Function;
import p291.InterfaceC8531;
import p293.AbstractC8575;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2846 implements InterfaceC8531 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public byte[] f8866;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Function f8867;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Function f8868;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f8869;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f8870;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final byte[] f8865 = InterfaceC2911.m6297("left");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final byte[] f8864 = InterfaceC2911.m6297("right");

    public C2846(Class cls) {
        String name = cls.getName();
        this.f8870 = name;
        this.f8869 = AbstractC2859.m5729(name);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m5635(Object obj) {
        Class<?> cls = obj.getClass();
        if (this.f8867 == null) {
            try {
                this.f8867 = AbstractC8575.m14120(cls.getMethod("getRight", null));
            } catch (NoSuchMethodException e) {
                C0276.m842("getRight method not found", e);
                return null;
            }
        }
        return this.f8867.apply(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m5636(Object obj) {
        Class<?> cls = obj.getClass();
        if (this.f8868 == null) {
            try {
                this.f8868 = AbstractC8575.m14120(cls.getMethod("getLeft", null));
            } catch (NoSuchMethodException e) {
                C0276.m842("getLeft method not found", e);
                return null;
            }
        }
        return this.f8868.apply(obj);
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2896.mo5922();
            return;
        }
        if ((abstractC2896.m6032(j) & JSONWriter$Feature.WriteClassName.mask) != 0) {
            if (this.f8866 == null) {
                this.f8866 = InterfaceC2911.m6297(this.f8870);
            }
            abstractC2896.mo5998(this.f8869, this.f8866);
        }
        abstractC2896.mo5952();
        Object objM5636 = m5636(obj);
        Object objM5635 = m5635(obj);
        abstractC2896.mo5988(C2847.f8872, f8865);
        abstractC2896.mo5992(objM5636);
        abstractC2896.mo5988(C2847.f8871, f8864);
        abstractC2896.mo5992(objM5635);
        abstractC2896.mo5949();
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC2896.mo5922();
            return;
        }
        Object objM5636 = m5636(obj);
        Object objM5635 = m5635(obj);
        abstractC2896.mo5952();
        if ((abstractC2896.m6032(j) & JSONWriter$Feature.WritePairAsJavaBean.mask) != 0) {
            abstractC2896.mo5986("left");
            abstractC2896.mo5934();
            abstractC2896.mo5992(objM5636);
            abstractC2896.mo5986("right");
        } else {
            if (abstractC2896.f9170) {
                abstractC2896.f9170 = false;
            } else {
                abstractC2896.mo5937();
            }
            abstractC2896.mo5992(objM5636);
        }
        abstractC2896.mo5934();
        abstractC2896.mo5992(objM5635);
        abstractC2896.mo5949();
    }
}
