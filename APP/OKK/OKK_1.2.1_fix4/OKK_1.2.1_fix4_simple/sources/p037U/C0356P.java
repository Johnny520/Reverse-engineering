package p037U;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import p006D.C0091b;
import p008E.C0156j;
import p008E.C0158l;

/* JADX INFO: renamed from: U.P */
/* JADX INFO: loaded from: classes.dex */
public final class C0356P extends C0091b {

    /* JADX INFO: renamed from: d */
    public final C0357Q f717d;

    /* JADX INFO: renamed from: e */
    public final WeakHashMap f718e;

    public C0356P(C0357Q r2) {
        this.f718e = new WeakHashMap();
        this.f717d = r2;
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: a */
    public final boolean mo313a(View r2, AccessibilityEvent r3) {
        C0091b r02 = (C0091b) this.f718e.get(r2);
        if (r02 == null) goto L7;
        return r02.mo313a(r2, r3);
    L7:
        return this.f243a.dispatchPopulateAccessibilityEvent(r2, r3);
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: b */
    public final C0158l mo314b(View r2) {
        C0091b r02 = (C0091b) this.f718e.get(r2);
        if (r02 == null) goto L7;
        return r02.mo314b(r2);
    L7:
        return super.mo314b(r2);
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: c */
    public final void mo315c(View r2, AccessibilityEvent r3) {
        C0091b r02 = (C0091b) this.f718e.get(r2);
        if (r02 == null) goto L5;
        r02.mo315c(r2, r3);
        return;
    L5:
        super.mo315c(r2, r3);
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: d */
    public final void mo55d(View r5, C0156j r6) {
        C0357Q r02 = this.f717d;
        boolean r1 = r02.f719d.m1330w();
        View.AccessibilityDelegate r2 = this.f243a;
        AccessibilityNodeInfo r3 = r6.f357a;
        if (r1 == true) goto L10;
        RecyclerView r03 = r02.f719d;
        if (r03.getLayoutManager() == null) goto L10;
        r03.getLayoutManager().m783O(r5, r6);
        C0091b r04 = (C0091b) this.f718e.get(r5);
        if (r04 == null) goto L9;
        r04.mo55d(r5, r6);
        return;
    L9:
        r2.onInitializeAccessibilityNodeInfo(r5, r3);
        return;
    L10:
        r2.onInitializeAccessibilityNodeInfo(r5, r3);
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: e */
    public final void mo56e(View r2, AccessibilityEvent r3) {
        C0091b r02 = (C0091b) this.f718e.get(r2);
        if (r02 == null) goto L5;
        r02.mo56e(r2, r3);
        return;
    L5:
        super.mo56e(r2, r3);
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: f */
    public final boolean mo316f(ViewGroup r2, View r3, AccessibilityEvent r4) {
        C0091b r02 = (C0091b) this.f718e.get(r2);
        if (r02 == null) goto L7;
        return r02.mo316f(r2, r3, r4);
    L7:
        return this.f243a.onRequestSendAccessibilityEvent(r2, r3, r4);
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: g */
    public final boolean mo317g(View r4, int r5, Bundle r6) {
        C0357Q r02 = this.f717d;
        if (r02.f719d.m1330w() == true) goto L17;
        RecyclerView r03 = r02.f719d;
        if (r03.getLayoutManager() == null) goto L17;
        C0091b r1 = (C0091b) this.f718e.get(r4);
        if (r1 == null) goto L12;
        if (r1.mo317g(r4, r5, r6) == false) goto L14;
        return true;
    L14:
        C0349I r42 = r03.getLayoutManager().f668b.f1562a;
        return false;
    L12:
        if (super.mo317g(r4, r5, r6) == false) goto L14;
        return true;
    L17:
        return super.mo317g(r4, r5, r6);
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: h */
    public final void mo318h(View r2, int r3) {
        C0091b r02 = (C0091b) this.f718e.get(r2);
        if (r02 == null) goto L5;
        r02.mo318h(r2, r3);
        return;
    L5:
        super.mo318h(r2, r3);
    }

    @Override // p006D.C0091b
    /* JADX INFO: renamed from: i */
    public final void mo319i(View r2, AccessibilityEvent r3) {
        C0091b r02 = (C0091b) this.f718e.get(r2);
        if (r02 == null) goto L5;
        r02.mo319i(r2, r3);
        return;
    L5:
        super.mo319i(r2, r3);
    }
}
