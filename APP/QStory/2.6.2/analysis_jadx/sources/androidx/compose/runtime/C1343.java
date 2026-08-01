package androidx.compose.runtime;

import androidx.activity.compose.C0004;
import androidx.compose.runtime.tooling.C1292;
import kotlin.coroutines.AbstractC4358;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.C5432;
import kotlinx.coroutines.InterfaceC5403;
import p000.AbstractC6087;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1343 extends AbstractC4358 implements InterfaceC5403 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1344 f3903;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C1292 f3904;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1343(C1292 c1292, C1344 c1344) {
        super(C5432.f15082);
        this.f3904 = c1292;
        this.f3903 = c1344;
    }

    @Override // kotlinx.coroutines.InterfaceC5403
    public final void handleException(InterfaceC4359 interfaceC4359, Throwable th) throws Throwable {
        C1292 c1292 = this.f3904;
        C1344 c1344 = this.f3903;
        AbstractC6087.m11423(th, new C0004(c1292, 7, c1344));
        InterfaceC4359 interfaceC43592 = c1344.f3907;
        C5432 c5432 = C5432.f15082;
        InterfaceC5403 interfaceC5403 = (InterfaceC5403) interfaceC43592.get(c5432);
        if (interfaceC5403 != null) {
            interfaceC5403.handleException(interfaceC4359, th);
            return;
        }
        InterfaceC5403 interfaceC54032 = (InterfaceC5403) c1344.f3909.get(c5432);
        if (interfaceC54032 == null) {
            throw th;
        }
        interfaceC54032.handleException(interfaceC4359, th);
    }
}
