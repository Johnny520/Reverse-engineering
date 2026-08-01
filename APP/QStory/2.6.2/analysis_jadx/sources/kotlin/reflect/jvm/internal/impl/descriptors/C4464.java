package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.name.C4686;
import p046.InterfaceC6480;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4464 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4686 f13088;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13089;

    public /* synthetic */ C4464(C4686 c4686, int i) {
        this.f13089 = i;
        this.f13088 = c4686;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f13089;
        C4686 c4686 = this.f13088;
        switch (i) {
            case 0:
                C4686 c46862 = (C4686) obj;
                c46862.getClass();
                return Boolean.valueOf(!c46862.f13692.m9324() && c46862.m9330().equals(c4686));
            default:
                InterfaceC6480 interfaceC6480 = (InterfaceC6480) obj;
                interfaceC6480.getClass();
                return interfaceC6480.mo9527(c4686);
        }
    }
}
