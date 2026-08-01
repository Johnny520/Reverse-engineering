package kotlin.reflect.jvm.internal.impl.load.kotlin;

import net.bytebuddy.pool.TypePool;
import p009.AbstractC6183;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4640 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C4640 f13566 = new C4640();

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        return str.length() > 1 ? AbstractC6183.m11590(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER, "L", str) : str;
    }
}
