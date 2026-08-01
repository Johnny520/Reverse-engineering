package kotlinx.serialization.protobuf.internal;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.core.view.C2242;
import com.bumptech.glide.AbstractC3064;
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlinx.serialization.SerializationException;
import net.bytebuddy.pool.TypePool;
import p030.C6308;
import p030.InterfaceC6307;
import p090.InterfaceC7185;
import p090.InterfaceC7187;
import p091.C7192;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5525 extends C5519 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C2242 f15273;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5525(C6308 c6308, C2242 c2242, InterfaceC7190 interfaceC7190) {
        super(c6308, c2242, interfaceC7190);
        c6308.getClass();
        c2242.getClass();
        interfaceC7190.getClass();
        this.f15273 = c2242;
        if (interfaceC7190.getKind() instanceof C7192) {
            return;
        }
        throw new IllegalArgumentException(("The serializer of one of type " + interfaceC7190.mo12355() + " should be using generic polymorphic serializer, but got " + interfaceC7190.getKind() + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH).toString());
    }

    @Override // kotlinx.serialization.protobuf.internal.C5519
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final long mo10702(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        if (i == 0) {
            return 19501L;
        }
        if (i == 1) {
            return AbstractC3064.m6767(interfaceC7190, i);
        }
        StringBuilder sbM148 = AbstractC0053.m148(i, "Unsupported index: ", " in a oneOf type ");
        sbM148.append(interfaceC7190.mo12355());
        sbM148.append(", which should be using generic polymorphic serializer");
        throw new SerializationException(sbM148.toString());
    }

    @Override // kotlinx.serialization.protobuf.internal.C5519, p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7187 mo6800(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        if (interfaceC7190.equals(this.f15254)) {
            return this;
        }
        C6308 c6308 = this.f15253;
        c6308.getClass();
        C2242 c2242 = this.f15273;
        c2242.getClass();
        C5511 c5511 = new C5511(c6308, c2242, interfaceC7190);
        if (interfaceC7190.mo12353() != 1) {
            C4210.m8610(interfaceC7190.mo12353(), interfaceC7190.mo12355(), " should contain only 1 element, but get ", "Implementation of oneOf type ");
            return null;
        }
        List listMo12357 = interfaceC7190.mo12357(0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo12357) {
            if (obj instanceof InterfaceC6307) {
                arrayList.add(obj);
            }
        }
        if (((InterfaceC6307) AbstractC4343.m8815(arrayList)) != null) {
            return c5511;
        }
        C0276.m848(interfaceC7190.mo12355(), "Implementation of oneOf type ", " should have @ProtoNumber annotation");
        return null;
    }

    @Override // kotlinx.serialization.protobuf.internal.C5519, p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final InterfaceC7185 mo6808(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        int i = this.f6620;
        if (i < 0) {
            throw new SerializationException("No tag in stack for requested element");
        }
        long[] jArr = (long[]) this.f6619;
        this.f6620 = i - 1;
        m4256((jArr[i] & 1152921500311879680L) | ((long) ((int) (AbstractC3064.m6767(interfaceC7190, 0) & 2147483647L))));
        return this;
    }

    @Override // kotlinx.serialization.protobuf.internal.C5519
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final void mo10715(long j, String str) {
        str.getClass();
        if (j != 19501) {
            super.mo10715(j, str);
        }
    }
}
