package p087;

import kotlin.Triple;
import kotlin.collections.AbstractC4346;
import kotlin.text.AbstractC5143;
import kotlinx.serialization.SerializationException;
import p007.AbstractC6136;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p090.InterfaceC7188;
import p091.C7189;
import p091.C7194;
import p091.C7197;
import p091.InterfaceC7190;
import top.suzhelan.qstory.hook.item.C5919;
import top.yukonga.miuix.kmp.utils.C6051;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7130 implements InterfaceC7183 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7189 f19084;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7183 f19085;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7183 f19086;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7183 f19087;

    public C7130(InterfaceC7183 interfaceC7183, InterfaceC7183 interfaceC71832, InterfaceC7183 interfaceC71833) {
        C7189 c7189;
        interfaceC7183.getClass();
        interfaceC71832.getClass();
        interfaceC71833.getClass();
        this.f19087 = interfaceC7183;
        this.f19086 = interfaceC71832;
        this.f19085 = interfaceC71833;
        InterfaceC7190[] interfaceC7190Arr = new InterfaceC7190[0];
        C6051 c6051 = new C6051(this, 3);
        if (AbstractC5143.m10164("kotlin.Triple")) {
            C5919.m11249("Blank serial names are prohibited");
            c7189 = null;
        } else {
            C7194 c7194 = new C7194("kotlin.Triple");
            c6051.invoke(c7194);
            c7189 = new C7189("kotlin.Triple", C7197.f19213, c7194.f19206.size(), AbstractC4346.m8850(interfaceC7190Arr), c7194);
        }
        this.f19084 = c7189;
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        C7189 c7189 = this.f19084;
        InterfaceC7188 interfaceC7188Mo6876 = interfaceC7186.mo6876(c7189);
        interfaceC7188Mo6876.getClass();
        Object obj = AbstractC7143.f19107;
        Object objMo6874 = obj;
        Object objMo68742 = objMo6874;
        Object objMo68743 = objMo68742;
        while (true) {
            int iMo10672 = interfaceC7188Mo6876.mo10672(c7189);
            if (iMo10672 == -1) {
                interfaceC7188Mo6876.mo6877(c7189);
                if (objMo6874 == obj) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objMo68742 == obj) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objMo68743 != obj) {
                    return new Triple(objMo6874, objMo68742, objMo68743);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iMo10672 == 0) {
                objMo6874 = interfaceC7188Mo6876.mo6874(c7189, 0, this.f19087, null);
            } else if (iMo10672 == 1) {
                objMo68742 = interfaceC7188Mo6876.mo6874(c7189, 1, this.f19086, null);
            } else {
                if (iMo10672 != 2) {
                    throw new SerializationException(AbstractC6136.m11556(iMo10672, "Unexpected index "));
                }
                objMo68743 = interfaceC7188Mo6876.mo6874(c7189, 2, this.f19085, null);
            }
        }
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return this.f19084;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        Triple triple = (Triple) obj;
        triple.getClass();
        C7189 c7189 = this.f19084;
        InterfaceC7187 interfaceC7187Mo6800 = interfaceC7185.mo6800(c7189);
        interfaceC7187Mo6800.mo6791(c7189, 0, this.f19087, triple.getFirst());
        interfaceC7187Mo6800.mo6791(c7189, 1, this.f19086, triple.getSecond());
        interfaceC7187Mo6800.mo6791(c7189, 2, this.f19085, triple.getThird());
        interfaceC7187Mo6800.mo6801(c7189);
    }
}
