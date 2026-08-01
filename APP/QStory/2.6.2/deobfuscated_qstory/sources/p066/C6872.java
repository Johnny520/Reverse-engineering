package p066;

import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子哲苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6872 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4480 f18319;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4480 f18320;

    public C6872(InterfaceC4480 interfaceC4480, InterfaceC4480 interfaceC44802) {
        this.f18320 = interfaceC4480;
        this.f18319 = interfaceC44802;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(AbstractC4394.m8917((InterfaceC4498) obj, this.f18320) && AbstractC4394.m8917((InterfaceC4498) obj2, this.f18319));
    }
}
