package p000;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Dv */
/* JADX INFO: loaded from: classes.dex */
public final class C0167Dv extends C0645P {

    /* JADX INFO: renamed from: d */
    public final C0210Ev f448d;

    /* JADX INFO: renamed from: e */
    public final WeakHashMap f449e;

    public C0167Dv(C0210Ev r2) {
        this.f449e = new WeakHashMap();
        this.f448d = r2;
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: a */
    public final boolean mo316a(View r2, AccessibilityEvent r3) {
        C0645P r0 = (C0645P) this.f449e.get(r2);
        if (r0 == null) goto L7;
        return r0.mo316a(r2, r3);
    L7:
        return this.f2082a.dispatchPopulateAccessibilityEvent(r2, r3);
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: b */
    public final C0132D2 mo317b(View r2) {
        C0645P r0 = (C0645P) this.f449e.get(r2);
        if (r0 == null) goto L7;
        return r0.mo317b(r2);
    L7:
        return super.mo317b(r2);
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: c */
    public final void mo318c(View r2, AccessibilityEvent r3) {
        C0645P r0 = (C0645P) this.f449e.get(r2);
        if (r0 == null) goto L6;
        r0.mo318c(r2, r3);
        return;
    L6:
        super.mo318c(r2, r3);
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: d */
    public final void mo319d(View r5, C1118a0 r6) {
        AccessibilityNodeInfo r0 = r6.f3530a;
        C0210Ev r1 = this.f448d;
        RecyclerView r2 = r1.f616d;
        RecyclerView r12 = r1.f616d;
        boolean r22 = r2.hasPendingAdapterUpdates();
        View.AccessibilityDelegate r3 = this.f2082a;
        if (r22 == false) goto L5;
    L12:
        r3.onInitializeAccessibilityNodeInfo(r5, r0);
        return;
    L5:
        if (r12.getLayoutManager() == null) goto L12;
        r12.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(r5, r6);
        C0645P r13 = (C0645P) this.f449e.get(r5);
        if (r13 == null) goto L10;
        r13.mo319d(r5, r6);
        return;
    L10:
        r3.onInitializeAccessibilityNodeInfo(r5, r0);
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: e */
    public final void mo320e(View r2, AccessibilityEvent r3) {
        C0645P r0 = (C0645P) this.f449e.get(r2);
        if (r0 == null) goto L6;
        r0.mo320e(r2, r3);
        return;
    L6:
        super.mo320e(r2, r3);
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: f */
    public final boolean mo321f(ViewGroup r2, View r3, AccessibilityEvent r4) {
        C0645P r0 = (C0645P) this.f449e.get(r2);
        if (r0 == null) goto L7;
        return r0.mo321f(r2, r3, r4);
    L7:
        return this.f2082a.onRequestSendAccessibilityEvent(r2, r3, r4);
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: g */
    public final boolean mo322g(View r3, int r4, Bundle r5) {
        C0210Ev r0 = this.f448d;
        RecyclerView r1 = r0.f616d;
        RecyclerView r02 = r0.f616d;
        if (r1.hasPendingAdapterUpdates() == true) goto L18;
        if (r02.getLayoutManager() == null) goto L18;
        C0645P r12 = (C0645P) this.f449e.get(r3);
        if (r12 == null) goto L12;
        if (r12.mo322g(r3, r4, r5) == false) goto L16;
        return true;
    L16:
        return r02.getLayoutManager().performAccessibilityActionForItem(r3, r4, r5);
    L12:
        if (super.mo322g(r3, r4, r5) == false) goto L16;
        return true;
    L18:
        return super.mo322g(r3, r4, r5);
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: h */
    public final void mo323h(View r2, int r3) {
        C0645P r0 = (C0645P) this.f449e.get(r2);
        if (r0 == null) goto L6;
        r0.mo323h(r2, r3);
        return;
    L6:
        super.mo323h(r2, r3);
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: i */
    public final void mo324i(View r2, AccessibilityEvent r3) {
        C0645P r0 = (C0645P) this.f449e.get(r2);
        if (r0 == null) goto L6;
        r0.mo324i(r2, r3);
        return;
    L6:
        super.mo324i(r2, r3);
    }
}
