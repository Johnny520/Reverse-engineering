package io.ktor.client.plugins.cache.storage;

import com.alibaba.fastjson2.C3775;
import com.android.p002dx.p005io.Opcodes;
import io.ktor.client.plugins.cache.AbstractC4723;
import io.ktor.utils.p007io.C5081;
import java.io.Closeable;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.AbstractC6019;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.sync.C6212;
import kotlinx.coroutines.sync.InterfaceC6215;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2", m556f = "FileCacheStorage.kt", m557l = {Opcodes.REM_FLOAT_2ADDR, 103}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Ljava/lang/Object;"}, m152k = 3, m153mv = {2, 0, 0})
final class FileCacheStorage$writeCache$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ List<AbstractC4722> $caches;
    final /* synthetic */ String $urlHex;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ AbstractC4720 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileCacheStorage$writeCache$2(AbstractC4720 abstractC4720, String str, List<AbstractC4722> list, InterfaceC5189<? super FileCacheStorage$writeCache$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$urlHex = str;
        this.$caches = list;
    }

    private static final InterfaceC6215 invokeSuspend$lambda$0() {
        return new C6212();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        FileCacheStorage$writeCache$2 fileCacheStorage$writeCache$2 = new FileCacheStorage$writeCache$2(null, this.$urlHex, this.$caches, interfaceC5189);
        fileCacheStorage$writeCache$2.L$0 = obj;
        return fileCacheStorage$writeCache$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<Object> interfaceC5189) {
        return ((FileCacheStorage$writeCache$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC6215 interfaceC6215;
        Object l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        try {
            if (i == 1) {
                if (this.L$2 != null) {
                    C3775.m6954();
                    return null;
                }
                InterfaceC6215 interfaceC62152 = (InterfaceC6215) this.L$1;
                AbstractC6017.m10769(obj);
                try {
                    new C5081(false);
                    try {
                        throw null;
                    } catch (Exception e) {
                        e = e;
                        interfaceC6215 = interfaceC62152;
                    }
                } catch (Throwable th) {
                    th = th;
                    this = interfaceC62152;
                    ((C6212) this).m10991(null);
                    throw th;
                }
            } else {
                if (i != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Closeable closeable = (Closeable) this.L$1;
                interfaceC6215 = (InterfaceC6215) this.L$0;
                try {
                    try {
                        AbstractC6017.m10769(obj);
                        l = new Long(((Number) obj).longValue());
                        if (closeable != null) {
                            closeable.close();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        AbstractC4723.f12440.trace("Exception during saving a cache to a file: ".concat(AbstractC6019.m10772(e)));
                        l = C6008.f15084;
                    }
                    ((C6212) interfaceC6215).m10991(null);
                    return l;
                } finally {
                }
            }
            AbstractC4723.f12440.trace("Exception during saving a cache to a file: ".concat(AbstractC6019.m10772(e)));
            l = C6008.f15084;
            ((C6212) interfaceC6215).m10991(null);
            return l;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
