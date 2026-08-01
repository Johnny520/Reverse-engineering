package androidx.compose.runtime;

import android.os.Trace;
import androidx.appcompat.app.C0960;
import androidx.collection.AbstractC1132;
import androidx.collection.AbstractC1133;
import androidx.collection.C1082;
import androidx.collection.C1083;
import androidx.collection.C1084;
import androidx.collection.C1091;
import androidx.collection.C1093;
import androidx.collection.C1095;
import androidx.collection.C1099;
import androidx.compose.foundation.C1886;
import androidx.compose.foundation.lazy.C1596;
import androidx.compose.p001ui.node.C2613;
import androidx.compose.runtime.collection.C2059;
import androidx.compose.runtime.collection.C2060;
import androidx.compose.runtime.composer.gapbuffer.AbstractC2073;
import androidx.compose.runtime.composer.gapbuffer.C2062;
import androidx.compose.runtime.composer.gapbuffer.C2065;
import androidx.compose.runtime.composer.gapbuffer.C2068;
import androidx.compose.runtime.composer.gapbuffer.C2069;
import androidx.compose.runtime.composer.gapbuffer.C2070;
import androidx.compose.runtime.internal.AbstractC2089;
import androidx.compose.runtime.internal.C2076;
import androidx.compose.runtime.internal.C2077;
import androidx.compose.runtime.internal.C2088;
import androidx.compose.runtime.snapshots.AbstractC2115;
import androidx.compose.runtime.tooling.AbstractC2126;
import androidx.compose.runtime.tooling.AbstractC2133;
import androidx.compose.runtime.tooling.C2127;
import androidx.compose.runtime.tooling.C2131;
import androidx.compose.runtime.tooling.C2135;
import androidx.compose.runtime.tooling.InterfaceC2128;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3898;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC5168;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5192;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p025.AbstractC7012;
import p050.AbstractC7176;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p086.AbstractC7729;
import p142.C8252;
import p142.C8253;
import p142.C8254;
import p142.C8256;
import p142.C8258;
import p142.C8260;
import p142.C8262;
import p142.C8263;
import p142.C8264;
import p142.C8265;
import p142.C8266;
import p142.C8268;
import p142.C8269;
import p142.C8270;
import p142.C8271;
import p142.C8272;
import p142.C8273;
import p142.C8274;
import p142.C8275;
import p142.C8277;
import p142.C8278;
import p142.C8279;
import p142.C8280;
import p142.C8281;
import p142.C8282;
import p142.C8286;
import p142.C8288;
import p143.C8289;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2159 implements InterfaceC2208 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public C2158 f4179;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final InterfaceC5192 f4180;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final C2127 f4181;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public long f4182;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f4183;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public C8268 f4184;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public InterfaceC2177 f4185;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public C8270 f4186;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C2088 f4187;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public C2065 f4188;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C8269 f4189;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C2148 f4190;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f4191;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f4192;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f4193;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f4195;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f4196;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C2070 f4197;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C2068 f4198;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C2069 f4199;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f4200;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final ArrayList f4201;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8270 f4202;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8270 f4203;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1084 f4204;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2068 f4205;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC2207 f4206;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2613 f4207;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f4210;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C1093 f4213;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f4215;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f4216;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f4217;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int[] f4218;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C1095 f4219;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C2198 f4220;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0960 f4221;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f4222;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f4223;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C2156 f4225;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f4224 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C2145 f4214 = new C2145();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ArrayList f4209 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C2145 f4208 = new C2145();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C2088 f4212 = C2088.f3986;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C2145 f4211 = new C2145();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f4194 = -1;

    public C2159(C2613 c2613, AbstractC2207 abstractC2207, C2068 c2068, C1084 c1084, C8270 c8270, C8270 c82702, C0960 c0960, C2198 c2198) {
        this.f4207 = c2613;
        this.f4206 = abstractC2207;
        this.f4205 = c2068;
        this.f4204 = c1084;
        this.f4203 = c8270;
        this.f4202 = c82702;
        this.f4221 = c0960;
        this.f4220 = c2198;
        this.f4191 = abstractC2207.mo2872() || abstractC2207.mo2874();
        this.f4190 = new C2148(this, 0);
        this.f4201 = new ArrayList();
        C2069 c2069M2622 = c2068.m2622();
        c2069M2622.m2631();
        this.f4199 = c2069M2622;
        C2068 c20682 = new C2068();
        if (abstractC2207.mo2872()) {
            c20682.m2624();
        }
        if (abstractC2207.mo2874()) {
            c20682.f3884 = new C1093();
        }
        this.f4198 = c20682;
        C2070 c2070M2623 = c20682.m2623();
        c2070M2623.m2674(true);
        this.f4197 = c2070M2623;
        this.f4189 = new C8269(this, c8270);
        C2069 c2069M26222 = this.f4198.m2622();
        try {
            C2065 c2065M2633 = c2069M26222.m2633(0);
            c2069M26222.m2631();
            this.f4188 = c2065M2633;
            this.f4184 = new C8268();
            this.f4181 = new C2127(this);
            InterfaceC5192 interfaceC5192Mo2894 = abstractC2207.mo2894();
            InterfaceC5192 interfaceC5192M2912 = m2912();
            this.f4180 = interfaceC5192Mo2894.plus(interfaceC5192M2912 == null ? EmptyCoroutineContext.INSTANCE : interfaceC5192M2912);
        } catch (Throwable th) {
            c2069M26222.m2631();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final int m2896(C2159 c2159, int i, boolean z, int i2) throws Throwable {
        int i3;
        long[] jArr;
        int i4;
        long[] jArr2;
        int i5;
        int i6;
        C2069 c2069;
        C2069 c20692 = c2159.f4199;
        int i7 = 0;
        if (c20692.m2648(i)) {
            int iM2647 = c20692.m2647(i);
            Object objM2642 = c20692.m2642(c20692.f3899, i);
            if (iM2647 == 206 && AbstractC5227.m9466(objM2642, AbstractC2209.f4320)) {
                Object objM2643 = c20692.m2643(i, 0);
                C2155 c2155 = objM2643 instanceof C2155 ? (C2155) objM2643 : null;
                InterfaceC2174 interfaceC2174 = c2155 != null ? c2155.f4169 : null;
                C2150 c2150 = interfaceC2174 instanceof C2150 ? (C2150) interfaceC2174 : null;
                if (c2150 != null) {
                    C1082 c1082 = c2150.f4163.f4157;
                    Object[] objArr = c1082.f1345;
                    long[] jArr3 = c1082.f1346;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j = jArr3[i8];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8;
                                int i10 = 8 - ((~(i8 - length)) >>> 31);
                                int i11 = i7;
                                while (i11 < i10) {
                                    if ((255 & j) < 128) {
                                        C2159 c21592 = (C2159) objArr[(i8 << 3) + i11];
                                        C2068 c2068 = c21592.f4205;
                                        if (c2068.f3889 <= 0 || (c2068.f3890[1] & 67108864) == 0) {
                                            jArr2 = jArr3;
                                            i5 = i7;
                                            i6 = i9;
                                        } else {
                                            C2198 c2198 = c21592.f4220;
                                            synchronized (c2198.f4304) {
                                                c2198.m3021();
                                                i6 = i9;
                                                C1083 c1083 = c2198.f4292;
                                                c2198.f4292 = AbstractC3887.m7223();
                                                try {
                                                    c2198.f4290.m2949(c1083);
                                                } finally {
                                                }
                                            }
                                            C8270 c8270 = new C8270();
                                            c21592.f4186 = c8270;
                                            C2069 c2069M2622 = c21592.f4205.m2622();
                                            try {
                                                c21592.f4199 = c2069M2622;
                                                C8269 c8269 = c21592.f4189;
                                                C8270 c82702 = c8269.f20489;
                                                try {
                                                    c8269.f20489 = c8270;
                                                    c21592.m2907(0);
                                                    C8269 c82692 = c21592.f4189;
                                                    c82692.m13216();
                                                    jArr2 = jArr3;
                                                    try {
                                                        if (c82692.f20488) {
                                                            c2069 = c2069M2622;
                                                            try {
                                                                c82692.f20489.f20497.m13211(C8254.f20470);
                                                                if (c82692.f20488) {
                                                                    c82692.m13214(false);
                                                                    c82692.m13214(false);
                                                                    c82692.f20489.f20497.m13211(C8278.f20505);
                                                                    i5 = 0;
                                                                    c82692.f20488 = false;
                                                                }
                                                                c8269.f20489 = c82702;
                                                                c2069.m2631();
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                c8269.f20489 = c82702;
                                                                throw th;
                                                            }
                                                        } else {
                                                            c2069 = c2069M2622;
                                                        }
                                                        c8269.f20489 = c82702;
                                                        c2069.m2631();
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        c2069.m2631();
                                                        throw th;
                                                    }
                                                    i5 = 0;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    c2069 = c2069M2622;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                c2069 = c2069M2622;
                                            }
                                        }
                                        c2159.f4206.mo2886(c21592.f4220);
                                    } else {
                                        jArr2 = jArr3;
                                        i5 = i7;
                                        i6 = i9;
                                    }
                                    j >>= i6;
                                    i11++;
                                    i9 = i6;
                                    i7 = i5;
                                    jArr3 = jArr2;
                                }
                                jArr = jArr3;
                                i4 = i7;
                                if (i10 != i9) {
                                    break;
                                }
                            } else {
                                jArr = jArr3;
                                i4 = i7;
                            }
                            if (i8 == length) {
                                break;
                            }
                            i8++;
                            i7 = i4;
                            jArr3 = jArr;
                        }
                    }
                }
                return c20692.m2641(i);
            }
            i3 = 1;
            if (!c20692.m2646(i)) {
                return c20692.m2641(i);
            }
        } else {
            i3 = 1;
            if (c20692.m2630(i)) {
                int i12 = c20692.f3899[(i * 5) + 3] + i;
                int iM2896 = 0;
                for (int i13 = i + 1; i13 < i12; i13 += c20692.f3899[(i13 * 5) + 3]) {
                    boolean zM2646 = c20692.m2646(i13);
                    if (zM2646) {
                        c2159.f4189.m13215();
                        C8269 c82693 = c2159.f4189;
                        Object objM2637 = c20692.m2637(i13);
                        c82693.m13215();
                        c82693.f20491.add(objM2637);
                    }
                    iM2896 += m2896(c2159, i13, zM2646 || z, zM2646 ? 0 : i2 + iM2896);
                    if (zM2646) {
                        c2159.f4189.m13215();
                        c2159.f4189.m13217();
                    }
                }
                if (!c20692.m2646(i)) {
                    return iM2896;
                }
            } else if (!c20692.m2646(i)) {
                return c20692.m2641(i);
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m2897(int i, C2214 c2214) {
        m2902(i, 0, c2214, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m2898(Object obj, boolean z) {
        if (z) {
            C2069 c2069 = this.f4199;
            if (c2069.f3905 <= 0) {
                if ((c2069.f3899[(c2069.f3904 * 5) + 1] & 1073741824) == 0) {
                    AbstractC2227.m3098("Expected a node group");
                }
                c2069.m2636();
                return;
            }
            return;
        }
        if (obj != null && this.f4199.m2628() != obj) {
            C8269 c8269 = this.f4189;
            c8269.getClass();
            c8269.m13214(false);
            C8252 c8252 = c8269.f20489.f20497;
            c8252.m13211(C8263.f20478);
            AbstractC5754.m10425(c8252, 0, obj);
        }
        this.f4199.m2636();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m2899() {
        if (this.f4223 != 0) {
            AbstractC2209.m3067("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.f4183) {
            return;
        }
        C2224 c2224M2929 = m2929();
        if (c2224M2929 != null) {
            int i = c2224M2929.f4381;
            if ((i & 128) == 0) {
                c2224M2929.f4381 = i | 16;
            }
        }
        if (this.f4209.isEmpty()) {
            m2900();
        } else {
            m2916();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m2900() {
        C2069 c2069 = this.f4199;
        int i = c2069.f3907;
        this.f4223 = i >= 0 ? c2069.f3899[(i * 5) + 1] & 67108863 : 0;
        c2069.m2634();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m2901() {
        m2902(-127, 0, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2902(int i, int i2, Object obj, Object obj2) {
        long jRotateLeft;
        boolean z;
        C2156 c2156;
        int i3;
        int i4;
        Object[] objArr;
        Object[] objArr2;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        Object obj3 = obj;
        if (this.f4217) {
            AbstractC2209.m3067("A call to createNode(), emitNode() or useNode() expected");
        }
        int i9 = this.f4215;
        Object obj4 = C2204.f4319;
        if (obj3 != null) {
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f4182, 3) ^ ((long) (obj3 instanceof Enum ? ((Enum) obj3).ordinal() : obj3.hashCode())), 3);
        } else {
            if (obj2 != null && i == 207 && !obj2.equals(obj4)) {
                this.f4182 = Long.rotateLeft(Long.rotateLeft(this.f4182, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i9);
                if (obj3 == null) {
                    this.f4215++;
                }
                boolean z3 = i2 == 0;
                if (!this.f4183) {
                    this.f4199.f3905++;
                    C2070 c2070 = this.f4197;
                    int i10 = c2070.f3915;
                    if (z3) {
                        c2070.m2653(i, obj4, obj4, true);
                    } else if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        c2070.m2653(i, obj3, obj2, false);
                    } else {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        c2070.m2653(i, obj3, obj4, false);
                    }
                    C2156 c21562 = this.f4225;
                    if (c21562 != null) {
                        int i11 = (-2) - i10;
                        C2062 c2062 = new C2062(-1, i, i11, -1);
                        c21562.f4171.m1350(i11, new C8289(-1, this.f4222 - c21562.f4174, 0));
                        c21562.f4172.add(c2062);
                    }
                    m2930(z3, null);
                    return;
                }
                boolean z4 = i2 == 1 && this.f4195;
                if (this.f4225 == null) {
                    int iM2644 = this.f4199.m2644();
                    if (!z4 && iM2644 == i) {
                        C2069 c2069 = this.f4199;
                        int i12 = c2069.f3904;
                        if (AbstractC5227.m9466(obj3, i12 < c2069.f3903 ? c2069.m2642(c2069.f3899, i12) : null)) {
                            m2898(obj2, z3);
                            z = z4;
                        }
                    }
                    C2069 c20692 = this.f4199;
                    int[] iArr = c20692.f3899;
                    ArrayList arrayList = new ArrayList();
                    if (c20692.f3905 <= 0) {
                        int i13 = c20692.f3904;
                        while (i13 < c20692.f3903) {
                            int i14 = i13 * 5;
                            int i15 = iArr[i14];
                            Object objM2642 = c20692.m2642(iArr, i13);
                            int i16 = iArr[i14 + 1];
                            if ((i16 & 1073741824) != 0) {
                                z2 = z4;
                                i8 = 1;
                            } else {
                                z2 = z4;
                                i8 = i16 & 67108863;
                            }
                            arrayList.add(new C2062(objM2642, i15, i13, i8));
                            i13 += iArr[i14 + 3];
                            z4 = z2;
                        }
                    }
                    z = z4;
                    this.f4225 = new C2156(this.f4222, arrayList);
                } else {
                    z = z4;
                }
                C2156 c21563 = this.f4225;
                if (c21563 != null) {
                    ArrayList arrayList2 = c21563.f4172;
                    C1093 c1093 = c21563.f4171;
                    int i17 = c21563.f4174;
                    Object c2147 = obj3 != null ? new C2147(Integer.valueOf(i), obj3) : Integer.valueOf(i);
                    C1083 c1083 = ((C2060) c21563.f4170.getValue()).f3867;
                    Object objM1317 = c1083.m1317(c2147);
                    if (objM1317 == null) {
                        objM1317 = null;
                    } else if (objM1317 instanceof C1091) {
                        C1091 c1091 = (C1091) objM1317;
                        Object objM1337 = c1091.m1337(0);
                        if (c1091.m1439()) {
                            c1083.m1318(c2147);
                        }
                        if (c1091.f1349 == 1) {
                            c1083.m1315(c2147, c1091.m1442());
                        }
                        objM1317 = objM1337;
                    } else {
                        c1083.m1318(c2147);
                    }
                    C2062 c20622 = (C2062) objM1317;
                    if (z || c20622 == null) {
                        this.f4199.f3905++;
                        this.f4183 = true;
                        this.f4187 = null;
                        if (this.f4197.f3917) {
                            C2070 c2070M2623 = this.f4198.m2623();
                            this.f4197 = c2070M2623;
                            c2070M2623.m2661();
                            this.f4196 = false;
                            this.f4187 = null;
                        }
                        this.f4197.m2675();
                        C2070 c20702 = this.f4197;
                        int i18 = c20702.f3915;
                        if (z3) {
                            c20702.m2653(i, obj4, obj4, true);
                            i3 = 0;
                        } else if (obj2 != null) {
                            if (obj != null) {
                                obj4 = obj;
                            }
                            i3 = 0;
                            c20702.m2653(i, obj4, obj2, false);
                        } else {
                            i3 = 0;
                            c20702.m2653(i, obj == null ? obj4 : obj, obj4, false);
                        }
                        this.f4188 = this.f4197.m2677(i18);
                        int i19 = (-2) - i18;
                        C2062 c20623 = new C2062(-1, i, i19, -1);
                        c1093.m1350(i19, new C8289(-1, this.f4222 - i17, i3));
                        arrayList2.add(c20623);
                        c2156 = new C2156(z3 ? i3 : this.f4222, new ArrayList());
                    } else {
                        int i20 = c20622.f3871;
                        arrayList2.add(c20622);
                        C8289 c8289 = (C8289) c1093.m1393(i20);
                        this.f4222 = (c8289 != null ? c8289.f20521 : -1) + i17;
                        C8289 c82892 = (C8289) c1093.m1393(i20);
                        int i21 = c82892 != null ? c82892.f20522 : -1;
                        int i22 = c21563.f4173;
                        int i23 = i21 - i22;
                        int i24 = 8;
                        if (i21 > i22) {
                            Object[] objArr3 = c1093.f1317;
                            long[] jArr = c1093.f1319;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i25 = 0;
                                while (true) {
                                    long j = jArr[i25];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i26 = 8 - ((~(i25 - length)) >>> 31);
                                        int i27 = 0;
                                        while (i27 < i26) {
                                            if ((j & 255) < 128) {
                                                i7 = i24;
                                                C8289 c82893 = (C8289) objArr3[(i25 << 3) + i27];
                                                i6 = i23;
                                                int i28 = c82893.f20522;
                                                if (i28 == i21) {
                                                    c82893.f20522 = i22;
                                                } else if (i22 <= i28 && i28 < i21) {
                                                    c82893.f20522 = i28 + 1;
                                                }
                                            } else {
                                                i6 = i23;
                                                i7 = i24;
                                            }
                                            j >>= i7;
                                            i27++;
                                            i23 = i6;
                                            i24 = i7;
                                        }
                                        i4 = i23;
                                        if (i26 != i24) {
                                            break;
                                        }
                                    } else {
                                        i4 = i23;
                                    }
                                    if (i25 == length) {
                                        break;
                                    }
                                    i25++;
                                    i23 = i4;
                                    i24 = 8;
                                }
                            } else {
                                i4 = i23;
                            }
                        } else {
                            i4 = i23;
                            if (i22 > i21) {
                                Object[] objArr4 = c1093.f1317;
                                long[] jArr2 = c1093.f1319;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i29 = 0;
                                    while (true) {
                                        long j2 = jArr2[i29];
                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                            int i31 = 0;
                                            while (i31 < i30) {
                                                if ((j2 & 255) >= 128) {
                                                    objArr2 = objArr4;
                                                } else {
                                                    C8289 c82894 = (C8289) objArr4[(i29 << 3) + i31];
                                                    int i32 = c82894.f20522;
                                                    if (i32 == i21) {
                                                        c82894.f20522 = i22;
                                                        objArr2 = objArr4;
                                                    } else {
                                                        objArr2 = objArr4;
                                                        if (i21 + 1 <= i32 && i32 < i22) {
                                                            c82894.f20522 = i32 - 1;
                                                        }
                                                    }
                                                }
                                                j2 >>= 8;
                                                i31++;
                                                objArr4 = objArr2;
                                            }
                                            objArr = objArr4;
                                            if (i30 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr4;
                                        }
                                        if (i29 == length2) {
                                            break;
                                        }
                                        i29++;
                                        objArr4 = objArr;
                                    }
                                }
                            }
                        }
                        C8269 c8269 = this.f4189;
                        int i33 = c8269.f20485;
                        C2159 c2159 = c8269.f20490;
                        c8269.f20485 = (i20 - c2159.f4199.f3904) + i33;
                        this.f4199.m2640(i20);
                        if (i4 > 0) {
                            c8269.m13214(false);
                            C2145 c2145 = c8269.f20487;
                            C2069 c20693 = c2159.f4199;
                            if (c20693.f3898 > 0 && c2145.m2869(-2) != (i5 = c20693.f3907)) {
                                if (!c8269.f20488 && c8269.f20486) {
                                    c8269.m13214(false);
                                    c8269.f20489.f20497.m13211(C8279.f20506);
                                    c8269.f20488 = true;
                                }
                                if (i5 > 0) {
                                    C2065 c2065M2633 = c20693.m2633(i5);
                                    c2145.m2867(i5);
                                    c8269.m13214(false);
                                    C8252 c8252 = c8269.f20489.f20497;
                                    c8252.m13211(C8282.f20513);
                                    AbstractC5754.m10425(c8252, 0, c2065M2633);
                                    c8269.f20488 = true;
                                }
                            }
                            C8252 c82522 = c8269.f20489.f20497;
                            c82522.m13211(C8275.f20502);
                            c82522.f20467[c82522.f20464 - c82522.f20468[c82522.f20466 - 1].f18749] = i4;
                        }
                        m2898(obj2, z3);
                        c2156 = null;
                    }
                } else {
                    c2156 = null;
                }
                m2930(z3, c2156);
                return;
            }
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f4182, 3) ^ ((long) i), 3) ^ ((long) i9);
        }
        this.f4182 = jRotateLeft;
        if (obj3 == null) {
        }
        if (i2 == 0) {
        }
        if (!this.f4183) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final boolean m2903(int i, boolean z) {
        C2224 c2224M2929;
        if ((i & 1) == 0 && (this.f4183 || this.f4195)) {
            InterfaceC2177 interfaceC2177 = this.f4185;
            if (interfaceC2177 != null && (c2224M2929 = m2929()) != null && interfaceC2177.mo1412()) {
                int i2 = c2224M2929.f4381;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                c2224M2929.f4381 = i3;
                c2224M2929.f4381 = (this.f4195 ? i2 | 129 : i3 & (-129)) | 256;
                C8252 c8252 = this.f4189.f20489.f20497;
                c8252.m13211(C8274.f20501);
                AbstractC5754.m10425(c8252, 0, c2224M2929);
                this.f4206.mo2885(c2224M2929);
                return false;
            }
        } else if (!z && m2911()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2904() {
        long jRotateLeft;
        if (this.f4209.isEmpty()) {
            this.f4223 = this.f4199.m2635() + this.f4223;
            return;
        }
        C2069 c2069 = this.f4199;
        int iM2644 = c2069.m2644();
        int[] iArr = c2069.f3899;
        int i = c2069.f3904;
        Object objM2642 = i < c2069.f3903 ? c2069.m2642(iArr, i) : null;
        Object objM2628 = c2069.m2628();
        int i2 = this.f4215;
        C2188 c2188 = C2204.f4319;
        if (objM2642 != null) {
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f4182, 3) ^ ((long) (objM2642 instanceof Enum ? ((Enum) objM2642).ordinal() : objM2642.hashCode())), 3);
        } else {
            if (objM2628 != null && iM2644 == 207 && !objM2628.equals(c2188)) {
                this.f4182 = Long.rotateLeft(Long.rotateLeft(this.f4182, 3) ^ ((long) objM2628.hashCode()), 3) ^ ((long) i2);
                m2898(null, (iArr[(c2069.f3904 * 5) + 1] & 1073741824) != 0);
                m2916();
                c2069.m2629();
                if (objM2642 == null) {
                    if (objM2642 instanceof Enum) {
                        this.f4182 = Long.rotateRight(Long.rotateRight(this.f4182, 3) ^ ((long) ((Enum) objM2642).ordinal()), 3);
                        return;
                    } else {
                        this.f4182 = Long.rotateRight(Long.rotateRight(this.f4182, 3) ^ ((long) objM2642.hashCode()), 3);
                        return;
                    }
                }
                if (objM2628 == null || iM2644 != 207 || objM2628.equals(c2188)) {
                    this.f4182 = Long.rotateRight(((long) iM2644) ^ Long.rotateRight(this.f4182 ^ ((long) i2), 3), 3);
                    return;
                } else {
                    this.f4182 = Long.rotateRight(Long.rotateRight(this.f4182 ^ ((long) i2), 3) ^ ((long) objM2628.hashCode()), 3);
                    return;
                }
            }
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.f4182, 3) ^ ((long) iM2644), 3) ^ ((long) i2);
        }
        this.f4182 = jRotateLeft;
        m2898(null, (iArr[(c2069.f3904 * 5) + 1] & 1073741824) != 0);
        m2916();
        c2069.m2629();
        if (objM2642 == null) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final Object m2905() {
        boolean z = this.f4183;
        C2188 c2188 = C2204.f4319;
        if (!z) {
            Object objM2638 = this.f4199.m2638();
            if (!this.f4195 || (objM2638 instanceof C2176)) {
                return objM2638 instanceof C2155 ? ((C2155) objM2638).f4169 : objM2638;
            }
        } else if (this.f4217) {
            AbstractC2209.m3067("A call to createNode(), emitNode() or useNode() expected");
            return c2188;
        }
        return c2188;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2906(int i, int i2, int i3) {
        C2069 c2069 = this.f4199;
        if (i != i2) {
            if (i != i3 && i2 != i3) {
                if (c2069.m2639(i) == i2) {
                    i3 = i2;
                } else if (c2069.m2639(i2) == i) {
                    i3 = i;
                } else if (c2069.m2639(i) == c2069.m2639(i2)) {
                    i3 = c2069.m2639(i);
                } else {
                    int iM2639 = i;
                    int i4 = 0;
                    while (iM2639 > 0 && iM2639 != i3) {
                        iM2639 = c2069.m2639(iM2639);
                        i4++;
                    }
                    int iM26392 = i2;
                    int i5 = 0;
                    while (iM26392 > 0 && iM26392 != i3) {
                        iM26392 = c2069.m2639(iM26392);
                        i5++;
                    }
                    int i6 = i4 - i5;
                    int iM26393 = i;
                    for (int i7 = 0; i7 < i6; i7++) {
                        iM26393 = c2069.m2639(iM26393);
                    }
                    int i8 = i5 - i4;
                    int iM26394 = i2;
                    for (int i9 = 0; i9 < i8; i9++) {
                        iM26394 = c2069.m2639(iM26394);
                    }
                    i3 = iM26393;
                    for (int iM26395 = iM26394; i3 != iM26395; iM26395 = c2069.m2639(iM26395)) {
                        i3 = c2069.m2639(i3);
                    }
                }
            }
        }
        while (i > 0 && i != i3) {
            if (c2069.m2646(i)) {
                this.f4189.m13217();
            }
            i = c2069.m2639(i);
        }
        m2936(i2, i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m2907(int i) throws Throwable {
        boolean zM2646 = this.f4199.m2646(i);
        C8269 c8269 = this.f4189;
        if (zM2646) {
            c8269.m13215();
            Object objM2637 = this.f4199.m2637(i);
            c8269.m13215();
            c8269.f20491.add(objM2637);
        }
        m2896(this, i, zM2646, 0);
        c8269.m13215();
        if (zM2646) {
            c8269.m13217();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final Object m2908() {
        boolean z = this.f4183;
        C2188 c2188 = C2204.f4319;
        if (!z) {
            Object objM2638 = this.f4199.m2638();
            if (!this.f4195 || (objM2638 instanceof C2176)) {
                return objM2638;
            }
        } else if (this.f4217) {
            AbstractC2209.m3067("A call to createNode(), emitNode() or useNode() expected");
            return c2188;
        }
        return c2188;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void m2909(C2088 c2088, Object obj) {
        m2902(126665345, 0, null, null);
        m2908();
        m2945(obj);
        long j = this.f4182;
        try {
            this.f4182 = 126665345L;
            if (this.f4183) {
                C2070.m2649(this.f4197);
            }
            boolean z = (this.f4183 || AbstractC5227.m9466(this.f4199.m2628(), c2088)) ? false : true;
            if (z) {
                m2914(c2088);
            }
            m2902(Opcodes.REM_FLOAT_2ADDR, 0, AbstractC2209.f4322, c2088);
            this.f4187 = null;
            boolean z2 = this.f4210;
            this.f4210 = z;
            AbstractC2089.m2750(this, new C2077(-59194059, true, new C2216(obj, 2)));
            this.f4210 = z2;
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m2910(ArrayList arrayList) {
        C2159 c2159 = this;
        C8270 c8270 = c2159.f4202;
        C8269 c8269 = c2159.f4189;
        C8270 c82702 = c8269.f20489;
        try {
            c8269.f20489 = c8270;
            c8270.f20497.m13211(C8256.f20472);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Pair pair = (Pair) arrayList.get(i);
                AbstractC2140 abstractC2140 = (AbstractC2140) pair.component1();
                abstractC2140.getClass();
                C2065 c2065M7411 = AbstractC3898.m7411(null);
                C2068 c2068M2698 = AbstractC2073.m2698(null);
                int iM2625 = c2068M2698.m2625(c2065M7411);
                C2076 c2076 = new C2076();
                c8269.m13216();
                C8252 c8252 = c8269.f20489.f20497;
                c8252.m13211(C8288.f20519);
                AbstractC5754.m10427(c8252, 0, c2076, 1, c2065M7411);
                if (c2068M2698 == c2159.f4198) {
                    if (!c2159.f4197.f3917) {
                        AbstractC2209.m3067("Check failed");
                    }
                    c2159.m2931();
                }
                C2069 c2069M2622 = c2068M2698.m2622();
                try {
                    c2069M2622.m2640(iM2625);
                    c8269.f20485 = iM2625;
                    C8270 c82703 = new C8270();
                    c2159.m2917(null, null, null, EmptyList.INSTANCE, new C1596(c2159, c82703, c2069M2622, abstractC2140));
                    C8270 c82704 = c8269.f20489;
                    c82704.getClass();
                    if (!c82703.f20497.m13212()) {
                        C8252 c82522 = c82704.f20497;
                        c82522.m13211(C8265.f20480);
                        AbstractC5754.m10427(c82522, 0, c82703, 1, c2076);
                    }
                    c2069M2622.m2631();
                    c8269.f20489.f20497.m13211(C8254.f20470);
                    i++;
                    c2159 = this;
                } catch (Throwable th) {
                    c2069M2622.m2631();
                    throw th;
                }
            }
            c8269.m13216();
            c8269.f20489.f20497.m13211(C8277.f20504);
            c8269.f20485 = 0;
            c8269.f20489 = c82702;
        } catch (Throwable th2) {
            c8269.f20489 = c82702;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final boolean m2911() {
        C2224 c2224M2929;
        return (this.f4183 || this.f4195 || this.f4210 || (c2224M2929 = m2929()) == null || (c2224M2929.f4381 & 8) != 0) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C2127 m2912() {
        if (this.f4206.mo2891()) {
            return this.f4181;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean m2913() {
        if (!m2911() || this.f4210) {
            return true;
        }
        C2224 c2224M2929 = m2929();
        return (c2224M2929 == null || (c2224M2929.f4381 & 4) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m2914(C2088 c2088) {
        C1093 c1093 = this.f4213;
        if (c1093 == null) {
            c1093 = new C1093();
            this.f4213 = c1093;
        }
        c1093.m1350(this.f4199.f3904, c2088);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m2915() throws Throwable {
        int i;
        m2907(this.f4199.f3904);
        C8269 c8269 = this.f4189;
        c8269.m13214(false);
        C2145 c2145 = c8269.f20487;
        C2159 c2159 = c8269.f20490;
        C2069 c2069 = c2159.f4199;
        if (c2069.f3898 > 0 && c2145.m2869(-2) != (i = c2069.f3907)) {
            if (!c8269.f20488 && c8269.f20486) {
                c8269.m13214(false);
                c8269.f20489.f20497.m13211(C8279.f20506);
                c8269.f20488 = true;
            }
            if (i > 0) {
                C2065 c2065M2633 = c2069.m2633(i);
                c2145.m2867(i);
                c8269.m13214(false);
                C8252 c8252 = c8269.f20489.f20497;
                c8252.m13211(C8282.f20513);
                AbstractC5754.m10425(c8252, 0, c2065M2633);
                c8269.f20488 = true;
            }
        }
        c8269.f20489.f20497.m13211(C8258.f20474);
        int i2 = c8269.f20485;
        C2069 c20692 = c2159.f4199;
        c8269.f20485 = c20692.f3899[(c20692.f3904 * 5) + 3] + i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b8, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2916() {
        C2144 c2144;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        boolean z;
        C1099 c1099;
        long j2;
        int iM3049;
        int i8;
        int iHashCode;
        Object objM2632;
        C2188 c2188 = C2188.f4267;
        boolean z2 = this.f4200;
        this.f4200 = true;
        C2069 c2069 = this.f4199;
        int i9 = c2069.f3907;
        int i10 = (i9 * 5) + 3;
        int i11 = c2069.f3899[i10] + i9;
        int i12 = this.f4222;
        long j3 = this.f4182;
        int i13 = this.f4223;
        int i14 = this.f4215;
        int i15 = c2069.f3904;
        ArrayList arrayList = this.f4209;
        int iM30492 = AbstractC2202.m3049(i15, arrayList);
        if (iM30492 < 0) {
            iM30492 = -(iM30492 + 1);
        }
        if (iM30492 < arrayList.size()) {
            c2144 = (C2144) arrayList.get(iM30492);
            if (c2144.f4145 >= i11) {
                c2144 = null;
            }
        }
        int i16 = 1;
        int i17 = i9;
        int i18 = 0;
        while (c2144 != null) {
            C2224 c2224 = c2144.f4146;
            int i19 = c2144.f4145;
            C2188 c21882 = c2188;
            int iM30493 = AbstractC2202.m3049(i19, arrayList);
            if (iM30493 >= 0) {
            }
            Object obj = c2144.f4144;
            if (obj == null) {
                c2224.getClass();
                i3 = i11;
                i = i10;
                i2 = i12;
            } else {
                int i20 = 8;
                C1083 c1083 = c2224.f4383;
                if (c1083 == null) {
                    i3 = i11;
                    i = i10;
                    i2 = i12;
                } else {
                    i = i10;
                    if (obj instanceof C2197) {
                        C2197 c2197 = (C2197) obj;
                        C2188 c21883 = c2197.f4288;
                        if (c21883 == null) {
                            c21883 = c21882;
                        }
                        i2 = i12;
                        i6 = !c21883.m2996(c2197.m3002().f4281, c1083.m1317(c2197)) ? 1 : 0;
                        i3 = i11;
                        i4 = i13;
                        i5 = i14;
                    } else {
                        i2 = i12;
                        if (obj instanceof AbstractC1133) {
                            AbstractC1133 abstractC1133 = (AbstractC1133) obj;
                            if (abstractC1133.m1432()) {
                                Object[] objArr = abstractC1133.f1345;
                                long[] jArr = abstractC1133.f1346;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    i4 = i13;
                                    i5 = i14;
                                    int i21 = 0;
                                    while (true) {
                                        long j4 = jArr[i21];
                                        i3 = i11;
                                        Object[] objArr2 = objArr;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i22 = 8 - ((~(i21 - length)) >>> 31);
                                            int i23 = 0;
                                            while (i23 < i22) {
                                                if ((j4 & 255) < 128) {
                                                    i7 = i23;
                                                    Object obj2 = objArr2[(i21 << 3) + i23];
                                                    j = j4;
                                                    if (!(obj2 instanceof C2197)) {
                                                        break;
                                                    }
                                                    C2197 c21972 = (C2197) obj2;
                                                    C2188 c21884 = c21972.f4288;
                                                    if (c21884 == null) {
                                                        c21884 = c21882;
                                                    }
                                                    if (!c21884.m2996(c21972.m3002().f4281, c1083.m1317(c21972))) {
                                                        break;
                                                    }
                                                } else {
                                                    i7 = i23;
                                                    j = j4;
                                                }
                                                j4 = j >> i20;
                                                i23 = i7 + 1;
                                            }
                                            if (i22 != i20) {
                                                break;
                                            }
                                            if (i21 == length) {
                                                break;
                                            }
                                            i21++;
                                            i11 = i3;
                                            objArr = objArr2;
                                            i20 = 8;
                                        }
                                    }
                                } else {
                                    i3 = i11;
                                    i4 = i13;
                                    i5 = i14;
                                }
                                i6 = 0;
                            }
                        } else {
                            i3 = i11;
                        }
                    }
                    if (i6 == 0) {
                        this.f4199.m2640(i19);
                        int i24 = this.f4199.f3904;
                        m2906(i17, i24, i9);
                        int iM2639 = this.f4199.m2639(i24);
                        while (iM2639 != i9 && !this.f4199.m2646(iM2639)) {
                            iM2639 = this.f4199.m2639(iM2639);
                        }
                        int iM2944 = this.f4199.m2646(iM2639) ? 0 : i2;
                        if (iM2639 != i24) {
                            int iM29442 = (m2944(iM2639) - this.f4199.m2641(i24)) + iM2944;
                            while (iM2944 < iM29442 && iM2639 != i19) {
                                iM2639++;
                                while (iM2639 < i19) {
                                    C2069 c20692 = this.f4199;
                                    int i25 = c20692.f3899[(iM2639 * 5) + 3] + iM2639;
                                    if (i19 >= i25) {
                                        iM2944 += c20692.m2646(iM2639) ? i16 : m2944(iM2639);
                                        iM2639 = i25;
                                    }
                                }
                                break;
                            }
                        }
                        this.f4222 = iM2944;
                        this.f4215 = m2918(i24);
                        int iM26392 = this.f4199.m2639(i24);
                        long jRotateLeft = 0;
                        int i26 = 3;
                        int i27 = 0;
                        while (true) {
                            if (iM26392 < 0) {
                                break;
                            }
                            if (iM26392 == i9) {
                                jRotateLeft ^= Long.rotateLeft(j3, i27);
                                break;
                            }
                            C2069 c20693 = this.f4199;
                            boolean zM2645 = c20693.m2645(iM26392);
                            int[] iArr = c20693.f3899;
                            if (zM2645) {
                                Object objM2642 = c20693.m2642(iArr, iM26392);
                                if (objM2642 != null) {
                                    iHashCode = objM2642 instanceof Enum ? ((Enum) objM2642).ordinal() : objM2642.hashCode();
                                    i8 = i24;
                                } else {
                                    i8 = i24;
                                    iHashCode = 0;
                                }
                            } else {
                                int iM2647 = c20693.m2647(iM26392);
                                i8 = i24;
                                iHashCode = (iM2647 != 207 || (objM2632 = c20693.m2632(iArr, iM26392)) == null || objM2632.equals(C2204.f4319)) ? iM2647 : objM2632.hashCode();
                            }
                            if (iHashCode == 126665345) {
                                jRotateLeft ^= Long.rotateLeft(iHashCode, i27);
                                break;
                            }
                            jRotateLeft = (jRotateLeft ^ Long.rotateLeft(iHashCode, i26)) ^ Long.rotateLeft(this.f4199.m2645(iM26392) ? 0 : m2918(iM26392), i27);
                            i26 = (i26 + 6) % 64;
                            i27 = (i27 + 6) % 64;
                            iM26392 = this.f4199.m2639(iM26392);
                            i24 = i8;
                        }
                        this.f4182 = jRotateLeft;
                        this.f4187 = null;
                        InterfaceC7383 interfaceC7383 = c2224.f4379;
                        if (interfaceC7383 == null) {
                            C6755.m11870("Invalid restart scope");
                            return;
                        }
                        interfaceC7383.invoke(this, Integer.valueOf(i16));
                        this.f4187 = null;
                        C2069 c20694 = this.f4199;
                        int i28 = c20694.f3899[i] + i9;
                        int i29 = c20694.f3904;
                        if (i29 < i9 || i29 > i28) {
                            AbstractC2209.m3067("Index " + i9 + " is not a parent of " + i29);
                        }
                        c20694.f3907 = i9;
                        c20694.f3903 = i28;
                        c20694.f3906 = 0;
                        c20694.f3902 = 0;
                        z = z2;
                        i17 = i8;
                        i18 = i16;
                    } else {
                        ArrayList arrayList2 = this.f4201;
                        arrayList2.add(c2224);
                        this.f4221.m1005();
                        C2198 c2198 = c2224.f4382;
                        if (c2198 == null || (c1099 = c2224.f4377) == null) {
                            z = z2;
                        } else {
                            c2224.m3087(i16);
                            try {
                                Object[] objArr3 = c1099.f1262;
                                int[] iArr2 = c1099.f1261;
                                long[] jArr2 = c1099.f1263;
                                int length2 = jArr2.length - 2;
                                z = z2;
                                if (length2 >= 0) {
                                    int i30 = 0;
                                    while (true) {
                                        long j5 = jArr2[i30];
                                        long[] jArr3 = jArr2;
                                        Object[] objArr4 = objArr3;
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i31 = 8 - ((~(i30 - length2)) >>> 31);
                                            int i32 = 0;
                                            while (i32 < i31) {
                                                if ((j5 & 255) < 128) {
                                                    int i33 = (i30 << 3) + i32;
                                                    j2 = j5;
                                                    Object obj3 = objArr4[i33];
                                                    int i34 = iArr2[i33];
                                                    c2198.m3014(obj3);
                                                } else {
                                                    j2 = j5;
                                                }
                                                i32++;
                                                j5 = j2 >> 8;
                                            }
                                            if (i31 != 8) {
                                                break;
                                            }
                                        }
                                        if (i30 == length2) {
                                            break;
                                        }
                                        i30++;
                                        objArr3 = objArr4;
                                        jArr2 = jArr3;
                                    }
                                }
                                c2224.m3087(false);
                            } catch (Throwable th) {
                                c2224.m3087(false);
                                throw th;
                            }
                        }
                        i16 = 1;
                        arrayList2.remove(arrayList2.size() - 1);
                    }
                    iM3049 = AbstractC2202.m3049(this.f4199.f3904, arrayList);
                    if (iM3049 < 0) {
                        iM3049 = -(iM3049 + 1);
                    }
                    if (iM3049 >= arrayList.size()) {
                        C2144 c21442 = (C2144) arrayList.get(iM3049);
                        i11 = i3;
                        c2144 = c21442.f4145 < i11 ? c21442 : null;
                        z2 = z;
                        c2188 = c21882;
                        i10 = i;
                        i12 = i2;
                        i13 = i4;
                        i14 = i5;
                    } else {
                        i11 = i3;
                    }
                    z2 = z;
                    c2188 = c21882;
                    i10 = i;
                    i12 = i2;
                    i13 = i4;
                    i14 = i5;
                }
            }
            i4 = i13;
            i5 = i14;
            i6 = i16;
            if (i6 == 0) {
            }
            iM3049 = AbstractC2202.m3049(this.f4199.f3904, arrayList);
            if (iM3049 < 0) {
            }
            if (iM3049 >= arrayList.size()) {
            }
            z2 = z;
            c2188 = c21882;
            i10 = i;
            i12 = i2;
            i13 = i4;
            i14 = i5;
        }
        boolean z3 = z2;
        int i35 = i12;
        int i36 = i13;
        int i37 = i14;
        if (i18 != 0) {
            m2906(i17, i9, i9);
            this.f4199.m2634();
            int iM29443 = m2944(i9);
            this.f4222 = i35 + iM29443;
            this.f4223 = i36 + iM29443;
            this.f4215 = i37;
        } else {
            m2900();
        }
        this.f4182 = j3;
        this.f4200 = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0024, B:12:0x002d, B:11:0x002a, B:15:0x0034, B:20:0x0040, B:22:0x0048, B:24:0x004e, B:25:0x0052, B:26:0x0053, B:28:0x0059, B:21:0x0044), top: B:33:0x0005, inners: #1 }] */
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2917(C2198 c2198, C2198 c21982, Integer num, List list, InterfaceC7372 interfaceC7372) {
        Object objInvoke;
        boolean z = this.f4200;
        int i = this.f4222;
        try {
            this.f4200 = true;
            this.f4222 = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair = (Pair) list.get(i2);
                C2224 c2224 = (C2224) pair.component1();
                Object objComponent2 = pair.component2();
                if (objComponent2 != null) {
                    m2954(c2224, objComponent2);
                } else {
                    m2954(c2224, null);
                }
            }
            if (c2198 == null) {
                objInvoke = interfaceC7372.invoke();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (c21982 == null || c21982 == c2198 || iIntValue < 0) {
                    objInvoke = interfaceC7372.invoke();
                } else {
                    c2198.f4300 = c21982;
                    c2198.f4299 = iIntValue;
                    try {
                        objInvoke = interfaceC7372.invoke();
                        c2198.f4300 = null;
                        c2198.f4299 = 0;
                    } catch (Throwable th) {
                        c2198.f4300 = null;
                        c2198.f4299 = 0;
                        throw th;
                    }
                }
                if (objInvoke == null) {
                }
            }
            this.f4200 = z;
            this.f4222 = i;
            return objInvoke;
        } catch (Throwable th2) {
            this.f4200 = z;
            this.f4222 = i;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final int m2918(int i) {
        int iM2639 = this.f4199.m2639(i) + 1;
        int i2 = 0;
        while (iM2639 < i) {
            if (!this.f4199.m2645(iM2639)) {
                i2++;
            }
            iM2639 += this.f4199.f3899[(iM2639 * 5) + 3];
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final List m2919() {
        AbstractC2207 abstractC2207 = this.f4206;
        InterfaceC2206 interfaceC2206Mo2889 = abstractC2207.mo2889();
        C2198 c2198 = interfaceC2206Mo2889 != null ? (C2198) interfaceC2206Mo2889 : null;
        if (c2198 == null) {
            return EmptyList.INSTANCE;
        }
        C2068 c2068 = c2198.f4307;
        C2069 c2069M2622 = AbstractC2073.m2698(c2068).m2622();
        try {
            Integer numM10448 = AbstractC5754.m10448(c2069M2622, abstractC2207, 0, c2069M2622.f3898);
            if (numM10448 == null) {
                return EmptyList.INSTANCE;
            }
            c2069M2622 = AbstractC2073.m2698(c2068).m2622();
            try {
                ArrayList arrayListM10424 = AbstractC5754.m10424(c2069M2622, numM10448.intValue(), 0);
                c2069M2622.m2631();
                return AbstractC5176.m9352(c2198.f4290.m2919(), arrayListM10424);
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m2920(Object obj) {
        if (AbstractC5227.m9466(m2908(), obj)) {
            return false;
        }
        m2945(obj);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m2921(long j) {
        Object objM2908 = m2908();
        if ((objM2908 instanceof Long) && j == ((Number) objM2908).longValue()) {
            return false;
        }
        m2945(Long.valueOf(j));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m2922(int i) {
        Object objM2908 = m2908();
        if ((objM2908 instanceof Integer) && i == ((Number) objM2908).intValue()) {
            return false;
        }
        m2945(Integer.valueOf(i));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m2923(float f) {
        Object objM2908 = m2908();
        if ((objM2908 instanceof Float) && f == ((Number) objM2908).floatValue()) {
            return false;
        }
        m2945(Float.valueOf(f));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m2924(Object obj, InterfaceC7383 interfaceC7383) {
        if (this.f4183) {
            C8252 c8252 = this.f4184.f20484;
            c8252.m13211(C8262.f20477);
            AbstractC5754.m10425(c8252, 0, obj);
            interfaceC7383.getClass();
            AbstractC5220.m9447(2, interfaceC7383);
            AbstractC5754.m10425(c8252, 1, interfaceC7383);
            return;
        }
        C8269 c8269 = this.f4189;
        c8269.m13216();
        C8252 c82522 = c8269.f20489.f20497;
        c82522.m13211(C8262.f20477);
        interfaceC7383.getClass();
        AbstractC5220.m9447(2, interfaceC7383);
        AbstractC5754.m10427(c82522, 0, obj, 1, interfaceC7383);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2925() {
        m2942();
        this.f4224.clear();
        this.f4214.f4147 = 0;
        this.f4208.f4147 = 0;
        this.f4211.f4147 = 0;
        this.f4213 = null;
        C8268 c8268 = this.f4184;
        c8268.f20483.m13210();
        c8268.f20484.m13210();
        this.f4182 = 0L;
        this.f4193 = 0;
        this.f4217 = false;
        this.f4183 = false;
        this.f4195 = false;
        this.f4200 = false;
        this.f4194 = -1;
        C2069 c2069 = this.f4199;
        if (!c2069.f3895) {
            c2069.m2631();
        }
        if (this.f4197.f3917) {
            return;
        }
        m2931();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m2926() {
        m2937(false);
        this.f4206.mo2875();
        m2937(false);
        C8269 c8269 = this.f4189;
        if (c8269.f20488) {
            c8269.m13214(false);
            c8269.m13214(false);
            c8269.f20489.f20497.m13211(C8278.f20505);
            c8269.f20488 = false;
        }
        c8269.m13216();
        if (c8269.f20487.f4147 != 0) {
            AbstractC2209.m3067("Missed recording an endGroup()");
        }
        if (!this.f4224.isEmpty()) {
            AbstractC2209.m3067("Start/end imbalance");
        }
        m2942();
        this.f4199.m2631();
        this.f4210 = this.f4211.m2868() != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m2927() {
        if (this.f4200 || this.f4194 != 0) {
            AbstractC2227.m3098("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f4194 = -1;
        this.f4195 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC2128 m2928() {
        C2158 c2158 = this.f4179;
        if (c2158 != null) {
            return c2158;
        }
        C2158 c21582 = new C2158(this.f4220);
        this.f4179 = c21582;
        return c21582;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C2224 m2929() {
        if (this.f4193 != 0) {
            return null;
        }
        ArrayList arrayList = this.f4201;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (C2224) AbstractC7012.m12145(1, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m2930(boolean z, C2156 c2156) {
        this.f4224.add(this.f4225);
        this.f4225 = c2156;
        int i = this.f4223;
        C2145 c2145 = this.f4214;
        c2145.m2867(i);
        c2145.m2867(this.f4215);
        c2145.m2867(this.f4222);
        if (z) {
            this.f4222 = 0;
        }
        this.f4223 = 0;
        this.f4215 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m2931() {
        C2068 c2068 = new C2068();
        if (this.f4191) {
            c2068.m2624();
        }
        if (this.f4206.mo2874()) {
            c2068.f3884 = new C1093();
        }
        this.f4198 = c2068;
        C2070 c2070M2623 = c2068.m2623();
        c2070M2623.m2674(true);
        this.f4197 = c2070M2623;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m2932(C1083 c1083, InterfaceC7383 interfaceC7383) {
        ArrayList arrayList = this.f4209;
        if (this.f4200) {
            AbstractC2209.m3067("Reentrant composition is not supported");
        }
        this.f4221.m1005();
        Trace.beginSection("Compose:recompose");
        try {
            this.f4192 = Long.hashCode(AbstractC2115.m2840().mo2770());
            this.f4213 = null;
            m2949(c1083);
            this.f4222 = 0;
            this.f4200 = true;
            try {
                m2953();
                Object objM2908 = m2908();
                if (objM2908 != interfaceC7383 && interfaceC7383 != null) {
                    m2945(interfaceC7383);
                }
                C2148 c2148 = this.f4190;
                C2059 c2059M3055 = AbstractC2202.m3055();
                try {
                    c2059M3055.m2607(c2148);
                    C2214 c2214 = AbstractC2209.f4324;
                    if (interfaceC7383 != null) {
                        m2897(200, c2214);
                        AbstractC2089.m2750(this, interfaceC7383);
                        m2937(false);
                    } else if (!this.f4210 || objM2908 == null || objM2908.equals(C2204.f4319)) {
                        m2904();
                    } else {
                        m2897(200, c2214);
                        AbstractC5220.m9447(2, objM2908);
                        AbstractC2089.m2750(this, (InterfaceC7383) objM2908);
                        m2937(false);
                    }
                    c2059M3055.m2613(c2059M3055.f3865 - 1);
                    m2926();
                    this.f4200 = false;
                    arrayList.clear();
                    if (!this.f4197.f3917) {
                        AbstractC2209.m3067("Check failed");
                    }
                    m2931();
                } catch (Throwable th) {
                    c2059M3055.m2613(c2059M3055.f3865 - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C2131 m2933() {
        RandomAccess randomAccess;
        if (!this.f4206.mo2891()) {
            return null;
        }
        ListBuilder listBuilderM12470 = AbstractC7176.m12470();
        C2070 c2070 = this.f4197;
        listBuilderM12470.addAll(AbstractC5754.m10438(c2070, null, c2070.f3915, null));
        C2069 c2069 = this.f4199;
        boolean z = c2069.f3895;
        int[] iArr = c2069.f3899;
        if (z || c2069.f3898 == 0) {
            randomAccess = EmptyList.INSTANCE;
        } else {
            C2135 c2135 = new C2135(c2069);
            int iM2639 = c2069.f3907;
            Object objValueOf = Integer.valueOf(c2069.f3906 - AbstractC2073.m2700(iArr, iM2639));
            while (iM2639 >= 0) {
                c2135.m2862(c2069.m2647(iM2639), c2069.m2645(iM2639) ? c2069.m2642(iArr, iM2639) : C2204.f4319, c2069.f3900.m2626(iM2639), objValueOf);
                objValueOf = c2069.m2633(iM2639);
                iM2639 = c2069.m2639(iM2639);
            }
            randomAccess = c2135.f4128;
        }
        listBuilderM12470.addAll(randomAccess);
        listBuilderM12470.addAll(m2919());
        return new C2131(listBuilderM12470.build(), this.f4191);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m2934() {
        m2937(false);
        C2224 c2224M2929 = m2929();
        if (c2224M2929 != null) {
            int i = c2224M2929.f4381;
            if ((i & 1) != 0) {
                c2224M2929.f4381 = i | 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083 A[EDGE_INSN: B:61:0x0083->B:28:0x0083 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x007f], EDGE_INSN: B:62:0x0083->B:28:0x0083 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x007f]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2224 m2935() {
        C2224 c2224;
        C2065 c2065M2633;
        C1886 c1886;
        int i;
        ArrayList arrayList = this.f4201;
        C2224 c22242 = !arrayList.isEmpty() ? (C2224) arrayList.remove(arrayList.size() - 1) : null;
        if (c22242 != null) {
            c22242.f4381 &= -9;
            this.f4221.m1005();
            int i2 = this.f4192;
            C1099 c1099 = c22242.f4377;
            if (c1099 == null || (c22242.f4381 & 16) != 0) {
                c1886 = null;
                C8269 c8269 = this.f4189;
                if (c1886 != null) {
                    C8252 c8252 = c8269.f20489.f20497;
                    c8252.m13211(C8286.f20517);
                    AbstractC5754.m10427(c8252, 0, c1886, 1, this.f4220);
                }
                i = c22242.f4381;
                if ((i & 512) != 0) {
                    c22242.f4381 = i & (-513);
                    C8252 c82522 = c8269.f20489.f20497;
                    c82522.m13211(C8281.f20512);
                    AbstractC5754.m10425(c82522, 0, c22242);
                    int i3 = c22242.f4381;
                    c22242.f4381 = i3 & (-129);
                    if ((i3 & 1024) != 0) {
                        c22242.f4381 = i3 & (-1153);
                        if (this.f4194 == this.f4199.f3907) {
                            this.f4195 = false;
                            this.f4194 = -1;
                        }
                    }
                }
            } else {
                Object[] objArr = c1099.f1262;
                int[] iArr = c1099.f1261;
                long[] jArr = c1099.f1263;
                int i4 = 2;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    loop0: while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j & 255) < 128) {
                                    int i8 = (i5 << 3) + i7;
                                    Object obj = objArr[i8];
                                    if (iArr[i8] != i2) {
                                        c1886 = new C1886(i2, i4, c22242, c1099);
                                        break loop0;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                            if (i5 == length) {
                                break;
                            }
                            i5++;
                        }
                    }
                    c1886 = null;
                    C8269 c82692 = this.f4189;
                    if (c1886 != null) {
                    }
                    i = c22242.f4381;
                    if ((i & 512) != 0) {
                    }
                }
            }
        }
        if (c22242 != null) {
            int i9 = c22242.f4381;
            if ((i9 & 16) == 0 && ((i9 & 1) != 0 || this.f4216)) {
                if (c22242.f4380 == null) {
                    if (this.f4183) {
                        C2070 c2070 = this.f4197;
                        c2065M2633 = c2070.m2677(c2070.f3920);
                    } else {
                        C2069 c2069 = this.f4199;
                        c2065M2633 = c2069.m2633(c2069.f3907);
                    }
                    c22242.f4380 = c2065M2633;
                }
                c22242.f4381 &= -5;
                c2224 = c22242;
            } else {
                c2224 = null;
            }
        }
        m2937(false);
        return c2224;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m2936(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        m2936(this.f4199.m2639(i), i2);
        if (this.f4199.m2646(i)) {
            Object objM2637 = this.f4199.m2637(i);
            C8269 c8269 = this.f4189;
            c8269.m13215();
            c8269.f20491.add(objM2637);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x050c  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2937(boolean z) {
        long jRotateRight;
        C2145 c2145;
        ArrayList arrayList;
        int i;
        ?? r3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C2145 c21452;
        int i7;
        int i8;
        ArrayList arrayList2;
        C1082 c1082;
        int i9;
        int i10;
        ArrayList arrayList3;
        ArrayList arrayList4;
        HashSet hashSet;
        int i11;
        C2156 c2156;
        int i12;
        Object[] objArr;
        long[] jArr;
        int i13;
        Object[] objArr2;
        long[] jArr2;
        int i14;
        Object[] objArr3;
        long[] jArr3;
        int i15;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        C2145 c21453 = this.f4214;
        int i16 = c21453.f4148[c21453.f4147 - 2] - 1;
        boolean z2 = this.f4183;
        C2188 c2188 = C2204.f4319;
        if (z2) {
            C2070 c2070 = this.f4197;
            int i17 = c2070.f3920;
            int iM2680 = c2070.m2680(i17);
            Object objM2679 = this.f4197.m2679(i17);
            Object objM2687 = this.f4197.m2687(i17);
            if (objM2679 != null) {
                jRotateRight2 = Long.rotateRight(this.f4182, 3) ^ ((long) (objM2679 instanceof Enum ? ((Enum) objM2679).ordinal() : objM2679.hashCode()));
            } else if (objM2687 == null || iM2680 != 207 || objM2687.equals(c2188)) {
                jRotateRight2 = Long.rotateRight(this.f4182 ^ ((long) i16), 3) ^ ((long) iM2680);
            } else {
                this.f4182 = Long.rotateRight(Long.rotateRight(this.f4182 ^ ((long) i16), 3) ^ ((long) objM2687.hashCode()), 3);
            }
            this.f4182 = Long.rotateRight(jRotateRight2, 3);
        } else {
            C2069 c2069 = this.f4199;
            int i18 = c2069.f3907;
            int iM2647 = c2069.m2647(i18);
            C2069 c20692 = this.f4199;
            Object objM2642 = c20692.m2642(c20692.f3899, i18);
            C2069 c20693 = this.f4199;
            Object objM2632 = c20693.m2632(c20693.f3899, i18);
            if (objM2642 != null) {
                jRotateRight = Long.rotateRight(this.f4182, 3) ^ ((long) (objM2642 instanceof Enum ? ((Enum) objM2642).ordinal() : objM2642.hashCode()));
            } else if (objM2632 == null || iM2647 != 207 || objM2632.equals(c2188)) {
                jRotateRight = Long.rotateRight(this.f4182 ^ ((long) i16), 3) ^ ((long) iM2647);
            } else {
                this.f4182 = Long.rotateRight(Long.rotateRight(this.f4182 ^ ((long) i16), 3) ^ ((long) objM2632.hashCode()), 3);
            }
            this.f4182 = Long.rotateRight(jRotateRight, 3);
        }
        int i19 = this.f4223;
        C2156 c21562 = this.f4225;
        ArrayList arrayList5 = this.f4209;
        C8269 c8269 = this.f4189;
        if (c21562 != null) {
            C1093 c1093 = c21562.f4171;
            int i20 = c21562.f4174;
            ArrayList arrayList6 = c21562.f4175;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = c21562.f4172;
                HashSet hashSet2 = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i21 = 0; i21 < size; i21++) {
                    hashSet2.add(arrayList7.get(i21));
                }
                i = -1;
                C1082 c10822 = AbstractC1132.f1342;
                C1082 c10823 = new C1082();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                while (i22 < size3) {
                    C2062 c2062 = (C2062) arrayList6.get(i22);
                    if (hashSet2.contains(c2062)) {
                        c21452 = c21453;
                        i7 = i22;
                        if (!c10823.m1434(c2062)) {
                            int i25 = i23;
                            if (i25 < size2) {
                                C2062 c20622 = (C2062) arrayList7.get(i25);
                                if (c20622 != c2062) {
                                    C8289 c8289 = (C8289) c1093.m1393(c20622.f3871);
                                    int i26 = c8289 != null ? c8289.f20521 : -1;
                                    c10823.m1301(c20622);
                                    i8 = i25;
                                    i11 = i24;
                                    c2156 = c21562;
                                    if (i26 != i11) {
                                        C8289 c82892 = (C8289) c1093.m1393(c20622.f3871);
                                        int i27 = c82892 != null ? c82892.f20520 : c20622.f3870;
                                        c1082 = c10823;
                                        int i28 = i26 + i20;
                                        i9 = size2;
                                        int i29 = i11 + i20;
                                        if (i27 > 0) {
                                            i10 = i20;
                                            int i30 = c8269.f20494;
                                            if (i30 > 0) {
                                                arrayList3 = arrayList6;
                                                if (c8269.f20496 == i28 - i30 && c8269.f20493 == i29 - i30) {
                                                    c8269.f20494 = i30 + i27;
                                                }
                                            } else {
                                                arrayList3 = arrayList6;
                                            }
                                            c8269.m13215();
                                            c8269.f20496 = i28;
                                            c8269.f20493 = i29;
                                            c8269.f20494 = i27;
                                        } else {
                                            i10 = i20;
                                            arrayList3 = arrayList6;
                                            c8269.getClass();
                                        }
                                        if (i26 > i11) {
                                            Object[] objArr5 = c1093.f1317;
                                            long[] jArr5 = c1093.f1319;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                arrayList4 = arrayList7;
                                                hashSet = hashSet2;
                                                int i31 = 0;
                                                while (true) {
                                                    long j = jArr5[i31];
                                                    int i32 = i27;
                                                    arrayList2 = arrayList5;
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i33 = 8 - ((~(i31 - length)) >>> 31);
                                                        int i34 = 0;
                                                        while (i34 < i33) {
                                                            if ((j & 255) < 128) {
                                                                i15 = i34;
                                                                C8289 c82893 = (C8289) objArr5[(i31 << 3) + i34];
                                                                objArr4 = objArr5;
                                                                int i35 = c82893.f20521;
                                                                jArr4 = jArr5;
                                                                if (i26 <= i35 && i35 < i26 + i32) {
                                                                    c82893.f20521 = (i35 - i26) + i11;
                                                                } else if (i11 <= i35 && i35 < i26) {
                                                                    c82893.f20521 = i35 + i32;
                                                                }
                                                            } else {
                                                                i15 = i34;
                                                                objArr4 = objArr5;
                                                                jArr4 = jArr5;
                                                            }
                                                            j >>= 8;
                                                            i34 = i15 + 1;
                                                            objArr5 = objArr4;
                                                            jArr5 = jArr4;
                                                        }
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                        if (i33 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                    }
                                                    if (i31 == length) {
                                                        break;
                                                    }
                                                    i31++;
                                                    arrayList5 = arrayList2;
                                                    i27 = i32;
                                                    objArr5 = objArr3;
                                                    jArr5 = jArr3;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                        } else {
                                            int i36 = i27;
                                            arrayList2 = arrayList5;
                                            arrayList4 = arrayList7;
                                            hashSet = hashSet2;
                                            if (i11 > i26) {
                                                Object[] objArr6 = c1093.f1317;
                                                long[] jArr6 = c1093.f1319;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    int i37 = 0;
                                                    while (true) {
                                                        long j2 = jArr6[i37];
                                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i38 = 8 - ((~(i37 - length2)) >>> 31);
                                                            int i39 = 0;
                                                            while (i39 < i38) {
                                                                if ((j2 & 255) < 128) {
                                                                    objArr2 = objArr6;
                                                                    C8289 c82894 = (C8289) objArr6[(i37 << 3) + i39];
                                                                    jArr2 = jArr6;
                                                                    int i40 = c82894.f20521;
                                                                    i14 = i26;
                                                                    if (i26 <= i40 && i40 < i14 + i36) {
                                                                        c82894.f20521 = (i40 - i14) + i11;
                                                                    } else if (i14 + 1 <= i40 && i40 < i11) {
                                                                        c82894.f20521 = i40 - i36;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr6;
                                                                    jArr2 = jArr6;
                                                                    i14 = i26;
                                                                }
                                                                j2 >>= 8;
                                                                i39++;
                                                                jArr6 = jArr2;
                                                                objArr6 = objArr2;
                                                                i26 = i14;
                                                            }
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i13 = i26;
                                                            if (i38 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i13 = i26;
                                                        }
                                                        if (i37 == length2) {
                                                            break;
                                                        }
                                                        i37++;
                                                        jArr6 = jArr;
                                                        objArr6 = objArr;
                                                        i26 = i13;
                                                    }
                                                }
                                            }
                                        }
                                        i12 = i7;
                                    } else {
                                        arrayList2 = arrayList5;
                                        c1082 = c10823;
                                        i9 = size2;
                                        i10 = i20;
                                        arrayList3 = arrayList6;
                                    }
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i12 = i7;
                                } else {
                                    i8 = i25;
                                    arrayList2 = arrayList5;
                                    c1082 = c10823;
                                    i9 = size2;
                                    i10 = i20;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i11 = i24;
                                    c2156 = c21562;
                                    i12 = i7 + 1;
                                }
                                i23 = i8 + 1;
                                C8289 c82895 = (C8289) c1093.m1393(c20622.f3871);
                                int i41 = i11 + (c82895 != null ? c82895.f20520 : c20622.f3870);
                                i22 = i12;
                                c21562 = c2156;
                                c10823 = c1082;
                                size2 = i9;
                                i20 = i10;
                                arrayList6 = arrayList3;
                                arrayList7 = arrayList4;
                                hashSet2 = hashSet;
                                arrayList5 = arrayList2;
                                i24 = i41;
                                c21453 = c21452;
                            } else {
                                i23 = i25;
                                c21453 = c21452;
                                i22 = i7;
                            }
                        }
                    } else {
                        c21452 = c21453;
                        C8289 c82896 = (C8289) c1093.m1393(c2062.f3871);
                        int i42 = c82896 != null ? c82896.f20521 : -1;
                        int i43 = c2062.f3871;
                        i7 = i22;
                        c8269.m13213(i42 + i20, c2062.f3870);
                        c21562.m2895(i43, 0);
                        c8269.f20485 = (i43 - c8269.f20490.f4199.f3904) + c8269.f20485;
                        this.f4199.m2640(i43);
                        m2915();
                        this.f4199.m2635();
                        AbstractC2202.m3063(arrayList5, i43, this.f4199.f3899[(i43 * 5) + 3] + i43);
                    }
                    i22 = i7 + 1;
                    c21453 = c21452;
                }
                c2145 = c21453;
                arrayList = arrayList5;
                c8269.m13215();
                if (arrayList6.size() > 0) {
                    C2069 c20694 = this.f4199;
                    c8269.f20485 = (c20694.f3903 - c8269.f20490.f4199.f3904) + c8269.f20485;
                    c20694.m2634();
                }
            } else {
                c2145 = c21453;
                arrayList = arrayList5;
                i = -1;
            }
        }
        boolean z3 = this.f4183;
        if (!z3) {
            C2069 c20695 = this.f4199;
            int i44 = c20695.f3902 - c20695.f3906;
            if (i44 > 0) {
                if (i44 > 0) {
                    c8269.m13214(false);
                    C2145 c21454 = c8269.f20487;
                    C2069 c20696 = c8269.f20490.f4199;
                    if (c20696.f3898 > 0 && c21454.m2869(-2) != (i6 = c20696.f3907)) {
                        if (!c8269.f20488 && c8269.f20486) {
                            c8269.m13214(false);
                            c8269.f20489.f20497.m13211(C8279.f20506);
                            c8269.f20488 = true;
                        }
                        if (i6 > 0) {
                            C2065 c2065M2633 = c20696.m2633(i6);
                            c21454.m2867(i6);
                            c8269.m13214(false);
                            C8252 c8252 = c8269.f20489.f20497;
                            c8252.m13211(C8282.f20513);
                            AbstractC5754.m10425(c8252, 0, c2065M2633);
                            c8269.f20488 = true;
                        }
                    }
                    C8252 c82522 = c8269.f20489.f20497;
                    c82522.m13211(C8264.f20479);
                    c82522.f20467[c82522.f20464 - c82522.f20468[c82522.f20466 - 1].f18749] = i44;
                } else {
                    c8269.getClass();
                }
            }
        }
        int i45 = this.f4222;
        while (true) {
            C2069 c20697 = this.f4199;
            if (c20697.f3905 > 0 || (i5 = c20697.f3904) == c20697.f3903) {
                break;
            }
            m2915();
            c8269.m13213(i45, this.f4199.m2635());
            AbstractC2202.m3063(arrayList, i5, this.f4199.f3904);
        }
        if (z3) {
            if (z) {
                C8268 c8268 = this.f4184;
                C8252 c82523 = c8268.f20483;
                if (c82523.f20466 == 0) {
                    AbstractC2209.m3067("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                C8252 c82524 = c8268.f20484;
                AbstractC7729[] abstractC7729Arr = c82523.f20468;
                int i46 = c82523.f20466 - 1;
                c82523.f20466 = i46;
                AbstractC7729 abstractC7729 = abstractC7729Arr[i46];
                abstractC7729Arr[i46] = null;
                c82524.m13211(abstractC7729);
                Object[] objArr7 = c82523.f20463;
                Object[] objArr8 = c82524.f20463;
                int i47 = c82524.f20465;
                int i48 = abstractC7729.f18748;
                int i49 = c82523.f20465;
                int i50 = i49 - i48;
                System.arraycopy(objArr7, i50, objArr8, i47 - i48, i49 - i50);
                Object[] objArr9 = c82523.f20463;
                int i51 = c82523.f20465;
                Arrays.fill(objArr9, i51 - i48, i51, (Object) null);
                int[] iArr = c82523.f20467;
                int[] iArr2 = c82524.f20467;
                int i52 = c82524.f20464;
                int i53 = abstractC7729.f18749;
                int i54 = c82523.f20464;
                AbstractC5179.m9395(i52 - i53, i54 - i53, i54, iArr, iArr2);
                c82523.f20465 -= i48;
                c82523.f20464 -= i53;
                i19 = 1;
            }
            if (this.f4199.f3905 <= 0) {
                AbstractC2227.m3098("Unbalanced begin/end empty");
            }
            r4.f3905--;
            C2070 c20702 = this.f4197;
            int i55 = c20702.f3920;
            c20702.m2695();
            if (this.f4199.f3905 <= 0) {
                int i56 = (-2) - i55;
                this.f4197.m2693();
                this.f4197.m2674(true);
                C2065 c2065 = this.f4188;
                boolean zM13212 = this.f4184.f20484.m13212();
                C2068 c2068 = this.f4198;
                if (zM13212) {
                    c8269.m13216();
                    c8269.m13214(false);
                    C2145 c21455 = c8269.f20487;
                    C2069 c20698 = c8269.f20490.f4199;
                    if (c20698.f3898 <= 0 || c21455.m2869(-2) == (i4 = c20698.f3907)) {
                        i3 = 1;
                        c8269.m13215();
                        C8252 c82525 = c8269.f20489.f20497;
                        c82525.m13211(C8272.f20499);
                        AbstractC5754.m10427(c82525, 0, c2065, i3, c2068);
                        r3 = 0;
                    } else {
                        if (!c8269.f20488 && c8269.f20486) {
                            c8269.m13214(false);
                            c8269.f20489.f20497.m13211(C8279.f20506);
                            c8269.f20488 = true;
                        }
                        if (i4 > 0) {
                            C2065 c2065M26332 = c20698.m2633(i4);
                            c21455.m2867(i4);
                            c8269.m13214(false);
                            C8252 c82526 = c8269.f20489.f20497;
                            c82526.m13211(C8282.f20513);
                            AbstractC5754.m10425(c82526, 0, c2065M26332);
                            i3 = 1;
                            c8269.f20488 = true;
                        }
                        c8269.m13215();
                        C8252 c825252 = c8269.f20489.f20497;
                        c825252.m13211(C8272.f20499);
                        AbstractC5754.m10427(c825252, 0, c2065, i3, c2068);
                        r3 = 0;
                    }
                } else {
                    C8268 c82682 = this.f4184;
                    c8269.m13216();
                    c8269.m13214(false);
                    C2145 c21456 = c8269.f20487;
                    C2069 c20699 = c8269.f20490.f4199;
                    if (c20699.f3898 > 0 && c21456.m2869(-2) != (i2 = c20699.f3907)) {
                        if (!c8269.f20488 && c8269.f20486) {
                            c8269.m13214(false);
                            c8269.f20489.f20497.m13211(C8279.f20506);
                            c8269.f20488 = true;
                        }
                        if (i2 > 0) {
                            C2065 c2065M26333 = c20699.m2633(i2);
                            c21456.m2867(i2);
                            c8269.m13214(false);
                            C8252 c82527 = c8269.f20489.f20497;
                            c82527.m13211(C8282.f20513);
                            AbstractC5754.m10425(c82527, 0, c2065M26333);
                            c8269.f20488 = true;
                        }
                    }
                    c8269.m13215();
                    C8252 c82528 = c8269.f20489.f20497;
                    c82528.m13211(C8271.f20498);
                    int i57 = c82528.f20465 - c82528.f20468[c82528.f20466 - 1].f18748;
                    Object[] objArr10 = c82528.f20463;
                    objArr10[i57] = c2065;
                    objArr10[i57 + 1] = c2068;
                    objArr10[i57 + 2] = c82682;
                    this.f4184 = new C8268();
                    r3 = 0;
                }
                this.f4183 = r3;
                if (this.f4205.f3889 != 0) {
                    m2948(i56, r3);
                    m2947(i56, i19);
                }
            }
        } else {
            if (z) {
                c8269.m13217();
            }
            int i58 = c8269.f20490.f4199.f3907;
            C2145 c21457 = c8269.f20487;
            int i59 = i;
            if (c21457.m2869(i59) > i58) {
                AbstractC2209.m3067("Missed recording an endGroup");
            }
            if (c21457.m2869(i59) == i58) {
                c8269.m13214(false);
                c21457.m2868();
                c8269.f20489.f20497.m13211(C8278.f20505);
            }
            int i60 = this.f4199.f3907;
            if (i19 != m2944(i60)) {
                m2947(i60, i19);
            }
            if (z) {
                i19 = 1;
            }
            this.f4199.m2629();
            c8269.m13215();
        }
        C2156 c21563 = (C2156) this.f4224.remove(r3.size() - 1);
        if (c21563 != null && !z3) {
            c21563.f4173++;
        }
        this.f4225 = c21563;
        this.f4222 = c2145.m2868() + i19;
        this.f4215 = c2145.m2868();
        this.f4223 = c2145.m2868() + i19;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m2938(Object obj) {
        if (m2908() == obj) {
            return false;
        }
        m2945(obj);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m2939(boolean z) {
        Object objM2908 = m2908();
        if ((objM2908 instanceof Boolean) && z == ((Boolean) objM2908).booleanValue()) {
            return false;
        }
        m2945(Boolean.valueOf(z));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m2940(InterfaceC7372 interfaceC7372) {
        if (!this.f4217) {
            AbstractC2209.m3067("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f4217 = false;
        if (!this.f4183) {
            AbstractC2209.m3067("createNode() can only be called when inserting");
        }
        C2145 c2145 = this.f4214;
        int i = c2145.f4148[c2145.f4147 - 1];
        C2070 c2070 = this.f4197;
        C2065 c2065M2677 = c2070.m2677(c2070.f3920);
        this.f4223++;
        C8268 c8268 = this.f4184;
        C8252 c8252 = c8268.f20484;
        c8252.m13211(C8280.f20508);
        AbstractC5754.m10425(c8252, 0, interfaceC7372);
        c8252.f20467[c8252.f20464 - c8252.f20468[c8252.f20466 - 1].f18749] = i;
        AbstractC5754.m10425(c8252, 1, c2065M2677);
        C8252 c82522 = c8268.f20483;
        c82522.m13211(C8280.f20507);
        c82522.f20467[c82522.f20464 - c82522.f20468[c82522.f20466 - 1].f18749] = i;
        AbstractC5754.m10425(c82522, 0, c2065M2677);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C2088 m2941() {
        C2088 c2088;
        C2088 c20882 = this.f4187;
        if (c20882 != null) {
            return c20882;
        }
        int iM2639 = this.f4199.f3907;
        boolean z = this.f4183;
        C2214 c2214 = AbstractC2209.f4322;
        if (z && this.f4196) {
            int iM2672 = this.f4197.f3920;
            while (iM2672 > 0) {
                if (this.f4197.m2680(iM2672) == 202 && AbstractC5227.m9466(this.f4197.m2679(iM2672), c2214)) {
                    Object objM2687 = this.f4197.m2687(iM2672);
                    objM2687.getClass();
                    C2088 c20883 = (C2088) objM2687;
                    this.f4187 = c20883;
                    return c20883;
                }
                C2070 c2070 = this.f4197;
                iM2672 = c2070.m2672(c2070.f3913, iM2672);
            }
        }
        if (this.f4199.f3898 > 0) {
            while (iM2639 > 0) {
                if (this.f4199.m2647(iM2639) == 202) {
                    C2069 c2069 = this.f4199;
                    if (AbstractC5227.m9466(c2069.m2642(c2069.f3899, iM2639), c2214)) {
                        C1093 c1093 = this.f4213;
                        if (c1093 == null || (c2088 = (C2088) c1093.m1393(iM2639)) == null) {
                            C2069 c20692 = this.f4199;
                            Object objM2632 = c20692.m2632(c20692.f3899, iM2639);
                            objM2632.getClass();
                            c2088 = (C2088) objM2632;
                        }
                        this.f4187 = c2088;
                        return c2088;
                    }
                }
                iM2639 = this.f4199.m2639(iM2639);
            }
        }
        C2088 c20884 = this.f4212;
        this.f4187 = c20884;
        return c20884;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m2942() {
        this.f4225 = null;
        this.f4222 = 0;
        this.f4223 = 0;
        this.f4182 = 0L;
        this.f4217 = false;
        C8269 c8269 = this.f4189;
        c8269.f20488 = false;
        c8269.f20487.f4147 = 0;
        c8269.f20485 = 0;
        c8269.f20486 = true;
        c8269.f20492 = 0;
        c8269.f20491.clear();
        c8269.f20495 = -1;
        c8269.f20496 = -1;
        c8269.f20493 = -1;
        c8269.f20494 = 0;
        this.f4201.clear();
        this.f4218 = null;
        this.f4219 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object m2943(AbstractC2225 abstractC2225) {
        return AbstractC2202.m3042(m2941(), abstractC2225);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final int m2944(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.f4218;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.f4199.m2641(i) : i2;
        }
        C1095 c1095 = this.f4219;
        if (c1095 != null && c1095.m1359(i) >= 0) {
            int iM1359 = c1095.m1359(i);
            if (iM1359 >= 0) {
                return c1095.f1252[iM1359];
            }
            C5043.m9176(AbstractC7012.m12147(i, "Cannot find value for key "));
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final void m2945(Object obj) {
        if (this.f4183) {
            C2070 c2070 = this.f4197;
            if (c2070.f3921 <= 0 || c2070.f3931 == c2070.f3929) {
                c2070.m2671(obj);
                return;
            }
            C1093 c1093 = c2070.f3916;
            if (c1093 == null) {
                c1093 = new C1093();
            }
            c2070.f3916 = c1093;
            int i = c2070.f3920;
            Object objM1393 = c1093.m1393(i);
            if (objM1393 == null) {
                objM1393 = new C1091();
                c1093.m1350(i, objM1393);
            }
            ((C1091) objM1393).m1335(obj);
            return;
        }
        C2069 c2069 = this.f4199;
        boolean z = c2069.f3901;
        C8269 c8269 = this.f4189;
        if (!z) {
            C2065 c2065M2633 = c2069.m2633(c2069.f3907);
            C8252 c8252 = c8269.f20489.f20497;
            c8252.m13211(C8266.f20481);
            AbstractC5754.m10427(c8252, 0, c2065M2633, 1, obj);
            return;
        }
        int iM2700 = (c2069.f3906 - AbstractC2073.m2700(c2069.f3899, c2069.f3907)) - 1;
        if (c8269.f20490.f4199.f3907 - c8269.f20485 >= 0) {
            c8269.m13214(true);
            C8252 c82522 = c8269.f20489.f20497;
            c82522.m13211(C8280.f20509);
            AbstractC5754.m10425(c82522, 0, obj);
            c82522.f20467[c82522.f20464 - c82522.f20468[c82522.f20466 - 1].f18749] = iM2700;
            return;
        }
        C2069 c20692 = this.f4199;
        C2065 c2065M26332 = c20692.m2633(c20692.f3907);
        C8252 c82523 = c8269.f20489.f20497;
        c82523.m13211(C8280.f20510);
        AbstractC5754.m10427(c82523, 0, obj, 1, c2065M26332);
        c82523.f20467[c82523.f20464 - c82523.f20468[c82523.f20466 - 1].f18749] = iM2700;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final void m2946(Object obj) {
        if (obj instanceof InterfaceC2174) {
            C2155 c2155 = new C2155((InterfaceC2174) obj, this.f4215 - 1);
            if (this.f4183) {
                C8252 c8252 = this.f4189.f20489.f20497;
                c8252.m13211(C8273.f20500);
                AbstractC5754.m10425(c8252, 0, c2155);
            }
            this.f4204.add(obj);
            obj = c2155;
        }
        m2945(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final void m2947(int i, int i2) {
        int iM2944 = m2944(i);
        if (iM2944 != i2) {
            int i3 = i2 - iM2944;
            ArrayList arrayList = this.f4224;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iM29442 = m2944(i) + i3;
                m2948(i, iM29442);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        C2156 c2156 = (C2156) arrayList.get(i4);
                        if (c2156 != null && c2156.m2895(i, iM29442)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                C2069 c2069 = this.f4199;
                if (i < 0) {
                    i = c2069.f3907;
                } else if (c2069.m2646(i)) {
                    return;
                } else {
                    i = this.f4199.m2639(i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void m2948(int i, int i2) {
        if (m2944(i) != i2) {
            if (i < 0) {
                C1095 c1095 = this.f4219;
                if (c1095 == null) {
                    c1095 = new C1095();
                    this.f4219 = c1095;
                }
                c1095.m1356(i, i2);
                return;
            }
            int[] iArr = this.f4218;
            if (iArr == null) {
                iArr = new int[this.f4199.f3898];
                AbstractC5179.m9389(iArr, -1, 0, 6);
                this.f4218 = iArr;
            }
            iArr[i] = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2949(C1083 c1083) {
        ArrayList arrayList = this.f4209;
        for (int iM12460 = AbstractC7176.m12460(arrayList); -1 < iM12460; iM12460--) {
            C2144 c2144 = (C2144) arrayList.get(iM12460);
            C2065 c2065 = c2144.f4146.f4380;
            C2065 c2065M7411 = c2065 != null ? AbstractC3898.m7411(c2065) : null;
            if (c2065M7411 == null || !c2065M7411.m2621()) {
                arrayList.remove(iM12460);
            } else {
                int i = c2144.f4145;
                int i2 = c2065M7411.f3879;
                if (i != i2) {
                    c2144.f4145 = i2;
                }
            }
        }
        Object[] objArr = c1083.f1225;
        Object[] objArr2 = c1083.f1224;
        long[] jArr = c1083.f1226;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr[i6];
                            Object obj2 = objArr2[i6];
                            obj.getClass();
                            C2224 c2224 = (C2224) obj;
                            C2065 c20652 = c2224.f4380;
                            if (c20652 != null) {
                                int i7 = AbstractC3898.m7411(c20652).f3879;
                                if (obj2 == C2188.f4266) {
                                    obj2 = null;
                                }
                                arrayList.add(new C2144(c2224, i7, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        AbstractC5168.m9325(arrayList, AbstractC2202.f4317);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final void m2950() {
        if (!this.f4217) {
            AbstractC2209.m3067("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f4217 = false;
        if (this.f4183) {
            AbstractC2209.m3067("useNode() called while inserting");
        }
        C2069 c2069 = this.f4199;
        Object objM2637 = c2069.m2637(c2069.f3907);
        C8269 c8269 = this.f4189;
        c8269.m13215();
        c8269.f20491.add(objM2637);
        if (this.f4195 && (objM2637 instanceof InterfaceC2205)) {
            c8269.m13216();
            c8269.f20489.f20497.m13211(C8260.f20475);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2159 m2951(int i) {
        C2224 c2224;
        boolean z;
        m2952(i);
        boolean z2 = this.f4183;
        C0960 c0960 = this.f4221;
        ArrayList arrayList = this.f4201;
        C2198 c2198 = this.f4220;
        if (z2) {
            C2224 c22242 = new C2224(c2198);
            arrayList.add(c22242);
            m2945(c22242);
            c22242.f4378 = this.f4192;
            c22242.f4381 &= -17;
            c0960.m1005();
            return this;
        }
        int i2 = this.f4199.f3907;
        ArrayList arrayList2 = this.f4209;
        int iM3049 = AbstractC2202.m3049(i2, arrayList2);
        C2144 c2144 = iM3049 >= 0 ? (C2144) arrayList2.remove(iM3049) : null;
        Object objM2638 = this.f4199.m2638();
        if (AbstractC5227.m9466(objM2638, C2204.f4319)) {
            c2224 = new C2224(c2198);
            m2945(c2224);
        } else {
            objM2638.getClass();
            c2224 = (C2224) objM2638;
        }
        if (c2144 == null) {
            int i3 = c2224.f4381;
            boolean z3 = (i3 & 64) != 0;
            if (z3) {
                c2224.f4381 = i3 & (-65);
            }
            z = z3;
        }
        int i4 = c2224.f4381;
        c2224.f4381 = z ? i4 | 8 : i4 & (-9);
        arrayList.add(c2224);
        c2224.f4378 = this.f4192;
        c2224.f4381 &= -17;
        c0960.m1005();
        int i5 = c2224.f4381;
        if ((i5 & 256) != 0) {
            c2224.f4381 = (i5 & (-257)) | 512;
            C8252 c8252 = this.f4189.f20489.f20497;
            c8252.m13211(C8253.f20469);
            AbstractC5754.m10425(c8252, 0, c2224);
            if (!this.f4195) {
                int i6 = c2224.f4381;
                if ((i6 & 128) != 0) {
                    this.f4195 = true;
                    this.f4194 = this.f4199.f3907;
                    c2224.f4381 = i6 | 1024;
                }
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final void m2952(int i) {
        int i2;
        int i3;
        if (this.f4225 != null) {
            m2902(i, 0, null, null);
            return;
        }
        if (this.f4217) {
            AbstractC2209.m3067("A call to createNode(), emitNode() or useNode() expected");
        }
        this.f4182 = Long.rotateLeft(Long.rotateLeft(this.f4182, 3) ^ ((long) i), 3) ^ ((long) this.f4215);
        this.f4215++;
        C2069 c2069 = this.f4199;
        boolean z = this.f4183;
        C2188 c2188 = C2204.f4319;
        if (z) {
            c2069.f3905++;
            this.f4197.m2653(i, c2188, c2188, false);
            m2930(false, null);
            return;
        }
        if (c2069.m2644() == i && ((i3 = c2069.f3904) >= c2069.f3903 || (c2069.f3899[(i3 * 5) + 1] & 536870912) == 0)) {
            c2069.m2636();
            m2930(false, null);
            return;
        }
        if (c2069.f3905 <= 0 && (i2 = c2069.f3904) != c2069.f3903) {
            int i4 = this.f4222;
            m2915();
            this.f4189.m13213(i4, c2069.m2635());
            AbstractC2202.m3063(this.f4209, i2, c2069.f3904);
        }
        c2069.f3905++;
        this.f4183 = true;
        this.f4187 = null;
        if (this.f4197.f3917) {
            C2070 c2070M2623 = this.f4198.m2623();
            this.f4197 = c2070M2623;
            c2070M2623.m2661();
            this.f4196 = false;
            this.f4187 = null;
        }
        C2070 c2070 = this.f4197;
        c2070.m2675();
        int i5 = c2070.f3915;
        c2070.m2653(i, c2188, c2188, false);
        this.f4188 = c2070.m2677(i5);
        m2930(false, null);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final void m2953() {
        this.f4215 = 0;
        this.f4199 = this.f4205.m2622();
        m2902(100, 0, null, null);
        AbstractC2207 abstractC2207 = this.f4206;
        abstractC2207.mo2878();
        C2088 c2088Mo2893 = abstractC2207.mo2893();
        this.f4211.m2867(this.f4210 ? 1 : 0);
        this.f4210 = m2920(c2088Mo2893);
        this.f4187 = null;
        if (!this.f4216) {
            this.f4216 = abstractC2207.mo2873();
        }
        if (!this.f4191) {
            this.f4191 = abstractC2207.mo2872();
        }
        if (this.f4191) {
            C2169 c2169 = AbstractC2126.f4123;
            c2169.getClass();
            c2088Mo2893 = c2088Mo2893.m2746(c2169, new C2173(m2912()));
        }
        this.f4212 = c2088Mo2893;
        Set set = (Set) AbstractC2202.m3042(c2088Mo2893, AbstractC2133.f4131);
        if (set != null) {
            set.add(m2928());
            abstractC2207.mo2887(set);
        }
        m2902(Long.hashCode(abstractC2207.mo2890()), 0, null, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final boolean m2954(C2224 c2224, Object obj) {
        C2065 c2065 = c2224.f4380;
        if (c2065 == null) {
            return false;
        }
        int iM2625 = this.f4199.f3900.m2625(AbstractC3898.m7411(c2065));
        if (!this.f4200 || iM2625 < this.f4199.f3904) {
            return false;
        }
        ArrayList arrayList = this.f4209;
        int iM3049 = AbstractC2202.m3049(iM2625, arrayList);
        if (iM3049 < 0) {
            int i = -(iM3049 + 1);
            if (!(obj instanceof C2197)) {
                obj = null;
            }
            arrayList.add(i, new C2144(c2224, iM2625, obj));
            return true;
        }
        C2144 c2144 = (C2144) arrayList.get(iM3049);
        if (!(obj instanceof C2197)) {
            c2144.f4144 = null;
            return true;
        }
        Object obj2 = c2144.f4144;
        if (obj2 == null) {
            c2144.f4144 = obj;
            return true;
        }
        if (obj2 instanceof C1082) {
            ((C1082) obj2).m1301(obj);
            return true;
        }
        C1082 c1082 = AbstractC1132.f1342;
        C1082 c10822 = new C1082(2);
        c10822.m1305(obj2);
        c10822.m1305(obj);
        c2144.f4144 = c10822;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final void m2955(Object obj) {
        if (!this.f4183 && this.f4199.m2644() == 207 && !AbstractC5227.m9466(this.f4199.m2628(), obj) && this.f4194 < 0) {
            this.f4194 = this.f4199.f3904;
            this.f4195 = true;
        }
        m2902(Opcodes.REM_DOUBLE_2ADDR, 0, null, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final void m2956() {
        m2902(125, 2, null, null);
        this.f4217 = true;
    }
}
