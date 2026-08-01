package io.ktor.client.plugins;

import com.alibaba.fastjson2.C3775;
import com.materialkolor.dynamiccolor.C4639;
import io.ktor.util.C5041;
import io.ktor.util.C5043;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import p068.InterfaceC7383;
import p075.C7686;
import p191.AbstractC8568;
import p257.InterfaceC8970;
import p414.AbstractC9968;
import p414.InterfaceC9970;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.client.plugins.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4773 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5041 f12500;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC9970 f12501;

    static {
        InterfaceC5919 interfaceC5919M9471;
        InterfaceC9970 interfaceC9970M15262 = AbstractC9968.m15262("io.ktor.client.plugins.HttpCallValidator");
        interfaceC9970M15262.getClass();
        f12501 = interfaceC9970M15262;
        AbstractC8568.m13644("HttpResponseValidator", HttpCallValidatorKt$HttpCallValidator$1.INSTANCE, new C4639(2));
        InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(Boolean.class);
        try {
            interfaceC5919M9471 = AbstractC5228.m9471(Boolean.TYPE);
        } catch (Throwable unused) {
            interfaceC5919M9471 = null;
        }
        f12500 = new C5041("ExpectSuccessAttributeKey", new C7686(interfaceC5925Mo9476, interfaceC5919M9471));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m8884(ContinuationImpl continuationImpl) {
        HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1 httpCallValidatorKt$HttpCallValidator$2$validateResponse$1;
        if (continuationImpl instanceof HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1) {
            httpCallValidatorKt$HttpCallValidator$2$validateResponse$1 = (HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1) continuationImpl;
            int i = httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.label = i - Integer.MIN_VALUE;
            } else {
                httpCallValidatorKt$HttpCallValidator$2$validateResponse$1 = new HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1(continuationImpl);
            }
        }
        Object obj = httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Iterator it = (Iterator) httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.L$1;
        if (httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.L$0 != null) {
            C3775.m6954();
            return null;
        }
        AbstractC6017.m10769(obj);
        while (it.hasNext()) {
            InterfaceC7383 interfaceC7383 = (InterfaceC7383) it.next();
            httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.L$0 = null;
            httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.L$1 = it;
            httpCallValidatorKt$HttpCallValidator$2$validateResponse$1.label = 1;
            if (interfaceC7383.invoke(null, httpCallValidatorKt$HttpCallValidator$2$validateResponse$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C6008.f15084;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8885(List list, Throwable th, InterfaceC8970 interfaceC8970, ContinuationImpl continuationImpl) {
        HttpCallValidatorKt$HttpCallValidator$2$processException$1 httpCallValidatorKt$HttpCallValidator$2$processException$1;
        Iterator it;
        if (continuationImpl instanceof HttpCallValidatorKt$HttpCallValidator$2$processException$1) {
            httpCallValidatorKt$HttpCallValidator$2$processException$1 = (HttpCallValidatorKt$HttpCallValidator$2$processException$1) continuationImpl;
            int i = httpCallValidatorKt$HttpCallValidator$2$processException$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                httpCallValidatorKt$HttpCallValidator$2$processException$1.label = i - Integer.MIN_VALUE;
            } else {
                httpCallValidatorKt$HttpCallValidator$2$processException$1 = new HttpCallValidatorKt$HttpCallValidator$2$processException$1(continuationImpl);
            }
        }
        Object obj = httpCallValidatorKt$HttpCallValidator$2$processException$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = httpCallValidatorKt$HttpCallValidator$2$processException$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            f12501.trace("Processing exception " + th + " for request " + ((C4772) interfaceC8970).f12499);
            it = list.iterator();
        } else {
            if (i2 != 1 && i2 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            it = (Iterator) httpCallValidatorKt$HttpCallValidator$2$processException$1.L$2;
            AbstractC6017.m10769(obj);
        }
        if (it.hasNext()) {
            if (it.next() == null) {
                C5043.m9170();
            } else {
                C3775.m6954();
            }
        }
    }
}
