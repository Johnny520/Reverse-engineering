package p103;

import com.bumptech.glide.AbstractC3889;
import java.util.List;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5924;
import kotlin.reflect.InterfaceC5925;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7903 implements InterfaceC5919 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5919 f19325;

    public C7903(InterfaceC5919 interfaceC5919) {
        interfaceC5919.getClass();
        this.f19325 = interfaceC5919;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C7903 c7903 = obj instanceof C7903 ? (C7903) obj : null;
        InterfaceC5919 interfaceC5919 = c7903 != null ? c7903.f19325 : null;
        InterfaceC5919 interfaceC59192 = this.f19325;
        if (!AbstractC5227.m9466(interfaceC59192, interfaceC5919)) {
            return false;
        }
        InterfaceC5924 interfaceC5924Mo9458 = interfaceC59192.mo9458();
        if (interfaceC5924Mo9458 instanceof InterfaceC5925) {
            InterfaceC5919 interfaceC59193 = obj instanceof InterfaceC5919 ? (InterfaceC5919) obj : null;
            InterfaceC5924 interfaceC5924Mo94582 = interfaceC59193 != null ? interfaceC59193.mo9458() : null;
            if (interfaceC5924Mo94582 != null && (interfaceC5924Mo94582 instanceof InterfaceC5925)) {
                return AbstractC3889.m7316((InterfaceC5925) interfaceC5924Mo9458).equals(AbstractC3889.m7316((InterfaceC5925) interfaceC5924Mo94582));
            }
        }
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5927
    public final List getAnnotations() {
        return this.f19325.getAnnotations();
    }

    public final int hashCode() {
        return this.f19325.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f19325;
    }

    @Override // kotlin.reflect.InterfaceC5919
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo9455() {
        return this.f19325.mo9455();
    }

    @Override // kotlin.reflect.InterfaceC5919
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final List mo9457() {
        return this.f19325.mo9457();
    }

    @Override // kotlin.reflect.InterfaceC5919
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final InterfaceC5924 mo9458() {
        return this.f19325.mo9458();
    }
}
