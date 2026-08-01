package androidx.compose.runtime;

import androidx.appcompat.app.C0960;
import androidx.collection.AbstractC1132;
import androidx.collection.AbstractC1133;
import androidx.collection.C1082;
import androidx.compose.runtime.internal.C2088;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.InterfaceC5192;
import p068.InterfaceC7372;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2149 extends AbstractC2207 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC2230 f4156;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1082 f4157;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public HashSet f4158;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f4159;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f4160;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f4161;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final /* synthetic */ C2159 f4162;

    public C2149(C2159 c2159, long j, boolean z, boolean z2, C0960 c0960) {
        this.f4162 = c2159;
        this.f4161 = j;
        this.f4160 = z;
        this.f4159 = z2;
        C1082 c1082 = AbstractC1132.f1342;
        this.f4157 = new C1082();
        this.f4156 = new ParcelableSnapshotMutableState(C2088.f3986, C2188.f4264);
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo2872() {
        return this.f4159;
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo2873() {
        return this.f4160;
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean mo2874() {
        return this.f4162.f4206.mo2874();
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo2875() {
        C2159 c2159 = this.f4162;
        c2159.f4193--;
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC1133 mo2876(C2198 c2198, InterfaceC2177 interfaceC2177, InterfaceC7383 interfaceC7383) {
        return this.f4162.f4206.mo2876(c2198, interfaceC2177, interfaceC7383);
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo2877(C2198 c2198, InterfaceC7383 interfaceC7383) {
        this.f4162.f4206.mo2877(c2198, interfaceC7383);
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void mo2878() {
        this.f4162.f4193++;
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC2187 mo2879(InterfaceC7372 interfaceC7372) {
        return this.f4162.f4206.mo2879(interfaceC7372);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2880() {
        C1082 c1082 = this.f4157;
        if (c1082.m1432()) {
            HashSet hashSet = this.f4158;
            if (hashSet != null) {
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
                                    C2159 c2159 = (C2159) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(c2159.m2928());
                                    }
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
            }
            c1082.m1300();
        }
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void mo2881(C2159 c2159) {
        HashSet<Set> hashSet = this.f4158;
        if (hashSet != null) {
            for (Set set : hashSet) {
                c2159.getClass();
                set.remove(c2159.m2928());
            }
        }
        if (c2159 != null) {
            this.f4157.m1306(c2159);
        }
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void mo2882(C2198 c2198) {
        this.f4162.f4206.mo2882(c2198);
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final AbstractC1133 mo2883(C2198 c2198, InterfaceC2177 interfaceC2177, AbstractC1133 abstractC1133) {
        return this.f4162.f4206.mo2883(c2198, interfaceC2177, abstractC1133);
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final AbstractC2141 mo2884(AbstractC2140 abstractC2140) {
        return this.f4162.f4206.mo2884(abstractC2140);
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void mo2885(C2224 c2224) {
        this.f4162.f4206.mo2885(c2224);
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void mo2886(C2198 c2198) {
        this.f4162.f4206.mo2886(c2198);
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void mo2887(Set set) {
        HashSet hashSet = this.f4158;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f4158 = hashSet;
        }
        hashSet.add(set);
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void mo2888(C2159 c2159) {
        this.f4157.m1301(c2159);
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC2206 mo2889() {
        return this.f4162.f4220;
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long mo2890() {
        return this.f4161;
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean mo2891() {
        return this.f4162.f4206.mo2891();
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void mo2892(C2198 c2198) {
        C2159 c2159 = this.f4162;
        c2159.f4206.mo2892(c2159.f4220);
        c2159.f4206.mo2892(c2198);
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C2088 mo2893() {
        return (C2088) ((AbstractC2182) this.f4156).getValue();
    }

    @Override // androidx.compose.runtime.AbstractC2207
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC5192 mo2894() {
        return this.f4162.f4206.mo2894();
    }
}
