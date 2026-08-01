package top.suzhelan.qstory.ui.components;

import androidx.compose.foundation.lazy.C0741;
import androidx.compose.foundation.lazy.C0749;
import androidx.compose.runtime.InterfaceC1398;
import com.bumptech.glide.AbstractC3056;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p354.InterfaceC8886;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "top.suzhelan.qstory.ui.components.SettingListContentKt$SettingListContent$1$1", f = "SettingListContent.kt", l = {87, 88, 91, 93, 96, 99}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class SettingListContentKt$SettingListContent$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ List<InterfaceC8886> $entries;
    final /* synthetic */ InterfaceC1398 $flashingIndex$delegate;
    final /* synthetic */ int $highlightIndex;
    final /* synthetic */ C0741 $listState;
    final /* synthetic */ InterfaceC6542 $onHighlightConsumed;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SettingListContentKt$SettingListContent$1$1(int i, List<? extends InterfaceC8886> list, C0741 c0741, InterfaceC6542 interfaceC6542, InterfaceC1398 interfaceC1398, InterfaceC4356<? super SettingListContentKt$SettingListContent$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$highlightIndex = i;
        this.$entries = list;
        this.$listState = c0741;
        this.$onHighlightConsumed = interfaceC6542;
        this.$flashingIndex$delegate = interfaceC1398;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(C0741 c0741, int i) {
        List list = c0741.m1541().f2212;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C0749) it.next()).f2161 == i) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new SettingListContentKt$SettingListContent$1$1(this.$highlightIndex, this.$entries, this.$listState, this.$onHighlightConsumed, this.$flashingIndex$delegate, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((SettingListContentKt$SettingListContent$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
    
        if (kotlinx.coroutines.AbstractC5398.m10495(120, r13) != r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ea -> B:40:0x00ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00ee -> B:42:0x00f0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.suzhelan.qstory.ui.components.SettingListContentKt$SettingListContent$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: top.suzhelan.qstory.ui.components.SettingListContentKt$SettingListContent$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {2, 3, 0}, xi = 50)
    @InterfaceC6861(c = "top.suzhelan.qstory.ui.components.SettingListContentKt$SettingListContent$1$1$2", f = "SettingListContent.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6553 {
        /* synthetic */ boolean Z$0;
        int label;

        public AnonymousClass2(InterfaceC4356<? super AnonymousClass2> interfaceC4356) {
            super(2, interfaceC4356);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(interfaceC4356);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        public final Object invoke(boolean z, InterfaceC4356<? super Boolean> interfaceC4356) {
            return ((AnonymousClass2) create(Boolean.valueOf(z), interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                AbstractC5184.m10206(obj);
                return Boolean.valueOf(z);
            }
            C5919.m11250(AbstractC3056.m6668(-3937693499584152999L));
            return null;
        }

        @Override // p052.InterfaceC6553
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC4356<? super Boolean>) obj2);
        }
    }
}
