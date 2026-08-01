package androidx.compose.p001ui.platform;

import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.InterfaceC2636;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2169;
import androidx.compose.runtime.internal.C2088;
import io.ktor.util.C5043;
import kotlin.AbstractC6017;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2688 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2169 f5707 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$LocalChainedPlatformTextInputInterceptor$1
        @Override // p068.InterfaceC7372
        public final C2758 invoke() {
            return null;
        }
    });

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        if (((androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719) r6).m4091(r8, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r7.m4194(r6, r8, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CoroutineSingletons m4041(InterfaceC2636 interfaceC2636, C2758 c2758, InterfaceC7383 interfaceC7383, ContinuationImpl continuationImpl) {
        PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 platformTextInputModifierNodeKt$interceptedTextInputSession$1;
        if (continuationImpl instanceof PlatformTextInputModifierNodeKt$interceptedTextInputSession$1) {
            platformTextInputModifierNodeKt$interceptedTextInputSession$1 = (PlatformTextInputModifierNodeKt$interceptedTextInputSession$1) continuationImpl;
            int i = platformTextInputModifierNodeKt$interceptedTextInputSession$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                platformTextInputModifierNodeKt$interceptedTextInputSession$1.label = i - Integer.MIN_VALUE;
            } else {
                platformTextInputModifierNodeKt$interceptedTextInputSession$1 = new PlatformTextInputModifierNodeKt$interceptedTextInputSession$1(continuationImpl);
            }
        }
        Object obj = platformTextInputModifierNodeKt$interceptedTextInputSession$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = platformTextInputModifierNodeKt$interceptedTextInputSession$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            if (c2758 == null) {
                platformTextInputModifierNodeKt$interceptedTextInputSession$1.label = 1;
            } else {
                platformTextInputModifierNodeKt$interceptedTextInputSession$1.label = 2;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            AbstractC6017.m10769(obj);
            C5043.m9161();
            return null;
        }
        if (i2 != 2) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        C5043.m9161();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CoroutineSingletons m4042(InterfaceC2692 interfaceC2692, InterfaceC7383 interfaceC7383, ContinuationImpl continuationImpl) {
        PlatformTextInputModifierNodeKt$establishTextInputSession$1 platformTextInputModifierNodeKt$establishTextInputSession$1;
        if (continuationImpl instanceof PlatformTextInputModifierNodeKt$establishTextInputSession$1) {
            platformTextInputModifierNodeKt$establishTextInputSession$1 = (PlatformTextInputModifierNodeKt$establishTextInputSession$1) continuationImpl;
            int i = platformTextInputModifierNodeKt$establishTextInputSession$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                platformTextInputModifierNodeKt$establishTextInputSession$1.label = i - Integer.MIN_VALUE;
            } else {
                platformTextInputModifierNodeKt$establishTextInputSession$1 = new PlatformTextInputModifierNodeKt$establishTextInputSession$1(continuationImpl);
            }
        }
        Object obj = platformTextInputModifierNodeKt$establishTextInputSession$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = platformTextInputModifierNodeKt$establishTextInputSession$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            if (!((AbstractC2961) interfaceC2692).f6637.f6624) {
                C6755.m11869("establishTextInputSession called from an unattached node");
                return null;
            }
            InterfaceC2636 interfaceC2636M3907 = AbstractC2620.m3907(interfaceC2692);
            C2088 c2088 = (C2088) AbstractC2620.m3906(interfaceC2692).f5440;
            c2088.getClass();
            C2758 c2758 = (C2758) AbstractC2202.m3042(c2088, f5707);
            platformTextInputModifierNodeKt$establishTextInputSession$1.label = 1;
            if (m4041(interfaceC2636M3907, c2758, interfaceC7383, platformTextInputModifierNodeKt$establishTextInputSession$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        C5043.m9161();
        return null;
    }
}
