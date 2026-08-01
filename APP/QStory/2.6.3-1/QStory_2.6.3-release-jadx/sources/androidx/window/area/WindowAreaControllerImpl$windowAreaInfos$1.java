package androidx.window.area;

import androidx.window.extensions.area.ExtensionWindowAreaStatus;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.reflection.Consumer2;
import java.util.Collection;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.C6036;
import kotlinx.coroutines.channels.InterfaceC6028;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.window.area.WindowAreaControllerImpl$windowAreaInfos$1", m556f = "WindowAreaControllerImpl.kt", m557l = {92}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "", "Landroidx/window/area/飘花落叶言子楪哲世兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class WindowAreaControllerImpl$windowAreaInfos$1 extends SuspendLambda implements InterfaceC7383 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C3402 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowAreaControllerImpl$windowAreaInfos$1(C3402 c3402, InterfaceC5189<? super WindowAreaControllerImpl$windowAreaInfos$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c3402;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(C3402 c3402, InterfaceC6028 interfaceC6028, int i) {
        int i2 = C3402.f8069;
        c3402.m5657(i);
        C6036 c6036 = (C6036) interfaceC6028;
        c6036.getClass();
        Collection collectionValues = c3402.f8070.values();
        collectionValues.getClass();
        c6036.mo8995(AbstractC5176.m9356(collectionValues));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(C3402 c3402, InterfaceC6028 interfaceC6028, ExtensionWindowAreaStatus extensionWindowAreaStatus) {
        int i = C3402.f8069;
        c3402.m5656(extensionWindowAreaStatus);
        C6036 c6036 = (C6036) interfaceC6028;
        c6036.getClass();
        Collection collectionValues = c3402.f8070.values();
        collectionValues.getClass();
        c6036.mo8995(AbstractC5176.m9356(collectionValues));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$2(C3402 c3402, Consumer2 consumer2, Consumer2 consumer22) {
        c3402.f8072.removeRearDisplayStatusListener(consumer2);
        c3402.f8072.removeRearDisplayPresentationStatusListener(consumer22);
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        WindowAreaControllerImpl$windowAreaInfos$1 windowAreaControllerImpl$windowAreaInfos$1 = new WindowAreaControllerImpl$windowAreaInfos$1(this.this$0, interfaceC5189);
        windowAreaControllerImpl$windowAreaInfos$1.L$0 = obj;
        return windowAreaControllerImpl$windowAreaInfos$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6028 interfaceC6028, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((WindowAreaControllerImpl$windowAreaInfos$1) create(interfaceC6028, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.window.area.飘花落叶言子楪苏哲世兰] */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.window.area.飘花落叶言子楪苏哲兰世] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            final InterfaceC6028 interfaceC6028 = (InterfaceC6028) this.L$0;
            final C3402 c3402 = this.this$0;
            final ?? r3 = new Consumer2() { // from class: androidx.window.area.飘花落叶言子楪苏哲世兰
                @Override // androidx.window.reflection.Consumer2
                public final void accept(Object obj2) {
                    WindowAreaControllerImpl$windowAreaInfos$1.invokeSuspend$lambda$0(c3402, interfaceC6028, ((Integer) obj2).intValue());
                }
            };
            final C3402 c34022 = this.this$0;
            final ?? r4 = new Consumer2() { // from class: androidx.window.area.飘花落叶言子楪苏哲兰世
                @Override // androidx.window.reflection.Consumer2
                public final void accept(Object obj2) {
                    WindowAreaControllerImpl$windowAreaInfos$1.invokeSuspend$lambda$1(c34022, interfaceC6028, (ExtensionWindowAreaStatus) obj2);
                }
            };
            this.this$0.f8072.addRearDisplayStatusListener((Consumer) r3);
            this.this$0.f8072.addRearDisplayPresentationStatusListener((Consumer) r4);
            final C3402 c34023 = this.this$0;
            InterfaceC7372 interfaceC7372 = new InterfaceC7372() { // from class: androidx.window.area.飘花落叶言子楪苏兰世哲
                @Override // p068.InterfaceC7372
                public final Object invoke() {
                    return WindowAreaControllerImpl$windowAreaInfos$1.invokeSuspend$lambda$2(c34023, r3, r4);
                }
            };
            this.label = 1;
            if (AbstractC6037.m10838(interfaceC6028, interfaceC7372, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
