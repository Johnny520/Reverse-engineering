package io.ktor.util.debug;

import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7387;
import p262.C8983;
import p262.C8985;

/* JADX INFO: renamed from: io.ktor.util.debug.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5020 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Object m9114(InterfaceC7387 interfaceC7387, ContinuationImpl continuationImpl) {
        return !AbstractC5019.m9113() ? interfaceC7387.invoke(continuationImpl) : AbstractC6231.m11029(continuationImpl.getContext().plus(new C8983()), new ContextUtilsKt$initContextInDebugMode$2(interfaceC7387, null), continuationImpl);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Object m9115(String str, InterfaceC7387 interfaceC7387, InterfaceC5189 interfaceC5189) {
        return !AbstractC5019.m9113() ? interfaceC7387.invoke(interfaceC5189) : AbstractC6231.m11029(interfaceC5189.getContext().plus(new C8985(str)), new ContextUtilsKt$addToContextInDebugMode$2(interfaceC7387, null), interfaceC5189);
    }
}
