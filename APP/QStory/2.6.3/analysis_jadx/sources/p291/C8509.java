package p291;

import com.alibaba.fastjson2.AbstractC2897;
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
public final class C8509 extends AbstractC8502 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final /* synthetic */ int f23639;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final Object f23640;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8509(String str, int i, long j, String str2, String str3, Field field, Method method, Function function, int i2) {
        super(str, i, j, str2, str3, Calendar.class, Calendar.class, field, method);
        this.f23639 = i2;
        switch (i2) {
            case 1:
                super(str, i, j, str2, str3, Date.class, Date.class, field, method);
                this.f23640 = function;
                break;
            default:
                this.f23640 = function;
                break;
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Function mo14000() {
        switch (this.f23639) {
            case 0:
                return (Function) this.f23640;
            case 1:
                return (Function) this.f23640;
            default:
                return super.mo14000();
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13995(Object obj) {
        int i = this.f23639;
        Object obj2 = this.f23640;
        switch (i) {
            case 0:
                return ((Function) obj2).apply(obj);
            case 1:
                return ((Function) obj2).apply(obj);
            default:
                return Long.valueOf(((ToLongFunction) obj2).applyAsLong(obj));
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13998(AbstractC2897 abstractC2897, Object obj) {
        int i = this.f23639;
        Object obj2 = this.f23640;
        switch (i) {
            case 0:
                Calendar calendar = (Calendar) ((Function) obj2).apply(obj);
                if (calendar != null) {
                    m14080(abstractC2897, calendar.getTimeInMillis());
                } else {
                    abstractC2897.mo5967();
                }
                break;
            case 1:
                Date date = (Date) ((Function) obj2).apply(obj);
                if (date != null) {
                    m14080(abstractC2897, date.getTime());
                } else {
                    abstractC2897.mo5967();
                }
                break;
            default:
                m14080(abstractC2897, ((ToLongFunction) obj2).applyAsLong(obj));
                break;
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13999(AbstractC2897 abstractC2897, Object obj) {
        int i = this.f23639;
        long j = this.f23611;
        Object obj2 = this.f23640;
        switch (i) {
            case 0:
                Calendar calendar = (Calendar) ((Function) obj2).apply(obj);
                if (calendar != null) {
                    m14084(abstractC2897, calendar.getTimeInMillis());
                } else if (((j | abstractC2897.f9178.f9153) & JSONWriter$Feature.WriteNulls.mask) != 0) {
                    m14078(abstractC2897);
                    abstractC2897.mo5967();
                }
                break;
            case 1:
                Date date = (Date) ((Function) obj2).apply(obj);
                if (date != null) {
                    m14084(abstractC2897, date.getTime());
                } else if (((j | abstractC2897.f9178.f9153) & JSONWriter$Feature.WriteNulls.mask) != 0) {
                    m14078(abstractC2897);
                    abstractC2897.mo5967();
                }
                break;
            default:
                long jApplyAsLong = ((ToLongFunction) obj2).applyAsLong(obj);
                if (jApplyAsLong != 0) {
                    m14084(abstractC2897, jApplyAsLong);
                } else if (((j | abstractC2897.f9178.f9153) & JSONWriter$Feature.WriteNulls.mask) != 0) {
                    m14078(abstractC2897);
                    abstractC2897.mo5967();
                }
                break;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8509(String str, int i, long j, String str2, String str3, Field field, Method method, ToLongFunction toLongFunction) {
        this.f23639 = 2;
        Class cls = Long.TYPE;
        super(str, i, j, str2, str3, cls, cls, field, method);
        this.f23640 = toLongFunction;
    }
}
