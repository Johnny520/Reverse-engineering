package io.ktor.util.debug;

import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC5398;
import p052.InterfaceC6557;
import p246.C8153;
import p246.C8155;

/* JADX INFO: renamed from: io.ktor.util.debug.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4187 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object m8565(InterfaceC6557 interfaceC6557, ContinuationImpl continuationImpl) {
        return !AbstractC4186.m8564() ? interfaceC6557.invoke(continuationImpl) : AbstractC5398.m10466(continuationImpl.getContext().plus(new C8153()), new ContextUtilsKt$initContextInDebugMode$2(interfaceC6557, null), continuationImpl);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object m8566(String str, InterfaceC6557 interfaceC6557, InterfaceC4356 interfaceC4356) {
        return !AbstractC4186.m8564() ? interfaceC6557.invoke(interfaceC4356) : AbstractC5398.m10466(interfaceC4356.getContext().plus(new C8155(str)), new ContextUtilsKt$addToContextInDebugMode$2(interfaceC6557, null), interfaceC4356);
    }
}
