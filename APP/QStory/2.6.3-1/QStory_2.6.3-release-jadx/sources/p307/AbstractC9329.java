package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9329 extends AbstractC9323 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f23966;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC9329(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, int i2) {
        super(str, i, j, str2, locale, str3, type, cls, field, method);
        this.f23966 = i2;
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public InterfaceC9352 mo14553(AbstractC3730 abstractC3730, Class cls) {
        switch (this.f23966) {
            case 0:
                return cls == this.f23962 ? C9317.f23928 : abstractC3730.m6637(cls);
            default:
                return super.mo14553(abstractC3730, cls);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void m14641(AbstractC3730 abstractC3730, short s) {
        if ((abstractC3730.m6638(this.f23956) & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0) {
            m14637(abstractC3730);
            abstractC3730.mo6577(Short.toString(s));
        } else {
            m14637(abstractC3730);
            abstractC3730.mo6530(s);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public void m14642(AbstractC3730 abstractC3730, byte b) {
        if ((JSONWriter$Feature.WriteNonStringValueAsString.mask & this.f23956) != 0) {
            m14637(abstractC3730);
            abstractC3730.mo6577(Byte.toString(b));
        } else {
            m14637(abstractC3730);
            abstractC3730.mo6524(b);
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo14557(AbstractC3730 abstractC3730, Object obj) {
        switch (this.f23966) {
            case 0:
                Short sh = (Short) mo14554(obj);
                if (sh != null) {
                    abstractC3730.mo6533(sh.shortValue());
                } else {
                    abstractC3730.m6625();
                }
                break;
            default:
                Byte b = (Byte) mo14554(obj);
                if (b != null) {
                    abstractC3730.mo6533(b.byteValue());
                } else {
                    abstractC3730.m6625();
                }
                break;
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public boolean mo14558(AbstractC3730 abstractC3730, Object obj) {
        switch (this.f23966) {
            case 0:
                try {
                    Short sh = (Short) mo14554(obj);
                    if (sh == null) {
                        return m14638(abstractC3730);
                    }
                    m14641(abstractC3730, sh.shortValue());
                    return true;
                } catch (RuntimeException e) {
                    if (abstractC3730.m6635()) {
                        return false;
                    }
                    throw e;
                }
            default:
                try {
                    Byte b = (Byte) mo14554(obj);
                    if (b == null) {
                        return m14638(abstractC3730);
                    }
                    m14642(abstractC3730, b.byteValue());
                    return true;
                } catch (RuntimeException e2) {
                    if (abstractC3730.m6635()) {
                        return false;
                    }
                    throw e2;
                }
        }
    }
}
