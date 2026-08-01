package io.ktor.server.request;

import io.ktor.util.C5041;
import kotlin.AbstractC6017;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import p075.C7686;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.server.request.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4963 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5041 f12871;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5041 f12872;

    static {
        InterfaceC5919 interfaceC5919M9471;
        InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(Long.class);
        InterfaceC5919 interfaceC5919M94712 = null;
        try {
            interfaceC5919M9471 = AbstractC5228.m9471(Long.TYPE);
        } catch (Throwable unused) {
            interfaceC5919M9471 = null;
        }
        f12872 = new C5041("FormFieldLimit", new C7686(interfaceC5925Mo9476, interfaceC5919M9471));
        InterfaceC5925 interfaceC5925Mo94762 = AbstractC5228.f13320.mo9476(C4960.class);
        try {
            interfaceC5919M94712 = AbstractC5228.m9471(C4960.class);
        } catch (Throwable unused2) {
        }
        f12871 = new C5041("DoubleReceivePreventionToken", new C7686(interfaceC5925Mo94762, interfaceC5919M94712));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9085(ContinuationImpl continuationImpl) {
        ApplicationReceiveFunctionsKt$receive$2 applicationReceiveFunctionsKt$receive$2;
        if (continuationImpl instanceof ApplicationReceiveFunctionsKt$receive$2) {
            applicationReceiveFunctionsKt$receive$2 = (ApplicationReceiveFunctionsKt$receive$2) continuationImpl;
            int i = applicationReceiveFunctionsKt$receive$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                applicationReceiveFunctionsKt$receive$2.label = i - Integer.MIN_VALUE;
            } else {
                applicationReceiveFunctionsKt$receive$2 = new ApplicationReceiveFunctionsKt$receive$2(continuationImpl);
            }
        }
        Object obj = applicationReceiveFunctionsKt$receive$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = applicationReceiveFunctionsKt$receive$2.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        obj.getClass();
        return obj;
    }
}
