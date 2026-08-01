package io.ktor.server.cio.backend;

import androidx.activity.compose.C0002;
import io.ktor.network.selector.C4003;
import io.ktor.server.cio.C4084;
import io.ktor.server.cio.C4086;
import kotlin.coroutines.InterfaceC4360;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.jvm.internal.C4397;
import kotlin.time.AbstractC5160;
import kotlin.time.C5157;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5402;
import kotlinx.coroutines.C5417;
import kotlinx.coroutines.C5438;
import kotlinx.coroutines.C5451;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5401;
import p009.AbstractC6183;
import p052.InterfaceC6551;
import p305.C8623;
import p316.C8667;
import p398.AbstractC9139;
import p398.InterfaceC9141;

/* JADX INFO: renamed from: io.ktor.server.cio.backend.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4076 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4084 m8477(InterfaceC5401 interfaceC5401, C4086 c4086, InterfaceC6551 interfaceC6551) {
        interfaceC5401.getClass();
        C5438 c5438M10490 = AbstractC5399.m10490();
        C5451 c5451M10488 = AbstractC5399.m10488();
        StringBuilder sb = new StringBuilder("server-root-");
        int i = c4086.f12419;
        sb.append(i);
        C5417 c5417M10478 = AbstractC5399.m10478(interfaceC5401, new C5402(sb.toString()), CoroutineStart.UNDISPATCHED, new HttpServerKt$httpServer$serverJob$1(c5451M10488, null));
        InterfaceC4360 interfaceC4360Mo2430 = interfaceC5401.mo2430();
        interfaceC4360Mo2430.getClass();
        C4003 c4003 = new C4003(interfaceC4360Mo2430);
        C8623 c8623 = C5157.f14712;
        long jM10207 = AbstractC5160.m10207(c4086.f12418, DurationUnit.SECONDS);
        C4397 c4397 = AbstractC4396.f12975;
        String simpleName = c4397.mo8917(C4084.class).getSimpleName();
        if (simpleName == null && (simpleName = c4397.mo8917(C4084.class).mo8885()) == null) {
            simpleName = c4397.mo8917(C4084.class).toString();
        }
        simpleName.getClass();
        InterfaceC9141 interfaceC9141M14703 = AbstractC9139.m14703(simpleName);
        interfaceC9141M14703.getClass();
        C5417 c5417M10477 = AbstractC5399.m10477(interfaceC5401, C8667.m14365(c5417M10478, new C5402(AbstractC6183.m11588(i, "accept-"))), null, new HttpServerKt$httpServer$acceptJob$1(c4003, c4086, c5438M10490, interfaceC9141M14703, c5417M10478, jM10207, interfaceC6551, null), 2);
        c5417M10477.mo10559(new C0002(c5451M10488, 19, c5438M10490));
        c5417M10478.mo10559(new C4077(c4003, 1));
        return new C4084(c5417M10478, c5417M10477, c5438M10490);
    }
}
