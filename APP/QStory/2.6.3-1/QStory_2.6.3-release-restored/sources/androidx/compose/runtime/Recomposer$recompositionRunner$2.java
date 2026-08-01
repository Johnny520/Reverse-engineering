package androidx.compose.runtime;

import androidx.collection.AbstractC1133;
import androidx.collection.C1082;
import androidx.compose.runtime.collection.C2057;
import androidx.compose.runtime.snapshots.AbstractC2091;
import androidx.compose.runtime.snapshots.AbstractC2115;
import androidx.compose.runtime.snapshots.AbstractC2121;
import androidx.compose.runtime.snapshots.C2102;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6276;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6279;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.flow.C6099;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p138.C8224;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", m556f = "Recomposer.kt", m557l = {1081}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class Recomposer$recompositionRunner$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7380 $block;
    final /* synthetic */ InterfaceC2139 $parentFrameClock;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C2218 this$0;

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", m556f = "Recomposer.kt", m557l = {1081}, m558m = "invokeSuspend", m559v = 1)
    public static final class C01682 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC7380 $block;
        final /* synthetic */ InterfaceC2139 $parentFrameClock;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01682(InterfaceC7380 interfaceC7380, InterfaceC2139 interfaceC2139, InterfaceC5189<? super C01682> interfaceC5189) {
            super(2, interfaceC5189);
            this.$block = interfaceC7380;
            this.$parentFrameClock = interfaceC2139;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C01682 c01682 = new C01682(this.$block, this.$parentFrameClock, interfaceC5189);
            c01682.L$0 = obj;
            return c01682;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C01682) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
                InterfaceC7380 interfaceC7380 = this.$block;
                InterfaceC2139 interfaceC2139 = this.$parentFrameClock;
                this.label = 1;
                if (interfaceC7380.invoke(interfaceC6233, interfaceC2139, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2(C2218 c2218, InterfaceC7380 interfaceC7380, InterfaceC2139 interfaceC2139, InterfaceC5189<? super Recomposer$recompositionRunner$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c2218;
        this.$block = interfaceC7380;
        this.$parentFrameClock = interfaceC2139;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C6008 invokeSuspend$lambda$0(C2218 c2218, Set set, AbstractC2121 abstractC2121) {
        InterfaceC6279 interfaceC6279M3080;
        synchronized (c2218.f4341) {
            try {
                if (((Recomposer$State) c2218.f4349.getValue()).compareTo(Recomposer$State.Idle) >= 0) {
                    C1082 c1082 = c2218.f4356;
                    if (set instanceof C2057) {
                        AbstractC1133 abstractC1133 = ((C2057) set).f3863;
                        Object[] objArr = abstractC1133.f1345;
                        long[] jArr = abstractC1133.f1346;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            Object obj = objArr[(i << 3) + i3];
                                            if (!(obj instanceof AbstractC2091) || ((AbstractC2091) obj).m2758(1)) {
                                                c1082.m1301(obj);
                                            }
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                    if (i == length) {
                                        break;
                                    }
                                    i++;
                                }
                            }
                        }
                    } else {
                        for (Object obj2 : set) {
                            if (!(obj2 instanceof AbstractC2091) || ((AbstractC2091) obj2).m2758(1)) {
                                c1082.m1301(obj2);
                            }
                        }
                    }
                    interfaceC6279M3080 = c2218.m3080();
                } else {
                    interfaceC6279M3080 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (interfaceC6279M3080 != null) {
            ((C6276) interfaceC6279M3080).resumeWith(Result.m9304constructorimpl(C6008.f15084));
        }
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.this$0, this.$block, this.$parentFrameClock, interfaceC5189);
        recomposer$recompositionRunner$2.L$0 = obj;
        return recomposer$recompositionRunner$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((Recomposer$recompositionRunner$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC6284 interfaceC6284M11052;
        C6099 c6099;
        C8224 c8224;
        C8224 c8224M13126;
        C2102 c2102;
        Throwable th;
        List listM3085;
        C2198 c2198;
        C2218 c2218;
        C6099 c60992;
        C8224 c82242;
        C8224 c8224M13125;
        C2218 c22182;
        C6099 c60993;
        C8224 c82243;
        C8224 c8224M131252;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            interfaceC6284M11052 = AbstractC6231.m11052(((InterfaceC6233) this.L$0).mo2990());
            C2218 c22183 = this.this$0;
            synchronized (c22183.f4341) {
                Throwable th2 = c22183.f4339;
                if (th2 != null) {
                    throw th2;
                }
                if (((Recomposer$State) c22183.f4349.getValue()).compareTo(Recomposer$State.ShuttingDown) <= 0) {
                    throw new IllegalStateException("Recomposer shut down");
                }
                if (c22183.f4340 != null) {
                    throw new IllegalStateException("Recomposer already running");
                }
                c22183.f4340 = interfaceC6284M11052;
                if (c22183.m3080() != null) {
                    AbstractC2209.m3067("called outside of runRecomposeAndApplyChanges");
                }
            }
            C2216 c2216 = new C2216(this.this$0, 0);
            AbstractC2115.m2819(AbstractC2115.f4092);
            synchronized (AbstractC2115.f4090) {
                AbstractC2115.f4093 = AbstractC5176.m9353(AbstractC2115.f4093, c2216);
            }
            C2102 c21022 = new C2102(c2216);
            C6099 c60994 = C2218.f4335;
            C2188 c2188 = this.this$0.f4336;
            try {
                do {
                    c6099 = C2218.f4335;
                    c8224 = (C8224) c6099.getValue();
                    c8224M13126 = c8224.m13126(c2188);
                    if (c8224 != c8224M13126) {
                    }
                    break;
                } while (!c6099.m10871(c8224, c8224M13126));
                break;
                C2218 c22184 = this.this$0;
                synchronized (c22184.f4341) {
                    listM3085 = c22184.m3085();
                }
                int size = listM3085.size();
                for (int i2 = 0; i2 < size; i2++) {
                    for (Object obj2 : ((C2198) listM3085.get(i2)).f4307.f3893) {
                        C2224 c2224 = obj2 instanceof C2224 ? (C2224) obj2 : null;
                        if (c2224 != null && (c2198 = c2224.f4382) != null) {
                            c2198.m3020(c2224, null);
                        }
                    }
                }
                C01682 c01682 = new C01682(this.$block, this.$parentFrameClock, null);
                this.L$0 = interfaceC6284M11052;
                this.L$1 = c21022;
                this.label = 1;
                if (AbstractC6231.m11066(c01682, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                c2102 = c21022;
                c2102.m2785();
                c22182 = this.this$0;
                synchronized (c22182.f4341) {
                }
            } catch (Throwable th3) {
                c2102 = c21022;
                th = th3;
                c2102.m2785();
                c2218 = this.this$0;
                synchronized (c2218.f4341) {
                    try {
                        if (c2218.f4340 == interfaceC6284M11052) {
                            c2218.f4340 = null;
                        }
                        if (c2218.m3080() != null) {
                            AbstractC2209.m3067("called outside of runRecomposeAndApplyChanges");
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                C6099 c60995 = C2218.f4335;
                C2188 c21882 = this.this$0.f4336;
                do {
                    c60992 = C2218.f4335;
                    c82242 = (C8224) c60992.getValue();
                    c8224M13125 = c82242.m13125(c21882);
                    if (c82242 == c8224M13125) {
                        break;
                    }
                } while (!c60992.m10871(c82242, c8224M13125));
                throw th;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c2102 = (C2102) this.L$1;
            interfaceC6284M11052 = (InterfaceC6284) this.L$0;
            try {
                AbstractC6017.m10769(obj);
                c2102.m2785();
                c22182 = this.this$0;
                synchronized (c22182.f4341) {
                    try {
                        if (c22182.f4340 == interfaceC6284M11052) {
                            c22182.f4340 = null;
                        }
                        if (c22182.m3080() != null) {
                            AbstractC2209.m3067("called outside of runRecomposeAndApplyChanges");
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                C6099 c60996 = C2218.f4335;
                C2188 c21883 = this.this$0.f4336;
                do {
                    c60993 = C2218.f4335;
                    c82243 = (C8224) c60993.getValue();
                    c8224M131252 = c82243.m13125(c21883);
                    if (c82243 == c8224M131252) {
                        break;
                    }
                } while (!c60993.m10871(c82243, c8224M131252));
                return C6008.f15084;
            } catch (Throwable th6) {
                th = th6;
                c2102.m2785();
                c2218 = this.this$0;
                synchronized (c2218.f4341) {
                }
            }
        }
    }
}
