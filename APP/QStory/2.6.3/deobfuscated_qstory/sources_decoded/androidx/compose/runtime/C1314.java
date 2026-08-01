package androidx.compose.runtime;

import androidx.appcompat.app.C0113;
import androidx.collection.AbstractC0285;
import androidx.collection.AbstractC0286;
import androidx.collection.C0235;
import androidx.compose.runtime.internal.C1253;
import java.util.HashSet;
import java.util.Set;
import kotlin.coroutines.InterfaceC4360;
import p052.InterfaceC6543;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1314 extends AbstractC1372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InterfaceC1395 f3811;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0235 f3812;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public HashSet f3813;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f3814;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f3815;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f3816;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final /* synthetic */ C1324 f3817;

    public C1314(C1324 c1324, long j, boolean z, boolean z2, C0113 c0113) {
        this.f3817 = c1324;
        this.f3816 = j;
        this.f3815 = z;
        this.f3814 = z2;
        C0235 c0235 = AbstractC0285.f997;
        this.f3812 = new C0235();
        this.f3811 = new ParcelableSnapshotMutableState(C1253.f3641, C1353.f3919);
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo2312() {
        return this.f3814;
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo2313() {
        return this.f3815;
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean mo2314() {
        return this.f3817.f3861.mo2314();
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo2315() {
        C1324 c1324 = this.f3817;
        c1324.f3848--;
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC0286 mo2316(C1363 c1363, InterfaceC1342 interfaceC1342, InterfaceC6554 interfaceC6554) {
        return this.f3817.f3861.mo2316(c1363, interfaceC1342, interfaceC6554);
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo2317(C1363 c1363, InterfaceC6554 interfaceC6554) {
        this.f3817.f3861.mo2317(c1363, interfaceC6554);
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void mo2318() {
        this.f3817.f3848++;
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC1352 mo2319(InterfaceC6543 interfaceC6543) {
        return this.f3817.f3861.mo2319(interfaceC6543);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2320() {
        /*
            r15 = this;
            androidx.collection.飘花落叶言子世兰楪哲苏 r0 = r15.f3812
            boolean r1 = r0.m872()
            if (r1 == 0) goto L69
            java.util.HashSet r15 = r15.f3813
            if (r15 == 0) goto L66
            java.lang.Object[] r1 = r0.f1000
            long[] r2 = r0.f1001
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L66
            r4 = 0
            r5 = r4
        L17:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L61
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L31:
            if (r10 >= r8) goto L5f
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L5b
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            androidx.compose.runtime.飘花落叶言子世苏楪哲兰 r11 = (androidx.compose.runtime.C1324) r11
            java.util.Iterator r12 = r15.iterator()
        L47:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L5b
            java.lang.Object r13 = r12.next()
            java.util.Set r13 = (java.util.Set) r13
            androidx.compose.runtime.tooling.飘花落叶言子楪世哲兰苏 r14 = r11.m2368()
            r13.remove(r14)
            goto L47
        L5b:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L31
        L5f:
            if (r8 != r9) goto L66
        L61:
            if (r5 == r3) goto L66
            int r5 = r5 + 1
            goto L17
        L66:
            r0.m740()
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1314.m2320():void");
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void mo2321(C1324 c1324) {
        HashSet<Set> hashSet = this.f3813;
        if (hashSet != null) {
            for (Set set : hashSet) {
                c1324.getClass();
                set.remove(c1324.m2368());
            }
        }
        if (c1324 != null) {
            this.f3812.m746(c1324);
        }
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void mo2322(C1363 c1363) {
        this.f3817.f3861.mo2322(c1363);
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final AbstractC0286 mo2323(C1363 c1363, InterfaceC1342 interfaceC1342, AbstractC0286 abstractC0286) {
        return this.f3817.f3861.mo2323(c1363, interfaceC1342, abstractC0286);
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final AbstractC1306 mo2324(AbstractC1305 abstractC1305) {
        return this.f3817.f3861.mo2324(abstractC1305);
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void mo2325(C1389 c1389) {
        this.f3817.f3861.mo2325(c1389);
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void mo2326(C1363 c1363) {
        this.f3817.f3861.mo2326(c1363);
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void mo2327(Set set) {
        HashSet hashSet = this.f3813;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f3813 = hashSet;
        }
        hashSet.add(set);
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void mo2328(C1324 c1324) {
        this.f3812.m741(c1324);
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC1371 mo2329() {
        return this.f3817.f3875;
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final long mo2330() {
        return this.f3816;
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean mo2331() {
        return this.f3817.f3861.mo2331();
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void mo2332(C1363 c1363) {
        C1324 c1324 = this.f3817;
        c1324.f3861.mo2332(c1324.f3875);
        c1324.f3861.mo2332(c1363);
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C1253 mo2333() {
        return (C1253) ((AbstractC1347) this.f3811).getValue();
    }

    @Override // androidx.compose.runtime.AbstractC1372
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC4360 mo2334() {
        return this.f3817.f3861.mo2334();
    }
}
