package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8441 extends AbstractC8502 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final boolean f23350;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f23351 = 0;

    public AbstractC8441(String str, int i, long j, String str2, String str3, Class cls, Class cls2, Field field, Method method) {
        super(str, i, j, str2, null, str3, cls, cls2, field, method);
        this.f23350 = (JSONWriter$Feature.WriteNonStringValueAsString.mask & j) != 0 || "string".equals(str2);
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public InterfaceC8531 mo13975(AbstractC2896 abstractC2896, Class cls) {
        switch (this.f23351) {
            case 0:
                return cls == this.f23626 ? C8496.f23593 : abstractC2896.m6031(cls);
            default:
                return super.mo13975(abstractC2896, cls);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void m13988(AbstractC2896 abstractC2896, int i) {
        if (this.f23350) {
            m14059(abstractC2896);
            abstractC2896.mo5972(Integer.toString(i));
            return;
        }
        m14059(abstractC2896);
        String str = this.f23623;
        if (str == null) {
            abstractC2896.mo5928(i);
        } else if (abstractC2896.f9169) {
            abstractC2896.mo5928(i);
        } else {
            abstractC2896.mo5972(String.format(str, Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public void m13989(AbstractC2896 abstractC2896, long j) {
        boolean z = false;
        boolean z2 = ((abstractC2896.f9176.f9151 | this.f23620) & (JSONWriter$Feature.WriteNonStringValueAsString.mask | JSONWriter$Feature.WriteLongAsString.mask)) != 0;
        m14059(abstractC2896);
        if (!z2) {
            if (this.f23350) {
                Class cls = AbstractC2866.f9049;
                if ((j < -9007199254740991L || j > 9007199254740991L) && !abstractC2896.f9169) {
                    z = true;
                }
            }
            z2 = z;
        }
        if (z2) {
            abstractC2896.mo5972(Long.toString(j));
        } else {
            abstractC2896.mo5918(j);
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo13979(AbstractC2896 abstractC2896, Object obj) {
        switch (this.f23351) {
            case 0:
                Integer num = (Integer) mo13976(obj);
                if (num != null) {
                    abstractC2896.mo5926(num);
                } else {
                    abstractC2896.m6019();
                }
                break;
            default:
                Long l = (Long) mo13976(obj);
                if (l != null) {
                    abstractC2896.mo5917(l);
                } else {
                    abstractC2896.mo5922();
                }
                break;
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public boolean mo13980(AbstractC2896 abstractC2896, Object obj) {
        switch (this.f23351) {
            case 0:
                try {
                    Integer num = (Integer) mo13976(obj);
                    if (num == null) {
                        return m14060(abstractC2896);
                    }
                    m13988(abstractC2896, num.intValue());
                    return true;
                } catch (RuntimeException e) {
                    if (abstractC2896.m6026()) {
                        return false;
                    }
                    throw e;
                }
            default:
                try {
                    Long l = (Long) mo13976(obj);
                    if (l != null) {
                        m13989(abstractC2896, l.longValue());
                    } else {
                        if (((abstractC2896.f9176.f9151 | this.f23620) & (JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullNumberAsZero.mask)) == 0) {
                            return false;
                        }
                        m14059(abstractC2896);
                        abstractC2896.m6019();
                    }
                    return true;
                } catch (RuntimeException e2) {
                    if (abstractC2896.m6026()) {
                        return false;
                    }
                    throw e2;
                }
        }
    }

    public AbstractC8441(String str, int i, long j, String str2, String str3, Class cls, Field field, Method method) {
        super(str, i, j, str2, null, str3, cls, cls, field, method);
        this.f23350 = (JSONWriter$Feature.BrowserCompatible.mask & j) != 0;
    }
}
