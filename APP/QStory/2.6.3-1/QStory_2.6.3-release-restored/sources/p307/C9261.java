package p307;

import com.alibaba.fastjson2.AbstractC3730;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9261 extends AbstractC9262 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final Object f23684;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final /* synthetic */ int f23685 = 0;

    public C9261(String str, int i, long j, String str2, String str3, Field field, Method method, Function function) {
        super(str, i, j, str2, str3, Integer.class, Integer.class, field, method);
        this.f23684 = function;
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Function mo14559() {
        switch (this.f23685) {
            case 0:
                return (Function) this.f23684;
            default:
                return super.mo14559();
        }
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo14554(Object obj) {
        int i = this.f23685;
        Object obj2 = this.f23684;
        switch (i) {
            case 0:
                return ((Function) obj2).apply(obj);
            default:
                return Integer.valueOf(((ToIntFunction) obj2).applyAsInt(obj));
        }
    }

    @Override // p307.AbstractC9262, p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo14557(AbstractC3730 abstractC3730, Object obj) {
        switch (this.f23685) {
            case 1:
                abstractC3730.mo6533(((ToIntFunction) this.f23684).applyAsInt(obj));
                break;
            default:
                super.mo14557(abstractC3730, obj);
                break;
        }
    }

    @Override // p307.AbstractC9262, p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public boolean mo14558(AbstractC3730 abstractC3730, Object obj) {
        switch (this.f23685) {
            case 1:
                try {
                    m14566(abstractC3730, ((ToIntFunction) this.f23684).applyAsInt(obj));
                    return true;
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

    /* JADX WARN: Illegal instructions before constructor call */
    public C9261(String str, int i, long j, String str2, String str3, Field field, Method method, ToIntFunction toIntFunction) {
        Class cls = Integer.TYPE;
        super(str, i, j, str2, str3, cls, cls, field, method);
        this.f23684 = toIntFunction;
    }
}
