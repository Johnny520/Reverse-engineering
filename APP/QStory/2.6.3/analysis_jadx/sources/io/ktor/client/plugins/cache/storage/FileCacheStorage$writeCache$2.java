package io.ktor.client.plugins.cache.storage;

import com.alibaba.fastjson2.C2942;
import com.android.dx.io.Opcodes;
import io.ktor.client.plugins.cache.AbstractC3891;
import io.ktor.utils.io.C4249;
import java.io.Closeable;
import java.util.List;
import kotlin.AbstractC5185;
import kotlin.AbstractC5187;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.sync.C5380;
import kotlinx.coroutines.sync.InterfaceC5383;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2", f = "FileCacheStorage.kt", l = {Opcodes.REM_FLOAT_2ADDR, 103}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0})
final class FileCacheStorage$writeCache$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ List<AbstractC3890> $caches;
    final /* synthetic */ String $urlHex;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ AbstractC3888 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileCacheStorage$writeCache$2(AbstractC3888 abstractC3888, String str, List<AbstractC3890> list, InterfaceC4357<? super FileCacheStorage$writeCache$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$urlHex = str;
        this.$caches = list;
    }

    private static final InterfaceC5383 invokeSuspend$lambda$0() {
        return new C5380();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        FileCacheStorage$writeCache$2 fileCacheStorage$writeCache$2 = new FileCacheStorage$writeCache$2(null, this.$urlHex, this.$caches, interfaceC4357);
        fileCacheStorage$writeCache$2.L$0 = obj;
        return fileCacheStorage$writeCache$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<Object> interfaceC4357) {
        return ((FileCacheStorage$writeCache$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC5383 interfaceC5383;
        Object l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            throw null;
        }
        try {
            if (i == 1) {
                if (this.L$2 != null) {
                    C2942.m6394();
                    return null;
                }
                InterfaceC5383 interfaceC53832 = (InterfaceC5383) this.L$1;
                AbstractC5185.m10210(obj);
                try {
                    new C4249(false);
                    try {
                        throw null;
                    } catch (Exception e) {
                        e = e;
                        interfaceC5383 = interfaceC53832;
                    }
                } catch (Throwable th) {
                    th = th;
                    this = interfaceC53832;
                    ((C5380) this).m10432(null);
                    throw th;
                }
            } else {
                if (i != 2) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Closeable closeable = (Closeable) this.L$1;
                interfaceC5383 = (InterfaceC5383) this.L$0;
                try {
                    try {
                        AbstractC5185.m10210(obj);
                        l = new Long(((Number) obj).longValue());
                        if (closeable != null) {
                            closeable.close();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        AbstractC3891.f12095.trace("Exception during saving a cache to a file: ".concat(AbstractC5187.m10213(e)));
                        l = C5176.f14739;
                    }
                    ((C5380) interfaceC5383).m10432(null);
                    return l;
                } finally {
                }
            }
            AbstractC3891.f12095.trace("Exception during saving a cache to a file: ".concat(AbstractC5187.m10213(e)));
            l = C5176.f14739;
            ((C5380) interfaceC5383).m10432(null);
            return l;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
