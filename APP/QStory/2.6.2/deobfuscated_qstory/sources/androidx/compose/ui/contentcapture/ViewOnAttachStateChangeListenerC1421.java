package androidx.compose.ui.contentcapture;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.activity.AbstractC0053;
import androidx.collection.AbstractC0269;
import androidx.collection.AbstractC0273;
import androidx.collection.C0246;
import androidx.compose.ui.platform.C1872;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import androidx.compose.ui.semantics.AbstractC1943;
import androidx.compose.ui.semantics.AbstractC1957;
import androidx.compose.ui.semantics.AbstractC1959;
import androidx.compose.ui.semantics.C1941;
import androidx.compose.ui.semantics.C1950;
import androidx.compose.ui.semantics.C1953;
import androidx.compose.ui.semantics.C1956;
import androidx.core.os.AbstractC2175;
import androidx.lifecycle.InterfaceC2388;
import androidx.lifecycle.InterfaceC2409;
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.List;
import kotlin.C5175;
import kotlin.jvm.internal.AbstractC4394;
import kotlinx.coroutines.channels.AbstractC5204;
import kotlinx.coroutines.channels.C5189;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p164.AbstractC7665;
import p214.C7953;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: androidx.compose.ui.contentcapture.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1421 implements InterfaceC2409, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final RunnableC1423 f4085;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public boolean f4086;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public C1872 f4087;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C0246 f4088;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public long f4089;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public C0246 f4093;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6542 f4096;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public InterfaceC1419 f4097;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC1884 f4098;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ArrayList f4091 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final long f4090 = 100;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public AndroidContentCaptureManager$TranslateStatus f4094 = AndroidContentCaptureManager$TranslateStatus.SHOW_ORIGINAL;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f4095 = true;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C5189 f4092 = AbstractC5204.m10278(1, 6, null);

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.ui.contentcapture.飘花落叶言子楪世苏哲兰] */
    public ViewOnAttachStateChangeListenerC1421(ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884, InterfaceC6542 interfaceC6542) {
        this.f4098 = viewTreeObserverOnGlobalLayoutListenerC1884;
        this.f4096 = interfaceC6542;
        new Handler(Looper.getMainLooper());
        C0246 c0246 = AbstractC0273.f978;
        c0246.getClass();
        this.f4093 = c0246;
        this.f4088 = new C0246();
        this.f4087 = new C1872(viewTreeObserverOnGlobalLayoutListenerC1884.getSemanticsOwner().m3641(), c0246);
        this.f4085 = new Runnable() { // from class: androidx.compose.ui.contentcapture.飘花落叶言子楪世苏哲兰
            /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r20 = this;
                    r0 = r20
                    androidx.compose.ui.contentcapture.飘花落叶言子楪世哲苏兰 r0 = r0.f4100
                    boolean r1 = r0.m2536()
                    androidx.compose.ui.platform.飘花落叶言子楪兰世苏哲 r2 = r0.f4098
                    if (r1 != 0) goto Ld
                    return
                Ld:
                    java.lang.String r1 = "ContentCapture:changeChecker"
                    android.os.Trace.beginSection(r1)
                    r1 = 1
                    r2.m3532(r1)     // Catch: java.lang.Throwable -> Lb1
                    androidx.collection.飘花落叶言子世楪兰苏哲 r1 = r0.f4088     // Catch: java.lang.Throwable -> Lb1
                    int[] r3 = r1.f973     // Catch: java.lang.Throwable -> Lb1
                    long[] r1 = r1.f974     // Catch: java.lang.Throwable -> Lb1
                    int r4 = r1.length     // Catch: java.lang.Throwable -> Lb1
                    int r4 = r4 + (-2)
                    if (r4 < 0) goto L86
                    r6 = 0
                L22:
                    r7 = r1[r6]     // Catch: java.lang.Throwable -> Lb1
                    long r9 = ~r7     // Catch: java.lang.Throwable -> Lb1
                    r11 = 7
                    long r9 = r9 << r11
                    long r9 = r9 & r7
                    r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                    long r9 = r9 & r11
                    int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                    if (r9 == 0) goto L80
                    int r9 = r6 - r4
                    int r9 = ~r9     // Catch: java.lang.Throwable -> Lb1
                    int r9 = r9 >>> 31
                    r10 = 8
                    int r9 = 8 - r9
                    r11 = 0
                L3c:
                    if (r11 >= r9) goto L79
                    r12 = 255(0xff, double:1.26E-321)
                    long r12 = r12 & r7
                    r14 = 128(0x80, double:6.3E-322)
                    int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                    if (r12 >= 0) goto L71
                    int r12 = r6 << 3
                    int r12 = r12 + r11
                    r14 = r3[r12]     // Catch: java.lang.Throwable -> Lb1
                    androidx.collection.飘花落叶言子楪哲世兰苏 r12 = r0.m2537()     // Catch: java.lang.Throwable -> Lb1
                    boolean r12 = r12.m833(r14)     // Catch: java.lang.Throwable -> Lb1
                    if (r12 != 0) goto L71
                    java.util.ArrayList r12 = r0.f4091     // Catch: java.lang.Throwable -> Lb1
                    androidx.compose.ui.contentcapture.飘花落叶言子楪世哲兰苏 r13 = new androidx.compose.ui.contentcapture.飘花落叶言子楪世哲兰苏     // Catch: java.lang.Throwable -> Lb1
                    r19 = r6
                    long r5 = r0.f4089     // Catch: java.lang.Throwable -> Lb1
                    androidx.compose.ui.contentcapture.ContentCaptureEventType r17 = androidx.compose.ui.contentcapture.ContentCaptureEventType.VIEW_DISAPPEAR     // Catch: java.lang.Throwable -> Lb1
                    r18 = 0
                    r15 = r5
                    r13.<init>(r14, r15, r17, r18)     // Catch: java.lang.Throwable -> Lb1
                    r12.add(r13)     // Catch: java.lang.Throwable -> Lb1
                    kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲 r5 = r0.f4092     // Catch: java.lang.Throwable -> Lb1
                    kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739     // Catch: java.lang.Throwable -> Lb1
                    r5.mo8445(r6)     // Catch: java.lang.Throwable -> Lb1
                    goto L73
                L71:
                    r19 = r6
                L73:
                    long r7 = r7 >> r10
                    int r11 = r11 + 1
                    r6 = r19
                    goto L3c
                L79:
                    r19 = r6
                    if (r9 != r10) goto L86
                    r5 = r19
                    goto L81
                L80:
                    r5 = r6
                L81:
                    if (r5 == r4) goto L86
                    int r6 = r5 + 1
                    goto L22
                L86:
                    java.lang.String r1 = "ContentCapture:sendAppearEvents"
                    android.os.Trace.beginSection(r1)     // Catch: java.lang.Throwable -> Lb1
                    androidx.compose.ui.semantics.飘花落叶言子楪哲兰苏世 r1 = r2.getSemanticsOwner()     // Catch: java.lang.Throwable -> Lac
                    androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世 r1 = r1.m3641()     // Catch: java.lang.Throwable -> Lac
                    androidx.compose.ui.platform.飘花落叶言子哲苏世楪兰 r2 = r0.f4087     // Catch: java.lang.Throwable -> Lac
                    r0.m2547(r1, r2)     // Catch: java.lang.Throwable -> Lac
                    android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb1
                    androidx.collection.飘花落叶言子楪哲世兰苏 r1 = r0.m2537()     // Catch: java.lang.Throwable -> Lb1
                    r0.m2539(r1)     // Catch: java.lang.Throwable -> Lb1
                    r0.m2544()     // Catch: java.lang.Throwable -> Lb1
                    r1 = 0
                    r0.f4086 = r1     // Catch: java.lang.Throwable -> Lb1
                    android.os.Trace.endSection()
                    return
                Lac:
                    r0 = move-exception
                    android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb1
                    throw r0     // Catch: java.lang.Throwable -> Lb1
                Lb1:
                    r0 = move-exception
                    android.os.Trace.endSection()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.RunnableC1423.run():void");
            }
        };
    }

    @Override // androidx.lifecycle.InterfaceC2409
    public final void onStart(InterfaceC2388 interfaceC2388) {
        this.f4097 = (InterfaceC1419) this.f4096.invoke();
        m2541(-1, this.f4098.getSemanticsOwner().m3641());
        m2545();
    }

    @Override // androidx.lifecycle.InterfaceC2409
    public final void onStop(InterfaceC2388 interfaceC2388) {
        m2543(this.f4098.getSemanticsOwner().m3641());
        m2545();
        this.f4097 = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.f4098.getHandler();
        handler.getClass();
        handler.removeCallbacks(this.f4085);
        this.f4097 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m2536() {
        return this.f4097 != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC0269 m2537() {
        if (this.f4095) {
            this.f4095 = false;
            this.f4093 = AbstractC1957.m3667(this.f4098.getSemanticsOwner(), new InterfaceC6557() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$currentSemanticsNodes$1
                @Override // p052.InterfaceC6557
                public final Boolean invoke(C1953 c1953) {
                    C1956 c1956M3657 = c1953.m3657();
                    return Boolean.valueOf(c1956M3657.f5778.m751(AbstractC1943.f5718));
                }
            });
            this.f4089 = System.currentTimeMillis();
        }
        return this.f4093;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m2538(C1953 c1953, InterfaceC6553 interfaceC6553) {
        c1953.getClass();
        List listM3642 = C1953.m3642(4, c1953);
        int size = listM3642.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = listM3642.get(i2);
            if (m2537().m833(((C1953) obj).f5766)) {
                interfaceC6553.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2539(androidx.collection.AbstractC0269 r34) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.ViewOnAttachStateChangeListenerC1421.m2539(androidx.collection.飘花落叶言子楪哲世兰苏):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008a -> B:17:0x004a). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2540(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = new androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r2 = (kotlinx.coroutines.channels.InterfaceC5211) r2
            kotlin.AbstractC5184.m10206(r8)
            goto L4a
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r7)
            r7 = 0
            return r7
        L35:
            java.lang.Object r2 = r0.L$0
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r2 = (kotlinx.coroutines.channels.InterfaceC5211) r2
            kotlin.AbstractC5184.m10206(r8)
            goto L57
        L3d:
            kotlin.AbstractC5184.m10206(r8)
            kotlinx.coroutines.channels.飘花落叶言子楪世兰苏哲 r8 = r7.f4092
            r8.getClass()
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r2 = new kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏
            r2.<init>(r8)
        L4a:
            r0.L$0 = r2
            r0.label = r4
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r2 = (kotlinx.coroutines.channels.C5190) r2
            java.lang.Object r8 = r2.m10260(r0)
            if (r8 != r1) goto L57
            goto L8c
        L57:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L8d
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r2 = (kotlinx.coroutines.channels.C5190) r2
            r2.m10258()
            boolean r8 = r7.m2536()
            if (r8 == 0) goto L6d
            r7.m2545()
        L6d:
            androidx.compose.ui.platform.飘花落叶言子楪兰世苏哲 r8 = r7.f4098
            android.os.Handler r8 = r8.getHandler()
            boolean r5 = r7.f4086
            if (r5 != 0) goto L80
            if (r8 == 0) goto L80
            r7.f4086 = r4
            androidx.compose.ui.contentcapture.飘花落叶言子楪世苏哲兰 r5 = r7.f4085
            r8.post(r5)
        L80:
            r0.L$0 = r2
            r0.label = r3
            long r5 = r7.f4090
            java.lang.Object r8 = kotlinx.coroutines.AbstractC5398.m10495(r5, r0)
            if (r8 != r1) goto L4a
        L8c:
            return r1
        L8d:
            kotlin.飘花落叶言子楪兰苏哲世 r7 = kotlin.C5175.f14739
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.ViewOnAttachStateChangeListenerC1421.m2540(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e A[PHI: r7
  0x008e: PHI (r7v2 android.view.autofill.AutofillId) = (r7v1 android.view.autofill.AutofillId), (r7v13 android.view.autofill.AutofillId) binds: [B:30:0x007f, B:32:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0175  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2541(int r18, androidx.compose.ui.semantics.C1953 r19) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.ViewOnAttachStateChangeListenerC1421.m2541(int, androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m2542(int i, String str) {
        InterfaceC1419 interfaceC1419;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (interfaceC1419 = this.f4097) != null) {
            C7953 c7953 = (C7953) interfaceC1419;
            AutofillId autofillIdM13421 = c7953.m13421(i);
            if (autofillIdM13421 == null) {
                throw AbstractC0053.m139("Invalid content capture ID");
            }
            if (i2 >= 29) {
                AbstractC2175.m3960(AbstractC7665.m12943(c7953.f22024), autofillIdM13421, str);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m2543(C1953 c1953) {
        if (m2536()) {
            this.f4091.add(new C1420(c1953.f5766, this.f4089, ContentCaptureEventType.VIEW_DISAPPEAR, null));
            List listM3642 = C1953.m3642(4, c1953);
            int size = listM3642.size();
            for (int i = 0; i < size; i++) {
                m2543((C1953) listM3642.get(i));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2544() {
        /*
            r17 = this;
            r0 = r17
            androidx.collection.飘花落叶言子世楪兰苏哲 r1 = r0.f4088
            r1.m788()
            androidx.collection.飘花落叶言子楪哲世兰苏 r2 = r0.m2537()
            int[] r3 = r2.f973
            java.lang.Object[] r4 = r2.f972
            long[] r2 = r2.f974
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L5e
            r7 = 0
        L17:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L31:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            androidx.compose.ui.semantics.飘花落叶言子楪哲兰世苏 r13 = (androidx.compose.ui.semantics.C1950) r13
            androidx.compose.ui.platform.飘花落叶言子哲苏世楪兰 r15 = new androidx.compose.ui.platform.飘花落叶言子哲苏世楪兰
            androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世 r13 = r13.f5760
            androidx.collection.飘花落叶言子楪哲世兰苏 r6 = r0.m2537()
            r15.<init>(r13, r6)
            r1.m789(r14, r15)
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L31
        L57:
            if (r10 != r11) goto L5e
        L59:
            if (r7 == r5) goto L5e
            int r7 = r7 + 1
            goto L17
        L5e:
            androidx.compose.ui.platform.飘花落叶言子哲苏世楪兰 r1 = new androidx.compose.ui.platform.飘花落叶言子哲苏世楪兰
            androidx.compose.ui.platform.飘花落叶言子楪兰世苏哲 r2 = r0.f4098
            androidx.compose.ui.semantics.飘花落叶言子楪哲兰苏世 r2 = r2.getSemanticsOwner()
            androidx.compose.ui.semantics.飘花落叶言子楪哲苏兰世 r2 = r2.m3641()
            androidx.collection.飘花落叶言子楪哲世兰苏 r3 = r0.m2537()
            r1.<init>(r2, r3)
            r0.f4087 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.ViewOnAttachStateChangeListenerC1421.m2544():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m2545() {
        InterfaceC1419 interfaceC1419 = this.f4097;
        if (interfaceC1419 != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f4091;
            if (arrayList.isEmpty()) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C1420 c1420 = (C1420) arrayList.get(i);
                int i2 = AbstractC1422.f4099[c1420.f4082.ordinal()];
                if (i2 == 1) {
                    C5851 c5851 = c1420.f4081;
                    if (c5851 != null) {
                        ViewStructure viewStructure = (ViewStructure) c5851.f16007;
                        C7953 c7953 = (C7953) interfaceC1419;
                        if (Build.VERSION.SDK_INT >= 29) {
                            AbstractC2175.m3954(AbstractC7665.m12943(c7953.f22024), viewStructure);
                        }
                    }
                } else {
                    if (i2 != 2) {
                        C4210.m8621();
                        return;
                    }
                    C7953 c79532 = (C7953) interfaceC1419;
                    AutofillId autofillIdM13421 = c79532.m13421(c1420.f4084);
                    if (autofillIdM13421 != null && Build.VERSION.SDK_INT >= 29) {
                        AbstractC2175.m3953(AbstractC7665.m12943(c79532.f22024), autofillIdM13421);
                    }
                }
            }
            C7953 c79533 = (C7953) interfaceC1419;
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC2175.m3959(AbstractC7665.m12943(c79533.f22024), c79533.f22023.getAutofillId(), new long[]{Long.MIN_VALUE});
            }
            arrayList.clear();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m2546() {
        C1941 c1941;
        InterfaceC6557 interfaceC6557;
        this.f4094 = AndroidContentCaptureManager$TranslateStatus.SHOW_TRANSLATED;
        AbstractC0269 abstractC0269M2537 = m2537();
        Object[] objArr = abstractC0269M2537.f972;
        long[] jArr = abstractC0269M2537.f974;
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
                        C1956 c1956 = ((C1950) objArr[(i << 3) + i3]).f5760.f5768;
                        if (AbstractC4394.m8917(AbstractC1957.m3663(c1956, AbstractC1943.f5727), Boolean.FALSE) && (c1941 = (C1941) AbstractC1957.m3663(c1956, AbstractC1959.f5800)) != null && (interfaceC6557 = (InterfaceC6557) c1941.f5705) != null) {
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
    public final void m2547(C1953 c1953, final C1872 c1872) {
        m2538(c1953, new InterfaceC6553() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$sendContentCaptureAppearEvents$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void invoke(int i, C1953 c19532) {
                if (c1872.f5377.m783(c19532.f5766)) {
                    return;
                }
                this.m2541(i, c19532);
                this.f4092.mo8445(C5175.f14739);
            }

            @Override // p052.InterfaceC6553
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(((Number) obj).intValue(), (C1953) obj2);
                return C5175.f14739;
            }
        });
        List listM3642 = C1953.m3642(4, c1953);
        int size = listM3642.size();
        for (int i = 0; i < size; i++) {
            C1953 c19532 = (C1953) listM3642.get(i);
            AbstractC0269 abstractC0269M2537 = m2537();
            int i2 = c19532.f5766;
            if (abstractC0269M2537.m833(i2)) {
                C0246 c0246 = this.f4088;
                if (c0246.m833(i2)) {
                    Object objM832 = c0246.m832(i2);
                    if (objM832 == null) {
                        throw AbstractC0053.m139("node not present in pruned tree before this change");
                    }
                    m2547(c19532, (C1872) objM832);
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m2548() {
        C1941 c1941;
        InterfaceC6542 interfaceC6542;
        this.f4094 = AndroidContentCaptureManager$TranslateStatus.SHOW_ORIGINAL;
        AbstractC0269 abstractC0269M2537 = m2537();
        Object[] objArr = abstractC0269M2537.f972;
        long[] jArr = abstractC0269M2537.f974;
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
                        C1956 c1956 = ((C1950) objArr[(i << 3) + i3]).f5760.f5768;
                        if (AbstractC1957.m3663(c1956, AbstractC1943.f5727) != null && (c1941 = (C1941) AbstractC1957.m3663(c1956, AbstractC1959.f5799)) != null && (interfaceC6542 = (InterfaceC6542) c1941.f5705) != null) {
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
    public final void m2549() {
        C1941 c1941;
        InterfaceC6557 interfaceC6557;
        this.f4094 = AndroidContentCaptureManager$TranslateStatus.SHOW_ORIGINAL;
        AbstractC0269 abstractC0269M2537 = m2537();
        Object[] objArr = abstractC0269M2537.f972;
        long[] jArr = abstractC0269M2537.f974;
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
                        C1956 c1956 = ((C1950) objArr[(i << 3) + i3]).f5760.f5768;
                        if (AbstractC4394.m8917(AbstractC1957.m3663(c1956, AbstractC1943.f5727), Boolean.TRUE) && (c1941 = (C1941) AbstractC1957.m3663(c1956, AbstractC1959.f5800)) != null && (interfaceC6557 = (InterfaceC6557) c1941.f5705) != null) {
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
