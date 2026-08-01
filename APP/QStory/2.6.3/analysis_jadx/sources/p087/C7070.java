package p087;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4347;
import kotlin.text.AbstractC5144;
import p089.InterfaceC7184;
import p091.C7190;
import p091.C7195;
import p091.C7198;
import p091.InterfaceC7191;
import p251.AbstractC8175;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7070 extends AbstractC7073 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C7190 f18972;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f18973;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7070(InterfaceC7184 interfaceC7184, InterfaceC7184 interfaceC71842, int i) {
        super(interfaceC7184, interfaceC71842);
        this.f18973 = i;
        int i2 = 0;
        interfaceC7184.getClass();
        interfaceC71842.getClass();
        switch (i) {
            case 1:
                super(interfaceC7184, interfaceC71842);
                InterfaceC7191[] interfaceC7191Arr = new InterfaceC7191[0];
                if (AbstractC5144.m10172("kotlin.Pair")) {
                    C5925.m11310("Blank serial names are prohibited");
                    throw null;
                }
                C7195 c7195 = new C7195("kotlin.Pair");
                C7195.m12437(c7195, "first", interfaceC7184.getDescriptor());
                C7195.m12437(c7195, "second", interfaceC71842.getDescriptor());
                this.f18972 = new C7190("kotlin.Pair", C7198.f19209, c7195.f19201.size(), AbstractC4347.m8846(interfaceC7191Arr), c7195);
                return;
            default:
                this.f18972 = AbstractC8175.m13648("kotlin.collections.Map.Entry", C7198.f19208, new InterfaceC7191[0], new C7068(interfaceC7184, i2, interfaceC71842));
                return;
        }
    }

    @Override // p087.AbstractC7073, p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        switch (this.f18973) {
        }
        return this.f18972;
    }

    @Override // p087.AbstractC7073
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object mo12386(Object obj, Object obj2) {
        switch (this.f18973) {
            case 0:
                return new C7067(obj, obj2);
            default:
                return new Pair(obj, obj2);
        }
    }

    @Override // p087.AbstractC7073
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object mo12387(Object obj) {
        switch (this.f18973) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return entry.getValue();
            default:
                Pair pair = (Pair) obj;
                pair.getClass();
                return pair.getSecond();
        }
    }

    @Override // p087.AbstractC7073
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object mo12388(Object obj) {
        switch (this.f18973) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return entry.getKey();
            default:
                Pair pair = (Pair) obj;
                pair.getClass();
                return pair.getFirst();
        }
    }
}
