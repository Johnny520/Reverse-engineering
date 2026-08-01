package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1193;
import androidx.compose.animation.core.InterfaceC1195;
import androidx.compose.animation.core.InterfaceC1206;
import androidx.compose.p001ui.C2952;
import androidx.compose.p001ui.InterfaceC2959;
import androidx.compose.runtime.AbstractC2202;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p192.AbstractC8570;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1328 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C1193 f1807 = new C1193(0.0f);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public float f1808;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f1809;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1206 f1812;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f1811 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C1193 f1810 = f1807;

    public C1328(InterfaceC1195 interfaceC1195) {
        this.f1812 = interfaceC1195.mo1487(AbstractC1176.f1468);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d2, code lost:
    
        if (androidx.compose.runtime.AbstractC2202.m3052(r4.getContext()).mo2865(r9, r4) == r3) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: all -> 0x003a, PHI: r0 r2 r4 r13
  0x007f: PHI (r0v16 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世) = (r0v9 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世), (r0v17 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世) binds: [B:29:0x0077, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
  0x007f: PHI (r2v5 飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰) = (r2v3 飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰), (r2v6 飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰) binds: [B:29:0x0077, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
  0x007f: PHI (r4v4 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) = 
  (r4v2 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
  (r4v5 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
 binds: [B:29:0x0077, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
  0x007f: PHI (r13v1 float) = (r13v0 float), (r13v2 float) binds: [B:29:0x0077, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d5, B:20:0x004d, B:36:0x00a9, B:30:0x007f, B:33:0x008d, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d5, B:20:0x004d, B:36:0x00a9, B:30:0x007f, B:33:0x008d, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0 A[Catch: all -> 0x003a, PHI: r0 r2 r4
  0x00b0: PHI (r0v12 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世) = (r0v16 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世), (r0v17 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世) binds: [B:32:0x008c, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r2v4 飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰) = (r2v5 飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰), (r2v6 飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰) binds: [B:32:0x008c, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r4v3 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) = 
  (r4v4 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
  (r4v5 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
 binds: [B:32:0x008c, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d5, B:20:0x004d, B:36:0x00a9, B:30:0x007f, B:33:0x008d, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d5, B:20:0x004d, B:36:0x00a9, B:30:0x007f, B:33:0x008d, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a6 -> B:36:0x00a9). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1812(C1374 c1374, C1366 c1366, ContinuationImpl continuationImpl) {
        UpdatableAnimationState$animateToZero$1 updatableAnimationState$animateToZero$1;
        float f;
        UpdatableAnimationState$animateToZero$1 updatableAnimationState$animateToZero$12;
        InterfaceC7387 interfaceC7387;
        InterfaceC7372 interfaceC7372;
        if (continuationImpl instanceof UpdatableAnimationState$animateToZero$1) {
            updatableAnimationState$animateToZero$1 = (UpdatableAnimationState$animateToZero$1) continuationImpl;
            int i = updatableAnimationState$animateToZero$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updatableAnimationState$animateToZero$1.label = i - Integer.MIN_VALUE;
            } else {
                updatableAnimationState$animateToZero$1 = new UpdatableAnimationState$animateToZero$1(this, continuationImpl);
            }
        }
        Object obj = updatableAnimationState$animateToZero$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = updatableAnimationState$animateToZero$1.label;
        C1193 c1193 = f1807;
        int i3 = 2;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    interfaceC7372 = (InterfaceC7372) updatableAnimationState$animateToZero$1.L$0;
                    AbstractC6017.m10769(obj);
                    interfaceC7372.invoke();
                    this.f1811 = Long.MIN_VALUE;
                    this.f1810 = c1193;
                    this.f1809 = false;
                    return C6008.f15084;
                }
                float f2 = updatableAnimationState$animateToZero$1.F$0;
                InterfaceC7372 interfaceC73722 = (InterfaceC7372) updatableAnimationState$animateToZero$1.L$1;
                InterfaceC7387 interfaceC73872 = (InterfaceC7387) updatableAnimationState$animateToZero$1.L$0;
                AbstractC6017.m10769(obj);
                updatableAnimationState$animateToZero$12 = updatableAnimationState$animateToZero$1;
                interfaceC7372 = interfaceC73722;
                f = f2;
                interfaceC7387 = interfaceC73872;
                interfaceC7372.invoke();
                if (f != 0.0f) {
                    if (Math.abs(this.f1808) == 0.0f) {
                        C1357 c1357 = new C1357(this, i3, interfaceC7387);
                        updatableAnimationState$animateToZero$12.L$0 = interfaceC7372;
                        updatableAnimationState$animateToZero$12.L$1 = null;
                        updatableAnimationState$animateToZero$12.label = 2;
                    }
                } else if (Math.abs(this.f1808) < 0.01f) {
                    C1326 c1326 = new C1326(this, f, interfaceC7387);
                    updatableAnimationState$animateToZero$12.L$0 = interfaceC7387;
                    updatableAnimationState$animateToZero$12.L$1 = interfaceC7372;
                    updatableAnimationState$animateToZero$12.F$0 = f;
                    updatableAnimationState$animateToZero$12.label = 1;
                    if (AbstractC2202.m3052(updatableAnimationState$animateToZero$12.getContext()).mo2865(c1326, updatableAnimationState$animateToZero$12) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC7372.invoke();
                    if (f != 0.0f) {
                    }
                } else if (Math.abs(this.f1808) == 0.0f) {
                }
                this.f1811 = Long.MIN_VALUE;
                this.f1810 = c1193;
                this.f1809 = false;
                return C6008.f15084;
            }
            AbstractC6017.m10769(obj);
            if (this.f1809) {
                AbstractC8570.m13654("animateToZero called while previous animation is running");
            }
            InterfaceC2959 interfaceC2959 = (InterfaceC2959) updatableAnimationState$animateToZero$1.getContext().get(C2952.f6608);
            float fMo1846 = interfaceC2959 != null ? interfaceC2959.mo1846() : 1.0f;
            this.f1809 = true;
            f = fMo1846;
            updatableAnimationState$animateToZero$12 = updatableAnimationState$animateToZero$1;
            interfaceC7387 = c1374;
            interfaceC7372 = c1366;
            if (Math.abs(this.f1808) < 0.01f) {
            }
        } catch (Throwable th) {
            this.f1811 = Long.MIN_VALUE;
            this.f1810 = c1193;
            this.f1809 = false;
            throw th;
        }
    }
}
