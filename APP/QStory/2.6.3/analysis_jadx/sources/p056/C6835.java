package p056;

import io.ktor.util.C4211;
import kotlin.collections.AbstractC4347;
import kotlin.text.AbstractC5144;
import kotlinx.serialization.json.JsonDecodingException;
import p088.AbstractC7148;
import p088.AbstractC7168;
import p088.AbstractC7176;
import p088.InterfaceC7169;
import p088.InterfaceC7178;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p091.C7190;
import p091.C7195;
import p091.C7198;
import p091.InterfaceC7191;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪苏兰哲世子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6835 implements InterfaceC7184 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7190 f18276;

    public C6835() {
        InterfaceC7191[] interfaceC7191Arr = new InterfaceC7191[0];
        if (AbstractC5144.m10172("RequestId")) {
            C5925.m11310("Blank serial names are prohibited");
            throw null;
        }
        C7195 c7195 = new C7195("RequestId");
        this.f18276 = new C7190("RequestId", C7198.f19209, c7195.f19201.size(), AbstractC4347.m8846(interfaceC7191Arr), c7195);
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        Long lValueOf;
        InterfaceC7178 interfaceC7178 = interfaceC7187 instanceof InterfaceC7178 ? (InterfaceC7178) interfaceC7187 : null;
        if (interfaceC7178 == null) {
            C5925.m11311("Can only deserialize JSON");
            return null;
        }
        AbstractC7176 abstractC7176Mo10681 = interfaceC7178.mo10681();
        if (!(abstractC7176Mo10681 instanceof AbstractC7148)) {
            C5925.m11311("Invalid RequestId format");
            return null;
        }
        AbstractC7148 abstractC7148 = (AbstractC7148) abstractC7176Mo10681;
        if (abstractC7148.mo12422()) {
            return new C6833(abstractC7148.mo12423());
        }
        try {
            lValueOf = Long.valueOf(AbstractC7168.m12434(abstractC7148));
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            C5925.m11311("Invalid RequestId type");
            return null;
        }
        try {
            return new C6837(AbstractC7168.m12434(abstractC7148));
        } catch (JsonDecodingException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return this.f18276;
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        InterfaceC6836 interfaceC6836 = (InterfaceC6836) obj;
        interfaceC6836.getClass();
        InterfaceC7169 interfaceC7169 = interfaceC7186 instanceof InterfaceC7169 ? (InterfaceC7169) interfaceC7186 : null;
        if (interfaceC7169 == null) {
            C5925.m11311("Can only serialize JSON");
            return;
        }
        if (interfaceC6836 instanceof C6833) {
            interfaceC7169.mo10649(((C6833) interfaceC6836).f18275);
        } else if (interfaceC6836 instanceof C6837) {
            interfaceC7169.mo10651(((C6837) interfaceC6836).f18277);
        } else {
            C4211.m8611();
        }
    }
}
