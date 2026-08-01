package androidx.compose.ui.platform;

import androidx.activity.compose.C0011;
import androidx.appcompat.widget.C0194;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1334;
import androidx.compose.runtime.C1358;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1368;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.runtime.internal.C1253;
import androidx.compose.ui.autofill.AbstractC1417;
import androidx.compose.ui.autofill.C1418;
import androidx.compose.ui.autofill.InterfaceC1403;
import androidx.compose.ui.focus.InterfaceC1485;
import androidx.compose.ui.graphics.InterfaceC1583;
import androidx.compose.ui.input.pointer.InterfaceC1645;
import androidx.compose.ui.node.InterfaceC1801;
import androidx.compose.ui.text.font.InterfaceC1991;
import androidx.compose.ui.text.font.InterfaceC1996;
import androidx.compose.ui.text.input.C2014;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.AbstractC5186;
import kotlin.C5175;
import kotlin.collections.AbstractC4343;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p108.InterfaceC7316;
import p111.InterfaceC7323;
import p114.AbstractC7333;
import p194.C7831;
import p194.C7832;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1902 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C1334 f5575;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C1334 f5576;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C1358 f5577;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C1334 f5578;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C1334 f5579;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C1334 f5580;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C1334 f5583;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C1334 f5584;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C1334 f5586;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1334 f5574 = new C1334(new InterfaceC6542() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAccessibilityManager$1
        @Override // p052.InterfaceC6542
        public final InterfaceC1896 invoke() {
            return null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1334 f5573 = new C1334(new InterfaceC6542() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofill$1
        @Override // p052.InterfaceC6542
        public final InterfaceC1403 invoke() {
            return null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1334 f5572 = new C1334(new InterfaceC6542() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofillTree$1
        @Override // p052.InterfaceC6542
        public final C1418 invoke() {
            AbstractC1902.m3587("LocalAutofillTree");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C1334 f5571 = new C1334(new InterfaceC6542() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofillManager$1
        @Override // p052.InterfaceC6542
        public final AbstractC1417 invoke() {
            AbstractC1902.m3587("LocalAutofillManager");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C1334 f5570 = new C1334(new InterfaceC6542() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalClipboardManager$1
        @Override // p052.InterfaceC6542
        public final InterfaceC1922 invoke() {
            AbstractC1902.m3587("LocalClipboardManager");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C1334 f5569 = new C1334(new InterfaceC6542() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalClipboard$1
        @Override // p052.InterfaceC6542
        public final InterfaceC1921 invoke() {
            AbstractC1902.m3587("LocalClipboard");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C1334 f5588 = new C1334(new InterfaceC6542() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalGraphicsContext$1
        @Override // p052.InterfaceC6542
        public final InterfaceC1583 invoke() {
            AbstractC1902.m3587("LocalGraphicsContext");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C1334 f5587 = new C1334(new InterfaceC6542() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalDensity$1
        @Override // p052.InterfaceC6542
        public final InterfaceC7895 invoke() {
            AbstractC1902.m3587("LocalDensity");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C1334 f5591 = new C1334(new InterfaceC6542() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFocusManager$1
        @Override // p052.InterfaceC6542
        public final InterfaceC1485 invoke() {
            AbstractC1902.m3587("LocalFocusManager");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C1334 f5592 = new C1334(new InterfaceC6542() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontLoader$1
        @Override // p052.InterfaceC6542
        public final InterfaceC1991 invoke() {
            AbstractC1902.m3587("LocalFontLoader");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C1334 f5589 = new C1334(new InterfaceC6542() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontFamilyResolver$1
        @Override // p052.InterfaceC6542
        public final InterfaceC1996 invoke() {
            AbstractC1902.m3587("LocalFontFamilyResolver");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C1334 f5590 = new C1334(new InterfaceC6542() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalHapticFeedback$1
        @Override // p052.InterfaceC6542
        public final InterfaceC7316 invoke() {
            AbstractC1902.m3587("LocalHapticFeedback");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C1334 f5582 = new C1334(new InterfaceC6542() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalInputModeManager$1
        @Override // p052.InterfaceC6542
        public final InterfaceC7323 invoke() {
            AbstractC1902.m3587("LocalInputManager");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C1334 f5581 = new C1334(new InterfaceC6542() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalLayoutDirection$1
        @Override // p052.InterfaceC6542
        public final LayoutDirection invoke() {
            AbstractC1902.m3587("LocalLayoutDirection");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C1334 f5585 = new C1334(new InterfaceC6542() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalProvidableLocaleList$1
        @Override // p052.InterfaceC6542
        public final C7831 invoke() {
            AbstractC1902.m3587("LocalProvidableLocaleList");
            throw null;
        }
    });

    static {
        CompositionLocalsKt$LocalLocale$1 compositionLocalsKt$LocalLocale$1 = new InterfaceC6557() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalLocale$1
            @Override // p052.InterfaceC6557
            public final C7832 invoke(InterfaceC1368 interfaceC1368) {
                C1334 c1334 = AbstractC1902.f5585;
                C1253 c1253 = (C1253) interfaceC1368;
                c1253.getClass();
                return (C7832) AbstractC4343.m8788((Iterable) AbstractC1367.m2473(c1253, c1334));
            }
        };
        AbstractC5186.m10210(new C0011(24));
        f5586 = new C1334(new InterfaceC6542() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextInputService$1
            @Override // p052.InterfaceC6542
            public final C2014 invoke() {
                return null;
            }
        });
        f5583 = new C1334(new InterfaceC6542() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalSoftwareKeyboardController$1
            @Override // p052.InterfaceC6542
            public final InterfaceC1871 invoke() {
                return null;
            }
        });
        f5584 = new C1334(new InterfaceC6542() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextToolbar$1
            @Override // p052.InterfaceC6542
            public final InterfaceC1874 invoke() {
                AbstractC1902.m3587("LocalTextToolbar");
                throw null;
            }
        });
        f5576 = new C1334(new InterfaceC6542() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalUriHandler$1
            @Override // p052.InterfaceC6542
            public final InterfaceC1873 invoke() {
                AbstractC1902.m3587("LocalUriHandler");
                throw null;
            }
        });
        f5575 = new C1334(new InterfaceC6542() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalViewConfiguration$1
            @Override // p052.InterfaceC6542
            public final InterfaceC1863 invoke() {
                AbstractC1902.m3587("LocalViewConfiguration");
                throw null;
            }
        });
        f5579 = new C1334(new InterfaceC6542() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalWindowInfo$1
            @Override // p052.InterfaceC6542
            public final InterfaceC1848 invoke() {
                AbstractC1902.m3587("LocalWindowInfo");
                throw null;
            }
        });
        f5580 = new C1334(new InterfaceC6542() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalPointerIconService$1
            @Override // p052.InterfaceC6542
            public final InterfaceC1645 invoke() {
                return null;
            }
        });
        f5577 = new C1358(new InterfaceC6542() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalProvidableScrollCaptureInProgress$1
            @Override // p052.InterfaceC6542
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        });
        f5578 = new C1334(new InterfaceC6542() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalCursorBlinkEnabled$1
            @Override // p052.InterfaceC6542
            public final Boolean invoke() {
                return Boolean.TRUE;
            }
        });
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m3587(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3588(final InterfaceC1801 interfaceC1801, final InterfaceC1873 interfaceC1873, final InterfaceC6553 interfaceC6553, InterfaceC1373 interfaceC1373, final int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(1925803616);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c1324.m2350(interfaceC1801) : c1324.m2368(interfaceC1801) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? c1324.m2350(interfaceC1873) : c1324.m2368(interfaceC1873) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c1324.m2368(interfaceC6553) ? 256 : 128;
        }
        if (c1324.m2333(i2 & 1, (i2 & 147) != 146)) {
            ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = (ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801;
            C0194 c0194Mo2418 = f5574.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.m3539getAccessibilityManager());
            C0194 c0194Mo24182 = f5573.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.getAutofill());
            C0194 c0194Mo24183 = f5571.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.getAutofillManager());
            C0194 c0194Mo24184 = f5572.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.getAutofillTree());
            C0194 c0194Mo24185 = f5570.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.m3541getClipboardManager());
            C0194 c0194Mo24186 = f5569.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.m3540getClipboard());
            C0194 c0194Mo24187 = f5587.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.getDensity());
            C0194 c0194Mo24188 = f5591.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.getFocusOwner());
            C0194 c0194Mo24189 = f5592.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.getFontLoader());
            c0194Mo24189.f762 = false;
            int i3 = i2;
            C0194 c0194Mo241810 = f5589.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.getFontFamilyResolver());
            c0194Mo241810.f762 = false;
            AbstractC1367.m2477(new C0194[]{c0194Mo2418, c0194Mo24182, c0194Mo24183, c0194Mo24184, c0194Mo24185, c0194Mo24186, c0194Mo24187, c0194Mo24188, c0194Mo24189, c0194Mo241810, f5590.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.getHapticFeedBack()), f5582.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.getInputModeManager()), f5581.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.getLayoutDirection()), f5586.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.getTextInputService()), f5583.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.getSoftwareKeyboardController()), f5584.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.getTextToolbar()), f5576.mo2418(interfaceC1873), f5575.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.getViewConfiguration()), f5579.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.getWindowInfo()), f5580.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.getPointerIconService()), f5588.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.getGraphicsContext()), AbstractC7333.f19551.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.getRetainedValuesStore()), f5585.mo2418(viewTreeObserverOnGlobalLayoutListenerC1884.getLocaleList())}, interfaceC6553, c1324, ((i3 >> 3) & 112) | 8);
        } else {
            c1324.m2329();
        }
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new InterfaceC6553() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$ProvideCommonCompositionLocals$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(InterfaceC1373 interfaceC13732, int i4) {
                    AbstractC1902.m3588(interfaceC1801, interfaceC1873, interfaceC6553, interfaceC13732, AbstractC1367.m2460(i | 1));
                }

                @Override // p052.InterfaceC6553
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                    return C5175.f14739;
                }
            };
        }
    }
}
