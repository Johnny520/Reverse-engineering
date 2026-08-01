package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.reflect.jvm.internal.impl.name.C4690;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4590 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4589 f13387;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13388;

    public /* synthetic */ C4590(C4589 c4589, int i) {
        this.f13388 = i;
        this.f13387 = c4589;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f13388;
        C4589 c4589 = this.f13387;
        C4690 c4690 = (C4690) obj;
        switch (i) {
            case 0:
                c4690.getClass();
                return c4589.m9208(c4690);
            default:
                c4690.getClass();
                return c4589.m9206(c4690);
        }
    }
}
