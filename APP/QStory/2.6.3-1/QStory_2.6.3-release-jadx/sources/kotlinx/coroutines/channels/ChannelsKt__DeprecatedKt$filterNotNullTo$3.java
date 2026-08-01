package kotlinx.coroutines.channels;

import kotlin.AbstractC6017;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.InterfaceC6032;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", m556f = "Deprecated.kt", m557l = {667, 272}, m558m = "filterNotNullTo", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 2, 0}, m155xi = 48)
final class ChannelsKt__DeprecatedKt$filterNotNullTo$3<E, C extends InterfaceC6032> extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;

    public ChannelsKt__DeprecatedKt$filterNotNullTo$3(InterfaceC5189<? super ChannelsKt__DeprecatedKt$filterNotNullTo$3> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Path cross not found for [B:20:0x0072, B:23:0x0094], limit reached: 40 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062 A[Catch: all -> 0x0037, PHI: r0 r5 r6 r7 r8 r9 r12
  0x0062: PHI (r0v4 int) = (r0v3 int), (r0v5 int) binds: [B:15:0x005f, B:24:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r5v1 int) = (r5v0 int), (r5v2 int) binds: [B:15:0x005f, B:24:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r6v1 int) = (r6v0 int), (r6v2 int) binds: [B:15:0x005f, B:24:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r7v2 java.lang.Object) = (r7v11 java.lang.Object), (r7v12 java.lang.Object) binds: [B:15:0x005f, B:24:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r8v5 kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲) = (r8v4 kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲), (r8v6 kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲) binds: [B:15:0x005f, B:24:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r9v4 kotlinx.coroutines.channels.飘花落叶言子楪兰苏哲世) = (r9v3 kotlinx.coroutines.channels.飘花落叶言子楪兰苏哲世), (r9v5 kotlinx.coroutines.channels.飘花落叶言子楪兰苏哲世) binds: [B:15:0x005f, B:24:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r12v2 java.lang.Object) = (r12v0 java.lang.Object), (r12v7 java.lang.Object) binds: [B:15:0x005f, B:24:0x00b2] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0037, blocks: (B:8:0x0033, B:23:0x0094, B:16:0x0062, B:18:0x006a, B:20:0x0072, B:15:0x005f), top: B:35:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:8:0x0033, B:23:0x0094, B:16:0x0062, B:18:0x006a, B:20:0x0072, B:15:0x005f), top: B:35:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0070 -> B:23:0x0094). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0091 -> B:23:0x0094). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        InterfaceC6031 interfaceC6031;
        InterfaceC6032 interfaceC6032;
        Object obj2;
        this.result = obj;
        int i4 = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = i4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        InterfaceC6031 interfaceC60312 = null;
        if (i4 != 0) {
            try {
                if (i4 != 1) {
                    if (i4 != 2) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = this.I$2;
                    i2 = this.I$1;
                    i3 = this.I$0;
                    InterfaceC6044 interfaceC6044 = (InterfaceC6044) this.L$5;
                    interfaceC6031 = (InterfaceC6031) this.L$3;
                    interfaceC6032 = (InterfaceC6032) this.L$1;
                    AbstractC6017.m10769(obj);
                    InterfaceC6044 interfaceC60442 = interfaceC6044;
                    this.L$0 = null;
                    this.L$1 = interfaceC6032;
                    this.L$2 = null;
                    this.L$3 = interfaceC6031;
                    this.L$4 = null;
                    this.L$5 = interfaceC60442;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.I$0 = i3;
                    this.I$1 = i2;
                    this.I$2 = i;
                    this.label = 1;
                    C6023 c6023 = (C6023) interfaceC60442;
                    obj = c6023.m10823(this);
                    obj2 = c6023;
                    if (obj != coroutineSingletons) {
                        if (((Boolean) obj).booleanValue()) {
                            interfaceC6031.mo10815(null);
                            return interfaceC6032;
                        }
                        C6023 c60232 = (C6023) obj2;
                        Object objM10821 = c60232.m10821();
                        interfaceC60442 = c60232;
                        if (objM10821 != null) {
                            this.L$0 = null;
                            this.L$1 = interfaceC6032;
                            this.L$2 = null;
                            this.L$3 = interfaceC6031;
                            this.L$4 = null;
                            this.L$5 = c60232;
                            this.L$6 = null;
                            this.L$7 = null;
                            this.I$0 = i3;
                            this.I$1 = i2;
                            this.I$2 = i;
                            this.I$3 = 0;
                            this.label = 2;
                            interfaceC60442 = c60232;
                            if (interfaceC6032.mo8992(objM10821, this) == coroutineSingletons) {
                            }
                        }
                        this.L$0 = null;
                        this.L$1 = interfaceC6032;
                        this.L$2 = null;
                        this.L$3 = interfaceC6031;
                        this.L$4 = null;
                        this.L$5 = interfaceC60442;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.I$0 = i3;
                        this.I$1 = i2;
                        this.I$2 = i;
                        this.label = 1;
                        C6023 c60233 = (C6023) interfaceC60442;
                        obj = c60233.m10823(this);
                        obj2 = c60233;
                        if (obj != coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                }
                i = this.I$2;
                i2 = this.I$1;
                i3 = this.I$0;
                InterfaceC6044 interfaceC60443 = (InterfaceC6044) this.L$5;
                interfaceC6031 = (InterfaceC6031) this.L$3;
                interfaceC6032 = (InterfaceC6032) this.L$1;
                AbstractC6017.m10769(obj);
                obj2 = interfaceC60443;
                if (((Boolean) obj).booleanValue()) {
                }
            } catch (Throwable th) {
                th = th;
                interfaceC60312 = interfaceC6031;
            }
        } else {
            AbstractC6017.m10769(obj);
            try {
                throw null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        try {
            throw th;
        } catch (Throwable th3) {
            AbstractC6037.m10837(interfaceC60312, th);
            throw th3;
        }
    }
}
