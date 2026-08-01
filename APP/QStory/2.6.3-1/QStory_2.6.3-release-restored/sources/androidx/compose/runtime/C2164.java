package androidx.compose.runtime;

import androidx.collection.C1082;
import androidx.compose.runtime.snapshots.AbstractC2115;
import androidx.compose.runtime.snapshots.AbstractC2121;
import java.util.ArrayList;
import kotlinx.coroutines.channels.InterfaceC6032;
import kotlinx.coroutines.channels.InterfaceC6039;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2164 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC2167 f4231;

    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2959(InterfaceC6039 interfaceC6039, InterfaceC7372 interfaceC7372) {
        C2165 c2165;
        InterfaceC6032 interfaceC6032;
        int i;
        if (this.f4231 == null) {
            AbstractC2227.m3097("Called runAndWatch on a manager that has been disposed of");
        }
        AbstractC2167 abstractC2167 = this.f4231;
        if ((abstractC2167 instanceof C2165) && (interfaceC6032 = (c2165 = (C2165) abstractC2167).f4235) != null && !interfaceC6032.equals(interfaceC6039)) {
            C2228 c2228 = new C2228();
            InterfaceC6032 interfaceC60322 = c2165.f4235;
            if (interfaceC60322 == null) {
                AbstractC2227.m3097("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            C1082 c1082 = c2165.f4233;
            ArrayList arrayList = c2228.f4401;
            if (c1082 == null) {
                Object obj = c2165.f4237;
                obj.getClass();
                arrayList.add(new C2136(obj, interfaceC60322));
            } else {
                Object[] objArr = c1082.f1345;
                long[] jArr = c1082.f1346;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8;
                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                            int i5 = 0;
                            while (i5 < i4) {
                                if ((j & 255) < 128) {
                                    i = i3;
                                    arrayList.add(new C2136(objArr[(i2 << 3) + i5], interfaceC60322));
                                } else {
                                    i = i3;
                                }
                                j >>= i;
                                i5++;
                                i3 = i;
                            }
                            if (i4 != i3) {
                                break;
                            }
                            if (i2 == length) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
            c2228.mo2964();
            c2165.mo2963();
            this.f4231 = c2228;
        }
        AbstractC2167 abstractC21672 = this.f4231;
        abstractC21672.getClass();
        AbstractC2121 abstractC2121Mo2766 = AbstractC2115.m2840().mo2766(abstractC21672.mo2961(interfaceC6039));
        abstractC21672.mo2962(interfaceC6039);
        try {
            AbstractC2121 abstractC2121M2847 = abstractC2121Mo2766.m2847();
            try {
                Object objInvoke = interfaceC7372.invoke();
                abstractC2121Mo2766.mo2765();
                abstractC21672.mo2964();
                return objInvoke;
            } finally {
                AbstractC2121.m2844(abstractC2121M2847);
            }
        } catch (Throwable th) {
            abstractC2121Mo2766.mo2765();
            throw th;
        }
    }
}
