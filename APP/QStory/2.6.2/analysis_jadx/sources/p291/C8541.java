package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8541 extends AbstractC8502 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final boolean f23779;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final Function f23780;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final boolean f23781;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final boolean f23782;

    public C8541(String str, int i, long j, String str2, String str3, Field field, Method method, Function function) {
        super(str, i, j, str2, null, str3, String.class, String.class, field, method);
        this.f23780 = function;
        this.f23779 = "symbol".equals(str2);
        this.f23782 = "trim".equals(str2);
        this.f23781 = (1125899906842624L & j) != 0;
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Function mo13981() {
        return this.f23780;
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13976(Object obj) {
        return this.f23780.apply(obj);
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13979(AbstractC2896 abstractC2896, Object obj) {
        String strTrim = (String) this.f23780.apply(obj);
        if (this.f23782 && strTrim != null) {
            strTrim = strTrim.trim();
        }
        if (this.f23779 && abstractC2896.f9169) {
            abstractC2896.mo6002(strTrim);
        } else if (this.f23781) {
            abstractC2896.mo5964(strTrim);
        } else {
            abstractC2896.mo5972(strTrim);
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13980(AbstractC2896 abstractC2896, Object obj) {
        long j = this.f23620;
        try {
            String strTrim = (String) this.f23780.apply(obj);
            long j2 = j | abstractC2896.f9176.f9151;
            if (strTrim == null) {
                if (((JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullStringAsEmpty.mask) & j2) == 0) {
                    return false;
                }
            } else if (this.f23782) {
                strTrim = strTrim.trim();
            }
            if (strTrim != null && strTrim.isEmpty() && (JSONWriter$Feature.IgnoreEmpty.mask & j2) != 0) {
                return false;
            }
            m14059(abstractC2896);
            if (strTrim == null) {
                if ((j2 & (JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullStringAsEmpty.mask)) != 0) {
                    abstractC2896.mo5972("");
                    return true;
                }
                abstractC2896.mo5922();
                return true;
            }
            if (this.f23779 && abstractC2896.f9169) {
                abstractC2896.mo6002(strTrim);
                return true;
            }
            if (this.f23781) {
                abstractC2896.mo5964(strTrim);
                return true;
            }
            abstractC2896.mo5972(strTrim);
            return true;
        } catch (RuntimeException e) {
            if ((abstractC2896.m6032(j) | JSONWriter$Feature.IgnoreNonFieldGetter.mask) != 0) {
                return false;
            }
            throw e;
        }
    }
}
