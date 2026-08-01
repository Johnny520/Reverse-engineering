package androidx.compose.foundation.gestures;

import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2456;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.InterfaceC6039;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.TransformableKt", m556f = "Transformable.kt", m557l = {461, 463, 521}, m558m = "detectZoom", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class TransformableKt$detectZoom$1 extends ContinuationImpl {
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    public TransformableKt$detectZoom$1(InterfaceC5189<? super TransformableKt$detectZoom$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x02b7, code lost:
    
        if (r5 != 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02b9, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0104, code lost:
    
        r1 = r14.f5192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0108, code lost:
    
        if (r1 != 10) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010d, code lost:
    
        if (r1 != 11) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0112, code lost:
    
        if (r1 != 12) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0116, code lost:
    
        if (r1 != 7) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0119, code lost:
    
        if (r1 != 8) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011e, code lost:
    
        if (r1 != 9) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0122, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02be A[EDGE_INSN: B:124:0x02be->B:111:0x02be BREAK  A[LOOP:0: B:105:0x02a9->B:110:0x02bb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0104 A[EDGE_INSN: B:128:0x0104->B:28:0x0104 BREAK  A[LOOP:2: B:22:0x00f0->B:27:0x0101], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0255  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x0292 -> B:104:0x029c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i;
        float f;
        int i2;
        long j;
        float f2;
        float f3;
        boolean z;
        InterfaceC7387 interfaceC7387;
        InterfaceC6039 interfaceC6039;
        Object objM3559;
        InterfaceC2468 interfaceC2468;
        float f4;
        float f5;
        float f6;
        long jM13084;
        InterfaceC6039 interfaceC60392;
        boolean z2;
        int i3;
        C2487 c2487;
        int size;
        int i4;
        int i5;
        CoroutineSingletons coroutineSingletons;
        boolean z3;
        float f7;
        int i6;
        int i7;
        Object objM35592;
        CoroutineSingletons coroutineSingletons2;
        boolean z4;
        long jM13085;
        float f8;
        int i8;
        int i9;
        InterfaceC2468 interfaceC24682;
        TransformableKt$detectZoom$1 transformableKt$detectZoom$1 = this;
        transformableKt$detectZoom$1.result = obj;
        int i10 = transformableKt$detectZoom$1.label | Integer.MIN_VALUE;
        transformableKt$detectZoom$1.label = i10;
        if ((i10 & Integer.MIN_VALUE) != 0) {
            transformableKt$detectZoom$1.label = i10 - Integer.MIN_VALUE;
        } else {
            transformableKt$detectZoom$1 = new TransformableKt$detectZoom$1(transformableKt$detectZoom$1);
        }
        Object obj3 = transformableKt$detectZoom$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = transformableKt$detectZoom$1.label;
        if (i11 == 0) {
            AbstractC6017.m10769(obj3);
            throw null;
        }
        if (i11 == 1) {
            obj2 = null;
            i = transformableKt$detectZoom$1.I$1;
            f = transformableKt$detectZoom$1.F$2;
            i2 = transformableKt$detectZoom$1.I$0;
            j = transformableKt$detectZoom$1.J$0;
            f2 = transformableKt$detectZoom$1.F$1;
            f3 = transformableKt$detectZoom$1.F$0;
            z = transformableKt$detectZoom$1.Z$0;
            interfaceC7387 = (InterfaceC7387) transformableKt$detectZoom$1.L$2;
            interfaceC6039 = (InterfaceC6039) transformableKt$detectZoom$1.L$1;
            InterfaceC2468 interfaceC24683 = (InterfaceC2468) transformableKt$detectZoom$1.L$0;
            AbstractC6017.m10769(obj3);
            interfaceC24682 = interfaceC24683;
            transformableKt$detectZoom$1.L$0 = interfaceC24682;
            transformableKt$detectZoom$1.L$1 = interfaceC6039;
            transformableKt$detectZoom$1.L$2 = interfaceC7387;
            transformableKt$detectZoom$1.L$3 = obj2;
            transformableKt$detectZoom$1.Z$0 = z;
            transformableKt$detectZoom$1.F$0 = f3;
            transformableKt$detectZoom$1.F$1 = f2;
            transformableKt$detectZoom$1.J$0 = j;
            transformableKt$detectZoom$1.I$0 = i2;
            transformableKt$detectZoom$1.F$2 = f;
            transformableKt$detectZoom$1.I$1 = i;
            transformableKt$detectZoom$1.label = 2;
            objM3559 = ((C2456) interfaceC24682).m3559(PointerEventPass.Main, transformableKt$detectZoom$1);
            if (objM3559 != coroutineSingletons3) {
            }
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i5 = transformableKt$detectZoom$1.I$2;
                i7 = transformableKt$detectZoom$1.I$1;
                float f9 = transformableKt$detectZoom$1.F$2;
                int i12 = transformableKt$detectZoom$1.I$0;
                long j2 = transformableKt$detectZoom$1.J$0;
                float f10 = transformableKt$detectZoom$1.F$1;
                float f11 = transformableKt$detectZoom$1.F$0;
                boolean z5 = transformableKt$detectZoom$1.Z$0;
                C2487 c24872 = (C2487) transformableKt$detectZoom$1.L$3;
                InterfaceC7387 interfaceC73872 = (InterfaceC7387) transformableKt$detectZoom$1.L$2;
                InterfaceC6039 interfaceC60393 = (InterfaceC6039) transformableKt$detectZoom$1.L$1;
                InterfaceC2468 interfaceC24684 = (InterfaceC2468) transformableKt$detectZoom$1.L$0;
                AbstractC6017.m10769(obj3);
                coroutineSingletons2 = coroutineSingletons3;
                boolean z6 = z5;
                i2 = i12;
                interfaceC7387 = interfaceC73872;
                f2 = f10;
                c2487 = c24872;
                InterfaceC2468 interfaceC24685 = interfaceC24684;
                interfaceC6039 = interfaceC60393;
                f = f9;
                j = j2;
                f5 = f11;
                List list = ((C2487) obj3).f5197;
                TransformableKt$detectZoom$1 transformableKt$detectZoom$12 = transformableKt$detectZoom$1;
                int size2 = list.size();
                boolean z7 = z6;
                int i13 = 0;
                while (true) {
                    if (i13 < size2) {
                        if (((C2478) list.get(i13)).m3582()) {
                            break;
                        }
                        i13++;
                    } else {
                        break;
                    }
                }
                boolean z8 = false;
                if (i5 == 0 && !z8) {
                    List list2 = c2487.f5197;
                    int size3 = list2.size();
                    int i14 = 0;
                    while (i14 < size3) {
                        if (((C2478) list2.get(i14)).f5151) {
                            i = i7;
                            f3 = f5;
                            coroutineSingletons3 = coroutineSingletons2;
                            transformableKt$detectZoom$1 = transformableKt$detectZoom$12;
                            z = z7;
                            obj2 = null;
                            interfaceC24682 = interfaceC24685;
                            transformableKt$detectZoom$1.L$0 = interfaceC24682;
                            transformableKt$detectZoom$1.L$1 = interfaceC6039;
                            transformableKt$detectZoom$1.L$2 = interfaceC7387;
                            transformableKt$detectZoom$1.L$3 = obj2;
                            transformableKt$detectZoom$1.Z$0 = z;
                            transformableKt$detectZoom$1.F$0 = f3;
                            transformableKt$detectZoom$1.F$1 = f2;
                            transformableKt$detectZoom$1.J$0 = j;
                            transformableKt$detectZoom$1.I$0 = i2;
                            transformableKt$detectZoom$1.F$2 = f;
                            transformableKt$detectZoom$1.I$1 = i;
                            transformableKt$detectZoom$1.label = 2;
                            objM3559 = ((C2456) interfaceC24682).m3559(PointerEventPass.Main, transformableKt$detectZoom$1);
                            if (objM3559 != coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                            InterfaceC6039 interfaceC60394 = interfaceC6039;
                            f4 = f;
                            i3 = i2;
                            z2 = z;
                            f5 = f3;
                            f6 = f2;
                            jM13084 = j;
                            interfaceC60392 = interfaceC60394;
                            interfaceC2468 = interfaceC24682;
                            c2487 = (C2487) objM3559;
                            List list3 = c2487.f5197;
                            size = list3.size();
                            int i15 = i;
                            int i16 = i3;
                            i4 = 0;
                            while (true) {
                                if (i4 >= size) {
                                    break;
                                }
                                if (((C2478) list3.get(i4)).m3582()) {
                                    break;
                                }
                                i4++;
                            }
                            i5 = 1;
                            if (i5 != 0) {
                                float fM1864 = AbstractC1362.m1864(c2487, true);
                                float fM18642 = AbstractC1362.m1864(c2487, false);
                                float f12 = (fM1864 == 0.0f || fM18642 == 0.0f) ? 1.0f : fM1864 / fM18642;
                                float fM1863 = AbstractC1362.m1863(c2487);
                                float f13 = f6;
                                float f14 = f5;
                                long jM1872 = AbstractC1362.m1872(c2487, true, new C1361(8));
                                boolean z9 = z2;
                                if (C8158.m13087(jM1872, 9205357640488583168L)) {
                                    z3 = z9;
                                    coroutineSingletons = coroutineSingletons3;
                                    jM13085 = 0;
                                    z4 = false;
                                } else {
                                    z3 = z9;
                                    coroutineSingletons = coroutineSingletons3;
                                    z4 = false;
                                    jM13085 = C8158.m13085(jM1872, AbstractC1362.m1872(c2487, false, new C1361(8)));
                                }
                                if (i16 == 0) {
                                    f8 = f13 * f12;
                                    f5 = f14 + fM1863;
                                    jM13084 = C8158.m13084(jM13084, jM13085);
                                    float fM18643 = AbstractC1362.m1864(c2487, z4);
                                    float fAbs = Math.abs(1.0f - f8) * fM18643;
                                    float fAbs2 = Math.abs(((3.1415927f * f5) * fM18643) / 180.0f);
                                    float fM13086 = C8158.m13086(jM13084);
                                    if (fAbs > f4 || fAbs2 > f4 || (fM13086 > f4 && ((Boolean) interfaceC7387.invoke(new C8158(jM13085))).booleanValue())) {
                                        int i17 = (!z3 || fAbs2 >= f4) ? 0 : 1;
                                        interfaceC60392.mo8995(C1329.f1813);
                                        i15 = i17;
                                        i8 = 1;
                                    } else {
                                        i8 = i16;
                                    }
                                } else {
                                    f8 = f13;
                                    i8 = i16;
                                    f5 = f14;
                                }
                                if (i8 != 0) {
                                    i9 = i8;
                                    AbstractC1362.m1872(c2487, false, new C1361(8));
                                    if (i15 != 0) {
                                        fM1863 = 0.0f;
                                    }
                                    if (fM1863 != 0.0f || f12 != 1.0f || (!C8158.m13087(jM13085, 0L) && ((Boolean) interfaceC7387.invoke(new C8158(jM13085))).booleanValue())) {
                                        interfaceC60392.mo8995(new C1330());
                                    }
                                    List list4 = c2487.f5197;
                                    int size4 = list4.size();
                                    int i18 = 0;
                                    while (i18 < size4) {
                                        C2478 c2478 = (C2478) list4.get(i18);
                                        List list5 = list4;
                                        int i19 = size4;
                                        int i20 = i18;
                                        if (!C8158.m13087(AbstractC2481.m3591(c2478, false), 0L)) {
                                            c2478.m3584();
                                        }
                                        size4 = i19;
                                        i18 = i20 + 1;
                                        list4 = list5;
                                    }
                                } else {
                                    i9 = i8;
                                }
                                f7 = f8;
                                i6 = i9;
                            } else {
                                coroutineSingletons = coroutineSingletons3;
                                z3 = z2;
                                interfaceC60392.mo8995(C1333.f1817);
                                f7 = f6;
                                i6 = i16;
                            }
                            i7 = i15;
                            PointerEventPass pointerEventPass = PointerEventPass.Final;
                            transformableKt$detectZoom$1.L$0 = interfaceC2468;
                            transformableKt$detectZoom$1.L$1 = interfaceC60392;
                            transformableKt$detectZoom$1.L$2 = interfaceC7387;
                            transformableKt$detectZoom$1.L$3 = c2487;
                            boolean z10 = z3;
                            transformableKt$detectZoom$1.Z$0 = z10;
                            transformableKt$detectZoom$1.F$0 = f5;
                            transformableKt$detectZoom$1.F$1 = f7;
                            transformableKt$detectZoom$1.J$0 = jM13084;
                            transformableKt$detectZoom$1.I$0 = i6;
                            transformableKt$detectZoom$1.F$2 = f4;
                            transformableKt$detectZoom$1.I$1 = i7;
                            transformableKt$detectZoom$1.I$2 = i5;
                            transformableKt$detectZoom$1.label = 3;
                            C2456 c2456 = (C2456) interfaceC2468;
                            objM35592 = c2456.m3559(pointerEventPass, transformableKt$detectZoom$1);
                            coroutineSingletons2 = coroutineSingletons;
                            if (objM35592 != coroutineSingletons2) {
                                return coroutineSingletons2;
                            }
                            i2 = i6;
                            obj3 = objM35592;
                            f = f4;
                            interfaceC6039 = interfaceC60392;
                            j = jM13084;
                            f2 = f7;
                            z6 = z10;
                            interfaceC24685 = c2456;
                            List list6 = ((C2487) obj3).f5197;
                            TransformableKt$detectZoom$1 transformableKt$detectZoom$122 = transformableKt$detectZoom$1;
                            int size22 = list6.size();
                            boolean z72 = z6;
                            int i132 = 0;
                            while (true) {
                                if (i132 < size22) {
                                }
                                i132++;
                            }
                            boolean z82 = false;
                            if (i5 == 0) {
                                List list22 = c2487.f5197;
                                int size32 = list22.size();
                                int i142 = 0;
                                while (i142 < size32) {
                                }
                            }
                        } else {
                            i142++;
                        }
                    }
                }
                return C6008.f15084;
            }
            i = transformableKt$detectZoom$1.I$1;
            float f15 = transformableKt$detectZoom$1.F$2;
            int i21 = transformableKt$detectZoom$1.I$0;
            long j3 = transformableKt$detectZoom$1.J$0;
            float f16 = transformableKt$detectZoom$1.F$1;
            float f17 = transformableKt$detectZoom$1.F$0;
            boolean z11 = transformableKt$detectZoom$1.Z$0;
            interfaceC7387 = (InterfaceC7387) transformableKt$detectZoom$1.L$2;
            InterfaceC6039 interfaceC60395 = (InterfaceC6039) transformableKt$detectZoom$1.L$1;
            InterfaceC2468 interfaceC24686 = (InterfaceC2468) transformableKt$detectZoom$1.L$0;
            AbstractC6017.m10769(obj3);
            f4 = f15;
            i3 = i21;
            z2 = z11;
            f5 = f17;
            f6 = f16;
            jM13084 = j3;
            interfaceC60392 = interfaceC60395;
            objM3559 = obj3;
            interfaceC2468 = interfaceC24686;
            c2487 = (C2487) objM3559;
            List list32 = c2487.f5197;
            size = list32.size();
            int i152 = i;
            int i162 = i3;
            i4 = 0;
            while (true) {
                if (i4 >= size) {
                }
                i4++;
            }
            i5 = 1;
            if (i5 != 0) {
            }
            i7 = i152;
            PointerEventPass pointerEventPass2 = PointerEventPass.Final;
            transformableKt$detectZoom$1.L$0 = interfaceC2468;
            transformableKt$detectZoom$1.L$1 = interfaceC60392;
            transformableKt$detectZoom$1.L$2 = interfaceC7387;
            transformableKt$detectZoom$1.L$3 = c2487;
            boolean z102 = z3;
            transformableKt$detectZoom$1.Z$0 = z102;
            transformableKt$detectZoom$1.F$0 = f5;
            transformableKt$detectZoom$1.F$1 = f7;
            transformableKt$detectZoom$1.J$0 = jM13084;
            transformableKt$detectZoom$1.I$0 = i6;
            transformableKt$detectZoom$1.F$2 = f4;
            transformableKt$detectZoom$1.I$1 = i7;
            transformableKt$detectZoom$1.I$2 = i5;
            transformableKt$detectZoom$1.label = 3;
            C2456 c24562 = (C2456) interfaceC2468;
            objM35592 = c24562.m3559(pointerEventPass2, transformableKt$detectZoom$1);
            coroutineSingletons2 = coroutineSingletons;
            if (objM35592 != coroutineSingletons2) {
            }
        }
    }
}
