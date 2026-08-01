package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.util.AbstractC2853;
import java.util.HashMap;
import java.util.function.Function;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2717 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f8278;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Class f8279;

    public C2717(Class cls) {
        this.f8279 = cls;
        try {
            this.f8278 = AbstractC2853.f8919.objectFieldOffset(cls.getDeclaredField("map"));
        } catch (NoSuchFieldException e) {
            C0276.m842("field map not found", e);
            throw null;
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Class cls = this.f8279;
        if (obj == null) {
            obj = new HashMap();
        }
        try {
            Unsafe unsafe = AbstractC2853.f8919;
            Object objAllocateInstance = unsafe.allocateInstance(cls);
            unsafe.putObject(objAllocateInstance, this.f8278, obj);
            return objAllocateInstance;
        } catch (InstantiationException e) {
            throw new JSONException("create " + cls.getName() + " error", e);
        }
    }
}
