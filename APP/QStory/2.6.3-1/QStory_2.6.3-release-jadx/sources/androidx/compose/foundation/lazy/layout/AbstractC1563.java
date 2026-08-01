package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.activity.compose.C0849;
import androidx.activity.compose.C0851;
import androidx.appcompat.app.C0923;
import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1191;
import androidx.compose.animation.core.C1196;
import androidx.compose.foundation.C1898;
import androidx.compose.foundation.gestures.C1326;
import androidx.compose.foundation.gestures.C1382;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C1583;
import androidx.compose.foundation.lazy.C1584;
import androidx.compose.foundation.lazy.C1594;
import androidx.compose.foundation.lazy.C1599;
import androidx.compose.foundation.lazy.C1601;
import androidx.compose.foundation.lazy.C1603;
import androidx.compose.foundation.lazy.C1606;
import androidx.compose.p001ui.InterfaceC2962;
import androidx.compose.p001ui.layout.AbstractC2505;
import androidx.compose.p001ui.layout.AbstractC2544;
import androidx.compose.p001ui.layout.C2554;
import androidx.compose.p001ui.layout.InterfaceC2545;
import androidx.compose.p001ui.platform.AbstractC2670;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2169;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.C2193;
import androidx.compose.runtime.C2194;
import androidx.compose.runtime.C2204;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.collection.C2059;
import androidx.compose.runtime.internal.AbstractC2089;
import androidx.compose.runtime.internal.C2077;
import androidx.compose.runtime.snapshots.AbstractC2109;
import androidx.compose.runtime.snapshots.AbstractC2121;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.Arrays;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.InterfaceC5929;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p068.InterfaceC7372;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p104.C7996;
import p132.AbstractC8176;
import p132.AbstractC8177;
import p132.C8168;
import p132.InterfaceC8169;
import p132.InterfaceC8174;
import p192.AbstractC8570;
import p221.InterfaceC8725;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1563 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1548 f2376 = new C1548(1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d1 A[Catch: ItemFoundInScroll -> 0x01b3, TryCatch #1 {ItemFoundInScroll -> 0x01b3, blocks: (B:35:0x00cd, B:37:0x00d1, B:39:0x00d7, B:53:0x0101, B:55:0x011b, B:59:0x0130, B:63:0x0138), top: B:106:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0201  */
    /* JADX WARN: Type inference failed for: r10v0, types: [T, androidx.compose.animation.core.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Type inference failed for: r10v12, types: [T, androidx.compose.animation.core.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0188 -> B:18:0x006a). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2076(InterfaceC1530 interfaceC1530, int i, int i2, int i3, InterfaceC8725 interfaceC8725, ContinuationImpl continuationImpl) {
        LazyLayoutScrollScopeKt$animateScrollToItem$1 lazyLayoutScrollScopeKt$animateScrollToItem$1;
        InterfaceC1530 interfaceC15302;
        int i4;
        int i5;
        LazyLayoutScrollScopeKt$animateScrollToItem$1 lazyLayoutScrollScopeKt$animateScrollToItem$12;
        float fMo1904;
        float fMo19042;
        float fMo19043;
        Ref$BooleanRef ref$BooleanRef;
        Ref$ObjectRef ref$ObjectRef;
        Ref$IntRef ref$IntRef;
        final int i6;
        final int i7;
        float f;
        final float f2;
        int i8;
        LazyLayoutScrollScopeKt$animateScrollToItem$1 lazyLayoutScrollScopeKt$animateScrollToItem$13;
        InterfaceC1530 interfaceC15303;
        float f3;
        int i9;
        C1196 c1196M1578;
        Float f4;
        boolean z;
        C1326 c1326;
        InterfaceC1530 interfaceC15304;
        int i10;
        int i11;
        final Ref$IntRef ref$IntRef2;
        LazyLayoutScrollScopeKt$animateScrollToItem$1 lazyLayoutScrollScopeKt$animateScrollToItem$14;
        float fMax;
        C1196 c1196;
        final InterfaceC1530 interfaceC15305;
        final int i12;
        int i13;
        float f5;
        int i14;
        if (continuationImpl instanceof LazyLayoutScrollScopeKt$animateScrollToItem$1) {
            lazyLayoutScrollScopeKt$animateScrollToItem$1 = (LazyLayoutScrollScopeKt$animateScrollToItem$1) continuationImpl;
            int i15 = lazyLayoutScrollScopeKt$animateScrollToItem$1.label;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                lazyLayoutScrollScopeKt$animateScrollToItem$1.label = i15 - Integer.MIN_VALUE;
            } else {
                lazyLayoutScrollScopeKt$animateScrollToItem$1 = new LazyLayoutScrollScopeKt$animateScrollToItem$1(continuationImpl);
            }
        }
        Object obj = lazyLayoutScrollScopeKt$animateScrollToItem$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i16 = lazyLayoutScrollScopeKt$animateScrollToItem$1.label;
        float f6 = 0.0f;
        boolean z2 = true;
        if (i16 == 0) {
            AbstractC6017.m10769(obj);
            if (i < 0.0f) {
                AbstractC8570.m13656("Index should be non-negative");
            }
            try {
                fMo1904 = interfaceC8725.mo1904(2500.0f);
                fMo19042 = interfaceC8725.mo1904(1500.0f);
                fMo19043 = interfaceC8725.mo1904(50.0f);
                ref$BooleanRef = new Ref$BooleanRef();
                ref$BooleanRef.element = true;
                ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.element = AbstractC1176.m1571(0.0f, 0.0f, 30);
            } catch (ItemFoundInScroll e) {
                e = e;
                interfaceC15302 = interfaceC1530;
                i4 = i2;
                i5 = i;
                lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
            }
            if (m2085(interfaceC1530, i)) {
                throw new ItemFoundInScroll(interfaceC1530.mo2048(i), (C1196) ref$ObjectRef.element);
            }
            int i17 = i > interfaceC1530.mo2053() ? 1 : 0;
            ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = 1;
            i6 = i2;
            i7 = i3;
            f = fMo1904;
            f2 = fMo19042;
            i8 = i;
            lazyLayoutScrollScopeKt$animateScrollToItem$13 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
            interfaceC15303 = interfaceC1530;
            f3 = fMo19043;
            i9 = i17;
            ref$IntRef2 = ref$IntRef;
            if (ref$BooleanRef.element) {
            }
            return C6008.f15084;
        }
        if (i16 != 1) {
            if (i16 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i10 = lazyLayoutScrollScopeKt$animateScrollToItem$1.I$1;
            i11 = lazyLayoutScrollScopeKt$animateScrollToItem$1.I$0;
            interfaceC15304 = (InterfaceC1530) lazyLayoutScrollScopeKt$animateScrollToItem$1.L$0;
            AbstractC6017.m10769(obj);
            interfaceC15304.mo2051(i11, i10);
            return C6008.f15084;
        }
        i9 = lazyLayoutScrollScopeKt$animateScrollToItem$1.I$3;
        float f7 = lazyLayoutScrollScopeKt$animateScrollToItem$1.F$2;
        float f8 = lazyLayoutScrollScopeKt$animateScrollToItem$1.F$1;
        f = lazyLayoutScrollScopeKt$animateScrollToItem$1.F$0;
        int i18 = lazyLayoutScrollScopeKt$animateScrollToItem$1.I$2;
        int i19 = lazyLayoutScrollScopeKt$animateScrollToItem$1.I$1;
        i5 = lazyLayoutScrollScopeKt$animateScrollToItem$1.I$0;
        ref$IntRef = (Ref$IntRef) lazyLayoutScrollScopeKt$animateScrollToItem$1.L$3;
        ref$ObjectRef = (Ref$ObjectRef) lazyLayoutScrollScopeKt$animateScrollToItem$1.L$2;
        Ref$BooleanRef ref$BooleanRef2 = (Ref$BooleanRef) lazyLayoutScrollScopeKt$animateScrollToItem$1.L$1;
        interfaceC15302 = (InterfaceC1530) lazyLayoutScrollScopeKt$animateScrollToItem$1.L$0;
        try {
            AbstractC6017.m10769(obj);
            f5 = f8;
            i6 = i19;
            lazyLayoutScrollScopeKt$animateScrollToItem$13 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
            f3 = f7;
            i14 = 1;
            i13 = i18;
            i8 = i5;
        } catch (ItemFoundInScroll e2) {
            e = e2;
            lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$1;
            i4 = i19;
        }
        try {
            try {
                ref$IntRef.element += i14;
                interfaceC15303 = interfaceC15302;
                ref$BooleanRef = ref$BooleanRef2;
                f2 = f5;
                f6 = 0.0f;
                i7 = i13;
                z2 = true;
            } catch (ItemFoundInScroll e3) {
                e = e3;
                interfaceC15302 = interfaceC15303;
                i5 = i8;
                lazyLayoutScrollScopeKt$animateScrollToItem$14 = lazyLayoutScrollScopeKt$animateScrollToItem$13;
            }
            ref$IntRef2 = ref$IntRef;
        } catch (ItemFoundInScroll e4) {
            e = e4;
            i5 = i8;
            lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$13;
            i4 = i6;
            c1196M1578 = AbstractC1176.m1578(e.getPreviousAnimation(), 0.0f, 0.0f, 30);
            float itemOffset = e.getItemOffset() + i4;
            Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
            f4 = new Float(itemOffset);
            if (((Number) c1196M1578.m1607()).floatValue() == 0.0f) {
            }
            c1326 = new C1326(itemOffset, ref$FloatRef, interfaceC15302, 1);
            lazyLayoutScrollScopeKt$animateScrollToItem$12.L$0 = interfaceC15302;
            lazyLayoutScrollScopeKt$animateScrollToItem$12.L$1 = null;
            lazyLayoutScrollScopeKt$animateScrollToItem$12.L$2 = null;
            lazyLayoutScrollScopeKt$animateScrollToItem$12.L$3 = null;
            lazyLayoutScrollScopeKt$animateScrollToItem$12.I$0 = i5;
            lazyLayoutScrollScopeKt$animateScrollToItem$12.I$1 = i4;
            lazyLayoutScrollScopeKt$animateScrollToItem$12.label = 2;
            if (AbstractC1176.m1585(c1196M1578, f4, null, !z, c1326, lazyLayoutScrollScopeKt$animateScrollToItem$12, 2) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (ref$BooleanRef.element && interfaceC15303.mo2049() > 0) {
            try {
                try {
                    try {
                        try {
                            int iMo2048 = interfaceC15303.mo2048(i8) + i6;
                            if (Math.abs(iMo2048) >= f) {
                                fMax = i9 != 0 ? f : -f;
                            } else {
                                try {
                                    fMax = Math.max(Math.abs(iMo2048), f3);
                                    if (i9 == 0) {
                                        fMax = -fMax;
                                    }
                                } catch (ItemFoundInScroll e5) {
                                    e = e5;
                                    interfaceC15302 = interfaceC15303;
                                    i5 = i8;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$13;
                                    i4 = i6;
                                    c1196M1578 = AbstractC1176.m1578(e.getPreviousAnimation(), 0.0f, 0.0f, 30);
                                    float itemOffset2 = e.getItemOffset() + i4;
                                    Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                                    f4 = new Float(itemOffset2);
                                    if (((Number) c1196M1578.m1607()).floatValue() == 0.0f) {
                                    }
                                    c1326 = new C1326(itemOffset2, ref$FloatRef2, interfaceC15302, 1);
                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.L$0 = interfaceC15302;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.L$1 = null;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.L$2 = null;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.L$3 = null;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.I$0 = i5;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.I$1 = i4;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$12.label = 2;
                                    if (AbstractC1176.m1585(c1196M1578, f4, null, !z, c1326, lazyLayoutScrollScopeKt$animateScrollToItem$12, 2) != coroutineSingletons) {
                                    }
                                    return coroutineSingletons;
                                }
                            }
                            Float f9 = new Float(fMax);
                            boolean z3 = (((Number) ((C1196) ref$ObjectRef.element).m1607()).floatValue() != f6 ? z2 : false) ^ z2;
                            final boolean z4 = i9 == 0 ? z2 : false;
                            InterfaceC7387 interfaceC7387 = new InterfaceC7387() { // from class: androidx.compose.foundation.lazy.layout.飘花落叶言子世哲苏兰楪
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
                                /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
                                /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[PHI: r2
  0x002f: PHI (r2v21 float) = (r2v8 float), (r2v26 float) binds: [B:11:0x0041, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
                                @Override // p068.InterfaceC7387
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final Object invoke(Object obj2) {
                                    float fFloatValue;
                                    float f10;
                                    float fMo1811;
                                    C1191 c1191 = (C1191) obj2;
                                    InterfaceC1530 interfaceC15306 = interfaceC15305;
                                    int i20 = i12;
                                    boolean zM2085 = AbstractC1563.m2085(interfaceC15306, i20);
                                    Ref$BooleanRef ref$BooleanRef3 = ref$BooleanRef;
                                    boolean z5 = z4;
                                    int i21 = i6;
                                    C6008 c6008 = C6008.f15084;
                                    if (!zM2085) {
                                        float f11 = f;
                                        if (f11 > 0.0f) {
                                            fFloatValue = ((Number) ((AbstractC2182) c1191.f1528).getValue()).floatValue();
                                            if (fFloatValue <= f11) {
                                                f11 = fFloatValue;
                                            }
                                            Ref$FloatRef ref$FloatRef3 = ref$FloatRef;
                                            f10 = f11 - ref$FloatRef3.element;
                                            fMo1811 = interfaceC15306.mo1811(f10);
                                            if (!AbstractC1563.m2085(interfaceC15306, i20) && !AbstractC1563.m2084(z5, interfaceC15306, i20, i21)) {
                                                if (f10 == fMo1811) {
                                                    c1191.m1606();
                                                    ref$BooleanRef3.element = false;
                                                    return c6008;
                                                }
                                                ref$FloatRef3.element += f10;
                                                float f12 = f2;
                                                if (z5) {
                                                    if (((Number) ((AbstractC2182) c1191.f1528).getValue()).floatValue() > f12) {
                                                        c1191.m1606();
                                                    }
                                                } else if (((Number) ((AbstractC2182) c1191.f1528).getValue()).floatValue() < (-f12)) {
                                                    c1191.m1606();
                                                }
                                                int i22 = ref$IntRef2.element;
                                                int i23 = i7;
                                                if (z5) {
                                                    if (i22 >= 2 && i20 - interfaceC15306.mo2052() > i23) {
                                                        interfaceC15306.mo2051(i20 - i23, 0);
                                                    }
                                                } else if (i22 >= 2 && interfaceC15306.mo2053() - i20 > i23) {
                                                    interfaceC15306.mo2051(i23 + i20, 0);
                                                }
                                            }
                                        } else {
                                            fFloatValue = ((Number) ((AbstractC2182) c1191.f1528).getValue()).floatValue();
                                            if (fFloatValue >= f11) {
                                            }
                                            Ref$FloatRef ref$FloatRef32 = ref$FloatRef;
                                            f10 = f11 - ref$FloatRef32.element;
                                            fMo1811 = interfaceC15306.mo1811(f10);
                                            if (!AbstractC1563.m2085(interfaceC15306, i20)) {
                                                if (f10 == fMo1811) {
                                                }
                                            }
                                        }
                                    }
                                    if (!AbstractC1563.m2084(z5, interfaceC15306, i20, i21)) {
                                        if (AbstractC1563.m2085(interfaceC15306, i20)) {
                                            throw new ItemFoundInScroll(interfaceC15306.mo2048(i20), (C1196) ref$ObjectRef.element);
                                        }
                                        return c6008;
                                    }
                                    interfaceC15306.mo2051(i20, i21);
                                    ref$BooleanRef3.element = false;
                                    c1191.m1606();
                                    return c6008;
                                }
                            };
                            lazyLayoutScrollScopeKt$animateScrollToItem$13.L$0 = interfaceC15302;
                            lazyLayoutScrollScopeKt$animateScrollToItem$13.L$1 = ref$BooleanRef2;
                            lazyLayoutScrollScopeKt$animateScrollToItem$13.L$2 = ref$ObjectRef;
                            lazyLayoutScrollScopeKt$animateScrollToItem$13.L$3 = ref$IntRef2;
                            lazyLayoutScrollScopeKt$animateScrollToItem$13.I$0 = i5;
                            lazyLayoutScrollScopeKt$animateScrollToItem$13.I$1 = i4;
                            lazyLayoutScrollScopeKt$animateScrollToItem$13.I$2 = i13;
                            lazyLayoutScrollScopeKt$animateScrollToItem$13.F$0 = f;
                            lazyLayoutScrollScopeKt$animateScrollToItem$13.F$1 = f;
                            lazyLayoutScrollScopeKt$animateScrollToItem$13.F$2 = f3;
                            lazyLayoutScrollScopeKt$animateScrollToItem$13.I$3 = i9;
                            f5 = f;
                            i14 = 1;
                            lazyLayoutScrollScopeKt$animateScrollToItem$13.label = 1;
                            if (AbstractC1176.m1585(c1196, f9, null, z3, interfaceC7387, lazyLayoutScrollScopeKt$animateScrollToItem$14, 2) != coroutineSingletons) {
                                ref$IntRef = ref$IntRef2;
                                i6 = i4;
                                lazyLayoutScrollScopeKt$animateScrollToItem$13 = lazyLayoutScrollScopeKt$animateScrollToItem$14;
                                i8 = i5;
                                ref$IntRef.element += i14;
                                interfaceC15303 = interfaceC15302;
                                ref$BooleanRef = ref$BooleanRef2;
                                f2 = f5;
                                f6 = 0.0f;
                                i7 = i13;
                                z2 = true;
                                ref$IntRef2 = ref$IntRef;
                                if (ref$BooleanRef.element) {
                                    int iMo20482 = interfaceC15303.mo2048(i8) + i6;
                                    if (Math.abs(iMo20482) >= f) {
                                    }
                                    ref$ObjectRef.element = AbstractC1176.m1578((C1196) ref$ObjectRef.element, f6, f6, 30);
                                    final Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                                    c1196 = (C1196) ref$ObjectRef.element;
                                    Float f92 = new Float(fMax);
                                    boolean z32 = (((Number) ((C1196) ref$ObjectRef.element).m1607()).floatValue() != f6 ? z2 : false) ^ z2;
                                    if (i9 == 0) {
                                    }
                                    interfaceC15305 = interfaceC15303;
                                    i12 = i8;
                                    final Ref$BooleanRef ref$BooleanRef3 = ref$BooleanRef;
                                    final Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                                    final float f10 = fMax;
                                    InterfaceC7387 interfaceC73872 = new InterfaceC7387() { // from class: androidx.compose.foundation.lazy.layout.飘花落叶言子世哲苏兰楪
                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
                                        /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
                                        /* JADX WARN: Removed duplicated region for block: B:9:0x002f A[PHI: r2
  0x002f: PHI (r2v21 float) = (r2v8 float), (r2v26 float) binds: [B:11:0x0041, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
                                        @Override // p068.InterfaceC7387
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                        */
                                        public final Object invoke(Object obj2) {
                                            float fFloatValue;
                                            float f102;
                                            float fMo1811;
                                            C1191 c1191 = (C1191) obj2;
                                            InterfaceC1530 interfaceC15306 = interfaceC15305;
                                            int i20 = i12;
                                            boolean zM2085 = AbstractC1563.m2085(interfaceC15306, i20);
                                            Ref$BooleanRef ref$BooleanRef32 = ref$BooleanRef3;
                                            boolean z5 = z4;
                                            int i21 = i6;
                                            C6008 c6008 = C6008.f15084;
                                            if (!zM2085) {
                                                float f11 = f10;
                                                if (f11 > 0.0f) {
                                                    fFloatValue = ((Number) ((AbstractC2182) c1191.f1528).getValue()).floatValue();
                                                    if (fFloatValue <= f11) {
                                                        f11 = fFloatValue;
                                                    }
                                                    Ref$FloatRef ref$FloatRef32 = ref$FloatRef3;
                                                    f102 = f11 - ref$FloatRef32.element;
                                                    fMo1811 = interfaceC15306.mo1811(f102);
                                                    if (!AbstractC1563.m2085(interfaceC15306, i20) && !AbstractC1563.m2084(z5, interfaceC15306, i20, i21)) {
                                                        if (f102 == fMo1811) {
                                                            c1191.m1606();
                                                            ref$BooleanRef32.element = false;
                                                            return c6008;
                                                        }
                                                        ref$FloatRef32.element += f102;
                                                        float f12 = f2;
                                                        if (z5) {
                                                            if (((Number) ((AbstractC2182) c1191.f1528).getValue()).floatValue() > f12) {
                                                                c1191.m1606();
                                                            }
                                                        } else if (((Number) ((AbstractC2182) c1191.f1528).getValue()).floatValue() < (-f12)) {
                                                            c1191.m1606();
                                                        }
                                                        int i22 = ref$IntRef2.element;
                                                        int i23 = i7;
                                                        if (z5) {
                                                            if (i22 >= 2 && i20 - interfaceC15306.mo2052() > i23) {
                                                                interfaceC15306.mo2051(i20 - i23, 0);
                                                            }
                                                        } else if (i22 >= 2 && interfaceC15306.mo2053() - i20 > i23) {
                                                            interfaceC15306.mo2051(i23 + i20, 0);
                                                        }
                                                    }
                                                } else {
                                                    fFloatValue = ((Number) ((AbstractC2182) c1191.f1528).getValue()).floatValue();
                                                    if (fFloatValue >= f11) {
                                                    }
                                                    Ref$FloatRef ref$FloatRef322 = ref$FloatRef3;
                                                    f102 = f11 - ref$FloatRef322.element;
                                                    fMo1811 = interfaceC15306.mo1811(f102);
                                                    if (!AbstractC1563.m2085(interfaceC15306, i20)) {
                                                        if (f102 == fMo1811) {
                                                        }
                                                    }
                                                }
                                            }
                                            if (!AbstractC1563.m2084(z5, interfaceC15306, i20, i21)) {
                                                if (AbstractC1563.m2085(interfaceC15306, i20)) {
                                                    throw new ItemFoundInScroll(interfaceC15306.mo2048(i20), (C1196) ref$ObjectRef2.element);
                                                }
                                                return c6008;
                                            }
                                            interfaceC15306.mo2051(i20, i21);
                                            ref$BooleanRef32.element = false;
                                            c1191.m1606();
                                            return c6008;
                                        }
                                    };
                                    interfaceC15302 = interfaceC15305;
                                    i5 = i12;
                                    ref$BooleanRef2 = ref$BooleanRef3;
                                    float f11 = f2;
                                    i13 = i7;
                                    i4 = i6;
                                    ref$ObjectRef = ref$ObjectRef2;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$13.L$0 = interfaceC15302;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$13.L$1 = ref$BooleanRef2;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$13.L$2 = ref$ObjectRef;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$13.L$3 = ref$IntRef2;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$13.I$0 = i5;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$13.I$1 = i4;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$13.I$2 = i13;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$13.F$0 = f;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$13.F$1 = f11;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$13.F$2 = f3;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$13.I$3 = i9;
                                    f5 = f11;
                                    i14 = 1;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$13.label = 1;
                                    lazyLayoutScrollScopeKt$animateScrollToItem$14 = lazyLayoutScrollScopeKt$animateScrollToItem$13;
                                    if (AbstractC1176.m1585(c1196, f92, null, z32, interfaceC73872, lazyLayoutScrollScopeKt$animateScrollToItem$14, 2) != coroutineSingletons) {
                                    }
                                }
                            }
                        } catch (ItemFoundInScroll e6) {
                            e = e6;
                            lazyLayoutScrollScopeKt$animateScrollToItem$14 = lazyLayoutScrollScopeKt$animateScrollToItem$13;
                        }
                        interfaceC15302 = interfaceC15305;
                        i5 = i12;
                        ref$BooleanRef2 = ref$BooleanRef3;
                        float f112 = f2;
                        i13 = i7;
                        i4 = i6;
                        ref$ObjectRef = ref$ObjectRef2;
                    } catch (ItemFoundInScroll e7) {
                        e = e7;
                        lazyLayoutScrollScopeKt$animateScrollToItem$14 = lazyLayoutScrollScopeKt$animateScrollToItem$13;
                        interfaceC15302 = interfaceC15305;
                        i5 = i12;
                        i4 = i6;
                        lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$14;
                        c1196M1578 = AbstractC1176.m1578(e.getPreviousAnimation(), 0.0f, 0.0f, 30);
                        float itemOffset22 = e.getItemOffset() + i4;
                        Ref$FloatRef ref$FloatRef22 = new Ref$FloatRef();
                        f4 = new Float(itemOffset22);
                        if (((Number) c1196M1578.m1607()).floatValue() == 0.0f) {
                        }
                        c1326 = new C1326(itemOffset22, ref$FloatRef22, interfaceC15302, 1);
                        lazyLayoutScrollScopeKt$animateScrollToItem$12.L$0 = interfaceC15302;
                        lazyLayoutScrollScopeKt$animateScrollToItem$12.L$1 = null;
                        lazyLayoutScrollScopeKt$animateScrollToItem$12.L$2 = null;
                        lazyLayoutScrollScopeKt$animateScrollToItem$12.L$3 = null;
                        lazyLayoutScrollScopeKt$animateScrollToItem$12.I$0 = i5;
                        lazyLayoutScrollScopeKt$animateScrollToItem$12.I$1 = i4;
                        lazyLayoutScrollScopeKt$animateScrollToItem$12.label = 2;
                        if (AbstractC1176.m1585(c1196M1578, f4, null, !z, c1326, lazyLayoutScrollScopeKt$animateScrollToItem$12, 2) != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    interfaceC15305 = interfaceC15303;
                    i12 = i8;
                    final Ref$BooleanRef ref$BooleanRef32 = ref$BooleanRef;
                    final Ref$ObjectRef ref$ObjectRef22 = ref$ObjectRef;
                    final float f102 = fMax;
                } catch (ItemFoundInScroll e8) {
                    e = e8;
                    interfaceC15302 = interfaceC15303;
                    i5 = i8;
                    lazyLayoutScrollScopeKt$animateScrollToItem$14 = lazyLayoutScrollScopeKt$animateScrollToItem$13;
                }
                ref$ObjectRef.element = AbstractC1176.m1578((C1196) ref$ObjectRef.element, f6, f6, 30);
                final Ref$FloatRef ref$FloatRef32 = new Ref$FloatRef();
                c1196 = (C1196) ref$ObjectRef.element;
            } catch (ItemFoundInScroll e9) {
                e = e9;
                lazyLayoutScrollScopeKt$animateScrollToItem$12 = lazyLayoutScrollScopeKt$animateScrollToItem$14;
                c1196M1578 = AbstractC1176.m1578(e.getPreviousAnimation(), 0.0f, 0.0f, 30);
                float itemOffset222 = e.getItemOffset() + i4;
                Ref$FloatRef ref$FloatRef222 = new Ref$FloatRef();
                f4 = new Float(itemOffset222);
                if (((Number) c1196M1578.m1607()).floatValue() == 0.0f) {
                }
                c1326 = new C1326(itemOffset222, ref$FloatRef222, interfaceC15302, 1);
                lazyLayoutScrollScopeKt$animateScrollToItem$12.L$0 = interfaceC15302;
                lazyLayoutScrollScopeKt$animateScrollToItem$12.L$1 = null;
                lazyLayoutScrollScopeKt$animateScrollToItem$12.L$2 = null;
                lazyLayoutScrollScopeKt$animateScrollToItem$12.L$3 = null;
                lazyLayoutScrollScopeKt$animateScrollToItem$12.I$0 = i5;
                lazyLayoutScrollScopeKt$animateScrollToItem$12.I$1 = i4;
                lazyLayoutScrollScopeKt$animateScrollToItem$12.label = 2;
                if (AbstractC1176.m1585(c1196M1578, f4, null, !z, c1326, lazyLayoutScrollScopeKt$animateScrollToItem$12, 2) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            lazyLayoutScrollScopeKt$animateScrollToItem$14 = lazyLayoutScrollScopeKt$animateScrollToItem$13;
            return coroutineSingletons;
        }
        return C6008.f15084;
        c1196M1578 = AbstractC1176.m1578(e.getPreviousAnimation(), 0.0f, 0.0f, 30);
        float itemOffset2222 = e.getItemOffset() + i4;
        Ref$FloatRef ref$FloatRef2222 = new Ref$FloatRef();
        f4 = new Float(itemOffset2222);
        z = ((Number) c1196M1578.m1607()).floatValue() == 0.0f;
        c1326 = new C1326(itemOffset2222, ref$FloatRef2222, interfaceC15302, 1);
        lazyLayoutScrollScopeKt$animateScrollToItem$12.L$0 = interfaceC15302;
        lazyLayoutScrollScopeKt$animateScrollToItem$12.L$1 = null;
        lazyLayoutScrollScopeKt$animateScrollToItem$12.L$2 = null;
        lazyLayoutScrollScopeKt$animateScrollToItem$12.L$3 = null;
        lazyLayoutScrollScopeKt$animateScrollToItem$12.I$0 = i5;
        lazyLayoutScrollScopeKt$animateScrollToItem$12.I$1 = i4;
        lazyLayoutScrollScopeKt$animateScrollToItem$12.label = 2;
        if (AbstractC1176.m1585(c1196M1578, f4, null, !z, c1326, lazyLayoutScrollScopeKt$animateScrollToItem$12, 2) != coroutineSingletons) {
            interfaceC15304 = interfaceC15302;
            i10 = i4;
            i11 = i5;
            interfaceC15304.mo2051(i11, i10);
            return C6008.f15084;
        }
        return coroutineSingletons;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int m2077(int i, C2059 c2059) {
        int i2 = c2059.f3865 - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = c2059.f3866;
            int i5 = ((C1561) objArr[i4]).f2374;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((C1561) objArr[i3]).f2374) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m2078(C1603 c1603, Object obj, int i, Object obj2, InterfaceC2208 interfaceC2208, int i2) {
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(1439843069);
        int i3 = (c2159.m2920(c1603) ? 4 : 2) | i2 | (c2159.m2920(obj) ? 32 : 16) | (c2159.m2922(i) ? 256 : 128) | (c2159.m2920(obj2) ? 2048 : 1024);
        if (c2159.m2903(i3 & 1, (i3 & 1171) != 1170)) {
            ((InterfaceC8169) obj).mo2042(obj2, AbstractC2089.m2749(980966366, new C1606(i, c1603, obj2), c2159), c2159, 48);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1536(c1603, obj, i, obj2, i2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m2079(final C2077 c2077, InterfaceC2208 interfaceC2208, final int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(-709502251);
        int i2 = 2;
        if (c2159.m2903(i & 1, (i & 3) != 2)) {
            C2169 c2169 = AbstractC8177.f19919;
            InterfaceC8174 interfaceC8174 = (InterfaceC8174) c2159.m2943(c2169);
            c2159.m2952(1967007413);
            Object[] objArr = new Object[0];
            Object objM2905 = c2159.m2905();
            C2188 c2188 = C2204.f4319;
            if (objM2905 == c2188) {
                objM2905 = new C7996(6);
                c2159.m2946(objM2905);
            }
            C8168 c8168 = (C8168) AbstractC8176.m13097(objArr, C8168.f19895, (InterfaceC7372) objM2905, c2159, 384);
            c8168.f19898 = (InterfaceC8174) c2159.m2943(c2169);
            c2159.m2937(false);
            Object[] objArr2 = {interfaceC8174};
            C5703 c5703 = new C5703(new C1594(i2), 13, new C0849(interfaceC8174, 12, c8168));
            boolean zM2938 = c2159.m2938(interfaceC8174) | c2159.m2938(c8168);
            Object objM29052 = c2159.m2905();
            int i3 = 3;
            if (zM2938 || objM29052 == c2188) {
                objM29052 = new C0851(interfaceC8174, i3, c8168);
                c2159.m2946(objM29052);
            }
            C1524 c1524 = (C1524) AbstractC8176.m13097(objArr2, c5703, (InterfaceC7372) objM29052, c2159, 0);
            AbstractC2202.m3047(c2169.mo2988(c1524), AbstractC2089.m2749(-412824043, new C1898(c2077, i3, c1524), c2159), c2159, 56);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new InterfaceC7383(i) { // from class: androidx.compose.foundation.lazy.layout.飘花落叶言子世兰苏哲楪
                @Override // p068.InterfaceC7383
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM3031 = AbstractC2202.m3031(7);
                    AbstractC1563.m2079(this.f2252, (InterfaceC2208) obj, iM3031);
                    return C6008.f15084;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m2080(final Object obj, final int i, final C1540 c1540, final C2077 c2077, InterfaceC2208 interfaceC2208, final int i2) {
        int i3;
        C1542 c1542;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(872548579);
        if ((i2 & 6) == 0) {
            i3 = (c2159.m2938(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c2159.m2922(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c2159.m2938(c1540) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= c2159.m2938(c2077) ? 2048 : 1024;
        }
        if (c2159.m2903(i3 & 1, (i3 & 1171) != 1170)) {
            boolean zM2920 = c2159.m2920(obj) | c2159.m2920(c1540);
            Object objM2905 = c2159.m2905();
            C2188 c2188 = C2204.f4319;
            if (zM2920 || objM2905 == c2188) {
                objM2905 = new C1542(obj, c1540);
                c2159.m2946(objM2905);
            }
            C1542 c15422 = (C1542) objM2905;
            c15422.f2319 = i;
            InterfaceC2230 interfaceC2230 = c15422.f2322;
            C2193 c2193 = AbstractC2544.f5326;
            InterfaceC2545 interfaceC2545 = (InterfaceC2545) c2159.m2943(c2193);
            AbstractC2121 abstractC2121M2791 = AbstractC2109.m2791();
            InterfaceC7387 interfaceC7387Mo2763 = abstractC2121M2791 != null ? abstractC2121M2791.mo2763() : null;
            AbstractC2121 abstractC2121M2803 = AbstractC2109.m2803(abstractC2121M2791);
            try {
                if (interfaceC2545 != ((InterfaceC2545) ((AbstractC2182) interfaceC2230).getValue())) {
                    ((AbstractC2182) interfaceC2230).setValue(interfaceC2545);
                    if (c15422.f2318 > 0) {
                        C1542 c15423 = c15422.f2317;
                        if (c15423 != null) {
                            c15423.m2059();
                        }
                        if (interfaceC2545 != null) {
                            c1542 = (C1542) interfaceC2545;
                            c1542.m2060();
                        } else {
                            c1542 = null;
                        }
                        c15422.f2317 = c1542;
                    }
                }
                AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
                boolean zM29202 = c2159.m2920(c15422);
                Object objM29052 = c2159.m2905();
                if (zM29202 || objM29052 == c2188) {
                    objM29052 = new C1564(c15422, 2);
                    c2159.m2946(objM29052);
                }
                AbstractC2202.m3044(c15422, (InterfaceC7387) objM29052, c2159);
                AbstractC2202.m3047(c2193.mo2988(c15422), c2077, c2159, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                AbstractC2109.m2797(abstractC2121M2791, abstractC2121M2803, interfaceC7387Mo2763);
                throw th;
            }
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new InterfaceC7383() { // from class: androidx.compose.foundation.lazy.layout.飘花落叶言子世苏楪兰哲
                @Override // p068.InterfaceC7383
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    AbstractC1563.m2080(obj, i, c1540, c2077, (InterfaceC2208) obj2, AbstractC2202.m3031(i2 | 1));
                    return C6008.f15084;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m2081(final InterfaceC7372 interfaceC7372, final InterfaceC2962 interfaceC2962, final C1537 c1537, final C1599 c1599, InterfaceC2208 interfaceC2208, final int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(1055276397);
        int i2 = (c2159.m2938(interfaceC7372) ? 4 : 2) | i | (c2159.m2920(interfaceC2962) ? 32 : 16) | (c2159.m2920(c1537) ? 256 : 128) | (c2159.m2920(c1599) ? 2048 : 1024);
        if (c2159.m2903(i2 & 1, (i2 & 1171) != 1170)) {
            final InterfaceC2230 interfaceC2230M3039 = AbstractC2202.m3039(interfaceC7372, c2159);
            m2079(AbstractC2089.m2749(-933153643, new InterfaceC7380() { // from class: androidx.compose.foundation.lazy.layout.飘花落叶言子世楪苏兰哲
                @Override // p068.InterfaceC7380
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    InterfaceC2962 interfaceC2962Mo4426;
                    InterfaceC8169 interfaceC8169 = (InterfaceC8169) obj;
                    ((Integer) obj3).getClass();
                    C2159 c21592 = (C2159) ((InterfaceC2208) obj2);
                    Object objM2905 = c21592.m2905();
                    C2188 c2188 = C2204.f4319;
                    if (objM2905 == c2188) {
                        objM2905 = new C1552(interfaceC8169, new C1526(interfaceC2230M3039, 3));
                        c21592.m2946(objM2905);
                    }
                    final C1552 c1552 = (C1552) objM2905;
                    Object objM29052 = c21592.m2905();
                    if (objM29052 == c2188) {
                        objM29052 = new C2554(new C0923(c1552));
                        c21592.m2946(objM29052);
                    }
                    final C2554 c2554 = (C2554) objM29052;
                    final C1537 c15372 = c1537;
                    if (c15372 != null) {
                        c21592.m2952(1743490539);
                        c21592.m2952(887527095);
                        final InterfaceC1576 interfaceC1576 = AbstractC1574.f2413;
                        if (interfaceC1576 != null) {
                            c21592.m2952(1345554384);
                        } else {
                            c21592.m2952(1345603457);
                            View view = (View) c21592.m2943(AbstractC2670.f5677);
                            boolean zM2920 = c21592.m2920(view);
                            Object objM29053 = c21592.m2905();
                            if (zM2920 || objM29053 == c2188) {
                                Object tag = view.getTag(C0328R.id.compose_prefetch_scheduler);
                                objM29053 = tag instanceof InterfaceC1576 ? (InterfaceC1576) tag : null;
                                if (objM29053 == null) {
                                    objM29053 = new ViewOnAttachStateChangeListenerC1547(view);
                                    view.setTag(C0328R.id.compose_prefetch_scheduler, objM29053);
                                }
                                c21592.m2946(objM29053);
                            }
                            interfaceC1576 = (InterfaceC1576) objM29053;
                        }
                        c21592.m2937(false);
                        c21592.m2937(false);
                        Object[] objArr = {c15372, c1552, c2554, interfaceC1576};
                        boolean zM29202 = c21592.m2920(c15372) | c21592.m2938(c1552) | c21592.m2938(c2554) | c21592.m2938(interfaceC1576);
                        Object objM29054 = c21592.m2905();
                        if (zM29202 || objM29054 == c2188) {
                            objM29054 = new InterfaceC7387() { // from class: androidx.compose.foundation.lazy.layout.飘花落叶言子世楪哲兰苏
                                @Override // p068.InterfaceC7387
                                public final Object invoke(Object obj4) {
                                    C1575 c1575 = new C1575(c1552, c2554, interfaceC1576);
                                    C1537 c15373 = c15372;
                                    c15373.f2304 = c1575;
                                    return new C1554(c15373, 1);
                                }
                            };
                            c21592.m2946(objM29054);
                        }
                        InterfaceC7387 interfaceC7387 = (InterfaceC7387) objM29054;
                        boolean zM29203 = false;
                        for (Object obj4 : Arrays.copyOf(objArr, 4)) {
                            zM29203 |= c21592.m2920(obj4);
                        }
                        Object objM29055 = c21592.m2905();
                        if (zM29203 || objM29055 == c2188) {
                            c21592.m2946(new C2194(interfaceC7387));
                        }
                        c21592.m2937(false);
                    } else {
                        c21592.m2952(1744076749);
                        c21592.m2937(false);
                    }
                    int i3 = AbstractC1528.f2264;
                    InterfaceC2962 interfaceC29622 = interfaceC2962;
                    if (c15372 != null && (interfaceC2962Mo4426 = interfaceC29622.mo4426(new C1568(c15372))) != null) {
                        interfaceC29622 = interfaceC2962Mo4426;
                    }
                    boolean zM29204 = c21592.m2920(c1552);
                    C1599 c15992 = c1599;
                    boolean zM29205 = zM29204 | c21592.m2920(c15992);
                    Object objM29056 = c21592.m2905();
                    if (zM29205 || objM29056 == c2188) {
                        objM29056 = new C1898(c1552, 2, c15992);
                        c21592.m2946(objM29056);
                    }
                    AbstractC2505.m3663(c2554, interfaceC29622, (InterfaceC7383) objM29056, c21592, 8, 0);
                    return C6008.f15084;
                }
            }, c2159), c2159, 6);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new InterfaceC7383(interfaceC2962, c1537, c1599, i) { // from class: androidx.compose.foundation.lazy.layout.飘花落叶言子世楪哲苏兰

                /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
                public final /* synthetic */ C1599 f2288;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC2962 f2289;

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
                public final /* synthetic */ C1537 f2290;

                @Override // p068.InterfaceC7383
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM3031 = AbstractC2202.m3031(1);
                    AbstractC1563.m2081(this.f2291, this.f2289, this.f2290, this.f2288, (InterfaceC2208) obj, iM3031);
                    return C6008.f15084;
                }
            };
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final InterfaceC2962 m2082(InterfaceC2962 interfaceC2962, InterfaceC5929 interfaceC5929, C1584 c1584, Orientation orientation, boolean z) {
        return interfaceC2962.mo4426(new C1525(interfaceC5929, c1584, orientation, z));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static InterfaceC2230 m2083() {
        return AbstractC2202.m3035(C6008.f15084, C2188.f4265);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final boolean m2084(boolean z, InterfaceC1530 interfaceC1530, int i, int i2) {
        if (z) {
            if (interfaceC1530.mo2053() > i) {
                return true;
            }
            return interfaceC1530.mo2053() == i && interfaceC1530.mo2050() > i2;
        }
        if (interfaceC1530.mo2053() < i) {
            return true;
        }
        return interfaceC1530.mo2053() == i && interfaceC1530.mo2050() < i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final boolean m2085(InterfaceC1530 interfaceC1530, int i) {
        return i <= interfaceC1530.mo2052() && interfaceC1530.mo2053() <= i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final InterfaceC2962 m2086(C1583 c1583, C1382 c1382, Orientation orientation) {
        return new C1566(c1583, c1382, orientation);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final int m2087(int i, C1603 c1603, Object obj) {
        int iM2035;
        return (obj == null || c1603.m2131() == 0 || (i < c1603.m2131() && obj.equals(c1603.m2130(i))) || (iM2035 = c1603.f2571.m2035(obj)) == -1) ? i : iM2035;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Object m2088(int i) {
        Object objInvoke;
        C1561 c1561M2036 = ((C1601) this).f2569.m2036(i);
        int i2 = i - c1561M2036.f2374;
        InterfaceC7387 interfaceC7387 = (InterfaceC7387) c1561M2036.f2372.f664;
        return (interfaceC7387 == null || (objInvoke = interfaceC7387.invoke(Integer.valueOf(i2))) == null) ? new DefaultLazyKey(i) : objInvoke;
    }
}
