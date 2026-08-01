package p291;

import com.alibaba.fastjson2.AbstractC2897;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Function;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8429 extends AbstractC8433 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final Object f23337;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final /* synthetic */ int f23338 = 0;

    public C8429(String str, int i, long j, String str2, String str3, Field field, Method method, Function function) {
        super(str, i, j, str2, str3, Long.class, field, method);
        this.f23337 = function;
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Function mo14000() {
        switch (this.f23338) {
            case 0:
                return (Function) this.f23337;
            default:
                return super.mo14000();
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13995(Object obj) {
        int i = this.f23338;
        Object obj2 = this.f23337;
        switch (i) {
            case 0:
                return ((Function) obj2).apply(obj);
            default:
                return Long.valueOf(((ToLongFunction) obj2).applyAsLong(obj));
        }
    }

    @Override // p291.AbstractC8433, p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo13998(AbstractC2897 abstractC2897, Object obj) {
        switch (this.f23338) {
            case 1:
                abstractC2897.mo5963(((ToLongFunction) this.f23337).applyAsLong(obj));
                break;
            default:
                super.mo13998(abstractC2897, obj);
                break;
        }
    }

    @Override // p291.AbstractC8433, p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public boolean mo13999(AbstractC2897 abstractC2897, Object obj) {
        switch (this.f23338) {
            case 1:
                try {
                    m14008(abstractC2897, ((ToLongFunction) this.f23337).applyAsLong(obj));
                    return true;
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

    public C8429(String str, int i, long j, String str2, String str3, Field field, Method method, ToLongFunction toLongFunction) {
        super(str, i, j, str2, str3, Long.TYPE, field, method);
        this.f23337 = toLongFunction;
    }
}
