package androidx.compose.p001ui.contentcapture;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.activity.AbstractC0900;
import androidx.collection.AbstractC1116;
import androidx.collection.AbstractC1120;
import androidx.collection.C1083;
import androidx.collection.C1093;
import androidx.compose.p001ui.node.AbstractC2629;
import androidx.compose.p001ui.platform.AbstractC2751;
import androidx.compose.p001ui.platform.C2707;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.p001ui.semantics.AbstractC2778;
import androidx.compose.p001ui.semantics.AbstractC2792;
import androidx.compose.p001ui.semantics.AbstractC2794;
import androidx.compose.p001ui.semantics.C2776;
import androidx.compose.p001ui.semantics.C2782;
import androidx.compose.p001ui.semantics.C2785;
import androidx.compose.p001ui.semantics.C2788;
import androidx.compose.p001ui.semantics.C2789;
import androidx.compose.p001ui.semantics.C2791;
import androidx.compose.p001ui.text.C2865;
import androidx.compose.p001ui.text.C2867;
import androidx.compose.p001ui.text.C2868;
import androidx.compose.p001ui.text.C2902;
import androidx.core.os.AbstractC3008;
import androidx.lifecycle.InterfaceC3221;
import androidx.lifecycle.InterfaceC3242;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.C6022;
import kotlinx.coroutines.channels.C6023;
import kotlinx.coroutines.channels.InterfaceC6044;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p128.C8157;
import p180.AbstractC8495;
import p221.C8728;
import p221.InterfaceC8725;
import p223.AbstractC8743;
import p230.C8783;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: androidx.compose.ui.contentcapture.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC2256 implements InterfaceC3242, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final RunnableC2258 f4431;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f4432;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public C2707 f4433;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C1093 f4434;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public long f4435;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public C1093 f4439;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC7372 f4442;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public InterfaceC2254 f4443;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC2719 f4444;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ArrayList f4437 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final long f4436 = 100;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public AndroidContentCaptureManager$TranslateStatus f4440 = AndroidContentCaptureManager$TranslateStatus.SHOW_ORIGINAL;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f4441 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C6022 f4438 = AbstractC6037.m10841(1, 6, null);

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.contentcapture.飘花落叶言子楪世苏哲兰] */
    public ViewOnAttachStateChangeListenerC2256(ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719, InterfaceC7372 interfaceC7372) {
        this.f4444 = viewTreeObserverOnGlobalLayoutListenerC2719;
        this.f4442 = interfaceC7372;
        new Handler(Looper.getMainLooper());
        C1093 c1093 = AbstractC1120.f1323;
        c1093.getClass();
        this.f4439 = c1093;
        this.f4434 = new C1093();
        this.f4433 = new C2707(viewTreeObserverOnGlobalLayoutListenerC2719.getSemanticsOwner().m4211(), c1093);
        this.f4431 = new Runnable() { // from class: androidx.compose.ui.contentcapture.飘花落叶言子楪世苏哲兰
            /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                int i;
                int i2;
                ViewOnAttachStateChangeListenerC2256 viewOnAttachStateChangeListenerC2256 = this.f4446;
                boolean zM3106 = viewOnAttachStateChangeListenerC2256.m3106();
                ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC27192 = viewOnAttachStateChangeListenerC2256.f4444;
                if (zM3106) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        viewTreeObserverOnGlobalLayoutListenerC27192.m4102(true);
                        C1093 c10932 = viewOnAttachStateChangeListenerC2256.f4434;
                        int[] iArr = c10932.f1318;
                        long[] jArr = c10932.f1319;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j = jArr[i3];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                                    int i5 = 0;
                                    while (i5 < i4) {
                                        if ((255 & j) < 128) {
                                            int i6 = iArr[(i3 << 3) + i5];
                                            if (viewOnAttachStateChangeListenerC2256.m3107().m1394(i6)) {
                                                i2 = i3;
                                            } else {
                                                i2 = i3;
                                                viewOnAttachStateChangeListenerC2256.f4437.add(new C2255(i6, viewOnAttachStateChangeListenerC2256.f4435, ContentCaptureEventType.VIEW_DISAPPEAR, null));
                                                viewOnAttachStateChangeListenerC2256.f4438.mo8995(C6008.f15084);
                                            }
                                        }
                                        j >>= 8;
                                        i5++;
                                        i3 = i2;
                                    }
                                    int i7 = i3;
                                    if (i4 != 8) {
                                        break;
                                    } else {
                                        i = i7;
                                    }
                                } else {
                                    i = i3;
                                }
                                if (i == length) {
                                    break;
                                } else {
                                    i3 = i + 1;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        viewOnAttachStateChangeListenerC2256.m3117(viewTreeObserverOnGlobalLayoutListenerC27192.getSemanticsOwner().m4211(), viewOnAttachStateChangeListenerC2256.f4433);
                        Trace.endSection();
                        viewOnAttachStateChangeListenerC2256.m3109(viewOnAttachStateChangeListenerC2256.m3107());
                        viewOnAttachStateChangeListenerC2256.m3114();
                        viewOnAttachStateChangeListenerC2256.f4432 = false;
                    } catch (Throwable th) {
                        throw th;
                    } finally {
                        Trace.endSection();
                    }
                }
            }
        };
    }

    @Override // androidx.lifecycle.InterfaceC3242
    public final void onStart(InterfaceC3221 interfaceC3221) {
        this.f4443 = (InterfaceC2254) this.f4442.invoke();
        m3111(-1, this.f4444.getSemanticsOwner().m4211());
        m3115();
    }

    @Override // androidx.lifecycle.InterfaceC3242
    public final void onStop(InterfaceC3221 interfaceC3221) {
        m3113(this.f4444.getSemanticsOwner().m4211());
        m3115();
        this.f4443 = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.f4444.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.f4431);
        this.f4443 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m3106() {
        return this.f4443 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC1116 m3107() {
        if (this.f4441) {
            this.f4441 = false;
            this.f4439 = AbstractC2792.m4237(this.f4444.getSemanticsOwner(), new InterfaceC7387() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$currentSemanticsNodes$1
                @Override // p068.InterfaceC7387
                public final Boolean invoke(C2788 c2788) {
                    C2791 c2791M4227 = c2788.m4227();
                    return Boolean.valueOf(c2791M4227.f6124.m1312(AbstractC2778.f6064));
                }
            });
            this.f4435 = System.currentTimeMillis();
        }
        return this.f4439;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m3108(C2788 c2788, InterfaceC7383 interfaceC7383) {
        c2788.getClass();
        List listM4212 = C2788.m4212(4, c2788);
        int size = listM4212.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listM4212.get(i2);
            if (m3107().m1394(((C2788) obj).f6112)) {
                interfaceC7383.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3109(AbstractC1116 abstractC1116) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        AbstractC1116 abstractC11162 = abstractC1116;
        int[] iArr3 = abstractC11162.f1318;
        long[] jArr = abstractC11162.f1319;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c = c2;
                        C2707 c2707 = (C2707) this.f4434.m1393(i7);
                        C2785 c2785 = (C2785) abstractC11162.m1393(i7);
                        C2788 c2788 = c2785 != null ? c2785.f6106 : null;
                        if (c2788 == null) {
                            throw AbstractC0900.m699("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = c2788.f6112;
                        C2791 c2791 = c2788.f6114;
                        C1083 c1083 = c2791.f6124;
                        if (c2707 == null) {
                            Object[] objArr = c1083.f1225;
                            long[] jArr2 = c1083.f1226;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                C2782 c2782 = (C2782) objArr[(i10 << 3) + i12];
                                                C2782 c27822 = AbstractC2778.f6063;
                                                if (AbstractC5227.m9466(c2782, c27822)) {
                                                    List list = (List) AbstractC2792.m4233(c2791, c27822);
                                                    m3112(i8, String.valueOf(list != null ? (C2902) AbstractC5176.m9374(list) : null));
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    }
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = c1083.f1225;
                            long[] jArr3 = c1083.f1226;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                C2782 c27823 = (C2782) objArr2[(i13 << 3) + i15];
                                                C2782 c27824 = AbstractC2778.f6063;
                                                if (AbstractC5227.m9466(c27823, c27824)) {
                                                    List list2 = (List) AbstractC2792.m4233(c2707.f5724, c27824);
                                                    C2902 c2902 = list2 != null ? (C2902) AbstractC5176.m9374(list2) : null;
                                                    List list3 = (List) AbstractC2792.m4233(c2791, c27824);
                                                    C2902 c29022 = list3 != null ? (C2902) AbstractC5176.m9374(list3) : null;
                                                    if (!AbstractC5227.m9466(c2902, c29022)) {
                                                        m3112(i8, String.valueOf(c29022));
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                        if (i13 == length3) {
                                            break;
                                        }
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    }
                                }
                            }
                            i2 = 8;
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    abstractC11162 = abstractC1116;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            abstractC11162 = abstractC1116;
            iArr3 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008a -> B:17:0x004a). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3110(ContinuationImpl continuationImpl) {
        AndroidContentCaptureManager$boundsUpdatesEventLoop$1 androidContentCaptureManager$boundsUpdatesEventLoop$1;
        InterfaceC6044 interfaceC6044;
        InterfaceC6044 c6023;
        if (continuationImpl instanceof AndroidContentCaptureManager$boundsUpdatesEventLoop$1) {
            androidContentCaptureManager$boundsUpdatesEventLoop$1 = (AndroidContentCaptureManager$boundsUpdatesEventLoop$1) continuationImpl;
            int i = androidContentCaptureManager$boundsUpdatesEventLoop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidContentCaptureManager$boundsUpdatesEventLoop$1.label = i - Integer.MIN_VALUE;
            } else {
                androidContentCaptureManager$boundsUpdatesEventLoop$1 = new AndroidContentCaptureManager$boundsUpdatesEventLoop$1(this, continuationImpl);
            }
        }
        Object objM10823 = androidContentCaptureManager$boundsUpdatesEventLoop$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = androidContentCaptureManager$boundsUpdatesEventLoop$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objM10823);
            C6022 c6022 = this.f4438;
            c6022.getClass();
            c6023 = new C6023(c6022);
        } else {
            if (i2 == 1) {
                InterfaceC6044 interfaceC60442 = (InterfaceC6044) androidContentCaptureManager$boundsUpdatesEventLoop$1.L$0;
                AbstractC6017.m10769(objM10823);
                interfaceC6044 = interfaceC60442;
                if (((Boolean) objM10823).booleanValue()) {
                    return C6008.f15084;
                }
                C6023 c60232 = (C6023) interfaceC6044;
                c60232.m10821();
                if (m3106()) {
                    m3115();
                }
                Handler handler = this.f4444.getHandler();
                if (!this.f4432 && handler != null) {
                    this.f4432 = true;
                    handler.post(this.f4431);
                }
                androidContentCaptureManager$boundsUpdatesEventLoop$1.L$0 = c60232;
                androidContentCaptureManager$boundsUpdatesEventLoop$1.label = 2;
                c6023 = c60232;
                if (AbstractC6231.m11058(this.f4436, androidContentCaptureManager$boundsUpdatesEventLoop$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            InterfaceC6044 interfaceC60443 = (InterfaceC6044) androidContentCaptureManager$boundsUpdatesEventLoop$1.L$0;
            AbstractC6017.m10769(objM10823);
            c6023 = interfaceC60443;
        }
        androidContentCaptureManager$boundsUpdatesEventLoop$1.L$0 = c6023;
        androidContentCaptureManager$boundsUpdatesEventLoop$1.label = 1;
        C6023 c60233 = (C6023) c6023;
        objM10823 = c60233.m10823(androidContentCaptureManager$boundsUpdatesEventLoop$1);
        interfaceC6044 = c60233;
        if (objM10823 != coroutineSingletons) {
            if (((Boolean) objM10823).booleanValue()) {
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e A[PHI: r7
  0x008e: PHI (r7v2 android.view.autofill.AutofillId) = (r7v1 android.view.autofill.AutofillId), (r7v13 android.view.autofill.AutofillId) binds: [B:30:0x007f, B:32:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0175  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3111(int i, C2788 c2788) {
        C2776 c2776;
        InterfaceC7387 interfaceC7387;
        int i2;
        C8157 c8157M4218;
        C6686 c6686;
        String strM4180;
        InterfaceC7387 interfaceC73872;
        if (m3106()) {
            C2791 c2791 = c2788.f6114;
            Boolean bool = (Boolean) AbstractC2792.m4233(c2791, AbstractC2778.f6073);
            if (this.f4440 == AndroidContentCaptureManager$TranslateStatus.SHOW_ORIGINAL && AbstractC5227.m9466(bool, Boolean.TRUE)) {
                C2776 c27762 = (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6146);
                if (c27762 != null && (interfaceC73872 = (InterfaceC7387) c27762.f6051) != null) {
                }
            } else if (this.f4440 == AndroidContentCaptureManager$TranslateStatus.SHOW_TRANSLATED && AbstractC5227.m9466(bool, Boolean.FALSE) && (c2776 = (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6146)) != null && (interfaceC7387 = (InterfaceC7387) c2776.f6051) != null) {
            }
            int i3 = c2788.f6112;
            InterfaceC2254 interfaceC2254 = this.f4443;
            if (interfaceC2254 != null && (i2 = Build.VERSION.SDK_INT) >= 29) {
                AutofillId autofillId = this.f4444.getAutofillId();
                C2788 c2788M4228 = c2788.m4228();
                int i4 = c2788.f6112;
                if (c2788M4228 != null) {
                    autofillId = ((C8783) interfaceC2254).m14008(c2788M4228.f6112);
                    if (autofillId == null) {
                        c6686 = null;
                    } else {
                        C6686 c66862 = i2 >= 29 ? new C6686(AbstractC3008.m4525(AbstractC8495.m13531(((C8783) interfaceC2254).f22366), autofillId, i4), 25) : null;
                        if (c66862 != null) {
                            ViewStructure viewStructure = (ViewStructure) c66862.f16359;
                            C2791 c27912 = c2788.f6114;
                            if (!c27912.f6124.m1312(AbstractC2778.f6058)) {
                                Bundle extras = viewStructure.getExtras();
                                if (extras != null) {
                                    extras.putLong("android.view.contentcapture.EventTimestamp", this.f4435);
                                    extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                                }
                                String str = (String) AbstractC2792.m4233(c27912, AbstractC2778.f6065);
                                if (str != null) {
                                    viewStructure.setId(i4, null, null, str);
                                }
                                if (((Boolean) AbstractC2792.m4233(c27912, AbstractC2778.f6086)) != null) {
                                    viewStructure.setClassName("android.widget.ViewGroup");
                                }
                                List list = (List) AbstractC2792.m4233(c27912, AbstractC2778.f6063);
                                if (list != null) {
                                    viewStructure.setClassName("android.widget.TextView");
                                    viewStructure.setText(AbstractC8743.m13970(list, "\n", null, 62));
                                }
                                C2902 c2902 = (C2902) AbstractC2792.m4233(c27912, AbstractC2778.f6071);
                                if (c2902 != null) {
                                    viewStructure.setClassName("android.widget.EditText");
                                    viewStructure.setText(c2902);
                                }
                                List list2 = (List) AbstractC2792.m4233(c27912, AbstractC2778.f6079);
                                if (list2 != null) {
                                    viewStructure.setContentDescription(AbstractC8743.m13970(list2, "\n", null, 62));
                                }
                                C2789 c2789 = (C2789) AbstractC2792.m4233(c27912, AbstractC2778.f6066);
                                if (c2789 != null && (strM4180 = AbstractC2751.m4180(c2789.f6118)) != null) {
                                    viewStructure.setClassName(strM4180);
                                }
                                C2867 c2867M4182 = AbstractC2751.m4182(c27912);
                                if (c2867M4182 != null) {
                                    C2868 c2868 = c2867M4182.f6336;
                                    C2865 c2865 = c2868.f6341;
                                    InterfaceC8725 interfaceC8725 = c2868.f6344;
                                    viewStructure.setTextStyle(interfaceC8725.mo1817() * interfaceC8725.mo1816() * C8728.m13902(c2865.f6329.f6402), 0, 0, 0);
                                }
                                AbstractC2629 abstractC2629M4215 = c2788.m4215();
                                if (abstractC2629M4215 == null) {
                                    c8157M4218 = C8157.f19881;
                                    float f = c8157M4218.f19885;
                                    float f2 = c8157M4218.f19884;
                                    viewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (c8157M4218.f19883 - f), (int) (c8157M4218.f19882 - f2));
                                    c6686 = c66862;
                                } else {
                                    AbstractC2629 abstractC2629 = abstractC2629M4215.mo3842().f6624 ? abstractC2629M4215 : null;
                                    if (abstractC2629 != null) {
                                        c8157M4218 = c2788.m4218(abstractC2629);
                                    }
                                    float f3 = c8157M4218.f19885;
                                    float f22 = c8157M4218.f19884;
                                    viewStructure.setDimens((int) f3, (int) f22, 0, 0, (int) (c8157M4218.f19883 - f3), (int) (c8157M4218.f19882 - f22));
                                    c6686 = c66862;
                                }
                            }
                        }
                    }
                }
            }
            if (c6686 != null) {
                this.f4437.add(new C2255(i3, this.f4435, ContentCaptureEventType.VIEW_APPEAR, c6686));
            }
            m3108(c2788, new InterfaceC7383() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$updateBuffersOnAppeared$1
                {
                    super(2);
                }

                @Override // p068.InterfaceC7383
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke(((Number) obj).intValue(), (C2788) obj2);
                    return C6008.f15084;
                }

                public final void invoke(int i5, C2788 c27882) {
                    this.this$0.m3111(i5, c27882);
                }
            });
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m3112(int i, String str) {
        InterfaceC2254 interfaceC2254;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (interfaceC2254 = this.f4443) != null) {
            C8783 c8783 = (C8783) interfaceC2254;
            AutofillId autofillIdM14008 = c8783.m14008(i);
            if (autofillIdM14008 == null) {
                throw AbstractC0900.m699("Invalid content capture ID");
            }
            if (i2 >= 29) {
                AbstractC3008.m4530(AbstractC8495.m13531(c8783.f22366), autofillIdM14008, str);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m3113(C2788 c2788) {
        if (m3106()) {
            this.f4437.add(new C2255(c2788.f6112, this.f4435, ContentCaptureEventType.VIEW_DISAPPEAR, null));
            List listM4212 = C2788.m4212(4, c2788);
            int size = listM4212.size();
            for (int i = 0; i < size; i++) {
                m3113((C2788) listM4212.get(i));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3114() {
        C1093 c1093 = this.f4434;
        c1093.m1349();
        AbstractC1116 abstractC1116M3107 = m3107();
        int[] iArr = abstractC1116M3107.f1318;
        Object[] objArr = abstractC1116M3107.f1317;
        long[] jArr = abstractC1116M3107.f1319;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            c1093.m1350(iArr[i4], new C2707(((C2785) objArr[i4]).f6106, m3107()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.f4433 = new C2707(this.f4444.getSemanticsOwner().m4211(), m3107());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3115() {
        InterfaceC2254 interfaceC2254 = this.f4443;
        if (interfaceC2254 != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f4437;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C2255 c2255 = (C2255) arrayList.get(i);
                int i2 = AbstractC2257.f4445[c2255.f4428.ordinal()];
                if (i2 == 1) {
                    C6686 c6686 = c2255.f4427;
                    if (c6686 != null) {
                        ViewStructure viewStructure = (ViewStructure) c6686.f16359;
                        C8783 c8783 = (C8783) interfaceC2254;
                        if (Build.VERSION.SDK_INT >= 29) {
                            AbstractC3008.m4524(AbstractC8495.m13531(c8783.f22366), viewStructure);
                        }
                    }
                } else {
                    if (i2 != 2) {
                        C5043.m9170();
                        return;
                    }
                    C8783 c87832 = (C8783) interfaceC2254;
                    AutofillId autofillIdM14008 = c87832.m14008(c2255.f4430);
                    if (autofillIdM14008 != null && Build.VERSION.SDK_INT >= 29) {
                        AbstractC3008.m4523(AbstractC8495.m13531(c87832.f22366), autofillIdM14008);
                    }
                }
            }
            C8783 c87833 = (C8783) interfaceC2254;
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC3008.m4529(AbstractC8495.m13531(c87833.f22366), c87833.f22365.getAutofillId(), new long[]{Long.MIN_VALUE});
            }
            arrayList.clear();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m3116() {
        C2776 c2776;
        InterfaceC7387 interfaceC7387;
        this.f4440 = AndroidContentCaptureManager$TranslateStatus.SHOW_TRANSLATED;
        AbstractC1116 abstractC1116M3107 = m3107();
        Object[] objArr = abstractC1116M3107.f1317;
        long[] jArr = abstractC1116M3107.f1319;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        C2791 c2791 = ((C2785) objArr[(i << 3) + i3]).f6106.f6114;
                        if (AbstractC5227.m9466(AbstractC2792.m4233(c2791, AbstractC2778.f6073), Boolean.FALSE) && (c2776 = (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6146)) != null && (interfaceC7387 = (InterfaceC7387) c2776.f6051) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m3117(C2788 c2788, final C2707 c2707) {
        m3108(c2788, new InterfaceC7383() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$sendContentCaptureAppearEvents$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void invoke(int i, C2788 c27882) {
                if (c2707.f5723.m1344(c27882.f6112)) {
                    return;
                }
                this.m3111(i, c27882);
                this.f4438.mo8995(C6008.f15084);
            }

            @Override // p068.InterfaceC7383
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(((Number) obj).intValue(), (C2788) obj2);
                return C6008.f15084;
            }
        });
        List listM4212 = C2788.m4212(4, c2788);
        int size = listM4212.size();
        for (int i = 0; i < size; i++) {
            C2788 c27882 = (C2788) listM4212.get(i);
            AbstractC1116 abstractC1116M3107 = m3107();
            int i2 = c27882.f6112;
            if (abstractC1116M3107.m1394(i2)) {
                C1093 c1093 = this.f4434;
                if (c1093.m1394(i2)) {
                    Object objM1393 = c1093.m1393(i2);
                    if (objM1393 == null) {
                        throw AbstractC0900.m699("node not present in pruned tree before this change");
                    }
                    m3117(c27882, (C2707) objM1393);
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m3118() {
        C2776 c2776;
        InterfaceC7372 interfaceC7372;
        this.f4440 = AndroidContentCaptureManager$TranslateStatus.SHOW_ORIGINAL;
        AbstractC1116 abstractC1116M3107 = m3107();
        Object[] objArr = abstractC1116M3107.f1317;
        long[] jArr = abstractC1116M3107.f1319;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        C2791 c2791 = ((C2785) objArr[(i << 3) + i3]).f6106.f6114;
                        if (AbstractC2792.m4233(c2791, AbstractC2778.f6073) != null && (c2776 = (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6145)) != null && (interfaceC7372 = (InterfaceC7372) c2776.f6051) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m3119() {
        C2776 c2776;
        InterfaceC7387 interfaceC7387;
        this.f4440 = AndroidContentCaptureManager$TranslateStatus.SHOW_ORIGINAL;
        AbstractC1116 abstractC1116M3107 = m3107();
        Object[] objArr = abstractC1116M3107.f1317;
        long[] jArr = abstractC1116M3107.f1319;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        C2791 c2791 = ((C2785) objArr[(i << 3) + i3]).f6106.f6114;
                        if (AbstractC5227.m9466(AbstractC2792.m4233(c2791, AbstractC2778.f6073), Boolean.TRUE) && (c2776 = (C2776) AbstractC2792.m4233(c2791, AbstractC2794.f6146)) != null && (interfaceC7387 = (InterfaceC7387) c2776.f6051) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
