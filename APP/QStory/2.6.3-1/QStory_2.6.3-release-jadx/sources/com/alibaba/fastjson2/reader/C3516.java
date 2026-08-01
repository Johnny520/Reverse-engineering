package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3516 extends C3525 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final Type f8496;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final BiConsumer f8497;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final PropertyNamingStrategy f8498;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final String f8499;

    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3516(String str, Type type, Class cls, int i, long j, String str2, Locale locale, Object obj, JSONSchema jSONSchema, Method method, Field field, String str3, BiConsumer biConsumer) {
        Class cls2;
        super(i, j, jSONSchema, cls, obj, str, str2, field, method, type, locale, null);
        Class cls3 = AbstractC3700.f9396;
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            cls2 = actualTypeArguments.length == 2 ? actualTypeArguments[1] : Object.class;
        }
        this.f8496 = cls2;
        this.f8499 = str3;
        this.f8498 = PropertyNamingStrategy.m20of(str2);
        this.f8497 = biConsumer;
    }

    @Override // com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo6042(long j, Object obj, Object obj2) throws IOException {
        if (this.f8499 == null || !(obj2 instanceof Collection)) {
            super.mo6042(j, obj, obj2);
            return;
        }
        Map map = (Map) mo6056(AbstractC3766.m6949()).mo6059(j);
        C3525.m6053(map, (Collection) obj2, this.f8499, this.f8498, AbstractC3766.m6946(this.f8496, j | this.f8767), this.f8497);
        mo6031(obj, map);
    }

    @Override // com.alibaba.fastjson2.reader.C3525, com.alibaba.fastjson2.reader.AbstractC3595
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public void mo6032(AbstractC3732 abstractC3732, Object obj) {
        if (this.f8499 == null || !abstractC3732.mo6729()) {
            super.mo6032(abstractC3732, obj);
            return;
        }
        InterfaceC3621 interfaceC3621Mo6055 = mo6055(abstractC3732);
        long j = this.f8767;
        Map map = (Map) interfaceC3621Mo6055.mo6059(j);
        Type type = this.f8496;
        C3525.m6053(map, abstractC3732.mo6682(type), this.f8499, this.f8498, AbstractC3766.m6946(type, j), this.f8497);
        mo6031(obj, map);
    }
}
