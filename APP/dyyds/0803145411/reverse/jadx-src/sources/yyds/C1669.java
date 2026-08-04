package yyds;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛷᲇᲀᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1669 extends C2060 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final WeakHashMap f8521 = new WeakHashMap();

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1566 f8522;

    public C1669(C1566 c1566) {
        this.f8522 = c1566;
    }

    @Override // yyds.C2060
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void mo3410(View view, int i) {
        C2060 c2060 = (C2060) this.f8521.get(view);
        if (c2060 != null) {
            c2060.mo3410(view, i);
        } else {
            super.mo3410(view, i);
        }
    }

    @Override // yyds.C2060
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void mo3411(View view, AccessibilityEvent accessibilityEvent) {
        C2060 c2060 = (C2060) this.f8521.get(view);
        if (c2060 != null) {
            c2060.mo3411(view, accessibilityEvent);
        } else {
            super.mo3411(view, accessibilityEvent);
        }
    }

    @Override // yyds.C2060
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void mo3412(View view, AccessibilityEvent accessibilityEvent) {
        C2060 c2060 = (C2060) this.f8521.get(view);
        if (c2060 != null) {
            c2060.mo3412(view, accessibilityEvent);
        } else {
            super.mo3412(view, accessibilityEvent);
        }
    }

    @Override // yyds.C2060
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean mo3413(View view, AccessibilityEvent accessibilityEvent) {
        C2060 c2060 = (C2060) this.f8521.get(view);
        return c2060 != null ? c2060.mo3413(view, accessibilityEvent) : this.f10201.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // yyds.C2060
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C0052 mo3414(View view) {
        C2060 c2060 = (C2060) this.f8521.get(view);
        return c2060 != null ? c2060.mo3414(view) : super.mo3414(view);
    }

    @Override // yyds.C2060
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final boolean mo1341(View view, int i, Bundle bundle) {
        C1566 c1566 = this.f8522;
        C1213 c1213 = c1566.f7962;
        C1213 c12132 = c1566.f7962;
        if (c1213.m2429() || c12132.getLayoutManager() == null) {
            return super.mo1341(view, i, bundle);
        }
        C2060 c2060 = (C2060) this.f8521.get(view);
        if (c2060 != null) {
            if (c2060.mo1341(view, i, bundle)) {
                return true;
            }
        } else if (super.mo1341(view, i, bundle)) {
            return true;
        }
        C2808 c2808 = c12132.getLayoutManager().f12600.f5529;
        return false;
    }

    @Override // yyds.C2060
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo1342(View view, AccessibilityEvent accessibilityEvent) {
        C2060 c2060 = (C2060) this.f8521.get(view);
        if (c2060 != null) {
            c2060.mo1342(view, accessibilityEvent);
        } else {
            super.mo1342(view, accessibilityEvent);
        }
    }

    @Override // yyds.C2060
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final boolean mo3415(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C2060 c2060 = (C2060) this.f8521.get(viewGroup);
        return c2060 != null ? c2060.mo3415(viewGroup, view, accessibilityEvent) : this.f10201.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // yyds.C2060
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo1343(View view, C0134 c0134) {
        AccessibilityNodeInfo accessibilityNodeInfo = c0134.f833;
        C1566 c1566 = this.f8522;
        C1213 c1213 = c1566.f7962;
        C1213 c12132 = c1566.f7962;
        boolean zM2429 = c1213.m2429();
        View.AccessibilityDelegate accessibilityDelegate = this.f10201;
        if (zM2429 || c12132.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        c12132.getLayoutManager().m4610(view, c0134);
        C2060 c2060 = (C2060) this.f8521.get(view);
        if (c2060 != null) {
            c2060.mo1343(view, c0134);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }
}
