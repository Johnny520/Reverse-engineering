package androidx.compose.p001ui.scrollcapture;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.compose.foundation.text.selection.AbstractC1759;
import androidx.compose.p001ui.graphics.AbstractC2416;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.p001ui.semantics.C2788;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.window.area.AbstractC3400;
import java.util.function.Consumer;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.C6291;
import kotlinx.coroutines.internal.C6183;
import p025.AbstractC7012;
import p068.InterfaceC7387;
import p069.AbstractC7390;
import p221.C8734;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.scrollcapture.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ScrollCaptureCallbackC2767 implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C2764 f6029;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C6183 f6030;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC2719 f6031;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2763 f6032;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8734 f6033;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2788 f6034;

    public ScrollCaptureCallbackC2767(C2788 c2788, C8734 c8734, C6183 c6183, C2763 c2763, ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719) {
        this.f6034 = c2788;
        this.f6033 = c8734;
        this.f6032 = c2763;
        this.f6031 = viewTreeObserverOnGlobalLayoutListenerC2719;
        this.f6030 = new C6183(c6183.f15266.plus(C2765.f6027));
        this.f6029 = new C2764(c8734.f22220 - c8734.f22222, new ComposeScrollCaptureCallback$scrollTracker$1(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m4198(ScrollCaptureCallbackC2767 scrollCaptureCallbackC2767, ScrollCaptureSession scrollCaptureSession, C8734 c8734, ContinuationImpl continuationImpl) {
        ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2 composeScrollCaptureCallback$onScrollCaptureImageRequest$2;
        int i;
        int i2;
        ScrollCaptureSession scrollCaptureSessionM2413;
        C8734 c87342;
        int i3;
        int i4;
        int iM5650;
        int iM56502;
        scrollCaptureCallbackC2767.getClass();
        if (continuationImpl instanceof ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2) {
            composeScrollCaptureCallback$onScrollCaptureImageRequest$2 = (ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2) continuationImpl;
            int i5 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label = i5 - Integer.MIN_VALUE;
            } else {
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2 = new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2(scrollCaptureCallbackC2767, continuationImpl);
            }
        }
        Object obj = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label;
        if (i6 == 0) {
            AbstractC6017.m10769(obj);
            i = c8734.f22222;
            i2 = c8734.f22220;
            C2764 c2764 = scrollCaptureCallbackC2767.f6029;
            composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$0 = scrollCaptureSession;
            composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$1 = c8734;
            composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$0 = i;
            composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$1 = i2;
            composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label = 1;
            int i7 = c2764.f6026;
            if (i > i2) {
                C6755.m11873(AbstractC7012.m12150(i, i2, "Expected min=", " ≤ max="));
                return null;
            }
            int i8 = i2 - i;
            if (i8 > i7) {
                C6755.m11873(AbstractC7012.m12150(i8, i7, "Expected range (", ") to be ≤ viewportSize="));
                return null;
            }
            float f = i;
            float f2 = c2764.f6024;
            Object obj2 = C6008.f15084;
            if (f < f2 || i2 > i7 + f2) {
                Object objM4197 = c2764.m4197((((i8 / 2) + i) - (i7 / 2)) - f2, composeScrollCaptureCallback$onScrollCaptureImageRequest$2);
                if (objM4197 != coroutineSingletons) {
                    objM4197 = obj2;
                }
                if (objM4197 == coroutineSingletons) {
                    obj2 = objM4197;
                }
            }
            if (obj2 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i4 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$1;
            i3 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$0;
            c87342 = (C8734) composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$1;
            scrollCaptureSessionM2413 = AbstractC1759.m2413(composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$0);
            AbstractC6017.m10769(obj);
            C2764 c27642 = scrollCaptureCallbackC2767.f6029;
            iM5650 = AbstractC3400.m5650(i3 - AbstractC7390.m12617(c27642.f6024), 0, c27642.f6026);
            C2764 c27643 = scrollCaptureCallbackC2767.f6029;
            iM56502 = AbstractC3400.m5650(i4 - AbstractC7390.m12617(c27643.f6024), 0, c27643.f6026);
            int i9 = c87342.f22223;
            int i10 = c87342.f22221;
            if (iM5650 != iM56502) {
                return C8734.f22219;
            }
            Canvas canvasLockHardwareCanvas = scrollCaptureSessionM2413.getSurface().lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.save();
                canvasLockHardwareCanvas.translate(-i9, -iM5650);
                C8734 c87343 = scrollCaptureCallbackC2767.f6033;
                canvasLockHardwareCanvas.translate(-c87343.f22223, -c87343.f22222);
                scrollCaptureCallbackC2767.f6031.getRootView().draw(canvasLockHardwareCanvas);
                scrollCaptureSessionM2413.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
                int iM12617 = AbstractC7390.m12617(scrollCaptureCallbackC2767.f6029.f6024);
                return new C8734(i9, iM5650 + iM12617, i10, iM56502 + iM12617);
            } catch (Throwable th) {
                scrollCaptureSessionM2413.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
                throw th;
            }
        }
        int i11 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$1;
        int i12 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$0;
        C8734 c87344 = (C8734) composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$1;
        ScrollCaptureSession scrollCaptureSessionM24132 = AbstractC1759.m2413(composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$0);
        AbstractC6017.m10769(obj);
        i = i12;
        c8734 = c87344;
        i2 = i11;
        scrollCaptureSession = scrollCaptureSessionM24132;
        ComposeScrollCaptureCallback$onScrollCaptureImageRequest$3 composeScrollCaptureCallback$onScrollCaptureImageRequest$3 = new InterfaceC7387() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$3
            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                invoke(((Number) obj3).longValue());
                return C6008.f15084;
            }

            public final void invoke(long j) {
            }
        };
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$0 = scrollCaptureSession;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$1 = c8734;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$0 = i;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$1 = i2;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label = 2;
        if (AbstractC2202.m3052(composeScrollCaptureCallback$onScrollCaptureImageRequest$2.getContext()).mo2865(composeScrollCaptureCallback$onScrollCaptureImageRequest$3, composeScrollCaptureCallback$onScrollCaptureImageRequest$2) != coroutineSingletons) {
            scrollCaptureSessionM2413 = scrollCaptureSession;
            c87342 = c8734;
            i3 = i;
            i4 = i2;
            C2764 c276422 = scrollCaptureCallbackC2767.f6029;
            iM5650 = AbstractC3400.m5650(i3 - AbstractC7390.m12617(c276422.f6024), 0, c276422.f6026);
            C2764 c276432 = scrollCaptureCallbackC2767.f6029;
            iM56502 = AbstractC3400.m5650(i4 - AbstractC7390.m12617(c276432.f6024), 0, c276432.f6026);
            int i92 = c87342.f22223;
            int i102 = c87342.f22221;
            if (iM5650 != iM56502) {
            }
        }
        return coroutineSingletons;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        AbstractC6231.m11036(this.f6030, C6291.f15453, null, new ComposeScrollCaptureCallback$onScrollCaptureEnd$1(this, runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, final CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        final C6249 c6249M11036 = AbstractC6231.m11036(this.f6030, null, null, new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(this, scrollCaptureSession, rect, consumer, null), 3);
        c6249M11036.mo11118(new InterfaceC7387() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C6008.f15084;
            }

            public final void invoke(Throwable th) {
                if (th != null) {
                    cancellationSignal.cancel();
                }
            }
        });
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.ui.scrollcapture.飘花落叶言子楪世苏兰哲
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                c6249M11036.mo10815(null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(AbstractC2416.m3448(this.f6033));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f6029.f6024 = 0.0f;
        ((AbstractC2182) this.f6032.f6023).setValue(Boolean.TRUE);
        runnable.run();
    }
}
