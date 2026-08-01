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
import com.alibaba.fastjson2.C2942;
import java.util.List;
import kotlin.collections.AbstractC4344;
import p305.C8623;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0752 implements InterfaceC0689, InterfaceC0507 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0513 f2176;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0507 f2177;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f2178;

    public /* synthetic */ C0752(InterfaceC0507 interfaceC0507, InterfaceC0513 interfaceC0513, int i) {
        this.f2178 = i;
        this.f2176 = interfaceC0513;
        this.f2177 = interfaceC0507;
    }

    @Override // androidx.compose.foundation.gestures.InterfaceC0507
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final float mo1251(float f) {
        switch (this.f2178) {
        }
        return this.f2177.mo1251(f);
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0689
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo1488(int i) {
        int i2;
        int size;
        int i3 = this.f2178;
        Object obj = null;
        InterfaceC0513 interfaceC0513 = this.f2176;
        switch (i3) {
            case 0:
                C0757 c0757M1551 = ((C0741) interfaceC0513).m1551();
                if (c0757M1551.f2213.isEmpty()) {
                    return 0;
                }
                int iMo1493 = mo1493();
                if (i > mo1492() || iMo1493 > i) {
                    return ((i - mo1493()) * AbstractC0759.m1567(c0757M1551)) - mo1490();
                }
                List list = c0757M1551.f2213;
                int size2 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 < size2) {
                        Object obj2 = list.get(i4);
                        if (((C0749) obj2).f2162 == i) {
                            obj = obj2;
                        } else {
                            i4++;
                        }
                    }
                }
                C0749 c0749 = (C0749) obj;
                if (c0749 != null) {
                    return c0749.f2172;
                }
                return 0;
            case 1:
                C0676 c0676 = (C0676) interfaceC0513;
                C0677 c0677 = (C0677) ((AbstractC1347) c0676.f1880).getValue();
                List list2 = c0677.f1888;
                if (list2.isEmpty()) {
                    return 0;
                }
                int iMo14932 = mo1493();
                mo1492();
                if (i <= 0 && iMo14932 <= i) {
                    if (list2.size() <= 0) {
                        Orientation orientation = Orientation.Vertical;
                        return 0;
                    }
                    list2.get(0).getClass();
                    C2942.m6394();
                    return 0;
                }
                ((C0677) ((AbstractC1347) c0676.f1880).getValue()).getClass();
                if (c0677.f1887 == Orientation.Vertical) {
                }
                if (list2.isEmpty()) {
                    i2 = 0;
                } else {
                    if (list2.size() > 0) {
                        c0677.f1888.get(0).getClass();
                        C2942.m6394();
                        return 0;
                    }
                    i2 = 0 / 0;
                }
                return (((((-1) * (i < mo1493() ? -1 : 1)) + (i - mo1493())) / 0) * i2) - mo1490();
            default:
                C0736 c0736 = (C0736) interfaceC0513;
                C0738 c0738 = (C0738) ((AbstractC1347) c0736.f2076).getValue();
                List list3 = c0738.f2098;
                if (list3.isEmpty()) {
                    return 0;
                }
                if (list3.size() > 0) {
                    list3.get(0).getClass();
                    C2942.m6394();
                    return 0;
                }
                C0738 c07382 = AbstractC0737.f2088;
                if (list3.isEmpty()) {
                    size = 0;
                } else {
                    if (list3.size() > 0) {
                        if (list3.get(0) != null) {
                            C2942.m6394();
                            return 0;
                        }
                        if (c0738.f2097 == Orientation.Vertical) {
                            throw null;
                        }
                        throw null;
                    }
                    size = 0 / list3.size();
                }
                C8623 c8623 = ((C0738) ((AbstractC1347) c0736.f2076).getValue()).f2089;
                return (((i / 0) - (mo1493() / 0)) * size) - mo1490();
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0689
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1489() {
        switch (this.f2178) {
            case 0:
                break;
            case 1:
                ((C0677) ((AbstractC1347) ((C0676) this.f2176).f1880).getValue()).getClass();
                break;
            default:
                ((C0738) ((AbstractC1347) ((C0736) this.f2176).f2076).getValue()).getClass();
                break;
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0689
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo1490() {
        switch (this.f2178) {
            case 0:
                return ((C0741) this.f2176).f2105.m1558();
            case 1:
                return ((AbstractC1346) ((InterfaceC1398) ((C0676) this.f2176).f1881.f320)).m2432();
            default:
                return ((AbstractC1346) ((InterfaceC1398) ((C0736) this.f2176).f2077.f574)).m2432();
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0689
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo1491(int i, int i2) {
        switch (this.f2178) {
            case 0:
                ((C0741) this.f2176).m1553(i, i2);
                break;
            case 1:
                ((C0676) this.f2176).m1469(i, i2);
                break;
            default:
                ((C0736) this.f2176).m1544(i, i2);
                break;
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0689
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1492() {
        int i = this.f2178;
        InterfaceC0513 interfaceC0513 = this.f2176;
        switch (i) {
            case 0:
                C0749 c0749 = (C0749) AbstractC4344.m8812(((C0741) interfaceC0513).m1551().f2213);
                if (c0749 != null) {
                }
                break;
            case 1:
                if (AbstractC4344.m8812(((C0677) ((AbstractC1347) ((C0676) interfaceC0513).f1880).getValue()).f1888) != null) {
                    C2942.m6394();
                }
                break;
            default:
                if (AbstractC4344.m8812(((C0738) ((AbstractC1347) ((C0736) interfaceC0513).f2076).getValue()).f2098) != null) {
                    C2942.m6394();
                }
                break;
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.InterfaceC0689
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo1493() {
        switch (this.f2178) {
            case 0:
                return ((C0741) this.f2176).f2105.m1560();
            case 1:
                return ((AbstractC1346) ((InterfaceC1398) ((C0676) this.f2176).f1881.f319)).m2432();
            default:
                return ((AbstractC1346) ((InterfaceC1398) ((C0736) this.f2176).f2077.f575)).m2432();
        }
    }
}
