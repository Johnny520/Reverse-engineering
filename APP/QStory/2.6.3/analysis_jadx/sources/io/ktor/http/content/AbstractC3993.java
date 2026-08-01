package io.ktor.http.content;

import io.ktor.http.cio.C3959;
import kotlin.C5176;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.C5284;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: io.ktor.http.content.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3993 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object m8383(C3959 c3959, InterfaceC6554 interfaceC6554, InterfaceC4357 interfaceC4357) throws Throwable {
        Object objMo8453 = new C5284(new MultipartKt$asFlow$1(c3959, null)).mo8453(new C3976(interfaceC6554), interfaceC4357);
        return objMo8453 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo8453 : C5176.f14739;
    }
}
