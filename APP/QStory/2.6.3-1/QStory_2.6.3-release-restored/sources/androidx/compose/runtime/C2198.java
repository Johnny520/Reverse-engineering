package androidx.compose.runtime;

import android.os.Trace;
import androidx.appcompat.app.C0960;
import androidx.collection.AbstractC1133;
import androidx.collection.C1082;
import androidx.collection.C1083;
import androidx.collection.C1084;
import androidx.collection.C1093;
import androidx.collection.C1094;
import androidx.collection.C1099;
import androidx.collection.C1123;
import androidx.compose.foundation.C1898;
import androidx.compose.p001ui.node.C2613;
import androidx.compose.runtime.collection.C2057;
import androidx.compose.runtime.composer.gapbuffer.AbstractC2073;
import androidx.compose.runtime.composer.gapbuffer.C2065;
import androidx.compose.runtime.composer.gapbuffer.C2068;
import androidx.compose.runtime.composer.gapbuffer.C2070;
import androidx.compose.runtime.internal.AbstractC2089;
import androidx.compose.runtime.internal.C2086;
import androidx.compose.runtime.snapshots.AbstractC2091;
import androidx.compose.runtime.snapshots.InterfaceC2092;
import androidx.compose.runtime.tooling.C2127;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3898;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7383;
import p142.C8252;
import p142.C8270;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2198 implements InterfaceC2206 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public int f4289;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final C2159 f4290;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public boolean f4291;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C1083 f4292;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C1083 f4293;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C8270 f4294;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final C8270 f4295;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final C1083 f4296;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final C2086 f4297;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final C0960 f4298;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f4299;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C2198 f4300;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public C2226 f4301;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public InterfaceC2177 f4302;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C1084 f4303;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C1082 f4305;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final C1082 f4306;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C2068 f4307;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C1083 f4308;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2613 f4309;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final AbstractC2207 f4311;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AtomicReference f4310 = new AtomicReference(null);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Object f4304 = new Object();

    public C2198(AbstractC2207 abstractC2207, C2613 c2613) {
        this.f4311 = abstractC2207;
        this.f4309 = c2613;
        C1084 c1084 = new C1084(new C1082());
        this.f4303 = c1084;
        C2068 c2068 = new C2068();
        if (abstractC2207.mo2874()) {
            c2068.f3884 = new C1093();
        }
        if (abstractC2207.mo2872()) {
            c2068.m2624();
        }
        this.f4307 = c2068;
        this.f4308 = AbstractC3887.m7223();
        this.f4305 = new C1082();
        this.f4306 = new C1082();
        this.f4296 = AbstractC3887.m7223();
        C8270 c8270 = new C8270();
        this.f4295 = c8270;
        C8270 c82702 = new C8270();
        this.f4294 = c82702;
        this.f4293 = AbstractC3887.m7223();
        this.f4292 = AbstractC3887.m7223();
        C0960 c0960 = new C0960(abstractC2207, 17);
        this.f4298 = c0960;
        this.f4297 = new C2086();
        C2159 c2159 = new C2159(c2613, abstractC2207, AbstractC2073.m2698(c2068), c1084, c8270, c82702, c0960, this);
        abstractC2207.mo2888(c2159);
        this.f4290 = c2159;
    }

    @Override // androidx.compose.runtime.InterfaceC2206
    public final void dispose() {
        synchronized (this.f4304) {
            try {
                if (this.f4290.f4200) {
                    AbstractC2227.m3097("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.f4289 != 3) {
                    this.f4289 = 3;
                    C8270 c8270 = this.f4290.f4186;
                    if (c8270 != null) {
                        m3006(c8270);
                    }
                    int i = 1;
                    boolean z = this.f4307.f3889 == 0;
                    if (!z || !this.f4303.f1341.m1433()) {
                        C2086 c2086 = this.f4297;
                        try {
                            c2086.m2743(this.f4303, this.f4290.m2912());
                            if (!z) {
                                C2068 c2068 = this.f4307;
                                C2086 c20862 = this.f4297;
                                C2070 c2070M2623 = c2068.m2623();
                                try {
                                    c2070M2623.m2685(c2070M2623.f3915, new C2216(c20862, i));
                                    c2070M2623.m2669();
                                    c2070M2623.m2674(true);
                                    this.f4309.m3887();
                                    this.f4309.mo2997();
                                    c2086.m2740();
                                } catch (Throwable th) {
                                    c2070M2623.m2674(false);
                                    throw th;
                                }
                            }
                            c2086.m2741();
                            c2086.m2742();
                        } catch (Throwable th2) {
                            c2086.m2742();
                            throw th2;
                        }
                    }
                    C2159 c2159 = this.f4290;
                    c2159.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c2159.f4206.mo2881(c2159);
                        c2159.f4201.clear();
                        c2159.f4209.clear();
                        c2159.f4203.f20497.m13210();
                        c2159.f4213 = null;
                        c2159.f4207.m3887();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f4311.mo2882(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m3003(InterfaceC7383 interfaceC7383) {
        boolean zM3027 = m3027();
        m3022();
        AbstractC2207 abstractC2207 = this.f4311;
        if (!zM3027) {
            abstractC2207.mo2877(this, interfaceC7383);
            return;
        }
        C2159 c2159 = this.f4290;
        c2159.f4194 = 0;
        c2159.f4195 = true;
        abstractC2207.mo2877(this, interfaceC7383);
        c2159.m2927();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3004(Object obj) {
        synchronized (this.f4304) {
            try {
                m3011(obj);
                Object objM1317 = this.f4296.m1317(obj);
                if (objM1317 != null) {
                    if (objM1317 instanceof C1082) {
                        C1082 c1082 = (C1082) objM1317;
                        Object[] objArr = c1082.f1345;
                        long[] jArr = c1082.f1346;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            m3011((C2197) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    } else if (i == length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        m3011((C2197) objM1317);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m3005() {
        synchronized (this.f4304) {
            try {
                C8270 c8270 = this.f4294;
                c8270.getClass();
                if (!c8270.f20497.m13212()) {
                    m3006(this.f4294);
                }
            } catch (Throwable th) {
                try {
                    if (!this.f4303.f1341.m1433()) {
                        C2086 c2086 = this.f4297;
                        try {
                            c2086.m2743(this.f4303, this.f4290.m2912());
                            c2086.m2741();
                            c2086.m2742();
                        } catch (Throwable th2) {
                            c2086.m2742();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x012e  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3006(C8270 c8270) throws Throwable {
        InterfaceC2191 interfaceC2191;
        C2086 c2086;
        C2086 c20862;
        long[] jArr;
        int i;
        long[] jArr2;
        C2086 c20863;
        long j;
        char c;
        long j2;
        int i2;
        boolean zM1433;
        long j3;
        C8270 c82702 = this.f4294;
        C2159 c2159 = this.f4290;
        C2127 c2127M2912 = c2159.m2912();
        C2086 c20864 = this.f4297;
        c20864.m2743(this.f4303, c2127M2912);
        try {
            if (c8270.f20497.m13212()) {
                try {
                    if (c82702.f20497.m13212() && this.f4301 == null) {
                        c20864.m2741();
                    }
                    return;
                } finally {
                }
            }
            C2226 c2226 = this.f4301;
            if (c2226 == null || (interfaceC2191 = c2226.f4394) == null) {
                interfaceC2191 = this.f4309;
            }
            try {
                Trace.beginSection(interfaceC2191.equals(c2226 != null ? c2226.f4394 : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    C2226 c22262 = this.f4301;
                    if (c22262 == null || (c2086 = c22262.f4393) == null) {
                        c2086 = c20864;
                    }
                    C2068 c2068 = this.f4307;
                    C2127 c2127M29122 = c2159.m2912();
                    C2070 c2070M2623 = AbstractC2073.m2698(c2068).m2623();
                    int i3 = 0;
                    try {
                        c8270.m13218(interfaceC2191, c2070M2623, c2086, c2127M29122);
                        c2070M2623.m2674(true);
                        interfaceC2191.mo2997();
                        Trace.endSection();
                        c20864.m2740();
                        c20864.m2739();
                        if (this.f4291) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.f4291 = false;
                                C1083 c1083 = this.f4308;
                                long[] jArr3 = c1083.f1226;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = c1083.f1225[i8];
                                                    Object obj2 = c1083.f1224[i8];
                                                    if (obj2 instanceof C1082) {
                                                        C1082 c1082 = (C1082) obj2;
                                                        Object[] objArr = c1082.f1345;
                                                        long[] jArr4 = c1082.f1346;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        c20863 = c20864;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr4[i10];
                                                                    j = j4;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j6 & 255) < 128) {
                                                                                j3 = j6;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((C2224) objArr[i13]).m3090()) {
                                                                                    c1082.m1302(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j6;
                                                                            }
                                                                            j6 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                        if (i10 == length2) {
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        zM1433 = c1082.m1433();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        c20863 = c20864;
                                                        j = j4;
                                                        obj2.getClass();
                                                        zM1433 = !((C2224) obj2).m3090();
                                                    }
                                                    if (zM1433) {
                                                        c1083.m1319(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    c20863 = c20864;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                c20864 = c20863;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            c20862 = c20864;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            c20862 = c20864;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        c20864 = c20862;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    c20862 = c20864;
                                }
                                m3023();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            c20862 = c20864;
                        }
                        try {
                            if (c82702.f20497.m13212() && this.f4301 == null) {
                                c20862.m2741();
                            }
                            return;
                        } finally {
                            c20862.m2742();
                        }
                    } catch (Throwable th3) {
                        try {
                            c2070M2623.m2674(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            if (c82702.f20497.m13212() && this.f4301 == null) {
                c20864.m2741();
            }
            throw th;
        } finally {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m3007() {
        synchronized (this.f4304) {
            try {
                m3006(this.f4295);
                m3017();
            } catch (Throwable th) {
                try {
                    if (!this.f4303.f1341.m1433()) {
                        C2086 c2086 = this.f4297;
                        try {
                            c2086.m2743(this.f4303, this.f4290.m2912());
                            c2086.m2741();
                            c2086.m2742();
                        } catch (Throwable th2) {
                            c2086.m2742();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    m3010();
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[EDGE_INSN: B:73:0x0183->B:220:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3008(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        int i;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zM1434;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean zM1433;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c2;
        long j8;
        int i2;
        int i3;
        long[] jArr9;
        boolean z2 = set instanceof C2057;
        C1083 c1083 = this.f4296;
        Object obj = null;
        int i4 = 8;
        if (z2) {
            AbstractC1133 abstractC1133 = ((C2057) set).f3863;
            Object[] objArr = abstractC1133.f1345;
            long[] jArr10 = abstractC1133.f1346;
            int length = jArr10.length - 2;
            if (length >= 0) {
                int i5 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr10[i5];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i5 << 3) + i7];
                                c2 = c3;
                                if (obj2 instanceof C2224) {
                                    ((C2224) obj2).m3089(obj);
                                } else {
                                    m3009(obj2, z);
                                    Object objM1317 = c1083.m1317(obj2);
                                    if (objM1317 != null) {
                                        if (objM1317 instanceof C1082) {
                                            C1082 c1082 = (C1082) objM1317;
                                            Object[] objArr2 = c1082.f1345;
                                            long[] jArr11 = c1082.f1346;
                                            int length2 = jArr11.length - 2;
                                            if (length2 >= 0) {
                                                int i8 = i4;
                                                i2 = length;
                                                int i9 = 0;
                                                while (true) {
                                                    long j10 = jArr11[i9];
                                                    j8 = j9;
                                                    long[] jArr12 = jArr11;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                                        int i11 = 0;
                                                        while (i11 < i10) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr9 = jArr10;
                                                                m3009((C2197) objArr2[(i9 << 3) + i11], z);
                                                            } else {
                                                                jArr9 = jArr10;
                                                            }
                                                            j10 >>= i8;
                                                            i11++;
                                                            jArr10 = jArr9;
                                                        }
                                                        jArr8 = jArr10;
                                                        if (i10 != i8) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr10;
                                                    }
                                                    if (i9 == length2) {
                                                        break;
                                                    }
                                                    i9++;
                                                    jArr11 = jArr12;
                                                    j9 = j8;
                                                    jArr10 = jArr8;
                                                    i8 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr10;
                                            j8 = j9;
                                            i2 = length;
                                            m3009((C2197) objM1317, z);
                                        }
                                        i3 = 8;
                                    }
                                }
                                jArr8 = jArr10;
                                j8 = j9;
                                i2 = length;
                                i3 = 8;
                            } else {
                                jArr8 = jArr10;
                                c2 = c3;
                                j8 = j9;
                                i2 = length;
                                i3 = i4;
                            }
                            j9 = j8 >> i3;
                            i7++;
                            length = i2;
                            i4 = i3;
                            c3 = c2;
                            jArr10 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr10;
                        c = c3;
                        int i12 = length;
                        if (i6 != i4) {
                            break;
                        } else {
                            length = i12;
                        }
                    } else {
                        jArr7 = jArr10;
                        c = 7;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr10 = jArr7;
                    obj = null;
                    i4 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof C2224) {
                    ((C2224) obj3).m3089(null);
                } else {
                    m3009(obj3, z);
                    Object objM13172 = c1083.m1317(obj3);
                    if (objM13172 != null) {
                        if (objM13172 instanceof C1082) {
                            C1082 c10822 = (C1082) objM13172;
                            Object[] objArr3 = c10822.f1345;
                            long[] jArr13 = c10822.f1346;
                            int length3 = jArr13.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j11 = jArr13[i];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                m3009((C2197) objArr3[(i << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 == 8) {
                                            i = i != length3 ? i + 1 : 0;
                                        }
                                    }
                                }
                            }
                        } else {
                            m3009((C2197) objM13172, z);
                        }
                    }
                }
            }
        }
        C1083 c10832 = this.f4308;
        C1082 c10823 = this.f4305;
        if (z) {
            C1082 c10824 = this.f4306;
            if (c10824.m1432()) {
                long[] jArr14 = c10832.f1226;
                int length4 = jArr14.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr14[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = c10832.f1225[i18];
                                    Object obj5 = c10832.f1224[i18];
                                    if (obj5 instanceof C1082) {
                                        C1082 c10825 = (C1082) obj5;
                                        Object[] objArr4 = c10825.f1345;
                                        long[] jArr15 = c10825.f1346;
                                        int length5 = jArr15.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr15[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr16 = jArr15;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr14;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            C2224 c2224 = (C2224) objArr5[i22];
                                                            if (c10824.m1434(c2224) || c10823.m1434(c2224)) {
                                                                c10825.m1302(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr14;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr14 = jArr6;
                                                    }
                                                    jArr5 = jArr14;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr14;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr15 = jArr16;
                                                jArr14 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr14;
                                            j6 = j12;
                                        }
                                        zM1433 = c10825.m1433();
                                    } else {
                                        jArr5 = jArr14;
                                        j6 = j12;
                                        obj5.getClass();
                                        C2224 c22242 = (C2224) obj5;
                                        zM1433 = c10824.m1434(c22242) || c10823.m1434(c22242);
                                    }
                                    if (zM1433) {
                                        c10832.m1319(i18);
                                    }
                                } else {
                                    jArr5 = jArr14;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr14 = jArr5;
                            }
                            jArr4 = jArr14;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr14;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr14 = jArr4;
                    }
                }
                c10824.m1300();
                m3023();
                return;
            }
        }
        if (c10823.m1432()) {
            long[] jArr17 = c10832.f1226;
            int length6 = jArr17.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr17[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = c10832.f1225[i26];
                                Object obj7 = c10832.f1224[i26];
                                if (obj7 instanceof C1082) {
                                    C1082 c10826 = (C1082) obj7;
                                    Object[] objArr6 = c10826.f1345;
                                    long[] jArr18 = c10826.f1346;
                                    int length7 = jArr18.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr18[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr19 = jArr18;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr17;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (c10823.m1434((C2224) objArr7[i30])) {
                                                            c10826.m1302(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr17;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr17 = jArr3;
                                                }
                                                jArr2 = jArr17;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr17;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr18 = jArr19;
                                            jArr17 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr17;
                                        j4 = j14;
                                    }
                                    zM1434 = c10826.m1433();
                                } else {
                                    jArr2 = jArr17;
                                    j4 = j14;
                                    obj7.getClass();
                                    zM1434 = c10823.m1434((C2224) obj7);
                                }
                                if (zM1434) {
                                    c10832.m1319(i26);
                                }
                            } else {
                                jArr2 = jArr17;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr17 = jArr2;
                        }
                        jArr = jArr17;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr17;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr17 = jArr;
                }
            }
            m3023();
            c10823.m1300();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m3009(Object obj, boolean z) {
        Object objM1317 = this.f4308.m1317(obj);
        if (objM1317 == null) {
            return;
        }
        boolean z2 = objM1317 instanceof C1082;
        C1082 c1082 = this.f4305;
        C1082 c10822 = this.f4306;
        C1083 c1083 = this.f4293;
        if (!z2) {
            C2224 c2224 = (C2224) objM1317;
            if (AbstractC3887.m7202(c1083, obj, c2224) || c2224.m3089(obj) == InvalidationResult.IGNORED) {
                return;
            }
            if (c2224.f4383 == null || z) {
                c1082.m1301(c2224);
                return;
            } else {
                c10822.m1301(c2224);
                return;
            }
        }
        C1082 c10823 = (C1082) objM1317;
        Object[] objArr = c10823.f1345;
        long[] jArr = c10823.f1346;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        C2224 c22242 = (C2224) objArr[(i << 3) + i3];
                        if (!AbstractC3887.m7202(c1083, obj, c22242) && c22242.m3089(obj) != InvalidationResult.IGNORED) {
                            if (c22242.f4383 == null || z) {
                                c1082.m1301(c22242);
                            } else {
                                c10822.m1301(c22242);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m3010() {
        this.f4310.set(null);
        this.f4295.f20497.m13210();
        this.f4294.f20497.m13210();
        C1084 c1084 = this.f4303;
        if (c1084.f1341.m1433()) {
            return;
        }
        C2086 c2086 = this.f4297;
        try {
            c2086.m2743(c1084, this.f4290.m2912());
            c2086.m2741();
        } finally {
            c2086.m2742();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m3011(Object obj) {
        Object objM1317 = this.f4308.m1317(obj);
        if (objM1317 == null) {
            return;
        }
        boolean z = objM1317 instanceof C1082;
        C1083 c1083 = this.f4293;
        if (!z) {
            C2224 c2224 = (C2224) objM1317;
            if (c2224.m3089(obj) == InvalidationResult.IMMINENT) {
                AbstractC3887.m7208(c1083, obj, c2224);
                return;
            }
            return;
        }
        C1082 c1082 = (C1082) objM1317;
        Object[] objArr = c1082.f1345;
        long[] jArr = c1082.f1346;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        C2224 c22242 = (C2224) objArr[(i << 3) + i3];
                        if (c22242.m3089(obj) == InvalidationResult.IMMINENT) {
                            AbstractC3887.m7208(c1083, obj, c22242);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c9 A[Catch: all -> 0x0044, EDGE_INSN: B:79:0x00c9->B:64:0x00c9 BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], EDGE_INSN: B:80:0x00c9->B:64:0x00c9 BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InvalidationResult m3012(C2224 c2224, C2065 c2065, Object obj) {
        synchronized (this.f4304) {
            try {
                C2198 c2198 = this.f4300;
                C2198 c21982 = null;
                if (c2198 != null) {
                    C2068 c2068 = this.f4307;
                    int i = this.f4299;
                    if (c2068.f3888) {
                        AbstractC2209.m3067("Writer is active");
                    }
                    if (i < 0 || i >= c2068.f3889) {
                        AbstractC2209.m3067("Invalid group index");
                    }
                    C2065 c2065M7411 = AbstractC3898.m7411(c2065);
                    if (c2068.m2627(c2065M7411)) {
                        int i2 = c2068.f3890[(i * 5) + 3] + i;
                        int i3 = c2065M7411.f3879;
                        if (i > i3 || i3 >= i2) {
                            c2198 = null;
                        }
                        c21982 = c2198;
                    }
                }
                if (c21982 == null) {
                    C2159 c2159 = this.f4290;
                    if (c2159.f4200 && c2159.m2954(c2224, obj)) {
                        return InvalidationResult.IMMINENT;
                    }
                    if (obj == null) {
                        this.f4292.m1315(c2224, C2188.f4266);
                    } else {
                        boolean z = obj instanceof C2197;
                        C1083 c1083 = this.f4292;
                        if (z) {
                            Object objM1317 = c1083.m1317(c2224);
                            if (objM1317 == null) {
                                AbstractC3887.m7208(this.f4292, c2224, obj);
                            } else if (objM1317 instanceof C1082) {
                                C1082 c1082 = (C1082) objM1317;
                                Object[] objArr = c1082.f1345;
                                long[] jArr = c1082.f1346;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    loop0: while (true) {
                                        long j = jArr[i4];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                                            for (int i6 = 0; i6 < i5; i6++) {
                                                if ((255 & j) < 128 && objArr[(i4 << 3) + i6] == C2188.f4266) {
                                                    break loop0;
                                                }
                                                j >>= 8;
                                            }
                                            if (i5 != 8) {
                                                break;
                                            }
                                            if (i4 == length) {
                                                break;
                                            }
                                            i4++;
                                        }
                                    }
                                    AbstractC3887.m7208(this.f4292, c2224, obj);
                                }
                            } else if (objM1317 == C2188.f4266) {
                            }
                        } else {
                            c1083.m1315(c2224, C2188.f4266);
                        }
                    }
                }
                if (c21982 != null) {
                    return c21982.m3012(c2224, c2065, obj);
                }
                this.f4311.mo2892(this);
                return this.f4290.f4200 ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m3013(C2057 c2057) {
        Object obj;
        while (true) {
            Object obj2 = this.f4310.get();
            if (obj2 == null || obj2.equals(AbstractC2202.f4318)) {
                obj = c2057;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, c2057};
            } else {
                if (!(obj2 instanceof Object[])) {
                    C1123.m1405(this.f4310, "corrupt pendingModifications: ");
                    return;
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = c2057;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.f4310;
            while (!atomicReference.compareAndSet(obj2, obj)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            if (obj2 == null) {
                synchronized (this.f4304) {
                    m3017();
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3014(Object obj) {
        C2224 c2224M2929;
        int i;
        boolean z;
        int i2;
        C2159 c2159 = this.f4290;
        if (c2159.f4193 <= 0 && (c2224M2929 = c2159.m2929()) != null) {
            int i3 = c2224M2929.f4381 | 1;
            c2224M2929.f4381 = i3;
            if ((i3 & 32) == 0) {
                C1099 c1099 = c2224M2929.f4377;
                if (c1099 == null) {
                    c1099 = new C1099();
                    c2224M2929.f4377 = c1099;
                }
                int i4 = c2224M2929.f4378;
                int iM1365 = c1099.m1365(obj);
                if (iM1365 < 0) {
                    iM1365 = ~iM1365;
                    i = -1;
                } else {
                    i = c1099.f1261[iM1365];
                }
                c1099.f1262[iM1365] = obj;
                c1099.f1261[iM1365] = i4;
                z = i == c2224M2929.f4378;
            }
            this.f4298.m1005();
            if (z) {
                return;
            }
            if (obj instanceof AbstractC2091) {
                ((AbstractC2091) obj).m2759(1);
            }
            AbstractC3887.m7208(this.f4308, obj, c2224M2929);
            if (obj instanceof C2197) {
                C2197 c2197 = (C2197) obj;
                C2196 c2196M3002 = c2197.m3002();
                C1083 c1083 = this.f4296;
                AbstractC3887.m7196(c1083, obj);
                C1099 c10992 = c2196M3002.f4282;
                Object[] objArr = c10992.f1262;
                long[] jArr = c10992.f1263;
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
                                    InterfaceC2092 interfaceC2092 = (InterfaceC2092) objArr[(i5 << 3) + i8];
                                    i2 = i6;
                                    if (interfaceC2092 instanceof AbstractC2091) {
                                        ((AbstractC2091) interfaceC2092).m2759(1);
                                    }
                                    AbstractC3887.m7208(c1083, interfaceC2092, obj);
                                } else {
                                    i2 = i6;
                                }
                                j >>= i2;
                                i8++;
                                i6 = i2;
                            }
                            if (i7 != i6) {
                                break;
                            } else if (i5 == length) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                Object obj2 = c2196M3002.f4281;
                C1083 c10832 = c2224M2929.f4383;
                if (c10832 == null) {
                    c10832 = new C1083();
                    c2224M2929.f4383 = c10832;
                }
                c10832.m1315(c2197, obj2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3015(Set set) {
        boolean z = set instanceof C2057;
        C1083 c1083 = this.f4296;
        C1083 c10832 = this.f4308;
        if (z) {
            AbstractC1133 abstractC1133 = ((C2057) set).f3863;
            Object[] objArr = abstractC1133.f1345;
            long[] jArr = abstractC1133.f1346;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (c10832.m1312(obj) || c1083.m1312(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
            }
        } else {
            for (Object obj2 : set) {
                if (c10832.m1312(obj2) || c1083.m1312(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean m3016() {
        synchronized (this.f4304) {
            C2226 c2226 = this.f4301;
            boolean z = false;
            if (c2226 != null && (c2226.f4391.get() != PausedCompositionState.Recomposing || c2226.f4395 != AbstractC2089.m2751())) {
                AtomicReference atomicReference = c2226.f4391;
                PausedCompositionState pausedCompositionState = PausedCompositionState.ApplyPending;
                PausedCompositionState pausedCompositionState2 = PausedCompositionState.RecomposePending;
                while (!atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2) && atomicReference.get() == pausedCompositionState) {
                }
                ((C1094) c2226.f4394.f4248).m1355(9);
                return false;
            }
            m3018();
            try {
                C1083 c1083 = this.f4292;
                this.f4292 = AbstractC3887.m7223();
                try {
                    C2159 c2159 = this.f4290;
                    InterfaceC2177 interfaceC2177 = this.f4302;
                    C8252 c8252 = c2159.f4203.f20497;
                    if (!c8252.m13212()) {
                        AbstractC2209.m3067("Expected applyChanges() to have been called");
                    }
                    if (c1083.f1222 > 0 || !c2159.f4209.isEmpty()) {
                        c2159.f4185 = interfaceC2177;
                        try {
                            c2159.m2932(c1083, null);
                            c2159.f4185 = null;
                            z = !c8252.m13212();
                        } catch (Throwable th) {
                            c2159.f4185 = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        m3017();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.f4292 = c1083;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.f4303.f1341.m1433()) {
                        C2086 c2086 = this.f4297;
                        try {
                            c2086.m2743(this.f4303, this.f4290.m2912());
                            c2086.m2741();
                            c2086.m2742();
                        } catch (Throwable th4) {
                            c2086.m2742();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    m3010();
                    throw th5;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m3017() {
        AtomicReference atomicReference = this.f4310;
        Object andSet = atomicReference.getAndSet(null);
        if (AbstractC5227.m9466(andSet, AbstractC2202.f4318)) {
            return;
        }
        if (andSet instanceof Set) {
            m3008((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                m3008(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.f4301 == null) {
                AbstractC2209.m3067("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            AbstractC2209.m3066("corrupt pendingModifications drain: " + atomicReference);
            C5043.m9161();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m3018() {
        Object obj = AbstractC2202.f4318;
        AtomicReference atomicReference = this.f4310;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                AbstractC2209.m3066("pending composition has not been applied");
                C5043.m9161();
                return;
            }
            if (andSet instanceof Set) {
                m3008((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                AbstractC2209.m3066("corrupt pendingModifications drain: " + atomicReference);
                C5043.m9161();
                return;
            }
            for (Set set : (Set[]) andSet) {
                m3008(set, true);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m3019(ArrayList arrayList) {
        C1084 c1084 = this.f4303;
        C2159 c2159 = this.f4290;
        if (arrayList.size() > 0) {
            ((AbstractC2140) ((Pair) arrayList.get(0)).getFirst()).getClass();
            AbstractC2209.m3067("Check failed");
        }
        try {
            c2159.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    c2159.m2910(arrayList);
                    c2159.m2942();
                } catch (Throwable th) {
                    c2159.m2925();
                    throw th;
                }
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th2) {
            try {
                if (!c1084.f1341.m1433()) {
                    C2086 c2086 = this.f4297;
                    try {
                        c2086.m2743(c1084, c2159.m2912());
                        c2086.m2741();
                        c2086.m2742();
                    } catch (Throwable th3) {
                        c2086.m2742();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                m3010();
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InvalidationResult m3020(C2224 c2224, Object obj) {
        C2198 c2198;
        int i = c2224.f4381;
        if ((i & 2) != 0) {
            c2224.f4381 = i | 4;
        }
        C2065 c2065 = c2224.f4380;
        if (c2065 == null || !c2065.m2621()) {
            return InvalidationResult.IGNORED;
        }
        C2068 c2068 = this.f4307;
        c2068.getClass();
        C2065 c20652 = c2224.f4380;
        if (c20652 != null && c2068.m2627(AbstractC3898.m7411(c20652))) {
            if (c2224.f4379 == null) {
                return InvalidationResult.IGNORED;
            }
            InvalidationResult invalidationResultM3012 = m3012(c2224, c2065, obj);
            if (invalidationResultM3012 != InvalidationResult.IGNORED) {
                this.f4298.m1005();
            }
            return invalidationResultM3012;
        }
        synchronized (this.f4304) {
            c2198 = this.f4300;
        }
        if (c2198 != null) {
            C2159 c2159 = c2198.f4290;
            if (c2159.f4200 && c2159.m2954(c2224, obj)) {
                return InvalidationResult.IMMINENT;
            }
        }
        return InvalidationResult.IGNORED;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m3021() {
        EmptySet emptySet = EmptySet.INSTANCE;
        AtomicReference atomicReference = this.f4310;
        Object andSet = atomicReference.getAndSet(emptySet);
        if (AbstractC5227.m9466(andSet, AbstractC2202.f4318) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            m3008((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            AbstractC2209.m3066("corrupt pendingModifications drain: " + atomicReference);
            C5043.m9161();
            return;
        }
        for (Set set : (Set[]) andSet) {
            m3008(set, false);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m3022() {
        int i = this.f4289;
        if (i != 0) {
            AbstractC2227.m3097(i != 1 ? i != 2 ? i != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.f4301 == null) {
            return;
        }
        AbstractC2227.m3097("A pausable composition is in progress");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m3023() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean zM1433;
        int i4;
        int i5;
        C1083 c1083 = this.f4296;
        long[] jArr3 = c1083.f1226;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = c1083.f1225[i10];
                            Object obj2 = c1083.f1224[i10];
                            c2 = c3;
                            boolean z = obj2 instanceof C1082;
                            j5 = j8;
                            C1083 c10832 = this.f4308;
                            if (z) {
                                C1082 c1082 = (C1082) obj2;
                                Object[] objArr = c1082.f1345;
                                long[] jArr4 = c1082.f1346;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!c10832.m1312((C2197) objArr[i15])) {
                                                        c1082.m1302(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                zM1433 = c1082.m1433();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                zM1433 = !c10832.m1312((C2197) obj2);
                            }
                            if (zM1433) {
                                c1083.m1319(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        C1082 c10822 = this.f4306;
        if (!c10822.m1432()) {
            return;
        }
        Object[] objArr2 = c10822.f1345;
        long[] jArr5 = c10822.f1346;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((C2224) objArr2[i20]).f4383 == null) {
                            c10822.m1302(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m3024() {
        C2086 c2086;
        synchronized (this.f4304) {
            try {
                this.f4290.f4213 = null;
                if (!this.f4303.f1341.m1433()) {
                    c2086 = this.f4297;
                    try {
                        c2086.m2743(this.f4303, this.f4290.m2912());
                        c2086.m2741();
                        c2086.m2742();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.f4303.f1341.m1433()) {
                        c2086 = this.f4297;
                        try {
                            c2086.m2743(this.f4303, this.f4290.m2912());
                            c2086.m2741();
                            c2086.m2742();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    m3010();
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C2226 m3025(boolean z, InterfaceC7383 interfaceC7383) {
        if (this.f4301 != null) {
            AbstractC2227.m3097("A pausable composition is in progress");
        }
        C2226 c2226 = new C2226(this, this.f4311, this.f4290, this.f4303, interfaceC7383, z, this.f4309, this.f4304);
        this.f4301 = c2226;
        return c2226;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m3026() {
        synchronized (this.f4304) {
            try {
                if (this.f4301 != null) {
                    AbstractC2227.m3097("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.f4307.f3889 == 0;
                if (!z || !this.f4303.f1341.m1433()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        C2086 c2086 = this.f4297;
                        try {
                            c2086.m2743(this.f4303, this.f4290.m2912());
                            if (!z) {
                                C2068 c2068 = this.f4307;
                                C2086 c20862 = this.f4297;
                                C2070 c2070M2623 = c2068.m2623();
                                try {
                                    c2070M2623.m2685(c2070M2623.f3915, new C1898(c20862, 5, c2070M2623));
                                    c2070M2623.m2674(true);
                                    this.f4309.mo2997();
                                    c2086.m2740();
                                } catch (Throwable th) {
                                    c2070M2623.m2674(false);
                                    throw th;
                                }
                            }
                            c2086.m2741();
                            c2086.m2742();
                        } catch (Throwable th2) {
                            c2086.m2742();
                            throw th2;
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
                this.f4308.m1314();
                this.f4296.m1314();
                this.f4292.m1314();
                this.f4295.f20497.m13210();
                this.f4294.f20497.m13210();
                C2159 c2159 = this.f4290;
                c2159.f4201.clear();
                c2159.f4209.clear();
                c2159.f4203.f20497.m13210();
                c2159.f4213 = null;
                this.f4289 = 1;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m3027() {
        boolean z;
        synchronized (this.f4304) {
            z = true;
            if (this.f4289 != 1) {
                z = false;
            }
            if (z) {
                this.f4289 = 0;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m3028(InterfaceC7383 interfaceC7383) {
        try {
            synchronized (this.f4304) {
                m3018();
                C1083 c1083 = this.f4292;
                this.f4292 = AbstractC3887.m7223();
                try {
                    C2159 c2159 = this.f4290;
                    InterfaceC2177 interfaceC2177 = this.f4302;
                    if (!c2159.f4203.f20497.m13212()) {
                        AbstractC2209.m3067("Expected applyChanges() to have been called");
                    }
                    c2159.f4185 = interfaceC2177;
                    try {
                        c2159.m2932(c1083, interfaceC7383);
                    } finally {
                        c2159.f4185 = null;
                    }
                } catch (Throwable th) {
                    this.f4292 = c1083;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.f4303.f1341.m1433()) {
                    C2086 c2086 = this.f4297;
                    try {
                        c2086.m2743(this.f4303, this.f4290.m2912());
                        c2086.m2741();
                        c2086.m2742();
                    } catch (Throwable th3) {
                        c2086.m2742();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                m3010();
                throw th4;
            }
        }
    }
}
