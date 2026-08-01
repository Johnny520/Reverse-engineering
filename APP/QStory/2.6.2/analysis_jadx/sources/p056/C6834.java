package p056;

import io.ktor.util.C4210;
import kotlin.collections.AbstractC4346;
import kotlin.text.AbstractC5143;
import kotlinx.serialization.json.JsonDecodingException;
import p088.AbstractC7147;
import p088.AbstractC7167;
import p088.AbstractC7175;
import p088.InterfaceC7168;
import p088.InterfaceC7177;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7186;
import p091.C7189;
import p091.C7194;
import p091.C7197;
import p091.InterfaceC7190;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪苏兰哲世子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6834 implements InterfaceC7183 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7189 f18281;

    public C6834() {
        InterfaceC7190[] interfaceC7190Arr = new InterfaceC7190[0];
        if (AbstractC5143.m10164("RequestId")) {
            C5919.m11249("Blank serial names are prohibited");
            throw null;
        }
        C7194 c7194 = new C7194("RequestId");
        this.f18281 = new C7189("RequestId", C7197.f19213, c7194.f19206.size(), AbstractC4346.m8850(interfaceC7190Arr), c7194);
    }

    @Override // p089.InterfaceC7183
    public final Object deserialize(InterfaceC7186 interfaceC7186) {
        Long lValueOf;
        InterfaceC7177 interfaceC7177 = interfaceC7186 instanceof InterfaceC7177 ? (InterfaceC7177) interfaceC7186 : null;
        if (interfaceC7177 == null) {
            C5919.m11250("Can only deserialize JSON");
            return null;
        }
        AbstractC7175 abstractC7175Mo10655 = interfaceC7177.mo10655();
        if (!(abstractC7175Mo10655 instanceof AbstractC7147)) {
            C5919.m11250("Invalid RequestId format");
            return null;
        }
        AbstractC7147 abstractC7147 = (AbstractC7147) abstractC7175Mo10655;
        if (abstractC7147.mo12395()) {
            return new C6832(abstractC7147.mo12396());
        }
        try {
            lValueOf = Long.valueOf(AbstractC7167.m12407(abstractC7147));
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            C5919.m11250("Invalid RequestId type");
            return null;
        }
        try {
            return new C6836(AbstractC7167.m12407(abstractC7147));
        } catch (JsonDecodingException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    @Override // p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        return this.f18281;
    }

    @Override // p089.InterfaceC7183
    public final void serialize(InterfaceC7185 interfaceC7185, Object obj) {
        InterfaceC6835 interfaceC6835 = (InterfaceC6835) obj;
        interfaceC6835.getClass();
        InterfaceC7168 interfaceC7168 = interfaceC7185 instanceof InterfaceC7168 ? (InterfaceC7168) interfaceC7185 : null;
        if (interfaceC7168 == null) {
            C5919.m11250("Can only serialize JSON");
            return;
        }
        if (interfaceC6835 instanceof C6832) {
            interfaceC7168.mo6813(((C6832) interfaceC6835).f18280);
        } else if (interfaceC6835 instanceof C6836) {
            interfaceC7168.mo6817(((C6836) interfaceC6835).f18282);
        } else {
            C4210.m8621();
        }
    }
}
