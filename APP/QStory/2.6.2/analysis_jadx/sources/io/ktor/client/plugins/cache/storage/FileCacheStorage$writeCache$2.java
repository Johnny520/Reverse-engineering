package io.ktor.client.plugins.cache.storage;

import com.alibaba.fastjson2.C2941;
import com.android.dx.io.Opcodes;
import io.ktor.client.plugins.cache.AbstractC3890;
import io.ktor.utils.io.C4248;
import java.io.Closeable;
import java.util.List;
import kotlin.AbstractC5184;
import kotlin.AbstractC5186;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.sync.C5379;
import kotlinx.coroutines.sync.InterfaceC5382;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2", f = "FileCacheStorage.kt", l = {Opcodes.REM_FLOAT_2ADDR, 103}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0})
final class FileCacheStorage$writeCache$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ List<AbstractC3889> $caches;
    final /* synthetic */ String $urlHex;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ AbstractC3887 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileCacheStorage$writeCache$2(AbstractC3887 abstractC3887, String str, List<AbstractC3889> list, InterfaceC4356<? super FileCacheStorage$writeCache$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$urlHex = str;
        this.$caches = list;
    }

    private static final InterfaceC5382 invokeSuspend$lambda$0() {
        return new C5379();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        FileCacheStorage$writeCache$2 fileCacheStorage$writeCache$2 = new FileCacheStorage$writeCache$2(null, this.$urlHex, this.$caches, interfaceC4356);
        fileCacheStorage$writeCache$2.L$0 = obj;
        return fileCacheStorage$writeCache$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<Object> interfaceC4356) {
        return ((FileCacheStorage$writeCache$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC5382 interfaceC5382;
        Object l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            throw null;
        }
        try {
            if (i == 1) {
                if (this.L$2 != null) {
                    C2941.m6336();
                    return null;
                }
                InterfaceC5382 interfaceC53822 = (InterfaceC5382) this.L$1;
                AbstractC5184.m10206(obj);
                try {
                    new C4248(false);
                    try {
                        throw null;
                    } catch (Exception e) {
                        e = e;
                        interfaceC5382 = interfaceC53822;
                    }
                } catch (Throwable th) {
                    th = th;
                    this = interfaceC53822;
                    ((C5379) this).m10428(null);
                    throw th;
                }
            } else {
                if (i != 2) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Closeable closeable = (Closeable) this.L$1;
                interfaceC5382 = (InterfaceC5382) this.L$0;
                try {
                    try {
                        AbstractC5184.m10206(obj);
                        l = new Long(((Number) obj).longValue());
                        if (closeable != null) {
                            closeable.close();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        AbstractC3890.f12090.trace("Exception during saving a cache to a file: ".concat(AbstractC5186.m10209(e)));
                        l = C5175.f14739;
                    }
                    ((C5379) interfaceC5382).m10428(null);
                    return l;
                } finally {
                }
            }
            AbstractC3890.f12090.trace("Exception during saving a cache to a file: ".concat(AbstractC5186.m10209(e)));
            l = C5175.f14739;
            ((C5379) interfaceC5382).m10428(null);
            return l;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
