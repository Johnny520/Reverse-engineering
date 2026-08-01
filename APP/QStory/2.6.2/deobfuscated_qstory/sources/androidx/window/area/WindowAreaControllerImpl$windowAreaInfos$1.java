package androidx.window.area;

import androidx.window.extensions.area.ExtensionWindowAreaStatus;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.reflection.Consumer2;
import java.util.Collection;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.collections.AbstractC4343;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractC5204;
import kotlinx.coroutines.channels.C5203;
import kotlinx.coroutines.channels.InterfaceC5195;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.window.area.WindowAreaControllerImpl$windowAreaInfos$1", f = "WindowAreaControllerImpl.kt", l = {92}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "", "Landroidx/window/area/飘花落叶言子楪哲世苏兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class WindowAreaControllerImpl$windowAreaInfos$1 extends SuspendLambda implements InterfaceC6553 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C2567 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowAreaControllerImpl$windowAreaInfos$1(C2567 c2567, InterfaceC4356<? super WindowAreaControllerImpl$windowAreaInfos$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c2567;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(C2567 c2567, InterfaceC5195 interfaceC5195, int i) {
        int i2 = C2567.f7720;
        c2567.m5052(i);
        C5203 c5203 = (C5203) interfaceC5195;
        c5203.getClass();
        Collection collectionValues = c2567.f7721.values();
        collectionValues.getClass();
        c5203.mo8445(AbstractC4343.m8804(collectionValues));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(C2567 c2567, InterfaceC5195 interfaceC5195, ExtensionWindowAreaStatus extensionWindowAreaStatus) {
        int i = C2567.f7720;
        c2567.m5051(extensionWindowAreaStatus);
        C5203 c5203 = (C5203) interfaceC5195;
        c5203.getClass();
        Collection collectionValues = c2567.f7721.values();
        collectionValues.getClass();
        c5203.mo8445(AbstractC4343.m8804(collectionValues));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$2(C2567 c2567, Consumer2 consumer2, Consumer2 consumer22) {
        c2567.f7723.removeRearDisplayStatusListener(consumer2);
        c2567.f7723.removeRearDisplayPresentationStatusListener(consumer22);
        return C5175.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        WindowAreaControllerImpl$windowAreaInfos$1 windowAreaControllerImpl$windowAreaInfos$1 = new WindowAreaControllerImpl$windowAreaInfos$1(this.this$0, interfaceC4356);
        windowAreaControllerImpl$windowAreaInfos$1.L$0 = obj;
        return windowAreaControllerImpl$windowAreaInfos$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5195 interfaceC5195, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((WindowAreaControllerImpl$windowAreaInfos$1) create(interfaceC5195, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.window.area.飘花落叶言子楪苏世兰哲] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.window.area.飘花落叶言子楪苏哲世兰] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            final InterfaceC5195 interfaceC5195 = (InterfaceC5195) this.L$0;
            final C2567 c2567 = this.this$0;
            final ?? r3 = new Consumer2() { // from class: androidx.window.area.飘花落叶言子楪苏世兰哲
                @Override // androidx.window.reflection.Consumer2
                public final void accept(Object obj2) {
                    WindowAreaControllerImpl$windowAreaInfos$1.invokeSuspend$lambda$0(c2567, interfaceC5195, ((Integer) obj2).intValue());
                }
            };
            final C2567 c25672 = this.this$0;
            final ?? r4 = new Consumer2() { // from class: androidx.window.area.飘花落叶言子楪苏哲世兰
                @Override // androidx.window.reflection.Consumer2
                public final void accept(Object obj2) {
                    WindowAreaControllerImpl$windowAreaInfos$1.invokeSuspend$lambda$1(c25672, interfaceC5195, (ExtensionWindowAreaStatus) obj2);
                }
            };
            this.this$0.f7723.addRearDisplayStatusListener((Consumer) r3);
            this.this$0.f7723.addRearDisplayPresentationStatusListener((Consumer) r4);
            final C2567 c25673 = this.this$0;
            InterfaceC6542 interfaceC6542 = new InterfaceC6542() { // from class: androidx.window.area.飘花落叶言子楪苏哲兰世
                @Override // p052.InterfaceC6542
                public final Object invoke() {
                    return WindowAreaControllerImpl$windowAreaInfos$1.invokeSuspend$lambda$2(c25673, r3, r4);
                }
            };
            this.label = 1;
            if (AbstractC5204.m10275(interfaceC5195, interfaceC6542, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
