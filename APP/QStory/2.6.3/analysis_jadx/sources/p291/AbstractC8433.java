package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8433 extends AbstractC8494 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final boolean f23341;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f23342 = 0;

    public AbstractC8433(String str, int i, long j, String str2, String str3, Class cls, Class cls2, Field field, Method method) {
        super(str, i, j, str2, null, str3, cls, cls2, field, method);
        this.f23341 = (JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0 || "string".equals(str2);
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public InterfaceC8523 mo13994(AbstractC2897 abstractC2897, Class cls) {
        switch (this.f23342) {
            case 0:
                return cls == this.f23617 ? C8488.f23584 : abstractC2897.m6077(cls);
            default:
                return super.mo13994(abstractC2897, cls);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void m14007(AbstractC2897 abstractC2897, int i) {
        if (this.f23341) {
            m14078(abstractC2897);
            abstractC2897.mo6017(Integer.toString(i));
            return;
        }
        m14078(abstractC2897);
        String str = this.f23614;
        if (str == null) {
            abstractC2897.mo5973(i);
        } else if (abstractC2897.f9171) {
            abstractC2897.mo5973(i);
        } else {
            abstractC2897.mo6017(String.format(str, Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public void m14008(AbstractC2897 abstractC2897, long j) {
        boolean z = false;
        boolean z2 = ((abstractC2897.f9178.f9153 | this.f23611) & (JSONWriter$Feature.WriteNonStringValueAsString.mask | JSONWriter$Feature.WriteLongAsString.mask)) != 0;
        m14078(abstractC2897);
        if (!z2) {
            if (this.f23341) {
                Class cls = AbstractC2867.f9051;
                if ((j < -9007199254740991L || j > 9007199254740991L) && !abstractC2897.f9171) {
                    z = true;
                }
            }
            z2 = z;
        }
        if (z2) {
            abstractC2897.mo6017(Long.toString(j));
        } else {
            abstractC2897.mo5963(j);
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo13998(AbstractC2897 abstractC2897, Object obj) {
        switch (this.f23342) {
            case 0:
                Integer num = (Integer) mo13995(obj);
                if (num != null) {
                    abstractC2897.mo5971(num);
                } else {
                    abstractC2897.m6065();
                }
                break;
            default:
                Long l = (Long) mo13995(obj);
                if (l != null) {
                    abstractC2897.mo5962(l);
                } else {
                    abstractC2897.mo5967();
                }
                break;
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public boolean mo13999(AbstractC2897 abstractC2897, Object obj) {
        switch (this.f23342) {
            case 0:
                try {
                    Integer num = (Integer) mo13995(obj);
                    if (num == null) {
                        return m14079(abstractC2897);
                    }
                    m14007(abstractC2897, num.intValue());
                    return true;
                } catch (RuntimeException e) {
                    if (abstractC2897.m6075()) {
                        return false;
                    }
                    throw e;
                }
            default:
                try {
                    Long l = (Long) mo13995(obj);
                    if (l != null) {
                        m14008(abstractC2897, l.longValue());
                    } else {
                        if (((abstractC2897.f9178.f9153 | this.f23611) & (JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullNumberAsZero.mask)) == 0) {
                            return false;
                        }
                        m14078(abstractC2897);
                        abstractC2897.m6065();
                    }
                    return true;
                } catch (RuntimeException e2) {
                    if (abstractC2897.m6075()) {
                        return false;
                    }
                    throw e2;
                }
        }
    }

    public AbstractC8433(String str, int i, long j, String str2, String str3, Class cls, Field field, Method method) {
        super(str, i, j, str2, null, str3, cls, cls, field, method);
        this.f23341 = (JSONWriter$Feature.BrowserCompatible.mask & j) != 0;
    }
}
