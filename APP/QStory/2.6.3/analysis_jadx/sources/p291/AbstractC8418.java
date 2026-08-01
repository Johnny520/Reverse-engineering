package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8418 extends C8421 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final Type f23321;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final boolean f23322;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final Class f23323;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public volatile InterfaceC8523 f23324;

    public AbstractC8418(String str, int i, long j, String str2, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i, j, str2, null, str3, type, cls, field, method);
        this.f23321 = type;
        this.f23323 = cls;
        this.f23322 = !C8539.m14105(cls);
    }

    @Override // p291.C8421, p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC8523 mo13994(AbstractC2897 abstractC2897, Class cls) {
        if (this.f23323 != cls) {
            return super.mo13994(abstractC2897, cls);
        }
        if (this.f23324 != null) {
            return this.f23324;
        }
        InterfaceC8523 interfaceC8523Mo13994 = super.mo13994(abstractC2897, cls);
        this.f23324 = interfaceC8523Mo13994;
        return interfaceC8523Mo13994;
    }

    @Override // p291.C8421, p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13998(AbstractC2897 abstractC2897, Object obj) {
        AbstractC2897 abstractC28972;
        Object objMo13995 = mo13995(obj);
        if (objMo13995 == null) {
            abstractC2897.mo5967();
            return;
        }
        boolean z = this.f23322 && abstractC2897.m6072();
        if (z) {
            if (objMo13995 == obj) {
                abstractC2897.mo6020("..");
                return;
            }
            String strM6087 = abstractC2897.m6087(objMo13995, this.f23618);
            if (strM6087 != null) {
                abstractC2897.mo6020(strM6087);
                abstractC2897.m6083(objMo13995);
                return;
            }
        }
        InterfaceC8523 interfaceC8523Mo13994 = mo13994(abstractC2897, this.f23323);
        boolean z2 = (abstractC2897.m6078(this.f23611) & JSONWriter$Feature.BeanToArray.mask) != 0;
        boolean z3 = abstractC2897.f9171;
        String str = this.f23618;
        if (z3) {
            Type type = this.f23321;
            if (z2) {
                abstractC28972 = abstractC2897;
                interfaceC8523Mo13994.mo14018(abstractC28972, objMo13995, type, this.f23611);
            } else {
                abstractC28972 = abstractC2897;
                interfaceC8523Mo13994.mo5678(abstractC28972, objMo13995, str, type, this.f23611);
            }
        } else {
            Type type2 = this.f23321;
            if (z2) {
                abstractC28972 = abstractC2897;
                interfaceC8523Mo13994.mo14019(abstractC28972, objMo13995, str, type2, this.f23611);
            } else {
                abstractC28972 = abstractC2897;
                interfaceC8523Mo13994.mo5679(abstractC28972, objMo13995, str, type2, this.f23611);
            }
        }
        if (z) {
            abstractC28972.m6083(objMo13995);
        }
    }

    @Override // p291.C8421, p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public boolean mo13999(AbstractC2897 abstractC2897, Object obj) {
        AbstractC2897 abstractC28972;
        try {
            Object objMo13995 = mo13995(obj);
            Class cls = this.f23323;
            if (objMo13995 == null) {
                if (((abstractC2897.f9178.f9153 | this.f23611) & (JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask)) == 0) {
                    return false;
                }
                m14078(abstractC2897);
                if (cls.isArray()) {
                    abstractC2897.mo6039();
                    return true;
                }
                if (cls == StringBuffer.class || cls == StringBuilder.class) {
                    abstractC2897.mo6048();
                    return true;
                }
                abstractC2897.m6066(cls);
                return true;
            }
            InterfaceC8523 interfaceC8523Mo13994 = mo13994(abstractC2897, cls);
            if (this.f23329) {
                abstractC28972 = abstractC2897;
                if (C8421.m14001(abstractC28972, objMo13995, this.f23611, this.f23322, interfaceC8523Mo13994)) {
                    return true;
                }
            } else {
                abstractC28972 = abstractC2897;
            }
            m14078(abstractC28972);
            boolean z = abstractC28972.f9171;
            String str = this.f23618;
            Type type = this.f23321;
            if (z) {
                interfaceC8523Mo13994.mo5678(abstractC28972, objMo13995, str, type, this.f23611);
                return true;
            }
            interfaceC8523Mo13994.mo5679(abstractC28972, objMo13995, str, type, this.f23611);
            return true;
        } catch (RuntimeException e) {
            if (abstractC2897.m6075()) {
                return false;
            }
            throw e;
        }
    }
}
