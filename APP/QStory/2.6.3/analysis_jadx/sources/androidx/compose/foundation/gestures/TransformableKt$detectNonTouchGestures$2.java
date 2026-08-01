package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.input.pointer.InterfaceC1633;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlinx.coroutines.channels.InterfaceC5207;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.TransformableKt$detectNonTouchGestures$2", f = "Transformable.kt", l = {288, 315, 331, 349}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
final class TransformableKt$detectNonTouchGestures$2 extends RestrictedSuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5207 $channel;
    final /* synthetic */ InterfaceC4360 $currentContext;
    final /* synthetic */ InterfaceC0548 $scrollConfig;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableKt$detectNonTouchGestures$2(InterfaceC4360 interfaceC4360, InterfaceC0548 interfaceC0548, InterfaceC5207 interfaceC5207, InterfaceC4357<? super TransformableKt$detectNonTouchGestures$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$currentContext = interfaceC4360;
        this.$scrollConfig = interfaceC0548;
        this.$channel = interfaceC5207;
    }

    private static final boolean invokeSuspend$lambda$0(C1643 c1643) {
        return true;
    }

    private static final boolean invokeSuspend$lambda$1(C1643 c1643) {
        return true;
    }

    private static final boolean invokeSuspend$lambda$3(C1643 c1643) {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        TransformableKt$detectNonTouchGestures$2 transformableKt$detectNonTouchGestures$2 = new TransformableKt$detectNonTouchGestures$2(this.$currentContext, this.$scrollConfig, this.$channel, interfaceC4357);
        transformableKt$detectNonTouchGestures$2.L$0 = obj;
        return transformableKt$detectNonTouchGestures$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TransformableKt$detectNonTouchGestures$2) create(interfaceC1633, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x018f, code lost:
    
        if (r5 == r0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0199, code lost:
    
        if (androidx.compose.foundation.gestures.AbstractC0521.m1298(r11) != null) goto L74;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt$detectNonTouchGestures$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
