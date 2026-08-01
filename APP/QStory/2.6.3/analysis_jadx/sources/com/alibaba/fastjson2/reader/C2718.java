package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.util.AbstractC2854;
import java.util.HashMap;
import java.util.function.Function;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2718 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f8280;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Class f8281;

    public C2718(Class cls) {
        this.f8281 = cls;
        try {
            this.f8280 = AbstractC2854.f8921.objectFieldOffset(cls.getDeclaredField("map"));
        } catch (NoSuchFieldException e) {
            C0276.m843("field map not found", e);
            throw null;
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Class cls = this.f8281;
        if (obj == null) {
            obj = new HashMap();
        }
        try {
            Unsafe unsafe = AbstractC2854.f8921;
            Object objAllocateInstance = unsafe.allocateInstance(cls);
            unsafe.putObject(objAllocateInstance, this.f8280, obj);
            return objAllocateInstance;
        } catch (InstantiationException e) {
            throw new JSONException("create " + cls.getName() + " error", e);
        }
    }
}
