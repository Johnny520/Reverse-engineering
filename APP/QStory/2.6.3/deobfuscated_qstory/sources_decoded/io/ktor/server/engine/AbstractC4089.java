package io.ktor.server.engine;

import androidx.compose.foundation.C1030;
import io.ktor.server.application.InterfaceC4057;
import io.ktor.server.cio.C4079;
import io.ktor.server.cio.C4083;
import io.ktor.server.request.C4130;
import io.ktor.server.request.InterfaceC4127;
import io.ktor.utils.io.InterfaceC4252;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import p236.InterfaceC8112;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4089 implements InterfaceC4127 {
    private volatile /* synthetic */ Object receiveChannel = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5184 f12425 = AbstractC5187.m10214(new C1030(this, 9));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4130 f12426;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4083 f12427;

    public AbstractC4089(C4083 c4083) {
        this.f12427 = c4083;
        C4130 c4130 = new C4130(c4083.f12404.f12340);
        C4130 c41302 = c4083.f12404.f12338;
        c41302.getClass();
        c4130.f12667.clear();
        if (c4130.f12668 != 0) {
            C5925.m11311("Check failed.");
            throw null;
        }
        c4130.m8573(c41302);
        this.f12426 = c4130;
    }

    @Override // io.ktor.server.request.InterfaceC4127
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C4130 mo379() {
        return this.f12426;
    }

    @Override // io.ktor.server.request.InterfaceC4129, io.ktor.server.response.InterfaceC4136
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final /* bridge */ /* synthetic */ InterfaceC4057 mo381() {
        return this.f12427;
    }

    @Override // io.ktor.server.request.InterfaceC4129
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC8112 mo384() {
        return (InterfaceC8112) this.f12425.getValue();
    }

    @Override // io.ktor.server.request.InterfaceC4129
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC4252 mo396() {
        InterfaceC4252 interfaceC4252 = (InterfaceC4252) this.receiveChannel;
        return interfaceC4252 == null ? ((C4079) this).f12387 : interfaceC4252;
    }
}
