package yyds;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲀᛸᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C2060 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final View.AccessibilityDelegate f10200 = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final View.AccessibilityDelegate f10201;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C1862 f10202;

    public C2060(View.AccessibilityDelegate accessibilityDelegate) {
        this.f10201 = accessibilityDelegate;
        this.f10202 = new C1862(this);
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public void mo3410(View view, int i) {
        this.f10201.sendAccessibilityEvent(view, i);
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public void mo3411(View view, AccessibilityEvent accessibilityEvent) {
        this.f10201.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public void mo3412(View view, AccessibilityEvent accessibilityEvent) {
        this.f10201.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public boolean mo3413(View view, AccessibilityEvent accessibilityEvent) {
        return this.f10201.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public C0052 mo3414(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f10201.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0052(1, accessibilityNodeProvider);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public boolean mo1341(View view, int i, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i2 = 0; i2 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((C1043) list.get(i2)).f4747).getId() != i; i2++) {
        }
        boolean zPerformAccessibilityAction = this.f10201.performAccessibilityAction(view, i, bundle);
        if (zPerformAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i4 = 0; clickableSpanArr != null && i4 < clickableSpanArr.length; i4++) {
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public void mo1342(View view, AccessibilityEvent accessibilityEvent) {
        this.f10201.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public boolean mo3415(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f10201.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public void mo1343(View view, C0134 c0134) {
        this.f10201.onInitializeAccessibilityNodeInfo(view, c0134.f833);
    }

    public C2060() {
        this(f10200);
    }
}
