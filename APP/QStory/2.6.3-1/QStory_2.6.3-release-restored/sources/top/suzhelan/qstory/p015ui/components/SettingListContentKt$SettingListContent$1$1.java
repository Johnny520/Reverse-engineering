package top.suzhelan.qstory.p015ui.components;

import androidx.compose.foundation.lazy.C1582;
import androidx.compose.foundation.lazy.C1590;
import androidx.compose.runtime.AbstractC2181;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2233;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.flow.AbstractC6154;
import kotlinx.coroutines.flow.C6116;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p366.InterfaceC9683;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.suzhelan.qstory.ui.components.SettingListContentKt$SettingListContent$1$1", m556f = "SettingListContent.kt", m557l = {87, 88, 91, 93, 96, 99}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class SettingListContentKt$SettingListContent$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ List<InterfaceC9683> $entries;
    final /* synthetic */ InterfaceC2233 $flashingIndex$delegate;
    final /* synthetic */ int $highlightIndex;
    final /* synthetic */ C1582 $listState;
    final /* synthetic */ InterfaceC7372 $onHighlightConsumed;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SettingListContentKt$SettingListContent$1$1(int i, List<? extends InterfaceC9683> list, C1582 c1582, InterfaceC7372 interfaceC7372, InterfaceC2233 interfaceC2233, InterfaceC5189<? super SettingListContentKt$SettingListContent$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$highlightIndex = i;
        this.$entries = list;
        this.$listState = c1582;
        this.$onHighlightConsumed = interfaceC7372;
        this.$flashingIndex$delegate = interfaceC2233;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(C1582 c1582, int i) {
        List list = c1582.m2111().f2558;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C1590) it.next()).f2507 == i) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new SettingListContentKt$SettingListContent$1$1(this.$highlightIndex, this.$entries, this.$listState, this.$onHighlightConsumed, this.$flashingIndex$delegate, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SettingListContentKt$SettingListContent$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
    
        if (kotlinx.coroutines.AbstractC6231.m11058(120, r13) != r0) goto L28;
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
    */
    public final Object invokeSuspend(Object obj) {
        C1582 c1582;
        int i;
        C6116 c6116M3030;
        C08032 c08032;
        int i2;
        InterfaceC2233 interfaceC2233;
        int i3;
        int i4;
        InterfaceC2233 interfaceC22332;
        int i5;
        int i6;
        InterfaceC2233 interfaceC22333;
        int i7;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = this.label;
        int i9 = 3;
        C6008 c6008 = C6008.f15084;
        switch (i8) {
            case 0:
                AbstractC6017.m10769(obj);
                int i10 = this.$highlightIndex;
                if (i10 >= 0 && i10 < this.$entries.size()) {
                    this.label = 1;
                    if (AbstractC6231.m11058(320L, this) != coroutineSingletons) {
                        c1582 = this.$listState;
                        i = this.$highlightIndex;
                        this.label = 2;
                        if (C1582.m2109(c1582, i, this) != coroutineSingletons) {
                            final C1582 c15822 = this.$listState;
                            final int i11 = this.$highlightIndex;
                            c6116M3030 = AbstractC2202.m3030(new InterfaceC7372() { // from class: top.suzhelan.qstory.ui.components.飘花落叶言子楪苏兰世哲
                                @Override // p068.InterfaceC7372
                                public final Object invoke() {
                                    return Boolean.valueOf(SettingListContentKt$SettingListContent$1$1.invokeSuspend$lambda$0(c15822, i11));
                                }
                            });
                            c08032 = new C08032(null);
                            this.label = 3;
                            if (AbstractC6154.m10898(c6116M3030, c08032, this) != coroutineSingletons) {
                                this.label = 4;
                            }
                        }
                        break;
                    }
                    return coroutineSingletons;
                }
                return c6008;
            case 1:
                AbstractC6017.m10769(obj);
                c1582 = this.$listState;
                i = this.$highlightIndex;
                this.label = 2;
                if (C1582.m2109(c1582, i, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 2:
                AbstractC6017.m10769(obj);
                final C1582 c158222 = this.$listState;
                final int i112 = this.$highlightIndex;
                c6116M3030 = AbstractC2202.m3030(new InterfaceC7372() { // from class: top.suzhelan.qstory.ui.components.飘花落叶言子楪苏兰世哲
                    @Override // p068.InterfaceC7372
                    public final Object invoke() {
                        return Boolean.valueOf(SettingListContentKt$SettingListContent$1$1.invokeSuspend$lambda$0(c158222, i112));
                    }
                });
                c08032 = new C08032(null);
                this.label = 3;
                if (AbstractC6154.m10898(c6116M3030, c08032, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 3:
                AbstractC6017.m10769(obj);
                this.label = 4;
                break;
            case 4:
                AbstractC6017.m10769(obj);
                i2 = this.$highlightIndex;
                interfaceC2233 = this.$flashingIndex$delegate;
                i3 = 0;
                if (i3 >= i9) {
                    ((AbstractC2181) interfaceC2233).m2993(i2);
                    this.L$0 = interfaceC2233;
                    this.I$0 = i9;
                    this.I$1 = i2;
                    this.I$2 = i3;
                    this.I$3 = i3;
                    this.I$4 = 0;
                    this.label = 5;
                    if (AbstractC6231.m11058(260L, this) != coroutineSingletons) {
                        i4 = i2;
                        interfaceC22332 = interfaceC2233;
                        i6 = i3;
                        i5 = 0;
                        ((AbstractC2181) interfaceC22332).m2993(-1);
                        if (i3 >= 2) {
                            this.L$0 = interfaceC22332;
                            this.I$0 = i9;
                            this.I$1 = i4;
                            this.I$2 = i6;
                            this.I$3 = i3;
                            this.I$4 = i5;
                            this.label = 6;
                            if (AbstractC6231.m11058(160L, this) != coroutineSingletons) {
                                i7 = i4;
                                interfaceC22333 = interfaceC22332;
                                i2 = i7;
                                i3 = i6 + 1;
                                interfaceC2233 = interfaceC22333;
                                if (i3 >= i9) {
                                    this.$onHighlightConsumed.invoke();
                                    return c6008;
                                }
                            }
                        } else {
                            i2 = i4;
                            interfaceC22333 = interfaceC22332;
                            i3 = i6 + 1;
                            interfaceC2233 = interfaceC22333;
                            if (i3 >= i9) {
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                break;
            case 5:
                int i12 = this.I$4;
                i3 = this.I$3;
                int i13 = this.I$2;
                i4 = this.I$1;
                int i14 = this.I$0;
                interfaceC22332 = (InterfaceC2233) this.L$0;
                AbstractC6017.m10769(obj);
                i5 = i12;
                i6 = i13;
                i9 = i14;
                ((AbstractC2181) interfaceC22332).m2993(-1);
                if (i3 >= 2) {
                }
                break;
            case 6:
                i6 = this.I$2;
                i7 = this.I$1;
                i9 = this.I$0;
                interfaceC22333 = (InterfaceC2233) this.L$0;
                AbstractC6017.m10769(obj);
                i2 = i7;
                i3 = i6 + 1;
                interfaceC2233 = interfaceC22333;
                if (i3 >= i9) {
                }
                break;
            default:
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX INFO: renamed from: top.suzhelan.qstory.ui.components.SettingListContentKt$SettingListContent$1$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m151d2 = {"<anonymous>", "", "it"}, m152k = 3, m153mv = {2, 3, 0}, m155xi = 50)
    @InterfaceC7691(m555c = "top.suzhelan.qstory.ui.components.SettingListContentKt$SettingListContent$1$1$2", m556f = "SettingListContent.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08032 extends SuspendLambda implements InterfaceC7383 {
        /* synthetic */ boolean Z$0;
        int label;

        public C08032(InterfaceC5189<? super C08032> interfaceC5189) {
            super(2, interfaceC5189);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C08032 c08032 = new C08032(interfaceC5189);
            c08032.Z$0 = ((Boolean) obj).booleanValue();
            return c08032;
        }

        public final Object invoke(boolean z, InterfaceC5189<? super Boolean> interfaceC5189) {
            return ((C08032) create(Boolean.valueOf(z), interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                AbstractC6017.m10769(obj);
                return Boolean.valueOf(z);
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        @Override // p068.InterfaceC7383
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC5189<? super Boolean>) obj2);
        }
    }
}
