package androidx.compose.foundation.gestures;

import android.view.ViewTreeObserver;
import androidx.compose.foundation.InterfaceC1922;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.p001ui.input.nestedscroll.C2454;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import java.lang.reflect.Method;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p068.InterfaceC7383;
import p128.C8158;
import p221.C8731;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1343 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C2454 f1832;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public boolean f1833;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Orientation f1834;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC1401 f1835;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC1922 f1836;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC1354 f1837;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C1336 f1839;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C1358 f1840;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean f1843;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f1844 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public InterfaceC1348 f1841 = AbstractC1339.f1824;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C1356 f1842 = new C1356(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C1351 f1838 = new C1351(this, 3);

    public C1343(InterfaceC1354 interfaceC1354, InterfaceC1922 interfaceC1922, InterfaceC1401 interfaceC1401, Orientation orientation, boolean z, C2454 c2454, C1358 c1358, C1336 c1336) {
        this.f1837 = interfaceC1354;
        this.f1836 = interfaceC1922;
        this.f1835 = interfaceC1401;
        this.f1834 = orientation;
        this.f1833 = z;
        this.f1832 = c2454;
        this.f1840 = c1358;
        this.f1839 = c1336;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m1822(MutatePriority mutatePriority, InterfaceC7383 interfaceC7383, ContinuationImpl continuationImpl) {
        Object objMo1809 = this.f1837.mo1809(mutatePriority, new ScrollingLogic$scroll$2(this, interfaceC7383, null), continuationImpl);
        return objMo1809 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo1809 : C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long m1823(long j) {
        return this.f1833 ? C8158.m13091(-1.0f, j) : j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float m1824(float f) {
        return this.f1833 ? f * (-1.0f) : f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long m1825(InterfaceC1348 interfaceC1348, long j, int i) {
        long jM3552 = this.f1832.m3552(i, j);
        long jM13085 = C8158.m13085(j, jM3552);
        long jM1823 = m1823(m1828(interfaceC1348.mo1811(m1829(m1823(this.f1834 == Orientation.Horizontal ? C8158.m13089(jM13085, 0.0f, 1) : C8158.m13089(jM13085, 0.0f, 2))))));
        C1358 c1358 = this.f1840;
        if (c1358.f6624) {
            ViewTreeObserver viewTreeObserver = ((ViewTreeObserverOnGlobalLayoutListenerC2719) AbstractC2620.m3907(c1358)).getViewTreeObserver();
            try {
                if (ViewTreeObserverOnGlobalLayoutListenerC2719.f5762 == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    ViewTreeObserverOnGlobalLayoutListenerC2719.f5762 = declaredMethod;
                }
                Method method = ViewTreeObserverOnGlobalLayoutListenerC2719.f5762;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }
        return C8158.m13084(C8158.m13084(jM3552, jM1823), this.f1832.m3554(jM1823, C8158.m13085(jM13085, jM1823), i));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1826(long j, boolean z, SuspendLambda suspendLambda) {
        if (z) {
            InterfaceC1401 interfaceC1401 = this.f1835;
            C1361 c1361 = AbstractC1339.f1825;
            if (!(interfaceC1401 instanceof C1367)) {
                long jM13911 = C8731.m13911(j, 0.0f, 0.0f, this.f1834 == Orientation.Horizontal ? 1 : 2);
                ScrollingLogic$onScrollStopped$performFling$1 scrollingLogic$onScrollStopped$performFling$1 = new ScrollingLogic$onScrollStopped$performFling$1(this, null);
                InterfaceC1922 interfaceC1922 = this.f1836;
                if (interfaceC1922 == null || !(this.f1837.mo1847() || this.f1837.mo1848())) {
                    Object objInvoke = scrollingLogic$onScrollStopped$performFling$1.invoke(new C8731(jM13911), suspendLambda);
                    if (objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objInvoke;
                    }
                } else {
                    Object objMo2518 = interfaceC1922.mo2518(jM13911, scrollingLogic$onScrollStopped$performFling$1, suspendLambda);
                    if (objMo2518 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objMo2518;
                    }
                }
            }
        }
        return C6008.f15084;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1827(long j, ContinuationImpl continuationImpl) throws Throwable {
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$1;
        C1343 c1343;
        Throwable th;
        Ref$LongRef ref$LongRef;
        if (continuationImpl instanceof ScrollingLogic$doFlingAnimation$1) {
            scrollingLogic$doFlingAnimation$1 = (ScrollingLogic$doFlingAnimation$1) continuationImpl;
            int i = scrollingLogic$doFlingAnimation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                scrollingLogic$doFlingAnimation$1.label = i - Integer.MIN_VALUE;
            } else {
                scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, continuationImpl);
            }
        }
        Object obj = scrollingLogic$doFlingAnimation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = scrollingLogic$doFlingAnimation$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$LongRef = (Ref$LongRef) scrollingLogic$doFlingAnimation$1.L$0;
            try {
                AbstractC6017.m10769(obj);
                c1343 = this;
                c1343.f1843 = false;
                return new C8731(ref$LongRef.element);
            } catch (Throwable th2) {
                th = th2;
                c1343 = this;
                c1343.f1843 = false;
                throw th;
            }
        }
        AbstractC6017.m10769(obj);
        Ref$LongRef ref$LongRef2 = new Ref$LongRef();
        ref$LongRef2.element = j;
        this.f1843 = true;
        try {
            MutatePriority mutatePriority = MutatePriority.Default;
            c1343 = this;
            try {
                ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(c1343, ref$LongRef2, j, null);
                scrollingLogic$doFlingAnimation$1.L$0 = ref$LongRef2;
                scrollingLogic$doFlingAnimation$1.label = 1;
                if (c1343.m1822(mutatePriority, scrollingLogic$doFlingAnimation$2, scrollingLogic$doFlingAnimation$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$LongRef = ref$LongRef2;
                c1343.f1843 = false;
                return new C8731(ref$LongRef.element);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                c1343.f1843 = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            c1343 = this;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long m1828(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.f1834 == Orientation.Horizontal) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final float m1829(long j) {
        return Float.intBitsToFloat((int) (this.f1834 == Orientation.Horizontal ? j >> 32 : j & 4294967295L));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final float m1830(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        Orientation orientation = this.f1834;
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
