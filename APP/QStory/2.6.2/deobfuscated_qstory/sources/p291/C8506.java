package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2941;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8506 extends AbstractC8508 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final /* synthetic */ int f23629;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8506(String str, int i, long j, String str2, Locale locale, String str3, Type type, Class cls, Field field, Method method, int i2) {
        super(str, i, j, str2, locale, str3, type, cls, field, method, 0);
        this.f23629 = i2;
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13976(Object obj) {
        switch (this.f23629) {
            case 0:
                try {
                    return this.f23612.invoke(obj, null);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    C2941.m6343("invoke getter method error, ", this.f23627, e);
                    return null;
                }
            default:
                throw null;
        }
    }

    @Override // p291.AbstractC8508, p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo13979(AbstractC2896 abstractC2896, Object obj) {
        switch (this.f23629) {
            case 1:
                throw null;
            default:
                super.mo13979(abstractC2896, obj);
                return;
        }
    }

    @Override // p291.AbstractC8508, p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public boolean mo13980(AbstractC2896 abstractC2896, Object obj) {
        switch (this.f23629) {
            case 1:
                try {
                    throw null;
                } catch (RuntimeException e) {
                    if (abstractC2896.m6026()) {
                        return false;
                    }
                    throw e;
                }
            default:
                return super.mo13980(abstractC2896, obj);
        }
    }
}
