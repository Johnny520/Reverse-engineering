package p000;

import android.R;
import android.graphics.Rect;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0357j0 {

    /* JADX INFO: renamed from: a */
    public final AccessibilityNodeInfo f2513a;

    /* JADX INFO: renamed from: b */
    public int f2514b = -1;

    public C0357j0(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2513a = accessibilityNodeInfo;
    }

    /* JADX INFO: renamed from: a */
    public final void m1533a(int i) {
        this.f2513a.addAction(i);
    }

    /* JADX INFO: renamed from: b */
    public final void m1534b(C0281h0 c0281h0) {
        this.f2513a.addAction((AccessibilityNodeInfo.AccessibilityAction) c0281h0.f2188a);
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m1535c(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2513a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final void m1536d(Rect rect) {
        this.f2513a.getBoundsInParent(rect);
    }

    /* JADX INFO: renamed from: e */
    public final CharSequence m1537e() {
        boolean zIsEmpty = m1535c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2513a;
        if (zIsEmpty) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList arrayListM1535c = m1535c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList arrayListM1535c2 = m1535c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList arrayListM1535c3 = m1535c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList arrayListM1535c4 = m1535c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < arrayListM1535c.size(); i++) {
            spannableString.setSpan(new C0764u(((Integer) arrayListM1535c4.get(i)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) arrayListM1535c.get(i)).intValue(), ((Integer) arrayListM1535c2.get(i)).intValue(), ((Integer) arrayListM1535c3.get(i)).intValue());
        }
        return spannableString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0357j0)) {
            return false;
        }
        C0357j0 c0357j0 = (C0357j0) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = c0357j0.f2513a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f2513a;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.f2514b == c0357j0.f2514b;
    }

    /* JADX INFO: renamed from: f */
    public final void m1538f(C0318i0 c0318i0) {
        this.f2513a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) c0318i0.f2324a);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2513a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    public final String toString() {
        ?? arrayList;
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m1536d(rect);
        sb.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2513a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(m1537e());
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; viewId: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(AbstractC0346ip.m1467A() ? accessibilityNodeInfo.getUniqueId() : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        sb.append(accessibilityNodeInfo.isChecked());
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        if (actionList != null) {
            arrayList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new C0281h0(actionList.get(i), 0, null, null, null));
            }
        } else {
            arrayList = Collections.EMPTY_LIST;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C0281h0 c0281h0 = (C0281h0) arrayList.get(i2);
            int iM1335a = c0281h0.m1335a();
            Object obj = c0281h0.f2188a;
            if (iM1335a == 1) {
                string = "ACTION_FOCUS";
            } else if (iM1335a != 2) {
                switch (iM1335a) {
                    case 4:
                        string = "ACTION_SELECT";
                        break;
                    case 8:
                        string = "ACTION_CLEAR_SELECTION";
                        break;
                    case 16:
                        string = "ACTION_CLICK";
                        break;
                    case 32:
                        string = "ACTION_LONG_CLICK";
                        break;
                    case 64:
                        string = "ACTION_ACCESSIBILITY_FOCUS";
                        break;
                    case 128:
                        string = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                        break;
                    case 256:
                        string = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 512:
                        string = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 1024:
                        string = "ACTION_NEXT_HTML_ELEMENT";
                        break;
                    case 2048:
                        string = "ACTION_PREVIOUS_HTML_ELEMENT";
                        break;
                    case 4096:
                        string = "ACTION_SCROLL_FORWARD";
                        break;
                    case 8192:
                        string = "ACTION_SCROLL_BACKWARD";
                        break;
                    case 16384:
                        string = "ACTION_COPY";
                        break;
                    case 32768:
                        string = "ACTION_PASTE";
                        break;
                    case 65536:
                        string = "ACTION_CUT";
                        break;
                    case 131072:
                        string = "ACTION_SET_SELECTION";
                        break;
                    case 262144:
                        string = "ACTION_EXPAND";
                        break;
                    case 524288:
                        string = "ACTION_COLLAPSE";
                        break;
                    case 2097152:
                        string = "ACTION_SET_TEXT";
                        break;
                    case R.id.accessibilityActionMoveWindow:
                        string = "ACTION_MOVE_WINDOW";
                        break;
                    default:
                        switch (iM1335a) {
                            case R.id.accessibilityActionShowOnScreen:
                                string = "ACTION_SHOW_ON_SCREEN";
                                break;
                            case R.id.accessibilityActionScrollToPosition:
                                string = "ACTION_SCROLL_TO_POSITION";
                                break;
                            case R.id.accessibilityActionScrollUp:
                                string = "ACTION_SCROLL_UP";
                                break;
                            case R.id.accessibilityActionScrollLeft:
                                string = "ACTION_SCROLL_LEFT";
                                break;
                            case R.id.accessibilityActionScrollDown:
                                string = "ACTION_SCROLL_DOWN";
                                break;
                            case R.id.accessibilityActionScrollRight:
                                string = "ACTION_SCROLL_RIGHT";
                                break;
                            case R.id.accessibilityActionContextClick:
                                string = "ACTION_CONTEXT_CLICK";
                                break;
                            case R.id.accessibilityActionSetProgress:
                                string = "ACTION_SET_PROGRESS";
                                break;
                            default:
                                switch (iM1335a) {
                                    case R.id.accessibilityActionShowTooltip:
                                        string = "ACTION_SHOW_TOOLTIP";
                                        break;
                                    case R.id.accessibilityActionHideTooltip:
                                        string = "ACTION_HIDE_TOOLTIP";
                                        break;
                                    case R.id.accessibilityActionPageUp:
                                        string = "ACTION_PAGE_UP";
                                        break;
                                    case R.id.accessibilityActionPageDown:
                                        string = "ACTION_PAGE_DOWN";
                                        break;
                                    case R.id.accessibilityActionPageLeft:
                                        string = "ACTION_PAGE_LEFT";
                                        break;
                                    case R.id.accessibilityActionPageRight:
                                        string = "ACTION_PAGE_RIGHT";
                                        break;
                                    case R.id.accessibilityActionPressAndHold:
                                        string = "ACTION_PRESS_AND_HOLD";
                                        break;
                                    default:
                                        switch (iM1335a) {
                                            case R.id.accessibilityActionImeEnter:
                                                string = "ACTION_IME_ENTER";
                                                break;
                                            case R.id.accessibilityActionDragStart:
                                                string = "ACTION_DRAG_START";
                                                break;
                                            case R.id.accessibilityActionDragDrop:
                                                string = "ACTION_DRAG_DROP";
                                                break;
                                            case R.id.accessibilityActionDragCancel:
                                                string = "ACTION_DRAG_CANCEL";
                                                break;
                                            default:
                                                string = "ACTION_UNKNOWN";
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                string = "ACTION_CLEAR_FOCUS";
            }
            if (string.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                string = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
            sb.append(string);
            if (i2 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
