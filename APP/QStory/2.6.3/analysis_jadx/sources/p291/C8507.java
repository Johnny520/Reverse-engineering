package p291;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Predicate;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8507 extends AbstractC8489 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final Predicate f23638;

    public C8507(String str, int i, long j, String str2, String str3, Field field, Method method, Predicate predicate) {
        super(str, i, j, str2, str3, Boolean.class, Boolean.class, field, method);
        this.f23638 = predicate;
    }

    @Override // p291.AbstractC8494
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13995(Object obj) {
        return Boolean.valueOf(this.f23638.test(obj));
    }
}
