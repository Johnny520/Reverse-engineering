package androidx.compose.foundation.text.contextmenu.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import androidx.compose.foundation.text.contextmenu.provider.InterfaceC0827;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.coroutines.channels.C5190;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider$showTextContextMenu$2", f = "AndroidTextContextMenuToolbarProvider.android.kt", l = {182}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
final class AndroidTextContextMenuToolbarProvider$showTextContextMenu$2 extends SuspendLambda implements InterfaceC6558 {
    final /* synthetic */ InterfaceC0827 $dataProvider;
    int label;
    final /* synthetic */ C0814 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidTextContextMenuToolbarProvider$showTextContextMenu$2(C0814 c0814, InterfaceC0827 interfaceC0827, InterfaceC4357<? super AndroidTextContextMenuToolbarProvider$showTextContextMenu$2> interfaceC4357) {
        super(1, interfaceC4357);
        this.this$0 = c0814;
        this.$dataProvider = interfaceC0827;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(C0814 c0814, InterfaceC0790 interfaceC0790, C0810 c0810) {
        ActionMode actionModeStartActionMode = c0814.f2325.startActionMode(new ActionModeCallbackC0799(interfaceC0790), 1);
        AbstractC4395.m8907(c0814.f2326, actionModeStartActionMode);
        if (actionModeStartActionMode == null) {
            c0810.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(C0814 c0814) {
        ActionMode actionMode = c0814.f2326;
        if (actionMode != null) {
            actionMode.finish();
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(InterfaceC4357<?> interfaceC4357) {
        return new AndroidTextContextMenuToolbarProvider$showTextContextMenu$2(this.this$0, this.$dataProvider, interfaceC4357);
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(InterfaceC4357<? super C5176> interfaceC4357) {
        return ((AndroidTextContextMenuToolbarProvider$showTextContextMenu$2) create(interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v16, types: [androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪苏世兰哲] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r6v8, types: [android.view.View] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC0790 interfaceC0790;
        Looper looperMyLooper;
        Handler handler;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 0;
        C5176 c5176 = C5176.f14739;
        int i3 = 1;
        try {
            if (i == 0) {
                AbstractC5185.m10210(obj);
                final C0810 c0810 = new C0810();
                C0814 c0814 = this.this$0;
                InterfaceC0827 interfaceC0827 = this.$dataProvider;
                c0814.getClass();
                final InterfaceC0790 c0791 = new C0791(c0810, new C0795(c0814, interfaceC0827, i2), new C0795(c0814, interfaceC0827, i3), c0814.f2325);
                InterfaceC6558 interfaceC6558 = c0814.f2324;
                if (interfaceC6558 != null && (interfaceC0790 = (InterfaceC0790) interfaceC6558.invoke(c0791)) != null) {
                    c0791 = interfaceC0790;
                }
                Looper looperMyLooper2 = Looper.myLooper();
                Handler handler2 = this.this$0.f2325.getHandler();
                Looper looper = handler2 != null ? handler2.getLooper() : null;
                final C0814 c08142 = this.this$0;
                if (looperMyLooper2 != looper) {
                    RunnableC0809 runnableC0809 = c08142.f2328;
                    ?? r1 = runnableC0809;
                    if (runnableC0809 == null) {
                        ?? r12 = new Runnable() { // from class: androidx.compose.foundation.text.contextmenu.internal.飘花落叶言子楪苏世兰哲
                            @Override // java.lang.Runnable
                            public final void run() {
                                AndroidTextContextMenuToolbarProvider$showTextContextMenu$2.invokeSuspend$lambda$0(c08142, c0791, c0810);
                            }
                        };
                        c08142.f2328 = r12;
                        r1 = r12;
                    }
                    c08142.f2325.post(r1);
                } else {
                    ActionMode actionModeStartActionMode = c08142.f2325.startActionMode(new ActionModeCallbackC0799(c0791), 1);
                    if (actionModeStartActionMode == null) {
                        return c5176;
                    }
                    c08142.f2326 = actionModeStartActionMode;
                }
                this.label = 1;
                C5190 c5190 = c0810.f2311;
                c5190.getClass();
                Object objM10222 = C5190.m10222(c5190, this);
                if (objM10222 != coroutineSingletons) {
                    objM10222 = c5176;
                }
                if (objM10222 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5185.m10210(obj);
            }
            Looper looper2 = handler != null ? handler.getLooper() : null;
            C0814 c08143 = this.this$0;
            if (looperMyLooper != looper2) {
                Runnable runnableC0813 = c08143.f2329;
                if (runnableC0813 == null) {
                    runnableC0813 = new RunnableC0813(c08143, i2);
                    c08143.f2329 = runnableC0813;
                }
                c08143.f2325.post(runnableC0813);
            } else {
                ActionMode actionMode = c08143.f2326;
                if (actionMode != null) {
                    actionMode.finish();
                }
            }
            C0814 c08144 = this.this$0;
            RunnableC0809 runnableC08092 = c08144.f2328;
            if (runnableC08092 != null) {
                c08144.f2325.removeCallbacks(runnableC08092);
            }
            this.this$0.f2326 = null;
            return c5176;
        } finally {
            this.this$0.f2321.m2248();
            Looper looperMyLooper3 = Looper.myLooper();
            Handler handler3 = this.this$0.f2325.getHandler();
            Looper looper3 = handler3 != null ? handler3.getLooper() : null;
            C0814 c08145 = this.this$0;
            if (looperMyLooper3 != looper3) {
                Runnable runnableC08132 = c08145.f2329;
                if (runnableC08132 == null) {
                    runnableC08132 = new RunnableC0813(c08145, i2);
                    c08145.f2329 = runnableC08132;
                }
                c08145.f2325.post(runnableC08132);
            } else {
                ActionMode actionMode2 = c08145.f2326;
                if (actionMode2 != null) {
                    actionMode2.finish();
                }
            }
            C0814 c08146 = this.this$0;
            RunnableC0809 runnableC08093 = c08146.f2328;
            if (runnableC08093 != null) {
                c08146.f2325.removeCallbacks(runnableC08093);
            }
            this.this$0.f2326 = null;
        }
    }
}
