package androidx.compose.foundation.gestures;

import androidx.compose.p001ui.input.pointer.C2462;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC6231;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.ForEachGestureKt", m556f = "ForEachGesture.kt", m557l = {48, 51, 56}, m558m = "forEachGesture", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class ForEachGestureKt$forEachGesture$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    public ForEachGestureKt$forEachGesture$1(InterfaceC5189<? super ForEachGestureKt$forEachGesture$1> interfaceC5189) {
        super(interfaceC5189);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x003f, code lost:
    
        if (r12 != r1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x003f, code lost:
    
        if (r12 != r1) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v15, types: [kotlin.coroutines.飘花落叶言子楪苏世兰哲] */
    /* JADX WARN: Type inference failed for: r0v17, types: [kotlin.coroutines.飘花落叶言子楪苏世兰哲] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.coroutines.飘花落叶言子楪苏世兰哲] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, kotlin.coroutines.飘花落叶言子楪苏世兰哲] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2470 interfaceC2470;
        InterfaceC7383 interfaceC7383;
        Object objM3565;
        ?? context;
        InterfaceC2470 interfaceC24702;
        InterfaceC7383 interfaceC73832;
        this.result = obj;
        ?? r0 = (this.label | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.label = r0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C6008 c6008 = C6008.f15084;
        try {
        } catch (CancellationException e) {
            e = e;
            if (AbstractC6231.m11053(r0)) {
                throw e;
            }
            this.L$0 = interfaceC2470;
            this.L$1 = interfaceC7383;
            this.L$2 = r0;
            this.label = 3;
            Object objM35652 = ((C2462) interfaceC2470).m3565(new ForEachGestureKt$awaitAllPointersUp$2(null), this);
            if (objM35652 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                if (c6008 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (c6008 == coroutineSingletons) {
            }
        }
        if (r0 == 0) {
            AbstractC6017.m10769(obj);
            interfaceC73832 = null;
            interfaceC24702 = null;
            context = getContext();
            if (!AbstractC6231.m11053(context)) {
            }
        } else if (r0 != 1) {
            if (r0 == 2) {
                r0 = (InterfaceC5192) this.L$2;
                interfaceC7383 = (InterfaceC7383) this.L$1;
                interfaceC2470 = (InterfaceC2470) this.L$0;
                AbstractC6017.m10769(obj);
            } else {
                if (r0 != 3) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r0 = (InterfaceC5192) this.L$2;
                interfaceC7383 = (InterfaceC7383) this.L$1;
                interfaceC2470 = (InterfaceC2470) this.L$0;
                AbstractC6017.m10769(obj);
            }
            context = r0;
            interfaceC73832 = interfaceC7383;
            interfaceC24702 = interfaceC2470;
            if (!AbstractC6231.m11053(context)) {
                try {
                } catch (CancellationException e2) {
                    InterfaceC7383 interfaceC73833 = interfaceC73832;
                    r0 = context;
                    e = e2;
                    interfaceC2470 = interfaceC24702;
                    interfaceC7383 = interfaceC73833;
                    if (AbstractC6231.m11053(r0)) {
                    }
                }
                this.L$0 = interfaceC24702;
                this.L$1 = interfaceC73832;
                this.L$2 = context;
                this.label = 1;
                if (interfaceC73832.invoke(interfaceC24702, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2470 = interfaceC24702;
                interfaceC7383 = interfaceC73832;
                r0 = context;
                this.L$0 = interfaceC2470;
                this.L$1 = interfaceC7383;
                this.L$2 = r0;
                this.label = 2;
                objM3565 = ((C2462) interfaceC2470).m3565(new ForEachGestureKt$awaitAllPointersUp$2(null), this);
                if (objM3565 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    if (c6008 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (c6008 == coroutineSingletons) {
                }
                context = r0;
                interfaceC73832 = interfaceC7383;
                interfaceC24702 = interfaceC2470;
                if (!AbstractC6231.m11053(context)) {
                    return c6008;
                }
            }
        } else {
            InterfaceC5192 interfaceC5192 = (InterfaceC5192) this.L$2;
            interfaceC7383 = (InterfaceC7383) this.L$1;
            interfaceC2470 = (InterfaceC2470) this.L$0;
            AbstractC6017.m10769(obj);
            r0 = interfaceC5192;
            this.L$0 = interfaceC2470;
            this.L$1 = interfaceC7383;
            this.L$2 = r0;
            this.label = 2;
            objM3565 = ((C2462) interfaceC2470).m3565(new ForEachGestureKt$awaitAllPointersUp$2(null), this);
            if (objM3565 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            }
            context = r0;
            interfaceC73832 = interfaceC7383;
            interfaceC24702 = interfaceC2470;
            if (!AbstractC6231.m11053(context)) {
            }
        }
    }
}
