package p099y;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.p055lu.wxmask272.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p101z.C1102c;
import p101z.C1107h;

/* JADX INFO: renamed from: y.b */
/* JADX INFO: loaded from: classes.dex */
public class C1064b {

    /* JADX INFO: renamed from: c */
    public static final View.AccessibilityDelegate f3691c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a */
    public final View.AccessibilityDelegate f3692a;

    /* JADX INFO: renamed from: b */
    public final C1062a f3693b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1064b() {
        this(f3691c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void mo220a(View view, AccessibilityEvent accessibilityEvent) {
        this.f3692a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void mo221b(View view, C1107h c1107h) {
        this.f3692a.onInitializeAccessibilityNodeInfo(view, c1107h.f3750a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public boolean mo222c(View view, int i2, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i3 = 0; i3 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((C1102c) list.get(i3)).f3747a).getId() != i2; i3++) {
        }
        boolean zPerformAccessibilityAction = this.f3692a.performAccessibilityAction(view, i2, bundle);
        if (zPerformAccessibilityAction || i2 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i4 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i4)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i5 = 0; clickableSpanArr != null && i5 < clickableSpanArr.length; i5++) {
                if (clickableSpan.equals(clickableSpanArr[i5])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1064b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f3692a = accessibilityDelegate;
        this.f3693b = new C1062a(this);
    }
}
