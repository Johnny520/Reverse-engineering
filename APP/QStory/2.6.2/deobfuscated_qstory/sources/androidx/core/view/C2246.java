package androidx.core.view;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.davemorrissey.labs.subscaleview.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p155.C7606;
import p155.C7609;
import p155.InterfaceC7614;
import top.suzhelan.qstory.hook.item.chat.C5851;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C2246 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final View.AccessibilityDelegate f6544 = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2247 f6545;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final View.AccessibilityDelegate f6546;

    public C2246(View.AccessibilityDelegate accessibilityDelegate) {
        this.f6546 = accessibilityDelegate;
        this.f6545 = new C2247(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean mo4185(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f6546.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void mo4186(View view, AccessibilityEvent accessibilityEvent) {
        this.f6546.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public void mo3581(View view, C7606 c7606) {
        this.f6546.onInitializeAccessibilityNodeInfo(view, c7606.f20635);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void mo4187(View view, AccessibilityEvent accessibilityEvent) {
        this.f6546.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C5851 mo3566(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f6546.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C5851(accessibilityNodeProvider, 15);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public boolean mo4188(View view, AccessibilityEvent accessibilityEvent) {
        return this.f6546.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void mo4189(View view, int i) {
        this.f6546.sendAccessibilityEvent(view, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public boolean mo4190(View view, int i, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            C7609 c7609 = (C7609) list.get(i2);
            if (c7609.m12820() == i) {
                Class cls = c7609.f20650;
                InterfaceC7614 interfaceC7614 = c7609.f20649;
                if (interfaceC7614 != null) {
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                        }
                    }
                    zPerformAccessibilityAction = interfaceC7614.mo340(view);
                }
            } else {
                i2++;
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f6546.performAccessibilityAction(view, i, bundle);
        }
        if (zPerformAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i4 = 0;
            while (true) {
                if (clickableSpanArr == null || i4 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z = true;
                    break;
                }
                i4++;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public void mo4191(View view, AccessibilityEvent accessibilityEvent) {
        this.f6546.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C2246() {
        this(f6544);
    }
}
