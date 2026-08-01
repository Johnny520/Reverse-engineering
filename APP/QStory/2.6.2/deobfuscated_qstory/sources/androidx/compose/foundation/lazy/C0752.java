package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.InterfaceC0507;
import androidx.compose.foundation.gestures.InterfaceC0513;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.grid.C0676;
import androidx.compose.foundation.lazy.grid.C0677;
import androidx.compose.foundation.lazy.layout.InterfaceC0689;
import androidx.compose.foundation.lazy.staggeredgrid.AbstractC0737;
import androidx.compose.foundation.lazy.staggeredgrid.C0736;
import androidx.compose.foundation.lazy.staggeredgrid.C0738;
import androidx.compose.runtime.AbstractC1346;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.InterfaceC1398;
import com.alibaba.fastjson2.C2941;
import java.util.List;
import kotlin.collections.AbstractC4343;
import p305.C8631;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0752 implements InterfaceC0689, InterfaceC0507 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0513 f2175;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0507 f2176;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f2177;

    public /* synthetic */ C0752(InterfaceC0507 interfaceC0507, InterfaceC0513 interfaceC0513, int i) {
        this.f2177 = i;
        this.f2175 = interfaceC0513;
        this.f2176 = interfaceC0507;
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0507
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final float mo1241(float f) {
        switch (this.f2177) {
        }
        return this.f2176.mo1241(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0689
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1478(int i) {
        int i2;
        int size;
        int i3 = this.f2177;
        Object obj = null;
        InterfaceC0513 interfaceC0513 = this.f2175;
        switch (i3) {
            case 0:
                C0757 c0757M1541 = ((C0741) interfaceC0513).m1541();
                if (c0757M1541.f2212.isEmpty()) {
                    return 0;
                }
                int iMo1483 = mo1483();
                if (i > mo1482() || iMo1483 > i) {
                    return ((i - mo1483()) * AbstractC0759.m1557(c0757M1541)) - mo1480();
                }
                List list = c0757M1541.f2212;
                int size2 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 < size2) {
                        Object obj2 = list.get(i4);
                        if (((C0749) obj2).f2161 == i) {
                            obj = obj2;
                        } else {
                            i4++;
                        }
                    }
                }
                C0749 c0749 = (C0749) obj;
                if (c0749 != null) {
                    return c0749.f2171;
                }
                return 0;
            case 1:
                C0676 c0676 = (C0676) interfaceC0513;
                C0677 c0677 = (C0677) ((AbstractC1347) c0676.f1879).getValue();
                List list2 = c0677.f1887;
                if (list2.isEmpty()) {
                    return 0;
                }
                int iMo14832 = mo1483();
                mo1482();
                if (i <= 0 && iMo14832 <= i) {
                    if (list2.size() <= 0) {
                        Orientation orientation = Orientation.Vertical;
                        return 0;
                    }
                    list2.get(0).getClass();
                    C2941.m6336();
                    return 0;
                }
                ((C0677) ((AbstractC1347) c0676.f1879).getValue()).getClass();
                if (c0677.f1886 == Orientation.Vertical) {
                }
                if (list2.isEmpty()) {
                    i2 = 0;
                } else {
                    if (list2.size() > 0) {
                        c0677.f1887.get(0).getClass();
                        C2941.m6336();
                        return 0;
                    }
                    i2 = 0 / 0;
                }
                return (((((-1) * (i < mo1483() ? -1 : 1)) + (i - mo1483())) / 0) * i2) - mo1480();
            default:
                C0736 c0736 = (C0736) interfaceC0513;
                C0738 c0738 = (C0738) ((AbstractC1347) c0736.f2075).getValue();
                List list3 = c0738.f2097;
                if (list3.isEmpty()) {
                    return 0;
                }
                if (list3.size() > 0) {
                    list3.get(0).getClass();
                    C2941.m6336();
                    return 0;
                }
                C0738 c07382 = AbstractC0737.f2087;
                if (list3.isEmpty()) {
                    size = 0;
                } else {
                    if (list3.size() > 0) {
                        if (list3.get(0) != null) {
                            C2941.m6336();
                            return 0;
                        }
                        if (c0738.f2096 == Orientation.Vertical) {
                            throw null;
                        }
                        throw null;
                    }
                    size = 0 / list3.size();
                }
                C8631 c8631 = ((C0738) ((AbstractC1347) c0736.f2075).getValue()).f2088;
                return (((i / 0) - (mo1483() / 0)) * size) - mo1480();
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0689
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1479() {
        switch (this.f2177) {
            case 0:
                break;
            case 1:
                ((C0677) ((AbstractC1347) ((C0676) this.f2175).f1879).getValue()).getClass();
                break;
            default:
                ((C0738) ((AbstractC1347) ((C0736) this.f2175).f2075).getValue()).getClass();
                break;
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0689
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo1480() {
        switch (this.f2177) {
            case 0:
                return ((C0741) this.f2175).f2104.m1548();
            case 1:
                return ((AbstractC1346) ((InterfaceC1398) ((C0676) this.f2175).f1880.f320)).m2422();
            default:
                return ((AbstractC1346) ((InterfaceC1398) ((C0736) this.f2175).f2076.f574)).m2422();
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0689
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo1481(int i, int i2) {
        switch (this.f2177) {
            case 0:
                ((C0741) this.f2175).m1543(i, i2);
                break;
            case 1:
                ((C0676) this.f2175).m1459(i, i2);
                break;
            default:
                ((C0736) this.f2175).m1534(i, i2);
                break;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0689
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1482() {
        int i = this.f2177;
        InterfaceC0513 interfaceC0513 = this.f2175;
        switch (i) {
            case 0:
                C0749 c0749 = (C0749) AbstractC4343.m8810(((C0741) interfaceC0513).m1541().f2212);
                if (c0749 != null) {
                }
                break;
            case 1:
                if (AbstractC4343.m8810(((C0677) ((AbstractC1347) ((C0676) interfaceC0513).f1879).getValue()).f1887) != null) {
                    C2941.m6336();
                }
                break;
            default:
                if (AbstractC4343.m8810(((C0738) ((AbstractC1347) ((C0736) interfaceC0513).f2075).getValue()).f2097) != null) {
                    C2941.m6336();
                }
                break;
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0689
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo1483() {
        switch (this.f2177) {
            case 0:
                return ((C0741) this.f2175).f2104.m1550();
            case 1:
                return ((AbstractC1346) ((InterfaceC1398) ((C0676) this.f2175).f1880.f319)).m2422();
            default:
                return ((AbstractC1346) ((InterfaceC1398) ((C0736) this.f2175).f2076.f575)).m2422();
        }
    }
}
