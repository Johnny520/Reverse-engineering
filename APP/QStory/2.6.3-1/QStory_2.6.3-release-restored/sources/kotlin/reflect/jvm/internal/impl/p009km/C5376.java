package kotlin.reflect.jvm.internal.impl.p009km;

import kotlin.Pair;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5376 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C5376 f13597 = new C5376();

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        Pair pair = (Pair) obj;
        pair.getClass();
        return ((String) pair.component1()) + " = " + ((AbstractC5380) pair.component2());
    }
}
