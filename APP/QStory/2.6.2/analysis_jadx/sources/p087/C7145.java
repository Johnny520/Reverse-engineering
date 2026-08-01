package p087;

import androidx.activity.compose.C0004;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlinx.serialization.SerializationException;
import p007.AbstractC6136;
import p056.InterfaceC6581;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p090.InterfaceC7188;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7145 implements InterfaceC7183 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5183 f19112;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f19113;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f19114;

    public C7145(String str, Object obj) {
        obj.getClass();
        this.f19114 = obj;
        this.f19113 = EmptyList.INSTANCE;
        this.f19112 = AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C0004(str, 17, this));
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        InterfaceC7190 descriptor = getDescriptor();
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(descriptor);
        interfaceC7188Mo6876.getClass();
        int iMo10672 = interfaceC7188Mo6876.mo10672(getDescriptor());
        if (iMo10672 != -1) {
            throw new SerializationException(AbstractC6136.m11556(iMo10672, "Unexpected index "));
        }
        interfaceC7188Mo6876.mo6877(descriptor);
        return this.f19114;
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return (InterfaceC7190) this.f19112.getValue();
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        obj.getClass();
        interfaceC7185.mo6800(getDescriptor()).mo6801(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7145(String str, InterfaceC6581 interfaceC6581, Annotation[] annotationArr) {
        this(str, interfaceC6581);
        interfaceC6581.getClass();
        List listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.f19113 = listAsList;
    }
}
