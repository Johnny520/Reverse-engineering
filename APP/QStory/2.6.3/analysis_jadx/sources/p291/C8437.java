package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2942;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8437 extends AbstractC8500 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final /* synthetic */ int f23350;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8437(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, int i2) {
        super(str, i, j, str2, locale, str3, type, cls, field, method, 1);
        this.f23350 = i2;
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13995(Object obj) {
        switch (this.f23350) {
            case 0:
                try {
                    return this.f23603.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    C2942.m6401("invoke getter method error, ", this.f23618, e);
                    return null;
                }
            default:
                throw null;
        }
    }

    @Override // p291.AbstractC8500, p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo13998(AbstractC2897 abstractC2897, Object obj) {
        switch (this.f23350) {
            case 1:
                throw null;
            default:
                super.mo13998(abstractC2897, obj);
                return;
        }
    }

    @Override // p291.AbstractC8500, p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public boolean mo13999(AbstractC2897 abstractC2897, Object obj) {
        switch (this.f23350) {
            case 1:
                try {
                    throw null;
                } catch (RuntimeException e) {
                    if (abstractC2897.m6075()) {
                        return false;
                    }
                    throw e;
                }
            default:
                return super.mo13999(abstractC2897, obj);
        }
    }
}
