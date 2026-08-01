package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5263;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5443;
import p050.AbstractC7173;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5884 extends AbstractC7173 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Field f14929;

    public C5884(Field field) {
        this.f14929 = field;
    }

    @Override // p050.AbstractC7173
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final String mo10560() {
        StringBuilder sb = new StringBuilder();
        Field field = this.f14929;
        String name = field.getName();
        name.getClass();
        sb.append(AbstractC5443.m9789(name));
        sb.append("()");
        Class<?> type = field.getType();
        type.getClass();
        sb.append(AbstractC5263.m9535(type));
        return sb.toString();
    }
}
