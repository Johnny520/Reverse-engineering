package p352y3;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.p218ws.WebSocketProtocol;
import p352y3.InterfaceC9563v;

/* JADX INFO: renamed from: y3.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C9561t {

    /* JADX INFO: renamed from: a */
    public final AccessibilityNodeInfo f32540a;

    /* JADX INFO: renamed from: b */
    public int f32541b = -1;

    /* JADX INFO: renamed from: c */
    public int f32542c = -1;

    /* JADX INFO: renamed from: y3.t$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static CharSequence m37463a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        /* JADX INFO: renamed from: b */
        public static void m37464b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: y3.t$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static String m37465a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        /* JADX INFO: renamed from: b */
        public static boolean m37466b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    /* JADX INFO: renamed from: y3.t$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class d {
        /* JADX INFO: renamed from: a */
        public static AccessibilityNodeInfo.AccessibilityAction m37467a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        /* JADX INFO: renamed from: b */
        public static void m37468b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        /* JADX INFO: renamed from: c */
        public static CharSequence m37469c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        /* JADX INFO: renamed from: d */
        public static boolean m37470d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        /* JADX INFO: renamed from: e */
        public static void m37471e(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z10);
        }
    }

    /* JADX INFO: renamed from: y3.t$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class e {

        /* JADX INFO: renamed from: a */
        public final Object f32590a;

        public e(Object obj) {
            this.f32590a = obj;
        }

        /* JADX INFO: renamed from: a */
        public static e m37472a(int i10, int i11, boolean z10, int i12) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    /* JADX INFO: renamed from: y3.t$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class f {

        /* JADX INFO: renamed from: a */
        public final Object f32591a;

        public f(Object obj) {
            this.f32591a = obj;
        }

        /* JADX INFO: renamed from: a */
        public static f m37473a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    /* JADX INFO: renamed from: y3.t$g */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class g {

        /* JADX INFO: renamed from: a */
        public final Object f32592a;

        public g(Object obj) {
            this.f32592a = obj;
        }

        /* JADX INFO: renamed from: a */
        public static g m37474a(int i10, float f10, float f11, float f12) {
            return new g(AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12));
        }
    }

    public C9561t(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f32540a = accessibilityNodeInfo;
    }

    /* JADX INFO: renamed from: O0 */
    public static C9561t m37367O0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C9561t(accessibilityNodeInfo);
    }

    /* JADX INFO: renamed from: S */
    public static C9561t m37368S() {
        return m37367O0(AccessibilityNodeInfo.obtain());
    }

    /* JADX INFO: renamed from: h */
    public static String m37369h(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: n */
    public static ClickableSpan[] m37370n(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m37371A() {
        return !m37420f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* JADX INFO: renamed from: A0 */
    public void m37372A0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f32540a.setScreenReaderFocusable(z10);
        } else {
            m37407X(1, z10);
        }
    }

    /* JADX INFO: renamed from: B */
    public boolean m37373B() {
        return Build.VERSION.SDK_INT >= 34 ? d.m37470d(this.f32540a) : m37425i(64);
    }

    /* JADX INFO: renamed from: B0 */
    public void m37374B0(boolean z10) {
        this.f32540a.setScrollable(z10);
    }

    /* JADX INFO: renamed from: C */
    public boolean m37375C() {
        return this.f32540a.isCheckable();
    }

    /* JADX INFO: renamed from: C0 */
    public void m37376C0(boolean z10) {
        this.f32540a.setSelected(z10);
    }

    /* JADX INFO: renamed from: D */
    public boolean m37377D() {
        return this.f32540a.isChecked();
    }

    /* JADX INFO: renamed from: D0 */
    public void m37378D0(View view, int i10) {
        this.f32542c = i10;
        this.f32540a.setSource(view, i10);
    }

    /* JADX INFO: renamed from: E */
    public boolean m37379E() {
        return this.f32540a.isClickable();
    }

    /* JADX INFO: renamed from: E0 */
    public void m37380E0(CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f32540a;
        if (i10 >= 30) {
            b.m37464b(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* JADX INFO: renamed from: F */
    public boolean m37381F() {
        return this.f32540a.isContextClickable();
    }

    /* JADX INFO: renamed from: F0 */
    public void m37382F0(CharSequence charSequence) {
        this.f32540a.setText(charSequence);
    }

    /* JADX INFO: renamed from: G */
    public boolean m37383G() {
        return this.f32540a.isEnabled();
    }

    /* JADX INFO: renamed from: G0 */
    public void m37384G0(int i10, int i11) {
        this.f32540a.setTextSelection(i10, i11);
    }

    /* JADX INFO: renamed from: H */
    public boolean m37385H() {
        return this.f32540a.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
    }

    /* JADX INFO: renamed from: H0 */
    public void m37386H0(View view) {
        this.f32540a.setTraversalAfter(view);
    }

    /* JADX INFO: renamed from: I */
    public boolean m37387I() {
        return this.f32540a.isFocusable();
    }

    /* JADX INFO: renamed from: I0 */
    public void m37388I0(View view, int i10) {
        this.f32540a.setTraversalAfter(view, i10);
    }

    /* JADX INFO: renamed from: J */
    public boolean m37389J() {
        return this.f32540a.isFocused();
    }

    /* JADX INFO: renamed from: J0 */
    public void m37390J0(View view) {
        this.f32540a.setTraversalBefore(view);
    }

    /* JADX INFO: renamed from: K */
    public boolean m37391K() {
        return m37425i(67108864);
    }

    /* JADX INFO: renamed from: K0 */
    public void m37392K0(View view, int i10) {
        this.f32540a.setTraversalBefore(view, i10);
    }

    /* JADX INFO: renamed from: L */
    public boolean m37393L() {
        return this.f32540a.isImportantForAccessibility();
    }

    /* JADX INFO: renamed from: L0 */
    public void m37394L0(String str) {
        this.f32540a.setViewIdResourceName(str);
    }

    /* JADX INFO: renamed from: M */
    public boolean m37395M() {
        return this.f32540a.isLongClickable();
    }

    /* JADX INFO: renamed from: M0 */
    public void m37396M0(boolean z10) {
        this.f32540a.setVisibleToUser(z10);
    }

    /* JADX INFO: renamed from: N */
    public boolean m37397N() {
        return this.f32540a.isPassword();
    }

    /* JADX INFO: renamed from: N0 */
    public AccessibilityNodeInfo m37398N0() {
        return this.f32540a;
    }

    /* JADX INFO: renamed from: O */
    public boolean m37399O() {
        return this.f32540a.isScrollable();
    }

    /* JADX INFO: renamed from: P */
    public boolean m37400P() {
        return this.f32540a.isSelected();
    }

    /* JADX INFO: renamed from: Q */
    public boolean m37401Q() {
        return Build.VERSION.SDK_INT >= 33 ? c.m37466b(this.f32540a) : m37425i(8388608);
    }

    /* JADX INFO: renamed from: R */
    public boolean m37402R() {
        return this.f32540a.isVisibleToUser();
    }

    /* JADX INFO: renamed from: T */
    public boolean m37403T(int i10, Bundle bundle) {
        return this.f32540a.performAction(i10, bundle);
    }

    /* JADX INFO: renamed from: U */
    public void m37404U(boolean z10) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.m37471e(this.f32540a, z10);
        } else {
            m37407X(64, z10);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m37405V(boolean z10) {
        this.f32540a.setAccessibilityFocused(z10);
    }

    /* JADX INFO: renamed from: W */
    public void m37406W(List list) {
        this.f32540a.setAvailableExtraData(list);
    }

    /* JADX INFO: renamed from: X */
    public final void m37407X(int i10, boolean z10) {
        Bundle bundleM37442r = m37442r();
        if (bundleM37442r != null) {
            int i11 = bundleM37442r.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            bundleM37442r.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m37408Y(Rect rect) {
        this.f32540a.setBoundsInScreen(rect);
    }

    /* JADX INFO: renamed from: Z */
    public void m37409Z(boolean z10) {
        this.f32540a.setCheckable(z10);
    }

    /* JADX INFO: renamed from: a */
    public void m37410a(int i10) {
        this.f32540a.addAction(i10);
    }

    /* JADX INFO: renamed from: a0 */
    public void m37411a0(boolean z10) {
        this.f32540a.setChecked(z10);
    }

    /* JADX INFO: renamed from: b */
    public void m37412b(a aVar) {
        this.f32540a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f32587a);
    }

    /* JADX INFO: renamed from: b0 */
    public void m37413b0(CharSequence charSequence) {
        this.f32540a.setClassName(charSequence);
    }

    /* JADX INFO: renamed from: c */
    public void m37414c(View view) {
        this.f32540a.addChild(view);
    }

    /* JADX INFO: renamed from: c0 */
    public void m37415c0(boolean z10) {
        this.f32540a.setClickable(z10);
    }

    /* JADX INFO: renamed from: d */
    public void m37416d(View view, int i10) {
        this.f32540a.addChild(view, i10);
    }

    /* JADX INFO: renamed from: d0 */
    public void m37417d0(Object obj) {
        this.f32540a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).f32590a);
    }

    /* JADX INFO: renamed from: e0 */
    public void m37419e0(Object obj) {
        this.f32540a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).f32591a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C9561t)) {
            return false;
        }
        C9561t c9561t = (C9561t) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f32540a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = c9561t.f32540a;
        if (accessibilityNodeInfo == null) {
            if (accessibilityNodeInfo2 != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfo2)) {
            return false;
        }
        return this.f32542c == c9561t.f32542c && this.f32541b == c9561t.f32541b;
    }

    /* JADX INFO: renamed from: f */
    public final List m37420f(String str) {
        ArrayList<Integer> integerArrayList = this.f32540a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f32540a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: f0 */
    public void m37421f0(CharSequence charSequence) {
        this.f32540a.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: g */
    public List m37422g() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f32540a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g0 */
    public void m37423g0(boolean z10) {
        this.f32540a.setContentInvalid(z10);
    }

    /* JADX INFO: renamed from: h0 */
    public void m37424h0(int i10) {
        this.f32540a.setDrawingOrder(i10);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f32540a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m37425i(int i10) {
        Bundle bundleM37442r = m37442r();
        return bundleM37442r != null && (bundleM37442r.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    /* JADX INFO: renamed from: i0 */
    public void m37426i0(boolean z10) {
        this.f32540a.setEditable(z10);
    }

    /* JADX INFO: renamed from: j */
    public void m37427j(Rect rect) {
        this.f32540a.getBoundsInParent(rect);
    }

    /* JADX INFO: renamed from: j0 */
    public void m37428j0(boolean z10) {
        this.f32540a.setEnabled(z10);
    }

    /* JADX INFO: renamed from: k */
    public void m37429k(Rect rect) {
        this.f32540a.getBoundsInScreen(rect);
    }

    /* JADX INFO: renamed from: k0 */
    public void m37430k0(CharSequence charSequence) {
        this.f32540a.setError(charSequence);
    }

    /* JADX INFO: renamed from: l */
    public void m37431l(Rect rect) {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f32540a;
        if (i10 >= 34) {
            d.m37468b(accessibilityNodeInfo, rect);
            return;
        }
        Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m37432l0(boolean z10) {
        this.f32540a.setFocusable(z10);
    }

    /* JADX INFO: renamed from: m */
    public CharSequence m37433m() {
        return this.f32540a.getClassName();
    }

    /* JADX INFO: renamed from: m0 */
    public void m37434m0(boolean z10) {
        this.f32540a.setFocused(z10);
    }

    /* JADX INFO: renamed from: n0 */
    public void m37435n0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f32540a.setHeading(z10);
        } else {
            m37407X(2, z10);
        }
    }

    /* JADX INFO: renamed from: o */
    public CharSequence m37436o() {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f32540a;
        return i10 >= 34 ? d.m37469c(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    /* JADX INFO: renamed from: o0 */
    public void m37437o0(boolean z10) {
        this.f32540a.setImportantForAccessibility(z10);
    }

    /* JADX INFO: renamed from: p */
    public CharSequence m37438p() {
        return this.f32540a.getContentDescription();
    }

    /* JADX INFO: renamed from: p0 */
    public void m37439p0(int i10) {
        this.f32540a.setLiveRegion(i10);
    }

    /* JADX INFO: renamed from: q */
    public CharSequence m37440q() {
        return this.f32540a.getError();
    }

    /* JADX INFO: renamed from: q0 */
    public void m37441q0(boolean z10) {
        this.f32540a.setLongClickable(z10);
    }

    /* JADX INFO: renamed from: r */
    public Bundle m37442r() {
        return this.f32540a.getExtras();
    }

    /* JADX INFO: renamed from: r0 */
    public void m37443r0(int i10) {
        this.f32540a.setMaxTextLength(i10);
    }

    /* JADX INFO: renamed from: s */
    public int m37444s() {
        return this.f32540a.getMaxTextLength();
    }

    /* JADX INFO: renamed from: s0 */
    public void m37445s0(int i10) {
        this.f32540a.setMovementGranularities(i10);
    }

    /* JADX INFO: renamed from: t */
    public int m37446t() {
        return this.f32540a.getMovementGranularities();
    }

    /* JADX INFO: renamed from: t0 */
    public void m37447t0(CharSequence charSequence) {
        this.f32540a.setPackageName(charSequence);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m37427j(rect);
        sb2.append("; boundsInParent: " + rect);
        m37429k(rect);
        sb2.append("; boundsInScreen: " + rect);
        m37431l(rect);
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(m37448u());
        sb2.append("; className: ");
        sb2.append(m37433m());
        sb2.append("; text: ");
        sb2.append(m37452w());
        sb2.append("; error: ");
        sb2.append(m37440q());
        sb2.append("; maxTextLength: ");
        sb2.append(m37444s());
        sb2.append("; stateDescription: ");
        sb2.append(m37450v());
        sb2.append("; contentDescription: ");
        sb2.append(m37438p());
        sb2.append("; tooltipText: ");
        sb2.append(m37454x());
        sb2.append("; viewIdResName: ");
        sb2.append(m37458z());
        sb2.append("; uniqueId: ");
        sb2.append(m37456y());
        sb2.append("; checkable: ");
        sb2.append(m37375C());
        sb2.append("; checked: ");
        sb2.append(m37377D());
        sb2.append("; fieldRequired: ");
        sb2.append(m37385H());
        sb2.append("; focusable: ");
        sb2.append(m37387I());
        sb2.append("; focused: ");
        sb2.append(m37389J());
        sb2.append("; selected: ");
        sb2.append(m37400P());
        sb2.append("; clickable: ");
        sb2.append(m37379E());
        sb2.append("; longClickable: ");
        sb2.append(m37395M());
        sb2.append("; contextClickable: ");
        sb2.append(m37381F());
        sb2.append("; enabled: ");
        sb2.append(m37383G());
        sb2.append("; password: ");
        sb2.append(m37397N());
        sb2.append("; scrollable: " + m37399O());
        sb2.append("; containerTitle: ");
        sb2.append(m37436o());
        sb2.append("; granularScrollingSupported: ");
        sb2.append(m37391K());
        sb2.append("; importantForAccessibility: ");
        sb2.append(m37393L());
        sb2.append("; visible: ");
        sb2.append(m37402R());
        sb2.append("; isTextSelectable: ");
        sb2.append(m37401Q());
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(m37373B());
        sb2.append("; [");
        List listM37422g = m37422g();
        for (int i10 = 0; i10 < listM37422g.size(); i10++) {
            a aVar = (a) listM37422g.get(i10);
            String strM37369h = m37369h(aVar.m37460a());
            if (strM37369h.equals("ACTION_UNKNOWN") && aVar.m37461b() != null) {
                strM37369h = aVar.m37461b().toString();
            }
            sb2.append(strM37369h);
            if (i10 != listM37422g.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public CharSequence m37448u() {
        return this.f32540a.getPackageName();
    }

    /* JADX INFO: renamed from: u0 */
    public void m37449u0(CharSequence charSequence) {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f32540a;
        if (i10 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* JADX INFO: renamed from: v */
    public CharSequence m37450v() {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f32540a;
        return i10 >= 30 ? b.m37463a(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    /* JADX INFO: renamed from: v0 */
    public void m37451v0(View view) {
        this.f32541b = -1;
        this.f32540a.setParent(view);
    }

    /* JADX INFO: renamed from: w */
    public CharSequence m37452w() {
        if (!m37371A()) {
            return this.f32540a.getText();
        }
        List listM37420f = m37420f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List listM37420f2 = m37420f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List listM37420f3 = m37420f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List listM37420f4 = m37420f("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f32540a.getText(), 0, this.f32540a.getText().length()));
        for (int i10 = 0; i10 < listM37420f.size(); i10++) {
            spannableString.setSpan(new C9542a(((Integer) listM37420f4.get(i10)).intValue(), this, m37442r().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listM37420f.get(i10)).intValue(), ((Integer) listM37420f2.get(i10)).intValue(), ((Integer) listM37420f3.get(i10)).intValue());
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: w0 */
    public void m37453w0(View view, int i10) {
        this.f32541b = i10;
        this.f32540a.setParent(view, i10);
    }

    /* JADX INFO: renamed from: x */
    public CharSequence m37454x() {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f32540a;
        return i10 >= 28 ? accessibilityNodeInfo.getTooltipText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    /* JADX INFO: renamed from: x0 */
    public void m37455x0(boolean z10) {
        this.f32540a.setPassword(z10);
    }

    /* JADX INFO: renamed from: y */
    public String m37456y() {
        int i10 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f32540a;
        return i10 >= 33 ? c.m37465a(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    /* JADX INFO: renamed from: y0 */
    public void m37457y0(g gVar) {
        this.f32540a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) gVar.f32592a);
    }

    /* JADX INFO: renamed from: z */
    public String m37458z() {
        return this.f32540a.getViewIdResourceName();
    }

    /* JADX INFO: renamed from: z0 */
    public void m37459z0(CharSequence charSequence) {
        this.f32540a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    /* JADX INFO: renamed from: y3.t$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {

        /* JADX INFO: renamed from: F */
        public static final a f32548F;

        /* JADX INFO: renamed from: G */
        public static final a f32549G;

        /* JADX INFO: renamed from: H */
        public static final a f32550H;

        /* JADX INFO: renamed from: I */
        public static final a f32551I;

        /* JADX INFO: renamed from: J */
        public static final a f32552J;

        /* JADX INFO: renamed from: K */
        public static final a f32553K;

        /* JADX INFO: renamed from: L */
        public static final a f32554L;

        /* JADX INFO: renamed from: M */
        public static final a f32555M;

        /* JADX INFO: renamed from: N */
        public static final a f32556N;

        /* JADX INFO: renamed from: O */
        public static final a f32557O;

        /* JADX INFO: renamed from: P */
        public static final a f32558P;

        /* JADX INFO: renamed from: Q */
        public static final a f32559Q;

        /* JADX INFO: renamed from: R */
        public static final a f32560R;

        /* JADX INFO: renamed from: S */
        public static final a f32561S;

        /* JADX INFO: renamed from: T */
        public static final a f32562T;

        /* JADX INFO: renamed from: U */
        public static final a f32563U;

        /* JADX INFO: renamed from: a */
        public final Object f32587a;

        /* JADX INFO: renamed from: b */
        public final int f32588b;

        /* JADX INFO: renamed from: c */
        public final Class f32589c;

        /* JADX INFO: renamed from: d */
        public static final a f32564d = new a(1, null);

        /* JADX INFO: renamed from: e */
        public static final a f32565e = new a(2, null);

        /* JADX INFO: renamed from: f */
        public static final a f32566f = new a(4, null);

        /* JADX INFO: renamed from: g */
        public static final a f32567g = new a(8, null);

        /* JADX INFO: renamed from: h */
        public static final a f32568h = new a(16, null);

        /* JADX INFO: renamed from: i */
        public static final a f32569i = new a(32, null);

        /* JADX INFO: renamed from: j */
        public static final a f32570j = new a(64, null);

        /* JADX INFO: renamed from: k */
        public static final a f32571k = new a(128, null);

        /* JADX INFO: renamed from: l */
        public static final a f32572l = new a(256, null, InterfaceC9563v.b.class);

        /* JADX INFO: renamed from: m */
        public static final a f32573m = new a(512, null, InterfaceC9563v.b.class);

        /* JADX INFO: renamed from: n */
        public static final a f32574n = new a(1024, null, InterfaceC9563v.c.class);

        /* JADX INFO: renamed from: o */
        public static final a f32575o = new a(2048, null, InterfaceC9563v.c.class);

        /* JADX INFO: renamed from: p */
        public static final a f32576p = new a(4096, null);

        /* JADX INFO: renamed from: q */
        public static final a f32577q = new a(8192, null);

        /* JADX INFO: renamed from: r */
        public static final a f32578r = new a(Http2.INITIAL_MAX_FRAME_SIZE, null);

        /* JADX INFO: renamed from: s */
        public static final a f32579s = new a(32768, null);

        /* JADX INFO: renamed from: t */
        public static final a f32580t = new a(65536, null);

        /* JADX INFO: renamed from: u */
        public static final a f32581u = new a(131072, null, InterfaceC9563v.g.class);

        /* JADX INFO: renamed from: v */
        public static final a f32582v = new a(262144, null);

        /* JADX INFO: renamed from: w */
        public static final a f32583w = new a(524288, null);

        /* JADX INFO: renamed from: x */
        public static final a f32584x = new a(1048576, null);

        /* JADX INFO: renamed from: y */
        public static final a f32585y = new a(2097152, null, InterfaceC9563v.h.class);

        /* JADX INFO: renamed from: z */
        public static final a f32586z = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);

        /* JADX INFO: renamed from: A */
        public static final a f32543A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, InterfaceC9563v.e.class);

        /* JADX INFO: renamed from: B */
        public static final a f32544B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);

        /* JADX INFO: renamed from: C */
        public static final a f32545C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);

        /* JADX INFO: renamed from: D */
        public static final a f32546D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);

        /* JADX INFO: renamed from: E */
        public static final a f32547E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);

        static {
            int i10 = Build.VERSION.SDK_INT;
            f32548F = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f32549G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f32550H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f32551I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f32552J = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f32553K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, InterfaceC9563v.f.class);
            f32554L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, InterfaceC9563v.d.class);
            f32555M = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f32556N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f32557O = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f32558P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            f32559Q = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            f32560R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            f32561S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            f32562T = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f32563U = new a(i10 >= 34 ? d.m37467a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(Object obj, int i10, CharSequence charSequence, InterfaceC9563v interfaceC9563v, Class cls) {
            this.f32588b = i10;
            if (obj == null) {
                this.f32587a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f32587a = obj;
            }
            this.f32589c = cls;
        }

        /* JADX INFO: renamed from: a */
        public int m37460a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f32587a).getId();
        }

        /* JADX INFO: renamed from: b */
        public CharSequence m37461b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f32587a).getLabel();
        }

        /* JADX INFO: renamed from: c */
        public boolean m37462c(View view, Bundle bundle) {
            return false;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f32587a;
            Object obj3 = ((a) obj).f32587a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f32587a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
            String strM37369h = C9561t.m37369h(this.f32588b);
            if (strM37369h.equals("ACTION_UNKNOWN") && m37461b() != null) {
                strM37369h = m37461b().toString();
            }
            sb2.append(strM37369h);
            return sb2.toString();
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(int i10, CharSequence charSequence, Class cls) {
            this(null, i10, charSequence, null, cls);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m37418e(CharSequence charSequence, View view) {
    }
}
