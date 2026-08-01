package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2941;
import com.alibaba.fastjson2.JSONWriter$Feature;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8509 extends AbstractC8510 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final /* synthetic */ int f23631;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8509(String str, int i, long j, String str2, String str3, Field field) {
        super(str, i, j, str2, str3, Date.class, Date.class, field, null);
        this.f23631 = 0;
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Object mo13976(Object obj) {
        switch (this.f23631) {
            case 1:
                try {
                    return this.f23612.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    C2941.m6343("invoke getter method error, ", this.f23627, e);
                    return null;
                }
            case 2:
                try {
                    return this.f23612.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    C2941.m6343("invoke getter method error, ", this.f23627, e2);
                    return null;
                }
            default:
                return super.mo13976(obj);
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13979(AbstractC2896 abstractC2896, Object obj) {
        switch (this.f23631) {
            case 0:
                Date date = (Date) mo13976(obj);
                if (date != null) {
                    m14061(abstractC2896, date.getTime());
                } else {
                    abstractC2896.mo5922();
                }
                break;
            case 1:
                Date date2 = (Date) mo13976(obj);
                if (date2 != null) {
                    m14061(abstractC2896, date2.getTime());
                } else {
                    abstractC2896.mo5922();
                }
                break;
            default:
                m14061(abstractC2896, ((Long) mo13976(obj)).longValue());
                break;
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo13980(AbstractC2896 abstractC2896, Object obj) {
        int i = this.f23631;
        long j = this.f23620;
        switch (i) {
            case 0:
                Date date = (Date) mo13976(obj);
                if (date != null) {
                    m14065(abstractC2896, date.getTime());
                } else {
                    if (((j | abstractC2896.f9176.f9151) & JSONWriter$Feature.WriteNulls.mask) == 0) {
                        return false;
                    }
                    m14059(abstractC2896);
                    abstractC2896.mo5922();
                }
                return true;
            case 1:
                Date date2 = (Date) mo13976(obj);
                if (date2 != null) {
                    m14065(abstractC2896, date2.getTime());
                } else {
                    if (((j | abstractC2896.f9176.f9151) & JSONWriter$Feature.WriteNulls.mask) == 0) {
                        return false;
                    }
                    m14059(abstractC2896);
                    abstractC2896.mo5922();
                }
                return true;
            default:
                m14065(abstractC2896, ((Long) mo13976(obj)).longValue());
                return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8509(String str, int i, long j, String str2, String str3, Class cls, Class cls2, Field field, Method method, int i2) {
        super(str, i, j, str2, str3, cls, cls2, field, method);
        this.f23631 = i2;
    }
}
