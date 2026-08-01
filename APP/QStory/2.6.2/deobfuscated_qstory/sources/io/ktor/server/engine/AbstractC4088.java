package io.ktor.server.engine;

import androidx.compose.foundation.C1030;
import io.ktor.server.application.InterfaceC4056;
import io.ktor.server.cio.C4078;
import io.ktor.server.cio.C4082;
import io.ktor.server.request.C4129;
import io.ktor.server.request.InterfaceC4126;
import io.ktor.utils.io.InterfaceC4251;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import p236.InterfaceC8111;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4088 implements InterfaceC4126 {
    private volatile /* synthetic */ Object receiveChannel = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5183 f12421 = AbstractC5186.m10210(new C1030(this, 9));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4129 f12422;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4082 f12423;

    public AbstractC4088(C4082 c4082) {
        this.f12423 = c4082;
        C4129 c4129 = new C4129(c4082.f12400.f12336);
        C4129 c41292 = c4082.f12400.f12334;
        c41292.getClass();
        c4129.f12663.clear();
        if (c4129.f12664 != 0) {
            C5919.m11250("Check failed.");
            throw null;
        }
        c4129.m8583(c41292);
        this.f12422 = c4129;
    }

    @Override // io.ktor.server.request.InterfaceC4126
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C4129 mo378() {
        return this.f12422;
    }

    @Override // io.ktor.server.request.InterfaceC4128, io.ktor.server.response.InterfaceC4135
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final /* bridge */ /* synthetic */ InterfaceC4056 mo380() {
        return this.f12423;
    }

    @Override // io.ktor.server.request.InterfaceC4128
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC8111 mo383() {
        return (InterfaceC8111) this.f12421.getValue();
    }

    @Override // io.ktor.server.request.InterfaceC4128
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC4251 mo394() {
        InterfaceC4251 interfaceC4251 = (InterfaceC4251) this.receiveChannel;
        return interfaceC4251 == null ? ((C4078) this).f12383 : interfaceC4251;
    }
}
