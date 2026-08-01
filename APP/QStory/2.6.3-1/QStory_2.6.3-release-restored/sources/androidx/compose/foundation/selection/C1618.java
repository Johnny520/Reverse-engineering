package androidx.compose.foundation.selection;

import androidx.compose.foundation.text.input.internal.C1698;
import kotlin.C6008;
import kotlinx.coroutines.flow.C6119;
import kotlinx.coroutines.flow.InterfaceC6126;
import p068.InterfaceC7372;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.foundation.selection.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1618 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ boolean f2594;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2595;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2596;

    public /* synthetic */ C1618(InterfaceC7387 interfaceC7387, boolean z) {
        this.f2596 = 0;
        this.f2595 = interfaceC7387;
        this.f2594 = z;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        InterfaceC6126 interfaceC6126M2250;
        int i = this.f2596;
        C6008 c6008 = C6008.f15084;
        Object obj = this.f2595;
        boolean z = this.f2594;
        switch (i) {
            case 0:
                ((InterfaceC7387) obj).invoke(Boolean.valueOf(!z));
                break;
            case 1:
                C1698 c1698 = (C1698) obj;
                if (z && (interfaceC6126M2250 = c1698.m2250()) != null) {
                    ((C6119) interfaceC6126M2250).mo10868(c6008);
                }
                break;
            default:
                InterfaceC7372 interfaceC7372 = (InterfaceC7372) obj;
                if (z) {
                    interfaceC7372.invoke();
                }
                break;
        }
        return c6008;
    }

    public /* synthetic */ C1618(Object obj, int i, boolean z) {
        this.f2596 = i;
        this.f2594 = z;
        this.f2595 = obj;
    }
}
