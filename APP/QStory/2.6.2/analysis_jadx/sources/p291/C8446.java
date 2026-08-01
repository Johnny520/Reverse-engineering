package p291;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Function;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8446 extends AbstractC8508 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final Function f23360;

    public C8446(String str, int i, long j, String str2, String str3, Field field, Method method, Function function) {
        super(str, i, j, str2, null, str3, Byte.class, Byte.class, field, method, 1);
        this.f23360 = function;
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Function mo13981() {
        return this.f23360;
    }

    @Override // p291.AbstractC8502
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo13976(Object obj) {
        return this.f23360.apply(obj);
    }
}
