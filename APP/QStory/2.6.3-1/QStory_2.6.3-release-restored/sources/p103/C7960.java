package p103;

import kotlin.Triple;
import kotlin.collections.AbstractC5179;
import kotlin.text.AbstractC5976;
import kotlinx.serialization.SerializationException;
import p025.AbstractC7012;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p106.InterfaceC8017;
import p106.InterfaceC8018;
import p107.C8019;
import p107.C8024;
import p107.C8027;
import p107.InterfaceC8020;
import top.suzhelan.qstory.hook.item.C6755;
import top.yukonga.miuix.kmp.utils.C6886;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7960 implements InterfaceC8013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8019 f19424;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8013 f19425;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8013 f19426;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC8013 f19427;

    public C7960(InterfaceC8013 interfaceC8013, InterfaceC8013 interfaceC80132, InterfaceC8013 interfaceC80133) {
        C8019 c8019;
        interfaceC8013.getClass();
        interfaceC80132.getClass();
        interfaceC80133.getClass();
        this.f19427 = interfaceC8013;
        this.f19426 = interfaceC80132;
        this.f19425 = interfaceC80133;
        InterfaceC8020[] interfaceC8020Arr = new InterfaceC8020[0];
        C6886 c6886 = new C6886(this, 3);
        if (AbstractC5976.m10731("kotlin.Triple")) {
            C6755.m11869("Blank serial names are prohibited");
            c8019 = null;
        } else {
            C8024 c8024 = new C8024("kotlin.Triple");
            c6886.invoke(c8024);
            c8019 = new C8019("kotlin.Triple", C8027.f19554, c8024.f19546.size(), AbstractC5179.m9405(interfaceC8020Arr), c8024);
        }
        this.f19424 = c8019;
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        C8019 c8019 = this.f19424;
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(c8019);
        interfaceC8018Mo11235.getClass();
        Object obj = AbstractC7973.f19447;
        Object objMo11233 = obj;
        Object objMo112332 = objMo11233;
        Object objMo112333 = objMo112332;
        while (true) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(c8019);
            if (iMo11277 == -1) {
                interfaceC8018Mo11235.mo11237(c8019);
                if (objMo11233 == obj) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objMo112332 == obj) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objMo112333 != obj) {
                    return new Triple(objMo11233, objMo112332, objMo112333);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iMo11277 == 0) {
                objMo11233 = interfaceC8018Mo11235.mo11233(c8019, 0, this.f19427, null);
            } else if (iMo11277 == 1) {
                objMo112332 = interfaceC8018Mo11235.mo11233(c8019, 1, this.f19426, null);
            } else {
                if (iMo11277 != 2) {
                    throw new SerializationException(AbstractC7012.m12147(iMo11277, "Unexpected index "));
                }
                objMo112333 = interfaceC8018Mo11235.mo11233(c8019, 2, this.f19425, null);
            }
        }
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return this.f19424;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        Triple triple = (Triple) obj;
        triple.getClass();
        C8019 c8019 = this.f19424;
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(c8019);
        interfaceC8017Mo11269.mo11278(c8019, 0, this.f19427, triple.getFirst());
        interfaceC8017Mo11269.mo11278(c8019, 1, this.f19426, triple.getSecond());
        interfaceC8017Mo11269.mo11278(c8019, 2, this.f19425, triple.getThird());
        interfaceC8017Mo11269.mo11270(c8019);
    }
}
