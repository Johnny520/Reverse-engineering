package kotlin.reflect.jvm.internal.impl.load.kotlin;

import net.bytebuddy.pool.TypePool;
import p007.AbstractC6136;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4639 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C4639 f13562 = new C4639();

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        return str.length() > 1 ? AbstractC6136.m11558(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER, "L", str) : str;
    }
}
