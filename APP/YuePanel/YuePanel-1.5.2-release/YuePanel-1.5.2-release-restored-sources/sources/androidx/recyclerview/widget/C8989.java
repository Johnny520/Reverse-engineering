package androidx.recyclerview.widget;

import Yue.C3024;
import Yue.C3055;
import Yue.C3067;
import Yue.C8273;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8989 extends C3024 {
    private final C1783 mItemDelegate;
    final RecyclerView mRecyclerView;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۠ۢ$ۥ */
    public static class C1783 extends C3024 {

        /* JADX INFO: renamed from: ۥ */
        public final C8989 f3986;

        /* JADX INFO: renamed from: ۥ۟ */
        public Map<View, C3024> f3987 = new WeakHashMap();

        public C1783(@InterfaceC6391 C8989 c8989) {
            this.f3986 = c8989;
        }

        @Override // Yue.C3024
        public boolean dispatchPopulateAccessibilityEvent(@InterfaceC6391 View view, @InterfaceC6391 AccessibilityEvent accessibilityEvent) {
            C3024 c3024 = this.f3987.get(view);
            return c3024 != null ? c3024.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // Yue.C3024
        @InterfaceC6490
        public C3067 getAccessibilityNodeProvider(@InterfaceC6391 View view) {
            C3024 c3024 = this.f3987.get(view);
            return c3024 != null ? c3024.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        @Override // Yue.C3024
        public void onInitializeAccessibilityEvent(@InterfaceC6391 View view, @InterfaceC6391 AccessibilityEvent accessibilityEvent) {
            C3024 c3024 = this.f3987.get(view);
            if (c3024 != null) {
                c3024.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // Yue.C3024
        public void onInitializeAccessibilityNodeInfo(View view, C3055 c3055) {
            if (this.f3986.shouldIgnore() || this.f3986.mRecyclerView.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, c3055);
                return;
            }
            this.f3986.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, c3055);
            C3024 c3024 = this.f3987.get(view);
            if (c3024 != null) {
                c3024.onInitializeAccessibilityNodeInfo(view, c3055);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, c3055);
            }
        }

        @Override // Yue.C3024
        public void onPopulateAccessibilityEvent(@InterfaceC6391 View view, @InterfaceC6391 AccessibilityEvent accessibilityEvent) {
            C3024 c3024 = this.f3987.get(view);
            if (c3024 != null) {
                c3024.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // Yue.C3024
        public boolean onRequestSendAccessibilityEvent(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 View view, @InterfaceC6391 AccessibilityEvent accessibilityEvent) {
            C3024 c3024 = this.f3987.get(viewGroup);
            return c3024 != null ? c3024.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // Yue.C3024
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (this.f3986.shouldIgnore() || this.f3986.mRecyclerView.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            C3024 c3024 = this.f3987.get(view);
            if (c3024 != null) {
                if (c3024.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            return this.f3986.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        }

        @Override // Yue.C3024
        public void sendAccessibilityEvent(@InterfaceC6391 View view, int i) {
            C3024 c3024 = this.f3987.get(view);
            if (c3024 != null) {
                c3024.sendAccessibilityEvent(view, i);
            } else {
                super.sendAccessibilityEvent(view, i);
            }
        }

        @Override // Yue.C3024
        public void sendAccessibilityEventUnchecked(@InterfaceC6391 View view, @InterfaceC6391 AccessibilityEvent accessibilityEvent) {
            C3024 c3024 = this.f3987.get(view);
            if (c3024 != null) {
                c3024.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C3024 m30723(View view) {
            return this.f3987.remove(view);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m30724(View view) {
            C3024 c3024M27332 = C8273.m27332(view);
            if (c3024M27332 == null || c3024M27332 == this) {
                return;
            }
            this.f3987.put(view, c3024M27332);
        }
    }

    public C8989(@InterfaceC6391 RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
        C3024 itemDelegate = getItemDelegate();
        if (itemDelegate == null || !(itemDelegate instanceof C1783)) {
            this.mItemDelegate = new C1783(this);
        } else {
            this.mItemDelegate = (C1783) itemDelegate;
        }
    }

    @InterfaceC6391
    public C3024 getItemDelegate() {
        return this.mItemDelegate;
    }

    @Override // Yue.C3024
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || shouldIgnore()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // Yue.C3024
    public void onInitializeAccessibilityNodeInfo(View view, C3055 c3055) {
        super.onInitializeAccessibilityNodeInfo(view, c3055);
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return;
        }
        this.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(c3055);
    }

    @Override // Yue.C3024
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return false;
        }
        return this.mRecyclerView.getLayoutManager().performAccessibilityAction(i, bundle);
    }

    public boolean shouldIgnore() {
        return this.mRecyclerView.hasPendingAdapterUpdates();
    }
}
