package kotlinx.serialization.protobuf.internal;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.window.area.AbstractC2567;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.serialization.SerializationException;
import p090.InterfaceC7189;
import p091.C7193;
import p091.C7198;
import p091.InterfaceC7191;
import p253.AbstractC8190;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5527 extends C5521 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f15274;

    @Override // kotlinx.serialization.protobuf.internal.C5521, p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7189 mo10676(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        AbstractC8190 kind = interfaceC7191.getKind();
        if (!AbstractC4395.m8907(kind, C7198.f19209) && !AbstractC4395.m8907(kind, C7198.f19207) && !(kind instanceof C7193)) {
            throw new SerializationException("Type " + interfaceC7191.getKind() + " cannot be directly child of oneof element");
        }
        long jM4265 = m4265();
        if (jM4265 == 19500 && AbstractC4395.m8907(this.f15257, interfaceC7191)) {
            return this;
        }
        if (AbstractC0455.m1150(jM4265)) {
            throw new SerializationException("An oneof element cannot be directly child of another oneof element");
        }
        return new C5521(this.f15263, AbstractC2567.m5075(this.f15258, jM4265), interfaceC7191);
    }

    @Override // kotlinx.serialization.protobuf.internal.C5521, p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo10718(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        if (this.f15274) {
            return -1;
        }
        this.f15274 = true;
        return 0;
    }
}
