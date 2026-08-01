package top.yukonga.miuix.kmp.utils;

import androidx.compose.foundation.gestures.InterfaceC1393;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.C6212;
import p221.InterfaceC8725;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.utils.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6896 implements InterfaceC1393, InterfaceC8725 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C6212 f16929;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f16930;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f16931;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC8725 f16932;

    public C6896(InterfaceC8725 interfaceC8725) {
        interfaceC8725.getClass();
        this.f16932 = interfaceC8725;
        this.f16929 = new C6212();
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final float mo1892(float f) {
        return this.f16932.mo1892(f);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final float mo1893(int i) {
        return this.f16932.mo1893(i);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final long mo1894(float f) {
        return this.f16932.mo1894(f);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public final float mo1895(long j) {
        return this.f16932.mo1895(j);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final float mo1816() {
        return this.f16932.mo1816();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m11979(ContinuationImpl continuationImpl) {
        PressGestureScopeImpl$reset$1 pressGestureScopeImpl$reset$1;
        if (continuationImpl instanceof PressGestureScopeImpl$reset$1) {
            pressGestureScopeImpl$reset$1 = (PressGestureScopeImpl$reset$1) continuationImpl;
            int i = pressGestureScopeImpl$reset$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$reset$1.label = i - Integer.MIN_VALUE;
            } else {
                pressGestureScopeImpl$reset$1 = new PressGestureScopeImpl$reset$1(this, continuationImpl);
            }
        }
        Object obj = pressGestureScopeImpl$reset$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pressGestureScopeImpl$reset$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            pressGestureScopeImpl$reset$1.label = 1;
            if (this.f16929.m10986(pressGestureScopeImpl$reset$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        this.f16930 = false;
        this.f16931 = false;
        return C6008.f15084;
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final long mo1899(long j) {
        return this.f16932.mo1899(j);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final long mo1900(float f) {
        return this.f16932.mo1900(f);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final float mo1901(long j) {
        return this.f16932.mo1901(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.InterfaceC1393
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1891(ContinuationImpl continuationImpl) {
        PressGestureScopeImpl$tryAwaitRelease$1 pressGestureScopeImpl$tryAwaitRelease$1;
        if (continuationImpl instanceof PressGestureScopeImpl$tryAwaitRelease$1) {
            pressGestureScopeImpl$tryAwaitRelease$1 = (PressGestureScopeImpl$tryAwaitRelease$1) continuationImpl;
            int i = pressGestureScopeImpl$tryAwaitRelease$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pressGestureScopeImpl$tryAwaitRelease$1.label = i - Integer.MIN_VALUE;
            } else {
                pressGestureScopeImpl$tryAwaitRelease$1 = new PressGestureScopeImpl$tryAwaitRelease$1(this, continuationImpl);
            }
        }
        Object obj = pressGestureScopeImpl$tryAwaitRelease$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pressGestureScopeImpl$tryAwaitRelease$1.label;
        C6212 c6212 = this.f16929;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            if (!this.f16930 && !this.f16931) {
                pressGestureScopeImpl$tryAwaitRelease$1.label = 1;
                if (c6212.m10986(pressGestureScopeImpl$tryAwaitRelease$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return Boolean.valueOf(this.f16930);
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        c6212.m10991(null);
        return Boolean.valueOf(this.f16930);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final long mo1902(long j) {
        return this.f16932.mo1902(j);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final int mo1903(float f) {
        return this.f16932.mo1903(f);
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final float mo1817() {
        return this.f16932.mo1817();
    }

    @Override // p221.InterfaceC8725
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public final float mo1904(float f) {
        return this.f16932.mo1904(f);
    }
}
