package p099y;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.p055lu.wxmask272.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p004C.C0066j;
import p101z.AbstractC1103d;
import p101z.C1102c;
import p101z.C1107h;

/* JADX INFO: renamed from: y.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1062a extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a */
    public final C1064b f3689a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1062a(C1064b c1064b) {
        this.f3689a = c1064b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f3689a.f3692a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f3689a.f3692a.getAccessibilityNodeProvider(view);
        C0066j c0066j = accessibilityNodeProvider != null ? new C0066j(25, accessibilityNodeProvider) : null;
        if (c0066j != null) {
            return (AccessibilityNodeProvider) c0066j.f312c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f3689a.mo220a(view, accessibilityEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v35, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r4v8, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object tag2;
        Object tag3;
        Object objM2273b;
        int iKeyAt;
        C1107h c1107h = new C1107h(accessibilityNodeInfo);
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Boolean.valueOf(AbstractC1041E.m2259d(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        int i2 = 0;
        boolean z2 = (bool == null || !bool.booleanValue()) ? 0 : 1;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z2);
        } else {
            Bundle extras = accessibilityNodeInfo.getExtras();
            if (extras != null) {
                extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", z2 | (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            tag2 = Boolean.valueOf(AbstractC1041E.m2258c(view));
        } else {
            tag2 = view.getTag(R.id.tag_accessibility_heading);
            if (!Boolean.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        Boolean bool2 = (Boolean) tag2;
        boolean z3 = bool2 != null && bool2.booleanValue();
        if (i3 >= 28) {
            accessibilityNodeInfo.setHeading(z3);
        } else {
            Bundle extras2 = accessibilityNodeInfo.getExtras();
            if (extras2 != null) {
                extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (z3 ? 2 : 0) | (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)));
            }
        }
        if (i3 >= 28) {
            tag3 = AbstractC1041E.m2257b(view);
        } else {
            tag3 = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag3)) {
                tag3 = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag3;
        if (i3 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
        if (i3 >= 30) {
            objM2273b = AbstractC1043G.m2273b(view);
        } else {
            Object tag4 = view.getTag(R.id.tag_state_description);
            objM2273b = CharSequence.class.isInstance(tag4) ? tag4 : null;
        }
        CharSequence charSequence2 = (CharSequence) objM2273b;
        if (i3 >= 30) {
            AbstractC1103d.m2373c(accessibilityNodeInfo, charSequence2);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence2);
        }
        this.f3689a.mo221b(view, c1107h);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i3 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                    if (((WeakReference) sparseArray.valueAt(i4)).get() == null) {
                        arrayList.add(Integer.valueOf(i4));
                    }
                }
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    sparseArray.remove(((Integer) arrayList.get(i5)).intValue());
                }
            }
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                int i6 = 0;
                while (i6 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i6];
                    int i7 = i2;
                    while (true) {
                        if (i7 >= sparseArray2.size()) {
                            iKeyAt = C1107h.f3749b;
                            C1107h.f3749b = iKeyAt + 1;
                            break;
                        } else {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i7)).get())) {
                                iKeyAt = sparseArray2.keyAt(i7);
                                break;
                            }
                            i7++;
                        }
                    }
                    sparseArray2.put(iKeyAt, new WeakReference(clickableSpanArr[i6]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i6];
                    Spanned spanned = (Spanned) text;
                    c1107h.m2397a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    c1107h.m2397a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    c1107h.m2397a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    c1107h.m2397a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
                    i6++;
                    i2 = 0;
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            c1107h.f3750a.addAction((AccessibilityNodeInfo.AccessibilityAction) ((C1102c) list.get(i8)).f3747a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f3689a.f3692a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f3689a.f3692a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
        return this.f3689a.mo222c(view, i2, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i2) {
        this.f3689a.f3692a.sendAccessibilityEvent(view, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f3689a.f3692a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
