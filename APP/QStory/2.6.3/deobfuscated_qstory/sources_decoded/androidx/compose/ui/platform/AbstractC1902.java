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
import kotlin.AbstractC5187;
import kotlin.C5176;
import kotlin.collections.AbstractC4344;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p108.InterfaceC7317;
import p111.InterfaceC7324;
import p114.AbstractC7334;
import p194.C7832;
import p194.C7833;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1902 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C1334 f5576;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C1334 f5577;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C1358 f5578;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C1334 f5579;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C1334 f5580;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C1334 f5581;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C1334 f5584;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C1334 f5585;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C1334 f5587;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1334 f5575 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAccessibilityManager$1
        @Override // p052.InterfaceC6543
        public final InterfaceC1896 invoke() {
            return null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1334 f5574 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofill$1
        @Override // p052.InterfaceC6543
        public final InterfaceC1403 invoke() {
            return null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C1334 f5573 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofillTree$1
        @Override // p052.InterfaceC6543
        public final C1418 invoke() {
            AbstractC1902.m3597("LocalAutofillTree");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C1334 f5572 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofillManager$1
        @Override // p052.InterfaceC6543
        public final AbstractC1417 invoke() {
            AbstractC1902.m3597("LocalAutofillManager");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C1334 f5571 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalClipboardManager$1
        @Override // p052.InterfaceC6543
        public final InterfaceC1922 invoke() {
            AbstractC1902.m3597("LocalClipboardManager");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C1334 f5570 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalClipboard$1
        @Override // p052.InterfaceC6543
        public final InterfaceC1921 invoke() {
            AbstractC1902.m3597("LocalClipboard");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C1334 f5589 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalGraphicsContext$1
        @Override // p052.InterfaceC6543
        public final InterfaceC1583 invoke() {
            AbstractC1902.m3597("LocalGraphicsContext");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C1334 f5588 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalDensity$1
        @Override // p052.InterfaceC6543
        public final InterfaceC7896 invoke() {
            AbstractC1902.m3597("LocalDensity");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C1334 f5592 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFocusManager$1
        @Override // p052.InterfaceC6543
        public final InterfaceC1485 invoke() {
            AbstractC1902.m3597("LocalFocusManager");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C1334 f5593 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontLoader$1
        @Override // p052.InterfaceC6543
        public final InterfaceC1991 invoke() {
            AbstractC1902.m3597("LocalFontLoader");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C1334 f5590 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontFamilyResolver$1
        @Override // p052.InterfaceC6543
        public final InterfaceC1996 invoke() {
            AbstractC1902.m3597("LocalFontFamilyResolver");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C1334 f5591 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalHapticFeedback$1
        @Override // p052.InterfaceC6543
        public final InterfaceC7317 invoke() {
            AbstractC1902.m3597("LocalHapticFeedback");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C1334 f5583 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalInputModeManager$1
        @Override // p052.InterfaceC6543
        public final InterfaceC7324 invoke() {
            AbstractC1902.m3597("LocalInputManager");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C1334 f5582 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalLayoutDirection$1
        @Override // p052.InterfaceC6543
        public final LayoutDirection invoke() {
            AbstractC1902.m3597("LocalLayoutDirection");
            throw null;
        }
    });

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C1334 f5586 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalProvidableLocaleList$1
        @Override // p052.InterfaceC6543
        public final C7832 invoke() {
            AbstractC1902.m3597("LocalProvidableLocaleList");
            throw null;
        }
    });

    static {
        CompositionLocalsKt$LocalLocale$1 compositionLocalsKt$LocalLocale$1 = new InterfaceC6558() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalLocale$1
            @Override // p052.InterfaceC6558
            public final C7833 invoke(InterfaceC1368 interfaceC1368) {
                C1334 c1334 = AbstractC1902.f5586;
                C1253 c1253 = (C1253) interfaceC1368;
                c1253.getClass();
                return (C7833) AbstractC4344.m8819((Iterable) AbstractC1367.m2482(c1253, c1334));
            }
        };
        AbstractC5187.m10214(new C0011(24));
        f5587 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextInputService$1
            @Override // p052.InterfaceC6543
            public final C2014 invoke() {
                return null;
            }
        });
        f5584 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalSoftwareKeyboardController$1
            @Override // p052.InterfaceC6543
            public final InterfaceC1871 invoke() {
                return null;
            }
        });
        f5585 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextToolbar$1
            @Override // p052.InterfaceC6543
            public final InterfaceC1874 invoke() {
                AbstractC1902.m3597("LocalTextToolbar");
                throw null;
            }
        });
        f5577 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalUriHandler$1
            @Override // p052.InterfaceC6543
            public final InterfaceC1873 invoke() {
                AbstractC1902.m3597("LocalUriHandler");
                throw null;
            }
        });
        f5576 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalViewConfiguration$1
            @Override // p052.InterfaceC6543
            public final InterfaceC1863 invoke() {
                AbstractC1902.m3597("LocalViewConfiguration");
                throw null;
            }
        });
        f5580 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalWindowInfo$1
            @Override // p052.InterfaceC6543
            public final InterfaceC1848 invoke() {
                AbstractC1902.m3597("LocalWindowInfo");
                throw null;
            }
        });
        f5581 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalPointerIconService$1
            @Override // p052.InterfaceC6543
            public final InterfaceC1645 invoke() {
                return null;
            }
        });
        f5578 = new C1358(new InterfaceC6543() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalProvidableScrollCaptureInProgress$1
            @Override // p052.InterfaceC6543
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        });
        f5579 = new C1334(new InterfaceC6543() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalCursorBlinkEnabled$1
            @Override // p052.InterfaceC6543
            public final Boolean invoke() {
                return Boolean.TRUE;
            }
        });
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m3597(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m3598(final InterfaceC1801 interfaceC1801, final InterfaceC1873 interfaceC1873, final InterfaceC6554 interfaceC6554, InterfaceC1373 interfaceC1373, final int i) {
        int i2;
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(1925803616);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c1324.m2360(interfaceC1801) : c1324.m2378(interfaceC1801) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? c1324.m2360(interfaceC1873) : c1324.m2378(interfaceC1873) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c1324.m2378(interfaceC6554) ? 256 : 128;
        }
        if (c1324.m2343(i2 & 1, (i2 & 147) != 146)) {
            ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884 = (ViewTreeObserverOnGlobalLayoutListenerC1884) interfaceC1801;
            C0194 c0194Mo2428 = f5575.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.m3549getAccessibilityManager());
            C0194 c0194Mo24282 = f5574.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.getAutofill());
            C0194 c0194Mo24283 = f5572.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.getAutofillManager());
            C0194 c0194Mo24284 = f5573.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.getAutofillTree());
            C0194 c0194Mo24285 = f5571.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.m3551getClipboardManager());
            C0194 c0194Mo24286 = f5570.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.m3550getClipboard());
            C0194 c0194Mo24287 = f5588.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.getDensity());
            C0194 c0194Mo24288 = f5592.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.getFocusOwner());
            C0194 c0194Mo24289 = f5593.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.getFontLoader());
            c0194Mo24289.f762 = false;
            int i3 = i2;
            C0194 c0194Mo242810 = f5590.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.getFontFamilyResolver());
            c0194Mo242810.f762 = false;
            AbstractC1367.m2486(new C0194[]{c0194Mo2428, c0194Mo24282, c0194Mo24283, c0194Mo24284, c0194Mo24285, c0194Mo24286, c0194Mo24287, c0194Mo24288, c0194Mo24289, c0194Mo242810, f5591.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.getHapticFeedBack()), f5583.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.getInputModeManager()), f5582.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.getLayoutDirection()), f5587.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.getTextInputService()), f5584.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.getSoftwareKeyboardController()), f5585.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.getTextToolbar()), f5577.mo2428(interfaceC1873), f5576.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.getViewConfiguration()), f5580.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.getWindowInfo()), f5581.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.getPointerIconService()), f5589.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.getGraphicsContext()), AbstractC7334.f19546.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.getRetainedValuesStore()), f5586.mo2428(viewTreeObserverOnGlobalLayoutListenerC1884.getLocaleList())}, interfaceC6554, c1324, ((i3 >> 3) & 112) | 8);
        } else {
            c1324.m2339();
        }
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new InterfaceC6554() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$ProvideCommonCompositionLocals$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(InterfaceC1373 interfaceC13732, int i4) {
                    AbstractC1902.m3598(interfaceC1801, interfaceC1873, interfaceC6554, interfaceC13732, AbstractC1367.m2471(i | 1));
                }

                @Override // p052.InterfaceC6554
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((InterfaceC1373) obj, ((Number) obj2).intValue());
                    return C5176.f14739;
                }
            };
        }
    }
}
