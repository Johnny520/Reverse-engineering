package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8500 extends AbstractC8494 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f23621;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC8500(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, int i2) {
        super(str, i, j, str2, locale, str3, type, cls, field, method);
        this.f23621 = i2;
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public InterfaceC8523 mo13994(AbstractC2897 abstractC2897, Class cls) {
        switch (this.f23621) {
            case 0:
                return cls == this.f23617 ? C8488.f23583 : abstractC2897.m6077(cls);
            default:
                return super.mo13994(abstractC2897, cls);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void m14082(AbstractC2897 abstractC2897, short s) {
        if ((abstractC2897.m6078(this.f23611) & JSONWriter$Feature.WriteNonStringValueAsString.mask) != 0) {
            m14078(abstractC2897);
            abstractC2897.mo6017(Short.toString(s));
        } else {
            m14078(abstractC2897);
            abstractC2897.mo5970(s);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public void m14083(AbstractC2897 abstractC2897, byte b) {
        if ((JSONWriter$Feature.WriteNonStringValueAsString.mask & this.f23611) != 0) {
            m14078(abstractC2897);
            abstractC2897.mo6017(Byte.toString(b));
        } else {
            m14078(abstractC2897);
            abstractC2897.mo5964(b);
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo13998(AbstractC2897 abstractC2897, Object obj) {
        switch (this.f23621) {
            case 0:
                Short sh = (Short) mo13995(obj);
                if (sh != null) {
                    abstractC2897.mo5973(sh.shortValue());
                } else {
                    abstractC2897.m6065();
                }
                break;
            default:
                Byte b = (Byte) mo13995(obj);
                if (b != null) {
                    abstractC2897.mo5973(b.byteValue());
                } else {
                    abstractC2897.m6065();
                }
                break;
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public boolean mo13999(AbstractC2897 abstractC2897, Object obj) {
        switch (this.f23621) {
            case 0:
                try {
                    Short sh = (Short) mo13995(obj);
                    if (sh == null) {
                        return m14079(abstractC2897);
                    }
                    m14082(abstractC2897, sh.shortValue());
                    return true;
                } catch (RuntimeException e) {
                    if (abstractC2897.m6075()) {
                        return false;
                    }
                    throw e;
                }
            default:
                try {
                    Byte b = (Byte) mo13995(obj);
                    if (b == null) {
                        return m14079(abstractC2897);
                    }
                    m14083(abstractC2897, b.byteValue());
                    return true;
                } catch (RuntimeException e2) {
                    if (abstractC2897.m6075()) {
                        return false;
                    }
                    throw e2;
                }
        }
    }
}
