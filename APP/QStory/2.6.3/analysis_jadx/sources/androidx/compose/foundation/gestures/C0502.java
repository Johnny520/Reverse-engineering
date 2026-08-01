package androidx.compose.foundation.gestures;

import android.view.ViewTreeObserver;
import androidx.compose.foundation.InterfaceC1084;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.input.nestedscroll.C1619;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import java.lang.reflect.Method;
import kotlin.C5176;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p052.InterfaceC6554;
import p112.C7329;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0502 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C1619 f1487;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f1488;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Orientation f1489;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC0560 f1490;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC1084 f1491;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC0513 f1492;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C0495 f1494;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0517 f1495;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f1498;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f1499 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public InterfaceC0507 f1496 = AbstractC0498.f1479;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C0515 f1497 = new C0515(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C0510 f1493 = new C0510(this, 3);

    public C0502(InterfaceC0513 interfaceC0513, InterfaceC1084 interfaceC1084, InterfaceC0560 interfaceC0560, Orientation orientation, boolean z, C1619 c1619, C0517 c0517, C0495 c0495) {
        this.f1492 = interfaceC0513;
        this.f1491 = interfaceC1084;
        this.f1490 = interfaceC0560;
        this.f1489 = orientation;
        this.f1488 = z;
        this.f1487 = c1619;
        this.f1495 = c0517;
        this.f1494 = c0495;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m1262(MutatePriority mutatePriority, InterfaceC6554 interfaceC6554, ContinuationImpl continuationImpl) {
        Object objMo1249 = this.f1492.mo1249(mutatePriority, new ScrollingLogic$scroll$2(this, interfaceC6554, null), continuationImpl);
        return objMo1249 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo1249 : C5176.f14739;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long m1263(long j) {
        return this.f1488 ? C7329.m12532(-1.0f, j) : j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float m1264(float f) {
        return this.f1488 ? f * (-1.0f) : f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long m1265(InterfaceC0507 interfaceC0507, long j, int i) {
        long jM2992 = this.f1487.m2992(i, j);
        long jM12526 = C7329.m12526(j, jM2992);
        long jM1263 = m1263(m1268(interfaceC0507.mo1251(m1269(m1263(this.f1489 == Orientation.Horizontal ? C7329.m12530(jM12526, 0.0f, 1) : C7329.m12530(jM12526, 0.0f, 2))))));
        C0517 c0517 = this.f1495;
        if (c0517.f6279) {
            ViewTreeObserver viewTreeObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1884) AbstractC1785.m3347(c0517)).getViewTreeObserver();
            try {
                if (ViewTreeObserverOnGlobalLayoutListenerC1884.f5417 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    ViewTreeObserverOnGlobalLayoutListenerC1884.f5417 = declaredMethod;
                }
                Method method = ViewTreeObserverOnGlobalLayoutListenerC1884.f5417;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        return C7329.m12525(C7329.m12525(jM2992, jM1263), this.f1487.m2994(jM1263, C7329.m12526(jM12526, jM1263), i));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1266(long r3, boolean r5, kotlin.coroutines.jvm.internal.SuspendLambda r6) {
        /*
            r2 = this;
            if (r5 == 0) goto Lb
            androidx.compose.foundation.gestures.飘花落叶言子苏楪世兰哲 r5 = r2.f1490
            androidx.compose.foundation.gestures.飘花落叶言子楪世哲兰苏 r0 = androidx.compose.foundation.gestures.AbstractC0498.f1480
            boolean r5 = r5 instanceof androidx.compose.foundation.gestures.C0526
            if (r5 == 0) goto Lb
            goto L4b
        Lb:
            androidx.compose.foundation.gestures.Orientation r5 = r2.f1489
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Horizontal
            r1 = 0
            if (r5 != r0) goto L18
            r5 = 1
        L13:
            long r3 = p205.C7902.m13352(r3, r1, r1, r5)
            goto L1a
        L18:
            r5 = 2
            goto L13
        L1a:
            androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1 r5 = new androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1
            r0 = 0
            r5.<init>(r2, r0)
            androidx.compose.foundation.飘花落叶言子苏兰楪世哲 r0 = r2.f1491
            if (r0 == 0) goto L3d
            androidx.compose.foundation.gestures.飘花落叶言子哲苏世楪兰 r1 = r2.f1492
            boolean r1 = r1.mo1287()
            if (r1 != 0) goto L34
            androidx.compose.foundation.gestures.飘花落叶言子哲苏世楪兰 r2 = r2.f1492
            boolean r2 = r2.mo1288()
            if (r2 == 0) goto L3d
        L34:
            java.lang.Object r2 = r0.mo1958(r3, r5, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r2 != r3) goto L4b
            return r2
        L3d:
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r2 = new 飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世
            r2.<init>(r3)
            java.lang.Object r2 = r5.invoke(r2, r6)
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r2 != r3) goto L4b
            return r2
        L4b:
            kotlin.飘花落叶言子楪兰苏哲世 r2 = kotlin.C5176.f14739
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C0502.m1266(long, boolean, kotlin.coroutines.jvm.internal.SuspendLambda):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1267(long r12, kotlin.coroutines.jvm.internal.ContinuationImpl r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L31
            java.lang.Object r12 = r0.L$0
            kotlin.jvm.internal.Ref$LongRef r12 = (kotlin.jvm.internal.Ref$LongRef) r12
            kotlin.AbstractC5185.m10210(r14)     // Catch: java.lang.Throwable -> L2d
            r6 = r11
            goto L5a
        L2d:
            r0 = move-exception
            r12 = r0
            r6 = r11
            goto L6a
        L31:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r11)
            r11 = 0
            return r11
        L38:
            kotlin.AbstractC5185.m10210(r14)
            kotlin.jvm.internal.Ref$LongRef r7 = new kotlin.jvm.internal.Ref$LongRef
            r7.<init>()
            r7.element = r12
            r11.f1498 = r4
            androidx.compose.foundation.MutatePriority r14 = androidx.compose.foundation.MutatePriority.Default     // Catch: java.lang.Throwable -> L67
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r5 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2     // Catch: java.lang.Throwable -> L67
            r10 = 0
            r6 = r11
            r8 = r12
            r5.<init>(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L64
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L64
            r0.label = r4     // Catch: java.lang.Throwable -> L64
            java.lang.Object r11 = r6.m1262(r14, r5, r0)     // Catch: java.lang.Throwable -> L64
            if (r11 != r1) goto L59
            return r1
        L59:
            r12 = r7
        L5a:
            r6.f1498 = r3
            long r11 = r12.element
            飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世 r13 = new 飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏兰世
            r13.<init>(r11)
            return r13
        L64:
            r0 = move-exception
        L65:
            r12 = r0
            goto L6a
        L67:
            r0 = move-exception
            r6 = r11
            goto L65
        L6a:
            r6.f1498 = r3
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C0502.m1267(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long m1268(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.f1489 == Orientation.Horizontal) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float m1269(long j) {
        return Float.intBitsToFloat((int) (this.f1489 == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final float m1270(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        Orientation orientation = this.f1489;
        if (dAtan2 >= 0.7853981633974483d) {
            if (orientation == Orientation.Vertical) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (orientation == Orientation.Horizontal) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
