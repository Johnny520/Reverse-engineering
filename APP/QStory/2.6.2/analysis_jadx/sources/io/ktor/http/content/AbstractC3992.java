package io.ktor.http.content;

import io.ktor.http.cio.C3958;
import kotlin.C5175;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.C5283;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: io.ktor.http.content.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3992 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object m8393(C3958 c3958, InterfaceC6553 interfaceC6553, InterfaceC4356 interfaceC4356) throws Throwable {
        Object objMo8463 = new C5283(new MultipartKt$asFlow$1(c3958, null)).mo8463(new C3975(interfaceC6553), interfaceC4356);
        return objMo8463 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo8463 : C5175.f14739;
    }
}
