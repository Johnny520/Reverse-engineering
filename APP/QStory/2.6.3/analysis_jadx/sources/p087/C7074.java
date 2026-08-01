package p087;

import com.bumptech.glide.AbstractC3057;
import java.util.List;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5093;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7074 implements InterfaceC5087 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC5087 f18980;

    public C7074(InterfaceC5087 interfaceC5087) {
        interfaceC5087.getClass();
        this.f18980 = interfaceC5087;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        C7074 c7074 = obj instanceof C7074 ? (C7074) obj : null;
        InterfaceC5087 interfaceC5087 = c7074 != null ? c7074.f18980 : null;
        InterfaceC5087 interfaceC50872 = this.f18980;
        if (!AbstractC4395.m8907(interfaceC50872, interfaceC5087)) {
            return false;
        }
        InterfaceC5092 interfaceC5092Mo8899 = interfaceC50872.mo8899();
        if (interfaceC5092Mo8899 instanceof InterfaceC5093) {
            InterfaceC5087 interfaceC50873 = obj instanceof InterfaceC5087 ? (InterfaceC5087) obj : null;
            InterfaceC5092 interfaceC5092Mo88992 = interfaceC50873 != null ? interfaceC50873.mo8899() : null;
            if (interfaceC5092Mo88992 != null && (interfaceC5092Mo88992 instanceof InterfaceC5093)) {
                return AbstractC3057.m6756((InterfaceC5093) interfaceC5092Mo8899).equals(AbstractC3057.m6756((InterfaceC5093) interfaceC5092Mo88992));
            }
        }
        return false;
    }

    @Override // kotlin.reflect.InterfaceC5095
    public final List getAnnotations() {
        return this.f18980.getAnnotations();
    }

    public final int hashCode() {
        return this.f18980.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f18980;
    }

    @Override // kotlin.reflect.InterfaceC5087
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo8896() {
        return this.f18980.mo8896();
    }

    @Override // kotlin.reflect.InterfaceC5087
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final List mo8898() {
        return this.f18980.mo8898();
    }

    @Override // kotlin.reflect.InterfaceC5087
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final InterfaceC5092 mo8899() {
        return this.f18980.mo8899();
    }
}
