package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.appcompat.widget.C0984;
import androidx.collection.AbstractC1119;
import androidx.collection.C1101;
import androidx.compose.foundation.gestures.AbstractC1344;
import androidx.compose.foundation.gestures.AbstractC1362;
import androidx.compose.foundation.interaction.InterfaceC1421;
import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2462;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.C2487;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.platform.InterfaceC2698;
import androidx.compose.p001ui.semantics.AbstractC2781;
import androidx.compose.p001ui.semantics.AbstractC2794;
import androidx.compose.p001ui.semantics.C2776;
import androidx.compose.p001ui.semantics.InterfaceC2779;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.InterfaceC5920;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.InterfaceC6284;
import p068.InterfaceC7372;
import p122.AbstractC8137;
import p124.C8144;
import p124.InterfaceC8146;
import p126.C8150;
import p128.C8158;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1865 extends AbstractC1892 {

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public C6249 f3349;

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public C6249 f3350;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public C2478 f3351;

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final C1101 f3352;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final C1101 f3353;

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public boolean f3354;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public long f3355;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public boolean f3356;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public boolean f3357;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public C6249 f3358;

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public boolean f3359;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public boolean f3360;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public long f3361;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public C6249 f3362;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public C8150 f3363;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public boolean f3364;

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public boolean f3365;

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public InterfaceC7372 f3366;

    public C1865(InterfaceC1933 interfaceC1933, InterfaceC1421 interfaceC1421, InterfaceC7372 interfaceC7372, InterfaceC7372 interfaceC73722) {
        super(interfaceC1421, interfaceC1933, false, true, null, null, interfaceC7372);
        this.f3366 = interfaceC73722;
        this.f3354 = true;
        int i = AbstractC1119.f1322;
        this.f3353 = new C1101(6);
        this.f3352 = new C1101(6);
        this.f3361 = -1L;
        this.f3355 = -1L;
    }

    @Override // p126.InterfaceC8149
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final void mo1781(C0984 c0984, PointerEventPass pointerEventPass) {
        ArrayList arrayList = (ArrayList) c0984.f940;
        m2527();
        if (this.f3467 && this.f3465 == null) {
            C1863 c1863 = new C1863(this);
            m3924(c1863);
            this.f3465 = c1863;
        }
        int i = 0;
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.f3363 == null || this.f3356) {
                return;
            }
            int size = arrayList.size();
            while (i < size) {
                C8150 c8150 = (C8150) arrayList.get(i);
                if (c8150.f19868 && c8150 != this.f3363) {
                    m2492(true);
                    return;
                }
                i++;
            }
            return;
        }
        if (this.f3363 == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (AbstractC1362.m1867((C8150) arrayList.get(i2))) {
                    C8150 c81502 = (C8150) arrayList.get(0);
                    c81502.f19868 = true;
                    this.f3363 = c81502;
                    if (this.f3467) {
                        C6249 c6249 = this.f3358;
                        if (c6249 != null && c6249.mo11121()) {
                            ((InterfaceC2698) AbstractC2620.m3916(this, AbstractC2737.f5921)).getClass();
                            if (c81502.f19864 - this.f3355 < 40) {
                                this.f3357 = true;
                                return;
                            }
                            this.f3359 = true;
                            C6249 c62492 = this.f3358;
                            if (c62492 != null) {
                                c62492.mo10815(null);
                            }
                            this.f3358 = null;
                        }
                        this.f3356 = false;
                        m2528(c81502);
                        if (this.f3366 != null) {
                            this.f3362 = AbstractC6231.m11036(m4427(), null, null, new CombinedClickableNode$handleDownEvent$2(this, null), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.f3356) {
            int size3 = arrayList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                C8150 c81503 = (C8150) arrayList.get(i3);
                if (!c81503.f19866 || c81503.f19862) {
                    int size4 = arrayList.size();
                    while (i < size4) {
                        ((C8150) arrayList.get(i)).f19868 = true;
                        i++;
                    }
                    return;
                }
            }
            C8150 c81504 = (C8150) arrayList.get(0);
            c81504.f19868 = true;
            long j = c81504.f19864;
            C8150 c81505 = this.f3363;
            c81505.getClass();
            m2494(j, c81505);
            return;
        }
        int size5 = arrayList.size();
        for (int i4 = 0; i4 < size5; i4++) {
            C8150 c81506 = (C8150) arrayList.get(i4);
            if (c81506.f19868 || !c81506.f19866 || c81506.f19862) {
                float fMo3838 = ((InterfaceC2698) AbstractC2620.m3916(this, AbstractC2737.f5921)).mo3838();
                int size6 = arrayList.size();
                for (int i5 = 0; i5 < size6; i5++) {
                    C8150 c81507 = (C8150) arrayList.get(i5);
                    long j2 = c81507.f19863;
                    C8150 c81508 = this.f3363;
                    c81508.getClass();
                    boolean z = Math.abs(C8158.m13086(C8158.m13085(j2, c81508.f19863))) > fMo3838;
                    if (c81507.f19868 || z) {
                        m2492(true);
                        return;
                    }
                }
                return;
            }
        }
        C8150 c81509 = (C8150) arrayList.get(0);
        c81509.f19868 = true;
        long j3 = c81509.f19864;
        C8150 c815010 = this.f3363;
        c815010.getClass();
        m2494(j3, c815010);
    }

    @Override // androidx.compose.foundation.AbstractC1892, androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final void mo1784() {
        super.mo1784();
        m2492(false);
    }

    @Override // androidx.compose.foundation.AbstractC1892, androidx.compose.p001ui.node.InterfaceC2631
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1851(C2487 c2487, PointerEventPass pointerEventPass, long j) {
        super.mo1851(c2487, pointerEventPass, j);
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass != PointerEventPass.Final || this.f3351 == null || this.f3365) {
                return;
            }
            List list = c2487.f5197;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C2478 c2478 = (C2478) list.get(i);
                if (c2478.m3582() && c2478 != this.f3351) {
                    m2492(false);
                    return;
                }
            }
            return;
        }
        if (this.f3351 == null) {
            if (AbstractC1344.m1838(c2487, true, false)) {
                C2478 c24782 = (C2478) c2487.f5197.get(0);
                c24782.m3584();
                this.f3351 = c24782;
                if (this.f3467) {
                    C6249 c6249 = this.f3349;
                    if (c6249 != null && c6249.mo11121()) {
                        ((InterfaceC2698) AbstractC2620.m3916(this, AbstractC2737.f5921)).getClass();
                        if (c24782.f5153 - this.f3361 < 40) {
                            this.f3360 = true;
                            return;
                        }
                        this.f3364 = true;
                        C6249 c62492 = this.f3349;
                        if (c62492 != null) {
                            c62492.mo10815(null);
                        }
                        this.f3349 = null;
                    }
                    this.f3365 = false;
                    m2525(c24782);
                    if (this.f3366 != null) {
                        this.f3350 = AbstractC6231.m11036(m4427(), null, null, new CombinedClickableNode$handleDownEvent$1(this, null), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        boolean z = c2487.f5195 == 2;
        List list2 = c2487.f5197;
        if (z && !this.f3365 && this.f3467 && this.f3366 != null) {
            C6249 c62493 = this.f3350;
            if (c62493 != null) {
                c62493.mo10815(null);
            }
            this.f3350 = null;
            InterfaceC7372 interfaceC7372 = this.f3366;
            if (interfaceC7372 != null) {
                interfaceC7372.invoke();
            }
            if (this.f3354) {
                ((C8144) ((InterfaceC8146) AbstractC2620.m3916(this, AbstractC2737.f5936))).m13068(0);
            }
            this.f3365 = true;
        }
        if (this.f3365) {
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (!AbstractC2481.m3587((C2478) list2.get(i2))) {
                    int size3 = list2.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        ((C2478) list2.get(i3)).m3584();
                    }
                    return;
                }
            }
            C2478 c24783 = (C2478) list2.get(0);
            c24783.m3584();
            long j2 = c24783.f5153;
            C2478 c24784 = this.f3351;
            c24784.getClass();
            m2491(j2, c24784);
            return;
        }
        int size4 = list2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            if (!AbstractC2481.m3588((C2478) list2.get(i4))) {
                long jM2529 = m2529(j);
                int size5 = list2.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    C2478 c24785 = (C2478) list2.get(i5);
                    if (c24785.m3582() || AbstractC2481.m3585(c24785, j, jM2529)) {
                        m2492(false);
                        return;
                    }
                }
                return;
            }
        }
        C2478 c24786 = (C2478) list2.get(0);
        c24786.m3584();
        long j3 = c24786.f5153;
        C2478 c24787 = this.f3351;
        c24787.getClass();
        m2491(j3, c24787);
    }

    @Override // androidx.compose.foundation.AbstractC1892
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public final void mo2488() {
        m2493();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // androidx.compose.foundation.AbstractC1892
    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo2489(KeyEvent keyEvent) {
        boolean z;
        long jM13063 = AbstractC8137.m13063(keyEvent);
        if (this.f3366 != null) {
            C1101 c1101 = this.f3353;
            if (c1101.m1374(jM13063) == null) {
                c1101.m1378(AbstractC6231.m11036(m4427(), null, null, new CombinedClickableNode$onClickKeyDownEvent$1(this, null), 3), jM13063);
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // androidx.compose.foundation.AbstractC1892
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    public final C2462 mo2490() {
        return null;
    }

    @Override // androidx.compose.foundation.AbstractC1892
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲 */
    public final void mo2139(InterfaceC2779 interfaceC2779) {
        if (this.f3366 != null) {
            C1868 c1868 = new C1868(this, 0);
            InterfaceC5920[] interfaceC5920Arr = AbstractC2781.f6100;
            interfaceC2779.mo4150(AbstractC2794.f6136, new C2776(null, c1868));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
    public final void m2491(long j, C2478 c2478) {
        if (this.f3467 && !this.f3360) {
            m2526(c2478.f5152, false);
            this.f3361 = j;
            if (!this.f3365 && !this.f3364) {
                this.f3466.invoke();
            }
        }
        this.f3351 = null;
        this.f3360 = false;
        this.f3364 = false;
        C6249 c6249 = this.f3350;
        if (c6249 != null) {
            c6249.mo10815(null);
        }
        this.f3350 = null;
        this.f3365 = false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
    public final void m2492(boolean z) {
        if (z) {
            this.f3363 = null;
            C6249 c6249 = this.f3362;
            if (c6249 != null) {
                c6249.mo10815(null);
            }
            this.f3362 = null;
            C6249 c62492 = this.f3358;
            if (c62492 != null) {
                c62492.mo10815(null);
            }
            this.f3358 = null;
            this.f3359 = false;
            this.f3356 = false;
            this.f3355 = -1L;
            this.f3357 = false;
        } else {
            this.f3351 = null;
            C6249 c62493 = this.f3350;
            if (c62493 != null) {
                c62493.mo10815(null);
            }
            this.f3350 = null;
            C6249 c62494 = this.f3349;
            if (c62494 != null) {
                c62494.mo10815(null);
            }
            this.f3349 = null;
            this.f3364 = false;
            this.f3365 = false;
            this.f3361 = -1L;
            this.f3360 = false;
        }
        m2530(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2493() {
        char c;
        long j;
        long j2;
        char c2;
        C1101 c1101 = this.f3353;
        Object[] objArr = c1101.f1272;
        long[] jArr = c1101.f1274;
        int length = jArr.length - 2;
        char c3 = 7;
        if (length >= 0) {
            int i = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i];
                j2 = 255;
                if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j3 & 255) < 128) {
                            c2 = c3;
                            ((InterfaceC6284) objArr[(i << 3) + i3]).mo10815(null);
                        } else {
                            c2 = c3;
                        }
                        j3 >>= 8;
                        i3++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    c = c3;
                }
                if (i == length) {
                    break;
                }
                i++;
                c3 = c;
            }
        } else {
            c = 7;
            j = 128;
            j2 = 255;
        }
        c1101.m1377();
        C1101 c11012 = this.f3352;
        Object[] objArr2 = c11012.f1272;
        long[] jArr2 = c11012.f1274;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i4 = 0;
            while (true) {
                long j4 = jArr2[i4];
                if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((j4 & j2) < j) {
                            ((AbstractC1867) objArr2[(i4 << 3) + i6]).getClass();
                            throw null;
                        }
                        j4 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    } else if (i4 == length2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        c11012.m1377();
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
    public final void m2494(long j, C8150 c8150) {
        if (this.f3467 && !this.f3357) {
            m2526(c8150.f19863, true);
            this.f3355 = j;
            if (!this.f3356 && !this.f3359) {
                this.f3466.invoke();
            }
        }
        this.f3363 = null;
        this.f3357 = false;
        this.f3359 = false;
        C6249 c6249 = this.f3362;
        if (c6249 != null) {
            c6249.mo10815(null);
        }
        this.f3362 = null;
        this.f3356 = false;
    }

    @Override // androidx.compose.foundation.AbstractC1892
    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public final void mo2495(KeyEvent keyEvent) {
        long jM13063 = AbstractC8137.m13063(keyEvent);
        C1101 c1101 = this.f3353;
        boolean z = false;
        if (c1101.m1374(jM13063) != null) {
            InterfaceC6284 interfaceC6284 = (InterfaceC6284) c1101.m1374(jM13063);
            if (interfaceC6284 != null) {
                if (interfaceC6284.mo11121()) {
                    interfaceC6284.mo10815(null);
                } else {
                    z = true;
                }
            }
            c1101.m1372(jM13063);
        }
        if (z) {
            return;
        }
        this.f3466.invoke();
    }

    @Override // androidx.compose.p001ui.AbstractC2961
    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪 */
    public final void mo1679() {
        m2493();
    }

    @Override // p126.InterfaceC8149
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final void mo1794() {
        m2492(true);
    }
}
