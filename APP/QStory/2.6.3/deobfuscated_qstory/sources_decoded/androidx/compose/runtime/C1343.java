package androidx.compose.runtime;

import androidx.activity.compose.C0004;
import androidx.compose.runtime.tooling.C1292;
import kotlin.coroutines.AbstractC4359;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.C5433;
import kotlinx.coroutines.InterfaceC5404;
import p018.AbstractC6253;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1343 extends AbstractC4359 implements InterfaceC5404 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1344 f3904;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C1292 f3905;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1343(C1292 c1292, C1344 c1344) {
        super(C5433.f15082);
        this.f3905 = c1292;
        this.f3904 = c1344;
    }

    @Override // kotlinx.coroutines.InterfaceC5404
    public final void handleException(InterfaceC4360 interfaceC4360, Throwable th) throws Throwable {
        C1292 c1292 = this.f3905;
        C1344 c1344 = this.f3904;
        AbstractC6253.m11737(th, new C0004(c1292, 7, c1344));
        InterfaceC4360 interfaceC43602 = c1344.f3908;
        C5433 c5433 = C5433.f15082;
        InterfaceC5404 interfaceC5404 = (InterfaceC5404) interfaceC43602.get(c5433);
        if (interfaceC5404 != null) {
            interfaceC5404.handleException(interfaceC4360, th);
            return;
        }
        InterfaceC5404 interfaceC54042 = (InterfaceC5404) c1344.f3910.get(c5433);
        if (interfaceC54042 == null) {
            throw th;
        }
        interfaceC54042.handleException(interfaceC4360, th);
    }
}
