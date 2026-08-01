package androidx.compose.runtime;

import androidx.activity.compose.C0851;
import androidx.compose.runtime.tooling.C2127;
import kotlin.coroutines.AbstractC5191;
import kotlin.coroutines.InterfaceC5192;
import kotlinx.coroutines.C6265;
import kotlinx.coroutines.InterfaceC6236;
import p034.AbstractC7082;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2178 extends AbstractC5191 implements InterfaceC6236 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C2179 f4249;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C2127 f4250;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2178(C2127 c2127, C2179 c2179) {
        super(C6265.f15427);
        this.f4250 = c2127;
        this.f4249 = c2179;
    }

    @Override // kotlinx.coroutines.InterfaceC6236
    public final void handleException(InterfaceC5192 interfaceC5192, Throwable th) throws Throwable {
        C2127 c2127 = this.f4250;
        C2179 c2179 = this.f4249;
        AbstractC7082.m12296(th, new C0851(c2127, 7, c2179));
        InterfaceC5192 interfaceC51922 = c2179.f4253;
        C6265 c6265 = C6265.f15427;
        InterfaceC6236 interfaceC6236 = (InterfaceC6236) interfaceC51922.get(c6265);
        if (interfaceC6236 != null) {
            interfaceC6236.handleException(interfaceC5192, th);
            return;
        }
        InterfaceC6236 interfaceC62362 = (InterfaceC6236) c2179.f4255.get(c6265);
        if (interfaceC62362 == null) {
            throw th;
        }
        interfaceC62362.handleException(interfaceC5192, th);
    }
}
