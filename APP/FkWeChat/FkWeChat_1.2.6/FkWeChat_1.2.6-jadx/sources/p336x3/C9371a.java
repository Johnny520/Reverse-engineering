package p336x3;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p206o3.AbstractC5632b;
import p352y3.C9561t;
import p352y3.C9562u;

/* JADX INFO: renamed from: x3.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C9371a {

    /* JADX INFO: renamed from: s */
    public static final View.AccessibilityDelegate f31956s = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: q */
    public final View.AccessibilityDelegate f31957q;

    /* JADX INFO: renamed from: r */
    public final View.AccessibilityDelegate f31958r;

    /* JADX INFO: renamed from: x3.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a */
        public final C9371a f31959a;

        public a(C9371a c9371a) {
            this.f31959a = c9371a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f31959a.m36481a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C9562u c9562uMo19781b = this.f31959a.mo19781b(view);
            if (c9562uMo19781b != null) {
                return (AccessibilityNodeProvider) c9562uMo19781b.m37476e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f31959a.m36484f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C9561t c9561tM37367O0 = C9561t.m37367O0(accessibilityNodeInfo);
            c9561tM37367O0.m37372A0(AbstractC9428u.m36660j(view));
            c9561tM37367O0.m37435n0(AbstractC9428u.m36659i(view));
            c9561tM37367O0.m37449u0(AbstractC9428u.m36656f(view));
            c9561tM37367O0.m37380E0(AbstractC9428u.m36658h(view));
            this.f31959a.mo19641g(view, c9561tM37367O0);
            c9561tM37367O0.m37418e(accessibilityNodeInfo.getText(), view);
            List listM36480c = C9371a.m36480c(view);
            for (int i10 = 0; i10 < listM36480c.size(); i10++) {
                c9561tM37367O0.m37412b((C9561t.a) listM36480c.get(i10));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f31959a.m36485h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f31959a.m36486i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f31959a.m36487j(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i10) {
            this.f31959a.m36489l(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f31959a.m36490m(view, accessibilityEvent);
        }
    }

    public C9371a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f31957q = accessibilityDelegate;
        this.f31958r = new a(this);
    }

    /* JADX INFO: renamed from: c */
    public static List m36480c(View view) {
        List list = (List) view.getTag(AbstractC5632b.f17649H);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    /* JADX INFO: renamed from: a */
    public boolean m36481a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f31957q.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: b */
    public C9562u mo19781b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f31957q.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C9562u(accessibilityNodeProvider);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public View.AccessibilityDelegate m36482d() {
        return this.f31958r;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m36483e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrM37370n = C9561t.m37370n(view.createAccessibilityNodeInfo().getText());
            for (int i10 = 0; clickableSpanArrM37370n != null && i10 < clickableSpanArrM37370n.length; i10++) {
                if (clickableSpan.equals(clickableSpanArrM37370n[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m36484f(View view, AccessibilityEvent accessibilityEvent) {
        this.f31957q.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: g */
    public void mo19641g(View view, C9561t c9561t) {
        this.f31957q.onInitializeAccessibilityNodeInfo(view, c9561t.m37398N0());
    }

    /* JADX INFO: renamed from: h */
    public void m36485h(View view, AccessibilityEvent accessibilityEvent) {
        this.f31957q.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: i */
    public boolean m36486i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f31957q.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: j */
    public boolean m36487j(View view, int i10, Bundle bundle) {
        List listM36480c = m36480c(view);
        boolean zPerformAccessibilityAction = false;
        int i11 = 0;
        while (true) {
            if (i11 >= listM36480c.size()) {
                break;
            }
            C9561t.a aVar = (C9561t.a) listM36480c.get(i11);
            if (aVar.m37460a() == i10) {
                zPerformAccessibilityAction = aVar.m37462c(view, bundle);
                break;
            }
            i11++;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f31957q.performAccessibilityAction(view, i10, bundle);
        }
        return (zPerformAccessibilityAction || i10 != AbstractC5632b.f17660a || bundle == null) ? zPerformAccessibilityAction : m36488k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m36488k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(AbstractC5632b.f17650I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m36483e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public void m36489l(View view, int i10) {
        this.f31957q.sendAccessibilityEvent(view, i10);
    }

    /* JADX INFO: renamed from: m */
    public void m36490m(View view, AccessibilityEvent accessibilityEvent) {
        this.f31957q.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C9371a() {
        this(f31956s);
    }
}
