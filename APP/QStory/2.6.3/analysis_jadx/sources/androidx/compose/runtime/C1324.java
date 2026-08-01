package androidx.compose.runtime;

import android.os.Trace;
import androidx.appcompat.app.C0113;
import androidx.collection.AbstractC0285;
import androidx.collection.C0235;
import androidx.collection.C0236;
import androidx.collection.C0237;
import androidx.collection.C0244;
import androidx.collection.C0246;
import androidx.collection.C0248;
import androidx.compose.foundation.lazy.C0755;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.runtime.composer.gapbuffer.AbstractC1238;
import androidx.compose.runtime.composer.gapbuffer.C1230;
import androidx.compose.runtime.composer.gapbuffer.C1233;
import androidx.compose.runtime.composer.gapbuffer.C1234;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.runtime.internal.AbstractC1254;
import androidx.compose.runtime.internal.C1241;
import androidx.compose.runtime.internal.C1242;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.tooling.AbstractC1291;
import androidx.compose.runtime.tooling.AbstractC1298;
import androidx.compose.runtime.tooling.C1292;
import androidx.compose.runtime.tooling.C1296;
import androidx.compose.runtime.tooling.C1300;
import androidx.compose.runtime.tooling.InterfaceC1293;
import androidx.compose.ui.node.C1778;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3066;
import io.ktor.util.C4211;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4360;
import kotlin.jvm.internal.AbstractC4388;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p009.AbstractC6183;
import p034.AbstractC6347;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p126.C7423;
import p126.C7425;
import p126.C7427;
import p126.C7429;
import p126.C7431;
import p126.C7433;
import p126.C7434;
import p126.C7436;
import p126.C7437;
import p126.C7439;
import p126.C7440;
import p126.C7441;
import p126.C7444;
import p126.C7445;
import p126.C7448;
import p126.C7449;
import p126.C7450;
import p126.C7451;
import p126.C7453;
import p126.C7459;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1324 implements InterfaceC1373 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public C1323 f3834;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final InterfaceC4360 f3835;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final C1292 f3836;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public long f3837;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f3838;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public C7439 f3839;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public InterfaceC1342 f3840;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public C7441 f3841;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C1253 f3842;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public C1230 f3843;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C7440 f3844;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C1313 f3845;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f3846;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f3847;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f3848;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f3850;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f3851;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C1235 f3852;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C1233 f3853;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C1234 f3854;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f3855;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final ArrayList f3856;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C7441 f3857;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C7441 f3858;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0237 f3859;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1233 f3860;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC1372 f3861;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1778 f3862;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f3865;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C0246 f3868;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f3870;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f3871;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f3872;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int[] f3873;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C0248 f3874;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C1363 f3875;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0113 f3876;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f3877;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f3878;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C1321 f3880;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f3879 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C1310 f3869 = new C1310();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ArrayList f3864 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C1310 f3863 = new C1310();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C1253 f3867 = C1253.f3641;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C1310 f3866 = new C1310();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f3849 = -1;

    public C1324(C1778 c1778, AbstractC1372 abstractC1372, C1233 c1233, C0237 c0237, C7441 c7441, C7441 c74412, C0113 c0113, C1363 c1363) {
        this.f3862 = c1778;
        this.f3861 = abstractC1372;
        this.f3860 = c1233;
        this.f3859 = c0237;
        this.f3858 = c7441;
        this.f3857 = c74412;
        this.f3876 = c0113;
        this.f3875 = c1363;
        this.f3846 = abstractC1372.mo2312() || abstractC1372.mo2314();
        this.f3845 = new C1313(this, 0);
        this.f3856 = new ArrayList();
        C1234 c1234M2062 = c1233.m2062();
        c1234M2062.m2071();
        this.f3854 = c1234M2062;
        C1233 c12332 = new C1233();
        if (abstractC1372.mo2312()) {
            c12332.m2064();
        }
        if (abstractC1372.mo2314()) {
            c12332.f3539 = new C0246();
        }
        this.f3853 = c12332;
        C1235 c1235M2063 = c12332.m2063();
        c1235M2063.m2114(true);
        this.f3852 = c1235M2063;
        this.f3844 = new C7440(this, c7441);
        C1234 c1234M20622 = this.f3853.m2062();
        try {
            C1230 c1230M2073 = c1234M20622.m2073(0);
            c1234M20622.m2071();
            this.f3843 = c1230M2073;
            this.f3839 = new C7439();
            this.f3836 = new C1292(this);
            InterfaceC4360 interfaceC4360Mo2334 = abstractC1372.mo2334();
            InterfaceC4360 interfaceC4360M2352 = m2352();
            this.f3835 = interfaceC4360Mo2334.plus(interfaceC4360M2352 == null ? EmptyCoroutineContext.INSTANCE : interfaceC4360M2352);
        } catch (Throwable th) {
            c1234M20622.m2071();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final int m2336(C1324 c1324, int i, boolean z, int i2) throws Throwable {
        int i3;
        long[] jArr;
        int i4;
        long[] jArr2;
        int i5;
        int i6;
        C1234 c1234;
        C1234 c12342 = c1324.f3854;
        int i7 = 0;
        if (c12342.m2088(i)) {
            int iM2087 = c12342.m2087(i);
            Object objM2082 = c12342.m2082(c12342.f3554, i);
            if (iM2087 == 206 && AbstractC4395.m8907(objM2082, AbstractC1374.f3975)) {
                Object objM2083 = c12342.m2083(i, 0);
                C1320 c1320 = objM2083 instanceof C1320 ? (C1320) objM2083 : null;
                InterfaceC1339 interfaceC1339 = c1320 != null ? c1320.f3824 : null;
                C1315 c1315 = interfaceC1339 instanceof C1315 ? (C1315) interfaceC1339 : null;
                if (c1315 != null) {
                    C0235 c0235 = c1315.f3818.f3812;
                    Object[] objArr = c0235.f1000;
                    long[] jArr3 = c0235.f1001;
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
                                        C1324 c13242 = (C1324) objArr[(i8 << 3) + i11];
                                        C1233 c1233 = c13242.f3860;
                                        if (c1233.f3544 <= 0 || (c1233.f3545[1] & 67108864) == 0) {
                                            jArr2 = jArr3;
                                            i5 = i7;
                                            i6 = i9;
                                        } else {
                                            C1363 c1363 = c13242.f3875;
                                            synchronized (c1363.f3959) {
                                                c1363.m2461();
                                                i6 = i9;
                                                C0236 c0236 = c1363.f3947;
                                                c1363.f3947 = AbstractC3055.m6663();
                                                try {
                                                    c1363.f3945.m2389(c0236);
                                                } finally {
                                                }
                                            }
                                            C7441 c7441 = new C7441();
                                            c13242.f3841 = c7441;
                                            C1234 c1234M2062 = c13242.f3860.m2062();
                                            try {
                                                c13242.f3854 = c1234M2062;
                                                C7440 c7440 = c13242.f3844;
                                                C7441 c74412 = c7440.f20144;
                                                try {
                                                    c7440.f20144 = c7441;
                                                    c13242.m2347(0);
                                                    C7440 c74402 = c13242.f3844;
                                                    c74402.m12657();
                                                    jArr2 = jArr3;
                                                    try {
                                                        if (c74402.f20143) {
                                                            c1234 = c1234M2062;
                                                            try {
                                                                c74402.f20144.f20152.m12652(C7425.f20125);
                                                                if (c74402.f20143) {
                                                                    c74402.m12655(false);
                                                                    c74402.m12655(false);
                                                                    c74402.f20144.f20152.m12652(C7449.f20160);
                                                                    i5 = 0;
                                                                    c74402.f20143 = false;
                                                                }
                                                                c7440.f20144 = c74412;
                                                                c1234.m2071();
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                c7440.f20144 = c74412;
                                                                throw th;
                                                            }
                                                        } else {
                                                            c1234 = c1234M2062;
                                                        }
                                                        c7440.f20144 = c74412;
                                                        c1234.m2071();
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        c1234.m2071();
                                                        throw th;
                                                    }
                                                    i5 = 0;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    c1234 = c1234M2062;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                c1234 = c1234M2062;
                                            }
                                        }
                                        c1324.f3861.mo2326(c13242.f3875);
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
                return c12342.m2081(i);
            }
            i3 = 1;
            if (!c12342.m2086(i)) {
                return c12342.m2081(i);
            }
        } else {
            i3 = 1;
            if (c12342.m2070(i)) {
                int i12 = c12342.f3554[(i * 5) + 3] + i;
                int iM2336 = 0;
                for (int i13 = i + 1; i13 < i12; i13 += c12342.f3554[(i13 * 5) + 3]) {
                    boolean zM2086 = c12342.m2086(i13);
                    if (zM2086) {
                        c1324.f3844.m12656();
                        C7440 c74403 = c1324.f3844;
                        Object objM2077 = c12342.m2077(i13);
                        c74403.m12656();
                        c74403.f20146.add(objM2077);
                    }
                    iM2336 += m2336(c1324, i13, zM2086 || z, zM2086 ? 0 : i2 + iM2336);
                    if (zM2086) {
                        c1324.f3844.m12656();
                        c1324.f3844.m12658();
                    }
                }
                if (!c12342.m2086(i)) {
                    return iM2336;
                }
            } else if (!c12342.m2086(i)) {
                return c12342.m2081(i);
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m2337(int i, C1379 c1379) {
        m2342(i, 0, c1379, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m2338(Object obj, boolean z) {
        if (z) {
            C1234 c1234 = this.f3854;
            if (c1234.f3560 <= 0) {
                if ((c1234.f3554[(c1234.f3559 * 5) + 1] & 1073741824) == 0) {
                    AbstractC1392.m2538("Expected a node group");
                }
                c1234.m2076();
                return;
            }
            return;
        }
        if (obj != null && this.f3854.m2068() != obj) {
            C7440 c7440 = this.f3844;
            c7440.getClass();
            c7440.m12655(false);
            C7423 c7423 = c7440.f20144.f20152;
            c7423.m12652(C7434.f20133);
            AbstractC4922.m9866(c7423, 0, obj);
        }
        this.f3854.m2076();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m2339() {
        if (this.f3878 != 0) {
            AbstractC1374.m2507("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.f3838) {
            return;
        }
        C1389 c1389M2369 = m2369();
        if (c1389M2369 != null) {
            int i = c1389M2369.f4036;
            if ((i & 128) == 0) {
                c1389M2369.f4036 = i | 16;
            }
        }
        if (this.f3864.isEmpty()) {
            m2340();
        } else {
            m2356();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m2340() {
        C1234 c1234 = this.f3854;
        int i = c1234.f3562;
        this.f3878 = i >= 0 ? c1234.f3554[(i * 5) + 1] & 67108863 : 0;
        c1234.m2074();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m2341() {
        m2342(-127, 0, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2342(int r27, int r28, java.lang.Object r29, java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1324.m2342(int, int, java.lang.Object, java.lang.Object):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final boolean m2343(int i, boolean z) {
        C1389 c1389M2369;
        if ((i & 1) == 0 && (this.f3838 || this.f3850)) {
            InterfaceC1342 interfaceC1342 = this.f3840;
            if (interfaceC1342 != null && (c1389M2369 = m2369()) != null && interfaceC1342.mo852()) {
                int i2 = c1389M2369.f4036;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                c1389M2369.f4036 = i3;
                c1389M2369.f4036 = (this.f3850 ? i2 | 129 : i3 & (-129)) | 256;
                C7423 c7423 = this.f3844.f20144.f20152;
                c7423.m12652(C7445.f20156);
                AbstractC4922.m9866(c7423, 0, c1389M2369);
                this.f3861.mo2325(c1389M2369);
                return false;
            }
        } else if (!z && m2351()) {
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2344() {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1324.m2344():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final Object m2345() {
        boolean z = this.f3838;
        C1353 c1353 = C1369.f3974;
        if (!z) {
            Object objM2078 = this.f3854.m2078();
            if (!this.f3850 || (objM2078 instanceof C1341)) {
                return objM2078 instanceof C1320 ? ((C1320) objM2078).f3824 : objM2078;
            }
        } else if (this.f3872) {
            AbstractC1374.m2507("A call to createNode(), emitNode() or useNode() expected");
            return c1353;
        }
        return c1353;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2346(int r7, int r8, int r9) {
        /*
            r6 = this;
            androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪苏世哲兰 r0 = r6.f3854
            if (r7 != r8) goto L5
            goto L1a
        L5:
            if (r7 == r9) goto L6b
            if (r8 != r9) goto Lb
            goto L6b
        Lb:
            int r1 = r0.m2079(r7)
            if (r1 != r8) goto L14
            r9 = r8
            goto L6b
        L14:
            int r1 = r0.m2079(r8)
            if (r1 != r7) goto L1c
        L1a:
            r9 = r7
            goto L6b
        L1c:
            int r1 = r0.m2079(r7)
            int r2 = r0.m2079(r8)
            if (r1 != r2) goto L2b
            int r9 = r0.m2079(r7)
            goto L6b
        L2b:
            r1 = 0
            r2 = r7
            r3 = r1
        L2e:
            if (r2 <= 0) goto L39
            if (r2 == r9) goto L39
            int r2 = r0.m2079(r2)
            int r3 = r3 + 1
            goto L2e
        L39:
            r2 = r8
            r4 = r1
        L3b:
            if (r2 <= 0) goto L46
            if (r2 == r9) goto L46
            int r2 = r0.m2079(r2)
            int r4 = r4 + 1
            goto L3b
        L46:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4a:
            if (r2 >= r9) goto L53
            int r5 = r0.m2079(r5)
            int r2 = r2 + 1
            goto L4a
        L53:
            int r4 = r4 - r3
            r9 = r8
        L55:
            if (r1 >= r4) goto L5e
            int r9 = r0.m2079(r9)
            int r1 = r1 + 1
            goto L55
        L5e:
            r1 = r9
            r9 = r5
        L60:
            if (r9 == r1) goto L6b
            int r9 = r0.m2079(r9)
            int r1 = r0.m2079(r1)
            goto L60
        L6b:
            if (r7 <= 0) goto L7f
            if (r7 == r9) goto L7f
            boolean r1 = r0.m2086(r7)
            if (r1 == 0) goto L7a
            飘花落叶言子世苏楪兰哲.飘花落叶言子楪世苏兰哲 r1 = r6.f3844
            r1.m12658()
        L7a:
            int r7 = r0.m2079(r7)
            goto L6b
        L7f:
            r6.m2376(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1324.m2346(int, int, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m2347(int i) throws Throwable {
        boolean zM2086 = this.f3854.m2086(i);
        C7440 c7440 = this.f3844;
        if (zM2086) {
            c7440.m12656();
            Object objM2077 = this.f3854.m2077(i);
            c7440.m12656();
            c7440.f20146.add(objM2077);
        }
        m2336(this, i, zM2086, 0);
        c7440.m12656();
        if (zM2086) {
            c7440.m12658();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final Object m2348() {
        boolean z = this.f3838;
        C1353 c1353 = C1369.f3974;
        if (!z) {
            Object objM2078 = this.f3854.m2078();
            if (!this.f3850 || (objM2078 instanceof C1341)) {
                return objM2078;
            }
        } else if (this.f3872) {
            AbstractC1374.m2507("A call to createNode(), emitNode() or useNode() expected");
            return c1353;
        }
        return c1353;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void m2349(C1253 c1253, Object obj) {
        m2342(126665345, 0, null, null);
        m2348();
        m2385(obj);
        long j = this.f3837;
        try {
            this.f3837 = 126665345L;
            if (this.f3838) {
                C1235.m2089(this.f3852);
            }
            boolean z = (this.f3838 || AbstractC4395.m8907(this.f3854.m2068(), c1253)) ? false : true;
            if (z) {
                m2354(c1253);
            }
            m2342(Opcodes.REM_FLOAT_2ADDR, 0, AbstractC1374.f3977, c1253);
            this.f3842 = null;
            boolean z2 = this.f3865;
            this.f3865 = z;
            AbstractC1254.m2190(this, new C1242(-59194059, true, new C1381(obj, 2)));
            this.f3865 = z2;
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m2350(ArrayList arrayList) {
        C1324 c1324 = this;
        C7441 c7441 = c1324.f3857;
        C7440 c7440 = c1324.f3844;
        C7441 c74412 = c7440.f20144;
        try {
            c7440.f20144 = c7441;
            c7441.f20152.m12652(C7427.f20127);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Pair pair = (Pair) arrayList.get(i);
                AbstractC1305 abstractC1305 = (AbstractC1305) pair.component1();
                abstractC1305.getClass();
                C1230 c1230M6851 = AbstractC3066.m6851(null);
                C1233 c1233M2138 = AbstractC1238.m2138(null);
                int iM2065 = c1233M2138.m2065(c1230M6851);
                C1241 c1241 = new C1241();
                c7440.m12657();
                C7423 c7423 = c7440.f20144.f20152;
                c7423.m12652(C7459.f20174);
                AbstractC4922.m9868(c7423, 0, c1241, 1, c1230M6851);
                if (c1233M2138 == c1324.f3853) {
                    if (!c1324.f3852.f3572) {
                        AbstractC1374.m2507("Check failed");
                    }
                    c1324.m2371();
                }
                C1234 c1234M2062 = c1233M2138.m2062();
                try {
                    c1234M2062.m2080(iM2065);
                    c7440.f20140 = iM2065;
                    C7441 c74413 = new C7441();
                    c1324.m2357(null, null, null, EmptyList.INSTANCE, new C0755(c1324, c74413, c1234M2062, abstractC1305));
                    C7441 c74414 = c7440.f20144;
                    c74414.getClass();
                    if (!c74413.f20152.m12653()) {
                        C7423 c74232 = c74414.f20152;
                        c74232.m12652(C7436.f20135);
                        AbstractC4922.m9868(c74232, 0, c74413, 1, c1241);
                    }
                    c1234M2062.m2071();
                    c7440.f20144.f20152.m12652(C7425.f20125);
                    i++;
                    c1324 = this;
                } catch (Throwable th) {
                    c1234M2062.m2071();
                    throw th;
                }
            }
            c7440.m12657();
            c7440.f20144.f20152.m12652(C7448.f20159);
            c7440.f20140 = 0;
            c7440.f20144 = c74412;
        } catch (Throwable th2) {
            c7440.f20144 = c74412;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final boolean m2351() {
        C1389 c1389M2369;
        return (this.f3838 || this.f3850 || this.f3865 || (c1389M2369 = m2369()) == null || (c1389M2369.f4036 & 8) != 0) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C1292 m2352() {
        if (this.f3861.mo2331()) {
            return this.f3836;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean m2353() {
        if (!m2351() || this.f3865) {
            return true;
        }
        C1389 c1389M2369 = m2369();
        return (c1389M2369 == null || (c1389M2369.f4036 & 4) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m2354(C1253 c1253) {
        C0246 c0246 = this.f3868;
        if (c0246 == null) {
            c0246 = new C0246();
            this.f3868 = c0246;
        }
        c0246.m790(this.f3854.f3559, c1253);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m2355() throws Throwable {
        int i;
        m2347(this.f3854.f3559);
        C7440 c7440 = this.f3844;
        c7440.m12655(false);
        C1310 c1310 = c7440.f20142;
        C1324 c1324 = c7440.f20145;
        C1234 c1234 = c1324.f3854;
        if (c1234.f3553 > 0 && c1310.m2309(-2) != (i = c1234.f3562)) {
            if (!c7440.f20143 && c7440.f20141) {
                c7440.m12655(false);
                c7440.f20144.f20152.m12652(C7450.f20161);
                c7440.f20143 = true;
            }
            if (i > 0) {
                C1230 c1230M2073 = c1234.m2073(i);
                c1310.m2307(i);
                c7440.m12655(false);
                C7423 c7423 = c7440.f20144.f20152;
                c7423.m12652(C7453.f20168);
                AbstractC4922.m9866(c7423, 0, c1230M2073);
                c7440.f20143 = true;
            }
        }
        c7440.f20144.f20152.m12652(C7429.f20129);
        int i2 = c7440.f20140;
        C1234 c12342 = c1324.f3854;
        c7440.f20140 = c12342.f3554[(c12342.f3559 * 5) + 3] + i2;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2356() {
        /*
            Method dump skipped, instruction units count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1324.m2356():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0024, B:12:0x002d, B:11:0x002a, B:15:0x0034, B:20:0x0040, B:22:0x0048, B:24:0x004e, B:25:0x0052, B:26:0x0053, B:28:0x0059, B:21:0x0044), top: B:33:0x0005, inners: #1 }] */
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2357(androidx.compose.runtime.C1363 r9, androidx.compose.runtime.C1363 r10, java.lang.Integer r11, java.util.List r12, p052.InterfaceC6543 r13) {
        /*
            r8 = this;
            boolean r0 = r8.f3855
            int r1 = r8.f3877
            r2 = 1
            r8.f3855 = r2     // Catch: java.lang.Throwable -> L28
            r2 = 0
            r8.f3877 = r2     // Catch: java.lang.Throwable -> L28
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L28
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L30
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L28
            kotlin.Pair r6 = (kotlin.Pair) r6     // Catch: java.lang.Throwable -> L28
            java.lang.Object r7 = r6.component1()     // Catch: java.lang.Throwable -> L28
            androidx.compose.runtime.飘花落叶言子苏哲兰世楪 r7 = (androidx.compose.runtime.C1389) r7     // Catch: java.lang.Throwable -> L28
            java.lang.Object r6 = r6.component2()     // Catch: java.lang.Throwable -> L28
            if (r6 == 0) goto L2a
            r8.m2394(r7, r6)     // Catch: java.lang.Throwable -> L28
            goto L2d
        L28:
            r9 = move-exception
            goto L62
        L2a:
            r8.m2394(r7, r5)     // Catch: java.lang.Throwable -> L28
        L2d:
            int r4 = r4 + 1
            goto Lf
        L30:
            if (r9 == 0) goto L59
            if (r11 == 0) goto L39
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L28
            goto L3a
        L39:
            r11 = -1
        L3a:
            if (r10 == 0) goto L53
            if (r10 == r9) goto L53
            if (r11 < 0) goto L53
            r9.f3955 = r10     // Catch: java.lang.Throwable -> L28
            r9.f3954 = r11     // Catch: java.lang.Throwable -> L28
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L4d
            r9.f3955 = r5     // Catch: java.lang.Throwable -> L28
            r9.f3954 = r2     // Catch: java.lang.Throwable -> L28
            goto L57
        L4d:
            r10 = move-exception
            r9.f3955 = r5     // Catch: java.lang.Throwable -> L28
            r9.f3954 = r2     // Catch: java.lang.Throwable -> L28
            throw r10     // Catch: java.lang.Throwable -> L28
        L53:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L28
        L57:
            if (r10 != 0) goto L5d
        L59:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L28
        L5d:
            r8.f3855 = r0
            r8.f3877 = r1
            return r10
        L62:
            r8.f3855 = r0
            r8.f3877 = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1324.m2357(androidx.compose.runtime.飘花落叶言子楪哲世兰苏, androidx.compose.runtime.飘花落叶言子楪哲世兰苏, java.lang.Integer, java.util.List, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final int m2358(int i) {
        int iM2079 = this.f3854.m2079(i) + 1;
        int i2 = 0;
        while (iM2079 < i) {
            if (!this.f3854.m2085(iM2079)) {
                i2++;
            }
            iM2079 += this.f3854.f3554[(iM2079 * 5) + 3];
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final List m2359() {
        AbstractC1372 abstractC1372 = this.f3861;
        InterfaceC1371 interfaceC1371Mo2329 = abstractC1372.mo2329();
        C1363 c1363 = interfaceC1371Mo2329 != null ? (C1363) interfaceC1371Mo2329 : null;
        if (c1363 == null) {
            return EmptyList.INSTANCE;
        }
        C1233 c1233 = c1363.f3962;
        C1234 c1234M2062 = AbstractC1238.m2138(c1233).m2062();
        try {
            Integer numM9889 = AbstractC4922.m9889(c1234M2062, abstractC1372, 0, c1234M2062.f3553);
            if (numM9889 == null) {
                return EmptyList.INSTANCE;
            }
            c1234M2062 = AbstractC1238.m2138(c1233).m2062();
            try {
                ArrayList arrayListM9865 = AbstractC4922.m9865(c1234M2062, numM9889.intValue(), 0);
                c1234M2062.m2071();
                return AbstractC4344.m8793(c1363.f3945.m2359(), arrayListM9865);
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m2360(Object obj) {
        if (AbstractC4395.m8907(m2348(), obj)) {
            return false;
        }
        m2385(obj);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m2361(long j) {
        Object objM2348 = m2348();
        if ((objM2348 instanceof Long) && j == ((Number) objM2348).longValue()) {
            return false;
        }
        m2385(Long.valueOf(j));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m2362(int i) {
        Object objM2348 = m2348();
        if ((objM2348 instanceof Integer) && i == ((Number) objM2348).intValue()) {
            return false;
        }
        m2385(Integer.valueOf(i));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m2363(float f) {
        Object objM2348 = m2348();
        if ((objM2348 instanceof Float) && f == ((Number) objM2348).floatValue()) {
            return false;
        }
        m2385(Float.valueOf(f));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m2364(Object obj, InterfaceC6554 interfaceC6554) {
        if (this.f3838) {
            C7423 c7423 = this.f3839.f20139;
            c7423.m12652(C7433.f20132);
            AbstractC4922.m9866(c7423, 0, obj);
            interfaceC6554.getClass();
            AbstractC4388.m8888(2, interfaceC6554);
            AbstractC4922.m9866(c7423, 1, interfaceC6554);
            return;
        }
        C7440 c7440 = this.f3844;
        c7440.m12657();
        C7423 c74232 = c7440.f20144.f20152;
        c74232.m12652(C7433.f20132);
        interfaceC6554.getClass();
        AbstractC4388.m8888(2, interfaceC6554);
        AbstractC4922.m9868(c74232, 0, obj, 1, interfaceC6554);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2365() {
        m2382();
        this.f3879.clear();
        this.f3869.f3802 = 0;
        this.f3863.f3802 = 0;
        this.f3866.f3802 = 0;
        this.f3868 = null;
        C7439 c7439 = this.f3839;
        c7439.f20138.m12651();
        c7439.f20139.m12651();
        this.f3837 = 0L;
        this.f3848 = 0;
        this.f3872 = false;
        this.f3838 = false;
        this.f3850 = false;
        this.f3855 = false;
        this.f3849 = -1;
        C1234 c1234 = this.f3854;
        if (!c1234.f3550) {
            c1234.m2071();
        }
        if (this.f3852.f3572) {
            return;
        }
        m2371();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m2366() {
        m2377(false);
        this.f3861.mo2315();
        m2377(false);
        C7440 c7440 = this.f3844;
        if (c7440.f20143) {
            c7440.m12655(false);
            c7440.m12655(false);
            c7440.f20144.f20152.m12652(C7449.f20160);
            c7440.f20143 = false;
        }
        c7440.m12657();
        if (c7440.f20142.f3802 != 0) {
            AbstractC1374.m2507("Missed recording an endGroup()");
        }
        if (!this.f3879.isEmpty()) {
            AbstractC1374.m2507("Start/end imbalance");
        }
        m2382();
        this.f3854.m2071();
        this.f3865 = this.f3866.m2308() != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m2367() {
        if (this.f3855 || this.f3849 != 0) {
            AbstractC1392.m2538("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f3849 = -1;
        this.f3850 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC1293 m2368() {
        C1323 c1323 = this.f3834;
        if (c1323 != null) {
            return c1323;
        }
        C1323 c13232 = new C1323(this.f3875);
        this.f3834 = c13232;
        return c13232;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C1389 m2369() {
        if (this.f3848 != 0) {
            return null;
        }
        ArrayList arrayList = this.f3856;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (C1389) AbstractC6183.m11586(1, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m2370(boolean z, C1321 c1321) {
        this.f3879.add(this.f3880);
        this.f3880 = c1321;
        int i = this.f3878;
        C1310 c1310 = this.f3869;
        c1310.m2307(i);
        c1310.m2307(this.f3870);
        c1310.m2307(this.f3877);
        if (z) {
            this.f3877 = 0;
        }
        this.f3878 = 0;
        this.f3870 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m2371() {
        C1233 c1233 = new C1233();
        if (this.f3846) {
            c1233.m2064();
        }
        if (this.f3861.mo2314()) {
            c1233.f3539 = new C0246();
        }
        this.f3853 = c1233;
        C1235 c1235M2063 = c1233.m2063();
        c1235M2063.m2114(true);
        this.f3852 = c1235M2063;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m2372(C0236 c0236, InterfaceC6554 interfaceC6554) {
        ArrayList arrayList = this.f3864;
        if (this.f3855) {
            AbstractC1374.m2507("Reentrant composition is not supported");
        }
        this.f3876.m445();
        Trace.beginSection("Compose:recompose");
        try {
            this.f3847 = Long.hashCode(AbstractC1280.m2280().mo2210());
            this.f3868 = null;
            m2389(c0236);
            this.f3877 = 0;
            this.f3855 = true;
            try {
                m2393();
                Object objM2348 = m2348();
                if (objM2348 != interfaceC6554 && interfaceC6554 != null) {
                    m2385(interfaceC6554);
                }
                C1313 c1313 = this.f3845;
                C1224 c1224M2495 = AbstractC1367.m2495();
                try {
                    c1224M2495.m2047(c1313);
                    C1379 c1379 = AbstractC1374.f3979;
                    if (interfaceC6554 != null) {
                        m2337(200, c1379);
                        AbstractC1254.m2190(this, interfaceC6554);
                        m2377(false);
                    } else if (!this.f3865 || objM2348 == null || objM2348.equals(C1369.f3974)) {
                        m2344();
                    } else {
                        m2337(200, c1379);
                        AbstractC4388.m8888(2, objM2348);
                        AbstractC1254.m2190(this, (InterfaceC6554) objM2348);
                        m2377(false);
                    }
                    c1224M2495.m2053(c1224M2495.f3520 - 1);
                    m2366();
                    this.f3855 = false;
                    arrayList.clear();
                    if (!this.f3852.f3572) {
                        AbstractC1374.m2507("Check failed");
                    }
                    m2371();
                } catch (Throwable th) {
                    c1224M2495.m2053(c1224M2495.f3520 - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C1296 m2373() {
        RandomAccess randomAccess;
        if (!this.f3861.mo2331()) {
            return null;
        }
        ListBuilder listBuilderM11911 = AbstractC6347.m11911();
        C1235 c1235 = this.f3852;
        listBuilderM11911.addAll(AbstractC4922.m9879(c1235, null, c1235.f3570, null));
        C1234 c1234 = this.f3854;
        boolean z = c1234.f3550;
        int[] iArr = c1234.f3554;
        if (z || c1234.f3553 == 0) {
            randomAccess = EmptyList.INSTANCE;
        } else {
            C1300 c1300 = new C1300(c1234);
            int iM2079 = c1234.f3562;
            Object objValueOf = Integer.valueOf(c1234.f3561 - AbstractC1238.m2140(iArr, iM2079));
            while (iM2079 >= 0) {
                c1300.m2302(c1234.m2087(iM2079), c1234.m2085(iM2079) ? c1234.m2082(iArr, iM2079) : C1369.f3974, c1234.f3555.m2066(iM2079), objValueOf);
                objValueOf = c1234.m2073(iM2079);
                iM2079 = c1234.m2079(iM2079);
            }
            randomAccess = c1300.f3783;
        }
        listBuilderM11911.addAll(randomAccess);
        listBuilderM11911.addAll(m2359());
        return new C1296(listBuilderM11911.build(), this.f3846);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m2374() {
        m2377(false);
        C1389 c1389M2369 = m2369();
        if (c1389M2369 != null) {
            int i = c1389M2369.f4036;
            if ((i & 1) != 0) {
                c1389M2369.f4036 = i | 2;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.C1389 m2375() {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1324.m2375():androidx.compose.runtime.飘花落叶言子苏哲兰世楪");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m2376(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        m2376(this.f3854.m2079(i), i2);
        if (this.f3854.m2086(i)) {
            Object objM2077 = this.f3854.m2077(i);
            C7440 c7440 = this.f3844;
            c7440.m12656();
            c7440.f20146.add(objM2077);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2377(boolean r43) {
        /*
            Method dump skipped, instruction units count: 1604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1324.m2377(boolean):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m2378(Object obj) {
        if (m2348() == obj) {
            return false;
        }
        m2385(obj);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m2379(boolean z) {
        Object objM2348 = m2348();
        if ((objM2348 instanceof Boolean) && z == ((Boolean) objM2348).booleanValue()) {
            return false;
        }
        m2385(Boolean.valueOf(z));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m2380(InterfaceC6543 interfaceC6543) {
        if (!this.f3872) {
            AbstractC1374.m2507("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f3872 = false;
        if (!this.f3838) {
            AbstractC1374.m2507("createNode() can only be called when inserting");
        }
        C1310 c1310 = this.f3869;
        int i = c1310.f3803[c1310.f3802 - 1];
        C1235 c1235 = this.f3852;
        C1230 c1230M2117 = c1235.m2117(c1235.f3575);
        this.f3878++;
        C7439 c7439 = this.f3839;
        C7423 c7423 = c7439.f20139;
        c7423.m12652(C7451.f20163);
        AbstractC4922.m9866(c7423, 0, interfaceC6543);
        c7423.f20122[c7423.f20119 - c7423.f20123[c7423.f20121 - 1].f18404] = i;
        AbstractC4922.m9866(c7423, 1, c1230M2117);
        C7423 c74232 = c7439.f20138;
        c74232.m12652(C7451.f20162);
        c74232.f20122[c74232.f20119 - c74232.f20123[c74232.f20121 - 1].f18404] = i;
        AbstractC4922.m9866(c74232, 0, c1230M2117);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C1253 m2381() {
        C1253 c1253;
        C1253 c12532 = this.f3842;
        if (c12532 != null) {
            return c12532;
        }
        int iM2079 = this.f3854.f3562;
        boolean z = this.f3838;
        C1379 c1379 = AbstractC1374.f3977;
        if (z && this.f3851) {
            int iM2112 = this.f3852.f3575;
            while (iM2112 > 0) {
                if (this.f3852.m2120(iM2112) == 202 && AbstractC4395.m8907(this.f3852.m2119(iM2112), c1379)) {
                    Object objM2127 = this.f3852.m2127(iM2112);
                    objM2127.getClass();
                    C1253 c12533 = (C1253) objM2127;
                    this.f3842 = c12533;
                    return c12533;
                }
                C1235 c1235 = this.f3852;
                iM2112 = c1235.m2112(c1235.f3568, iM2112);
            }
        }
        if (this.f3854.f3553 > 0) {
            while (iM2079 > 0) {
                if (this.f3854.m2087(iM2079) == 202) {
                    C1234 c1234 = this.f3854;
                    if (AbstractC4395.m8907(c1234.m2082(c1234.f3554, iM2079), c1379)) {
                        C0246 c0246 = this.f3868;
                        if (c0246 == null || (c1253 = (C1253) c0246.m833(iM2079)) == null) {
                            C1234 c12342 = this.f3854;
                            Object objM2072 = c12342.m2072(c12342.f3554, iM2079);
                            objM2072.getClass();
                            c1253 = (C1253) objM2072;
                        }
                        this.f3842 = c1253;
                        return c1253;
                    }
                }
                iM2079 = this.f3854.m2079(iM2079);
            }
        }
        C1253 c12534 = this.f3867;
        this.f3842 = c12534;
        return c12534;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m2382() {
        this.f3880 = null;
        this.f3877 = 0;
        this.f3878 = 0;
        this.f3837 = 0L;
        this.f3872 = false;
        C7440 c7440 = this.f3844;
        c7440.f20143 = false;
        c7440.f20142.f3802 = 0;
        c7440.f20140 = 0;
        c7440.f20141 = true;
        c7440.f20147 = 0;
        c7440.f20146.clear();
        c7440.f20150 = -1;
        c7440.f20151 = -1;
        c7440.f20148 = -1;
        c7440.f20149 = 0;
        this.f3856.clear();
        this.f3873 = null;
        this.f3874 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object m2383(AbstractC1390 abstractC1390) {
        return AbstractC1367.m2482(m2381(), abstractC1390);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final int m2384(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.f3873;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.f3854.m2081(i) : i2;
        }
        C0248 c0248 = this.f3874;
        if (c0248 != null && c0248.m799(i) >= 0) {
            int iM799 = c0248.m799(i);
            if (iM799 >= 0) {
                return c0248.f907[iM799];
            }
            C4211.m8617(AbstractC6183.m11588(i, "Cannot find value for key "));
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final void m2385(Object obj) {
        if (this.f3838) {
            C1235 c1235 = this.f3852;
            if (c1235.f3576 <= 0 || c1235.f3586 == c1235.f3584) {
                c1235.m2111(obj);
                return;
            }
            C0246 c0246 = c1235.f3571;
            if (c0246 == null) {
                c0246 = new C0246();
            }
            c1235.f3571 = c0246;
            int i = c1235.f3575;
            Object objM833 = c0246.m833(i);
            if (objM833 == null) {
                objM833 = new C0244();
                c0246.m790(i, objM833);
            }
            ((C0244) objM833).m775(obj);
            return;
        }
        C1234 c1234 = this.f3854;
        boolean z = c1234.f3556;
        C7440 c7440 = this.f3844;
        if (!z) {
            C1230 c1230M2073 = c1234.m2073(c1234.f3562);
            C7423 c7423 = c7440.f20144.f20152;
            c7423.m12652(C7437.f20136);
            AbstractC4922.m9868(c7423, 0, c1230M2073, 1, obj);
            return;
        }
        int iM2140 = (c1234.f3561 - AbstractC1238.m2140(c1234.f3554, c1234.f3562)) - 1;
        if (c7440.f20145.f3854.f3562 - c7440.f20140 >= 0) {
            c7440.m12655(true);
            C7423 c74232 = c7440.f20144.f20152;
            c74232.m12652(C7451.f20164);
            AbstractC4922.m9866(c74232, 0, obj);
            c74232.f20122[c74232.f20119 - c74232.f20123[c74232.f20121 - 1].f18404] = iM2140;
            return;
        }
        C1234 c12342 = this.f3854;
        C1230 c1230M20732 = c12342.m2073(c12342.f3562);
        C7423 c74233 = c7440.f20144.f20152;
        c74233.m12652(C7451.f20165);
        AbstractC4922.m9868(c74233, 0, obj, 1, c1230M20732);
        c74233.f20122[c74233.f20119 - c74233.f20123[c74233.f20121 - 1].f18404] = iM2140;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final void m2386(Object obj) {
        if (obj instanceof InterfaceC1339) {
            C1320 c1320 = new C1320((InterfaceC1339) obj, this.f3870 - 1);
            if (this.f3838) {
                C7423 c7423 = this.f3844.f20144.f20152;
                c7423.m12652(C7444.f20155);
                AbstractC4922.m9866(c7423, 0, c1320);
            }
            this.f3859.add(obj);
            obj = c1320;
        }
        m2385(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final void m2387(int i, int i2) {
        int iM2384 = m2384(i);
        if (iM2384 != i2) {
            int i3 = i2 - iM2384;
            ArrayList arrayList = this.f3879;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iM23842 = m2384(i) + i3;
                m2388(i, iM23842);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        C1321 c1321 = (C1321) arrayList.get(i4);
                        if (c1321 != null && c1321.m2335(i, iM23842)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                C1234 c1234 = this.f3854;
                if (i < 0) {
                    i = c1234.f3562;
                } else if (c1234.m2086(i)) {
                    return;
                } else {
                    i = this.f3854.m2079(i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void m2388(int i, int i2) {
        if (m2384(i) != i2) {
            if (i < 0) {
                C0248 c0248 = this.f3874;
                if (c0248 == null) {
                    c0248 = new C0248();
                    this.f3874 = c0248;
                }
                c0248.m796(i, i2);
                return;
            }
            int[] iArr = this.f3873;
            if (iArr == null) {
                iArr = new int[this.f3854.f3553];
                AbstractC4347.m8830(iArr, -1, 0, 6);
                this.f3873 = iArr;
            }
            iArr[i] = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2389(androidx.collection.C0236 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.ArrayList r0 = r0.f3864
            int r2 = p034.AbstractC6347.m11901(r0)
        La:
            r4 = -1
            if (r4 >= r2) goto L36
            java.lang.Object r4 = r0.get(r2)
            androidx.compose.runtime.飘花落叶言子世哲楪兰苏 r4 = (androidx.compose.runtime.C1309) r4
            androidx.compose.runtime.飘花落叶言子苏哲兰世楪 r5 = r4.f3801
            androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪世苏兰哲 r5 = r5.f4035
            if (r5 == 0) goto L1e
            androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪世苏兰哲 r3 = com.bumptech.glide.AbstractC3066.m6851(r5)
            goto L1f
        L1e:
            r3 = 0
        L1f:
            if (r3 == 0) goto L30
            boolean r5 = r3.m2061()
            if (r5 == 0) goto L30
            int r5 = r4.f3800
            int r3 = r3.f3534
            if (r5 == r3) goto L33
            r4.f3800 = r3
            goto L33
        L30:
            r0.remove(r2)
        L33:
            int r2 = r2 + (-1)
            goto La
        L36:
            java.lang.Object[] r2 = r1.f880
            java.lang.Object[] r4 = r1.f879
            long[] r1 = r1.f881
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L96
            r6 = 0
            r7 = r6
        L43:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L91
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L5d:
            if (r12 >= r10) goto L8f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L8b
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            r13 = r4[r13]
            r14.getClass()
            androidx.compose.runtime.飘花落叶言子苏哲兰世楪 r14 = (androidx.compose.runtime.C1389) r14
            androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪世苏兰哲 r15 = r14.f4035
            if (r15 == 0) goto L8b
            androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪世苏兰哲 r15 = com.bumptech.glide.AbstractC3066.m6851(r15)
            int r15 = r15.f3534
            androidx.compose.runtime.飘花落叶言子楪世哲兰苏 r3 = androidx.compose.runtime.C1353.f3921
            if (r13 != r3) goto L83
            r13 = 0
        L83:
            androidx.compose.runtime.飘花落叶言子世哲楪兰苏 r3 = new androidx.compose.runtime.飘花落叶言子世哲楪兰苏
            r3.<init>(r14, r15, r13)
            r0.add(r3)
        L8b:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L5d
        L8f:
            if (r10 != r11) goto L96
        L91:
            if (r7 == r5) goto L96
            int r7 = r7 + 1
            goto L43
        L96:
            androidx.compose.foundation.lazy.layout.飘花落叶言子楪世苏哲兰 r1 = androidx.compose.runtime.AbstractC1367.f3972
            kotlin.collections.AbstractC4336.m8766(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1324.m2389(androidx.collection.飘花落叶言子世兰楪苏哲):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final void m2390() {
        if (!this.f3872) {
            AbstractC1374.m2507("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f3872 = false;
        if (this.f3838) {
            AbstractC1374.m2507("useNode() called while inserting");
        }
        C1234 c1234 = this.f3854;
        Object objM2077 = c1234.m2077(c1234.f3562);
        C7440 c7440 = this.f3844;
        c7440.m12656();
        c7440.f20146.add(objM2077);
        if (this.f3850 && (objM2077 instanceof InterfaceC1370)) {
            c7440.m12657();
            c7440.f20144.f20152.m12652(C7431.f20130);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.C1324 m2391(int r7) {
        /*
            r6 = this;
            r6.m2392(r7)
            boolean r7 = r6.f3838
            androidx.appcompat.app.飘花落叶言子苏楪哲兰世 r0 = r6.f3876
            java.util.ArrayList r1 = r6.f3856
            androidx.compose.runtime.飘花落叶言子楪哲世兰苏 r2 = r6.f3875
            if (r7 == 0) goto L26
            androidx.compose.runtime.飘花落叶言子苏哲兰世楪 r7 = new androidx.compose.runtime.飘花落叶言子苏哲兰世楪
            r7.<init>(r2)
            r1.add(r7)
            r6.m2385(r7)
            int r1 = r6.f3847
            r7.f4033 = r1
            int r1 = r7.f4036
            r1 = r1 & (-17)
            r7.f4036 = r1
            r0.m445()
            return r6
        L26:
            androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪苏世哲兰 r7 = r6.f3854
            int r7 = r7.f3562
            java.util.ArrayList r3 = r6.f3864
            int r7 = androidx.compose.runtime.AbstractC1367.m2489(r7, r3)
            if (r7 < 0) goto L39
            java.lang.Object r7 = r3.remove(r7)
            androidx.compose.runtime.飘花落叶言子世哲楪兰苏 r7 = (androidx.compose.runtime.C1309) r7
            goto L3a
        L39:
            r7 = 0
        L3a:
            androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪苏世哲兰 r3 = r6.f3854
            java.lang.Object r3 = r3.m2078()
            androidx.compose.runtime.飘花落叶言子楪世哲兰苏 r4 = androidx.compose.runtime.C1369.f3974
            boolean r4 = kotlin.jvm.internal.AbstractC4395.m8907(r3, r4)
            if (r4 == 0) goto L51
            androidx.compose.runtime.飘花落叶言子苏哲兰世楪 r3 = new androidx.compose.runtime.飘花落叶言子苏哲兰世楪
            r3.<init>(r2)
            r6.m2385(r3)
            goto L56
        L51:
            r3.getClass()
            androidx.compose.runtime.飘花落叶言子苏哲兰世楪 r3 = (androidx.compose.runtime.C1389) r3
        L56:
            r2 = 0
            r4 = 1
            if (r7 != 0) goto L6e
            int r7 = r3.f4036
            r5 = r7 & 64
            if (r5 == 0) goto L62
            r5 = r4
            goto L63
        L62:
            r5 = r2
        L63:
            if (r5 == 0) goto L69
            r7 = r7 & (-65)
            r3.f4036 = r7
        L69:
            if (r5 == 0) goto L6c
            goto L6e
        L6c:
            r7 = r2
            goto L6f
        L6e:
            r7 = r4
        L6f:
            int r5 = r3.f4036
            if (r7 == 0) goto L76
            r7 = r5 | 8
            goto L78
        L76:
            r7 = r5 & (-9)
        L78:
            r3.f4036 = r7
            r1.add(r3)
            int r7 = r6.f3847
            r3.f4033 = r7
            int r7 = r3.f4036
            r7 = r7 & (-17)
            r3.f4036 = r7
            r0.m445()
            int r7 = r3.f4036
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto Lba
            r7 = r7 & (-257(0xfffffffffffffeff, float:NaN))
            r7 = r7 | 512(0x200, float:7.17E-43)
            r3.f4036 = r7
            飘花落叶言子世苏楪兰哲.飘花落叶言子楪世苏兰哲 r7 = r6.f3844
            飘花落叶言子世苏楪兰哲.飘花落叶言子楪世苏哲兰 r7 = r7.f20144
            飘花落叶言子世苏楪兰哲.飘花落叶言子世哲楪苏兰 r7 = r7.f20152
            飘花落叶言子世苏楪兰哲.飘花落叶言子世楪兰哲苏 r0 = p126.C7424.f20124
            r7.m12652(r0)
            kotlin.reflect.jvm.internal.types.AbstractC4922.m9866(r7, r2, r3)
            boolean r7 = r6.f3850
            if (r7 != 0) goto Lba
            int r7 = r3.f4036
            r0 = r7 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto Lba
            r6.f3850 = r4
            androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪苏世哲兰 r0 = r6.f3854
            int r0 = r0.f3562
            r6.f3849 = r0
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r3.f4036 = r7
        Lba:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1324.m2391(int):androidx.compose.runtime.飘花落叶言子世苏楪哲兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final void m2392(int i) {
        int i2;
        int i3;
        if (this.f3880 != null) {
            m2342(i, 0, null, null);
            return;
        }
        if (this.f3872) {
            AbstractC1374.m2507("A call to createNode(), emitNode() or useNode() expected");
        }
        this.f3837 = Long.rotateLeft(Long.rotateLeft(this.f3837, 3) ^ ((long) i), 3) ^ ((long) this.f3870);
        this.f3870++;
        C1234 c1234 = this.f3854;
        boolean z = this.f3838;
        C1353 c1353 = C1369.f3974;
        if (z) {
            c1234.f3560++;
            this.f3852.m2093(i, c1353, c1353, false);
            m2370(false, null);
            return;
        }
        if (c1234.m2084() == i && ((i3 = c1234.f3559) >= c1234.f3558 || (c1234.f3554[(i3 * 5) + 1] & 536870912) == 0)) {
            c1234.m2076();
            m2370(false, null);
            return;
        }
        if (c1234.f3560 <= 0 && (i2 = c1234.f3559) != c1234.f3558) {
            int i4 = this.f3877;
            m2355();
            this.f3844.m12654(i4, c1234.m2075());
            AbstractC1367.m2503(this.f3864, i2, c1234.f3559);
        }
        c1234.f3560++;
        this.f3838 = true;
        this.f3842 = null;
        if (this.f3852.f3572) {
            C1235 c1235M2063 = this.f3853.m2063();
            this.f3852 = c1235M2063;
            c1235M2063.m2101();
            this.f3851 = false;
            this.f3842 = null;
        }
        C1235 c1235 = this.f3852;
        c1235.m2115();
        int i5 = c1235.f3570;
        c1235.m2093(i, c1353, c1353, false);
        this.f3843 = c1235.m2117(i5);
        m2370(false, null);
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
    public final void m2393() {
        this.f3870 = 0;
        this.f3854 = this.f3860.m2062();
        m2342(100, 0, null, null);
        AbstractC1372 abstractC1372 = this.f3861;
        abstractC1372.mo2318();
        C1253 c1253Mo2333 = abstractC1372.mo2333();
        this.f3866.m2307(this.f3865 ? 1 : 0);
        this.f3865 = m2360(c1253Mo2333);
        this.f3842 = null;
        if (!this.f3871) {
            this.f3871 = abstractC1372.mo2313();
        }
        if (!this.f3846) {
            this.f3846 = abstractC1372.mo2312();
        }
        if (this.f3846) {
            C1334 c1334 = AbstractC1291.f3778;
            c1334.getClass();
            c1253Mo2333 = c1253Mo2333.m2186(c1334, new C1338(m2352()));
        }
        this.f3867 = c1253Mo2333;
        Set set = (Set) AbstractC1367.m2482(c1253Mo2333, AbstractC1298.f3786);
        if (set != null) {
            set.add(m2368());
            abstractC1372.mo2327(set);
        }
        m2342(Long.hashCode(abstractC1372.mo2330()), 0, null, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final boolean m2394(C1389 c1389, Object obj) {
        C1230 c1230 = c1389.f4035;
        if (c1230 == null) {
            return false;
        }
        int iM2065 = this.f3854.f3555.m2065(AbstractC3066.m6851(c1230));
        if (!this.f3855 || iM2065 < this.f3854.f3559) {
            return false;
        }
        ArrayList arrayList = this.f3864;
        int iM2489 = AbstractC1367.m2489(iM2065, arrayList);
        if (iM2489 < 0) {
            int i = -(iM2489 + 1);
            if (!(obj instanceof C1362)) {
                obj = null;
            }
            arrayList.add(i, new C1309(c1389, iM2065, obj));
            return true;
        }
        C1309 c1309 = (C1309) arrayList.get(iM2489);
        if (!(obj instanceof C1362)) {
            c1309.f3799 = null;
            return true;
        }
        Object obj2 = c1309.f3799;
        if (obj2 == null) {
            c1309.f3799 = obj;
            return true;
        }
        if (obj2 instanceof C0235) {
            ((C0235) obj2).m741(obj);
            return true;
        }
        C0235 c0235 = AbstractC0285.f997;
        C0235 c02352 = new C0235(2);
        c02352.m745(obj2);
        c02352.m745(obj);
        c1309.f3799 = c02352;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final void m2395(Object obj) {
        if (!this.f3838 && this.f3854.m2084() == 207 && !AbstractC4395.m8907(this.f3854.m2068(), obj) && this.f3849 < 0) {
            this.f3849 = this.f3854.f3559;
            this.f3850 = true;
        }
        m2342(Opcodes.REM_DOUBLE_2ADDR, 0, null, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final void m2396() {
        m2342(125, 2, null, null);
        this.f3872 = true;
    }
}
