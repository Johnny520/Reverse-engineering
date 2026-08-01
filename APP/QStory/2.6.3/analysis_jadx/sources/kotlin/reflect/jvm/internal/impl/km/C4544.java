package kotlin.reflect.jvm.internal.impl.km;

import kotlin.Pair;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4544 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C4544 f13252 = new C4544();

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        Pair pair = (Pair) obj;
        pair.getClass();
        return ((String) pair.component1()) + " = " + ((AbstractC4548) pair.component2());
    }
}
