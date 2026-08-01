package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8508 extends AbstractC8502 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f23630;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC8508(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, int i2) {
        super(str, i, j, str2, locale, str3, type, cls, field, method);
        this.f23630 = i2;
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public InterfaceC8531 mo13975(AbstractC2896 abstractC2896, Class cls) {
        switch (this.f23630) {
            case 0:
                return cls == this.f23626 ? C8496.f23592 : abstractC2896.m6031(cls);
            default:
                return super.mo13975(abstractC2896, cls);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void m14063(AbstractC2896 abstractC2896, short s) {
        if ((abstractC2896.m6032(this.f23620) & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0) {
            m14059(abstractC2896);
            abstractC2896.mo5972(Short.toString(s));
        } else {
            m14059(abstractC2896);
            abstractC2896.mo5925(s);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public void m14064(AbstractC2896 abstractC2896, byte b) {
        if ((JSONWriter$Feature.WriteNonStringValueAsString.mask & this.f23620) != 0) {
            m14059(abstractC2896);
            abstractC2896.mo5972(Byte.toString(b));
        } else {
            m14059(abstractC2896);
            abstractC2896.mo5919(b);
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo13979(AbstractC2896 abstractC2896, Object obj) {
        switch (this.f23630) {
            case 0:
                Short sh = (Short) mo13976(obj);
                if (sh != null) {
                    abstractC2896.mo5928(sh.shortValue());
                } else {
                    abstractC2896.m6019();
                }
                break;
            default:
                Byte b = (Byte) mo13976(obj);
                if (b != null) {
                    abstractC2896.mo5928(b.byteValue());
                } else {
                    abstractC2896.m6019();
                }
                break;
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public boolean mo13980(AbstractC2896 abstractC2896, Object obj) {
        switch (this.f23630) {
            case 0:
                try {
                    Short sh = (Short) mo13976(obj);
                    if (sh == null) {
                        return m14060(abstractC2896);
                    }
                    m14063(abstractC2896, sh.shortValue());
                    return true;
                } catch (RuntimeException e) {
                    if (abstractC2896.m6026()) {
                        return false;
                    }
                    throw e;
                }
            default:
                try {
                    Byte b = (Byte) mo13976(obj);
                    if (b == null) {
                        return m14060(abstractC2896);
                    }
                    m14064(abstractC2896, b.byteValue());
                    return true;
                } catch (RuntimeException e2) {
                    if (abstractC2896.m6026()) {
                        return false;
                    }
                    throw e2;
                }
        }
    }
}
