package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import androidx.compose.foundation.lazy.C0756;
import androidx.compose.foundation.text.C0977;
import androidx.compose.foundation.text.C1011;
import androidx.compose.foundation.text.C1012;
import androidx.compose.foundation.text.handwriting.AbstractC0835;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.platform.AbstractC1902;
import androidx.compose.ui.platform.C1901;
import androidx.compose.ui.platform.InterfaceC1871;
import androidx.compose.ui.text.C2033;
import androidx.compose.ui.text.C2035;
import androidx.compose.ui.text.input.C2013;
import androidx.compose.ui.text.input.C2025;
import androidx.compose.ui.text.input.InterfaceC2020;
import androidx.compose.ui.text.input.InterfaceC2022;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5417;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.AbstractC5322;
import kotlinx.coroutines.flow.C5287;
import kotlinx.coroutines.flow.InterfaceC5294;
import p053.AbstractC6561;
import p112.C7328;
import p176.AbstractC7741;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0860 implements InterfaceC2020 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C5287 f2413;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C0851 f2414;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C5417 f2415;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC0853 f2416;

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo1681() {
        InterfaceC1871 interfaceC1871;
        InterfaceC0853 interfaceC0853 = this.f2416;
        if (interfaceC0853 == null || (interfaceC1871 = (InterfaceC1871) AbstractC1785.m3356((C0865) interfaceC0853, AbstractC1902.f5584)) == null) {
            return;
        }
        ((C1901) interfaceC1871).m3596();
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo1682() throws Throwable {
        C5417 c5417 = this.f2415;
        if (c5417 != null) {
            c5417.mo10256(null);
        }
        this.f2415 = null;
        InterfaceC5294 interfaceC5294M1690 = m1690();
        if (interfaceC5294M1690 != null) {
            ((C5287) interfaceC5294M1690).mo10310();
        }
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo1683() {
        InterfaceC1871 interfaceC1871;
        InterfaceC0853 interfaceC0853 = this.f2416;
        if (interfaceC0853 == null || (interfaceC1871 = (InterfaceC1871) AbstractC1785.m3356((C0865) interfaceC0853, AbstractC1902.f5584)) == null) {
            return;
        }
        ((C1901) interfaceC1871).m3595();
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo1684(C7328 c7328) {
        Rect rect;
        C0851 c0851 = this.f2414;
        if (c0851 != null) {
            c0851.f2402 = new Rect(AbstractC6561.m12058(c7328.f19540), AbstractC6561.m12058(c7328.f19539), AbstractC6561.m12058(c7328.f19538), AbstractC6561.m12058(c7328.f19537));
            if (!c0851.f2404.isEmpty() || (rect = c0851.f2402) == null) {
                return;
            }
            c0851.f2397.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo1685() {
        m1691(null);
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo1686(C2013 c2013, C2025 c2025, C0756 c0756, C0977 c0977) {
        m1691(new C1011(c2013, this, c2025, c0756, c0977));
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo1687(C2013 c2013, InterfaceC2022 interfaceC2022, C2033 c2033, C1012 c1012, C7328 c7328, C7328 c73282) {
        C0851 c0851 = this.f2414;
        if (c0851 != null) {
            C0866 c0866 = c0851.f2398;
            synchronized (c0866.f2428) {
                try {
                    c0866.f2441 = c2013;
                    c0866.f2439 = interfaceC2022;
                    c0866.f2438 = c2033;
                    c0866.f2432 = c7328;
                    c0866.f2431 = c73282;
                    if (c0866.f2426 || c0866.f2427) {
                        c0866.m1693();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo1688(C2013 c2013, C2013 c20132) {
        C0851 c0851 = this.f2414;
        if (c0851 != null) {
            boolean z = (C2035.m3753(c0851.f2399.f5946, c20132.f5946) && AbstractC4395.m8907(c0851.f2399.f5945, c20132.f5945)) ? false : true;
            c0851.f2399 = c20132;
            int size = c0851.f2404.size();
            for (int i = 0; i < size; i++) {
                InputConnectionC0850 inputConnectionC0850 = (InputConnectionC0850) ((WeakReference) c0851.f2404.get(i)).get();
                if (inputConnectionC0850 != null) {
                    inputConnectionC0850.f2388 = c20132;
                }
            }
            C0866 c0866 = c0851.f2398;
            synchronized (c0866.f2428) {
                c0866.f2441 = null;
                c0866.f2439 = null;
                c0866.f2438 = null;
                c0866.f2432 = null;
                c0866.f2431 = null;
            }
            if (AbstractC4395.m8907(c2013, c20132)) {
                if (z) {
                    InterfaceC0863 interfaceC0863 = c0851.f2396;
                    int iM3757 = C2035.m3757(c20132.f5946);
                    int iM3750 = C2035.m3750(c20132.f5946);
                    C2035 c2035 = c0851.f2399.f5945;
                    int iM37572 = c2035 != null ? C2035.m3757(c2035.f6004) : -1;
                    C2035 c20352 = c0851.f2399.f5945;
                    C0867 c0867 = (C0867) interfaceC0863;
                    c0867.m1694().updateSelection(c0867.f2443, iM3757, iM3750, iM37572, c20352 != null ? C2035.m3750(c20352.f6004) : -1);
                    return;
                }
                return;
            }
            if (c2013 != null && (!AbstractC4395.m8907(c2013.f5947.f6129, c20132.f5947.f6129) || (C2035.m3753(c2013.f5946, c20132.f5946) && !AbstractC4395.m8907(c2013.f5945, c20132.f5945)))) {
                C0867 c08672 = (C0867) c0851.f2396;
                c08672.m1694().restartInput(c08672.f2443);
                return;
            }
            int size2 = c0851.f2404.size();
            for (int i2 = 0; i2 < size2; i2++) {
                InputConnectionC0850 inputConnectionC08502 = (InputConnectionC0850) ((WeakReference) c0851.f2404.get(i2)).get();
                if (inputConnectionC08502 != null) {
                    C2013 c20133 = c0851.f2399;
                    InterfaceC0863 interfaceC08632 = c0851.f2396;
                    if (inputConnectionC08502.f2389) {
                        inputConnectionC08502.f2388 = c20133;
                        if (inputConnectionC08502.f2390) {
                            C0867 c08673 = (C0867) interfaceC08632;
                            c08673.m1694().updateExtractedText(c08673.f2443, inputConnectionC08502.f2387, AbstractC0857.m1669(c20133));
                        }
                        C2035 c20353 = c20133.f5945;
                        long j = c20133.f5946;
                        int iM37573 = c20353 != null ? C2035.m3757(c20353.f6004) : -1;
                        C2035 c20354 = c20133.f5945;
                        C0867 c08674 = (C0867) interfaceC08632;
                        c08674.m1694().updateSelection(c08674.f2443, C2035.m3757(j), C2035.m3750(j), iM37573, c20354 != null ? C2035.m3750(c20354.f6004) : -1);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m1689(C0865 c0865) {
        if (this.f2416 != c0865) {
            AbstractC7741.m13095("Expected textInputModifierNode to be " + c0865 + " but was " + this.f2416);
        }
        this.f2416 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC5294 m1690() {
        C5287 c5287 = this.f2413;
        if (c5287 != null) {
            return c5287;
        }
        if (!AbstractC0835.f2370) {
            return null;
        }
        C5287 c5287M10333 = AbstractC5322.m10333(2, BufferOverflow.DROP_LATEST);
        this.f2413 = c5287M10333;
        return c5287M10333;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m1691(C1011 c1011) {
        InterfaceC0853 interfaceC0853 = this.f2416;
        if (interfaceC0853 == null) {
            return;
        }
        AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 androidLegacyPlatformTextInputServiceAdapter$startInput$2 = new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(c1011, this, interfaceC0853, null);
        C0865 c0865 = (C0865) interfaceC0853;
        this.f2415 = c0865.f6279 ? AbstractC5399.m10477(c0865.m3867(), null, CoroutineStart.UNDISPATCHED, new LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1(c0865, androidLegacyPlatformTextInputServiceAdapter$startInput$2, null), 1) : null;
    }
}
