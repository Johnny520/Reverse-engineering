package androidx.compose.p001ui.platform;

import android.view.View;
import androidx.compose.p001ui.AbstractC2953;
import io.ktor.util.C5043;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7387;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2754 implements InterfaceC2710 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C2758 f6010;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2710 f6011;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ AtomicReference f6012;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2710 f6013;

    public C2754(InterfaceC2710 interfaceC2710, AtomicReference atomicReference, C2758 c2758) {
        this.f6011 = interfaceC2710;
        this.f6012 = atomicReference;
        this.f6010 = c2758;
        this.f6013 = interfaceC2710;
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        return this.f6013.mo2990();
    }

    @Override // androidx.compose.p001ui.platform.InterfaceC2689
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final View mo4026() {
        return this.f6013.mo4026();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p001ui.platform.InterfaceC2689
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CoroutineSingletons mo4027(InterfaceC2693 interfaceC2693, ContinuationImpl continuationImpl) {
        C0204x61f42b4d c0204x61f42b4d;
        if (continuationImpl instanceof C0204x61f42b4d) {
            c0204x61f42b4d = (C0204x61f42b4d) continuationImpl;
            int i = c0204x61f42b4d.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0204x61f42b4d.label = i - Integer.MIN_VALUE;
            } else {
                c0204x61f42b4d = new C0204x61f42b4d(this, continuationImpl);
            }
        }
        Object obj = c0204x61f42b4d.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c0204x61f42b4d.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            C0205x61f42b4e c0205x61f42b4e = new InterfaceC7387() { // from class: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$2
                @Override // p068.InterfaceC7387
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((InterfaceC6233) obj2);
                    return C6008.f15084;
                }

                public final void invoke(InterfaceC6233 interfaceC6233) {
                }
            };
            C0206x61f42b4f c0206x61f42b4f = new C0206x61f42b4f(this.f6010, interfaceC2693, this.f6011, null);
            c0204x61f42b4d.label = 1;
            if (AbstractC2953.m4420(this.f6012, c0205x61f42b4e, c0206x61f42b4f, c0204x61f42b4d) == coroutineSingletons) {
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
