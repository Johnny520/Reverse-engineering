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
import kotlin.jvm.internal.AbstractC4394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5416;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.AbstractC5321;
import kotlinx.coroutines.flow.C5286;
import kotlinx.coroutines.flow.InterfaceC5293;
import p053.AbstractC6560;
import p112.C7327;
import p176.AbstractC7740;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0860 implements InterfaceC2020 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C5286 f2412;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C0851 f2413;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C5416 f2414;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public InterfaceC0853 f2415;

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo1671() {
        InterfaceC1871 interfaceC1871;
        InterfaceC0853 interfaceC0853 = this.f2415;
        if (interfaceC0853 == null || (interfaceC1871 = (InterfaceC1871) AbstractC1785.m3346((C0865) interfaceC0853, AbstractC1902.f5583)) == null) {
            return;
        }
        ((C1901) interfaceC1871).m3586();
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo1672() throws Throwable {
        C5416 c5416 = this.f2414;
        if (c5416 != null) {
            c5416.mo10252(null);
        }
        this.f2414 = null;
        InterfaceC5293 interfaceC5293M1680 = m1680();
        if (interfaceC5293M1680 != null) {
            ((C5286) interfaceC5293M1680).mo10306();
        }
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo1673() {
        InterfaceC1871 interfaceC1871;
        InterfaceC0853 interfaceC0853 = this.f2415;
        if (interfaceC0853 == null || (interfaceC1871 = (InterfaceC1871) AbstractC1785.m3346((C0865) interfaceC0853, AbstractC1902.f5583)) == null) {
            return;
        }
        ((C1901) interfaceC1871).m3585();
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void mo1674(C7327 c7327) {
        Rect rect;
        C0851 c0851 = this.f2413;
        if (c0851 != null) {
            c0851.f2401 = new Rect(AbstractC6560.m12006(c7327.f19545), AbstractC6560.m12006(c7327.f19544), AbstractC6560.m12006(c7327.f19543), AbstractC6560.m12006(c7327.f19542));
            if (!c0851.f2403.isEmpty() || (rect = c0851.f2401) == null) {
                return;
            }
            c0851.f2396.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void mo1675() {
        m1681(null);
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo1676(C2013 c2013, C2025 c2025, C0756 c0756, C0977 c0977) {
        m1681(new C1011(c2013, this, c2025, c0756, c0977));
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void mo1677(C2013 c2013, InterfaceC2022 interfaceC2022, C2033 c2033, C1012 c1012, C7327 c7327, C7327 c73272) {
        C0851 c0851 = this.f2413;
        if (c0851 != null) {
            C0866 c0866 = c0851.f2397;
            synchronized (c0866.f2427) {
                try {
                    c0866.f2440 = c2013;
                    c0866.f2438 = interfaceC2022;
                    c0866.f2437 = c2033;
                    c0866.f2431 = c7327;
                    c0866.f2430 = c73272;
                    if (c0866.f2425 || c0866.f2426) {
                        c0866.m1683();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void mo1678(C2013 c2013, C2013 c20132) {
        C0851 c0851 = this.f2413;
        if (c0851 != null) {
            boolean z = (C2035.m3743(c0851.f2398.f5945, c20132.f5945) && AbstractC4394.m8917(c0851.f2398.f5944, c20132.f5944)) ? false : true;
            c0851.f2398 = c20132;
            int size = c0851.f2403.size();
            for (int i = 0; i < size; i++) {
                InputConnectionC0850 inputConnectionC0850 = (InputConnectionC0850) ((WeakReference) c0851.f2403.get(i)).get();
                if (inputConnectionC0850 != null) {
                    inputConnectionC0850.f2387 = c20132;
                }
            }
            C0866 c0866 = c0851.f2397;
            synchronized (c0866.f2427) {
                c0866.f2440 = null;
                c0866.f2438 = null;
                c0866.f2437 = null;
                c0866.f2431 = null;
                c0866.f2430 = null;
            }
            if (AbstractC4394.m8917(c2013, c20132)) {
                if (z) {
                    InterfaceC0863 interfaceC0863 = c0851.f2395;
                    int iM3747 = C2035.m3747(c20132.f5945);
                    int iM3740 = C2035.m3740(c20132.f5945);
                    C2035 c2035 = c0851.f2398.f5944;
                    int iM37472 = c2035 != null ? C2035.m3747(c2035.f6003) : -1;
                    C2035 c20352 = c0851.f2398.f5944;
                    C0867 c0867 = (C0867) interfaceC0863;
                    c0867.m1684().updateSelection(c0867.f2442, iM3747, iM3740, iM37472, c20352 != null ? C2035.m3740(c20352.f6003) : -1);
                    return;
                }
                return;
            }
            if (c2013 != null && (!AbstractC4394.m8917(c2013.f5946.f6128, c20132.f5946.f6128) || (C2035.m3743(c2013.f5945, c20132.f5945) && !AbstractC4394.m8917(c2013.f5944, c20132.f5944)))) {
                C0867 c08672 = (C0867) c0851.f2395;
                c08672.m1684().restartInput(c08672.f2442);
                return;
            }
            int size2 = c0851.f2403.size();
            for (int i2 = 0; i2 < size2; i2++) {
                InputConnectionC0850 inputConnectionC08502 = (InputConnectionC0850) ((WeakReference) c0851.f2403.get(i2)).get();
                if (inputConnectionC08502 != null) {
                    C2013 c20133 = c0851.f2398;
                    InterfaceC0863 interfaceC08632 = c0851.f2395;
                    if (inputConnectionC08502.f2388) {
                        inputConnectionC08502.f2387 = c20133;
                        if (inputConnectionC08502.f2389) {
                            C0867 c08673 = (C0867) interfaceC08632;
                            c08673.m1684().updateExtractedText(c08673.f2442, inputConnectionC08502.f2386, AbstractC0857.m1659(c20133));
                        }
                        C2035 c20353 = c20133.f5944;
                        long j = c20133.f5945;
                        int iM37473 = c20353 != null ? C2035.m3747(c20353.f6003) : -1;
                        C2035 c20354 = c20133.f5944;
                        C0867 c08674 = (C0867) interfaceC08632;
                        c08674.m1684().updateSelection(c08674.f2442, C2035.m3747(j), C2035.m3740(j), iM37473, c20354 != null ? C2035.m3740(c20354.f6003) : -1);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m1679(C0865 c0865) {
        if (this.f2415 != c0865) {
            AbstractC7740.m13067("Expected textInputModifierNode to be " + c0865 + " but was " + this.f2415);
        }
        this.f2415 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC5293 m1680() {
        C5286 c5286 = this.f2412;
        if (c5286 != null) {
            return c5286;
        }
        if (!AbstractC0835.f2369) {
            return null;
        }
        C5286 c5286M10329 = AbstractC5321.m10329(2, BufferOverflow.DROP_LATEST);
        this.f2412 = c5286M10329;
        return c5286M10329;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m1681(C1011 c1011) {
        InterfaceC0853 interfaceC0853 = this.f2415;
        if (interfaceC0853 == null) {
            return;
        }
        AndroidLegacyPlatformTextInputServiceAdapter$startInput$2 androidLegacyPlatformTextInputServiceAdapter$startInput$2 = new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(c1011, this, interfaceC0853, null);
        C0865 c0865 = (C0865) interfaceC0853;
        this.f2414 = c0865.f6278 ? AbstractC5398.m10473(c0865.m3857(), null, CoroutineStart.UNDISPATCHED, new LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1(c0865, androidLegacyPlatformTextInputServiceAdapter$startInput$2, null), 1) : null;
    }
}
