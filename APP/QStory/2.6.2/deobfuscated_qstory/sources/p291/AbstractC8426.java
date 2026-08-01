package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8426 extends C8429 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final Type f23330;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final boolean f23331;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final Class f23332;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public volatile InterfaceC8531 f23333;

    public AbstractC8426(String str, int i, long j, String str2, String str3, Type type, Class cls, Field field, Method method) {
        super(str, i, j, str2, null, str3, type, cls, field, method);
        this.f23330 = type;
        this.f23332 = cls;
        this.f23331 = !C8547.m14086(cls);
    }

    @Override // p291.C8429, p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC8531 mo13975(AbstractC2896 abstractC2896, Class cls) {
        if (this.f23332 != cls) {
            return super.mo13975(abstractC2896, cls);
        }
        if (this.f23333 != null) {
            return this.f23333;
        }
        InterfaceC8531 interfaceC8531Mo13975 = super.mo13975(abstractC2896, cls);
        this.f23333 = interfaceC8531Mo13975;
        return interfaceC8531Mo13975;
    }

    @Override // p291.C8429, p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13979(AbstractC2896 abstractC2896, Object obj) {
        AbstractC2896 abstractC28962;
        Object objMo13976 = mo13976(obj);
        if (objMo13976 == null) {
            abstractC2896.mo5922();
            return;
        }
        boolean z = this.f23331 && abstractC2896.m6028();
        if (z) {
            if (objMo13976 == obj) {
                abstractC2896.mo5975("..");
                return;
            }
            String strM6041 = abstractC2896.m6041(objMo13976, this.f23627);
            if (strM6041 != null) {
                abstractC2896.mo5975(strM6041);
                abstractC2896.m6037(objMo13976);
                return;
            }
        }
        InterfaceC8531 interfaceC8531Mo13975 = mo13975(abstractC2896, this.f23332);
        boolean z2 = (abstractC2896.m6032(this.f23620) & JSONWriter$Feature.BeanToArray.mask) != 0;
        boolean z3 = abstractC2896.f9169;
        String str = this.f23627;
        if (z3) {
            Type type = this.f23330;
            if (z2) {
                abstractC28962 = abstractC2896;
                interfaceC8531Mo13975.mo13999(abstractC28962, objMo13976, type, this.f23620);
            } else {
                abstractC28962 = abstractC2896;
                interfaceC8531Mo13975.mo5633(abstractC28962, objMo13976, str, type, this.f23620);
            }
        } else {
            Type type2 = this.f23330;
            if (z2) {
                abstractC28962 = abstractC2896;
                interfaceC8531Mo13975.mo14000(abstractC28962, objMo13976, str, type2, this.f23620);
            } else {
                abstractC28962 = abstractC2896;
                interfaceC8531Mo13975.mo5634(abstractC28962, objMo13976, str, type2, this.f23620);
            }
        }
        if (z) {
            abstractC28962.m6037(objMo13976);
        }
    }

    @Override // p291.C8429, p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public boolean mo13980(AbstractC2896 abstractC2896, Object obj) {
        AbstractC2896 abstractC28962;
        try {
            Object objMo13976 = mo13976(obj);
            Class cls = this.f23332;
            if (objMo13976 == null) {
                if (((abstractC2896.f9176.f9151 | this.f23620) & (JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask)) == 0) {
                    return false;
                }
                m14059(abstractC2896);
                if (cls.isArray()) {
                    abstractC2896.mo5994();
                    return true;
                }
                if (cls == StringBuffer.class || cls == StringBuilder.class) {
                    abstractC2896.mo6003();
                    return true;
                }
                abstractC2896.m6020(cls);
                return true;
            }
            InterfaceC8531 interfaceC8531Mo13975 = mo13975(abstractC2896, cls);
            if (this.f23338) {
                abstractC28962 = abstractC2896;
                if (C8429.m13982(abstractC28962, objMo13976, this.f23620, this.f23331, interfaceC8531Mo13975)) {
                    return true;
                }
            } else {
                abstractC28962 = abstractC2896;
            }
            m14059(abstractC28962);
            boolean z = abstractC28962.f9169;
            String str = this.f23627;
            Type type = this.f23330;
            if (z) {
                interfaceC8531Mo13975.mo5633(abstractC28962, objMo13976, str, type, this.f23620);
                return true;
            }
            interfaceC8531Mo13975.mo5634(abstractC28962, objMo13976, str, type, this.f23620);
            return true;
        } catch (RuntimeException e) {
            if (abstractC2896.m6026()) {
                return false;
            }
            throw e;
        }
    }
}
