package top.yukonga.miuix.kmp.basic;

import androidx.compose.animation.core.C1191;
import androidx.compose.p001ui.text.C2867;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.InterfaceC2230;
import kotlin.C6008;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6849 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16786;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16787;

    public /* synthetic */ C6849(Object obj, int i) {
        this.f16787 = i;
        this.f16786 = obj;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f16787;
        C6008 c6008 = C6008.f15084;
        Object obj2 = this.f16786;
        switch (i) {
            case 0:
                break;
            case 1:
                C2867 c2867 = (C2867) obj;
                c2867.getClass();
                ((InterfaceC2230) obj2).setValue(Integer.valueOf((int) (c2867.f6334 & 4294967295L)));
                break;
            default:
                C1191 c1191 = (C1191) obj;
                c1191.getClass();
                ((C6864) obj2).m11953(((Number) ((AbstractC2182) c1191.f1528).getValue()).floatValue());
                break;
        }
        return c6008;
    }
}
