package io.ktor.client.plugins.cache;

import kotlin.AbstractC6017;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.p010io.AbstractC6310;
import kotlinx.p010io.InterfaceC6313;

/* JADX INFO: renamed from: io.ktor.client.plugins.cache.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4724 {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8837(ContinuationImpl continuationImpl) {
        HttpCacheEntryKt$HttpCacheEntry$1 httpCacheEntryKt$HttpCacheEntry$1;
        if (continuationImpl instanceof HttpCacheEntryKt$HttpCacheEntry$1) {
            httpCacheEntryKt$HttpCacheEntry$1 = (HttpCacheEntryKt$HttpCacheEntry$1) continuationImpl;
            int i = httpCacheEntryKt$HttpCacheEntry$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                httpCacheEntryKt$HttpCacheEntry$1.label = i - Integer.MIN_VALUE;
            } else {
                httpCacheEntryKt$HttpCacheEntry$1 = new HttpCacheEntryKt$HttpCacheEntry$1(continuationImpl);
            }
        }
        Object obj = httpCacheEntryKt$HttpCacheEntry$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = httpCacheEntryKt$HttpCacheEntry$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (httpCacheEntryKt$HttpCacheEntry$1.L$0 != null) {
            throw new ClassCastException();
        }
        AbstractC6017.m10769(obj);
        AbstractC6310.m11190((InterfaceC6313) obj);
        throw null;
    }
}
