package p000a;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.C1066R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p000a.C0146I;
import p000a.C0866ug;
import p000a.InterfaceC0182K;

/* JADX INFO: renamed from: a.C */
/* JADX INFO: loaded from: classes.dex */
public class C0038C {

    /* JADX INFO: renamed from: c */
    public static final View.AccessibilityDelegate f136c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a */
    public final View.AccessibilityDelegate f137a;

    /* JADX INFO: renamed from: b */
    public final a f138b;

    /* JADX INFO: renamed from: a.C$a */
    public static final class a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a */
        public final C0038C f139a;

        public a(C0038C c0038c) {
            this.f139a = c0038c;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f139a.mo112a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0164J c0164jMo113b = this.f139a.mo113b(view);
            if (c0164jMo113b != null) {
                return c0164jMo113b.f586a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f139a.mo114c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Object tag;
            C0146I c0146i = new C0146I(accessibilityNodeInfo);
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            accessibilityNodeInfo.setScreenReaderFocusable(Boolean.valueOf(C0866ug.g.m2058d(view)).booleanValue());
            accessibilityNodeInfo.setHeading(Boolean.valueOf(C0866ug.g.m2057c(view)).booleanValue());
            accessibilityNodeInfo.setPaneTitle(C0866ug.g.m2056b(view));
            int i = C1066R.id.tag_state_description;
            if (Build.VERSION.SDK_INT >= 30) {
                tag = C0866ug.i.m2072b(view);
            } else {
                tag = view.getTag(i);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            CharSequence charSequence = (CharSequence) tag;
            if (Build.VERSION.SDK_INT >= 30) {
                C0146I.b.m387c(accessibilityNodeInfo, charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
            }
            this.f139a.mo115d(view, c0146i);
            accessibilityNodeInfo.getText();
            List list = (List) view.getTag(C1066R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            for (int i2 = 0; i2 < list.size(); i2++) {
                c0146i.m377b((C0146I.a) list.get(i2));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f139a.mo116e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f139a.mo117f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f139a.mo118g(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i) {
            this.f139a.mo119h(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f139a.mo120i(view, accessibilityEvent);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0038C() {
        this(f136c);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo112a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f137a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: b */
    public C0164J mo113b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f137a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0164J(accessibilityNodeProvider);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void mo114c(View view, AccessibilityEvent accessibilityEvent) {
        this.f137a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: d */
    public void mo115d(View view, C0146I c0146i) {
        this.f137a.onInitializeAccessibilityNodeInfo(view, c0146i.f505a);
    }

    /* JADX INFO: renamed from: e */
    public void mo116e(View view, AccessibilityEvent accessibilityEvent) {
        this.f137a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo117f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f137a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: g */
    public boolean mo118g(View view, int i, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(C1066R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            C0146I.a aVar = (C0146I.a) list.get(i2);
            if (aVar.m384a() == i) {
                InterfaceC0182K interfaceC0182K = aVar.f518d;
                if (interfaceC0182K != null) {
                    Class<? extends InterfaceC0182K.a> cls = aVar.f517c;
                    if (cls != null) {
                        try {
                            cls.getDeclaredConstructor(null).newInstance(null).getClass();
                        } catch (Exception e) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                        }
                    }
                    zPerformAccessibilityAction = interfaceC0182K.mo493a(view);
                }
            } else {
                i2++;
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f137a.performAccessibilityAction(view, i, bundle);
        }
        if (zPerformAccessibilityAction || i != C1066R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(C1066R.id.tag_accessibility_clickable_spans);
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
    public void mo119h(View view, int i) {
        this.f137a.sendAccessibilityEvent(view, i);
    }

    /* JADX INFO: renamed from: i */
    public void mo120i(View view, AccessibilityEvent accessibilityEvent) {
        this.f137a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0038C(View.AccessibilityDelegate accessibilityDelegate) {
        this.f137a = accessibilityDelegate;
        this.f138b = new a(this);
    }
}
