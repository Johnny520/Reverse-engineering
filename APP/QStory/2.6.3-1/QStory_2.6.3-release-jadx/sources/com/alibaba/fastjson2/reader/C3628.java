package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.schema.JSONSchema;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言楪子世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3628 implements InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Function f8985;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Method f8986;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Constructor f8987;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f8988;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Type f8989;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object f8990;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final JSONSchema f8991;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC3621 f8992;

    public C3628(Type type, long j, JSONSchema jSONSchema, Constructor constructor, Method method, Function function) {
        this.f8989 = type;
        this.f8988 = j;
        this.f8991 = jSONSchema;
        this.f8987 = constructor;
        this.f8986 = method;
        this.f8985 = function;
        if (method == null || method.getParameterCount() != 2) {
            this.f8990 = null;
        } else {
            this.f8990 = Array.newInstance(method.getParameterTypes()[1].getComponentType(), 0);
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        if (this.f8992 == null) {
            this.f8992 = abstractC3732.m6662(this.f8989);
        }
        Object objMo6023 = this.f8992.mo6023(abstractC3732, type, obj, j | this.f8988);
        if (objMo6023 == null) {
            return null;
        }
        JSONSchema jSONSchema = this.f8991;
        if (jSONSchema != null) {
            jSONSchema.mo6208(objMo6023);
        }
        Function function = this.f8985;
        if (function != null) {
            try {
                return function.apply(objMo6023);
            } catch (Exception e) {
                C1123.m1403(abstractC3732.mo6730("create object error"), e);
                return null;
            }
        }
        Constructor constructor = this.f8987;
        if (constructor != null) {
            try {
                return constructor.newInstance(objMo6023);
            } catch (Exception e2) {
                C1123.m1403(abstractC3732.mo6730("create object error"), e2);
                return null;
            }
        }
        Method method = this.f8986;
        if (method == null) {
            C1123.m1410(abstractC3732.mo6730("create object error"));
            return null;
        }
        try {
            Object obj2 = this.f8990;
            return obj2 != null ? method.invoke(null, objMo6023, obj2) : method.invoke(null, objMo6023);
        } catch (Exception e3) {
            C1123.m1403(abstractC3732.mo6730("create object error"), e3);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        return mo6023(abstractC3732, type, obj, j);
    }
}
