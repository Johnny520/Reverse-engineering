package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9262 extends AbstractC9323 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final boolean f23686;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f23687 = 0;

    public AbstractC9262(String str, int i, long j, String str2, String str3, Class cls, Class cls2, Field field, Method method) {
        super(str, i, j, str2, null, str3, cls, cls2, field, method);
        this.f23686 = (JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0 || "string".equals(str2);
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public InterfaceC9352 mo14553(AbstractC3730 abstractC3730, Class cls) {
        switch (this.f23687) {
            case 0:
                return cls == this.f23962 ? C9317.f23929 : abstractC3730.m6637(cls);
            default:
                return super.mo14553(abstractC3730, cls);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void m14566(AbstractC3730 abstractC3730, int i) {
        if (this.f23686) {
            m14637(abstractC3730);
            abstractC3730.mo6577(Integer.toString(i));
            return;
        }
        m14637(abstractC3730);
        String str = this.f23959;
        if (str == null) {
            abstractC3730.mo6533(i);
        } else if (abstractC3730.f9516) {
            abstractC3730.mo6533(i);
        } else {
            abstractC3730.mo6577(String.format(str, Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public void m14567(AbstractC3730 abstractC3730, long j) {
        boolean z = false;
        boolean z2 = ((abstractC3730.f9523.f9498 | this.f23956) & (JSONWriter$Feature.WriteNonStringValueAsString.mask | JSONWriter$Feature.WriteLongAsString.mask)) != 0;
        m14637(abstractC3730);
        if (!z2) {
            if (this.f23686) {
                Class cls = AbstractC3700.f9396;
                if ((j < -9007199254740991L || j > 9007199254740991L) && !abstractC3730.f9516) {
                    z = true;
                }
            }
            z2 = z;
        }
        if (z2) {
            abstractC3730.mo6577(Long.toString(j));
        } else {
            abstractC3730.mo6523(j);
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo14557(AbstractC3730 abstractC3730, Object obj) {
        switch (this.f23687) {
            case 0:
                Integer num = (Integer) mo14554(obj);
                if (num != null) {
                    abstractC3730.mo6531(num);
                } else {
                    abstractC3730.m6625();
                }
                break;
            default:
                Long l = (Long) mo14554(obj);
                if (l != null) {
                    abstractC3730.mo6522(l);
                } else {
                    abstractC3730.mo6527();
                }
                break;
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public boolean mo14558(AbstractC3730 abstractC3730, Object obj) {
        switch (this.f23687) {
            case 0:
                try {
                    Integer num = (Integer) mo14554(obj);
                    if (num == null) {
                        return m14638(abstractC3730);
                    }
                    m14566(abstractC3730, num.intValue());
                    return true;
                } catch (RuntimeException e) {
                    if (abstractC3730.m6635()) {
                        return false;
                    }
                    throw e;
                }
            default:
                try {
                    Long l = (Long) mo14554(obj);
                    if (l != null) {
                        m14567(abstractC3730, l.longValue());
                    } else {
                        if (((abstractC3730.f9523.f9498 | this.f23956) & (JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullNumberAsZero.mask)) == 0) {
                            return false;
                        }
                        m14637(abstractC3730);
                        abstractC3730.m6625();
                    }
                    return true;
                } catch (RuntimeException e2) {
                    if (abstractC3730.m6635()) {
                        return false;
                    }
                    throw e2;
                }
        }
    }

    public AbstractC9262(String str, int i, long j, String str2, String str3, Class cls, Field field, Method method) {
        super(str, i, j, str2, null, str3, cls, cls, field, method);
        this.f23686 = (JSONWriter$Feature.BrowserCompatible.mask & j) != 0;
    }
}
