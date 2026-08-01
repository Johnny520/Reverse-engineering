package androidx.compose.foundation;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.C6022;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.MagnifierNode$onAttach$1", m556f = "Magnifier.android.kt", m557l = {382, 386}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class MagnifierNode$onAttach$1 extends SuspendLambda implements InterfaceC7383 {
    int label;
    final /* synthetic */ C1914 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagnifierNode$onAttach$1(C1914 c1914, InterfaceC5189<? super MagnifierNode$onAttach$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1914;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0(long j) {
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new MagnifierNode$onAttach$1(this.this$0, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((MagnifierNode$onAttach$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (androidx.compose.runtime.AbstractC2202.m3052(getContext()).mo2865(new androidx.compose.runtime.C2138(r7, r1), r6) == r0) goto L20;
     */
    /* JADX WARN: Path cross not found for [B:13:0x0024, B:16:0x002d], limit reached: 23 */
    /* JADX WARN: Path cross not found for [B:16:0x002d, B:13:0x0024], limit reached: 23 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0031 -> B:11:0x001e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004c -> B:21:0x004f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C6022 c6022;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            c6022 = this.this$0.f3541;
            if (c6022 != null) {
            }
            if (this.this$0.f3545 == null) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC6017.m10769(obj);
            if (this.this$0.f3545 == null) {
            }
            return coroutineSingletons;
        }
        if (i != 2) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        InterfaceC1918 interfaceC1918 = this.this$0.f3545;
        if (interfaceC1918 != null) {
            ((C1920) interfaceC1918).m2558();
        }
        c6022 = this.this$0.f3541;
        if (c6022 != null) {
            this.label = 1;
            if (C6022.m10781(c6022, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (this.this$0.f3545 == null) {
            int i2 = 0;
            C1915 c1915 = new C1915(i2);
            this.label = 2;
        } else {
            c6022 = this.this$0.f3541;
            if (c6022 != null) {
            }
            if (this.this$0.f3545 == null) {
            }
        }
        return coroutineSingletons;
    }
}
