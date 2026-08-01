package io.ktor.server.cio.backend;

import androidx.activity.compose.C0002;
import com.bumptech.glide.AbstractC3056;
import io.ktor.network.selector.C4002;
import io.ktor.server.cio.C4083;
import io.ktor.server.cio.C4085;
import kotlin.coroutines.InterfaceC4359;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.C4396;
import kotlin.time.AbstractC5159;
import kotlin.time.C5156;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5401;
import kotlinx.coroutines.C5416;
import kotlinx.coroutines.C5437;
import kotlinx.coroutines.C5450;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5400;
import p007.AbstractC6136;
import p052.InterfaceC6550;
import p305.C8631;
import p400.AbstractC9154;
import p400.InterfaceC9156;

/* JADX INFO: renamed from: io.ktor.server.cio.backend.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4075 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4083 m8487(InterfaceC5400 interfaceC5400, C4085 c4085, InterfaceC6550 interfaceC6550) {
        interfaceC5400.getClass();
        C5437 c5437M10486 = AbstractC5398.m10486();
        C5450 c5450M10484 = AbstractC5398.m10484();
        StringBuilder sb = new StringBuilder("server-root-");
        int i = c4085.f12415;
        sb.append(i);
        C5416 c5416M10474 = AbstractC5398.m10474(interfaceC5400, new C5401(sb.toString()), CoroutineStart.UNDISPATCHED, new HttpServerKt$httpServer$serverJob$1(c5450M10484, null));
        InterfaceC4359 interfaceC4359Mo2420 = interfaceC5400.mo2420();
        interfaceC4359Mo2420.getClass();
        C4002 c4002 = new C4002(interfaceC4359Mo2420);
        C8631 c8631 = C5156.f14712;
        long jM10203 = AbstractC5159.m10203(c4085.f12414, DurationUnit.SECONDS);
        C4396 c4396 = AbstractC4395.f12971;
        String simpleName = c4396.mo8927(C4083.class).getSimpleName();
        if (simpleName == null && (simpleName = c4396.mo8927(C4083.class).mo8895()) == null) {
            simpleName = c4396.mo8927(C4083.class).toString();
        }
        simpleName.getClass();
        InterfaceC9156 interfaceC9156M14712 = AbstractC9154.m14712(simpleName);
        interfaceC9156M14712.getClass();
        C5416 c5416M10473 = AbstractC5398.m10473(interfaceC5400, AbstractC3056.m6656(c5416M10474, new C5401(AbstractC6136.m11556(i, "accept-"))), null, new HttpServerKt$httpServer$acceptJob$1(c4002, c4085, c5437M10486, interfaceC9156M14712, c5416M10474, jM10203, interfaceC6550, null), 2);
        c5416M10473.mo10554(new C0002(c5450M10484, 19, c5437M10486));
        c5416M10474.mo10554(new C4076(c4002, 1));
        return new C4083(c5416M10474, c5416M10473, c5437M10486);
    }
}
