package p000;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import io.github.cherrywechat.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: P */
/* JADX INFO: loaded from: classes.dex */
public class C0645P {

    /* JADX INFO: renamed from: c */
    public static final View.AccessibilityDelegate f2081c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a */
    public final View.AccessibilityDelegate f2082a;

    /* JADX INFO: renamed from: b */
    public final C0602O f2083b;

    public C0645P() {
        this(f2081c);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo316a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2082a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: b */
    public C0132D2 mo317b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f2082a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0132D2(2, accessibilityNodeProvider);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void mo318c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2082a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: d */
    public void mo319d(View view, C1118a0 c1118a0) {
        this.f2082a.onInitializeAccessibilityNodeInfo(view, c1118a0.f3530a);
    }

    /* JADX INFO: renamed from: e */
    public void mo320e(View view, AccessibilityEvent accessibilityEvent) {
        this.f2082a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo321f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2082a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: g */
    public boolean mo322g(View view, int i, Bundle bundle) {
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
            C0902V c0902v = (C0902V) list.get(i2);
            if (c0902v.m1752a() == i) {
                Class cls = c0902v.f2812c;
                InterfaceC2123k0 interfaceC2123k0 = c0902v.f2813d;
                if (interfaceC2123k0 != null) {
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception unused) {
                        }
                    }
                    zPerformAccessibilityAction = interfaceC2123k0.perform(view, null);
                }
            } else {
                i2++;
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f2082a.performAccessibilityAction(view, i, bundle);
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

    /* JADX INFO: renamed from: h */
    public void mo323h(View view, int i) {
        this.f2082a.sendAccessibilityEvent(view, i);
    }

    /* JADX INFO: renamed from: i */
    public void mo324i(View view, AccessibilityEvent accessibilityEvent) {
        this.f2082a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0645P(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2082a = accessibilityDelegate;
        this.f2083b = new C0602O(this);
    }
}
