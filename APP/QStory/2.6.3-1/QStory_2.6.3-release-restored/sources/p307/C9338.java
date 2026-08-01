package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import java.util.function.Function;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9338 extends AbstractC9331 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final /* synthetic */ int f23984;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final Object f23985;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9338(String str, int i, long j, String str2, String str3, Field field, Method method, Function function, int i2) {
        super(str, i, j, str2, str3, Calendar.class, Calendar.class, field, method);
        this.f23984 = i2;
        switch (i2) {
            case 1:
                super(str, i, j, str2, str3, Date.class, Date.class, field, method);
                this.f23985 = function;
                break;
            default:
                this.f23985 = function;
                break;
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Function mo14559() {
        switch (this.f23984) {
            case 0:
                return (Function) this.f23985;
            case 1:
                return (Function) this.f23985;
            default:
                return super.mo14559();
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo14554(Object obj) {
        int i = this.f23984;
        Object obj2 = this.f23985;
        switch (i) {
            case 0:
                return ((Function) obj2).apply(obj);
            case 1:
                return ((Function) obj2).apply(obj);
            default:
                return Long.valueOf(((ToLongFunction) obj2).applyAsLong(obj));
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo14557(AbstractC3730 abstractC3730, Object obj) {
        int i = this.f23984;
        Object obj2 = this.f23985;
        switch (i) {
            case 0:
                Calendar calendar = (Calendar) ((Function) obj2).apply(obj);
                if (calendar != null) {
                    m14639(abstractC3730, calendar.getTimeInMillis());
                } else {
                    abstractC3730.mo6527();
                }
                break;
            case 1:
                Date date = (Date) ((Function) obj2).apply(obj);
                if (date != null) {
                    m14639(abstractC3730, date.getTime());
                } else {
                    abstractC3730.mo6527();
                }
                break;
            default:
                m14639(abstractC3730, ((ToLongFunction) obj2).applyAsLong(obj));
                break;
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo14558(AbstractC3730 abstractC3730, Object obj) {
        int i = this.f23984;
        long j = this.f23956;
        Object obj2 = this.f23985;
        switch (i) {
            case 0:
                Calendar calendar = (Calendar) ((Function) obj2).apply(obj);
                if (calendar != null) {
                    m14643(abstractC3730, calendar.getTimeInMillis());
                } else if (((j | abstractC3730.f9523.f9498) & JSONWriter$Feature.WriteNulls.mask) != 0) {
                    m14637(abstractC3730);
                    abstractC3730.mo6527();
                }
                break;
            case 1:
                Date date = (Date) ((Function) obj2).apply(obj);
                if (date != null) {
                    m14643(abstractC3730, date.getTime());
                } else if (((j | abstractC3730.f9523.f9498) & JSONWriter$Feature.WriteNulls.mask) != 0) {
                    m14637(abstractC3730);
                    abstractC3730.mo6527();
                }
                break;
            default:
                long jApplyAsLong = ((ToLongFunction) obj2).applyAsLong(obj);
                if (jApplyAsLong != 0) {
                    m14643(abstractC3730, jApplyAsLong);
                } else if (((j | abstractC3730.f9523.f9498) & JSONWriter$Feature.WriteNulls.mask) != 0) {
                    m14637(abstractC3730);
                    abstractC3730.mo6527();
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9338(String str, int i, long j, String str2, String str3, Field field, Method method, ToLongFunction toLongFunction) {
        this.f23984 = 2;
        Class cls = Long.TYPE;
        super(str, i, j, str2, str3, cls, cls, field, method);
        this.f23985 = toLongFunction;
    }
}
