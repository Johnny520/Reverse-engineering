package androidx.compose.animation.core;

import androidx.compose.p001ui.platform.C2742;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.collection.C2059;
import com.alibaba.fastjson2.C3775;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.flow.AbstractC6154;
import kotlinx.coroutines.flow.C6116;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.animation.core.InfiniteTransition$run$1$1", m556f = "InfiniteTransition.kt", m557l = {172, 193}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class InfiniteTransition$run$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC2230 $toolingOverride;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C1161 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteTransition$run$1$1(InterfaceC2230 interfaceC2230, C1161 c1161, InterfaceC5189<? super InfiniteTransition$run$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$toolingOverride = interfaceC2230;
        this.this$0 = c1161;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0(InterfaceC2230 interfaceC2230, C1161 c1161, Ref$FloatRef ref$FloatRef, InterfaceC6233 interfaceC6233, long j) {
        InterfaceC2168 interfaceC2168 = (InterfaceC2168) interfaceC2230.getValue();
        long jLongValue = interfaceC2168 != null ? ((Number) interfaceC2168.getValue()).longValue() : j;
        long j2 = c1161.f1403;
        C2059 c2059 = c1161.f1405;
        if (j2 == Long.MIN_VALUE || ref$FloatRef.element != AbstractC1176.m1582(interfaceC6233.mo2990())) {
            c1161.f1403 = j;
            Object[] objArr = c2059.f3866;
            int i = c2059.f3865;
            for (int i2 = 0; i2 < i; i2++) {
                ((C1162) objArr[i2]).f1409 = true;
            }
            ref$FloatRef.element = AbstractC1176.m1582(interfaceC6233.mo2990());
        }
        float f = ref$FloatRef.element;
        if (f == 0.0f) {
            Object[] objArr2 = c2059.f3866;
            int i3 = c2059.f3865;
            for (int i4 = 0; i4 < i3; i4++) {
                C1162 c1162 = (C1162) objArr2[i4];
                ((AbstractC2182) c1162.f1412).setValue(c1162.f1407.f1622);
                c1162.f1409 = true;
            }
        } else {
            long j3 = (long) ((jLongValue - c1161.f1403) / f);
            Object[] objArr3 = c2059.f3866;
            int i5 = c2059.f3865;
            boolean z = true;
            for (int i6 = 0; i6 < i5; i6++) {
                C1162 c11622 = (C1162) objArr3[i6];
                if (!c11622.f1406) {
                    ((AbstractC2182) c11622.f1408.f1404).setValue(Boolean.FALSE);
                    if (c11622.f1409) {
                        c11622.f1409 = false;
                        c11622.f1410 = j3;
                    }
                    long j4 = j3 - c11622.f1410;
                    ((AbstractC2182) c11622.f1412).setValue(c11622.f1407.mo1559(j4));
                    c11622.f1406 = c11622.f1407.m1560(j4);
                }
                if (!c11622.f1406) {
                    z = false;
                }
            }
            ((AbstractC2182) c1161.f1402).setValue(Boolean.valueOf(!z));
        }
        return C6008.f15084;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invokeSuspend$lambda$1(InterfaceC6233 interfaceC6233) {
        return AbstractC1176.m1582(interfaceC6233.mo2990());
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        InfiniteTransition$run$1$1 infiniteTransition$run$1$1 = new InfiniteTransition$run$1$1(this.$toolingOverride, this.this$0, interfaceC5189);
        infiniteTransition$run$1$1.L$0 = obj;
        return infiniteTransition$run$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((InfiniteTransition$run$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Path cross not found for [B:11:0x0041, B:18:0x0073], limit reached: 22 */
    /* JADX WARN: Path cross not found for [B:18:0x0073, B:11:0x0041], limit reached: 22 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0071 -> B:11:0x0041). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x008b -> B:11:0x0041). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC6233 interfaceC6233;
        Ref$FloatRef ref$FloatRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 2;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6233 interfaceC62332 = (InterfaceC6233) this.L$0;
            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            ref$FloatRef2.element = 1.0f;
            interfaceC6233 = interfaceC62332;
            ref$FloatRef = ref$FloatRef2;
        } else if (i == 1) {
            Ref$FloatRef ref$FloatRef3 = (Ref$FloatRef) this.L$1;
            InterfaceC6233 interfaceC62333 = (InterfaceC6233) this.L$0;
            AbstractC6017.m10769(obj);
            ref$FloatRef = ref$FloatRef3;
            interfaceC6233 = interfaceC62333;
            if (ref$FloatRef.element == 0.0f) {
                C6116 c6116M3030 = AbstractC2202.m3030(new C1216(interfaceC6233, i2));
                C00203 c00203 = new C00203(null);
                this.L$0 = interfaceC6233;
                this.L$1 = ref$FloatRef;
                this.label = 2;
                if (AbstractC6154.m10898(c6116M3030, c00203, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        } else {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Ref$FloatRef ref$FloatRef4 = (Ref$FloatRef) this.L$1;
            InterfaceC6233 interfaceC62334 = (InterfaceC6233) this.L$0;
            AbstractC6017.m10769(obj);
            ref$FloatRef = ref$FloatRef4;
            interfaceC6233 = interfaceC62334;
        }
        C1178 c1178 = new C1178(this.$toolingOverride, this.this$0, ref$FloatRef, interfaceC6233, 1);
        this.L$0 = interfaceC6233;
        this.L$1 = ref$FloatRef;
        this.label = 1;
        if (getContext().get(C2742.f5967) != null) {
            C3775.m6954();
            return null;
        }
        if (AbstractC2202.m3052(getContext()).mo2865(c1178, this) != coroutineSingletons) {
            if (ref$FloatRef.element == 0.0f) {
            }
            C1178 c11782 = new C1178(this.$toolingOverride, this.this$0, ref$FloatRef, interfaceC6233, 1);
            this.L$0 = interfaceC6233;
            this.L$1 = ref$FloatRef;
            this.label = 1;
            if (getContext().get(C2742.f5967) != null) {
            }
        }
        return coroutineSingletons;
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$1$3 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m151d2 = {"<anonymous>", "", "it", ""}, m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
    @InterfaceC7691(m555c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", m556f = "InfiniteTransition.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00203 extends SuspendLambda implements InterfaceC7383 {
        /* synthetic */ float F$0;
        int label;

        public C00203(InterfaceC5189<? super C00203> interfaceC5189) {
            super(2, interfaceC5189);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C00203 c00203 = new C00203(interfaceC5189);
            c00203.F$0 = ((Number) obj).floatValue();
            return c00203;
        }

        public final Object invoke(float f, InterfaceC5189<? super Boolean> interfaceC5189) {
            return ((C00203) create(Float.valueOf(f), interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                AbstractC6017.m10769(obj);
                return Boolean.valueOf(this.F$0 > 0.0f);
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        @Override // p068.InterfaceC7383
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).floatValue(), (InterfaceC5189<? super Boolean>) obj2);
        }
    }
}
