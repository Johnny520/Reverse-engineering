package kotlin.reflect.jvm.internal.impl.load.kotlin;

import net.bytebuddy.pool.TypePool;
import p025.AbstractC7012;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5472 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C5472 f13911 = new C5472();

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        return str.length() > 1 ? AbstractC7012.m12149(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER, "L", str) : str;
    }
}
