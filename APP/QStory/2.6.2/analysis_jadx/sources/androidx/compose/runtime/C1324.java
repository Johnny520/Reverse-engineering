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
import com.bumptech.glide.AbstractC3054;
import com.bumptech.glide.AbstractC3065;
import io.ktor.util.C4210;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4346;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4359;
import kotlin.jvm.internal.AbstractC4387;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p007.AbstractC6136;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p126.C7422;
import p126.C7424;
import p126.C7426;
import p126.C7428;
import p126.C7430;
import p126.C7432;
import p126.C7433;
import p126.C7435;
import p126.C7436;
import p126.C7438;
import p126.C7439;
import p126.C7440;
import p126.C7443;
import p126.C7444;
import p126.C7447;
import p126.C7448;
import p126.C7449;
import p126.C7450;
import p126.C7452;
import p126.C7458;
import p253.AbstractC8189;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1324 implements InterfaceC1373 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public C1323 f3833;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final InterfaceC4359 f3834;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final C1292 f3835;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public long f3836;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f3837;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public C7438 f3838;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public InterfaceC1342 f3839;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public C7440 f3840;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public C1253 f3841;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public C1230 f3842;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final C7439 f3843;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final C1313 f3844;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public boolean f3845;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f3846;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f3847;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f3849;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public boolean f3850;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C1235 f3851;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public C1233 f3852;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C1234 f3853;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public boolean f3854;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final ArrayList f3855;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C7440 f3856;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C7440 f3857;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0237 f3858;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1233 f3859;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC1372 f3860;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1778 f3861;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f3864;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C0246 f3867;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public int f3869;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f3870;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f3871;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int[] f3872;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C0248 f3873;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C1363 f3874;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C0113 f3875;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f3876;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f3877;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C1321 f3879;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f3878 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C1310 f3868 = new C1310();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ArrayList f3863 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C1310 f3862 = new C1310();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C1253 f3866 = C1253.f3640;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C1310 f3865 = new C1310();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f3848 = -1;

    public C1324(C1778 c1778, AbstractC1372 abstractC1372, C1233 c1233, C0237 c0237, C7440 c7440, C7440 c74402, C0113 c0113, C1363 c1363) {
        this.f3861 = c1778;
        this.f3860 = abstractC1372;
        this.f3859 = c1233;
        this.f3858 = c0237;
        this.f3857 = c7440;
        this.f3856 = c74402;
        this.f3875 = c0113;
        this.f3874 = c1363;
        this.f3845 = abstractC1372.mo2302() || abstractC1372.mo2304();
        this.f3844 = new C1313(this, 0);
        this.f3855 = new ArrayList();
        C1234 c1234M2052 = c1233.m2052();
        c1234M2052.m2061();
        this.f3853 = c1234M2052;
        C1233 c12332 = new C1233();
        if (abstractC1372.mo2302()) {
            c12332.m2054();
        }
        if (abstractC1372.mo2304()) {
            c12332.f3538 = new C0246();
        }
        this.f3852 = c12332;
        C1235 c1235M2053 = c12332.m2053();
        c1235M2053.m2104(true);
        this.f3851 = c1235M2053;
        this.f3843 = new C7439(this, c7440);
        C1234 c1234M20522 = this.f3852.m2052();
        try {
            C1230 c1230M2063 = c1234M20522.m2063(0);
            c1234M20522.m2061();
            this.f3842 = c1230M2063;
            this.f3838 = new C7438();
            this.f3835 = new C1292(this);
            InterfaceC4359 interfaceC4359Mo2324 = abstractC1372.mo2324();
            InterfaceC4359 interfaceC4359M2342 = m2342();
            this.f3834 = interfaceC4359Mo2324.plus(interfaceC4359M2342 == null ? EmptyCoroutineContext.INSTANCE : interfaceC4359M2342);
        } catch (Throwable th) {
            c1234M20522.m2061();
            throw th;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static final int m2326(C1324 c1324, int i, boolean z, int i2) throws Throwable {
        int i3;
        long[] jArr;
        int i4;
        long[] jArr2;
        int i5;
        int i6;
        C1234 c1234;
        C1234 c12342 = c1324.f3853;
        int i7 = 0;
        if (c12342.m2078(i)) {
            int iM2077 = c12342.m2077(i);
            Object objM2072 = c12342.m2072(c12342.f3553, i);
            if (iM2077 == 206 && AbstractC4394.m8917(objM2072, AbstractC1374.f3974)) {
                Object objM2073 = c12342.m2073(i, 0);
                C1320 c1320 = objM2073 instanceof C1320 ? (C1320) objM2073 : null;
                InterfaceC1339 interfaceC1339 = c1320 != null ? c1320.f3823 : null;
                C1315 c1315 = interfaceC1339 instanceof C1315 ? (C1315) interfaceC1339 : null;
                if (c1315 != null) {
                    C0235 c0235 = c1315.f3817.f3811;
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
                                        C1233 c1233 = c13242.f3859;
                                        if (c1233.f3543 <= 0 || (c1233.f3544[1] & 67108864) == 0) {
                                            jArr2 = jArr3;
                                            i5 = i7;
                                            i6 = i9;
                                        } else {
                                            C1363 c1363 = c13242.f3874;
                                            synchronized (c1363.f3958) {
                                                c1363.m2451();
                                                i6 = i9;
                                                C0236 c0236 = c1363.f3946;
                                                c1363.f3946 = AbstractC3054.m6614();
                                                try {
                                                    c1363.f3944.m2379(c0236);
                                                } finally {
                                                }
                                            }
                                            C7440 c7440 = new C7440();
                                            c13242.f3840 = c7440;
                                            C1234 c1234M2052 = c13242.f3859.m2052();
                                            try {
                                                c13242.f3853 = c1234M2052;
                                                C7439 c7439 = c13242.f3843;
                                                C7440 c74402 = c7439.f20149;
                                                try {
                                                    c7439.f20149 = c7440;
                                                    c13242.m2337(0);
                                                    C7439 c74392 = c13242.f3843;
                                                    c74392.m12630();
                                                    jArr2 = jArr3;
                                                    try {
                                                        if (c74392.f20148) {
                                                            c1234 = c1234M2052;
                                                            try {
                                                                c74392.f20149.f20157.m12623(C7424.f20130);
                                                                if (c74392.f20148) {
                                                                    c74392.m12628(false);
                                                                    c74392.m12628(false);
                                                                    c74392.f20149.f20157.m12623(C7448.f20165);
                                                                    i5 = 0;
                                                                    c74392.f20148 = false;
                                                                }
                                                                c7439.f20149 = c74402;
                                                                c1234.m2061();
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                c7439.f20149 = c74402;
                                                                throw th;
                                                            }
                                                        } else {
                                                            c1234 = c1234M2052;
                                                        }
                                                        c7439.f20149 = c74402;
                                                        c1234.m2061();
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        c1234.m2061();
                                                        throw th;
                                                    }
                                                    i5 = 0;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    c1234 = c1234M2052;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                c1234 = c1234M2052;
                                            }
                                        }
                                        c1324.f3860.mo2316(c13242.f3874);
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
                return c12342.m2071(i);
            }
            i3 = 1;
            if (!c12342.m2076(i)) {
                return c12342.m2071(i);
            }
        } else {
            i3 = 1;
            if (c12342.m2060(i)) {
                int i12 = c12342.f3553[(i * 5) + 3] + i;
                int iM2326 = 0;
                for (int i13 = i + 1; i13 < i12; i13 += c12342.f3553[(i13 * 5) + 3]) {
                    boolean zM2076 = c12342.m2076(i13);
                    if (zM2076) {
                        c1324.f3843.m12629();
                        C7439 c74393 = c1324.f3843;
                        Object objM2067 = c12342.m2067(i13);
                        c74393.m12629();
                        c74393.f20151.add(objM2067);
                    }
                    iM2326 += m2326(c1324, i13, zM2076 || z, zM2076 ? 0 : i2 + iM2326);
                    if (zM2076) {
                        c1324.f3843.m12629();
                        c1324.f3843.m12631();
                    }
                }
                if (!c12342.m2076(i)) {
                    return iM2326;
                }
            } else if (!c12342.m2076(i)) {
                return c12342.m2071(i);
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m2327(int i, C1379 c1379) {
        m2332(i, 0, c1379, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m2328(Object obj, boolean z) {
        if (z) {
            C1234 c1234 = this.f3853;
            if (c1234.f3559 <= 0) {
                if ((c1234.f3553[(c1234.f3558 * 5) + 1] & 1073741824) == 0) {
                    AbstractC1392.m2528("Expected a node group");
                }
                c1234.m2066();
                return;
            }
            return;
        }
        if (obj != null && this.f3853.m2058() != obj) {
            C7439 c7439 = this.f3843;
            c7439.getClass();
            c7439.m12628(false);
            C7422 c7422 = c7439.f20149.f20157;
            c7422.m12623(C7433.f20138);
            AbstractC3054.m6592(c7422, 0, obj);
        }
        this.f3853.m2066();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m2329() {
        if (this.f3877 != 0) {
            AbstractC1374.m2497("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.f3837) {
            return;
        }
        C1389 c1389M2359 = m2359();
        if (c1389M2359 != null) {
            int i = c1389M2359.f4035;
            if ((i & 128) == 0) {
                c1389M2359.f4035 = i | 16;
            }
        }
        if (this.f3863.isEmpty()) {
            m2330();
        } else {
            m2346();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m2330() {
        C1234 c1234 = this.f3853;
        int i = c1234.f3561;
        this.f3877 = i >= 0 ? c1234.f3553[(i * 5) + 1] & 67108863 : 0;
        c1234.m2064();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m2331() {
        m2332(-127, 0, null, null);
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
    public final void m2332(int r27, int r28, java.lang.Object r29, java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1324.m2332(int, int, java.lang.Object, java.lang.Object):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final boolean m2333(int i, boolean z) {
        C1389 c1389M2359;
        if ((i & 1) == 0 && (this.f3837 || this.f3849)) {
            InterfaceC1342 interfaceC1342 = this.f3839;
            if (interfaceC1342 != null && (c1389M2359 = m2359()) != null && interfaceC1342.mo851()) {
                int i2 = c1389M2359.f4035;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                c1389M2359.f4035 = i3;
                c1389M2359.f4035 = (this.f3849 ? i2 | 129 : i3 & (-129)) | 256;
                C7422 c7422 = this.f3843.f20149.f20157;
                c7422.m12623(C7444.f20161);
                AbstractC3054.m6592(c7422, 0, c1389M2359);
                this.f3860.mo2315(c1389M2359);
                return false;
            }
        } else if (!z && m2341()) {
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
    public final void m2334() {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1324.m2334():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final Object m2335() {
        boolean z = this.f3837;
        C1353 c1353 = C1369.f3973;
        if (!z) {
            Object objM2068 = this.f3853.m2068();
            if (!this.f3849 || (objM2068 instanceof C1341)) {
                return objM2068 instanceof C1320 ? ((C1320) objM2068).f3823 : objM2068;
            }
        } else if (this.f3871) {
            AbstractC1374.m2497("A call to createNode(), emitNode() or useNode() expected");
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
    public final void m2336(int r7, int r8, int r9) {
        /*
            r6 = this;
            androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪苏世哲兰 r0 = r6.f3853
            if (r7 != r8) goto L5
            goto L1a
        L5:
            if (r7 == r9) goto L6b
            if (r8 != r9) goto Lb
            goto L6b
        Lb:
            int r1 = r0.m2069(r7)
            if (r1 != r8) goto L14
            r9 = r8
            goto L6b
        L14:
            int r1 = r0.m2069(r8)
            if (r1 != r7) goto L1c
        L1a:
            r9 = r7
            goto L6b
        L1c:
            int r1 = r0.m2069(r7)
            int r2 = r0.m2069(r8)
            if (r1 != r2) goto L2b
            int r9 = r0.m2069(r7)
            goto L6b
        L2b:
            r1 = 0
            r2 = r7
            r3 = r1
        L2e:
            if (r2 <= 0) goto L39
            if (r2 == r9) goto L39
            int r2 = r0.m2069(r2)
            int r3 = r3 + 1
            goto L2e
        L39:
            r2 = r8
            r4 = r1
        L3b:
            if (r2 <= 0) goto L46
            if (r2 == r9) goto L46
            int r2 = r0.m2069(r2)
            int r4 = r4 + 1
            goto L3b
        L46:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4a:
            if (r2 >= r9) goto L53
            int r5 = r0.m2069(r5)
            int r2 = r2 + 1
            goto L4a
        L53:
            int r4 = r4 - r3
            r9 = r8
        L55:
            if (r1 >= r4) goto L5e
            int r9 = r0.m2069(r9)
            int r1 = r1 + 1
            goto L55
        L5e:
            r1 = r9
            r9 = r5
        L60:
            if (r9 == r1) goto L6b
            int r9 = r0.m2069(r9)
            int r1 = r0.m2069(r1)
            goto L60
        L6b:
            if (r7 <= 0) goto L7f
            if (r7 == r9) goto L7f
            boolean r1 = r0.m2076(r7)
            if (r1 == 0) goto L7a
            飘花落叶言子世苏楪兰哲.飘花落叶言子楪世苏兰哲 r1 = r6.f3843
            r1.m12631()
        L7a:
            int r7 = r0.m2069(r7)
            goto L6b
        L7f:
            r6.m2366(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1324.m2336(int, int, int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m2337(int i) throws Throwable {
        boolean zM2076 = this.f3853.m2076(i);
        C7439 c7439 = this.f3843;
        if (zM2076) {
            c7439.m12629();
            Object objM2067 = this.f3853.m2067(i);
            c7439.m12629();
            c7439.f20151.add(objM2067);
        }
        m2326(this, i, zM2076, 0);
        c7439.m12629();
        if (zM2076) {
            c7439.m12631();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final Object m2338() {
        boolean z = this.f3837;
        C1353 c1353 = C1369.f3973;
        if (!z) {
            Object objM2068 = this.f3853.m2068();
            if (!this.f3849 || (objM2068 instanceof C1341)) {
                return objM2068;
            }
        } else if (this.f3871) {
            AbstractC1374.m2497("A call to createNode(), emitNode() or useNode() expected");
            return c1353;
        }
        return c1353;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void m2339(C1253 c1253, Object obj) {
        m2332(126665345, 0, null, null);
        m2338();
        m2375(obj);
        long j = this.f3836;
        try {
            this.f3836 = 126665345L;
            if (this.f3837) {
                C1235.m2079(this.f3851);
            }
            boolean z = (this.f3837 || AbstractC4394.m8917(this.f3853.m2058(), c1253)) ? false : true;
            if (z) {
                m2344(c1253);
            }
            m2332(Opcodes.REM_FLOAT_2ADDR, 0, AbstractC1374.f3976, c1253);
            this.f3841 = null;
            boolean z2 = this.f3864;
            this.f3864 = z;
            AbstractC1254.m2180(this, new C1242(-59194059, true, new C1381(obj, 2)));
            this.f3864 = z2;
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m2340(ArrayList arrayList) {
        C1324 c1324 = this;
        C7440 c7440 = c1324.f3856;
        C7439 c7439 = c1324.f3843;
        C7440 c74402 = c7439.f20149;
        try {
            c7439.f20149 = c7440;
            c7440.f20157.m12623(C7426.f20132);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Pair pair = (Pair) arrayList.get(i);
                AbstractC1305 abstractC1305 = (AbstractC1305) pair.component1();
                abstractC1305.getClass();
                C1230 c1230M6840 = AbstractC3065.m6840(null);
                C1233 c1233M2128 = AbstractC1238.m2128(null);
                int iM2055 = c1233M2128.m2055(c1230M6840);
                C1241 c1241 = new C1241();
                c7439.m12630();
                C7422 c7422 = c7439.f20149.f20157;
                c7422.m12623(C7458.f20179);
                AbstractC3054.m6591(c7422, 0, c1241, 1, c1230M6840);
                if (c1233M2128 == c1324.f3852) {
                    if (!c1324.f3851.f3571) {
                        AbstractC1374.m2497("Check failed");
                    }
                    c1324.m2361();
                }
                C1234 c1234M2052 = c1233M2128.m2052();
                try {
                    c1234M2052.m2070(iM2055);
                    c7439.f20145 = iM2055;
                    C7440 c74403 = new C7440();
                    c1324.m2347(null, null, null, EmptyList.INSTANCE, new C0755(c1324, c74403, c1234M2052, abstractC1305));
                    C7440 c74404 = c7439.f20149;
                    c74404.getClass();
                    if (!c74403.f20157.m12625()) {
                        C7422 c74222 = c74404.f20157;
                        c74222.m12623(C7435.f20140);
                        AbstractC3054.m6591(c74222, 0, c74403, 1, c1241);
                    }
                    c1234M2052.m2061();
                    c7439.f20149.f20157.m12623(C7424.f20130);
                    i++;
                    c1324 = this;
                } catch (Throwable th) {
                    c1234M2052.m2061();
                    throw th;
                }
            }
            c7439.m12630();
            c7439.f20149.f20157.m12623(C7447.f20164);
            c7439.f20145 = 0;
            c7439.f20149 = c74402;
        } catch (Throwable th2) {
            c7439.f20149 = c74402;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final boolean m2341() {
        C1389 c1389M2359;
        return (this.f3837 || this.f3849 || this.f3864 || (c1389M2359 = m2359()) == null || (c1389M2359.f4035 & 8) != 0) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C1292 m2342() {
        if (this.f3860.mo2321()) {
            return this.f3835;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final boolean m2343() {
        if (!m2341() || this.f3864) {
            return true;
        }
        C1389 c1389M2359 = m2359();
        return (c1389M2359 == null || (c1389M2359.f4035 & 4) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m2344(C1253 c1253) {
        C0246 c0246 = this.f3867;
        if (c0246 == null) {
            c0246 = new C0246();
            this.f3867 = c0246;
        }
        c0246.m789(this.f3853.f3558, c1253);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m2345() throws Throwable {
        int i;
        m2337(this.f3853.f3558);
        C7439 c7439 = this.f3843;
        c7439.m12628(false);
        C1310 c1310 = c7439.f20147;
        C1324 c1324 = c7439.f20150;
        C1234 c1234 = c1324.f3853;
        if (c1234.f3552 > 0 && c1310.m2299(-2) != (i = c1234.f3561)) {
            if (!c7439.f20148 && c7439.f20146) {
                c7439.m12628(false);
                c7439.f20149.f20157.m12623(C7449.f20166);
                c7439.f20148 = true;
            }
            if (i > 0) {
                C1230 c1230M2063 = c1234.m2063(i);
                c1310.m2297(i);
                c7439.m12628(false);
                C7422 c7422 = c7439.f20149.f20157;
                c7422.m12623(C7452.f20173);
                AbstractC3054.m6592(c7422, 0, c1230M2063);
                c7439.f20148 = true;
            }
        }
        c7439.f20149.f20157.m12623(C7428.f20134);
        int i2 = c7439.f20145;
        C1234 c12342 = c1324.f3853;
        c7439.f20145 = c12342.f3553[(c12342.f3558 * 5) + 3] + i2;
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
    public final void m2346() {
        /*
            Method dump skipped, instruction units count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1324.m2346():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0059 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {all -> 0x0028, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0024, B:12:0x002d, B:11:0x002a, B:15:0x0034, B:20:0x0040, B:22:0x0048, B:24:0x004e, B:25:0x0052, B:26:0x0053, B:28:0x0059, B:21:0x0044), top: B:33:0x0005, inners: #1 }] */
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2347(androidx.compose.runtime.C1363 r9, androidx.compose.runtime.C1363 r10, java.lang.Integer r11, java.util.List r12, p052.InterfaceC6542 r13) {
        /*
            r8 = this;
            boolean r0 = r8.f3854
            int r1 = r8.f3876
            r2 = 1
            r8.f3854 = r2     // Catch: java.lang.Throwable -> L28
            r2 = 0
            r8.f3876 = r2     // Catch: java.lang.Throwable -> L28
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
            r8.m2384(r7, r6)     // Catch: java.lang.Throwable -> L28
            goto L2d
        L28:
            r9 = move-exception
            goto L62
        L2a:
            r8.m2384(r7, r5)     // Catch: java.lang.Throwable -> L28
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
            r9.f3954 = r10     // Catch: java.lang.Throwable -> L28
            r9.f3953 = r11     // Catch: java.lang.Throwable -> L28
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L4d
            r9.f3954 = r5     // Catch: java.lang.Throwable -> L28
            r9.f3953 = r2     // Catch: java.lang.Throwable -> L28
            goto L57
        L4d:
            r10 = move-exception
            r9.f3954 = r5     // Catch: java.lang.Throwable -> L28
            r9.f3953 = r2     // Catch: java.lang.Throwable -> L28
            throw r10     // Catch: java.lang.Throwable -> L28
        L53:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L28
        L57:
            if (r10 != 0) goto L5d
        L59:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L28
        L5d:
            r8.f3854 = r0
            r8.f3876 = r1
            return r10
        L62:
            r8.f3854 = r0
            r8.f3876 = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1324.m2347(androidx.compose.runtime.飘花落叶言子楪哲世兰苏, androidx.compose.runtime.飘花落叶言子楪哲世兰苏, java.lang.Integer, java.util.List, 飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final int m2348(int i) {
        int iM2069 = this.f3853.m2069(i) + 1;
        int i2 = 0;
        while (iM2069 < i) {
            if (!this.f3853.m2075(iM2069)) {
                i2++;
            }
            iM2069 += this.f3853.f3553[(iM2069 * 5) + 3];
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final List m2349() {
        AbstractC1372 abstractC1372 = this.f3860;
        InterfaceC1371 interfaceC1371Mo2319 = abstractC1372.mo2319();
        C1363 c1363 = interfaceC1371Mo2319 != null ? (C1363) interfaceC1371Mo2319 : null;
        if (c1363 == null) {
            return EmptyList.INSTANCE;
        }
        C1233 c1233 = c1363.f3961;
        C1234 c1234M2052 = AbstractC1238.m2128(c1233).m2052();
        try {
            Integer numM9901 = AbstractC4921.m9901(c1234M2052, abstractC1372, 0, c1234M2052.f3552);
            if (numM9901 == null) {
                return EmptyList.INSTANCE;
            }
            c1234M2052 = AbstractC1238.m2128(c1233).m2052();
            try {
                ArrayList arrayListM9873 = AbstractC4921.m9873(c1234M2052, numM9901.intValue(), 0);
                c1234M2052.m2061();
                return AbstractC4343.m8825(c1363.f3944.m2349(), arrayListM9873);
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m2350(Object obj) {
        if (AbstractC4394.m8917(m2338(), obj)) {
            return false;
        }
        m2375(obj);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m2351(long j) {
        Object objM2338 = m2338();
        if ((objM2338 instanceof Long) && j == ((Number) objM2338).longValue()) {
            return false;
        }
        m2375(Long.valueOf(j));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m2352(int i) {
        Object objM2338 = m2338();
        if ((objM2338 instanceof Integer) && i == ((Number) objM2338).intValue()) {
            return false;
        }
        m2375(Integer.valueOf(i));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m2353(float f) {
        Object objM2338 = m2338();
        if ((objM2338 instanceof Float) && f == ((Number) objM2338).floatValue()) {
            return false;
        }
        m2375(Float.valueOf(f));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m2354(Object obj, InterfaceC6553 interfaceC6553) {
        if (this.f3837) {
            C7422 c7422 = this.f3838.f20144;
            c7422.m12623(C7432.f20137);
            AbstractC3054.m6592(c7422, 0, obj);
            interfaceC6553.getClass();
            AbstractC4387.m8898(2, interfaceC6553);
            AbstractC3054.m6592(c7422, 1, interfaceC6553);
            return;
        }
        C7439 c7439 = this.f3843;
        c7439.m12630();
        C7422 c74222 = c7439.f20149.f20157;
        c74222.m12623(C7432.f20137);
        interfaceC6553.getClass();
        AbstractC4387.m8898(2, interfaceC6553);
        AbstractC3054.m6591(c74222, 0, obj, 1, interfaceC6553);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2355() {
        m2372();
        this.f3878.clear();
        this.f3868.f3801 = 0;
        this.f3862.f3801 = 0;
        this.f3865.f3801 = 0;
        this.f3867 = null;
        C7438 c7438 = this.f3838;
        c7438.f20143.m12626();
        c7438.f20144.m12626();
        this.f3836 = 0L;
        this.f3847 = 0;
        this.f3871 = false;
        this.f3837 = false;
        this.f3849 = false;
        this.f3854 = false;
        this.f3848 = -1;
        C1234 c1234 = this.f3853;
        if (!c1234.f3549) {
            c1234.m2061();
        }
        if (this.f3851.f3571) {
            return;
        }
        m2361();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m2356() {
        m2367(false);
        this.f3860.mo2305();
        m2367(false);
        C7439 c7439 = this.f3843;
        if (c7439.f20148) {
            c7439.m12628(false);
            c7439.m12628(false);
            c7439.f20149.f20157.m12623(C7448.f20165);
            c7439.f20148 = false;
        }
        c7439.m12630();
        if (c7439.f20147.f3801 != 0) {
            AbstractC1374.m2497("Missed recording an endGroup()");
        }
        if (!this.f3878.isEmpty()) {
            AbstractC1374.m2497("Start/end imbalance");
        }
        m2372();
        this.f3853.m2061();
        this.f3864 = this.f3865.m2298() != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m2357() {
        if (this.f3854 || this.f3848 != 0) {
            AbstractC1392.m2528("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f3848 = -1;
        this.f3849 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC1293 m2358() {
        C1323 c1323 = this.f3833;
        if (c1323 != null) {
            return c1323;
        }
        C1323 c13232 = new C1323(this.f3874);
        this.f3833 = c13232;
        return c13232;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C1389 m2359() {
        if (this.f3847 != 0) {
            return null;
        }
        ArrayList arrayList = this.f3855;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (C1389) AbstractC6136.m11555(1, arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m2360(boolean z, C1321 c1321) {
        this.f3878.add(this.f3879);
        this.f3879 = c1321;
        int i = this.f3877;
        C1310 c1310 = this.f3868;
        c1310.m2297(i);
        c1310.m2297(this.f3869);
        c1310.m2297(this.f3876);
        if (z) {
            this.f3876 = 0;
        }
        this.f3877 = 0;
        this.f3869 = 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m2361() {
        C1233 c1233 = new C1233();
        if (this.f3845) {
            c1233.m2054();
        }
        if (this.f3860.mo2304()) {
            c1233.f3538 = new C0246();
        }
        this.f3852 = c1233;
        C1235 c1235M2053 = c1233.m2053();
        c1235M2053.m2104(true);
        this.f3851 = c1235M2053;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m2362(C0236 c0236, InterfaceC6553 interfaceC6553) {
        ArrayList arrayList = this.f3863;
        if (this.f3854) {
            AbstractC1374.m2497("Reentrant composition is not supported");
        }
        this.f3875.m442();
        Trace.beginSection("Compose:recompose");
        try {
            this.f3846 = Long.hashCode(AbstractC1280.m2270().mo2200());
            this.f3867 = null;
            m2379(c0236);
            this.f3876 = 0;
            this.f3854 = true;
            try {
                m2383();
                Object objM2338 = m2338();
                if (objM2338 != interfaceC6553 && interfaceC6553 != null) {
                    m2375(interfaceC6553);
                }
                C1313 c1313 = this.f3844;
                C1224 c1224M2485 = AbstractC1367.m2485();
                try {
                    c1224M2485.m2037(c1313);
                    C1379 c1379 = AbstractC1374.f3978;
                    if (interfaceC6553 != null) {
                        m2327(200, c1379);
                        AbstractC1254.m2180(this, interfaceC6553);
                        m2367(false);
                    } else if (!this.f3864 || objM2338 == null || objM2338.equals(C1369.f3973)) {
                        m2334();
                    } else {
                        m2327(200, c1379);
                        AbstractC4387.m8898(2, objM2338);
                        AbstractC1254.m2180(this, (InterfaceC6553) objM2338);
                        m2367(false);
                    }
                    c1224M2485.m2043(c1224M2485.f3519 - 1);
                    m2356();
                    this.f3854 = false;
                    arrayList.clear();
                    if (!this.f3851.f3571) {
                        AbstractC1374.m2497("Check failed");
                    }
                    m2361();
                } catch (Throwable th) {
                    c1224M2485.m2043(c1224M2485.f3519 - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C1296 m2363() {
        RandomAccess randomAccess;
        if (!this.f3860.mo2321()) {
            return null;
        }
        ListBuilder listBuilderM13685 = AbstractC8189.m13685();
        C1235 c1235 = this.f3851;
        listBuilderM13685.addAll(AbstractC4921.m9903(c1235, null, c1235.f3569, null));
        C1234 c1234 = this.f3853;
        boolean z = c1234.f3549;
        int[] iArr = c1234.f3553;
        if (z || c1234.f3552 == 0) {
            randomAccess = EmptyList.INSTANCE;
        } else {
            C1300 c1300 = new C1300(c1234);
            int iM2069 = c1234.f3561;
            Object objValueOf = Integer.valueOf(c1234.f3560 - AbstractC1238.m2130(iArr, iM2069));
            while (iM2069 >= 0) {
                c1300.m2292(c1234.m2077(iM2069), c1234.m2075(iM2069) ? c1234.m2072(iArr, iM2069) : C1369.f3973, c1234.f3554.m2056(iM2069), objValueOf);
                objValueOf = c1234.m2063(iM2069);
                iM2069 = c1234.m2069(iM2069);
            }
            randomAccess = c1300.f3782;
        }
        listBuilderM13685.addAll(randomAccess);
        listBuilderM13685.addAll(m2349());
        return new C1296(listBuilderM13685.build(), this.f3845);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m2364() {
        m2367(false);
        C1389 c1389M2359 = m2359();
        if (c1389M2359 != null) {
            int i = c1389M2359.f4035;
            if ((i & 1) != 0) {
                c1389M2359.f4035 = i | 2;
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
    public final androidx.compose.runtime.C1389 m2365() {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1324.m2365():androidx.compose.runtime.飘花落叶言子苏哲兰世楪");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m2366(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        m2366(this.f3853.m2069(i), i2);
        if (this.f3853.m2076(i)) {
            Object objM2067 = this.f3853.m2067(i);
            C7439 c7439 = this.f3843;
            c7439.m12629();
            c7439.f20151.add(objM2067);
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
    public final void m2367(boolean r43) {
        /*
            Method dump skipped, instruction units count: 1604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1324.m2367(boolean):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m2368(Object obj) {
        if (m2338() == obj) {
            return false;
        }
        m2375(obj);
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean m2369(boolean z) {
        Object objM2338 = m2338();
        if ((objM2338 instanceof Boolean) && z == ((Boolean) objM2338).booleanValue()) {
            return false;
        }
        m2375(Boolean.valueOf(z));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m2370(InterfaceC6542 interfaceC6542) {
        if (!this.f3871) {
            AbstractC1374.m2497("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f3871 = false;
        if (!this.f3837) {
            AbstractC1374.m2497("createNode() can only be called when inserting");
        }
        C1310 c1310 = this.f3868;
        int i = c1310.f3802[c1310.f3801 - 1];
        C1235 c1235 = this.f3851;
        C1230 c1230M2107 = c1235.m2107(c1235.f3574);
        this.f3877++;
        C7438 c7438 = this.f3838;
        C7422 c7422 = c7438.f20144;
        c7422.m12623(C7450.f20168);
        AbstractC3054.m6592(c7422, 0, interfaceC6542);
        c7422.f20127[c7422.f20128 - c7422.f20124[c7422.f20123 - 1].f18409] = i;
        AbstractC3054.m6592(c7422, 1, c1230M2107);
        C7422 c74222 = c7438.f20143;
        c74222.m12623(C7450.f20167);
        c74222.f20127[c74222.f20128 - c74222.f20124[c74222.f20123 - 1].f18409] = i;
        AbstractC3054.m6592(c74222, 0, c1230M2107);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C1253 m2371() {
        C1253 c1253;
        C1253 c12532 = this.f3841;
        if (c12532 != null) {
            return c12532;
        }
        int iM2069 = this.f3853.f3561;
        boolean z = this.f3837;
        C1379 c1379 = AbstractC1374.f3976;
        if (z && this.f3850) {
            int iM2102 = this.f3851.f3574;
            while (iM2102 > 0) {
                if (this.f3851.m2110(iM2102) == 202 && AbstractC4394.m8917(this.f3851.m2109(iM2102), c1379)) {
                    Object objM2117 = this.f3851.m2117(iM2102);
                    objM2117.getClass();
                    C1253 c12533 = (C1253) objM2117;
                    this.f3841 = c12533;
                    return c12533;
                }
                C1235 c1235 = this.f3851;
                iM2102 = c1235.m2102(c1235.f3567, iM2102);
            }
        }
        if (this.f3853.f3552 > 0) {
            while (iM2069 > 0) {
                if (this.f3853.m2077(iM2069) == 202) {
                    C1234 c1234 = this.f3853;
                    if (AbstractC4394.m8917(c1234.m2072(c1234.f3553, iM2069), c1379)) {
                        C0246 c0246 = this.f3867;
                        if (c0246 == null || (c1253 = (C1253) c0246.m832(iM2069)) == null) {
                            C1234 c12342 = this.f3853;
                            Object objM2062 = c12342.m2062(c12342.f3553, iM2069);
                            objM2062.getClass();
                            c1253 = (C1253) objM2062;
                        }
                        this.f3841 = c1253;
                        return c1253;
                    }
                }
                iM2069 = this.f3853.m2069(iM2069);
            }
        }
        C1253 c12534 = this.f3866;
        this.f3841 = c12534;
        return c12534;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m2372() {
        this.f3879 = null;
        this.f3876 = 0;
        this.f3877 = 0;
        this.f3836 = 0L;
        this.f3871 = false;
        C7439 c7439 = this.f3843;
        c7439.f20148 = false;
        c7439.f20147.f3801 = 0;
        c7439.f20145 = 0;
        c7439.f20146 = true;
        c7439.f20152 = 0;
        c7439.f20151.clear();
        c7439.f20155 = -1;
        c7439.f20156 = -1;
        c7439.f20153 = -1;
        c7439.f20154 = 0;
        this.f3855.clear();
        this.f3872 = null;
        this.f3873 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object m2373(AbstractC1390 abstractC1390) {
        return AbstractC1367.m2473(m2371(), abstractC1390);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final int m2374(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.f3872;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.f3853.m2071(i) : i2;
        }
        C0248 c0248 = this.f3873;
        if (c0248 != null && c0248.m798(i) >= 0) {
            int iM798 = c0248.m798(i);
            if (iM798 >= 0) {
                return c0248.f907[iM798];
            }
            C4210.m8627(AbstractC6136.m11556(i, "Cannot find value for key "));
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final void m2375(Object obj) {
        if (this.f3837) {
            C1235 c1235 = this.f3851;
            if (c1235.f3575 <= 0 || c1235.f3585 == c1235.f3583) {
                c1235.m2101(obj);
                return;
            }
            C0246 c0246 = c1235.f3570;
            if (c0246 == null) {
                c0246 = new C0246();
            }
            c1235.f3570 = c0246;
            int i = c1235.f3574;
            Object objM832 = c0246.m832(i);
            if (objM832 == null) {
                objM832 = new C0244();
                c0246.m789(i, objM832);
            }
            ((C0244) objM832).m774(obj);
            return;
        }
        C1234 c1234 = this.f3853;
        boolean z = c1234.f3555;
        C7439 c7439 = this.f3843;
        if (!z) {
            C1230 c1230M2063 = c1234.m2063(c1234.f3561);
            C7422 c7422 = c7439.f20149.f20157;
            c7422.m12623(C7436.f20141);
            AbstractC3054.m6591(c7422, 0, c1230M2063, 1, obj);
            return;
        }
        int iM2130 = (c1234.f3560 - AbstractC1238.m2130(c1234.f3553, c1234.f3561)) - 1;
        if (c7439.f20150.f3853.f3561 - c7439.f20145 >= 0) {
            c7439.m12628(true);
            C7422 c74222 = c7439.f20149.f20157;
            c74222.m12623(C7450.f20169);
            AbstractC3054.m6592(c74222, 0, obj);
            c74222.f20127[c74222.f20128 - c74222.f20124[c74222.f20123 - 1].f18409] = iM2130;
            return;
        }
        C1234 c12342 = this.f3853;
        C1230 c1230M20632 = c12342.m2063(c12342.f3561);
        C7422 c74223 = c7439.f20149.f20157;
        c74223.m12623(C7450.f20170);
        AbstractC3054.m6591(c74223, 0, obj, 1, c1230M20632);
        c74223.f20127[c74223.f20128 - c74223.f20124[c74223.f20123 - 1].f18409] = iM2130;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public final void m2376(Object obj) {
        if (obj instanceof InterfaceC1339) {
            C1320 c1320 = new C1320((InterfaceC1339) obj, this.f3869 - 1);
            if (this.f3837) {
                C7422 c7422 = this.f3843.f20149.f20157;
                c7422.m12623(C7443.f20160);
                AbstractC3054.m6592(c7422, 0, c1320);
            }
            this.f3858.add(obj);
            obj = c1320;
        }
        m2375(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final void m2377(int i, int i2) {
        int iM2374 = m2374(i);
        if (iM2374 != i2) {
            int i3 = i2 - iM2374;
            ArrayList arrayList = this.f3878;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iM23742 = m2374(i) + i3;
                m2378(i, iM23742);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        C1321 c1321 = (C1321) arrayList.get(i4);
                        if (c1321 != null && c1321.m2325(i, iM23742)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                C1234 c1234 = this.f3853;
                if (i < 0) {
                    i = c1234.f3561;
                } else if (c1234.m2076(i)) {
                    return;
                } else {
                    i = this.f3853.m2069(i);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final void m2378(int i, int i2) {
        if (m2374(i) != i2) {
            if (i < 0) {
                C0248 c0248 = this.f3873;
                if (c0248 == null) {
                    c0248 = new C0248();
                    this.f3873 = c0248;
                }
                c0248.m795(i, i2);
                return;
            }
            int[] iArr = this.f3872;
            if (iArr == null) {
                iArr = new int[this.f3853.f3552];
                AbstractC4346.m8863(iArr, -1, 0, 6);
                this.f3872 = iArr;
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
    public final void m2379(androidx.collection.C0236 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.ArrayList r0 = r0.f3863
            int r2 = p253.AbstractC8189.m13673(r0)
        La:
            r4 = -1
            if (r4 >= r2) goto L36
            java.lang.Object r4 = r0.get(r2)
            androidx.compose.runtime.飘花落叶言子世哲楪兰苏 r4 = (androidx.compose.runtime.C1309) r4
            androidx.compose.runtime.飘花落叶言子苏哲兰世楪 r5 = r4.f3800
            androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪世苏兰哲 r5 = r5.f4034
            if (r5 == 0) goto L1e
            androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪世苏兰哲 r3 = com.bumptech.glide.AbstractC3065.m6840(r5)
            goto L1f
        L1e:
            r3 = 0
        L1f:
            if (r3 == 0) goto L30
            boolean r5 = r3.m2051()
            if (r5 == 0) goto L30
            int r5 = r4.f3799
            int r3 = r3.f3533
            if (r5 == r3) goto L33
            r4.f3799 = r3
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
            androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪世苏兰哲 r15 = r14.f4034
            if (r15 == 0) goto L8b
            androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪世苏兰哲 r15 = com.bumptech.glide.AbstractC3065.m6840(r15)
            int r15 = r15.f3533
            androidx.compose.runtime.飘花落叶言子楪世哲兰苏 r3 = androidx.compose.runtime.C1353.f3920
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
            androidx.compose.foundation.lazy.layout.飘花落叶言子楪世苏哲兰 r1 = androidx.compose.runtime.AbstractC1367.f3971
            kotlin.collections.AbstractC4335.m8776(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1324.m2379(androidx.collection.飘花落叶言子世兰楪苏哲):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public final void m2380() {
        if (!this.f3871) {
            AbstractC1374.m2497("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f3871 = false;
        if (this.f3837) {
            AbstractC1374.m2497("useNode() called while inserting");
        }
        C1234 c1234 = this.f3853;
        Object objM2067 = c1234.m2067(c1234.f3561);
        C7439 c7439 = this.f3843;
        c7439.m12629();
        c7439.f20151.add(objM2067);
        if (this.f3849 && (objM2067 instanceof InterfaceC1370)) {
            c7439.m12630();
            c7439.f20149.f20157.m12623(C7430.f20135);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.C1324 m2381(int r7) {
        /*
            r6 = this;
            r6.m2382(r7)
            boolean r7 = r6.f3837
            androidx.appcompat.app.飘花落叶言子苏楪哲兰世 r0 = r6.f3875
            java.util.ArrayList r1 = r6.f3855
            androidx.compose.runtime.飘花落叶言子楪哲世兰苏 r2 = r6.f3874
            if (r7 == 0) goto L26
            androidx.compose.runtime.飘花落叶言子苏哲兰世楪 r7 = new androidx.compose.runtime.飘花落叶言子苏哲兰世楪
            r7.<init>(r2)
            r1.add(r7)
            r6.m2375(r7)
            int r1 = r6.f3846
            r7.f4032 = r1
            int r1 = r7.f4035
            r1 = r1 & (-17)
            r7.f4035 = r1
            r0.m442()
            return r6
        L26:
            androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪苏世哲兰 r7 = r6.f3853
            int r7 = r7.f3561
            java.util.ArrayList r3 = r6.f3863
            int r7 = androidx.compose.runtime.AbstractC1367.m2480(r7, r3)
            if (r7 < 0) goto L39
            java.lang.Object r7 = r3.remove(r7)
            androidx.compose.runtime.飘花落叶言子世哲楪兰苏 r7 = (androidx.compose.runtime.C1309) r7
            goto L3a
        L39:
            r7 = 0
        L3a:
            androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪苏世哲兰 r3 = r6.f3853
            java.lang.Object r3 = r3.m2068()
            androidx.compose.runtime.飘花落叶言子楪世哲兰苏 r4 = androidx.compose.runtime.C1369.f3973
            boolean r4 = kotlin.jvm.internal.AbstractC4394.m8917(r3, r4)
            if (r4 == 0) goto L51
            androidx.compose.runtime.飘花落叶言子苏哲兰世楪 r3 = new androidx.compose.runtime.飘花落叶言子苏哲兰世楪
            r3.<init>(r2)
            r6.m2375(r3)
            goto L56
        L51:
            r3.getClass()
            androidx.compose.runtime.飘花落叶言子苏哲兰世楪 r3 = (androidx.compose.runtime.C1389) r3
        L56:
            r2 = 0
            r4 = 1
            if (r7 != 0) goto L6e
            int r7 = r3.f4035
            r5 = r7 & 64
            if (r5 == 0) goto L62
            r5 = r4
            goto L63
        L62:
            r5 = r2
        L63:
            if (r5 == 0) goto L69
            r7 = r7 & (-65)
            r3.f4035 = r7
        L69:
            if (r5 == 0) goto L6c
            goto L6e
        L6c:
            r7 = r2
            goto L6f
        L6e:
            r7 = r4
        L6f:
            int r5 = r3.f4035
            if (r7 == 0) goto L76
            r7 = r5 | 8
            goto L78
        L76:
            r7 = r5 & (-9)
        L78:
            r3.f4035 = r7
            r1.add(r3)
            int r7 = r6.f3846
            r3.f4032 = r7
            int r7 = r3.f4035
            r7 = r7 & (-17)
            r3.f4035 = r7
            r0.m442()
            int r7 = r3.f4035
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto Lba
            r7 = r7 & (-257(0xfffffffffffffeff, float:NaN))
            r7 = r7 | 512(0x200, float:7.17E-43)
            r3.f4035 = r7
            飘花落叶言子世苏楪兰哲.飘花落叶言子楪世苏兰哲 r7 = r6.f3843
            飘花落叶言子世苏楪兰哲.飘花落叶言子楪世苏哲兰 r7 = r7.f20149
            飘花落叶言子世苏楪兰哲.飘花落叶言子世哲楪苏兰 r7 = r7.f20157
            飘花落叶言子世苏楪兰哲.飘花落叶言子世楪兰哲苏 r0 = p126.C7423.f20129
            r7.m12623(r0)
            com.bumptech.glide.AbstractC3054.m6592(r7, r2, r3)
            boolean r7 = r6.f3849
            if (r7 != 0) goto Lba
            int r7 = r3.f4035
            r0 = r7 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto Lba
            r6.f3849 = r4
            androidx.compose.runtime.composer.gapbuffer.飘花落叶言子楪苏世哲兰 r0 = r6.f3853
            int r0 = r0.f3561
            r6.f3848 = r0
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r3.f4035 = r7
        Lba:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1324.m2381(int):androidx.compose.runtime.飘花落叶言子世苏楪哲兰");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final void m2382(int i) {
        int i2;
        int i3;
        if (this.f3879 != null) {
            m2332(i, 0, null, null);
            return;
        }
        if (this.f3871) {
            AbstractC1374.m2497("A call to createNode(), emitNode() or useNode() expected");
        }
        this.f3836 = Long.rotateLeft(Long.rotateLeft(this.f3836, 3) ^ ((long) i), 3) ^ ((long) this.f3869);
        this.f3869++;
        C1234 c1234 = this.f3853;
        boolean z = this.f3837;
        C1353 c1353 = C1369.f3973;
        if (z) {
            c1234.f3559++;
            this.f3851.m2083(i, c1353, c1353, false);
            m2360(false, null);
            return;
        }
        if (c1234.m2074() == i && ((i3 = c1234.f3558) >= c1234.f3557 || (c1234.f3553[(i3 * 5) + 1] & 536870912) == 0)) {
            c1234.m2066();
            m2360(false, null);
            return;
        }
        if (c1234.f3559 <= 0 && (i2 = c1234.f3558) != c1234.f3557) {
            int i4 = this.f3876;
            m2345();
            this.f3843.m12627(i4, c1234.m2065());
            AbstractC1367.m2493(this.f3863, i2, c1234.f3558);
        }
        c1234.f3559++;
        this.f3837 = true;
        this.f3841 = null;
        if (this.f3851.f3571) {
            C1235 c1235M2053 = this.f3852.m2053();
            this.f3851 = c1235M2053;
            c1235M2053.m2091();
            this.f3850 = false;
            this.f3841 = null;
        }
        C1235 c1235 = this.f3851;
        c1235.m2105();
        int i5 = c1235.f3569;
        c1235.m2083(i, c1353, c1353, false);
        this.f3842 = c1235.m2107(i5);
        m2360(false, null);
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
    public final void m2383() {
        this.f3869 = 0;
        this.f3853 = this.f3859.m2052();
        m2332(100, 0, null, null);
        AbstractC1372 abstractC1372 = this.f3860;
        abstractC1372.mo2308();
        C1253 c1253Mo2323 = abstractC1372.mo2323();
        this.f3865.m2297(this.f3864 ? 1 : 0);
        this.f3864 = m2350(c1253Mo2323);
        this.f3841 = null;
        if (!this.f3870) {
            this.f3870 = abstractC1372.mo2303();
        }
        if (!this.f3845) {
            this.f3845 = abstractC1372.mo2302();
        }
        if (this.f3845) {
            C1334 c1334 = AbstractC1291.f3777;
            c1334.getClass();
            c1253Mo2323 = c1253Mo2323.m2176(c1334, new C1338(m2342()));
        }
        this.f3866 = c1253Mo2323;
        Set set = (Set) AbstractC1367.m2473(c1253Mo2323, AbstractC1298.f3785);
        if (set != null) {
            set.add(m2358());
            abstractC1372.mo2317(set);
        }
        m2332(Long.hashCode(abstractC1372.mo2320()), 0, null, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final boolean m2384(C1389 c1389, Object obj) {
        C1230 c1230 = c1389.f4034;
        if (c1230 == null) {
            return false;
        }
        int iM2055 = this.f3853.f3554.m2055(AbstractC3065.m6840(c1230));
        if (!this.f3854 || iM2055 < this.f3853.f3558) {
            return false;
        }
        ArrayList arrayList = this.f3863;
        int iM2480 = AbstractC1367.m2480(iM2055, arrayList);
        if (iM2480 < 0) {
            int i = -(iM2480 + 1);
            if (!(obj instanceof C1362)) {
                obj = null;
            }
            arrayList.add(i, new C1309(c1389, iM2055, obj));
            return true;
        }
        C1309 c1309 = (C1309) arrayList.get(iM2480);
        if (!(obj instanceof C1362)) {
            c1309.f3798 = null;
            return true;
        }
        Object obj2 = c1309.f3798;
        if (obj2 == null) {
            c1309.f3798 = obj;
            return true;
        }
        if (obj2 instanceof C0235) {
            ((C0235) obj2).m740(obj);
            return true;
        }
        C0235 c0235 = AbstractC0285.f997;
        C0235 c02352 = new C0235(2);
        c02352.m744(obj2);
        c02352.m744(obj);
        c1309.f3798 = c02352;
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final void m2385(Object obj) {
        if (!this.f3837 && this.f3853.m2074() == 207 && !AbstractC4394.m8917(this.f3853.m2058(), obj) && this.f3848 < 0) {
            this.f3848 = this.f3853.f3558;
            this.f3849 = true;
        }
        m2332(Opcodes.REM_DOUBLE_2ADDR, 0, null, obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final void m2386() {
        m2332(125, 2, null, null);
        this.f3871 = true;
    }
}
