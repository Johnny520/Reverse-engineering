package com.alibaba.fastjson2.util;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.InterfaceC3745;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Type;
import java.util.function.Function;
import p307.InterfaceC9352;
import p309.AbstractC9396;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3680 implements InterfaceC9352 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public byte[] f9213;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public Function f9214;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Function f9215;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f9216;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f9217;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final byte[] f9212 = InterfaceC3745.m6915("left");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final byte[] f9211 = InterfaceC3745.m6915("right");

    public C3680(Class cls) {
        String name = cls.getName();
        this.f9217 = name;
        this.f9216 = AbstractC3693.m6334(name);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m6240(Object obj) {
        Class<?> cls = obj.getClass();
        if (this.f9214 == null) {
            try {
                this.f9214 = AbstractC9396.m14698(cls.getMethod("getRight", null));
            } catch (NoSuchMethodException e) {
                C1123.m1403("getRight method not found", e);
                return null;
            }
        }
        return this.f9214.apply(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m6241(Object obj) {
        Class<?> cls = obj.getClass();
        if (this.f9215 == null) {
            try {
                this.f9215 = AbstractC9396.m14698(cls.getMethod("getLeft", null));
            } catch (NoSuchMethodException e) {
                C1123.m1403("getLeft method not found", e);
                return null;
            }
        }
        return this.f9215.apply(obj);
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC3730.mo6527();
            return;
        }
        if ((abstractC3730.m6638(j) & JSONWriter$Feature.WriteClassName.mask) != 0) {
            if (this.f9213 == null) {
                this.f9213 = InterfaceC3745.m6915(this.f9217);
            }
            abstractC3730.mo6603(this.f9216, this.f9213);
        }
        abstractC3730.mo6557();
        Object objM6241 = m6241(obj);
        Object objM6240 = m6240(obj);
        abstractC3730.mo6593(C3681.f9219, f9212);
        abstractC3730.mo6597(objM6241);
        abstractC3730.mo6593(C3681.f9218, f9211);
        abstractC3730.mo6597(objM6240);
        abstractC3730.mo6554();
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (obj == null) {
            abstractC3730.mo6527();
            return;
        }
        Object objM6241 = m6241(obj);
        Object objM6240 = m6240(obj);
        abstractC3730.mo6557();
        if ((abstractC3730.m6638(j) & JSONWriter$Feature.WritePairAsJavaBean.mask) != 0) {
            abstractC3730.mo6591("left");
            abstractC3730.mo6539();
            abstractC3730.mo6597(objM6241);
            abstractC3730.mo6591("right");
        } else {
            if (abstractC3730.f9517) {
                abstractC3730.f9517 = false;
            } else {
                abstractC3730.mo6542();
            }
            abstractC3730.mo6597(objM6241);
        }
        abstractC3730.mo6539();
        abstractC3730.mo6597(objM6240);
        abstractC3730.mo6554();
    }
}
