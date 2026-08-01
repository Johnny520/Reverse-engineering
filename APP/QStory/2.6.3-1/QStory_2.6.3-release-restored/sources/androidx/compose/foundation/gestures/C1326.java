package androidx.compose.foundation.gestures;

import androidx.appcompat.app.C0955;
import androidx.appcompat.app.C0960;
import androidx.compose.animation.core.C1177;
import androidx.compose.animation.core.C1191;
import androidx.compose.animation.core.C1193;
import androidx.compose.foundation.lazy.layout.InterfaceC1530;
import androidx.compose.material3.C2008;
import androidx.compose.p001ui.graphics.C2442;
import androidx.compose.p001ui.graphics.C2445;
import androidx.compose.p001ui.graphics.drawscope.C2342;
import androidx.compose.p001ui.graphics.drawscope.InterfaceC2341;
import androidx.compose.p001ui.layout.AbstractC2543;
import androidx.compose.p001ui.layout.AbstractC2559;
import androidx.compose.p001ui.node.C2593;
import androidx.compose.runtime.AbstractC2182;
import kotlin.C6008;
import kotlin.jvm.internal.Ref$FloatRef;
import p068.InterfaceC7387;
import p069.AbstractC7390;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1326 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ Object f1800;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ float f1801;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f1802;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1803;

    public /* synthetic */ C1326(C1328 c1328, float f, InterfaceC7387 interfaceC7387) {
        this.f1803 = 0;
        this.f1802 = c1328;
        this.f1801 = f;
        this.f1800 = interfaceC7387;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b A[PHI: r0
  0x008b: PHI (r0v20 float) = (r0v19 float), (r0v27 float) binds: [B:26:0x00a1, B:20:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p068.InterfaceC7387
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        float fFloatValue;
        int i = this.f1803;
        float f = 0.0f;
        C6008 c6008 = C6008.f15084;
        float f2 = this.f1801;
        Object obj2 = this.f1800;
        Object obj3 = this.f1802;
        switch (i) {
            case 0:
                C1328 c1328 = (C1328) obj3;
                InterfaceC7387 interfaceC7387 = (InterfaceC7387) obj2;
                long jLongValue = ((Long) obj).longValue();
                if (c1328.f1811 == Long.MIN_VALUE) {
                    c1328.f1811 = jLongValue;
                }
                float f3 = c1328.f1808;
                C1193 c1193 = new C1193(f3);
                C1193 c11932 = C1328.f1807;
                long jMo998 = f2 == 0.0f ? c1328.f1812.mo998(new C1193(f3), c11932, c1328.f1810) : AbstractC7390.m12616((jLongValue - c1328.f1811) / f2);
                float f4 = ((C1193) c1328.f1812.mo1003(jMo998, c1193, c11932, c1328.f1810)).f1538;
                c1328.f1810 = (C1193) c1328.f1812.mo1006(jMo998, c1193, c11932, c1328.f1810);
                c1328.f1811 = jLongValue;
                float f5 = c1328.f1808 - f4;
                c1328.f1808 = f4;
                interfaceC7387.invoke(Float.valueOf(f5));
                return c6008;
            case 1:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj3;
                InterfaceC1530 interfaceC1530 = (InterfaceC1530) obj2;
                C1191 c1191 = (C1191) obj;
                if (f2 > 0.0f) {
                    fFloatValue = ((Number) ((AbstractC2182) c1191.f1528).getValue()).floatValue();
                    f = fFloatValue > f2 ? f2 : fFloatValue;
                } else if (f2 < 0.0f) {
                    fFloatValue = ((Number) ((AbstractC2182) c1191.f1528).getValue()).floatValue();
                    if (fFloatValue < f2) {
                    }
                }
                float f6 = f - ref$FloatRef.element;
                if (f6 != interfaceC1530.mo1811(f6) || f != ((Number) ((AbstractC2182) c1191.f1528).getValue()).floatValue()) {
                    c1191.m1606();
                }
                ref$FloatRef.element += f6;
                return c6008;
            case 2:
                C2445 c2445 = (C2445) obj3;
                C2442 c2442 = (C2442) obj2;
                C2593 c2593 = (C2593) ((InterfaceC2341) obj);
                c2593.m3871();
                C2342 c2342 = c2593.f5521;
                C0955 c0955 = c2342.f4629;
                long jM928 = c0955.m928();
                c0955.m946().mo3237();
                try {
                    C0960 c0960 = (C0960) c0955.f664;
                    c0960.m991(f2, 0.0f);
                    c0960.m994(45.0f, 0L);
                    c2342.m3273(c2445, c2442);
                    return c6008;
                } finally {
                    c0955.m946().mo3249();
                    c0955.m921(jM928);
                }
            default:
                AbstractC2559 abstractC2559 = (AbstractC2559) obj3;
                AbstractC2543 abstractC2543 = (AbstractC2543) obj;
                C1177 c1177 = ((C2008) obj2).f3723;
                AbstractC2543.m3692(abstractC2543, abstractC2559, c1177 != null ? (int) ((Number) c1177.m1593()).floatValue() : (int) f2, 0);
                return c6008;
        }
    }

    public /* synthetic */ C1326(float f, Object obj, Object obj2, int i) {
        this.f1803 = i;
        this.f1801 = f;
        this.f1802 = obj;
        this.f1800 = obj2;
    }

    public /* synthetic */ C1326(AbstractC2559 abstractC2559, C2008 c2008, float f) {
        this.f1803 = 3;
        this.f1802 = abstractC2559;
        this.f1800 = c2008;
        this.f1801 = f;
    }
}
