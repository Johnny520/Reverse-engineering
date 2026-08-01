package androidx.compose.runtime;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.compose.foundation.lazy.layout.C1575;
import androidx.window.area.AbstractC3400;
import java.util.ArrayList;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5186;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.InterfaceC5193;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C6276;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2211 implements InterfaceC2139 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1575 f4326 = new C1575();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC2139 f4327;

    public C2211(InterfaceC2139 interfaceC2139) {
        this.f4327 = interfaceC2139;
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final Object fold(Object obj, InterfaceC7383 interfaceC7383) {
        return AbstractC1298.m1727(this, obj, interfaceC7383);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5186 get(InterfaceC5193 interfaceC5193) {
        return AbstractC1298.m1731(this, interfaceC5193);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5192 minusKey(InterfaceC5193 interfaceC5193) {
        return AbstractC1298.m1706(this, interfaceC5193);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5192 plus(InterfaceC5192 interfaceC5192) {
        return AbstractC1298.m1714(interfaceC5192, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.runtime.InterfaceC2139
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo2865(InterfaceC7387 interfaceC7387, InterfaceC5189 interfaceC5189) {
        PausableMonotonicFrameClock$withFrameNanos$1 pausableMonotonicFrameClock$withFrameNanos$1;
        boolean z;
        Object objM11099;
        if (interfaceC5189 instanceof PausableMonotonicFrameClock$withFrameNanos$1) {
            pausableMonotonicFrameClock$withFrameNanos$1 = (PausableMonotonicFrameClock$withFrameNanos$1) interfaceC5189;
            int i = pausableMonotonicFrameClock$withFrameNanos$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pausableMonotonicFrameClock$withFrameNanos$1.label = i - Integer.MIN_VALUE;
            } else {
                pausableMonotonicFrameClock$withFrameNanos$1 = new PausableMonotonicFrameClock$withFrameNanos$1(this, interfaceC5189);
            }
        }
        Object obj = pausableMonotonicFrameClock$withFrameNanos$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pausableMonotonicFrameClock$withFrameNanos$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            C1575 c1575 = this.f4326;
            pausableMonotonicFrameClock$withFrameNanos$1.L$0 = interfaceC7387;
            pausableMonotonicFrameClock$withFrameNanos$1.label = 1;
            synchronized (c1575.f2416) {
                z = c1575.f2417;
            }
            if (z) {
                objM11099 = C6008.f15084;
            } else {
                C6276 c6276 = new C6276(1, AbstractC3400.m5624(pausableMonotonicFrameClock$withFrameNanos$1));
                c6276.m11102();
                synchronized (c1575.f2416) {
                    ((ArrayList) c1575.f2415).add(c6276);
                }
                c6276.m11100(new C2146(c1575, 0, c6276));
                objM11099 = c6276.m11099();
                if (objM11099 != coroutineSingletons) {
                    objM11099 = C6008.f15084;
                }
            }
            if (objM11099 != coroutineSingletons) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC6017.m10769(obj);
                return obj;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        interfaceC7387 = (InterfaceC7387) pausableMonotonicFrameClock$withFrameNanos$1.L$0;
        AbstractC6017.m10769(obj);
        InterfaceC2139 interfaceC2139 = this.f4327;
        pausableMonotonicFrameClock$withFrameNanos$1.L$0 = null;
        pausableMonotonicFrameClock$withFrameNanos$1.label = 2;
        Object objMo2865 = interfaceC2139.mo2865(interfaceC7387, pausableMonotonicFrameClock$withFrameNanos$1);
        return objMo2865 == coroutineSingletons ? coroutineSingletons : objMo2865;
    }
}
