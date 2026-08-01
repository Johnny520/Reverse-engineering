package kotlinx.coroutines.flow.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.collections.AbstractC5179;
import kotlin.collections.C5173;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.C6022;
import kotlinx.coroutines.channels.C6034;
import kotlinx.coroutines.channels.InterfaceC6039;
import kotlinx.coroutines.flow.InterfaceC6150;
import kotlinx.coroutines.flow.InterfaceC6151;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", m556f = "Combine.kt", m557l = {51, 73, 76}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 2, 0})
final class CombineKt$combineInternal$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7372 $arrayFactory;
    final /* synthetic */ InterfaceC6151[] $flows;
    final /* synthetic */ InterfaceC6150 $this_combineInternal;
    final /* synthetic */ InterfaceC7380 $transform;
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 2, 0})
    @InterfaceC7691(m555c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", m556f = "Combine.kt", m557l = {28}, m558m = "invokeSuspend", m559v = 1)
    public static final class C04051 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC6151[] $flows;

        /* JADX INFO: renamed from: $i */
        final /* synthetic */ int f312$i;
        final /* synthetic */ AtomicInteger $nonClosed;
        final /* synthetic */ InterfaceC6039 $resultChannel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C04051(InterfaceC6151[] interfaceC6151Arr, int i, AtomicInteger atomicInteger, InterfaceC6039 interfaceC6039, InterfaceC5189<? super C04051> interfaceC5189) {
            super(2, interfaceC5189);
            this.$flows = interfaceC6151Arr;
            this.f312$i = i;
            this.$nonClosed = atomicInteger;
            this.$resultChannel = interfaceC6039;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C04051(this.$flows, this.f312$i, this.$nonClosed, this.$resultChannel, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C04051) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AtomicInteger atomicInteger;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC6017.m10769(obj);
                    InterfaceC6151[] interfaceC6151Arr = this.$flows;
                    int i2 = this.f312$i;
                    InterfaceC6151 interfaceC6151 = interfaceC6151Arr[i2];
                    C6069 c6069 = new C6069(this.$resultChannel, i2);
                    this.label = 1;
                    if (interfaceC6151.mo9012(c6069, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC6017.m10769(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    this.$resultChannel.mo8994(null);
                }
                return C6008.f15084;
            } finally {
                if (this.$nonClosed.decrementAndGet() == 0) {
                    this.$resultChannel.mo8994(null);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$combineInternal$2(InterfaceC6151[] interfaceC6151Arr, InterfaceC7372 interfaceC7372, InterfaceC7380 interfaceC7380, InterfaceC6150 interfaceC6150, InterfaceC5189<? super CombineKt$combineInternal$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$flows = interfaceC6151Arr;
        this.$arrayFactory = interfaceC7372;
        this.$transform = interfaceC7380;
        this.$this_combineInternal = interfaceC6150;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, interfaceC5189);
        combineKt$combineInternal$2.L$0 = obj;
        return combineKt$combineInternal$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((CombineKt$combineInternal$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0149, code lost:
    
        if (r8.invoke(r14, r11, r19) == r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0172, code lost:
    
        if (r14.invoke(r15, r8, r19) == r3) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fc A[LOOP:0: B:28:0x00fc->B:36:0x011d, LOOP_START, PHI: r4 r14
  0x00fc: PHI (r4v4 int) = (r4v3 int), (r4v5 int) binds: [B:25:0x00f7, B:36:0x011d] A[DONT_GENERATE, DONT_INLINE]
  0x00fc: PHI (r14v6 kotlin.collections.飘花落叶言子楪兰苏哲世) = (r14v5 kotlin.collections.飘花落叶言子楪兰苏哲世), (r14v12 kotlin.collections.飘花落叶言子楪兰苏哲世) binds: [B:25:0x00f7, B:36:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0149 -> B:11:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0172 -> B:11:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0175 -> B:43:0x014c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int length;
        byte[] bArr;
        int i;
        Object[] objArr;
        InterfaceC6039 interfaceC6039;
        int i2;
        Object objMo10806;
        int i3;
        int i4;
        C5173 c5173;
        C5317 c5317 = AbstractC6051.f15151;
        InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.label;
        int i6 = 1;
        if (i5 == 0) {
            AbstractC6017.m10769(obj);
            length = this.$flows.length;
            if (length != 0) {
                Object[] objArr2 = new Object[length];
                AbstractC5179.m9393(0, length, c5317, objArr2);
                C6022 c6022M10841 = AbstractC6037.m10841(length, 6, null);
                AtomicInteger atomicInteger = new AtomicInteger(length);
                for (int i7 = 0; i7 < length; i7++) {
                    AbstractC6231.m11036(interfaceC6233, null, null, new C04051(this.$flows, i7, atomicInteger, c6022M10841, null), 3);
                }
                bArr = new byte[length];
                i = 0;
                objArr = objArr2;
                interfaceC6039 = c6022M10841;
                i2 = length;
                i = (byte) (i + i6);
                this.L$0 = null;
                this.L$1 = objArr;
                this.L$2 = interfaceC6039;
                this.L$3 = null;
                this.L$4 = bArr;
                this.L$5 = null;
                this.L$6 = null;
                this.I$0 = length;
                this.I$1 = i2;
                this.I$2 = i;
                this.label = i6;
                objMo10806 = interfaceC6039.mo10806(this);
                if (objMo10806 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return C6008.f15084;
        }
        if (i5 == 1) {
            int i8 = this.I$2;
            i4 = this.I$1;
            i3 = this.I$0;
            byte[] bArr2 = (byte[]) this.L$4;
            interfaceC6039 = (InterfaceC6039) this.L$2;
            Object[] objArr3 = (Object[]) this.L$1;
            AbstractC6017.m10769(obj);
            objMo10806 = ((C6034) obj).f15136;
            i = i8;
            bArr = bArr2;
            objArr = objArr3;
            c5173 = (C5173) C6034.m10831(objMo10806);
            if (c5173 != null) {
            }
            return C6008.f15084;
        }
        if (i5 == 2) {
            int i9 = this.I$2;
            i4 = this.I$1;
            i3 = this.I$0;
            byte[] bArr3 = (byte[]) this.L$4;
            interfaceC6039 = (InterfaceC6039) this.L$2;
            Object[] objArr4 = (Object[]) this.L$1;
            AbstractC6017.m10769(obj);
            i = i9;
            bArr = bArr3;
            objArr = objArr4;
        } else {
            if (i5 != 3) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i10 = this.I$2;
            i4 = this.I$1;
            i3 = this.I$0;
            byte[] bArr4 = (byte[]) this.L$4;
            interfaceC6039 = (InterfaceC6039) this.L$2;
            Object[] objArr5 = (Object[]) this.L$1;
            AbstractC6017.m10769(obj);
            i = i10;
            bArr = bArr4;
            objArr = objArr5;
        }
        int i11 = i3;
        i2 = i4;
        length = i11;
        i6 = 1;
        i = (byte) (i + i6);
        this.L$0 = null;
        this.L$1 = objArr;
        this.L$2 = interfaceC6039;
        this.L$3 = null;
        this.L$4 = bArr;
        this.L$5 = null;
        this.L$6 = null;
        this.I$0 = length;
        this.I$1 = i2;
        this.I$2 = i;
        this.label = i6;
        objMo10806 = interfaceC6039.mo10806(this);
        if (objMo10806 != coroutineSingletons) {
            int i12 = i2;
            i3 = length;
            i4 = i12;
            c5173 = (C5173) C6034.m10831(objMo10806);
            if (c5173 != null) {
                do {
                    int i13 = c5173.f13269;
                    Object obj2 = objArr[i13];
                    objArr[i13] = c5173.f13268;
                    if (obj2 == c5317) {
                        i4--;
                    }
                    if (bArr[i13] == i) {
                        break;
                    }
                    bArr[i13] = (byte) i;
                    c5173 = (C5173) C6034.m10831(interfaceC6039.mo10814());
                } while (c5173 != null);
                if (i4 != 0) {
                    int i14 = i3;
                    i2 = i4;
                    length = i14;
                    i6 = 1;
                    i = (byte) (i + i6);
                    this.L$0 = null;
                    this.L$1 = objArr;
                    this.L$2 = interfaceC6039;
                    this.L$3 = null;
                    this.L$4 = bArr;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.I$0 = length;
                    this.I$1 = i2;
                    this.I$2 = i;
                    this.label = i6;
                    objMo10806 = interfaceC6039.mo10806(this);
                    if (objMo10806 != coroutineSingletons) {
                    }
                } else {
                    Object[] objArr6 = (Object[]) this.$arrayFactory.invoke();
                    if (objArr6 == null) {
                        InterfaceC7380 interfaceC7380 = this.$transform;
                        InterfaceC6150 interfaceC6150 = this.$this_combineInternal;
                        this.L$0 = null;
                        this.L$1 = objArr;
                        this.L$2 = interfaceC6039;
                        this.L$3 = null;
                        this.L$4 = bArr;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.I$0 = i3;
                        this.I$1 = i4;
                        this.I$2 = i;
                        this.label = 2;
                    } else {
                        AbstractC5179.m9399(0, 0, objArr, 14, objArr6);
                        InterfaceC7380 interfaceC73802 = this.$transform;
                        InterfaceC6150 interfaceC61502 = this.$this_combineInternal;
                        this.L$0 = null;
                        this.L$1 = objArr;
                        this.L$2 = interfaceC6039;
                        this.L$3 = null;
                        this.L$4 = bArr;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.I$0 = i3;
                        this.I$1 = i4;
                        this.I$2 = i;
                        this.label = 3;
                    }
                    i6 = 1;
                    i = (byte) (i + i6);
                    this.L$0 = null;
                    this.L$1 = objArr;
                    this.L$2 = interfaceC6039;
                    this.L$3 = null;
                    this.L$4 = bArr;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.I$0 = length;
                    this.I$1 = i2;
                    this.I$2 = i;
                    this.label = i6;
                    objMo10806 = interfaceC6039.mo10806(this);
                    if (objMo10806 != coroutineSingletons) {
                    }
                }
            }
            return C6008.f15084;
        }
        return coroutineSingletons;
    }
}
