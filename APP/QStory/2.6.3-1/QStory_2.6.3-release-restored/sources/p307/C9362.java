package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9362 extends AbstractC9323 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final boolean f24115;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final Function f24116;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final boolean f24117;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final boolean f24118;

    public C9362(String str, int i, long j, String str2, String str3, Field field, Method method, Function function) {
        super(str, i, j, str2, null, str3, String.class, String.class, field, method);
        this.f24116 = function;
        this.f24115 = "symbol".equals(str2);
        this.f24118 = "trim".equals(str2);
        this.f24117 = (1125899906842624L & j) != 0;
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Function mo14559() {
        return this.f24116;
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo14554(Object obj) {
        return this.f24116.apply(obj);
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo14557(AbstractC3730 abstractC3730, Object obj) {
        String strTrim = (String) this.f24116.apply(obj);
        if (this.f24118 && strTrim != null) {
            strTrim = strTrim.trim();
        }
        if (this.f24115 && abstractC3730.f9516) {
            abstractC3730.mo6607(strTrim);
        } else if (this.f24117) {
            abstractC3730.mo6569(strTrim);
        } else {
            abstractC3730.mo6577(strTrim);
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo14558(AbstractC3730 abstractC3730, Object obj) {
        long j = this.f23956;
        try {
            String strTrim = (String) this.f24116.apply(obj);
            long j2 = j | abstractC3730.f9523.f9498;
            if (strTrim == null) {
                if (((JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullStringAsEmpty.mask) & j2) == 0) {
                    return false;
                }
            } else if (this.f24118) {
                strTrim = strTrim.trim();
            }
            if (strTrim != null && strTrim.isEmpty() && (JSONWriter$Feature.IgnoreEmpty.mask & j2) != 0) {
                return false;
            }
            m14637(abstractC3730);
            if (strTrim == null) {
                if ((j2 & (JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullStringAsEmpty.mask)) != 0) {
                    abstractC3730.mo6577("");
                    return true;
                }
                abstractC3730.mo6527();
                return true;
            }
            if (this.f24115 && abstractC3730.f9516) {
                abstractC3730.mo6607(strTrim);
                return true;
            }
            if (this.f24117) {
                abstractC3730.mo6569(strTrim);
                return true;
            }
            abstractC3730.mo6577(strTrim);
            return true;
        } catch (RuntimeException e) {
            if ((abstractC3730.m6638(j) | JSONWriter$Feature.IgnoreNonFieldGetter.mask) != 0) {
                return false;
            }
            throw e;
        }
    }
}
