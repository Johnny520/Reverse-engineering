package kotlinx.serialization.protobuf.internal;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.core.view.C2242;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlinx.serialization.SerializationException;
import net.bytebuddy.pool.TypePool;
import p031.C6327;
import p031.InterfaceC6326;
import p090.InterfaceC7186;
import p090.InterfaceC7188;
import p091.C7193;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: kotlinx.serialization.protobuf.internal.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5526 extends C5520 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C2242 f15273;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5526(C6327 c6327, C2242 c2242, InterfaceC7191 interfaceC7191) {
        super(c6327, c2242, interfaceC7191);
        c6327.getClass();
        c2242.getClass();
        interfaceC7191.getClass();
        this.f15273 = c2242;
        if (interfaceC7191.getKind() instanceof C7193) {
            return;
        }
        throw new IllegalArgumentException(("The serializer of one of type " + interfaceC7191.mo12382() + " should be using generic polymorphic serializer, but got " + interfaceC7191.getKind() + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH).toString());
    }

    @Override // kotlinx.serialization.protobuf.internal.C5520
    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏 */
    public final long mo10759(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        if (i == 0) {
            return 19501L;
        }
        if (i == 1) {
            return AbstractC0455.m1176(interfaceC7191, i);
        }
        StringBuilder sbM150 = AbstractC0053.m150(i, "Unsupported index: ", " in a oneOf type ");
        sbM150.append(interfaceC7191.mo12382());
        sbM150.append(", which should be using generic polymorphic serializer");
        throw new SerializationException(sbM150.toString());
    }

    @Override // kotlinx.serialization.protobuf.internal.C5520, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7188 mo10710(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        if (interfaceC7191.equals(this.f15254)) {
            return this;
        }
        C6327 c6327 = this.f15253;
        c6327.getClass();
        C2242 c2242 = this.f15273;
        c2242.getClass();
        C5512 c5512 = new C5512(c6327, c2242, interfaceC7191);
        if (interfaceC7191.mo12380() != 1) {
            C4211.m8600(interfaceC7191.mo12380(), interfaceC7191.mo12382(), " should contain only 1 element, but get ", "Implementation of oneOf type ");
            return null;
        }
        List listMo12384 = interfaceC7191.mo12384(0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMo12384) {
            if (obj instanceof InterfaceC6326) {
                arrayList.add(obj);
            }
        }
        if (((InterfaceC6326) AbstractC4344.m8781(arrayList)) != null) {
            return c5512;
        }
        C0276.m849(interfaceC7191.mo12382(), "Implementation of oneOf type ", " should have @ProtoNumber annotation");
        return null;
    }

    @Override // kotlinx.serialization.protobuf.internal.C5520, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final InterfaceC7186 mo10716(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        int i = this.f6621;
        if (i < 0) {
            throw new SerializationException("No tag in stack for requested element");
        }
        long[] jArr = (long[]) this.f6620;
        this.f6621 = i - 1;
        m4266((jArr[i] & 1152921500311879680L) | ((long) ((int) (AbstractC0455.m1176(interfaceC7191, 0) & 2147483647L))));
        return this;
    }

    @Override // kotlinx.serialization.protobuf.internal.C5520
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final void mo10772(long j, String str) {
        str.getClass();
        if (j != 19501) {
            super.mo10772(j, str);
        }
    }
}
