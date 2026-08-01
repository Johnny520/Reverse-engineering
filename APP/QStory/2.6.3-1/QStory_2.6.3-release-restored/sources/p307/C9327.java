package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3775;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9327 extends AbstractC9329 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final /* synthetic */ int f23965;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9327(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, int i2) {
        super(str, i, j, str2, locale, str3, type, cls, field, method, 0);
        this.f23965 = i2;
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo14554(Object obj) {
        switch (this.f23965) {
            case 0:
                try {
                    return this.f23948.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    C3775.m6961("invoke getter method error, ", this.f23963, e);
                    return null;
                }
            default:
                throw null;
        }
    }

    @Override // p307.AbstractC9329, p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo14557(AbstractC3730 abstractC3730, Object obj) {
        switch (this.f23965) {
            case 1:
                throw null;
            default:
                super.mo14557(abstractC3730, obj);
                return;
        }
    }

    @Override // p307.AbstractC9329, p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public boolean mo14558(AbstractC3730 abstractC3730, Object obj) {
        switch (this.f23965) {
            case 1:
                try {
                    throw null;
                } catch (RuntimeException e) {
                    if (abstractC3730.m6635()) {
                        return false;
                    }
                    throw e;
                }
            default:
                return super.mo14558(abstractC3730, obj);
        }
    }
}
