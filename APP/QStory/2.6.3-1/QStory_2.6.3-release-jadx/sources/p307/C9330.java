package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3775;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9330 extends AbstractC9331 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final /* synthetic */ int f23967;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9330(String str, int i, long j, String str2, String str3, Field field) {
        super(str, i, j, str2, str3, Date.class, Date.class, field, null);
        this.f23967 = 0;
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Object mo14554(Object obj) {
        switch (this.f23967) {
            case 1:
                try {
                    return this.f23948.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    C3775.m6961("invoke getter method error, ", this.f23963, e);
                    return null;
                }
            case 2:
                try {
                    return this.f23948.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    C3775.m6961("invoke getter method error, ", this.f23963, e2);
                    return null;
                }
            default:
                return super.mo14554(obj);
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo14557(AbstractC3730 abstractC3730, Object obj) {
        switch (this.f23967) {
            case 0:
                Date date = (Date) mo14554(obj);
                if (date != null) {
                    m14639(abstractC3730, date.getTime());
                } else {
                    abstractC3730.mo6527();
                }
                break;
            case 1:
                Date date2 = (Date) mo14554(obj);
                if (date2 != null) {
                    m14639(abstractC3730, date2.getTime());
                } else {
                    abstractC3730.mo6527();
                }
                break;
            default:
                m14639(abstractC3730, ((Long) mo14554(obj)).longValue());
                break;
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo14558(AbstractC3730 abstractC3730, Object obj) {
        int i = this.f23967;
        long j = this.f23956;
        switch (i) {
            case 0:
                Date date = (Date) mo14554(obj);
                if (date != null) {
                    m14643(abstractC3730, date.getTime());
                } else {
                    if (((j | abstractC3730.f9523.f9498) & JSONWriter$Feature.WriteNulls.mask) == 0) {
                        return false;
                    }
                    m14637(abstractC3730);
                    abstractC3730.mo6527();
                }
                return true;
            case 1:
                Date date2 = (Date) mo14554(obj);
                if (date2 != null) {
                    m14643(abstractC3730, date2.getTime());
                } else {
                    if (((j | abstractC3730.f9523.f9498) & JSONWriter$Feature.WriteNulls.mask) == 0) {
                        return false;
                    }
                    m14637(abstractC3730);
                    abstractC3730.mo6527();
                }
                return true;
            default:
                m14643(abstractC3730, ((Long) mo14554(obj)).longValue());
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9330(String str, int i, long j, String str2, String str3, Class cls, Class cls2, Field field, Method method, int i2) {
        super(str, i, j, str2, str3, cls, cls2, field, method);
        this.f23967 = i2;
    }
}
