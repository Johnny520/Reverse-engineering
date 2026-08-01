package p082;

import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子哲苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7702 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5313 f18659;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5313 f18660;

    public C7702(InterfaceC5313 interfaceC5313, InterfaceC5313 interfaceC53132) {
        this.f18660 = interfaceC5313;
        this.f18659 = interfaceC53132;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(AbstractC5227.m9466((InterfaceC5331) obj, this.f18660) && AbstractC5227.m9466((InterfaceC5331) obj2, this.f18659));
    }
}
