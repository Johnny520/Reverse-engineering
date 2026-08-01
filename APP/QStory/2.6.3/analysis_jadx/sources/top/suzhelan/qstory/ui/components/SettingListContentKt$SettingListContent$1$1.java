package top.suzhelan.qstory.ui.components;

import androidx.compose.foundation.lazy.C0741;
import androidx.compose.foundation.lazy.C0749;
import androidx.compose.runtime.InterfaceC1398;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p287.AbstractC8405;
import p350.InterfaceC8854;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.suzhelan.qstory.ui.components.SettingListContentKt$SettingListContent$1$1", f = "SettingListContent.kt", l = {87, 88, 91, 93, 96, 99}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class SettingListContentKt$SettingListContent$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ List<InterfaceC8854> $entries;
    final /* synthetic */ InterfaceC1398 $flashingIndex$delegate;
    final /* synthetic */ int $highlightIndex;
    final /* synthetic */ C0741 $listState;
    final /* synthetic */ InterfaceC6543 $onHighlightConsumed;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SettingListContentKt$SettingListContent$1$1(int i, List<? extends InterfaceC8854> list, C0741 c0741, InterfaceC6543 interfaceC6543, InterfaceC1398 interfaceC1398, InterfaceC4357<? super SettingListContentKt$SettingListContent$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$highlightIndex = i;
        this.$entries = list;
        this.$listState = c0741;
        this.$onHighlightConsumed = interfaceC6543;
        this.$flashingIndex$delegate = interfaceC1398;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(C0741 c0741, int i) {
        List list = c0741.m1551().f2213;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C0749) it.next()).f2162 == i) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new SettingListContentKt$SettingListContent$1$1(this.$highlightIndex, this.$entries, this.$listState, this.$onHighlightConsumed, this.$flashingIndex$delegate, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((SettingListContentKt$SettingListContent$1$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        if (kotlinx.coroutines.AbstractC5399.m10499(120, r13) != r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00e7 -> B:40:0x00e9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00eb -> B:42:0x00ed). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.qstory.ui.components.SettingListContentKt$SettingListContent$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: top.suzhelan.qstory.ui.components.SettingListContentKt$SettingListContent$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 3, 0}, xi = 50)
    @InterfaceC6862(c = "top.suzhelan.qstory.ui.components.SettingListContentKt$SettingListContent$1$1$2", f = "SettingListContent.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6554 {
        /* synthetic */ boolean Z$0;
        int label;

        public AnonymousClass2(InterfaceC4357<? super AnonymousClass2> interfaceC4357) {
            super(2, interfaceC4357);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(interfaceC4357);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        public final Object invoke(boolean z, InterfaceC4357<? super Boolean> interfaceC4357) {
            return ((AnonymousClass2) create(Boolean.valueOf(z), interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                AbstractC5185.m10210(obj);
                return Boolean.valueOf(z);
            }
            C5925.m11311(AbstractC8405.m13972(1261));
            return null;
        }

        @Override // p052.InterfaceC6554
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC4357<? super Boolean>) obj2);
        }
    }
}
