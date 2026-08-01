package androidx.compose.p001ui.platform;

import android.view.View;
import androidx.compose.p001ui.AbstractC2953;
import androidx.compose.p001ui.text.input.C2848;
import io.ktor.util.C5043;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2669 implements InterfaceC2710, InterfaceC6233 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AtomicReference f5673 = new AtomicReference(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2848 f5674;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC6233 f5675;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final View f5676;

    public C2669(View view, C2848 c2848, InterfaceC6233 interfaceC6233) {
        this.f5676 = view;
        this.f5674 = c2848;
        this.f5675 = interfaceC6233;
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        return this.f5675.mo2990();
    }

    @Override // androidx.compose.p001ui.platform.InterfaceC2689
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final View mo4026() {
        return this.f5676;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p001ui.platform.InterfaceC2689
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CoroutineSingletons mo4027(final InterfaceC2693 interfaceC2693, ContinuationImpl continuationImpl) {
        AndroidPlatformTextInputSession$startInputMethod$1 androidPlatformTextInputSession$startInputMethod$1;
        if (continuationImpl instanceof AndroidPlatformTextInputSession$startInputMethod$1) {
            androidPlatformTextInputSession$startInputMethod$1 = (AndroidPlatformTextInputSession$startInputMethod$1) continuationImpl;
            int i = androidPlatformTextInputSession$startInputMethod$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidPlatformTextInputSession$startInputMethod$1.label = i - Integer.MIN_VALUE;
            } else {
                androidPlatformTextInputSession$startInputMethod$1 = new AndroidPlatformTextInputSession$startInputMethod$1(this, continuationImpl);
            }
        }
        Object obj = androidPlatformTextInputSession$startInputMethod$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = androidPlatformTextInputSession$startInputMethod$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC7387 interfaceC7387 = new InterfaceC7387() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p068.InterfaceC7387
                public final C2745 invoke(InterfaceC6233 interfaceC6233) {
                    InterfaceC2693 interfaceC26932 = interfaceC2693;
                    final C2669 c2669 = this;
                    return new C2745(interfaceC26932, new InterfaceC7372() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2.1
                        {
                            super(0);
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m3996invoke() {
                            AbstractC6231.m11068(c2669.f5675, null);
                        }

                        @Override // p068.InterfaceC7372
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m3996invoke();
                            return C6008.f15084;
                        }
                    });
                }
            };
            AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = new AndroidPlatformTextInputSession$startInputMethod$3(this, null);
            androidPlatformTextInputSession$startInputMethod$1.label = 1;
            if (AbstractC2953.m4420(this.f5673, interfaceC7387, androidPlatformTextInputSession$startInputMethod$3, androidPlatformTextInputSession$startInputMethod$1) == coroutineSingletons) {
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
