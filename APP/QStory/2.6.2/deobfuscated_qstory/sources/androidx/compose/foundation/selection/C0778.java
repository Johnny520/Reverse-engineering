package androidx.compose.foundation.selection;

import androidx.compose.foundation.text.input.internal.C0860;
import kotlin.C5175;
import kotlinx.coroutines.flow.C5286;
import kotlinx.coroutines.flow.InterfaceC5293;
import p052.InterfaceC6542;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.foundation.selection.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0778 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ boolean f2248;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f2249;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2250;

    public /* synthetic */ C0778(InterfaceC6557 interfaceC6557, boolean z) {
        this.f2250 = 0;
        this.f2249 = interfaceC6557;
        this.f2248 = z;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        InterfaceC5293 interfaceC5293M1680;
        int i = this.f2250;
        C5175 c5175 = C5175.f14739;
        Object obj = this.f2249;
        boolean z = this.f2248;
        switch (i) {
            case 0:
                ((InterfaceC6557) obj).invoke(Boolean.valueOf(!z));
                break;
            case 1:
                C0860 c0860 = (C0860) obj;
                if (z && (interfaceC5293M1680 = c0860.m1680()) != null) {
                    ((C5286) interfaceC5293M1680).mo10305(c5175);
                }
                break;
            default:
                InterfaceC6542 interfaceC6542 = (InterfaceC6542) obj;
                if (z) {
                    interfaceC6542.invoke();
                }
                break;
        }
        return c5175;
    }

    public /* synthetic */ C0778(Object obj, int i, boolean z) {
        this.f2250 = i;
        this.f2248 = z;
        this.f2249 = obj;
    }
}
