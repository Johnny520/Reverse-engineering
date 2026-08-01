package io.ktor.server.websocket;

import androidx.compose.ui.graphics.vector.C1562;
import io.ktor.util.C4209;
import io.ktor.websocket.InterfaceC4269;
import java.util.List;
import kotlin.coroutines.InterfaceC4360;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.AbstractC5090;
import kotlin.reflect.C5085;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5093;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5451;
import kotlinx.coroutines.InterfaceC5401;
import p059.C6857;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.server.websocket.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4182 implements InterfaceC5401 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C4183 f12646 = new C4183();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C4209 f12647;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C4209 f12648;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5451 f12649 = AbstractC5399.m10488();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f12650;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1562 f12651;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f12652;

    static {
        InterfaceC5087 interfaceC5087M8912;
        InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(C4182.class);
        InterfaceC5087 interfaceC5087M8911 = null;
        try {
            interfaceC5087M8912 = AbstractC4396.m8912(C4182.class);
        } catch (Throwable unused) {
            interfaceC5087M8912 = null;
        }
        f12647 = new C4209("WebSockets", new C6857(interfaceC5093Mo8917, interfaceC5087M8912));
        InterfaceC5093 interfaceC5093Mo89172 = AbstractC4396.f12975.mo8917(List.class);
        try {
            interfaceC5087M8911 = AbstractC4396.m8911(List.class, AbstractC5090.m10100(AbstractC4396.m8911(InterfaceC4269.class, C5085.f14636)));
        } catch (Throwable unused2) {
        }
        f12648 = new C4209("WebSocket extensions", new C6857(interfaceC5093Mo89172, interfaceC5087M8911));
    }

    public C4182(long j, long j2, C1562 c1562) {
        this.f12652 = j;
        this.f12650 = j2;
        this.f12651 = c1562;
        if (j < 0) {
            C5925.m11310("Failed requirement.");
            throw null;
        }
        if (j2 > 0) {
            return;
        }
        C5925.m11310("Failed requirement.");
        throw null;
    }

    @Override // kotlinx.coroutines.InterfaceC5401
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC4360 mo2430() {
        return this.f12649;
    }
}
