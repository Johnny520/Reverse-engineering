package p087;

import kotlin.Triple;
import kotlin.collections.AbstractC4347;
import kotlin.text.AbstractC5144;
import kotlinx.serialization.SerializationException;
import p009.AbstractC6183;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p090.InterfaceC7189;
import p091.C7190;
import p091.C7195;
import p091.C7198;
import p091.InterfaceC7191;
import top.suzhelan.qstory.hook.item.C5925;
import top.yukonga.miuix.kmp.utils.C6057;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7131 implements InterfaceC7184 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7190 f19079;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7184 f19080;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7184 f19081;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7184 f19082;

    public C7131(InterfaceC7184 interfaceC7184, InterfaceC7184 interfaceC71842, InterfaceC7184 interfaceC71843) {
        C7190 c7190;
        interfaceC7184.getClass();
        interfaceC71842.getClass();
        interfaceC71843.getClass();
        this.f19082 = interfaceC7184;
        this.f19081 = interfaceC71842;
        this.f19080 = interfaceC71843;
        InterfaceC7191[] interfaceC7191Arr = new InterfaceC7191[0];
        C6057 c6057 = new C6057(this, 3);
        if (AbstractC5144.m10172("kotlin.Triple")) {
            C5925.m11310("Blank serial names are prohibited");
            c7190 = null;
        } else {
            C7195 c7195 = new C7195("kotlin.Triple");
            c6057.invoke(c7195);
            c7190 = new C7190("kotlin.Triple", C7198.f19209, c7195.f19201.size(), AbstractC4347.m8846(interfaceC7191Arr), c7195);
        }
        this.f19079 = c7190;
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        C7190 c7190 = this.f19079;
        InterfaceC7189 interfaceC7189Mo10676 = interfaceC7187.mo10676(c7190);
        interfaceC7189Mo10676.getClass();
        Object obj = AbstractC7144.f19102;
        Object objMo10674 = obj;
        Object objMo106742 = objMo10674;
        Object objMo106743 = objMo106742;
        while (true) {
            int iMo10718 = interfaceC7189Mo10676.mo10718(c7190);
            if (iMo10718 == -1) {
                interfaceC7189Mo10676.mo10678(c7190);
                if (objMo10674 == obj) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objMo106742 == obj) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objMo106743 != obj) {
                    return new Triple(objMo10674, objMo106742, objMo106743);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iMo10718 == 0) {
                objMo10674 = interfaceC7189Mo10676.mo10674(c7190, 0, this.f19082, null);
            } else if (iMo10718 == 1) {
                objMo106742 = interfaceC7189Mo10676.mo10674(c7190, 1, this.f19081, null);
            } else {
                if (iMo10718 != 2) {
                    throw new SerializationException(AbstractC6183.m11588(iMo10718, "Unexpected index "));
                }
                objMo106743 = interfaceC7189Mo10676.mo10674(c7190, 2, this.f19080, null);
            }
        }
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return this.f19079;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        Triple triple = (Triple) obj;
        triple.getClass();
        C7190 c7190 = this.f19079;
        InterfaceC7188 interfaceC7188Mo10710 = interfaceC7186.mo10710(c7190);
        interfaceC7188Mo10710.mo10719(c7190, 0, this.f19082, triple.getFirst());
        interfaceC7188Mo10710.mo10719(c7190, 1, this.f19081, triple.getSecond());
        interfaceC7188Mo10710.mo10719(c7190, 2, this.f19080, triple.getThird());
        interfaceC7188Mo10710.mo10711(c7190);
    }
}
