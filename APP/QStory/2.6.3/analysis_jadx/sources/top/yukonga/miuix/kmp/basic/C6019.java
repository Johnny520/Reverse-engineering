package top.yukonga.miuix.kmp.basic;

import androidx.compose.animation.core.C0345;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.text.C2033;
import kotlin.C5176;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6019 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f16441;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16442;

    public /* synthetic */ C6019(Object obj, int i) {
        this.f16442 = i;
        this.f16441 = obj;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f16442;
        C5176 c5176 = C5176.f14739;
        Object obj2 = this.f16441;
        switch (i) {
            case 0:
                break;
            case 1:
                C2033 c2033 = (C2033) obj;
                c2033.getClass();
                ((InterfaceC1395) obj2).setValue(Integer.valueOf((int) (c2033.f5989 & 4294967295L)));
                break;
            default:
                C0345 c0345 = (C0345) obj;
                c0345.getClass();
                ((C6034) obj2).m11394(((Number) ((AbstractC1347) c0345.f1183).getValue()).floatValue());
                break;
        }
        return c5176;
    }
}
