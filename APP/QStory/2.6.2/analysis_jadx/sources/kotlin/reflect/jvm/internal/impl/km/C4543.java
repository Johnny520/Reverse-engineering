package kotlin.reflect.jvm.internal.impl.km;

import kotlin.Pair;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4543 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C4543 f13248 = new C4543();

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        Pair pair = (Pair) obj;
        pair.getClass();
        return ((String) pair.component1()) + " = " + ((AbstractC4547) pair.component2());
    }
}
