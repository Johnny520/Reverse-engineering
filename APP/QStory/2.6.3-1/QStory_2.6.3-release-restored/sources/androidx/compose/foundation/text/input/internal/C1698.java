package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import androidx.compose.foundation.lazy.C1597;
import androidx.compose.foundation.text.C1815;
import androidx.compose.foundation.text.C1849;
import androidx.compose.foundation.text.C1850;
import androidx.compose.foundation.text.handwriting.AbstractC1675;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.platform.AbstractC2737;
import androidx.compose.p001ui.platform.C2736;
import androidx.compose.p001ui.platform.InterfaceC2706;
import androidx.compose.p001ui.text.C2867;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.p001ui.text.input.C2847;
import androidx.compose.p001ui.text.input.C2859;
import androidx.compose.p001ui.text.input.InterfaceC2854;
import androidx.compose.p001ui.text.input.InterfaceC2856;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.AbstractC6154;
import kotlinx.coroutines.flow.C6119;
import kotlinx.coroutines.flow.InterfaceC6126;
import p069.AbstractC7390;
import p128.C8157;
import p192.AbstractC8570;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1698 implements InterfaceC2854 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C6119 f2758;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C1689 f2759;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C6249 f2760;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC1691 f2761;

    @Override // androidx.compose.p001ui.text.input.InterfaceC2854
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo2241() {
        InterfaceC2706 interfaceC2706;
        InterfaceC1691 interfaceC1691 = this.f2761;
        if (interfaceC1691 == null || (interfaceC2706 = (InterfaceC2706) AbstractC2620.m3916((C1703) interfaceC1691, AbstractC2737.f5929)) == null) {
            return;
        }
        ((C2736) interfaceC2706).m4156();
    }

    @Override // androidx.compose.p001ui.text.input.InterfaceC2854
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo2242() throws Throwable {
        C6249 c6249 = this.f2760;
        if (c6249 != null) {
            c6249.mo10815(null);
        }
        this.f2760 = null;
        InterfaceC6126 interfaceC6126M2250 = m2250();
        if (interfaceC6126M2250 != null) {
            ((C6119) interfaceC6126M2250).mo10869();
        }
    }

    @Override // androidx.compose.p001ui.text.input.InterfaceC2854
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo2243() {
        InterfaceC2706 interfaceC2706;
        InterfaceC1691 interfaceC1691 = this.f2761;
        if (interfaceC1691 == null || (interfaceC2706 = (InterfaceC2706) AbstractC2620.m3916((C1703) interfaceC1691, AbstractC2737.f5929)) == null) {
            return;
        }
        ((C2736) interfaceC2706).m4155();
    }

    @Override // androidx.compose.p001ui.text.input.InterfaceC2854
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo2244(C8157 c8157) {
        Rect rect;
        C1689 c1689 = this.f2759;
        if (c1689 != null) {
            c1689.f2747 = new Rect(AbstractC7390.m12617(c8157.f19885), AbstractC7390.m12617(c8157.f19884), AbstractC7390.m12617(c8157.f19883), AbstractC7390.m12617(c8157.f19882));
            if (!c1689.f2749.isEmpty() || (rect = c1689.f2747) == null) {
                return;
            }
            c1689.f2742.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // androidx.compose.p001ui.text.input.InterfaceC2854
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo2245() {
        m2251(null);
    }

    @Override // androidx.compose.p001ui.text.input.InterfaceC2854
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo2246(C2847 c2847, C2859 c2859, C1597 c1597, C1815 c1815) {
        m2251(new C1849(c2847, this, c2859, c1597, c1815));
    }

    @Override // androidx.compose.p001ui.text.input.InterfaceC2854
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo2247(C2847 c2847, InterfaceC2856 interfaceC2856, C2867 c2867, C1850 c1850, C8157 c8157, C8157 c81572) {
        C1689 c1689 = this.f2759;
        if (c1689 != null) {
            C1704 c1704 = c1689.f2743;
            synchronized (c1704.f2773) {
                try {
                    c1704.f2786 = c2847;
                    c1704.f2784 = interfaceC2856;
                    c1704.f2783 = c2867;
                    c1704.f2777 = c8157;
                    c1704.f2776 = c81572;
                    if (c1704.f2771 || c1704.f2772) {
                        c1704.m2253();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // androidx.compose.p001ui.text.input.InterfaceC2854
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo2248(C2847 c2847, C2847 c28472) {
        C1689 c1689 = this.f2759;
        if (c1689 != null) {
            boolean z = (C2869.m4313(c1689.f2744.f6291, c28472.f6291) && AbstractC5227.m9466(c1689.f2744.f6290, c28472.f6290)) ? false : true;
            c1689.f2744 = c28472;
            int size = c1689.f2749.size();
            for (int i = 0; i < size; i++) {
                InputConnectionC1688 inputConnectionC1688 = (InputConnectionC1688) ((WeakReference) c1689.f2749.get(i)).get();
                if (inputConnectionC1688 != null) {
                    inputConnectionC1688.f2733 = c28472;
                }
            }
            C1704 c1704 = c1689.f2743;
            synchronized (c1704.f2773) {
                c1704.f2786 = null;
                c1704.f2784 = null;
                c1704.f2783 = null;
                c1704.f2777 = null;
                c1704.f2776 = null;
            }
            if (AbstractC5227.m9466(c2847, c28472)) {
                if (z) {
                    InterfaceC1701 interfaceC1701 = c1689.f2741;
                    int iM4317 = C2869.m4317(c28472.f6291);
                    int iM4310 = C2869.m4310(c28472.f6291);
                    C2869 c2869 = c1689.f2744.f6290;
                    int iM43172 = c2869 != null ? C2869.m4317(c2869.f6349) : -1;
                    C2869 c28692 = c1689.f2744.f6290;
                    C1705 c1705 = (C1705) interfaceC1701;
                    c1705.m2254().updateSelection(c1705.f2788, iM4317, iM4310, iM43172, c28692 != null ? C2869.m4310(c28692.f6349) : -1);
                    return;
                }
                return;
            }
            if (c2847 != null && (!AbstractC5227.m9466(c2847.f6292.f6474, c28472.f6292.f6474) || (C2869.m4313(c2847.f6291, c28472.f6291) && !AbstractC5227.m9466(c2847.f6290, c28472.f6290)))) {
                C1705 c17052 = (C1705) c1689.f2741;
                c17052.m2254().restartInput(c17052.f2788);
                return;
            }
            int size2 = c1689.f2749.size();
            for (int i2 = 0; i2 < size2; i2++) {
                InputConnectionC1688 inputConnectionC16882 = (InputConnectionC1688) ((WeakReference) c1689.f2749.get(i2)).get();
                if (inputConnectionC16882 != null) {
                    C2847 c28473 = c1689.f2744;
                    InterfaceC1701 interfaceC17012 = c1689.f2741;
                    if (inputConnectionC16882.f2734) {
                        inputConnectionC16882.f2733 = c28473;
                        if (inputConnectionC16882.f2735) {
                            C1705 c17053 = (C1705) interfaceC17012;
                            c17053.m2254().updateExtractedText(c17053.f2788, inputConnectionC16882.f2732, AbstractC1695.m2229(c28473));
                        }
                        C2869 c28693 = c28473.f6290;
                        long j = c28473.f6291;
                        int iM43173 = c28693 != null ? C2869.m4317(c28693.f6349) : -1;
                        C2869 c28694 = c28473.f6290;
                        C1705 c17054 = (C1705) interfaceC17012;
                        c17054.m2254().updateSelection(c17054.f2788, C2869.m4317(j), C2869.m4310(j), iM43173, c28694 != null ? C2869.m4310(c28694.f6349) : -1);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m2249(C1703 c1703) {
        if (this.f2761 != c1703) {
            AbstractC8570.m13654("Expected textInputModifierNode to be " + c1703 + " but was " + this.f2761);
        }
        this.f2761 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC6126 m2250() {
        C6119 c6119 = this.f2758;
        if (c6119 != null) {
            return c6119;
        }
        if (!AbstractC1675.f2715) {
            return null;
        }
        C6119 c6119M10892 = AbstractC6154.m10892(2, BufferOverflow.DROP_LATEST);
        this.f2758 = c6119M10892;
        return c6119M10892;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m2251(C1849 c1849) {
        InterfaceC1691 interfaceC1691 = this.f2761;
        if (interfaceC1691 == null) {
            return;
        }
        AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 androidLegacyPlatformTextInputServiceAdapter$startInput$2 = new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(c1849, this, interfaceC1691, null);
        C1703 c1703 = (C1703) interfaceC1691;
        this.f2760 = c1703.f6624 ? AbstractC6231.m11036(c1703.m4427(), null, CoroutineStart.UNDISPATCHED, new C0102xbdb5d003(c1703, androidLegacyPlatformTextInputServiceAdapter$startInput$2, null), 1) : null;
    }
}
