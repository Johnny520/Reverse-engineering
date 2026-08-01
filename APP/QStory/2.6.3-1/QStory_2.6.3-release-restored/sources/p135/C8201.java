package p135;

import androidx.compose.foundation.text.AbstractC1821;
import androidx.compose.p001ui.text.AbstractC2882;
import androidx.compose.p001ui.text.C2865;
import androidx.compose.p001ui.text.C2867;
import androidx.compose.p001ui.text.C2868;
import androidx.compose.p001ui.text.C2896;
import androidx.compose.p001ui.text.C2902;
import androidx.compose.p001ui.text.font.InterfaceC2830;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.C2080;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3898;
import java.util.List;
import kotlin.collections.EmptyList;
import p221.AbstractC8726;
import p221.C8727;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8201 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f20297;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f20298;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f20299;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f20300;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC2830 f20301;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C2902 f20302;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C2867 f20303;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public LayoutDirection f20304;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f20305;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C8203 f20308;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public List f20309;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C2865 f20310;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C2080 f20311;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC8725 f20313;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public long f20312 = AbstractC8204.f20325;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f20306 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f20307 = -1;

    public C8201(C2902 c2902, C2865 c2865, InterfaceC2830 interfaceC2830, int i, boolean z, int i2, int i3, EmptyList emptyList) {
        this.f20302 = c2902;
        this.f20301 = interfaceC2830;
        this.f20300 = i;
        this.f20299 = z;
        this.f20298 = i2;
        this.f20297 = i3;
        this.f20309 = emptyList;
        this.f20310 = c2865;
    }

    public final String toString() {
        C2868 c2868;
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object c8727 = "null";
        sb.append(this.f20303 != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) AbstractC8204.m13117(this.f20312));
        sb.append(", history=");
        sb.append(this.f20305);
        sb.append(", constraints=");
        C2867 c2867 = this.f20303;
        if (c2867 != null && (c2868 = c2867.f6336) != null) {
            c8727 = new C8727(c2868.f6346);
        }
        sb.append(c8727);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C2867 m13110(LayoutDirection layoutDirection, long j, C2896 c2896) {
        float fMin = Math.min(c2896.f6450.mo2713(), c2896.f6447);
        C2902 c2902 = this.f20302;
        C2865 c2865 = this.f20310;
        List list = this.f20309;
        if (list == null) {
            list = EmptyList.INSTANCE;
        }
        int i = this.f20298;
        boolean z = this.f20299;
        int i2 = this.f20300;
        InterfaceC8725 interfaceC8725 = this.f20313;
        interfaceC8725.getClass();
        return new C2867(new C2868(c2902, c2865, list, i, z, i2, interfaceC8725, layoutDirection, this.f20301, j), c2896, AbstractC8726.m13881(j, (((long) AbstractC1821.m2472(fMin)) << 32) | (((long) AbstractC1821.m2472(c2896.f6446)) & 4294967295L)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2080 m13111(LayoutDirection layoutDirection) {
        C2080 c2080 = this.f20311;
        if (c2080 == null || layoutDirection != this.f20304 || c2080.mo2715()) {
            this.f20304 = layoutDirection;
            C2902 c2902 = this.f20302;
            C2865 c2865M4332 = AbstractC2882.m4332(this.f20310, layoutDirection);
            InterfaceC8725 interfaceC8725 = this.f20313;
            interfaceC8725.getClass();
            InterfaceC2830 interfaceC2830 = this.f20301;
            List list = this.f20309;
            if (list == null) {
                list = EmptyList.INSTANCE;
            }
            c2080 = new C2080(c2902, c2865M4332, list, interfaceC8725, interfaceC2830);
        }
        this.f20311 = c2080;
        return c2080;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13112(InterfaceC8725 interfaceC8725) {
        long jM13118;
        InterfaceC8725 interfaceC87252 = this.f20313;
        if (interfaceC8725 != null) {
            int i = AbstractC8204.f20324;
            jM13118 = AbstractC8204.m13118(interfaceC8725.mo1816(), interfaceC8725.mo1817());
        } else {
            jM13118 = AbstractC8204.f20325;
        }
        if (interfaceC87252 == null) {
            this.f20313 = interfaceC8725;
            this.f20312 = jM13118;
        } else if (interfaceC8725 == null || this.f20312 != jM13118) {
            this.f20313 = interfaceC8725;
            this.f20312 = jM13118;
            this.f20305 = (this.f20305 << 2) | 1;
            this.f20311 = null;
            this.f20303 = null;
            this.f20307 = -1;
            this.f20306 = -1;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m13113(long j, LayoutDirection layoutDirection) {
        this.f20305 = (this.f20305 << 2) | 3;
        if (this.f20297 > 1) {
            C8203 c8203 = this.f20308;
            C2865 c2865 = this.f20310;
            InterfaceC8725 interfaceC8725 = this.f20313;
            interfaceC8725.getClass();
            C8203 c8203M7422 = AbstractC3898.m7422(c8203, layoutDirection, c2865, interfaceC8725, this.f20301);
            this.f20308 = c8203M7422;
            j = c8203M7422.m13116(this.f20297, j);
        }
        C2867 c2867 = this.f20303;
        if (c2867 != null) {
            C2896 c2896 = c2867.f6335;
            C2868 c2868 = c2867.f6336;
            if (!c2896.f6450.mo2715()) {
                LayoutDirection layoutDirection2 = c2868.f6343;
                long j2 = c2868.f6346;
                if (layoutDirection == layoutDirection2 && (C8727.m13894(j, j2) || (C8727.m13896(j) == C8727.m13896(j2) && C8727.m13900(j) == C8727.m13900(j2) && C8727.m13897(j) >= c2896.f6446 && !c2896.f6448))) {
                    C2867 c28672 = this.f20303;
                    c28672.getClass();
                    if (C8727.m13894(j, c28672.f6336.f6346)) {
                        return false;
                    }
                    C2867 c28673 = this.f20303;
                    c28673.getClass();
                    this.f20303 = m13110(layoutDirection, j, c28673.f6335);
                    return true;
                }
            }
        }
        this.f20303 = m13110(layoutDirection, j, m13114(j, layoutDirection));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2896 m13114(long j, LayoutDirection layoutDirection) {
        C2080 c2080M13111 = m13111(layoutDirection);
        long jM7217 = AbstractC3887.m7217(j, this.f20299, this.f20300, c2080M13111.mo2713());
        boolean z = this.f20299;
        int i = this.f20300;
        int i2 = this.f20298;
        return new C2896(c2080M13111, jM7217, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m13115(int i, LayoutDirection layoutDirection) {
        int i2 = this.f20306;
        int i3 = this.f20307;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jM13884 = AbstractC8726.m13884(0, i, 0, Integer.MAX_VALUE);
        if (this.f20297 > 1) {
            C8203 c8203 = this.f20308;
            C2865 c2865 = this.f20310;
            InterfaceC8725 interfaceC8725 = this.f20313;
            interfaceC8725.getClass();
            C8203 c8203M7422 = AbstractC3898.m7422(c8203, layoutDirection, c2865, interfaceC8725, this.f20301);
            this.f20308 = c8203M7422;
            jM13884 = c8203M7422.m13116(this.f20297, jM13884);
        }
        int iM2472 = AbstractC1821.m2472(m13114(jM13884, layoutDirection).f6446);
        int iM13899 = C8727.m13899(jM13884);
        if (iM2472 < iM13899) {
            iM2472 = iM13899;
        }
        this.f20306 = i;
        this.f20307 = iM2472;
        return iM2472;
    }
}
