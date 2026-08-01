package io.ktor.http.content;

import io.ktor.http.cio.C4791;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.C6116;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: io.ktor.http.content.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4825 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object m8942(C4791 c4791, InterfaceC7383 interfaceC7383, InterfaceC5189 interfaceC5189) throws Throwable {
        Object objMo9012 = new C6116(new MultipartKt$asFlow$1(c4791, null)).mo9012(new C4808(interfaceC7383), interfaceC5189);
        return objMo9012 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9012 : C6008.f15084;
    }
}
