package top.yukonga.miuix.kmp.basic;

import androidx.compose.animation.core.C1145;
import androidx.compose.animation.core.InterfaceC1180;
import androidx.compose.p001ui.input.nestedscroll.InterfaceC2455;
import androidx.compose.runtime.AbstractC2184;
import kotlin.AbstractC6017;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p128.C8158;
import p221.C8731;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6852 implements InterfaceC2455 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C6856 f16790;

    public C6852(C6856 c6856) {
        this.f16790 = c6856;
    }

    @Override // androidx.compose.p001ui.input.nestedscroll.InterfaceC2455
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final long mo3546(int i, long j) {
        C6856 c6856 = this.f16790;
        C6864 c6864 = c6856.f16802;
        if (!((Boolean) c6856.f16799.invoke()).booleanValue()) {
            return 0L;
        }
        int i2 = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i2) > 0.0f) {
            return 0L;
        }
        float fM11954 = c6864.m11954();
        c6864.m11953(Float.intBitsToFloat(i2) + c6864.m11954());
        if (fM11954 == c6864.m11954()) {
            return 0L;
        }
        return C8158.m13089(j, 0.0f, 2);
    }

    @Override // androidx.compose.p001ui.input.nestedscroll.InterfaceC2455
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰 */
    public final long mo1814(long j, long j2, int i) {
        C6856 c6856 = this.f16790;
        C6864 c6864 = c6856.f16802;
        if (!((Boolean) c6856.f16799.invoke()).booleanValue()) {
            return 0L;
        }
        int i2 = (int) (j & 4294967295L);
        ((AbstractC2184) c6864.f16828).m2995(Float.intBitsToFloat(i2) + ((AbstractC2184) c6864.f16828).m2994());
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i3) < 0.0f || Float.intBitsToFloat(i2) < 0.0f) {
            float fM11954 = c6864.m11954();
            c6864.m11953(Float.intBitsToFloat(i2) + c6864.m11954());
            return (((long) Float.floatToRawIntBits(c6864.m11954() - fM11954)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
        }
        if (Float.intBitsToFloat(i3) <= 0.0f) {
            return 0L;
        }
        float fM119542 = c6864.m11954();
        c6864.m11953(Float.intBitsToFloat(i3) + c6864.m11954());
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c6864.m11954() - fM119542)) & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // androidx.compose.p001ui.input.nestedscroll.InterfaceC2455
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1815(long j, long j2, ContinuationImpl continuationImpl) {
        C0817x78ae0263 c0817x78ae0263;
        long j3;
        C6856 c6856 = this.f16790;
        C6864 c6864 = c6856.f16802;
        if (continuationImpl instanceof C0817x78ae0263) {
            c0817x78ae0263 = (C0817x78ae0263) continuationImpl;
            int i = c0817x78ae0263.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0817x78ae0263.label = i - Integer.MIN_VALUE;
            } else {
                c0817x78ae0263 = new C0817x78ae0263(this, continuationImpl);
            }
        }
        C0817x78ae0263 c0817x78ae02632 = c0817x78ae0263;
        Object objMo1815 = c0817x78ae02632.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = c0817x78ae02632.label;
        if (i2 == 0) {
            AbstractC6017.m10769(objMo1815);
            if (C8731.m13909(j2) > 0.0f) {
                ((AbstractC2184) c6864.f16828).m2995(0.0f);
            }
            c0817x78ae02632.J$0 = j;
            c0817x78ae02632.J$1 = j2;
            c0817x78ae02632.label = 1;
            objMo1815 = super.mo1815(j, j2, c0817x78ae02632);
            if (objMo1815 != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j3 = c0817x78ae02632.J$3;
            AbstractC6017.m10769(objMo1815);
            return new C8731(C8731.m13907(j3, ((C8731) objMo1815).f22216));
        }
        j2 = c0817x78ae02632.J$1;
        j = c0817x78ae02632.J$0;
        AbstractC6017.m10769(objMo1815);
        long j4 = ((C8731) objMo1815).f22216;
        float fM13909 = C8731.m13909(j2);
        InterfaceC1180 interfaceC1180 = c6856.f16800;
        C1145 c1145 = c6856.f16801;
        c0817x78ae02632.J$0 = j;
        c0817x78ae02632.J$1 = j2;
        c0817x78ae02632.J$2 = j4;
        c0817x78ae02632.J$3 = j4;
        c0817x78ae02632.label = 2;
        objMo1815 = AbstractC6862.m11950(c6864, fM13909, interfaceC1180, c1145, c0817x78ae02632);
        if (objMo1815 != obj) {
            j3 = j4;
            return new C8731(C8731.m13907(j3, ((C8731) objMo1815).f22216));
        }
        return obj;
    }
}
