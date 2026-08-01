package androidx.compose.runtime;

import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlinx.coroutines.flow.InterfaceC5317;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1336 implements InterfaceC5317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1388 f3897;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f3898;

    public /* synthetic */ C1336(InterfaceC1388 interfaceC1388, int i) {
        this.f3898 = i;
        this.f3897 = interfaceC1388;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5317
    public final Object emit(Object obj, InterfaceC4356 interfaceC4356) {
        int i = this.f3898;
        C5175 c5175 = C5175.f14739;
        InterfaceC1388 interfaceC1388 = this.f3897;
        switch (i) {
            case 0:
                ((C1387) interfaceC1388).setValue(obj);
                break;
            case 1:
                ((C1387) interfaceC1388).setValue(obj);
                break;
            case 2:
                ((C1387) interfaceC1388).setValue(obj);
                break;
            default:
                ((C1387) interfaceC1388).setValue(obj);
                break;
        }
        return c5175;
    }
}
