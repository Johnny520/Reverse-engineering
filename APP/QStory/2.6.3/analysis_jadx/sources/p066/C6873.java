package p066;

import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子哲苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6873 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4481 f18314;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4481 f18315;

    public C6873(InterfaceC4481 interfaceC4481, InterfaceC4481 interfaceC44812) {
        this.f18315 = interfaceC4481;
        this.f18314 = interfaceC44812;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(AbstractC4395.m8907((InterfaceC4499) obj, this.f18315) && AbstractC4395.m8907((InterfaceC4499) obj2, this.f18314));
    }
}
