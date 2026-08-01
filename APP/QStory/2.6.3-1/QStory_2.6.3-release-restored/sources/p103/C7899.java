package p103;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC5179;
import kotlin.text.AbstractC5976;
import p105.InterfaceC8013;
import p107.C8019;
import p107.C8024;
import p107.C8027;
import p107.InterfaceC8020;
import p267.AbstractC9004;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7899 extends AbstractC7902 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8019 f19317;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f19318;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7899(InterfaceC8013 interfaceC8013, InterfaceC8013 interfaceC80132, int i) {
        super(interfaceC8013, interfaceC80132);
        this.f19318 = i;
        int i2 = 0;
        interfaceC8013.getClass();
        interfaceC80132.getClass();
        switch (i) {
            case 1:
                super(interfaceC8013, interfaceC80132);
                InterfaceC8020[] interfaceC8020Arr = new InterfaceC8020[0];
                if (AbstractC5976.m10731("kotlin.Pair")) {
                    C6755.m11869("Blank serial names are prohibited");
                    throw null;
                }
                C8024 c8024 = new C8024("kotlin.Pair");
                C8024.m12996(c8024, "first", interfaceC8013.getDescriptor());
                C8024.m12996(c8024, "second", interfaceC80132.getDescriptor());
                this.f19317 = new C8019("kotlin.Pair", C8027.f19554, c8024.f19546.size(), AbstractC5179.m9405(interfaceC8020Arr), c8024);
                return;
            default:
                this.f19317 = AbstractC9004.m14207("kotlin.collections.Map.Entry", C8027.f19553, new InterfaceC8020[0], new C7897(interfaceC8013, i2, interfaceC80132));
                return;
        }
    }

    @Override // p103.AbstractC7902, p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        switch (this.f19318) {
        }
        return this.f19317;
    }

    @Override // p103.AbstractC7902
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object mo12945(Object obj, Object obj2) {
        switch (this.f19318) {
            case 0:
                return new C7896(obj, obj2);
            default:
                return new Pair(obj, obj2);
        }
    }

    @Override // p103.AbstractC7902
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object mo12946(Object obj) {
        switch (this.f19318) {
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

    @Override // p103.AbstractC7902
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object mo12947(Object obj) {
        switch (this.f19318) {
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
