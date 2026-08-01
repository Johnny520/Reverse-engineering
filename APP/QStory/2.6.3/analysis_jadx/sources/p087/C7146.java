package p087;

import androidx.activity.compose.C0004;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlinx.serialization.SerializationException;
import p009.AbstractC6183;
import p056.InterfaceC6582;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7189;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7146 implements InterfaceC7184 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC5184 f19107;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f19108;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f19109;

    public C7146(String str, Object obj) {
        obj.getClass();
        this.f19109 = obj;
        this.f19108 = EmptyList.INSTANCE;
        this.f19107 = AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C0004(str, 17, this));
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        InterfaceC7191 descriptor = getDescriptor();
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(descriptor);
        interfaceC7189Mo10676.getClass();
        int iMo10718 = interfaceC7189Mo10676.mo10718(getDescriptor());
        if (iMo10718 != -1) {
            throw new SerializationException(AbstractC6183.m11588(iMo10718, "Unexpected index "));
        }
        interfaceC7189Mo10676.mo10678(descriptor);
        return this.f19109;
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return (InterfaceC7191) this.f19107.getValue();
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        obj.getClass();
        interfaceC7186.mo10710(getDescriptor()).mo10711(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7146(String str, InterfaceC6582 interfaceC6582, Annotation[] annotationArr) {
        this(str, interfaceC6582);
        interfaceC6582.getClass();
        List listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.f19108 = listAsList;
    }
}
