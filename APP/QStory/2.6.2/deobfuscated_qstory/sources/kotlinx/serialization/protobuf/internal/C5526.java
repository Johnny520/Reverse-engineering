package kotlinx.serialization.protobuf.internal;

import com.bumptech.glide.AbstractC3064;
import io.ktor.client.plugins.AbstractC3932;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import kotlinx.serialization.SerializationException;
import p090.InterfaceC7188;
import p091.C7192;
import p091.C7197;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5526 extends C5520 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f15274;

    @Override // kotlinx.serialization.protobuf.internal.C5520, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7188 mo6876(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        AbstractC4921 kind = interfaceC7190.getKind();
        if (!AbstractC4394.m8917(kind, C7197.f19213) && !AbstractC4394.m8917(kind, C7197.f19214) && !(kind instanceof C7192)) {
            throw new SerializationException("Type " + interfaceC7190.getKind() + " cannot be directly child of oneof element");
        }
        long jM4255 = m4255();
        if (jM4255 == 19500 && AbstractC4394.m8917(this.f15257, interfaceC7190)) {
            return this;
        }
        if (AbstractC3064.m6778(jM4255)) {
            throw new SerializationException("An oneof element cannot be directly child of another oneof element");
        }
        return new C5520(this.f15263, AbstractC3932.m8307(this.f15258, jM4255), interfaceC7190);
    }

    @Override // kotlinx.serialization.protobuf.internal.C5520, p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo10672(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        if (this.f15274) {
            return -1;
        }
        this.f15274 = true;
        return 0;
    }
}
