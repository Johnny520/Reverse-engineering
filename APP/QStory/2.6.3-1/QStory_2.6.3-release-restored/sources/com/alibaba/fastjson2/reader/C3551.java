package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.util.AbstractC3687;
import java.util.HashMap;
import java.util.function.Function;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3551 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f8625;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Class f8626;

    public C3551(Class cls) {
        this.f8626 = cls;
        try {
            this.f8625 = AbstractC3687.f9266.objectFieldOffset(cls.getDeclaredField("map"));
        } catch (NoSuchFieldException e) {
            C1123.m1403("field map not found", e);
            throw null;
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Class cls = this.f8626;
        if (obj == null) {
            obj = new HashMap();
        }
        try {
            Unsafe unsafe = AbstractC3687.f9266;
            Object objAllocateInstance = unsafe.allocateInstance(cls);
            unsafe.putObject(objAllocateInstance, this.f8625, obj);
            return objAllocateInstance;
        } catch (InstantiationException e) {
            throw new JSONException("create " + cls.getName() + " error", e);
        }
    }
}
