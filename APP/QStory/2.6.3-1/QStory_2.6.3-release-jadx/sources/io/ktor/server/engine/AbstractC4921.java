package io.ktor.server.engine;

import androidx.compose.foundation.C1868;
import io.ktor.server.application.InterfaceC4889;
import io.ktor.server.cio.C4911;
import io.ktor.server.cio.C4915;
import io.ktor.server.request.C4962;
import io.ktor.server.request.InterfaceC4959;
import io.ktor.utils.p007io.InterfaceC5084;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import p252.InterfaceC8941;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4921 implements InterfaceC4959 {
    private volatile /* synthetic */ Object receiveChannel = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6016 f12770 = AbstractC6019.m10773(new C1868(this, 9));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C4962 f12771;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4915 f12772;

    public AbstractC4921(C4915 c4915) {
        this.f12772 = c4915;
        C4962 c4962 = new C4962(c4915.f12749.f12685);
        C4962 c49622 = c4915.f12749.f12683;
        c49622.getClass();
        c4962.f13012.clear();
        if (c4962.f13013 != 0) {
            C6755.m11870("Check failed.");
            throw null;
        }
        c4962.m9132(c49622);
        this.f12771 = c4962;
    }

    @Override // io.ktor.server.request.InterfaceC4959
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final C4962 mo939() {
        return this.f12771;
    }

    @Override // io.ktor.server.request.InterfaceC4961, io.ktor.server.response.InterfaceC4968
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final /* bridge */ /* synthetic */ InterfaceC4889 mo941() {
        return this.f12772;
    }

    @Override // io.ktor.server.request.InterfaceC4961
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC8941 mo944() {
        return (InterfaceC8941) this.f12770.getValue();
    }

    @Override // io.ktor.server.request.InterfaceC4961
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC5084 mo956() {
        InterfaceC5084 interfaceC5084 = (InterfaceC5084) this.receiveChannel;
        return interfaceC5084 == null ? ((C4911) this).f12732 : interfaceC5084;
    }
}
