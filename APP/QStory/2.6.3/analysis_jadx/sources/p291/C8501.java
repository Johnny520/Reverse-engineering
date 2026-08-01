package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8501 extends AbstractC8502 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final /* synthetic */ int f23622;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8501(String str, int i, long j, String str2, String str3, Field field) {
        super(str, i, j, str2, str3, Date.class, Date.class, field, null);
        this.f23622 = 0;
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Object mo13995(Object obj) {
        switch (this.f23622) {
            case 1:
                try {
                    return this.f23603.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    C2942.m6401("invoke getter method error, ", this.f23618, e);
                    return null;
                }
            case 2:
                try {
                    return this.f23603.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    C2942.m6401("invoke getter method error, ", this.f23618, e2);
                    return null;
                }
            default:
                return super.mo13995(obj);
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13998(AbstractC2897 abstractC2897, Object obj) {
        switch (this.f23622) {
            case 0:
                Date date = (Date) mo13995(obj);
                if (date != null) {
                    m14080(abstractC2897, date.getTime());
                } else {
                    abstractC2897.mo5967();
                }
                break;
            case 1:
                Date date2 = (Date) mo13995(obj);
                if (date2 != null) {
                    m14080(abstractC2897, date2.getTime());
                } else {
                    abstractC2897.mo5967();
                }
                break;
            default:
                m14080(abstractC2897, ((Long) mo13995(obj)).longValue());
                break;
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13999(AbstractC2897 abstractC2897, Object obj) {
        int i = this.f23622;
        long j = this.f23611;
        switch (i) {
            case 0:
                Date date = (Date) mo13995(obj);
                if (date != null) {
                    m14084(abstractC2897, date.getTime());
                } else {
                    if (((j | abstractC2897.f9178.f9153) & JSONWriter$Feature.WriteNulls.mask) == 0) {
                        return false;
                    }
                    m14078(abstractC2897);
                    abstractC2897.mo5967();
                }
                return true;
            case 1:
                Date date2 = (Date) mo13995(obj);
                if (date2 != null) {
                    m14084(abstractC2897, date2.getTime());
                } else {
                    if (((j | abstractC2897.f9178.f9153) & JSONWriter$Feature.WriteNulls.mask) == 0) {
                        return false;
                    }
                    m14078(abstractC2897);
                    abstractC2897.mo5967();
                }
                return true;
            default:
                m14084(abstractC2897, ((Long) mo13995(obj)).longValue());
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8501(String str, int i, long j, String str2, String str3, Class cls, Class cls2, Field field, Method method, int i2) {
        super(str, i, j, str2, str3, cls, cls2, field, method);
        this.f23622 = i2;
    }
}
