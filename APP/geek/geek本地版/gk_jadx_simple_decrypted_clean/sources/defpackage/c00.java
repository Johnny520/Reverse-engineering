package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c00 extends x {
    public final d00 d;
    public final WeakHashMap e;

    public c00(d00 r2) {
        this.e = new WeakHashMap();
        this.d = r2;
    }

    @Override // defpackage.x
    public final boolean a(View r2, AccessibilityEvent r3) {
        x r0 = (x) this.e.get(r2);
        if (r0 == null) goto L7;
        return r0.a(r2, r3);
    L7:
        return this.a.dispatchPopulateAccessibilityEvent(r2, r3);
    }

    @Override // defpackage.x
    public final l0 b(View r2) {
        x r0 = (x) this.e.get(r2);
        if (r0 == null) goto L7;
        return r0.b(r2);
    L7:
        return super.b(r2);
    }

    @Override // defpackage.x
    public final void c(View r2, AccessibilityEvent r3) {
        x r0 = (x) this.e.get(r2);
        if (r0 == null) goto L6;
        r0.c(r2, r3);
        return;
    L6:
        super.c(r2, r3);
    }

    @Override // defpackage.x
    public final void d(View r5, j0 r6) {
        AccessibilityNodeInfo r0 = r6.a;
        d00 r1 = this.d;
        RecyclerView r2 = r1.d;
        RecyclerView r12 = r1.d;
        boolean r22 = r2.K();
        View.AccessibilityDelegate r3 = this.a;
        if (r22 == false) goto L5;
    L12:
        r3.onInitializeAccessibilityNodeInfo(r5, r0);
        return;
    L5:
        if (r12.getLayoutManager() == null) goto L12;
        r12.getLayoutManager().T(r5, r6);
        x r13 = (x) this.e.get(r5);
        if (r13 == null) goto L10;
        r13.d(r5, r6);
        return;
    L10:
        r3.onInitializeAccessibilityNodeInfo(r5, r0);
    }

    @Override // defpackage.x
    public final void e(View r2, AccessibilityEvent r3) {
        x r0 = (x) this.e.get(r2);
        if (r0 == null) goto L6;
        r0.e(r2, r3);
        return;
    L6:
        super.e(r2, r3);
    }

    @Override // defpackage.x
    public final boolean f(ViewGroup r2, View r3, AccessibilityEvent r4) {
        x r0 = (x) this.e.get(r2);
        if (r0 == null) goto L7;
        return r0.f(r2, r3, r4);
    L7:
        return this.a.onRequestSendAccessibilityEvent(r2, r3, r4);
    }

    @Override // defpackage.x
    public final boolean g(View r3, int r4, Bundle r5) {
        d00 r0 = this.d;
        RecyclerView r1 = r0.d;
        RecyclerView r02 = r0.d;
        if (r1.K() == true) goto L18;
        if (r02.getLayoutManager() == null) goto L18;
        x r12 = (x) this.e.get(r3);
        if (r12 == null) goto L12;
        if (r12.g(r3, r4, r5) == true) goto L19;
    L15:
        tz r32 = r02.getLayoutManager().b.b;
        return false;
    L19:
        return true;
    L12:
        if (super.g(r3, r4, r5) == false) goto L15;
        return true;
    L18:
        return super.g(r3, r4, r5);
    }

    @Override // defpackage.x
    public final void h(View r2, int r3) {
        x r0 = (x) this.e.get(r2);
        if (r0 == null) goto L6;
        r0.h(r2, r3);
        return;
    L6:
        super.h(r2, r3);
    }

    @Override // defpackage.x
    public final void i(View r2, AccessibilityEvent r3) {
        x r0 = (x) this.e.get(r2);
        if (r0 == null) goto L6;
        r0.i(r2, r3);
        return;
    L6:
        super.i(r2, r3);
    }
}
