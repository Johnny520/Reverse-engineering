package io.ktor.server.websocket;

import androidx.compose.ui.graphics.vector.C1562;
import io.ktor.util.C4208;
import io.ktor.websocket.InterfaceC4268;
import java.util.List;
import kotlin.coroutines.InterfaceC4359;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.AbstractC5089;
import kotlin.reflect.C5084;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5092;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5450;
import kotlinx.coroutines.InterfaceC5400;
import p059.C6856;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: io.ktor.server.websocket.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4181 implements InterfaceC5400 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C4182 f12642 = new C4182();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C4208 f12643;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C4208 f12644;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5450 f12645 = AbstractC5398.m10484();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f12646;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C1562 f12647;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final long f12648;

    static {
        InterfaceC5086 interfaceC5086M8922;
        InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(C4181.class);
        InterfaceC5086 interfaceC5086M8921 = null;
        try {
            interfaceC5086M8922 = AbstractC4395.m8922(C4181.class);
        } catch (Throwable unused) {
            interfaceC5086M8922 = null;
        }
        f12643 = new C4208("WebSockets", new C6856(interfaceC5092Mo8927, interfaceC5086M8922));
        InterfaceC5092 interfaceC5092Mo89272 = AbstractC4395.f12971.mo8927(List.class);
        try {
            interfaceC5086M8921 = AbstractC4395.m8921(List.class, AbstractC5089.m10096(AbstractC4395.m8921(InterfaceC4268.class, C5084.f14636)));
        } catch (Throwable unused2) {
        }
        f12644 = new C4208("WebSocket extensions", new C6856(interfaceC5092Mo89272, interfaceC5086M8921));
    }

    public C4181(long j, long j2, C1562 c1562) {
        this.f12648 = j;
        this.f12646 = j2;
        this.f12647 = c1562;
        if (j < 0) {
            C5919.m11249("Failed requirement.");
            throw null;
        }
        if (j2 > 0) {
            return;
        }
        C5919.m11249("Failed requirement.");
        throw null;
    }

    @Override // kotlinx.coroutines.InterfaceC5400
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC4359 mo2420() {
        return this.f12645;
    }
}
