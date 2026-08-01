package androidx.compose.foundation.gestures;

import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2456;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p068.InterfaceC7381;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", m556f = "TransformGestureDetector.kt", m557l = {60, 62}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class TransformGestureDetectorKt$detectTransformGestures$2 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7381 $onGesture;
    final /* synthetic */ boolean $panZoomLock;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    int I$1;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformGestureDetectorKt$detectTransformGestures$2(boolean z, InterfaceC7381 interfaceC7381, InterfaceC5189<? super TransformGestureDetectorKt$detectTransformGestures$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$panZoomLock = z;
        this.$onGesture = interfaceC7381;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        TransformGestureDetectorKt$detectTransformGestures$2 transformGestureDetectorKt$detectTransformGestures$2 = new TransformGestureDetectorKt$detectTransformGestures$2(this.$panZoomLock, this.$onGesture, interfaceC5189);
        transformGestureDetectorKt$detectTransformGestures$2.L$0 = obj;
        return transformGestureDetectorKt$detectTransformGestures$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((TransformGestureDetectorKt$detectTransformGestures$2) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0097, code lost:
    
        if (r7 != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:38:0x0107, B:45:0x0136], limit reached: 89 */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b2  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0097 -> B:18:0x009a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float f;
        long j;
        float f2;
        float f3;
        int i;
        int i2;
        InterfaceC2468 interfaceC2468;
        int i3;
        InterfaceC2468 interfaceC24682;
        float f4;
        float f5;
        long jM13084;
        float f6;
        Object objM3559;
        InterfaceC2468 interfaceC24683;
        boolean z;
        CoroutineSingletons coroutineSingletons;
        float f7;
        InterfaceC2468 interfaceC24684;
        boolean z2;
        long j2;
        boolean z3;
        long jM13085;
        int i4;
        InterfaceC2468 interfaceC24685;
        int i5;
        int size;
        int i6;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.label;
        float f8 = 1.0f;
        float f9 = 0.0f;
        boolean z4 = false;
        boolean z5 = true;
        if (i7 == 0) {
            AbstractC6017.m10769(obj);
            C2456 c2456 = (C2456) ((InterfaceC2468) this.L$0);
            float fMo3838 = c2456.m3557().mo3838();
            this.L$0 = c2456;
            this.F$0 = 0.0f;
            this.F$1 = 1.0f;
            this.J$0 = 0L;
            this.I$0 = 0;
            this.F$2 = fMo3838;
            this.I$1 = 0;
            this.label = 1;
            if (AbstractC1344.m1835(c2456, null, this, 2) != coroutineSingletons2) {
                f = fMo3838;
                j = 0;
                f2 = 1.0f;
                f3 = 0.0f;
                i = 0;
                i2 = 0;
                interfaceC2468 = c2456;
            }
            return coroutineSingletons2;
        }
        if (i7 != 1) {
            if (i7 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$1;
            f = this.F$2;
            i3 = this.I$0;
            jM13084 = this.J$0;
            f5 = this.F$1;
            f4 = this.F$0;
            InterfaceC2468 interfaceC24686 = (InterfaceC2468) this.L$0;
            AbstractC6017.m10769(obj);
            f6 = 1.0f;
            objM3559 = obj;
            interfaceC24683 = interfaceC24686;
            C2487 c2487 = (C2487) objM3559;
            float f10 = f9;
            ?? r8 = c2487.f5197;
            int size2 = r8.size();
            ?? r5 = z4;
            while (true) {
                if (r5 >= size2) {
                    z = z4;
                    break;
                }
                if (((C2478) r8.get(r5)).m3582()) {
                    z = z5;
                    break;
                }
                r5++;
            }
            if (z) {
                coroutineSingletons = coroutineSingletons2;
                f7 = f;
                interfaceC24684 = interfaceC24683;
                z2 = z4;
                j2 = 0;
            } else {
                float fM1864 = AbstractC1362.m1864(c2487, z5);
                float fM18642 = AbstractC1362.m1864(c2487, z4);
                float f11 = (fM1864 == f10 || fM18642 == f10) ? f6 : fM1864 / fM18642;
                float fM1863 = AbstractC1362.m1863(c2487);
                coroutineSingletons = coroutineSingletons2;
                int i8 = i;
                long jM1872 = AbstractC1362.m1872(c2487, z5, new C1361(8));
                int i9 = i3;
                if (C8158.m13087(jM1872, 9205357640488583168L)) {
                    jM13085 = 0;
                    z3 = false;
                } else {
                    z3 = false;
                    jM13085 = C8158.m13085(jM1872, AbstractC1362.m1872(c2487, false, new C1361(8)));
                }
                if (i9 == 0) {
                    f5 *= f11;
                    f4 += fM1863;
                    jM13084 = C8158.m13084(jM13084, jM13085);
                    float fM18643 = AbstractC1362.m1864(c2487, z3);
                    float fAbs = Math.abs(f6 - f5) * fM18643;
                    float fAbs2 = Math.abs(((3.1415927f * f4) * fM18643) / 180.0f);
                    float fM13086 = C8158.m13086(jM13084);
                    if (fAbs > f || fAbs2 > f || fM13086 > f) {
                        i4 = (!this.$panZoomLock || fAbs2 >= f) ? 0 : 1;
                        i3 = 1;
                    }
                    if (i3 == 0) {
                        f7 = f;
                        interfaceC24685 = interfaceC24683;
                        long jM18722 = AbstractC1362.m1872(c2487, false, new C1361(8));
                        float f12 = i4 != 0 ? f10 : fM1863;
                        if (f12 == f10 && f11 == f6) {
                            i5 = i4;
                            if (!C8158.m13087(jM13085, 0L)) {
                            }
                            size = r8.size();
                            for (i6 = 0; i6 < size; i6++) {
                                C2478 c2478 = (C2478) r8.get(i6);
                                if (!C8158.m13087(AbstractC2481.m3591(c2478, false), 0L)) {
                                    c2478.m3584();
                                }
                            }
                        } else {
                            i5 = i4;
                        }
                        this.$onGesture.invoke(new C8158(jM18722), new C8158(jM13085), new Float(f11), new Float(f12));
                        size = r8.size();
                        while (i6 < size) {
                        }
                    } else {
                        f7 = f;
                        interfaceC24685 = interfaceC24683;
                        i5 = i4;
                    }
                    z2 = false;
                    j2 = 0;
                    i = i5;
                    interfaceC24684 = interfaceC24685;
                }
                i4 = i8;
                i3 = i9;
                if (i3 == 0) {
                }
                z2 = false;
                j2 = 0;
                i = i5;
                interfaceC24684 = interfaceC24685;
            }
            if (!z) {
                int size3 = r8.size();
                for (?? r3 = z2; r3 < size3; r3++) {
                    if (((C2478) r8.get(r3)).f5151) {
                        z4 = z2;
                        f8 = f6;
                        f9 = f10;
                        coroutineSingletons2 = coroutineSingletons;
                        interfaceC24682 = interfaceC24684;
                        f = f7;
                        z5 = true;
                        this.L$0 = interfaceC24682;
                        this.F$0 = f4;
                        this.F$1 = f5;
                        this.J$0 = jM13084;
                        this.I$0 = i3;
                        this.F$2 = f;
                        this.I$1 = i;
                        f6 = f8;
                        this.label = 2;
                        objM3559 = ((C2456) interfaceC24682).m3559(PointerEventPass.Main, this);
                        interfaceC24683 = interfaceC24682;
                    }
                }
            }
            return C6008.f15084;
        }
        i = this.I$1;
        f = this.F$2;
        i2 = this.I$0;
        j = this.J$0;
        f2 = this.F$1;
        f3 = this.F$0;
        InterfaceC2468 interfaceC24687 = (InterfaceC2468) this.L$0;
        AbstractC6017.m10769(obj);
        interfaceC2468 = interfaceC24687;
        long j3 = j;
        i3 = i2;
        interfaceC24682 = interfaceC2468;
        f4 = f3;
        f5 = f2;
        jM13084 = j3;
        this.L$0 = interfaceC24682;
        this.F$0 = f4;
        this.F$1 = f5;
        this.J$0 = jM13084;
        this.I$0 = i3;
        this.F$2 = f;
        this.I$1 = i;
        f6 = f8;
        this.label = 2;
        objM3559 = ((C2456) interfaceC24682).m3559(PointerEventPass.Main, this);
        interfaceC24683 = interfaceC24682;
    }
}
