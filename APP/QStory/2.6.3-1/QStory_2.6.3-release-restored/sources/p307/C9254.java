package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9254 extends AbstractC9264 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final Function f23680;

    public C9254(String str, int i, long j, String str2, String str3, Type type, Field field, Method method, Function function, Type type2, Class cls, Class cls2) {
        super(str, type, i, j, str2, str3, type2, cls, field, method, cls2);
        this.f23680 = function;
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Function mo14559() {
        return this.f23680;
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo14554(Object obj) {
        return this.f23680.apply(obj);
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo14557(AbstractC3730 abstractC3730, Object obj) {
        List list = (List) this.f23680.apply(obj);
        if (list == null) {
            abstractC3730.mo6527();
            return;
        }
        int i = 0;
        Class<?> cls = null;
        if (abstractC3730.f9516) {
            int size = list.size();
            abstractC3730.mo6600(size);
            InterfaceC9352 interfaceC9352M14572 = null;
            while (i < size) {
                Object obj2 = list.get(i);
                if (obj2 == null) {
                    abstractC3730.mo6527();
                } else {
                    Class<?> cls2 = obj2.getClass();
                    if (cls2 != cls) {
                        interfaceC9352M14572 = m14572(abstractC3730, cls2);
                        cls = cls2;
                    }
                    interfaceC9352M14572.m14655(abstractC3730, obj2);
                }
                i++;
            }
            return;
        }
        abstractC3730.mo6559();
        InterfaceC9352 interfaceC9352M145722 = null;
        while (i < list.size()) {
            if (i != 0) {
                abstractC3730.mo6542();
            }
            Object obj3 = list.get(i);
            if (obj3 == null) {
                abstractC3730.mo6527();
            } else {
                Class<?> cls3 = obj3.getClass();
                if (cls3 != cls) {
                    interfaceC9352M145722 = m14572(abstractC3730, cls3);
                    cls = cls3;
                }
                interfaceC9352M145722.m14655(abstractC3730, obj3);
            }
            i++;
        }
        abstractC3730.mo6555();
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo14558(AbstractC3730 abstractC3730, Object obj) {
        try {
            List list = (List) this.f23680.apply(obj);
            long j = this.f23956;
            if (list == null) {
                long j2 = j | abstractC3730.f9523.f9498;
                if (((JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullListAsEmpty.mask) & j2) == 0) {
                    return false;
                }
                m14637(abstractC3730);
                abstractC3730.mo6598(j2);
                return true;
            }
            if ((j & JSONWriter$Feature.NotWriteEmptyArray.mask) != 0 && list.isEmpty()) {
                return false;
            }
            String strM6648 = abstractC3730.m6648(this, list);
            if (strM6648 != null) {
                m14637(abstractC3730);
                abstractC3730.mo6580(strM6648);
                abstractC3730.m6643(list);
                return true;
            }
            if (this.f23691 == String.class) {
                m14571(abstractC3730, list);
            } else {
                m14573(abstractC3730, list);
            }
            abstractC3730.m6643(list);
            return true;
        } catch (RuntimeException e) {
            if (abstractC3730.m6635()) {
                return false;
            }
            throw e;
        }
    }
}
