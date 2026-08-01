package p307;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9361 extends C9250 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final Function f24114;

    public C9361(int i, long j, Class cls, String str, String str2, String str3, Field field, Method method, Type type, Function function) {
        super(str, i, j, str2, null, str3, type, cls, field, method);
        this.f24114 = function;
        if (cls == AtomicIntegerArray.class || cls == AtomicLongArray.class || cls == AtomicReferenceArray.class) {
            return;
        }
        cls.isArray();
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Function mo14559() {
        return this.f24114;
    }

    @Override // p307.AbstractC9323
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo14554(Object obj) {
        return this.f24114.apply(obj);
    }
}
