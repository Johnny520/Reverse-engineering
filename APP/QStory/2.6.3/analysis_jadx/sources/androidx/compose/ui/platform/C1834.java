package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.text.input.C2014;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.InterfaceC5401;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1834 implements InterfaceC1875, InterfaceC5401 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AtomicReference f5328 = new AtomicReference(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2014 f5329;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5401 f5330;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final View f5331;

    public C1834(View view, C2014 c2014, InterfaceC5401 interfaceC5401) {
        this.f5331 = view;
        this.f5329 = c2014;
        this.f5330 = interfaceC5401;
    }

    @Override // kotlinx.coroutines.InterfaceC5401
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC4360 mo2430() {
        return this.f5330.mo2430();
    }

    @Override // androidx.compose.ui.platform.InterfaceC1854
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final View mo3466() {
        return this.f5331;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.platform.InterfaceC1854
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.coroutines.intrinsics.CoroutineSingletons mo3467(final androidx.compose.ui.platform.InterfaceC1858 r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r0 = (androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r0 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 == r4) goto L2a
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            return r3
        L2a:
            kotlin.AbstractC5185.m10210(r7)
            goto L46
        L2e:
            kotlin.AbstractC5185.m10210(r7)
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2 r7 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2
            r7.<init>()
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3 r6 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3
            r6.<init>(r5, r3)
            r0.label = r4
            java.util.concurrent.atomic.AtomicReference r5 = r5.f5328
            java.lang.Object r5 = androidx.compose.ui.AbstractC2120.m3860(r5, r7, r6, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            io.ktor.util.C4211.m8602()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C1834.mo3467(androidx.compose.ui.platform.飘花落叶言子哲世苏楪兰, kotlin.coroutines.jvm.internal.ContinuationImpl):kotlin.coroutines.intrinsics.CoroutineSingletons");
    }
}
