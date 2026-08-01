package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import androidx.compose.foundation.text.C1012;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4465;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4474;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4832;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C4776;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C4777;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C4779;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import p049.AbstractC6525;
import p052.InterfaceC6557;
import p077.C6970;
import p079.C6987;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4417 implements InterfaceC4474 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4847 f13009;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C4832 f13010;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6987 f13011;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4844 f13012;

    public C4417(C4844 c4844, C6970 c6970, C6987 c6987) {
        this.f13012 = c4844;
        this.f13011 = c6987;
        this.f13009 = c4844.m9588(new C1012(this, 14));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4777 m8961(C4686 c4686) {
        InputStream inputStreamM9518;
        c4686.getClass();
        C4690 c4690 = AbstractC6525.f17856;
        c4690.getClass();
        if (c4686.f13692.m9327(c4690)) {
            C4779.f13918.getClass();
            inputStreamM9518 = C4776.m9518(C4779.m9521(c4686));
        } else {
            inputStreamM9518 = null;
        }
        if (inputStreamM9518 != null) {
            return AbstractC8189.m13668(c4686, this.f13012, this.f13011, inputStreamM9518);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4474
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo8962(C4686 c4686) {
        c4686.getClass();
        C4847 c4847 = this.f13009;
        return (c4847.m9594(c4686) ? (InterfaceC4465) c4847.invoke(c4686) : m8961(c4686)) == null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4474
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo8963(C4686 c4686, ArrayList arrayList) throws Throwable {
        c4686.getClass();
        Object objInvoke = this.f13009.invoke(c4686);
        if (objInvoke != null) {
            arrayList.add(objInvoke);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4474
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Collection mo8964(C4686 c4686, InterfaceC6557 interfaceC6557) {
        c4686.getClass();
        return EmptySet.INSTANCE;
    }
}
