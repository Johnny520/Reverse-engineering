package androidx.compose.foundation.gestures;

import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2456;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", m556f = "TapGestureDetector.kt", m557l = {412, 435}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class TapGestureDetectorKt$waitForLongPress$2 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ PointerEventPass $pass;
    final /* synthetic */ Ref$ObjectRef<AbstractC1383> $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$waitForLongPress$2(PointerEventPass pointerEventPass, Ref$ObjectRef<AbstractC1383> ref$ObjectRef, InterfaceC5189<? super TapGestureDetectorKt$waitForLongPress$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$pass = pointerEventPass;
        this.$result = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        TapGestureDetectorKt$waitForLongPress$2 tapGestureDetectorKt$waitForLongPress$2 = new TapGestureDetectorKt$waitForLongPress$2(this.$pass, this.$result, interfaceC5189);
        tapGestureDetectorKt$waitForLongPress$2.L$0 = obj;
        return tapGestureDetectorKt$waitForLongPress$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((TapGestureDetectorKt$waitForLongPress$2) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r15.f5195 != 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        r14.$result.element = androidx.compose.foundation.gestures.C1384.f1913;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        r15 = r6.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r7 >= r15) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        r8 = (androidx.compose.p001ui.input.pointer.C2478) r6.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r8.m3582() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (androidx.compose.p001ui.input.pointer.AbstractC2481.m3585(r8, ((androidx.compose.p001ui.input.pointer.C2456) r1).f5086.f5098, ((androidx.compose.p001ui.input.pointer.C2456) r1).m3558()) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        r14.$result.element = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        r15 = androidx.compose.p001ui.input.pointer.PointerEventPass.Final;
        r14.L$0 = r1;
        r14.label = 2;
        r1 = (androidx.compose.p001ui.input.pointer.C2456) r1;
        r15 = r1.m3559(r15, r14);
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
    
        if (r15 != r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b9, code lost:
    
        r14.$result.element = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
    
        return kotlin.C6008.f15084;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v10, types: [T, androidx.compose.foundation.gestures.飘花落叶言子苏世兰楪哲] */
    /* JADX WARN: Type inference failed for: r15v5, types: [T, androidx.compose.foundation.gestures.飘花落叶言子苏世哲兰楪] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, androidx.compose.foundation.gestures.飘花落叶言子苏世哲楪兰] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009f -> B:34:0x00a2). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2468 interfaceC2468;
        int size;
        int i;
        InterfaceC2468 interfaceC24682;
        Object objM3559;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        ?? r2 = C1386.f1915;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            interfaceC24682 = (InterfaceC2468) this.L$0;
            PointerEventPass pointerEventPass = this.$pass;
            this.L$0 = interfaceC24682;
            this.label = 1;
            C2456 c2456 = (C2456) interfaceC24682;
            objM3559 = c2456.m3559(pointerEventPass, this);
            if (objM3559 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            interfaceC2468 = (InterfaceC2468) this.L$0;
            AbstractC6017.m10769(obj);
            C2487 c2487 = (C2487) obj;
            List list = c2487.f5197;
            size = list.size();
            i = 0;
            while (true) {
                if (i >= size) {
                }
                i++;
            }
            return coroutineSingletons;
        }
        if (i2 != 2) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        InterfaceC2468 interfaceC24683 = (InterfaceC2468) this.L$0;
        AbstractC6017.m10769(obj);
        InterfaceC2468 interfaceC24684 = interfaceC24683;
        List list2 = ((C2487) obj).f5197;
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (((C2478) list2.get(i3)).m3582()) {
                break;
            }
        }
        interfaceC24682 = interfaceC24684;
        PointerEventPass pointerEventPass2 = this.$pass;
        this.L$0 = interfaceC24682;
        this.label = 1;
        C2456 c24562 = (C2456) interfaceC24682;
        objM3559 = c24562.m3559(pointerEventPass2, this);
        if (objM3559 != coroutineSingletons) {
            interfaceC2468 = c24562;
            obj = objM3559;
            C2487 c24872 = (C2487) obj;
            List list3 = c24872.f5197;
            size = list3.size();
            i = 0;
            while (true) {
                if (i >= size) {
                    this.$result.element = new C1385((C2478) list3.get(0));
                    break;
                }
                if (!AbstractC2481.m3588((C2478) list3.get(i))) {
                    break;
                }
                i++;
            }
        }
        return coroutineSingletons;
    }
}
