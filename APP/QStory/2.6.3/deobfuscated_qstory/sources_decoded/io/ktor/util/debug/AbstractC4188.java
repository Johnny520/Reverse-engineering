package io.ktor.util.debug;

import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC5399;
import p052.InterfaceC6558;
import p246.C8154;
import p246.C8156;

/* JADX INFO: renamed from: io.ktor.util.debug.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4188 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object m8555(InterfaceC6558 interfaceC6558, ContinuationImpl continuationImpl) {
        return !AbstractC4187.m8554() ? interfaceC6558.invoke(continuationImpl) : AbstractC5399.m10470(continuationImpl.getContext().plus(new C8154()), new ContextUtilsKt$initContextInDebugMode$2(interfaceC6558, null), continuationImpl);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object m8556(String str, InterfaceC6558 interfaceC6558, InterfaceC4357 interfaceC4357) {
        return !AbstractC4187.m8554() ? interfaceC6558.invoke(interfaceC4357) : AbstractC5399.m10470(interfaceC4357.getContext().plus(new C8156(str)), new ContextUtilsKt$addToContextInDebugMode$2(interfaceC6558, null), interfaceC4357);
    }
}
