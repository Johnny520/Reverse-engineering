package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8533 extends AbstractC8494 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final boolean f23770;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final Function f23771;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final boolean f23772;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final boolean f23773;

    public C8533(String str, int i, long j, String str2, String str3, Field field, Method method, Function function) {
        super(str, i, j, str2, null, str3, String.class, String.class, field, method);
        this.f23771 = function;
        this.f23770 = "symbol".equals(str2);
        this.f23773 = "trim".equals(str2);
        this.f23772 = (1125899906842624L & j) != 0;
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Function mo14000() {
        return this.f23771;
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13995(Object obj) {
        return this.f23771.apply(obj);
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13998(AbstractC2897 abstractC2897, Object obj) {
        String strTrim = (String) this.f23771.apply(obj);
        if (this.f23773 && strTrim != null) {
            strTrim = strTrim.trim();
        }
        if (this.f23770 && abstractC2897.f9171) {
            abstractC2897.mo6047(strTrim);
        } else if (this.f23772) {
            abstractC2897.mo6009(strTrim);
        } else {
            abstractC2897.mo6017(strTrim);
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13999(AbstractC2897 abstractC2897, Object obj) {
        long j = this.f23611;
        try {
            String strTrim = (String) this.f23771.apply(obj);
            long j2 = j | abstractC2897.f9178.f9153;
            if (strTrim == null) {
                if (((JSONWriter$Feature.WriteNulls.mask | JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullStringAsEmpty.mask) & j2) == 0) {
                    return false;
                }
            } else if (this.f23773) {
                strTrim = strTrim.trim();
            }
            if (strTrim != null && strTrim.isEmpty() && (JSONWriter$Feature.IgnoreEmpty.mask & j2) != 0) {
                return false;
            }
            m14078(abstractC2897);
            if (strTrim == null) {
                if ((j2 & (JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullStringAsEmpty.mask)) != 0) {
                    abstractC2897.mo6017("");
                    return true;
                }
                abstractC2897.mo5967();
                return true;
            }
            if (this.f23770 && abstractC2897.f9171) {
                abstractC2897.mo6047(strTrim);
                return true;
            }
            if (this.f23772) {
                abstractC2897.mo6009(strTrim);
                return true;
            }
            abstractC2897.mo6017(strTrim);
            return true;
        } catch (RuntimeException e) {
            if ((abstractC2897.m6078(j) | JSONWriter$Feature.IgnoreNonFieldGetter.mask) != 0) {
                return false;
            }
            throw e;
        }
    }
}
