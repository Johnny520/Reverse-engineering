package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import kotlin.collections.AbstractC4347;
import p018.AbstractC6253;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5039 extends AbstractC6253 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Constructor f14525;

    public C5039(Constructor constructor) {
        this.f14525 = constructor;
    }

    @Override // p018.AbstractC6253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final String mo9995() {
        Class<?>[] parameterTypes = this.f14525.getParameterTypes();
        parameterTypes.getClass();
        return AbstractC4347.m8856(parameterTypes, "<init>(", ")V", C5016.f14467, 24);
    }
}
