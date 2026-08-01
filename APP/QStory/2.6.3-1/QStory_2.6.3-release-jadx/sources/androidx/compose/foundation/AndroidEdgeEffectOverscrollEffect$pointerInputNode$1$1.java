package androidx.compose.foundation;

import androidx.compose.foundation.gestures.AbstractC1344;
import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2456;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1", m556f = "AndroidOverscroll.android.kt", m557l = {788, 792}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1 extends RestrictedSuspendLambda implements InterfaceC7383 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C1890 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1(C1890 c1890, InterfaceC5189<? super AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1890;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1 androidEdgeEffectOverscrollEffect$pointerInputNode$1$1 = new AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1(this.this$0, interfaceC5189);
        androidEdgeEffectOverscrollEffect$pointerInputNode$1$1.L$0 = obj;
        return androidEdgeEffectOverscrollEffect$pointerInputNode$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r13 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r13 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004a -> B:17:0x004d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2468 interfaceC2468;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            interfaceC2468 = (InterfaceC2468) this.L$0;
            this.L$0 = interfaceC2468;
            this.label = 1;
            obj = AbstractC1344.m1835(interfaceC2468, null, this, 2);
        } else if (i == 1) {
            interfaceC2468 = (InterfaceC2468) this.L$0;
            AbstractC6017.m10769(obj);
        } else {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC2468 = (InterfaceC2468) this.L$0;
            AbstractC6017.m10769(obj);
            List list = ((C2487) obj).f5197;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Object obj3 = list.get(i3);
                if (((C2478) obj3).f5151) {
                    arrayList.add(obj3);
                }
            }
            C1890 c1890 = this.this$0;
            int size2 = arrayList.size();
            while (true) {
                if (i2 >= size2) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i2);
                if (AbstractC2481.m3586(((C2478) obj2).f5154, c1890.f3453)) {
                    break;
                }
                i2++;
            }
            C2478 c2478 = (C2478) obj2;
            if (c2478 == null) {
                c2478 = (C2478) AbstractC5176.m9374(arrayList);
            }
            if (c2478 != null) {
                C1890 c18902 = this.this$0;
                c18902.f3453 = c2478.f5154;
                c18902.f3451 = c2478.f5152;
            }
            if (arrayList.isEmpty()) {
                this.this$0.f3453 = -1L;
                return C6008.f15084;
            }
            this.L$0 = interfaceC2468;
            this.label = 2;
            obj = ((C2456) interfaceC2468).m3559(PointerEventPass.Main, this);
        }
        C2478 c24782 = (C2478) obj;
        C1890 c18903 = this.this$0;
        c18903.f3453 = c24782.f5154;
        c18903.f3451 = c24782.f5152;
        this.L$0 = interfaceC2468;
        this.label = 2;
        obj = ((C2456) interfaceC2468).m3559(PointerEventPass.Main, this);
    }
}
