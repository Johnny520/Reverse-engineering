package p119;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.foundation.text.AbstractC0983;
import androidx.compose.runtime.internal.C1245;
import androidx.compose.ui.text.AbstractC2048;
import androidx.compose.ui.text.C2031;
import androidx.compose.ui.text.C2033;
import androidx.compose.ui.text.C2034;
import androidx.compose.ui.text.C2062;
import androidx.compose.ui.text.C2068;
import androidx.compose.ui.text.font.InterfaceC1996;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.collections.EmptyList;
import p205.AbstractC7896;
import p205.C7897;
import p205.InterfaceC7895;
import p316.C8675;

/* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7371 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f19957;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f19958;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f19959;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f19960;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC1996 f19961;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C2068 f19962;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C2033 f19963;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public LayoutDirection f19964;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f19965;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C7373 f19968;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public List f19969;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C2031 f19970;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C1245 f19971;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC7895 f19973;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public long f19972 = AbstractC7374.f19985;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f19966 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f19967 = -1;

    public C7371(C2068 c2068, C2031 c2031, InterfaceC1996 interfaceC1996, int i, boolean z, int i2, int i3, EmptyList emptyList) {
        this.f19962 = c2068;
        this.f19961 = interfaceC1996;
        this.f19960 = i;
        this.f19959 = z;
        this.f19958 = i2;
        this.f19957 = i3;
        this.f19969 = emptyList;
        this.f19970 = c2031;
    }

    public final String toString() {
        C2034 c2034;
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object c7897 = "null";
        sb.append(this.f19963 != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) AbstractC7374.m12531(this.f19972));
        sb.append(", history=");
        sb.append(this.f19965);
        sb.append(", constraints=");
        C2033 c2033 = this.f19963;
        if (c2033 != null && (c2034 = c2033.f5990) != null) {
            c7897 = new C7897(c2034.f6000);
        }
        sb.append(c7897);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C2033 m12524(LayoutDirection layoutDirection, long j, C2062 c2062) {
        float fMin = Math.min(c2062.f6104.mo2143(), c2062.f6101);
        C2068 c2068 = this.f19962;
        C2031 c2031 = this.f19970;
        List list = this.f19969;
        if (list == null) {
            list = EmptyList.INSTANCE;
        }
        int i = this.f19958;
        boolean z = this.f19959;
        int i2 = this.f19960;
        InterfaceC7895 interfaceC7895 = this.f19973;
        interfaceC7895.getClass();
        return new C2033(new C2034(c2068, c2031, list, i, z, i2, interfaceC7895, layoutDirection, this.f19961, j), c2062, AbstractC7896.m13294(j, (((long) AbstractC0983.m1902(fMin)) << 32) | (((long) AbstractC0983.m1902(c2062.f6100)) & 4294967295L)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1245 m12525(LayoutDirection layoutDirection) {
        C1245 c1245 = this.f19971;
        if (c1245 == null || layoutDirection != this.f19964 || c1245.mo2145()) {
            this.f19964 = layoutDirection;
            C2068 c2068 = this.f19962;
            C2031 c2031M3762 = AbstractC2048.m3762(this.f19970, layoutDirection);
            InterfaceC7895 interfaceC7895 = this.f19973;
            interfaceC7895.getClass();
            InterfaceC1996 interfaceC1996 = this.f19961;
            List list = this.f19969;
            if (list == null) {
                list = EmptyList.INSTANCE;
            }
            c1245 = new C1245(c2068, c2031M3762, list, interfaceC7895, interfaceC1996);
        }
        this.f19971 = c1245;
        return c1245;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12526(InterfaceC7895 interfaceC7895) {
        long jM12532;
        InterfaceC7895 interfaceC78952 = this.f19973;
        if (interfaceC7895 != null) {
            int i = AbstractC7374.f19984;
            jM12532 = AbstractC7374.m12532(interfaceC7895.mo1246(), interfaceC7895.mo1247());
        } else {
            jM12532 = AbstractC7374.f19985;
        }
        if (interfaceC78952 == null) {
            this.f19973 = interfaceC7895;
            this.f19972 = jM12532;
        } else if (interfaceC7895 == null || this.f19972 != jM12532) {
            this.f19973 = interfaceC7895;
            this.f19972 = jM12532;
            this.f19965 = (this.f19965 << 2) | 1;
            this.f19971 = null;
            this.f19963 = null;
            this.f19967 = -1;
            this.f19966 = -1;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m12527(long j, LayoutDirection layoutDirection) {
        this.f19965 = (this.f19965 << 2) | 3;
        if (this.f19957 > 1) {
            C7373 c7373 = this.f19968;
            C2031 c2031 = this.f19970;
            InterfaceC7895 interfaceC7895 = this.f19973;
            interfaceC7895.getClass();
            C7373 c7373M14365 = C8675.m14365(c7373, layoutDirection, c2031, interfaceC7895, this.f19961);
            this.f19968 = c7373M14365;
            j = c7373M14365.m12530(this.f19957, j);
        }
        C2033 c2033 = this.f19963;
        if (c2033 != null) {
            C2062 c2062 = c2033.f5989;
            C2034 c2034 = c2033.f5990;
            if (!c2062.f6104.mo2145()) {
                LayoutDirection layoutDirection2 = c2034.f5997;
                long j2 = c2034.f6000;
                if (layoutDirection == layoutDirection2 && (C7897.m13307(j, j2) || (C7897.m13309(j) == C7897.m13309(j2) && C7897.m13313(j) == C7897.m13313(j2) && C7897.m13310(j) >= c2062.f6100 && !c2062.f6102))) {
                    C2033 c20332 = this.f19963;
                    c20332.getClass();
                    if (C7897.m13307(j, c20332.f5990.f6000)) {
                        return false;
                    }
                    C2033 c20333 = this.f19963;
                    c20333.getClass();
                    this.f19963 = m12524(layoutDirection, j, c20333.f5989);
                    return true;
                }
            }
        }
        this.f19963 = m12524(layoutDirection, j, m12528(j, layoutDirection));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2062 m12528(long j, LayoutDirection layoutDirection) {
        C1245 c1245M12525 = m12525(layoutDirection);
        long jM1165 = AbstractC0455.m1165(j, this.f19959, this.f19960, c1245M12525.mo2143());
        boolean z = this.f19959;
        int i = this.f19960;
        int i2 = this.f19958;
        return new C2062(c1245M12525, jM1165, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m12529(int i, LayoutDirection layoutDirection) {
        int i2 = this.f19966;
        int i3 = this.f19967;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jM13297 = AbstractC7896.m13297(0, i, 0, Integer.MAX_VALUE);
        if (this.f19957 > 1) {
            C7373 c7373 = this.f19968;
            C2031 c2031 = this.f19970;
            InterfaceC7895 interfaceC7895 = this.f19973;
            interfaceC7895.getClass();
            C7373 c7373M14365 = C8675.m14365(c7373, layoutDirection, c2031, interfaceC7895, this.f19961);
            this.f19968 = c7373M14365;
            jM13297 = c7373M14365.m12530(this.f19957, jM13297);
        }
        int iM1902 = AbstractC0983.m1902(m12528(jM13297, layoutDirection).f6100);
        int iM13312 = C7897.m13312(jM13297);
        if (iM1902 < iM13312) {
            iM1902 = iM13312;
        }
        this.f19966 = i;
        this.f19967 = iM1902;
        return iM1902;
    }
}
