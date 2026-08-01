package p000;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.ljx.wechatmod.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: x */
/* JADX INFO: loaded from: classes.dex */
public class C0875x {

    /* JADX INFO: renamed from: c */
    public static final View.AccessibilityDelegate f5075c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a */
    public final View.AccessibilityDelegate f5076a;

    /* JADX INFO: renamed from: b */
    public final C0801v f5077b;

    public C0875x() {
        this(f5075c);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo615a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f5076a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: b */
    public C0431l0 mo616b(View view) {
        AccessibilityNodeProvider accessibilityNodeProviderM2531a = AbstractC0838w.m2531a(this.f5076a, view);
        if (accessibilityNodeProviderM2531a != null) {
            return new C0431l0(0, accessibilityNodeProviderM2531a);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void mo65c(View view, AccessibilityEvent accessibilityEvent) {
        this.f5076a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: d */
    public void mo66d(View view, C0357j0 c0357j0) {
        this.f5076a.onInitializeAccessibilityNodeInfo(view, c0357j0.f2513a);
    }

    /* JADX INFO: renamed from: e */
    public void mo617e(View view, AccessibilityEvent accessibilityEvent) {
        this.f5076a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo618f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f5076a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: g */
    public boolean mo619g(View view, int i, Bundle bundle) {
        boolean zM2532b;
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
            C0281h0 c0281h0 = (C0281h0) list.get(i2);
            if (c0281h0.m1335a() == i) {
                Class cls = c0281h0.f2190c;
                InterfaceC0802v0 interfaceC0802v0 = c0281h0.f2191d;
                if (interfaceC0802v0 != null) {
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
                    zM2532b = interfaceC0802v0.mo1134c(view);
                }
            } else {
                i2++;
            }
        }
        zM2532b = false;
        if (!zM2532b) {
            zM2532b = AbstractC0838w.m2532b(this.f5076a, view, i, bundle);
        }
        if (zM2532b || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return zM2532b;
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
    public void mo620h(View view, int i) {
        this.f5076a.sendAccessibilityEvent(view, i);
    }

    /* JADX INFO: renamed from: i */
    public void mo621i(View view, AccessibilityEvent accessibilityEvent) {
        this.f5076a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0875x(View.AccessibilityDelegate accessibilityDelegate) {
        this.f5076a = accessibilityDelegate;
        this.f5077b = new C0801v(this);
    }
}
