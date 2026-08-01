package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.name.C4687;
import p046.InterfaceC6481;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4465 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4687 f13092;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13093;

    public /* synthetic */ C4465(C4687 c4687, int i) {
        this.f13093 = i;
        this.f13092 = c4687;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f13093;
        C4687 c4687 = this.f13092;
        switch (i) {
            case 0:
                C4687 c46872 = (C4687) obj;
                c46872.getClass();
                return Boolean.valueOf(!c46872.f13696.m9314() && c46872.m9320().equals(c4687));
            default:
                InterfaceC6481 interfaceC6481 = (InterfaceC6481) obj;
                interfaceC6481.getClass();
                return interfaceC6481.mo9517(c4687);
        }
    }
}
