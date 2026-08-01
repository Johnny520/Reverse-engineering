package p291;

import com.alibaba.fastjson2.AbstractC2896;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8440 extends AbstractC8441 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final Object f23348;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final /* synthetic */ int f23349 = 0;

    public C8440(String str, int i, long j, String str2, String str3, Field field, Method method, Function function) {
        super(str, i, j, str2, str3, Integer.class, Integer.class, field, method);
        this.f23348 = function;
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Function mo13981() {
        switch (this.f23349) {
            case 0:
                return (Function) this.f23348;
            default:
                return super.mo13981();
        }
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13976(Object obj) {
        int i = this.f23349;
        Object obj2 = this.f23348;
        switch (i) {
            case 0:
                return ((Function) obj2).apply(obj);
            default:
                return Integer.valueOf(((ToIntFunction) obj2).applyAsInt(obj));
        }
    }

    @Override // p291.AbstractC8441, p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo13979(AbstractC2896 abstractC2896, Object obj) {
        switch (this.f23349) {
            case 1:
                abstractC2896.mo5928(((ToIntFunction) this.f23348).applyAsInt(obj));
                break;
            default:
                super.mo13979(abstractC2896, obj);
                break;
        }
    }

    @Override // p291.AbstractC8441, p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public boolean mo13980(AbstractC2896 abstractC2896, Object obj) {
        switch (this.f23349) {
            case 1:
                try {
                    m13988(abstractC2896, ((ToIntFunction) this.f23348).applyAsInt(obj));
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

    /* JADX WARN: Illegal instructions before constructor call */
    public C8440(String str, int i, long j, String str2, String str3, Field field, Method method, ToIntFunction toIntFunction) {
        Class cls = Integer.TYPE;
        super(str, i, j, str2, str3, cls, cls, field, method);
        this.f23348 = toIntFunction;
    }
}
