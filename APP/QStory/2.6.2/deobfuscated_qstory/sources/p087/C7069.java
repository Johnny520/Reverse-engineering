package p087;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4346;
import kotlin.reflect.jvm.internal.AbstractC5061;
import kotlin.text.AbstractC5143;
import p089.InterfaceC7183;
import p091.C7189;
import p091.C7194;
import p091.C7197;
import p091.InterfaceC7190;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7069 extends AbstractC7072 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C7189 f18977;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f18978;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7069(InterfaceC7183 interfaceC7183, InterfaceC7183 interfaceC71832, int i) {
        super(interfaceC7183, interfaceC71832);
        this.f18978 = i;
        int i2 = 0;
        interfaceC7183.getClass();
        interfaceC71832.getClass();
        switch (i) {
            case 1:
                super(interfaceC7183, interfaceC71832);
                InterfaceC7190[] interfaceC7190Arr = new InterfaceC7190[0];
                if (AbstractC5143.m10164("kotlin.Pair")) {
                    C5919.m11249("Blank serial names are prohibited");
                    throw null;
                }
                C7194 c7194 = new C7194("kotlin.Pair");
                C7194.m12410(c7194, "first", interfaceC7183.getDescriptor());
                C7194.m12410(c7194, "second", interfaceC71832.getDescriptor());
                this.f18977 = new C7189("kotlin.Pair", C7197.f19213, c7194.f19206.size(), AbstractC4346.m8850(interfaceC7190Arr), c7194);
                return;
            default:
                this.f18977 = AbstractC5061.m10033("kotlin.collections.Map.Entry", C7197.f19215, new InterfaceC7190[0], new C7067(interfaceC7183, i2, interfaceC71832));
                return;
        }
    }

    @Override // p087.AbstractC7072, p089.InterfaceC7183
    public final InterfaceC7190 getDescriptor() {
        switch (this.f18978) {
        }
        return this.f18977;
    }

    @Override // p087.AbstractC7072
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object mo12359(Object obj, Object obj2) {
        switch (this.f18978) {
            case 0:
                return new C7066(obj, obj2);
            default:
                return new Pair(obj, obj2);
        }
    }

    @Override // p087.AbstractC7072
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object mo12360(Object obj) {
        switch (this.f18978) {
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

    @Override // p087.AbstractC7072
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object mo12361(Object obj) {
        switch (this.f18978) {
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
