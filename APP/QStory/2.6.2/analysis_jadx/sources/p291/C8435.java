package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8435 extends AbstractC8426 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final Function f23345;

    public C8435(int i, long j, Class cls, String str, String str2, String str3, Field field, Method method, Type type, Function function) {
        super(str, i, j, str2, str3, type, cls, field, method);
        this.f23345 = function;
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Function mo13981() {
        return this.f23345;
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13976(Object obj) {
        return this.f23345.apply(obj);
    }

    @Override // p291.AbstractC8426, p291.C8429, p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13980(AbstractC2896 abstractC2896, Object obj) {
        LocalDate localDate = (LocalDate) this.f23345.apply(obj);
        if (localDate == null) {
            if (((this.f23620 | abstractC2896.f9176.f9151) & JSONWriter$Feature.WriteNulls.mask) == 0) {
                return false;
            }
            m14059(abstractC2896);
            abstractC2896.mo5922();
            return true;
        }
        m14059(abstractC2896);
        if (this.f23333 == null) {
            this.f23333 = mo13975(abstractC2896, LocalDate.class);
        }
        if (this.f23333 != C8472.f23456) {
            this.f23333.mo5634(abstractC2896, localDate, this.f23627, this.f23332, this.f23620);
            return true;
        }
        abstractC2896.mo5916(localDate);
        return true;
    }
}
