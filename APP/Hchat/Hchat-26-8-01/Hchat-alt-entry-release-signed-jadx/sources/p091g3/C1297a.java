package p091g3;

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
import androidx.lifecycle.C0119x;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p017b2.AbstractC0170b;
import p099h.Hchat.R;
import p103h3.C1576e;
import p103h3.C1578g;

/* JADX INFO: renamed from: g3.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1297a extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a */
    public final AbstractC1299b f4347a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1297a(AbstractC1299b abstractC1299b) {
        this.f4347a = abstractC1299b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f4347a.f4353g.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C0119x c0119xMo3449a = this.f4347a.mo3449a(view);
        if (c0119xMo3449a != null) {
            return (AccessibilityNodeProvider) c0119xMo3449a.f310h;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f4347a.f4353g.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object objValueOf;
        Object tag2;
        C1578g c1578g = new C1578g(accessibilityNodeInfo);
        int i9 = AbstractC1329q.f4395a;
        int i10 = Build.VERSION.SDK_INT;
        Object objM3552a = null;
        if (i10 >= 28) {
            tag = Boolean.valueOf(AbstractC1325o.m3528c(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        boolean z9 = bool != null && bool.booleanValue();
        if (i10 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z9);
        } else {
            c1578g.m4122f(1, z9);
        }
        if (i10 >= 28) {
            objValueOf = Boolean.valueOf(AbstractC1325o.m3527b(view));
        } else {
            Object tag3 = view.getTag(R.id.tag_accessibility_heading);
            objValueOf = Boolean.class.isInstance(tag3) ? tag3 : null;
        }
        Boolean bool2 = (Boolean) objValueOf;
        boolean z10 = bool2 != null && bool2.booleanValue();
        if (i10 >= 28) {
            accessibilityNodeInfo.setHeading(z10);
        } else {
            c1578g.m4122f(2, z10);
        }
        if (i10 >= 28) {
            tag2 = AbstractC1325o.m3526a(view);
        } else {
            tag2 = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag2;
        if (i10 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
        if (i10 >= 30) {
            objM3552a = AbstractC1327p.m3552a(view);
        } else {
            Object tag4 = view.getTag(R.id.tag_state_description);
            if (CharSequence.class.isInstance(tag4)) {
                objM3552a = tag4;
            }
        }
        CharSequence charSequence2 = (CharSequence) objM3552a;
        if (i10 >= 30) {
            AbstractC0170b.m764g(accessibilityNodeInfo, charSequence2);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence2);
        }
        this.f4347a.mo3450b(view, c1578g);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            c1578g.m4118a((C1576e) list.get(i11));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f4347a.f4353g.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f4347a.f4353g.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i9, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        AbstractC1299b abstractC1299b = this.f4347a;
        abstractC1299b.getClass();
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i10 = 0; i10 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((C1576e) list.get(i10)).f5245a).getId() != i9; i10++) {
        }
        boolean zPerformAccessibilityAction = abstractC1299b.f4353g.performAccessibilityAction(view, i9, bundle);
        if (zPerformAccessibilityAction || i9 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i11 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i11)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i12 = 0; clickableSpanArr != null && i12 < clickableSpanArr.length; i12++) {
                if (clickableSpan.equals(clickableSpanArr[i12])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i9) {
        this.f4347a.f4353g.sendAccessibilityEvent(view, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f4347a.f4353g.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
