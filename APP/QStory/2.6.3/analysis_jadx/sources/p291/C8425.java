package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8425 extends AbstractC8435 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final Function f23335;

    public C8425(String str, int i, long j, String str2, String str3, Type type, Field field, Method method, Function function, Type type2, Class cls, Class cls2) {
        super(str, type, i, j, str2, str3, type2, cls, field, method, cls2);
        this.f23335 = function;
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Function mo14000() {
        return this.f23335;
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13995(Object obj) {
        return this.f23335.apply(obj);
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13998(AbstractC2897 abstractC2897, Object obj) {
        List list = (List) this.f23335.apply(obj);
        if (list == null) {
            abstractC2897.mo5967();
            return;
        }
        int i = 0;
        Class<?> cls = null;
        if (abstractC2897.f9171) {
            int size = list.size();
            abstractC2897.mo6040(size);
            InterfaceC8523 interfaceC8523M14013 = null;
            while (i < size) {
                Object obj2 = list.get(i);
                if (obj2 == null) {
                    abstractC2897.mo5967();
                } else {
                    Class<?> cls2 = obj2.getClass();
                    if (cls2 != cls) {
                        interfaceC8523M14013 = m14013(abstractC2897, cls2);
                        cls = cls2;
                    }
                    interfaceC8523M14013.m14096(abstractC2897, obj2);
                }
                i++;
            }
            return;
        }
        abstractC2897.mo5999();
        InterfaceC8523 interfaceC8523M140132 = null;
        while (i < list.size()) {
            if (i != 0) {
                abstractC2897.mo5982();
            }
            Object obj3 = list.get(i);
            if (obj3 == null) {
                abstractC2897.mo5967();
            } else {
                Class<?> cls3 = obj3.getClass();
                if (cls3 != cls) {
                    interfaceC8523M140132 = m14013(abstractC2897, cls3);
                    cls = cls3;
                }
                interfaceC8523M140132.m14096(abstractC2897, obj3);
            }
            i++;
        }
        abstractC2897.mo5995();
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13999(AbstractC2897 abstractC2897, Object obj) {
        try {
            List list = (List) this.f23335.apply(obj);
            long j = this.f23611;
            if (list == null) {
                long j2 = j | abstractC2897.f9178.f9153;
                if (((JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullListAsEmpty.mask) & j2) == 0) {
                    return false;
                }
                m14078(abstractC2897);
                abstractC2897.mo6038(j2);
                return true;
            }
            if ((j & JSONWriter$Feature.NotWriteEmptyArray.mask) != 0 && list.isEmpty()) {
                return false;
            }
            String strM6088 = abstractC2897.m6088(this, list);
            if (strM6088 != null) {
                m14078(abstractC2897);
                abstractC2897.mo6020(strM6088);
                abstractC2897.m6083(list);
                return true;
            }
            if (this.f23346 == String.class) {
                m14012(abstractC2897, list);
            } else {
                m14014(abstractC2897, list);
            }
            abstractC2897.m6083(list);
            return true;
        } catch (RuntimeException e) {
            if (abstractC2897.m6075()) {
                return false;
            }
            throw e;
        }
    }
}
