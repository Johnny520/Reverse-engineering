package androidx.compose.foundation.gestures;

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
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.channels.InterfaceC6039;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.TransformableKt$detectNonTouchGestures$2", m556f = "Transformable.kt", m557l = {288, 315, 331, 349}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class TransformableKt$detectNonTouchGestures$2 extends RestrictedSuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6039 $channel;
    final /* synthetic */ InterfaceC5192 $currentContext;
    final /* synthetic */ InterfaceC1389 $scrollConfig;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableKt$detectNonTouchGestures$2(InterfaceC5192 interfaceC5192, InterfaceC1389 interfaceC1389, InterfaceC6039 interfaceC6039, InterfaceC5189<? super TransformableKt$detectNonTouchGestures$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$currentContext = interfaceC5192;
        this.$scrollConfig = interfaceC1389;
        this.$channel = interfaceC6039;
    }

    private static final boolean invokeSuspend$lambda$0(C2478 c2478) {
        return true;
    }

    private static final boolean invokeSuspend$lambda$1(C2478 c2478) {
        return true;
    }

    private static final boolean invokeSuspend$lambda$3(C2478 c2478) {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        TransformableKt$detectNonTouchGestures$2 transformableKt$detectNonTouchGestures$2 = new TransformableKt$detectNonTouchGestures$2(this.$currentContext, this.$scrollConfig, this.$channel, interfaceC5189);
        transformableKt$detectNonTouchGestures$2.L$0 = obj;
        return transformableKt$detectNonTouchGestures$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((TransformableKt$detectNonTouchGestures$2) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x018f, code lost:
    
        if (r5 == r0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0199, code lost:
    
        if (androidx.compose.foundation.gestures.AbstractC1362.m1858(r11) != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x019c, code lost:
    
        r4 = 4;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083 A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #0 {all -> 0x0023, blocks: (B:9:0x001a, B:86:0x0192, B:27:0x005d, B:30:0x0069, B:36:0x0083, B:37:0x008a, B:39:0x00af, B:41:0x00bd, B:42:0x00c5, B:46:0x00d2, B:49:0x00e4, B:51:0x00ef, B:45:0x00ce, B:55:0x00fb, B:56:0x0100, B:58:0x0110, B:60:0x011c, B:61:0x0124, B:65:0x012e, B:68:0x0140, B:64:0x012a, B:73:0x014d, B:90:0x01a6, B:91:0x01ad, B:74:0x0152, B:76:0x0162, B:78:0x016e, B:79:0x0176, B:83:0x0180, B:82:0x017c, B:16:0x0031, B:19:0x003d, B:22:0x0048), top: B:96:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:9:0x001a, B:86:0x0192, B:27:0x005d, B:30:0x0069, B:36:0x0083, B:37:0x008a, B:39:0x00af, B:41:0x00bd, B:42:0x00c5, B:46:0x00d2, B:49:0x00e4, B:51:0x00ef, B:45:0x00ce, B:55:0x00fb, B:56:0x0100, B:58:0x0110, B:60:0x011c, B:61:0x0124, B:65:0x012e, B:68:0x0140, B:64:0x012a, B:73:0x014d, B:90:0x01a6, B:91:0x01ad, B:74:0x0152, B:76:0x0162, B:78:0x016e, B:79:0x0176, B:83:0x0180, B:82:0x017c, B:16:0x0031, B:19:0x003d, B:22:0x0048), top: B:96:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:9:0x001a, B:86:0x0192, B:27:0x005d, B:30:0x0069, B:36:0x0083, B:37:0x008a, B:39:0x00af, B:41:0x00bd, B:42:0x00c5, B:46:0x00d2, B:49:0x00e4, B:51:0x00ef, B:45:0x00ce, B:55:0x00fb, B:56:0x0100, B:58:0x0110, B:60:0x011c, B:61:0x0124, B:65:0x012e, B:68:0x0140, B:64:0x012a, B:73:0x014d, B:90:0x01a6, B:91:0x01ad, B:74:0x0152, B:76:0x0162, B:78:0x016e, B:79:0x0176, B:83:0x0180, B:82:0x017c, B:16:0x0031, B:19:0x003d, B:22:0x0048), top: B:96:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:9:0x001a, B:86:0x0192, B:27:0x005d, B:30:0x0069, B:36:0x0083, B:37:0x008a, B:39:0x00af, B:41:0x00bd, B:42:0x00c5, B:46:0x00d2, B:49:0x00e4, B:51:0x00ef, B:45:0x00ce, B:55:0x00fb, B:56:0x0100, B:58:0x0110, B:60:0x011c, B:61:0x0124, B:65:0x012e, B:68:0x0140, B:64:0x012a, B:73:0x014d, B:90:0x01a6, B:91:0x01ad, B:74:0x0152, B:76:0x0162, B:78:0x016e, B:79:0x0176, B:83:0x0180, B:82:0x017c, B:16:0x0031, B:19:0x003d, B:22:0x0048), top: B:96:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0110 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:9:0x001a, B:86:0x0192, B:27:0x005d, B:30:0x0069, B:36:0x0083, B:37:0x008a, B:39:0x00af, B:41:0x00bd, B:42:0x00c5, B:46:0x00d2, B:49:0x00e4, B:51:0x00ef, B:45:0x00ce, B:55:0x00fb, B:56:0x0100, B:58:0x0110, B:60:0x011c, B:61:0x0124, B:65:0x012e, B:68:0x0140, B:64:0x012a, B:73:0x014d, B:90:0x01a6, B:91:0x01ad, B:74:0x0152, B:76:0x0162, B:78:0x016e, B:79:0x0176, B:83:0x0180, B:82:0x017c, B:16:0x0031, B:19:0x003d, B:22:0x0048), top: B:96:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012a A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:9:0x001a, B:86:0x0192, B:27:0x005d, B:30:0x0069, B:36:0x0083, B:37:0x008a, B:39:0x00af, B:41:0x00bd, B:42:0x00c5, B:46:0x00d2, B:49:0x00e4, B:51:0x00ef, B:45:0x00ce, B:55:0x00fb, B:56:0x0100, B:58:0x0110, B:60:0x011c, B:61:0x0124, B:65:0x012e, B:68:0x0140, B:64:0x012a, B:73:0x014d, B:90:0x01a6, B:91:0x01ad, B:74:0x0152, B:76:0x0162, B:78:0x016e, B:79:0x0176, B:83:0x0180, B:82:0x017c, B:16:0x0031, B:19:0x003d, B:22:0x0048), top: B:96:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x007d -> B:27:0x005d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00ef -> B:37:0x008a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0149 -> B:56:0x0100). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x018f -> B:86:0x0192). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2468 interfaceC2468;
        C2487 c2487;
        char c;
        char c2;
        Object objM3559;
        int size;
        int i;
        int i2;
        Object objM35592;
        C8158 c8158M1860;
        Object objM35593;
        C8158 c8158M18602;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        C1333 c1333 = C1333.f1817;
        int i4 = 1;
        try {
            if (i3 == 0) {
                AbstractC6017.m10769(obj);
                interfaceC2468 = (InterfaceC2468) this.L$0;
                if (!AbstractC6231.m11053(this.$currentContext)) {
                }
                this.L$0 = interfaceC2468;
                this.label = i4;
                objM35593 = ((C2456) interfaceC2468).m3559(PointerEventPass.Main, this);
                if (objM35593 == coroutineSingletons) {
                }
                c2487 = (C2487) objM35593;
                c8158M18602 = AbstractC1362.m1860(interfaceC2468, c2487, this.$scrollConfig);
                C8158 c8158M1859 = AbstractC1362.m1859(c2487);
                Float fM1858 = AbstractC1362.m1858(c2487);
                if (c8158M18602 == null) {
                }
                C1329 c1329 = C1329.f1813;
                if (c8158M18602 != null) {
                }
            } else if (i3 == 1) {
                interfaceC2468 = (InterfaceC2468) this.L$0;
                AbstractC6017.m10769(obj);
                objM35593 = obj;
                c2487 = (C2487) objM35593;
                c8158M18602 = AbstractC1362.m1860(interfaceC2468, c2487, this.$scrollConfig);
                C8158 c8158M18592 = AbstractC1362.m1859(c2487);
                Float fM18582 = AbstractC1362.m1858(c2487);
                if (c8158M18602 == null) {
                }
                C1329 c13292 = C1329.f1813;
                if (c8158M18602 != null) {
                }
            } else if (i3 == 2) {
                interfaceC2468 = (InterfaceC2468) this.L$0;
                AbstractC6017.m10769(obj);
                objM35592 = obj;
                c2487 = (C2487) objM35592;
                c8158M1860 = AbstractC1362.m1860(interfaceC2468, c2487, this.$scrollConfig);
                if (c8158M1860 != null) {
                }
            } else if (i3 == 3) {
                interfaceC2468 = (InterfaceC2468) this.L$0;
                AbstractC6017.m10769(obj);
                Object objM35594 = obj;
                c = 3;
                c2487 = (C2487) objM35594;
                if (AbstractC1362.m1859(c2487) != null) {
                    InterfaceC6039 interfaceC6039 = this.$channel;
                    List list = c2487.f5197;
                    size = list.size();
                    i2 = 0;
                    long jM13084 = 0;
                    for (i = 0; i < size; i++) {
                        C2478 c2478 = (C2478) list.get(i);
                        if (invokeSuspend$lambda$1(c2478)) {
                            jM13084 = C8158.m13084(jM13084, c2478.f5152);
                            i2++;
                        }
                    }
                    if (i2 == 0) {
                        C8158.m13088(i2, jM13084);
                    }
                    interfaceC6039.mo8995(new C1330());
                    this.L$0 = interfaceC2468;
                    c = 3;
                    this.label = 3;
                    objM35594 = ((C2456) interfaceC2468).m3559(PointerEventPass.Main, this);
                    if (objM35594 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c2487 = (C2487) objM35594;
                    if (AbstractC1362.m1859(c2487) != null) {
                    }
                }
                c2 = 4;
                this.$channel.mo8995(c1333);
                i4 = 1;
                if (!AbstractC6231.m11053(this.$currentContext)) {
                    return C6008.f15084;
                }
                this.L$0 = interfaceC2468;
                this.label = i4;
                objM35593 = ((C2456) interfaceC2468).m3559(PointerEventPass.Main, this);
                if (objM35593 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                c2487 = (C2487) objM35593;
                c8158M18602 = AbstractC1362.m1860(interfaceC2468, c2487, this.$scrollConfig);
                C8158 c8158M185922 = AbstractC1362.m1859(c2487);
                Float fM185822 = AbstractC1362.m1858(c2487);
                if (c8158M18602 == null || c8158M185922 != null || fM185822 != null) {
                    C1329 c132922 = C1329.f1813;
                    if (c8158M18602 != null) {
                        long j = c8158M18602.f19886;
                        this.$channel.mo8995(c132922);
                        Math.pow(2.0d, Float.intBitsToFloat((int) (j & 4294967295L)) / 545.0f);
                        InterfaceC6039 interfaceC60392 = this.$channel;
                        List list2 = c2487.f5197;
                        int size2 = list2.size();
                        int i5 = 0;
                        long jM130842 = 0;
                        for (int i6 = 0; i6 < size2; i6++) {
                            C2478 c24782 = (C2478) list2.get(i6);
                            if (invokeSuspend$lambda$0(c24782)) {
                                jM130842 = C8158.m13084(jM130842, c24782.f5152);
                                i5++;
                            }
                        }
                        if (i5 == 0) {
                            C8158.m13088(i5, jM130842);
                        }
                        interfaceC60392.mo8995(new C1330());
                        this.L$0 = interfaceC2468;
                        this.label = 2;
                        objM35592 = ((C2456) interfaceC2468).m3559(PointerEventPass.Main, this);
                        if (objM35592 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        c2487 = (C2487) objM35592;
                        c8158M1860 = AbstractC1362.m1860(interfaceC2468, c2487, this.$scrollConfig);
                        if (c8158M1860 != null) {
                            j = c8158M1860.f19886;
                            Math.pow(2.0d, Float.intBitsToFloat((int) (j & 4294967295L)) / 545.0f);
                            InterfaceC6039 interfaceC603922 = this.$channel;
                            List list22 = c2487.f5197;
                            int size22 = list22.size();
                            int i52 = 0;
                            long jM1308422 = 0;
                            while (i6 < size22) {
                            }
                            if (i52 == 0) {
                            }
                            interfaceC603922.mo8995(new C1330());
                            this.L$0 = interfaceC2468;
                            this.label = 2;
                            objM35592 = ((C2456) interfaceC2468).m3559(PointerEventPass.Main, this);
                            if (objM35592 == coroutineSingletons) {
                            }
                            c2487 = (C2487) objM35592;
                            c8158M1860 = AbstractC1362.m1860(interfaceC2468, c2487, this.$scrollConfig);
                            if (c8158M1860 != null) {
                                c = 3;
                                c2 = 4;
                                this.$channel.mo8995(c1333);
                                i4 = 1;
                                if (!AbstractC6231.m11053(this.$currentContext)) {
                                }
                            }
                        }
                    } else if (c8158M185922 != null) {
                        this.$channel.mo8995(c132922);
                        InterfaceC6039 interfaceC60393 = this.$channel;
                        List list3 = c2487.f5197;
                        size = list3.size();
                        i2 = 0;
                        long jM130843 = 0;
                        while (i < size) {
                        }
                        if (i2 == 0) {
                        }
                        interfaceC60393.mo8995(new C1330());
                        this.L$0 = interfaceC2468;
                        c = 3;
                        this.label = 3;
                        objM35594 = ((C2456) interfaceC2468).m3559(PointerEventPass.Main, this);
                        if (objM35594 == coroutineSingletons) {
                        }
                        c2487 = (C2487) objM35594;
                        if (AbstractC1362.m1859(c2487) != null) {
                        }
                        c2 = 4;
                        this.$channel.mo8995(c1333);
                        i4 = 1;
                        if (!AbstractC6231.m11053(this.$currentContext)) {
                        }
                    } else {
                        c = 3;
                        if (fM185822 == null) {
                            throw new IllegalStateException("One of zoomOffset, panOffset and scaleDelta must be non-null");
                        }
                        this.$channel.mo8995(c132922);
                        InterfaceC6039 interfaceC60394 = this.$channel;
                        List list4 = c2487.f5197;
                        int size3 = list4.size();
                        int i7 = 0;
                        long jM130844 = 0;
                        for (int i8 = 0; i8 < size3; i8++) {
                            C2478 c24783 = (C2478) list4.get(i8);
                            if (invokeSuspend$lambda$3(c24783)) {
                                jM130844 = C8158.m13084(jM130844, c24783.f5152);
                                i7++;
                            }
                        }
                        if (i7 != 0) {
                            C8158.m13088(i7, jM130844);
                        }
                        interfaceC60394.mo8995(new C1330());
                        this.L$0 = interfaceC2468;
                        c2 = 4;
                        this.label = 4;
                        objM3559 = ((C2456) interfaceC2468).m3559(PointerEventPass.Main, this);
                    }
                }
                this.L$0 = interfaceC2468;
                this.label = i4;
                objM35593 = ((C2456) interfaceC2468).m3559(PointerEventPass.Main, this);
                if (objM35593 == coroutineSingletons) {
                }
                c2487 = (C2487) objM35593;
                c8158M18602 = AbstractC1362.m1860(interfaceC2468, c2487, this.$scrollConfig);
                C8158 c8158M1859222 = AbstractC1362.m1859(c2487);
                Float fM1858222 = AbstractC1362.m1858(c2487);
                if (c8158M18602 == null) {
                }
                C1329 c1329222 = C1329.f1813;
                if (c8158M18602 != null) {
                }
            } else {
                if (i3 != 4) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC2468 = (InterfaceC2468) this.L$0;
                AbstractC6017.m10769(obj);
                objM3559 = obj;
                c2 = 4;
                c = 3;
                c2487 = (C2487) objM3559;
            }
        } catch (Throwable th) {
            this.$channel.mo8995(c1333);
            throw th;
        }
    }
}
