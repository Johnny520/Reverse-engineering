package p291;

import com.alibaba.fastjson2.AbstractC2897;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8432 extends AbstractC8433 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final Object f23339;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final /* synthetic */ int f23340 = 0;

    public C8432(String str, int i, long j, String str2, String str3, Field field, Method method, Function function) {
        super(str, i, j, str2, str3, Integer.class, Integer.class, field, method);
        this.f23339 = function;
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public Function mo14000() {
        switch (this.f23340) {
            case 0:
                return (Function) this.f23339;
            default:
                return super.mo14000();
        }
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13995(Object obj) {
        int i = this.f23340;
        Object obj2 = this.f23339;
        switch (i) {
            case 0:
                return ((Function) obj2).apply(obj);
            default:
                return Integer.valueOf(((ToIntFunction) obj2).applyAsInt(obj));
        }
    }

    @Override // p291.AbstractC8433, p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public void mo13998(AbstractC2897 abstractC2897, Object obj) {
        switch (this.f23340) {
            case 1:
                abstractC2897.mo5973(((ToIntFunction) this.f23339).applyAsInt(obj));
                break;
            default:
                super.mo13998(abstractC2897, obj);
                break;
        }
    }

    @Override // p291.AbstractC8433, p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public boolean mo13999(AbstractC2897 abstractC2897, Object obj) {
        switch (this.f23340) {
            case 1:
                try {
                    m14007(abstractC2897, ((ToIntFunction) this.f23339).applyAsInt(obj));
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

    /* JADX WARN: Illegal instructions before constructor call */
    public C8432(String str, int i, long j, String str2, String str3, Field field, Method method, ToIntFunction toIntFunction) {
        Class cls = Integer.TYPE;
        super(str, i, j, str2, str3, cls, cls, field, method);
        this.f23339 = toIntFunction;
    }
}
