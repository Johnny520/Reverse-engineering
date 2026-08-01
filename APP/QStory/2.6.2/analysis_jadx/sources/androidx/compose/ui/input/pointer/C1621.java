package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.platform.InterfaceC1863;
import com.bumptech.glide.AbstractC3054;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C5443;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1621 implements InterfaceC1633, InterfaceC7895, InterfaceC4356 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ C1627 f4740;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5443 f4741;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C5443 f4742;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C1627 f4743;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public PointerEventPass f4739 = PointerEventPass.Main;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final EmptyCoroutineContext f4738 = EmptyCoroutineContext.INSTANCE;

    public C1621(C1627 c1627, C5443 c5443) {
        this.f4740 = c1627;
        this.f4743 = c1627;
        this.f4741 = c5443;
    }

    @Override // kotlin.coroutines.InterfaceC4356
    public final InterfaceC4359 getContext() {
        return this.f4738;
    }

    @Override // kotlin.coroutines.InterfaceC4356
    public final void resumeWith(Object obj) {
        C1627 c1627 = this.f4740;
        synchronized (c1627.f4754) {
            c1627.f4755.m2045(this);
        }
        this.f4741.resumeWith(obj);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final float mo1322(float f) {
        return f / this.f4743.mo1246();
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final float mo1323(int i) {
        return this.f4743.mo1323(i);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final long mo1324(float f) {
        return this.f4743.mo1324(f);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public final float mo1325(long j) {
        return this.f4743.mo1325(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC1863 m2987() {
        return AbstractC1785.m3336(this.f4740).f5095;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long m2988() {
        C1627 c1627 = this.f4740;
        long jMo1332 = c1627.mo1332(AbstractC1785.m3336(c1627).f5095.mo3269());
        long j = c1627.f4752;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo1332 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo1332 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m2989(PointerEventPass pointerEventPass, InterfaceC4356 interfaceC4356) {
        C5443 c5443 = new C5443(1, AbstractC3054.m6602(interfaceC4356));
        c5443.m10539();
        this.f4739 = pointerEventPass;
        this.f4742 = c5443;
        Object objM10536 = c5443.m10536();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM10536;
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1246() {
        return this.f4743.mo1246();
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final long mo1329(long j) {
        return this.f4743.mo1329(j);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final long mo1330(float f) {
        return this.f4743.mo1330(f);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final float mo1331(long j) {
        return this.f4743.mo1331(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2990(long r6, p052.InterfaceC6553 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            kotlin.AbstractC5184.m10206(r9)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3b
            return r9
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r3
        L2e:
            kotlin.AbstractC5184.m10206(r9)
            r0.label = r4     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3b
            java.lang.Object r5 = r5.m2991(r6, r8, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3b
            if (r5 != r1) goto L3a
            return r1
        L3a:
            return r5
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.C1621.m2990(long, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2991(long r9, p052.InterfaceC6553 r11, kotlin.coroutines.jvm.internal.BaseContinuationImpl r12) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r12 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2e
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r8 = (kotlinx.coroutines.InterfaceC5451) r8
            kotlin.AbstractC5184.m10206(r12)     // Catch: java.lang.Throwable -> L2c
            goto L6e
        L2c:
            r9 = move-exception
            goto L78
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r8)
            return r3
        L34:
            kotlin.AbstractC5184.m10206(r12)
            r5 = 0
            int r12 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r12 > 0) goto L52
            kotlinx.coroutines.飘花落叶言子楪苏兰世哲 r12 = r8.f4742
            if (r12 == 0) goto L52
            androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
            r2.<init>(r9)
            kotlin.Result$Failure r5 = new kotlin.Result$Failure
            r5.<init>(r2)
            java.lang.Object r2 = kotlin.Result.m8755constructorimpl(r5)
            r12.resumeWith(r2)
        L52:
            androidx.compose.ui.input.pointer.飘花落叶言子世苏楪兰哲 r12 = r8.f4740
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r12 = r12.m3857()
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 r2 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1
            r2.<init>(r9, r8, r3)
            r9 = 3
            kotlinx.coroutines.飘花落叶言子哲楪世兰苏 r9 = kotlinx.coroutines.AbstractC5398.m10473(r12, r3, r3, r2, r9)
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L74
            r0.label = r4     // Catch: java.lang.Throwable -> L74
            java.lang.Object r12 = r11.invoke(r8, r0)     // Catch: java.lang.Throwable -> L74
            if (r12 != r1) goto L6d
            return r1
        L6d:
            r8 = r9
        L6e:
            androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r9 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.INSTANCE
            r8.mo10252(r9)
            return r12
        L74:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L78:
            androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r10 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.INSTANCE
            r8.mo10252(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.C1621.m2991(long, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final long mo1332(long j) {
        return this.f4743.mo1332(j);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final int mo1333(float f) {
        return this.f4743.mo1333(f);
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1247() {
        return this.f4743.mo1247();
    }

    @Override // p205.InterfaceC7895
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public final float mo1334(float f) {
        return this.f4743.mo1246() * f;
    }
}
