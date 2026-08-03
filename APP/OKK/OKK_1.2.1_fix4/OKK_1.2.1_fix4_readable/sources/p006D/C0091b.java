package p006D;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import org.luckypray.dexkit.C1031R;
import p008E.C0151e;
import p008E.C0156j;
import p008E.C0158l;
import p008E.InterfaceC0166t;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: D.b */
/* JADX INFO: loaded from: classes.dex */
public class C0091b {

    /* JADX INFO: renamed from: c */
    public static final View.AccessibilityDelegate f242c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a */
    public final View.AccessibilityDelegate f243a;

    /* JADX INFO: renamed from: b */
    public final C0089a f244b;

    public C0091b() {
        this(f242c);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo313a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f243a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: b */
    public C0158l mo314b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f243a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0158l(accessibilityNodeProvider);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void mo315c(View view, AccessibilityEvent accessibilityEvent) {
        this.f243a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: d */
    public void mo55d(View view, C0156j c0156j) {
        this.f243a.onInitializeAccessibilityNodeInfo(view, c0156j.f357a);
    }

    /* JADX INFO: renamed from: e */
    public void mo56e(View view, AccessibilityEvent accessibilityEvent) {
        this.f243a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo316f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f243a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: g */
    public boolean mo317g(View view, int i2, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List listEmptyList = (List) view.getTag(C1031R.id.tag_accessibility_actions);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        boolean z2 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= listEmptyList.size()) {
                break;
            }
            C0151e c0151e = (C0151e) listEmptyList.get(i3);
            if (c0151e.m477a() == i2) {
                InterfaceC0166t interfaceC0166t = c0151e.f355d;
                if (interfaceC0166t != null) {
                    Class cls = c0151e.f354c;
                    if (cls != null) {
                        try {
                            AbstractC0324d.m726i(cls.getDeclaredConstructor(null).newInstance(null));
                            throw null;
                        } catch (Exception unused) {
                        }
                    }
                    zPerformAccessibilityAction = interfaceC0166t.mo18j(view);
                }
            } else {
                i3++;
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f243a.performAccessibilityAction(view, i2, bundle);
        }
        if (zPerformAccessibilityAction || i2 != C1031R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i4 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(C1031R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i4)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i5 = 0;
            while (true) {
                if (clickableSpanArr == null || i5 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i5])) {
                    clickableSpan.onClick(view);
                    z2 = true;
                    break;
                }
                i5++;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: h */
    public void mo318h(View view, int i2) {
        this.f243a.sendAccessibilityEvent(view, i2);
    }

    /* JADX INFO: renamed from: i */
    public void mo319i(View view, AccessibilityEvent accessibilityEvent) {
        this.f243a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0091b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f243a = accessibilityDelegate;
        this.f244b = new C0089a(this);
    }
}
