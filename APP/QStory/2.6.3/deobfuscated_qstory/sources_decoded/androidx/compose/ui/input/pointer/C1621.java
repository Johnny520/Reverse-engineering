package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.platform.InterfaceC1863;
import androidx.window.area.AbstractC2567;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C5444;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1621 implements InterfaceC1633, InterfaceC7896, InterfaceC4357 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ C1627 f4741;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5444 f4742;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C5444 f4743;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C1627 f4744;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public PointerEventPass f4740 = PointerEventPass.Main;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final EmptyCoroutineContext f4739 = EmptyCoroutineContext.INSTANCE;

    public C1621(C1627 c1627, C5444 c5444) {
        this.f4741 = c1627;
        this.f4744 = c1627;
        this.f4742 = c5444;
    }

    @Override // kotlin.coroutines.InterfaceC4357
    public final InterfaceC4360 getContext() {
        return this.f4739;
    }

    @Override // kotlin.coroutines.InterfaceC4357
    public final void resumeWith(Object obj) {
        C1627 c1627 = this.f4741;
        synchronized (c1627.f4755) {
            c1627.f4756.m2055(this);
        }
        this.f4742.resumeWith(obj);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final float mo1332(float f) {
        return f / this.f4744.mo1256();
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final float mo1333(int i) {
        return this.f4744.mo1333(i);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final long mo1334(float f) {
        return this.f4744.mo1334(f);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public final float mo1335(long j) {
        return this.f4744.mo1335(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC1863 m2997() {
        return AbstractC1785.m3346(this.f4741).f5096;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long m2998() {
        C1627 c1627 = this.f4741;
        long jMo1342 = c1627.mo1342(AbstractC1785.m3346(c1627).f5096.mo3279());
        long j = c1627.f4753;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo1342 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo1342 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m2999(PointerEventPass pointerEventPass, InterfaceC4357 interfaceC4357) {
        C5444 c5444 = new C5444(1, AbstractC2567.m5064(interfaceC4357));
        c5444.m10543();
        this.f4740 = pointerEventPass;
        this.f4743 = c5444;
        Object objM10540 = c5444.m10540();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM10540;
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1256() {
        return this.f4744.mo1256();
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final long mo1339(long j) {
        return this.f4744.mo1339(j);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final long mo1340(float f) {
        return this.f4744.mo1340(f);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final float mo1341(long j) {
        return this.f4744.mo1341(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3000(long r6, p052.InterfaceC6554 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
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
            kotlin.AbstractC5185.m10210(r9)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3b
            return r9
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            return r3
        L2e:
            kotlin.AbstractC5185.m10210(r9)
            r0.label = r4     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3b
            java.lang.Object r5 = r5.m3001(r6, r8, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3b
            if (r5 != r1) goto L3a
            return r1
        L3a:
            return r5
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.C1621.m3000(long, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3001(long r9, p052.InterfaceC6554 r11, kotlin.coroutines.jvm.internal.BaseContinuationImpl r12) throws java.lang.Throwable {
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
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r8 = (kotlinx.coroutines.InterfaceC5452) r8
            kotlin.AbstractC5185.m10210(r12)     // Catch: java.lang.Throwable -> L2c
            goto L6e
        L2c:
            r9 = move-exception
            goto L78
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r8)
            return r3
        L34:
            kotlin.AbstractC5185.m10210(r12)
            r5 = 0
            int r12 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r12 > 0) goto L52
            kotlinx.coroutines.飘花落叶言子楪苏兰世哲 r12 = r8.f4743
            if (r12 == 0) goto L52
            androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
            r2.<init>(r9)
            kotlin.Result$Failure r5 = new kotlin.Result$Failure
            r5.<init>(r2)
            java.lang.Object r2 = kotlin.Result.m8745constructorimpl(r5)
            r12.resumeWith(r2)
        L52:
            androidx.compose.ui.input.pointer.飘花落叶言子世苏楪兰哲 r12 = r8.f4741
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r12 = r12.m3867()
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 r2 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1
            r2.<init>(r9, r8, r3)
            r9 = 3
            kotlinx.coroutines.飘花落叶言子哲楪世兰苏 r9 = kotlinx.coroutines.AbstractC5399.m10477(r12, r3, r3, r2, r9)
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L74
            r0.label = r4     // Catch: java.lang.Throwable -> L74
            java.lang.Object r12 = r11.invoke(r8, r0)     // Catch: java.lang.Throwable -> L74
            if (r12 != r1) goto L6d
            return r1
        L6d:
            r8 = r9
        L6e:
            androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r9 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.INSTANCE
            r8.mo10256(r9)
            return r12
        L74:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L78:
            androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r10 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.INSTANCE
            r8.mo10256(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.C1621.m3001(long, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final long mo1342(long j) {
        return this.f4744.mo1342(j);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final int mo1343(float f) {
        return this.f4744.mo1343(f);
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1257() {
        return this.f4744.mo1257();
    }

    @Override // p205.InterfaceC7896
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public final float mo1344(float f) {
        return this.f4744.mo1256() * f;
    }
}
