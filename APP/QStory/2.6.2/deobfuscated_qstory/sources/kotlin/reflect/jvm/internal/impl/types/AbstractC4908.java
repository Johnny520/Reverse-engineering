package kotlin.reflect.jvm.internal.impl.types;

import androidx.compose.foundation.text.C1012;
import androidx.compose.runtime.C1322;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C4460;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.storage.C4837;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import p066.AbstractC6869;
import p098.C7239;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4908 implements InterfaceC4872 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4837 f14229;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f14230;

    public AbstractC4908(C4844 c4844) {
        c4844.getClass();
        this.f14229 = new C4837(c4844, new C1322(this, 7), new C1012(this, 16));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof InterfaceC4872) && obj.hashCode() == hashCode()) {
            InterfaceC4872 interfaceC4872 = (InterfaceC4872) obj;
            if (interfaceC4872.getParameters().size() == getParameters().size()) {
                InterfaceC4476 interfaceC4476Mo9221 = mo9221();
                InterfaceC4476 interfaceC4476Mo92212 = interfaceC4872.mo9221();
                if (interfaceC4476Mo92212 == null || C7239.m12440(interfaceC4476Mo9221) || AbstractC6869.m12080(interfaceC4476Mo9221) || C7239.m12440(interfaceC4476Mo92212) || AbstractC6869.m12080(interfaceC4476Mo92212)) {
                    return false;
                }
                return mo9837(interfaceC4476Mo92212);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f14230;
        if (i != 0) {
            return i;
        }
        InterfaceC4476 interfaceC4476Mo9221 = mo9221();
        int iIdentityHashCode = (C7239.m12440(interfaceC4476Mo9221) || AbstractC6869.m12080(interfaceC4476Mo9221)) ? System.identityHashCode(this) : AbstractC6869.m12073(interfaceC4476Mo9221).f13689.hashCode();
        this.f14230 = iIdentityHashCode;
        return iIdentityHashCode;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public abstract boolean mo9837(InterfaceC4476 interfaceC4476);

    @Override // kotlin.reflect.jvm.internal.impl.types.InterfaceC4872
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final List mo9504() {
        return ((C4889) this.f14229.invoke()).f14205;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract C4460 mo9219();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract AbstractC4881 mo9838();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract Collection mo9220();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public List mo9846(List list) {
        list.getClass();
        return list;
    }
}
