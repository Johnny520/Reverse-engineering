package Yue;

import Yue.C3055;
import Yue.C6989;
import Yue.InterfaceC7144;
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

/* JADX INFO: renamed from: Yue.ۥۣ۟۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3024 {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    /* JADX INFO: renamed from: Yue.ۥۣ۟۟ۢ$ۥ */
    public static final class C0029 extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: ۥ */
        public final C3024 f40;

        public C0029(C3024 c3024) {
            this.f40 = c3024;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f40.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C3067 accessibilityNodeProvider = this.f40.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.m6163();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f40.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C3055 c3055M5950 = C3055.m5950(accessibilityNodeInfo);
            c3055M5950.m6096(C8273.m27409(view));
            c3055M5950.m6073(C8273.m27396(view));
            c3055M5950.m6088(C8273.m27337(view));
            c3055M5950.m6102(C8273.m27378(view));
            this.f40.onInitializeAccessibilityNodeInfo(view, c3055M5950);
            c3055M5950.m5955(accessibilityNodeInfo.getText(), view);
            List<C3055.C0034> actionList = C3024.getActionList(view);
            for (int i = 0; i < actionList.size(); i++) {
                c3055M5950.m119(actionList.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f40.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f40.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f40.performAccessibilityAction(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f40.sendAccessibilityEvent(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f40.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3024() {
        this(DEFAULT_DELEGATE);
    }

    public static List<C3055.C0034> getActionList(View view) {
        List<C3055.C0034> list = (List) view.getTag(C6989.C6992.f21064);
        return list == null ? Collections.emptyList() : list;
    }

    public boolean dispatchPopulateAccessibilityEvent(@InterfaceC6391 View view, @InterfaceC6391 AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @InterfaceC6490
    public C3067 getAccessibilityNodeProvider(@InterfaceC6391 View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.mOriginalDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C3067(accessibilityNodeProvider);
        }
        return null;
    }

    public View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(@InterfaceC6391 View view, @InterfaceC6391 AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(@InterfaceC6391 View view, @InterfaceC6391 C3055 c3055) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, c3055.m6116());
    }

    public void onPopulateAccessibilityEvent(@InterfaceC6391 View view, @InterfaceC6391 AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 View view, @InterfaceC6391 AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(@InterfaceC6391 View view, int i, @InterfaceC6490 Bundle bundle) {
        List<C3055.C0034> actionList = getActionList(view);
        boolean zPerformAccessibilityAction = false;
        int i2 = 0;
        while (true) {
            if (i2 >= actionList.size()) {
                break;
            }
            C3055.C0034 c0034 = actionList.get(i2);
            if (c0034.m121() == i) {
                zPerformAccessibilityAction = c0034.m6118(view, bundle);
                break;
            }
            i2++;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.mOriginalDelegate.performAccessibilityAction(view, i, bundle);
        }
        return (zPerformAccessibilityAction || i != C6989.C6992.f2613 || bundle == null) ? zPerformAccessibilityAction : m86(bundle.getInt(C3023.f4393, -1), view);
    }

    public void sendAccessibilityEvent(@InterfaceC6391 View view, int i) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(@InterfaceC6391 View view, @InterfaceC6391 AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: ۥ */
    public final boolean m85(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrM5945 = C3055.m5945(view.createAccessibilityNodeInfo().getText());
            for (int i = 0; clickableSpanArrM5945 != null && i < clickableSpanArrM5945.length; i++) {
                if (clickableSpan.equals(clickableSpanArrM5945[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m86(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C6989.C6992.f21065);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m85(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public C3024(@InterfaceC6391 View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new C0029(this);
    }
}
