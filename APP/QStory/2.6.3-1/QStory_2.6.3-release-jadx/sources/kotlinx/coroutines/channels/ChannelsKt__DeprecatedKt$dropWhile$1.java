package kotlinx.coroutines.channels;

import com.android.p002dx.p005io.Opcodes;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", m556f = "Deprecated.kt", m557l = {Opcodes.DIV_INT_LIT16, Opcodes.REM_INT_LIT16, Opcodes.AND_INT_LIT16, Opcodes.RSUB_INT_LIT8, Opcodes.MUL_INT_LIT8}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"E", "Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 2, 0})
final class ChannelsKt__DeprecatedKt$dropWhile$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $predicate;
    final /* synthetic */ InterfaceC6031 $this_dropWhile;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$dropWhile$1(InterfaceC6031 interfaceC6031, InterfaceC7383 interfaceC7383, InterfaceC5189 interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_dropWhile = interfaceC6031;
        this.$predicate = interfaceC7383;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ChannelsKt__DeprecatedKt$dropWhile$1 channelsKt__DeprecatedKt$dropWhile$1 = new ChannelsKt__DeprecatedKt$dropWhile$1(this.$this_dropWhile, this.$predicate, interfaceC5189);
        channelsKt__DeprecatedKt$dropWhile$1.L$0 = obj;
        return channelsKt__DeprecatedKt$dropWhile$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6028 interfaceC6028, InterfaceC5189 interfaceC5189) {
        return ((ChannelsKt__DeprecatedKt$dropWhile$1) create(interfaceC6028, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        if (((kotlinx.coroutines.channels.AbstractC6043) r0).f15143.mo8992(r2, r10) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00db, code lost:
    
        if (((kotlinx.coroutines.channels.AbstractC6043) r0).f15143.mo8992(r11, r10) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066 A[PHI: r2 r11
  0x0066: PHI (r2v1 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) = (r2v22 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世), (r2v23 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) binds: [B:19:0x0062, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x0066: PHI (r11v3 java.lang.Object) = (r11v9 java.lang.Object), (r11v0 java.lang.Object) binds: [B:19:0x0062, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc A[PHI: r2 r11
  0x00bc: PHI (r2v6 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) = (r2v20 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世), (r2v21 kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世) binds: [B:34:0x00b9, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x00bc: PHI (r11v20 java.lang.Object) = (r11v26 java.lang.Object), (r11v0 java.lang.Object) binds: [B:34:0x00b9, B:13:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0083 -> B:26:0x0086). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00db -> B:10:0x0021). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC6044 interfaceC6044;
        InterfaceC6044 it;
        InterfaceC6044 interfaceC60442;
        InterfaceC6044 it2;
        InterfaceC6233 interfaceC6233 = (InterfaceC6028) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            it = this.$this_dropWhile.iterator();
            this.L$0 = interfaceC6233;
            this.L$1 = it;
            this.L$2 = null;
            this.label = 1;
            C6023 c6023 = (C6023) it;
            obj = c6023.m10823(this);
            interfaceC6044 = c6023;
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            InterfaceC6044 interfaceC60443 = (InterfaceC6044) this.L$1;
            AbstractC6017.m10769(obj);
            interfaceC6044 = interfaceC60443;
            if (((Boolean) obj).booleanValue()) {
            }
            it2 = this.$this_dropWhile.iterator();
            this.L$0 = interfaceC6233;
            this.L$1 = it2;
            this.L$2 = null;
            this.label = 4;
            C6023 c60232 = (C6023) it2;
            obj = c60232.m10823(this);
            interfaceC60442 = c60232;
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 2) {
            Object objM10821 = this.L$2;
            InterfaceC6044 interfaceC60444 = (InterfaceC6044) this.L$1;
            AbstractC6017.m10769(obj);
            InterfaceC6044 interfaceC60445 = interfaceC60444;
            if (!((Boolean) obj).booleanValue()) {
                it = interfaceC60445;
                this.L$0 = interfaceC6233;
                this.L$1 = it;
                this.L$2 = null;
                this.label = 1;
                C6023 c60233 = (C6023) it;
                obj = c60233.m10823(this);
                interfaceC6044 = c60233;
                if (obj != coroutineSingletons) {
                    if (((Boolean) obj).booleanValue()) {
                        C6023 c60234 = (C6023) interfaceC6044;
                        objM10821 = c60234.m10821();
                        InterfaceC7383 interfaceC7383 = this.$predicate;
                        this.L$0 = interfaceC6233;
                        this.L$1 = c60234;
                        this.L$2 = objM10821;
                        this.label = 2;
                        obj = interfaceC7383.invoke(objM10821, this);
                        interfaceC60445 = c60234;
                        if (obj != coroutineSingletons) {
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    }
                    it2 = this.$this_dropWhile.iterator();
                    this.L$0 = interfaceC6233;
                    this.L$1 = it2;
                    this.L$2 = null;
                    this.label = 4;
                    C6023 c602322 = (C6023) it2;
                    obj = c602322.m10823(this);
                    interfaceC60442 = c602322;
                    if (obj != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            this.L$0 = interfaceC6233;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 3;
        } else {
            if (i == 3) {
                AbstractC6017.m10769(obj);
                it2 = this.$this_dropWhile.iterator();
                this.L$0 = interfaceC6233;
                this.L$1 = it2;
                this.L$2 = null;
                this.label = 4;
                C6023 c6023222 = (C6023) it2;
                obj = c6023222.m10823(this);
                interfaceC60442 = c6023222;
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 4) {
                if (i != 5) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                InterfaceC6044 interfaceC60446 = (InterfaceC6044) this.L$1;
                AbstractC6017.m10769(obj);
                InterfaceC6044 interfaceC60447 = interfaceC60446;
                it2 = interfaceC60447;
                this.L$0 = interfaceC6233;
                this.L$1 = it2;
                this.L$2 = null;
                this.label = 4;
                C6023 c60232222 = (C6023) it2;
                obj = c60232222.m10823(this);
                interfaceC60442 = c60232222;
                if (obj != coroutineSingletons) {
                    if (((Boolean) obj).booleanValue()) {
                        return C6008.f15084;
                    }
                    C6023 c60235 = (C6023) interfaceC60442;
                    Object objM108212 = c60235.m10821();
                    this.L$0 = interfaceC6233;
                    this.L$1 = c60235;
                    this.L$2 = null;
                    this.label = 5;
                    interfaceC60447 = c60235;
                }
                return coroutineSingletons;
            }
            InterfaceC6044 interfaceC60448 = (InterfaceC6044) this.L$1;
            AbstractC6017.m10769(obj);
            interfaceC60442 = interfaceC60448;
            if (((Boolean) obj).booleanValue()) {
            }
        }
    }
}
