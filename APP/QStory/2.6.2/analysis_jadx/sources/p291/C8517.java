package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import java.util.function.Function;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8517 extends AbstractC8510 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final /* synthetic */ int f23648;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final Object f23649;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8517(String str, int i, long j, String str2, String str3, Field field, Method method, Function function, int i2) {
        super(str, i, j, str2, str3, Calendar.class, Calendar.class, field, method);
        this.f23648 = i2;
        switch (i2) {
            case 1:
                super(str, i, j, str2, str3, Date.class, Date.class, field, method);
                this.f23649 = function;
                break;
            default:
                this.f23649 = function;
                break;
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Function mo13981() {
        switch (this.f23648) {
            case 0:
                return (Function) this.f23649;
            case 1:
                return (Function) this.f23649;
            default:
                return super.mo13981();
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13976(Object obj) {
        int i = this.f23648;
        Object obj2 = this.f23649;
        switch (i) {
            case 0:
                return ((Function) obj2).apply(obj);
            case 1:
                return ((Function) obj2).apply(obj);
            default:
                return Long.valueOf(((ToLongFunction) obj2).applyAsLong(obj));
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13979(AbstractC2896 abstractC2896, Object obj) {
        int i = this.f23648;
        Object obj2 = this.f23649;
        switch (i) {
            case 0:
                Calendar calendar = (Calendar) ((Function) obj2).apply(obj);
                if (calendar != null) {
                    m14061(abstractC2896, calendar.getTimeInMillis());
                } else {
                    abstractC2896.mo5922();
                }
                break;
            case 1:
                Date date = (Date) ((Function) obj2).apply(obj);
                if (date != null) {
                    m14061(abstractC2896, date.getTime());
                } else {
                    abstractC2896.mo5922();
                }
                break;
            default:
                m14061(abstractC2896, ((ToLongFunction) obj2).applyAsLong(obj));
                break;
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13980(AbstractC2896 abstractC2896, Object obj) {
        int i = this.f23648;
        long j = this.f23620;
        Object obj2 = this.f23649;
        switch (i) {
            case 0:
                Calendar calendar = (Calendar) ((Function) obj2).apply(obj);
                if (calendar != null) {
                    m14065(abstractC2896, calendar.getTimeInMillis());
                } else if (((j | abstractC2896.f9176.f9151) & JSONWriter$Feature.WriteNulls.mask) != 0) {
                    m14059(abstractC2896);
                    abstractC2896.mo5922();
                }
                break;
            case 1:
                Date date = (Date) ((Function) obj2).apply(obj);
                if (date != null) {
                    m14065(abstractC2896, date.getTime());
                } else if (((j | abstractC2896.f9176.f9151) & JSONWriter$Feature.WriteNulls.mask) != 0) {
                    m14059(abstractC2896);
                    abstractC2896.mo5922();
                }
                break;
            default:
                long jApplyAsLong = ((ToLongFunction) obj2).applyAsLong(obj);
                if (jApplyAsLong != 0) {
                    m14065(abstractC2896, jApplyAsLong);
                } else if (((j | abstractC2896.f9176.f9151) & JSONWriter$Feature.WriteNulls.mask) != 0) {
                    m14059(abstractC2896);
                    abstractC2896.mo5922();
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8517(String str, int i, long j, String str2, String str3, Field field, Method method, ToLongFunction toLongFunction) {
        this.f23648 = 2;
        Class cls = Long.TYPE;
        super(str, i, j, str2, str3, cls, cls, field, method);
        this.f23649 = toLongFunction;
    }
}
