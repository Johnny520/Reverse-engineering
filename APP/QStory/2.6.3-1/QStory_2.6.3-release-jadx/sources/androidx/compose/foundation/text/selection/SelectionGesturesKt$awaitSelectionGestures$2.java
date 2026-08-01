package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.AbstractC1309;
import androidx.compose.foundation.text.InterfaceC1851;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.platform.InterfaceC2698;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitSelectionGestures$2", m556f = "SelectionGestures.kt", m557l = {111, 119, 122, 124}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class SelectionGesturesKt$awaitSelectionGestures$2 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C1765 $clicksCounter;
    final /* synthetic */ InterfaceC1764 $mouseSelectionObserver;
    final /* synthetic */ InterfaceC1851 $textDragObserver;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$awaitSelectionGestures$2(C1765 c1765, InterfaceC1764 interfaceC1764, InterfaceC1851 interfaceC1851, InterfaceC5189<? super SelectionGesturesKt$awaitSelectionGestures$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$clicksCounter = c1765;
        this.$mouseSelectionObserver = interfaceC1764;
        this.$textDragObserver = interfaceC1851;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        SelectionGesturesKt$awaitSelectionGestures$2 selectionGesturesKt$awaitSelectionGestures$2 = new SelectionGesturesKt$awaitSelectionGestures$2(this.$clicksCounter, this.$mouseSelectionObserver, this.$textDragObserver, interfaceC5189);
        selectionGesturesKt$awaitSelectionGestures$2.L$0 = obj;
        return selectionGesturesKt$awaitSelectionGestures$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SelectionGesturesKt$awaitSelectionGestures$2) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    
        if (androidx.compose.foundation.text.selection.AbstractC1733.m2370(r2, r3, r4, r8, r18) != r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c8, code lost:
    
        if (androidx.compose.foundation.text.selection.AbstractC1733.m2371(r2, r4, r8, r18) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d4, code lost:
    
        if (androidx.compose.foundation.text.selection.AbstractC1733.m2374(r2, r4, r8, r3, r18) == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2468 interfaceC2468;
        Object objM2375;
        boolean zM2360;
        int size;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            interfaceC2468 = (InterfaceC2468) this.L$0;
            this.L$0 = interfaceC2468;
            this.label = 1;
            objM2375 = AbstractC1733.m2375(interfaceC2468, this);
            if (objM2375 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2 || i2 == 3 || i2 == 4) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        interfaceC2468 = (InterfaceC2468) this.L$0;
        AbstractC6017.m10769(obj);
        objM2375 = obj;
        C2487 c2487 = (C2487) objM2375;
        C1765 c1765 = this.$clicksCounter;
        InterfaceC2698 interfaceC2698 = c1765.f2981;
        C2478 c2478 = c1765.f2979;
        C2478 c24782 = (C2478) c2487.f5197.get(0);
        if (c2478 != null && c24782.f5153 - c2478.f5153 < interfaceC2698.mo3841()) {
            if (C8158.m13086(C8158.m13085(c2478.f5152, c24782.f5152)) < AbstractC1309.m1804(interfaceC2698, c2478.f5164)) {
                c1765.f2980++;
            }
            c1765.f2979 = c24782;
            zM2360 = AbstractC1732.m2360(c2487);
            if (zM2360 && (c2487.f5194 & 33) != 0) {
                List list = c2487.f5197;
                size = list.size();
                for (i = 0; i < size; i++) {
                    if (!((C2478) list.get(i)).m3582()) {
                    }
                }
                InterfaceC1764 interfaceC1764 = this.$mouseSelectionObserver;
                C1765 c17652 = this.$clicksCounter;
                this.L$0 = null;
                this.label = 2;
            }
            if (!zM2360) {
                int i3 = this.$clicksCounter.f2980;
                InterfaceC1851 interfaceC1851 = this.$textDragObserver;
                if (i3 == 1) {
                    this.L$0 = null;
                    this.label = 3;
                } else {
                    this.L$0 = null;
                    this.label = 4;
                }
            }
            return C6008.f15084;
        }
        c1765.f2980 = 1;
        c1765.f2979 = c24782;
        zM2360 = AbstractC1732.m2360(c2487);
        if (zM2360) {
            List list2 = c2487.f5197;
            size = list2.size();
            while (i < size) {
            }
            InterfaceC1764 interfaceC17642 = this.$mouseSelectionObserver;
            C1765 c176522 = this.$clicksCounter;
            this.L$0 = null;
            this.label = 2;
        }
        if (!zM2360) {
        }
        return C6008.f15084;
    }
}
