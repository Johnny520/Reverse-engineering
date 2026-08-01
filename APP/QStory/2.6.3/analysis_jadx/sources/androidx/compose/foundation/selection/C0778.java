package androidx.compose.foundation.selection;

import androidx.compose.foundation.text.input.internal.C0860;
import kotlin.C5176;
import kotlinx.coroutines.flow.C5287;
import kotlinx.coroutines.flow.InterfaceC5294;
import p052.InterfaceC6543;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.foundation.selection.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0778 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ boolean f2249;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2250;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2251;

    public /* synthetic */ C0778(InterfaceC6558 interfaceC6558, boolean z) {
        this.f2251 = 0;
        this.f2250 = interfaceC6558;
        this.f2249 = z;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        InterfaceC5294 interfaceC5294M1690;
        int i = this.f2251;
        C5176 c5176 = C5176.f14739;
        Object obj = this.f2250;
        boolean z = this.f2249;
        switch (i) {
            case 0:
                ((InterfaceC6558) obj).invoke(Boolean.valueOf(!z));
                break;
            case 1:
                C0860 c0860 = (C0860) obj;
                if (z && (interfaceC5294M1690 = c0860.m1690()) != null) {
                    ((C5287) interfaceC5294M1690).mo10309(c5176);
                }
                break;
            default:
                InterfaceC6543 interfaceC6543 = (InterfaceC6543) obj;
                if (z) {
                    interfaceC6543.invoke();
                }
                break;
        }
        return c5176;
    }

    public /* synthetic */ C0778(Object obj, int i, boolean z) {
        this.f2251 = i;
        this.f2249 = z;
        this.f2250 = obj;
    }
}
