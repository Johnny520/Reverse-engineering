package p291;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8531 extends AbstractC8418 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final Function f23768;

    public C8531(int i, long j, Class cls, String str, String str2, String str3, Field field, Method method, Type type, Function function) {
        super(str, i, j, str2, str3, type, cls, field, method);
        this.f23768 = function;
        if (cls == AtomicIntegerArray.class || cls == AtomicLongArray.class || cls == AtomicReferenceArray.class) {
            return;
        }
        cls.isArray();
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13995(Object obj) {
        return this.f23768.apply(obj);
    }
}
