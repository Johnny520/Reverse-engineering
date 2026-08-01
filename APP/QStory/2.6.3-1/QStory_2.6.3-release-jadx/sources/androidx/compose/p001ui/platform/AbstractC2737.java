package androidx.compose.p001ui.platform;

import androidx.activity.compose.C0858;
import androidx.appcompat.widget.C1041;
import androidx.compose.p001ui.autofill.AbstractC2252;
import androidx.compose.p001ui.autofill.C2253;
import androidx.compose.p001ui.autofill.InterfaceC2238;
import androidx.compose.p001ui.focus.InterfaceC2320;
import androidx.compose.p001ui.graphics.InterfaceC2418;
import androidx.compose.p001ui.input.pointer.InterfaceC2480;
import androidx.compose.p001ui.node.InterfaceC2636;
import androidx.compose.p001ui.text.font.InterfaceC2825;
import androidx.compose.p001ui.text.font.InterfaceC2830;
import androidx.compose.p001ui.text.input.C2848;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2169;
import androidx.compose.runtime.C2193;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2203;
import androidx.compose.runtime.InterfaceC2208;
import androidx.compose.runtime.internal.C2088;
import kotlin.AbstractC6019;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p124.InterfaceC8146;
import p127.InterfaceC8153;
import p130.AbstractC8163;
import p210.C8661;
import p210.C8662;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2737 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C2169 f5921;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C2169 f5922;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C2193 f5923;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C2169 f5924;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C2169 f5925;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C2169 f5926;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C2169 f5929;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C2169 f5930;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C2169 f5932;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2169 f5920 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAccessibilityManager$1
        @Override // p068.InterfaceC7372
        public final InterfaceC2731 invoke() {
            return null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2169 f5919 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofill$1
        @Override // p068.InterfaceC7372
        public final InterfaceC2238 invoke() {
            return null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C2169 f5918 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofillTree$1
        @Override // p068.InterfaceC7372
        public final C2253 invoke() {
            AbstractC2737.m4157("LocalAutofillTree");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C2169 f5917 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofillManager$1
        @Override // p068.InterfaceC7372
        public final AbstractC2252 invoke() {
            AbstractC2737.m4157("LocalAutofillManager");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C2169 f5916 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalClipboardManager$1
        @Override // p068.InterfaceC7372
        public final InterfaceC2757 invoke() {
            AbstractC2737.m4157("LocalClipboardManager");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C2169 f5915 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalClipboard$1
        @Override // p068.InterfaceC7372
        public final InterfaceC2756 invoke() {
            AbstractC2737.m4157("LocalClipboard");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C2169 f5934 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalGraphicsContext$1
        @Override // p068.InterfaceC7372
        public final InterfaceC2418 invoke() {
            AbstractC2737.m4157("LocalGraphicsContext");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C2169 f5933 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalDensity$1
        @Override // p068.InterfaceC7372
        public final InterfaceC8725 invoke() {
            AbstractC2737.m4157("LocalDensity");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C2169 f5937 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFocusManager$1
        @Override // p068.InterfaceC7372
        public final InterfaceC2320 invoke() {
            AbstractC2737.m4157("LocalFocusManager");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C2169 f5938 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontLoader$1
        @Override // p068.InterfaceC7372
        public final InterfaceC2825 invoke() {
            AbstractC2737.m4157("LocalFontLoader");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C2169 f5935 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontFamilyResolver$1
        @Override // p068.InterfaceC7372
        public final InterfaceC2830 invoke() {
            AbstractC2737.m4157("LocalFontFamilyResolver");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C2169 f5936 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalHapticFeedback$1
        @Override // p068.InterfaceC7372
        public final InterfaceC8146 invoke() {
            AbstractC2737.m4157("LocalHapticFeedback");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C2169 f5928 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalInputModeManager$1
        @Override // p068.InterfaceC7372
        public final InterfaceC8153 invoke() {
            AbstractC2737.m4157("LocalInputManager");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C2169 f5927 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalLayoutDirection$1
        @Override // p068.InterfaceC7372
        public final LayoutDirection invoke() {
            AbstractC2737.m4157("LocalLayoutDirection");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C2169 f5931 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalProvidableLocaleList$1
        @Override // p068.InterfaceC7372
        public final C8661 invoke() {
            AbstractC2737.m4157("LocalProvidableLocaleList");
            throw null;
        }
    });

    static {
        CompositionLocalsKt$LocalLocale$1 compositionLocalsKt$LocalLocale$1 = new InterfaceC7387() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalLocale$1
            @Override // p068.InterfaceC7387
            public final C8662 invoke(InterfaceC2203 interfaceC2203) {
                C2169 c2169 = AbstractC2737.f5931;
                C2088 c2088 = (C2088) interfaceC2203;
                c2088.getClass();
                return (C8662) AbstractC5176.m9378((Iterable) AbstractC2202.m3042(c2088, c2169));
            }
        };
        AbstractC6019.m10773(new C0858(24));
        f5932 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextInputService$1
            @Override // p068.InterfaceC7372
            public final C2848 invoke() {
                return null;
            }
        });
        f5929 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalSoftwareKeyboardController$1
            @Override // p068.InterfaceC7372
            public final InterfaceC2706 invoke() {
                return null;
            }
        });
        f5930 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextToolbar$1
            @Override // p068.InterfaceC7372
            public final InterfaceC2709 invoke() {
                AbstractC2737.m4157("LocalTextToolbar");
                throw null;
            }
        });
        f5922 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalUriHandler$1
            @Override // p068.InterfaceC7372
            public final InterfaceC2708 invoke() {
                AbstractC2737.m4157("LocalUriHandler");
                throw null;
            }
        });
        f5921 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalViewConfiguration$1
            @Override // p068.InterfaceC7372
            public final InterfaceC2698 invoke() {
                AbstractC2737.m4157("LocalViewConfiguration");
                throw null;
            }
        });
        f5925 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalWindowInfo$1
            @Override // p068.InterfaceC7372
            public final InterfaceC2683 invoke() {
                AbstractC2737.m4157("LocalWindowInfo");
                throw null;
            }
        });
        f5926 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalPointerIconService$1
            @Override // p068.InterfaceC7372
            public final InterfaceC2480 invoke() {
                return null;
            }
        });
        f5923 = new C2193(new InterfaceC7372() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalProvidableScrollCaptureInProgress$1
            @Override // p068.InterfaceC7372
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        });
        f5924 = new C2169(new InterfaceC7372() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalCursorBlinkEnabled$1
            @Override // p068.InterfaceC7372
            public final Boolean invoke() {
                return Boolean.TRUE;
            }
        });
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m4157(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m4158(final InterfaceC2636 interfaceC2636, final InterfaceC2708 interfaceC2708, final InterfaceC7383 interfaceC7383, InterfaceC2208 interfaceC2208, final int i) {
        int i2;
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(1925803616);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c2159.m2920(interfaceC2636) : c2159.m2938(interfaceC2636) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? c2159.m2920(interfaceC2708) : c2159.m2938(interfaceC2708) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c2159.m2938(interfaceC7383) ? 256 : 128;
        }
        if (c2159.m2903(i2 & 1, (i2 & 147) != 146)) {
            ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719 = (ViewTreeObserverOnGlobalLayoutListenerC2719) interfaceC2636;
            C1041 c1041Mo2988 = f5920.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.m4109getAccessibilityManager());
            C1041 c1041Mo29882 = f5919.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.getAutofill());
            C1041 c1041Mo29883 = f5917.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.getAutofillManager());
            C1041 c1041Mo29884 = f5918.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.getAutofillTree());
            C1041 c1041Mo29885 = f5916.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.m4111getClipboardManager());
            C1041 c1041Mo29886 = f5915.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.m4110getClipboard());
            C1041 c1041Mo29887 = f5933.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.getDensity());
            C1041 c1041Mo29888 = f5937.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.getFocusOwner());
            C1041 c1041Mo29889 = f5938.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.getFontLoader());
            c1041Mo29889.f1107 = false;
            int i3 = i2;
            C1041 c1041Mo298810 = f5935.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.getFontFamilyResolver());
            c1041Mo298810.f1107 = false;
            AbstractC2202.m3046(new C1041[]{c1041Mo2988, c1041Mo29882, c1041Mo29883, c1041Mo29884, c1041Mo29885, c1041Mo29886, c1041Mo29887, c1041Mo29888, c1041Mo29889, c1041Mo298810, f5936.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.getHapticFeedBack()), f5928.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.getInputModeManager()), f5927.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.getLayoutDirection()), f5932.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.getTextInputService()), f5929.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.getSoftwareKeyboardController()), f5930.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.getTextToolbar()), f5922.mo2988(interfaceC2708), f5921.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.getViewConfiguration()), f5925.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.getWindowInfo()), f5926.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.getPointerIconService()), f5934.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.getGraphicsContext()), AbstractC8163.f19891.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.getRetainedValuesStore()), f5931.mo2988(viewTreeObserverOnGlobalLayoutListenerC2719.getLocaleList())}, interfaceC7383, c2159, ((i3 >> 3) & 112) | 8);
        } else {
            c2159.m2899();
        }
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new InterfaceC7383() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$ProvideCommonCompositionLocals$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(InterfaceC2208 interfaceC22082, int i4) {
                    AbstractC2737.m4158(interfaceC2636, interfaceC2708, interfaceC7383, interfaceC22082, AbstractC2202.m3031(i | 1));
                }

                @Override // p068.InterfaceC7383
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC2208) obj, ((Number) obj2).intValue());
                    return C6008.f15084;
                }
            };
        }
    }
}
