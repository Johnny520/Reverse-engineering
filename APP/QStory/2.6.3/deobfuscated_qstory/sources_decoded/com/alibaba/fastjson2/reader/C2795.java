package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2795 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Function f8640;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Method f8641;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Constructor f8642;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f8643;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type f8644;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object f8645;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final JSONSchema f8646;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC2788 f8647;

    public C2795(Type type, long j, JSONSchema jSONSchema, Constructor constructor, Method method, Function function) {
        this.f8644 = type;
        this.f8643 = j;
        this.f8646 = jSONSchema;
        this.f8642 = constructor;
        this.f8641 = method;
        this.f8640 = function;
        if (method == null || method.getParameterCount() != 2) {
            this.f8645 = null;
        } else {
            this.f8645 = Array.newInstance(method.getParameterTypes()[1].getComponentType(), 0);
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        if (this.f8647 == null) {
            this.f8647 = abstractC2899.m6102(this.f8644);
        }
        Object objMo5463 = this.f8647.mo5463(abstractC2899, type, obj, j | this.f8643);
        if (objMo5463 == null) {
            return null;
        }
        JSONSchema jSONSchema = this.f8646;
        if (jSONSchema != null) {
            jSONSchema.mo5648(objMo5463);
        }
        Function function = this.f8640;
        if (function != null) {
            try {
                return function.apply(objMo5463);
            } catch (Exception e) {
                C0276.m843(abstractC2899.mo6170("create object error"), e);
                return null;
            }
        }
        Constructor constructor = this.f8642;
        if (constructor != null) {
            try {
                return constructor.newInstance(objMo5463);
            } catch (Exception e2) {
                C0276.m843(abstractC2899.mo6170("create object error"), e2);
                return null;
            }
        }
        Method method = this.f8641;
        if (method == null) {
            C0276.m850(abstractC2899.mo6170("create object error"));
            return null;
        }
        try {
            Object obj2 = this.f8645;
            return obj2 != null ? method.invoke(null, objMo5463, obj2) : method.invoke(null, objMo5463);
        } catch (Exception e3) {
            C0276.m843(abstractC2899.mo6170("create object error"), e3);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        return mo5463(abstractC2899, type, obj, j);
    }
}
