package androidx.compose.runtime;

import androidx.appcompat.app.C0955;
import androidx.collection.C1099;
import androidx.compose.foundation.layout.C1498;
import androidx.compose.runtime.collection.C2059;
import androidx.compose.runtime.internal.C2076;
import androidx.compose.runtime.snapshots.AbstractC2090;
import androidx.compose.runtime.snapshots.AbstractC2091;
import androidx.compose.runtime.snapshots.AbstractC2109;
import androidx.compose.runtime.snapshots.AbstractC2115;
import androidx.compose.runtime.snapshots.AbstractC2121;
import androidx.compose.runtime.snapshots.InterfaceC2092;
import p068.InterfaceC7372;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2197 extends AbstractC2091 implements InterfaceC2168 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C2196 f4286 = new C2196(AbstractC2115.m2840().mo2770());

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC7372 f4287;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C2188 f4288;

    public C2197(InterfaceC7372 interfaceC7372, C2188 c2188) {
        this.f4287 = interfaceC7372;
        this.f4288 = c2188;
    }

    @Override // androidx.compose.runtime.InterfaceC2168
    public final Object getValue() {
        InterfaceC7387 interfaceC7387Mo2763 = AbstractC2115.m2840().mo2763();
        if (interfaceC7387Mo2763 != null) {
            interfaceC7387Mo2763.invoke(this);
        }
        AbstractC2121 abstractC2121M2840 = AbstractC2115.m2840();
        return m3001((C2196) AbstractC2115.m2839(this.f4286, abstractC2121M2840), abstractC2121M2840, true, this.f4287).f4281;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        C2196 c2196 = (C2196) AbstractC2115.m2835(this.f4286);
        sb.append(c2196.m3000(this, AbstractC2115.m2840()) ? String.valueOf(c2196.f4281) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC2092
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final AbstractC2090 mo2753() {
        return this.f4286;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC2092
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2754(AbstractC2090 abstractC2090) {
        this.f4286 = (C2196) abstractC2090;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2196 m3001(C2196 c2196, AbstractC2121 abstractC2121, boolean z, InterfaceC7372 interfaceC7372) {
        C2059 c2059M3055;
        C2196 c21962;
        C2188 c2188;
        int i;
        if (c2196.m3000(this, abstractC2121)) {
            if (z) {
                c2059M3055 = AbstractC2202.m3055();
                Object[] objArr = c2059M3055.f3866;
                int i2 = c2059M3055.f3865;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((C2148) objArr[i3]).m2870();
                }
                try {
                    C1099 c1099 = c2196.f4282;
                    C0955 c0955 = AbstractC2170.f4242;
                    C2076 c2076 = (C2076) c0955.m953();
                    if (c2076 == null) {
                        c2076 = new C2076();
                        c0955.m922(c2076);
                    }
                    int i4 = c2076.f3942;
                    Object[] objArr2 = c1099.f1262;
                    int[] iArr = c1099.f1261;
                    long[] jArr = c1099.f1263;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        InterfaceC2092 interfaceC2092 = (InterfaceC2092) objArr2[i9];
                                        i = i6;
                                        c2076.f3942 = i4 + iArr[i9];
                                        InterfaceC7387 interfaceC7387Mo2763 = abstractC2121.mo2763();
                                        if (interfaceC7387Mo2763 != null) {
                                            interfaceC7387Mo2763.invoke(interfaceC2092);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                                if (i5 == length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    c2076.f3942 = i4;
                    Object[] objArr3 = c2059M3055.f3866;
                    int i10 = c2059M3055.f3865;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((C2148) objArr3[i11]).m2871();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c2196;
        }
        C1099 c10992 = new C1099();
        C0955 c09552 = AbstractC2170.f4242;
        C2076 c20762 = (C2076) c09552.m953();
        if (c20762 == null) {
            c20762 = new C2076();
            c09552.m922(c20762);
        }
        int i12 = c20762.f3942;
        c2059M3055 = AbstractC2202.m3055();
        Object[] objArr4 = c2059M3055.f3866;
        int i13 = c2059M3055.f3865;
        for (int i14 = 0; i14 < i13; i14++) {
            ((C2148) objArr4[i14]).m2870();
        }
        try {
            c20762.f3942 = i12 + 1;
            Object objM2801 = AbstractC2109.m2801(new C1498(this, c20762, c10992, i12, 2), interfaceC7372);
            c20762.f3942 = i12;
            Object[] objArr5 = c2059M3055.f3866;
            int i15 = c2059M3055.f3865;
            for (int i16 = 0; i16 < i15; i16++) {
                ((C2148) objArr5[i16]).m2871();
            }
            Object obj = AbstractC2115.f4090;
            synchronized (obj) {
                try {
                    AbstractC2121 abstractC2121M2840 = AbstractC2115.m2840();
                    Object obj2 = c2196.f4281;
                    if (obj2 == C2196.f4280 || (c2188 = this.f4288) == null || !c2188.m2996(objM2801, obj2)) {
                        C2196 c21963 = this.f4286;
                        synchronized (obj) {
                            AbstractC2090 abstractC2090M2830 = AbstractC2115.m2830(c21963, this);
                            abstractC2090M2830.mo2757(c21963);
                            abstractC2090M2830.f3992 = abstractC2121M2840.mo2770();
                            c21962 = (C2196) abstractC2090M2830;
                            c21962.f4282 = c10992;
                            c21962.f4285 = c21962.m2999(this, abstractC2121M2840);
                            c21962.f4281 = objM2801;
                        }
                        return c21962;
                    }
                    c2196.f4282 = c10992;
                    c2196.f4285 = c2196.m2999(this, abstractC2121M2840);
                    c21962 = c2196;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C2076 c20763 = (C2076) AbstractC2170.f4242.m953();
            if (c20763 == null || c20763.f3942 != 0) {
                return c21962;
            }
            AbstractC2115.m2840().mo2769();
            synchronized (obj) {
                AbstractC2121 abstractC2121M28402 = AbstractC2115.m2840();
                c21962.f4284 = abstractC2121M28402.mo2770();
                c21962.f4283 = abstractC2121M28402.mo2783();
                return c21962;
            }
        } finally {
            Object[] objArr6 = c2059M3055.f3866;
            int i17 = c2059M3055.f3865;
            for (int i18 = 0; i18 < i17; i18++) {
                ((C2148) objArr6[i18]).m2871();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C2196 m3002() {
        AbstractC2121 abstractC2121M2840 = AbstractC2115.m2840();
        return m3001((C2196) AbstractC2115.m2839(this.f4286, abstractC2121M2840), abstractC2121M2840, false, this.f4287);
    }
}
