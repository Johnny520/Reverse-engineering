package androidx.window.area;

import androidx.window.extensions.area.ExtensionWindowAreaStatus;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.reflection.Consumer2;
import java.util.Collection;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.collections.AbstractC4344;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractC5205;
import kotlinx.coroutines.channels.C5204;
import kotlinx.coroutines.channels.InterfaceC5196;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.window.area.WindowAreaControllerImpl$windowAreaInfos$1", f = "WindowAreaControllerImpl.kt", l = {92}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "", "Landroidx/window/area/飘花落叶言子楪哲世兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class WindowAreaControllerImpl$windowAreaInfos$1 extends SuspendLambda implements InterfaceC6554 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C2569 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowAreaControllerImpl$windowAreaInfos$1(C2569 c2569, InterfaceC4357<? super WindowAreaControllerImpl$windowAreaInfos$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c2569;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(C2569 c2569, InterfaceC5196 interfaceC5196, int i) {
        int i2 = C2569.f7724;
        c2569.m5097(i);
        C5204 c5204 = (C5204) interfaceC5196;
        c5204.getClass();
        Collection collectionValues = c2569.f7725.values();
        collectionValues.getClass();
        c5204.mo8436(AbstractC4344.m8797(collectionValues));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(C2569 c2569, InterfaceC5196 interfaceC5196, ExtensionWindowAreaStatus extensionWindowAreaStatus) {
        int i = C2569.f7724;
        c2569.m5096(extensionWindowAreaStatus);
        C5204 c5204 = (C5204) interfaceC5196;
        c5204.getClass();
        Collection collectionValues = c2569.f7725.values();
        collectionValues.getClass();
        c5204.mo8436(AbstractC4344.m8797(collectionValues));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$2(C2569 c2569, Consumer2 consumer2, Consumer2 consumer22) {
        c2569.f7727.removeRearDisplayStatusListener(consumer2);
        c2569.f7727.removeRearDisplayPresentationStatusListener(consumer22);
        return C5176.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        WindowAreaControllerImpl$windowAreaInfos$1 windowAreaControllerImpl$windowAreaInfos$1 = new WindowAreaControllerImpl$windowAreaInfos$1(this.this$0, interfaceC4357);
        windowAreaControllerImpl$windowAreaInfos$1.L$0 = obj;
        return windowAreaControllerImpl$windowAreaInfos$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5196 interfaceC5196, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((WindowAreaControllerImpl$windowAreaInfos$1) create(interfaceC5196, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.window.area.飘花落叶言子楪苏哲世兰] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.window.area.飘花落叶言子楪苏哲兰世] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            final InterfaceC5196 interfaceC5196 = (InterfaceC5196) this.L$0;
            final C2569 c2569 = this.this$0;
            final ?? r3 = new Consumer2() { // from class: androidx.window.area.飘花落叶言子楪苏哲世兰
                @Override // androidx.window.reflection.Consumer2
                public final void accept(Object obj2) {
                    WindowAreaControllerImpl$windowAreaInfos$1.invokeSuspend$lambda$0(c2569, interfaceC5196, ((Integer) obj2).intValue());
                }
            };
            final C2569 c25692 = this.this$0;
            final ?? r4 = new Consumer2() { // from class: androidx.window.area.飘花落叶言子楪苏哲兰世
                @Override // androidx.window.reflection.Consumer2
                public final void accept(Object obj2) {
                    WindowAreaControllerImpl$windowAreaInfos$1.invokeSuspend$lambda$1(c25692, interfaceC5196, (ExtensionWindowAreaStatus) obj2);
                }
            };
            this.this$0.f7727.addRearDisplayStatusListener((Consumer) r3);
            this.this$0.f7727.addRearDisplayPresentationStatusListener((Consumer) r4);
            final C2569 c25693 = this.this$0;
            InterfaceC6543 interfaceC6543 = new InterfaceC6543() { // from class: androidx.window.area.飘花落叶言子楪苏兰世哲
                @Override // p052.InterfaceC6543
                public final Object invoke() {
                    return WindowAreaControllerImpl$windowAreaInfos$1.invokeSuspend$lambda$2(c25693, r3, r4);
                }
            };
            this.label = 1;
            if (AbstractC5205.m10279(interfaceC5196, interfaceC6543, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
