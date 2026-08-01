package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8433 extends AbstractC8443 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final Function f23344;

    public C8433(String str, int i, long j, String str2, String str3, Type type, Field field, Method method, Function function, Type type2, Class cls, Class cls2) {
        super(str, type, i, j, str2, str3, type2, cls, field, method, cls2);
        this.f23344 = function;
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Function mo13981() {
        return this.f23344;
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13976(Object obj) {
        return this.f23344.apply(obj);
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13979(AbstractC2896 abstractC2896, Object obj) {
        List list = (List) this.f23344.apply(obj);
        if (list == null) {
            abstractC2896.mo5922();
            return;
        }
        int i = 0;
        Class<?> cls = null;
        if (abstractC2896.f9169) {
            int size = list.size();
            abstractC2896.mo5995(size);
            InterfaceC8531 interfaceC8531M13994 = null;
            while (i < size) {
                Object obj2 = list.get(i);
                if (obj2 == null) {
                    abstractC2896.mo5922();
                } else {
                    Class<?> cls2 = obj2.getClass();
                    if (cls2 != cls) {
                        interfaceC8531M13994 = m13994(abstractC2896, cls2);
                        cls = cls2;
                    }
                    interfaceC8531M13994.m14077(abstractC2896, obj2);
                }
                i++;
            }
            return;
        }
        abstractC2896.mo5954();
        InterfaceC8531 interfaceC8531M139942 = null;
        while (i < list.size()) {
            if (i != 0) {
                abstractC2896.mo5937();
            }
            Object obj3 = list.get(i);
            if (obj3 == null) {
                abstractC2896.mo5922();
            } else {
                Class<?> cls3 = obj3.getClass();
                if (cls3 != cls) {
                    interfaceC8531M139942 = m13994(abstractC2896, cls3);
                    cls = cls3;
                }
                interfaceC8531M139942.m14077(abstractC2896, obj3);
            }
            i++;
        }
        abstractC2896.mo5950();
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13980(AbstractC2896 abstractC2896, Object obj) {
        try {
            List list = (List) this.f23344.apply(obj);
            long j = this.f23620;
            if (list == null) {
                long j2 = j | abstractC2896.f9176.f9151;
                if (((JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullListAsEmpty.mask) & j2) == 0) {
                    return false;
                }
                m14059(abstractC2896);
                abstractC2896.mo5993(j2);
                return true;
            }
            if ((j & JSONWriter$Feature.NotWriteEmptyArray.mask) != 0 && list.isEmpty()) {
                return false;
            }
            String strM6042 = abstractC2896.m6042(this, list);
            if (strM6042 != null) {
                m14059(abstractC2896);
                abstractC2896.mo5975(strM6042);
                abstractC2896.m6037(list);
                return true;
            }
            if (this.f23355 == String.class) {
                m13993(abstractC2896, list);
            } else {
                m13995(abstractC2896, list);
            }
            abstractC2896.m6037(list);
            return true;
        } catch (RuntimeException e) {
            if (abstractC2896.m6026()) {
                return false;
            }
            throw e;
        }
    }
}
