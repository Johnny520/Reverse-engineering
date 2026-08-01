package p291;

import com.alibaba.fastjson2.AbstractC2896;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Function;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8437 extends AbstractC8441 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final Object f23346;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final /* synthetic */ int f23347 = 0;

    public C8437(String str, int i, long j, String str2, String str3, Field field, Method method, Function function) {
        super(str, i, j, str2, str3, Long.class, field, method);
        this.f23346 = function;
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Function mo13981() {
        switch (this.f23347) {
            case 0:
                return (Function) this.f23346;
            default:
                return super.mo13981();
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13976(Object obj) {
        int i = this.f23347;
        Object obj2 = this.f23346;
        switch (i) {
            case 0:
                return ((Function) obj2).apply(obj);
            default:
                return Long.valueOf(((ToLongFunction) obj2).applyAsLong(obj));
        }
    }

    @Override // p291.AbstractC8441, p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo13979(AbstractC2896 abstractC2896, Object obj) {
        switch (this.f23347) {
            case 1:
                abstractC2896.mo5918(((ToLongFunction) this.f23346).applyAsLong(obj));
                break;
            default:
                super.mo13979(abstractC2896, obj);
                break;
        }
    }

    @Override // p291.AbstractC8441, p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public boolean mo13980(AbstractC2896 abstractC2896, Object obj) {
        switch (this.f23347) {
            case 1:
                try {
                    m13989(abstractC2896, ((ToLongFunction) this.f23346).applyAsLong(obj));
                    return true;
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

    public C8437(String str, int i, long j, String str2, String str3, Field field, Method method, ToLongFunction toLongFunction) {
        super(str, i, j, str2, str3, Long.TYPE, field, method);
        this.f23346 = toLongFunction;
    }
}
