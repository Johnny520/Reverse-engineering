package p119;

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
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3066;
import java.util.List;
import kotlin.collections.EmptyList;
import p205.AbstractC7897;
import p205.C7898;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f19952;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f19953;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f19954;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f19955;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC1996 f19956;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C2068 f19957;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C2033 f19958;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public LayoutDirection f19959;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f19960;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C7374 f19963;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public List f19964;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C2031 f19965;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C1245 f19966;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC7896 f19968;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public long f19967 = AbstractC7375.f19980;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f19961 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f19962 = -1;

    public C7372(C2068 c2068, C2031 c2031, InterfaceC1996 interfaceC1996, int i, boolean z, int i2, int i3, EmptyList emptyList) {
        this.f19957 = c2068;
        this.f19956 = interfaceC1996;
        this.f19955 = i;
        this.f19954 = z;
        this.f19953 = i2;
        this.f19952 = i3;
        this.f19964 = emptyList;
        this.f19965 = c2031;
    }

    public final String toString() {
        C2034 c2034;
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object c7898 = "null";
        sb.append(this.f19958 != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) AbstractC7375.m12558(this.f19967));
        sb.append(", history=");
        sb.append(this.f19960);
        sb.append(", constraints=");
        C2033 c2033 = this.f19958;
        if (c2033 != null && (c2034 = c2033.f5991) != null) {
            c7898 = new C7898(c2034.f6001);
        }
        sb.append(c7898);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C2033 m12551(LayoutDirection layoutDirection, long j, C2062 c2062) {
        float fMin = Math.min(c2062.f6105.mo2153(), c2062.f6102);
        C2068 c2068 = this.f19957;
        C2031 c2031 = this.f19965;
        List list = this.f19964;
        if (list == null) {
            list = EmptyList.INSTANCE;
        }
        int i = this.f19953;
        boolean z = this.f19954;
        int i2 = this.f19955;
        InterfaceC7896 interfaceC7896 = this.f19968;
        interfaceC7896.getClass();
        return new C2033(new C2034(c2068, c2031, list, i, z, i2, interfaceC7896, layoutDirection, this.f19956, j), c2062, AbstractC7897.m13322(j, (((long) AbstractC0983.m1912(fMin)) << 32) | (((long) AbstractC0983.m1912(c2062.f6101)) & 4294967295L)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C1245 m12552(LayoutDirection layoutDirection) {
        C1245 c1245 = this.f19966;
        if (c1245 == null || layoutDirection != this.f19959 || c1245.mo2155()) {
            this.f19959 = layoutDirection;
            C2068 c2068 = this.f19957;
            C2031 c2031M3772 = AbstractC2048.m3772(this.f19965, layoutDirection);
            InterfaceC7896 interfaceC7896 = this.f19968;
            interfaceC7896.getClass();
            InterfaceC1996 interfaceC1996 = this.f19956;
            List list = this.f19964;
            if (list == null) {
                list = EmptyList.INSTANCE;
            }
            c1245 = new C1245(c2068, c2031M3772, list, interfaceC7896, interfaceC1996);
        }
        this.f19966 = c1245;
        return c1245;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m12553(InterfaceC7896 interfaceC7896) {
        long jM12559;
        InterfaceC7896 interfaceC78962 = this.f19968;
        if (interfaceC7896 != null) {
            int i = AbstractC7375.f19979;
            jM12559 = AbstractC7375.m12559(interfaceC7896.mo1256(), interfaceC7896.mo1257());
        } else {
            jM12559 = AbstractC7375.f19980;
        }
        if (interfaceC78962 == null) {
            this.f19968 = interfaceC7896;
            this.f19967 = jM12559;
        } else if (interfaceC7896 == null || this.f19967 != jM12559) {
            this.f19968 = interfaceC7896;
            this.f19967 = jM12559;
            this.f19960 = (this.f19960 << 2) | 1;
            this.f19966 = null;
            this.f19958 = null;
            this.f19962 = -1;
            this.f19961 = -1;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m12554(long j, LayoutDirection layoutDirection) {
        this.f19960 = (this.f19960 << 2) | 3;
        if (this.f19952 > 1) {
            C7374 c7374 = this.f19963;
            C2031 c2031 = this.f19965;
            InterfaceC7896 interfaceC7896 = this.f19968;
            interfaceC7896.getClass();
            C7374 c7374M6862 = AbstractC3066.m6862(c7374, layoutDirection, c2031, interfaceC7896, this.f19956);
            this.f19963 = c7374M6862;
            j = c7374M6862.m12557(this.f19952, j);
        }
        C2033 c2033 = this.f19958;
        if (c2033 != null) {
            C2062 c2062 = c2033.f5990;
            C2034 c2034 = c2033.f5991;
            if (!c2062.f6105.mo2155()) {
                LayoutDirection layoutDirection2 = c2034.f5998;
                long j2 = c2034.f6001;
                if (layoutDirection == layoutDirection2 && (C7898.m13335(j, j2) || (C7898.m13337(j) == C7898.m13337(j2) && C7898.m13341(j) == C7898.m13341(j2) && C7898.m13338(j) >= c2062.f6101 && !c2062.f6103))) {
                    C2033 c20332 = this.f19958;
                    c20332.getClass();
                    if (C7898.m13335(j, c20332.f5991.f6001)) {
                        return false;
                    }
                    C2033 c20333 = this.f19958;
                    c20333.getClass();
                    this.f19958 = m12551(layoutDirection, j, c20333.f5990);
                    return true;
                }
            }
        }
        this.f19958 = m12551(layoutDirection, j, m12555(j, layoutDirection));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2062 m12555(long j, LayoutDirection layoutDirection) {
        C1245 c1245M12552 = m12552(layoutDirection);
        long jM6657 = AbstractC3055.m6657(j, this.f19954, this.f19955, c1245M12552.mo2153());
        boolean z = this.f19954;
        int i = this.f19955;
        int i2 = this.f19953;
        return new C2062(c1245M12552, jM6657, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m12556(int i, LayoutDirection layoutDirection) {
        int i2 = this.f19961;
        int i3 = this.f19962;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jM13325 = AbstractC7897.m13325(0, i, 0, Integer.MAX_VALUE);
        if (this.f19952 > 1) {
            C7374 c7374 = this.f19963;
            C2031 c2031 = this.f19965;
            InterfaceC7896 interfaceC7896 = this.f19968;
            interfaceC7896.getClass();
            C7374 c7374M6862 = AbstractC3066.m6862(c7374, layoutDirection, c2031, interfaceC7896, this.f19956);
            this.f19963 = c7374M6862;
            jM13325 = c7374M6862.m12557(this.f19952, jM13325);
        }
        int iM1912 = AbstractC0983.m1912(m12555(jM13325, layoutDirection).f6101);
        int iM13340 = C7898.m13340(jM13325);
        if (iM1912 < iM13340) {
            iM1912 = iM13340;
        }
        this.f19961 = i;
        this.f19962 = iM1912;
        return iM1912;
    }
}
