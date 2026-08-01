package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9247 extends C9250 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final Type f23666;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final boolean f23667;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final Class f23668;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public volatile InterfaceC9352 f23669;

    public AbstractC9247(String str, int i, long j, String str2, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i, j, str2, null, str3, type, cls, field, method);
        this.f23666 = type;
        this.f23668 = cls;
        this.f23667 = !C9368.m14664(cls);
    }

    @Override // p307.C9250, p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC9352 mo14553(AbstractC3730 abstractC3730, Class cls) {
        if (this.f23668 != cls) {
            return super.mo14553(abstractC3730, cls);
        }
        if (this.f23669 != null) {
            return this.f23669;
        }
        InterfaceC9352 interfaceC9352Mo14553 = super.mo14553(abstractC3730, cls);
        this.f23669 = interfaceC9352Mo14553;
        return interfaceC9352Mo14553;
    }

    @Override // p307.C9250, p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo14557(AbstractC3730 abstractC3730, Object obj) {
        AbstractC3730 abstractC37302;
        Object objMo14554 = mo14554(obj);
        if (objMo14554 == null) {
            abstractC3730.mo6527();
            return;
        }
        boolean z = this.f23667 && abstractC3730.m6632();
        if (z) {
            if (objMo14554 == obj) {
                abstractC3730.mo6580("..");
                return;
            }
            String strM6647 = abstractC3730.m6647(objMo14554, this.f23963);
            if (strM6647 != null) {
                abstractC3730.mo6580(strM6647);
                abstractC3730.m6643(objMo14554);
                return;
            }
        }
        InterfaceC9352 interfaceC9352Mo14553 = mo14553(abstractC3730, this.f23668);
        boolean z2 = (abstractC3730.m6638(this.f23956) & JSONWriter$Feature.BeanToArray.mask) != 0;
        boolean z3 = abstractC3730.f9516;
        String str = this.f23963;
        if (z3) {
            Type type = this.f23666;
            if (z2) {
                abstractC37302 = abstractC3730;
                interfaceC9352Mo14553.mo14577(abstractC37302, objMo14554, type, this.f23956);
            } else {
                abstractC37302 = abstractC3730;
                interfaceC9352Mo14553.mo6238(abstractC37302, objMo14554, str, type, this.f23956);
            }
        } else {
            Type type2 = this.f23666;
            if (z2) {
                abstractC37302 = abstractC3730;
                interfaceC9352Mo14553.mo14578(abstractC37302, objMo14554, str, type2, this.f23956);
            } else {
                abstractC37302 = abstractC3730;
                interfaceC9352Mo14553.mo6239(abstractC37302, objMo14554, str, type2, this.f23956);
            }
        }
        if (z) {
            abstractC37302.m6643(objMo14554);
        }
    }

    @Override // p307.C9250, p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public boolean mo14558(AbstractC3730 abstractC3730, Object obj) {
        AbstractC3730 abstractC37302;
        try {
            Object objMo14554 = mo14554(obj);
            Class cls = this.f23668;
            if (objMo14554 == null) {
                if (((abstractC3730.f9523.f9498 | this.f23956) & (JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask)) == 0) {
                    return false;
                }
                m14637(abstractC3730);
                if (cls.isArray()) {
                    abstractC3730.mo6599();
                    return true;
                }
                if (cls == StringBuffer.class || cls == StringBuilder.class) {
                    abstractC3730.mo6608();
                    return true;
                }
                abstractC3730.m6626(cls);
                return true;
            }
            InterfaceC9352 interfaceC9352Mo14553 = mo14553(abstractC3730, cls);
            if (this.f23674) {
                abstractC37302 = abstractC3730;
                if (C9250.m14560(abstractC37302, objMo14554, this.f23956, this.f23667, interfaceC9352Mo14553)) {
                    return true;
                }
            } else {
                abstractC37302 = abstractC3730;
            }
            m14637(abstractC37302);
            boolean z = abstractC37302.f9516;
            String str = this.f23963;
            Type type = this.f23666;
            if (z) {
                interfaceC9352Mo14553.mo6238(abstractC37302, objMo14554, str, type, this.f23956);
                return true;
            }
            interfaceC9352Mo14553.mo6239(abstractC37302, objMo14554, str, type, this.f23956);
            return true;
        } catch (RuntimeException e) {
            if (abstractC3730.m6635()) {
                return false;
            }
            throw e;
        }
    }
}
