package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2794 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Function f8638;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Method f8639;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Constructor f8640;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f8641;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type f8642;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object f8643;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final JSONSchema f8644;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC2787 f8645;

    public C2794(Type type, long j, JSONSchema jSONSchema, Constructor constructor, Method method, Function function) {
        this.f8642 = type;
        this.f8641 = j;
        this.f8644 = jSONSchema;
        this.f8640 = constructor;
        this.f8639 = method;
        this.f8638 = function;
        if (method == null || method.getParameterCount() != 2) {
            this.f8643 = null;
        } else {
            this.f8643 = Array.newInstance(method.getParameterTypes()[1].getComponentType(), 0);
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        if (this.f8645 == null) {
            this.f8645 = abstractC2898.m6056(this.f8642);
        }
        Object objMo5418 = this.f8645.mo5418(abstractC2898, type, obj, j | this.f8641);
        if (objMo5418 == null) {
            return null;
        }
        JSONSchema jSONSchema = this.f8644;
        if (jSONSchema != null) {
            jSONSchema.mo5603(objMo5418);
        }
        Function function = this.f8638;
        if (function != null) {
            try {
                return function.apply(objMo5418);
            } catch (Exception e) {
                C0276.m842(abstractC2898.mo6124("create object error"), e);
                return null;
            }
        }
        Constructor constructor = this.f8640;
        if (constructor != null) {
            try {
                return constructor.newInstance(objMo5418);
            } catch (Exception e2) {
                C0276.m842(abstractC2898.mo6124("create object error"), e2);
                return null;
            }
        }
        Method method = this.f8639;
        if (method == null) {
            C0276.m849(abstractC2898.mo6124("create object error"));
            return null;
        }
        try {
            Object obj2 = this.f8643;
            return obj2 != null ? method.invoke(null, objMo5418, obj2) : method.invoke(null, objMo5418);
        } catch (Exception e3) {
            C0276.m842(abstractC2898.mo6124("create object error"), e3);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        return mo5418(abstractC2898, type, obj, j);
    }
}
