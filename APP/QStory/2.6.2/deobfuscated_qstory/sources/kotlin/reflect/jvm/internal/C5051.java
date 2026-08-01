package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4430;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4610;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5051 extends AbstractC8189 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Field f14582;

    public C5051(Field field) {
        this.f14582 = field;
    }

    @Override // p253.AbstractC8189
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final String mo10004() {
        StringBuilder sb = new StringBuilder();
        Field field = this.f14582;
        String name = field.getName();
        name.getClass();
        sb.append(AbstractC4610.m9240(name));
        sb.append("()");
        Class<?> type = field.getType();
        type.getClass();
        sb.append(AbstractC4430.m8986(type));
        return sb.toString();
    }
}
