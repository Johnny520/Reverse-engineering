package p291;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Predicate;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8515 extends AbstractC8497 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final Predicate f23647;

    public C8515(String str, int i, long j, String str2, String str3, Field field, Method method, Predicate predicate) {
        super(str, i, j, str2, str3, Boolean.class, Boolean.class, field, method);
        this.f23647 = predicate;
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13976(Object obj) {
        return Boolean.valueOf(this.f23647.test(obj));
    }
}
