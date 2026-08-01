package p072;

import io.ktor.util.C5043;
import kotlin.collections.AbstractC5179;
import kotlin.text.AbstractC5976;
import kotlinx.serialization.json.JsonDecodingException;
import p104.AbstractC7977;
import p104.AbstractC7997;
import p104.AbstractC8005;
import p104.InterfaceC7998;
import p104.InterfaceC8007;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p107.C8019;
import p107.C8024;
import p107.C8027;
import p107.InterfaceC8020;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪苏兰哲世子, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7664 implements InterfaceC8013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8019 f18621;

    public C7664() {
        InterfaceC8020[] interfaceC8020Arr = new InterfaceC8020[0];
        if (AbstractC5976.m10731("RequestId")) {
            C6755.m11869("Blank serial names are prohibited");
            throw null;
        }
        C8024 c8024 = new C8024("RequestId");
        this.f18621 = new C8019("RequestId", C8027.f19554, c8024.f19546.size(), AbstractC5179.m9405(interfaceC8020Arr), c8024);
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        Long lValueOf;
        InterfaceC8007 interfaceC8007 = interfaceC8016 instanceof InterfaceC8007 ? (InterfaceC8007) interfaceC8016 : null;
        if (interfaceC8007 == null) {
            C6755.m11870("Can only deserialize JSON");
            return null;
        }
        AbstractC8005 abstractC8005Mo11240 = interfaceC8007.mo11240();
        if (!(abstractC8005Mo11240 instanceof AbstractC7977)) {
            C6755.m11870("Invalid RequestId format");
            return null;
        }
        AbstractC7977 abstractC7977 = (AbstractC7977) abstractC8005Mo11240;
        if (abstractC7977.mo12981()) {
            return new C7662(abstractC7977.mo12982());
        }
        try {
            lValueOf = Long.valueOf(AbstractC7997.m12993(abstractC7977));
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf == null) {
            C6755.m11870("Invalid RequestId type");
            return null;
        }
        try {
            return new C7666(AbstractC7997.m12993(abstractC7977));
        } catch (JsonDecodingException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return this.f18621;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        InterfaceC7665 interfaceC7665 = (InterfaceC7665) obj;
        interfaceC7665.getClass();
        InterfaceC7998 interfaceC7998 = interfaceC8015 instanceof InterfaceC7998 ? (InterfaceC7998) interfaceC8015 : null;
        if (interfaceC7998 == null) {
            C6755.m11870("Can only serialize JSON");
            return;
        }
        if (interfaceC7665 instanceof C7662) {
            interfaceC7998.mo11208(((C7662) interfaceC7665).f18620);
        } else if (interfaceC7665 instanceof C7666) {
            interfaceC7998.mo11210(((C7666) interfaceC7665).f18622);
        } else {
            C5043.m9170();
        }
    }
}
