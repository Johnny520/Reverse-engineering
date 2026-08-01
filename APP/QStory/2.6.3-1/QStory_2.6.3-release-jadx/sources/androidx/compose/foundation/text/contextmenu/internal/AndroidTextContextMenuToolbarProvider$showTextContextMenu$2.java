package androidx.compose.foundation.text.contextmenu.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC1667;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.channels.C6022;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2", m556f = "AndroidTextContextMenuToolbarProvider.android.kt", m557l = {182}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, m152k = 3, m153mv = {2, 1, 0})
final class AndroidTextContextMenuToolbarProvider$showTextContextMenu$2 extends SuspendLambda implements InterfaceC7387 {
    final /* synthetic */ InterfaceC1667 $dataProvider;
    int label;
    final /* synthetic */ C1654 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidTextContextMenuToolbarProvider$showTextContextMenu$2(C1654 c1654, InterfaceC1667 interfaceC1667, InterfaceC5189<? super AndroidTextContextMenuToolbarProvider$showTextContextMenu$2> interfaceC5189) {
        super(1, interfaceC5189);
        this.this$0 = c1654;
        this.$dataProvider = interfaceC1667;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(C1654 c1654, InterfaceC1630 interfaceC1630, C1650 c1650) {
        ActionMode actionModeStartActionMode = c1654.f2670.startActionMode(new ActionModeCallbackC1639(interfaceC1630), 1);
        AbstractC5227.m9466(c1654.f2671, actionModeStartActionMode);
        if (actionModeStartActionMode == null) {
            c1650.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(C1654 c1654) {
        ActionMode actionMode = c1654.f2671;
        if (actionMode != null) {
            actionMode.finish();
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(InterfaceC5189<?> interfaceC5189) {
        return new AndroidTextContextMenuToolbarProvider$showTextContextMenu$2(this.this$0, this.$dataProvider, interfaceC5189);
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(InterfaceC5189<? super C6008> interfaceC5189) {
        return ((AndroidTextContextMenuToolbarProvider$showTextContextMenu$2) create(interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v16, types: [androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪苏世兰哲] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r6v8, types: [android.view.View] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC1630 interfaceC1630;
        Looper looperMyLooper;
        Handler handler;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 0;
        C6008 c6008 = C6008.f15084;
        int i3 = 1;
        try {
            if (i == 0) {
                AbstractC6017.m10769(obj);
                final C1650 c1650 = new C1650();
                C1654 c1654 = this.this$0;
                InterfaceC1667 interfaceC1667 = this.$dataProvider;
                c1654.getClass();
                final InterfaceC1630 c1631 = new C1631(c1650, new C1635(c1654, interfaceC1667, i2), new C1635(c1654, interfaceC1667, i3), c1654.f2670);
                InterfaceC7387 interfaceC7387 = c1654.f2669;
                if (interfaceC7387 != null && (interfaceC1630 = (InterfaceC1630) interfaceC7387.invoke(c1631)) != null) {
                    c1631 = interfaceC1630;
                }
                Looper looperMyLooper2 = Looper.myLooper();
                Handler handler2 = this.this$0.f2670.getHandler();
                Looper looper = handler2 != null ? handler2.getLooper() : null;
                final C1654 c16542 = this.this$0;
                if (looperMyLooper2 != looper) {
                    RunnableC1649 runnableC1649 = c16542.f2673;
                    ?? r1 = runnableC1649;
                    if (runnableC1649 == null) {
                        ?? r12 = new Runnable() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪苏世兰哲
                            @Override // java.lang.Runnable
                            public final void run() {
                                AndroidTextContextMenuToolbarProvider$showTextContextMenu$2.invokeSuspend$lambda$0(c16542, c1631, c1650);
                            }
                        };
                        c16542.f2673 = r12;
                        r1 = r12;
                    }
                    c16542.f2670.post(r1);
                } else {
                    ActionMode actionModeStartActionMode = c16542.f2670.startActionMode(new ActionModeCallbackC1639(c1631), 1);
                    if (actionModeStartActionMode == null) {
                        return c6008;
                    }
                    c16542.f2671 = actionModeStartActionMode;
                }
                this.label = 1;
                C6022 c6022 = c1650.f2656;
                c6022.getClass();
                Object objM10781 = C6022.m10781(c6022, this);
                if (objM10781 != coroutineSingletons) {
                    objM10781 = c6008;
                }
                if (objM10781 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
            }
            Looper looper2 = handler != null ? handler.getLooper() : null;
            C1654 c16543 = this.this$0;
            if (looperMyLooper != looper2) {
                Runnable runnableC1653 = c16543.f2674;
                if (runnableC1653 == null) {
                    runnableC1653 = new RunnableC1653(c16543, i2);
                    c16543.f2674 = runnableC1653;
                }
                c16543.f2670.post(runnableC1653);
            } else {
                ActionMode actionMode = c16543.f2671;
                if (actionMode != null) {
                    actionMode.finish();
                }
            }
            C1654 c16544 = this.this$0;
            RunnableC1649 runnableC16492 = c16544.f2673;
            if (runnableC16492 != null) {
                c16544.f2670.removeCallbacks(runnableC16492);
            }
            this.this$0.f2671 = null;
            return c6008;
        } finally {
            this.this$0.f2666.m2808();
            Looper looperMyLooper3 = Looper.myLooper();
            Handler handler3 = this.this$0.f2670.getHandler();
            Looper looper3 = handler3 != null ? handler3.getLooper() : null;
            C1654 c16545 = this.this$0;
            if (looperMyLooper3 != looper3) {
                Runnable runnableC16532 = c16545.f2674;
                if (runnableC16532 == null) {
                    runnableC16532 = new RunnableC1653(c16545, i2);
                    c16545.f2674 = runnableC16532;
                }
                c16545.f2670.post(runnableC16532);
            } else {
                ActionMode actionMode2 = c16545.f2671;
                if (actionMode2 != null) {
                    actionMode2.finish();
                }
            }
            C1654 c16546 = this.this$0;
            RunnableC1649 runnableC16493 = c16546.f2673;
            if (runnableC16493 != null) {
                c16546.f2670.removeCallbacks(runnableC16493);
            }
            this.this$0.f2671 = null;
        }
    }
}
