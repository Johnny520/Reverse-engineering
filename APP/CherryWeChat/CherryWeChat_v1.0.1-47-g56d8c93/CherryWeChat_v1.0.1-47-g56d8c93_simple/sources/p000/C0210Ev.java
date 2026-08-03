package p000;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: Ev */
/* JADX INFO: loaded from: classes.dex */
public final class C0210Ev extends C0645P {

    /* JADX INFO: renamed from: d */
    public final RecyclerView f616d;

    /* JADX INFO: renamed from: e */
    public final C0167Dv f617e;

    public C0210Ev(RecyclerView r1) {
        this.f616d = r1;
        C0167Dv r12 = this.f617e;
        if (r12 == null) goto L6;
        this.f617e = r12;
        return;
    L6:
        this.f617e = new C0167Dv(this);
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: c */
    public final void mo318c(View r2, AccessibilityEvent r3) {
        super.mo318c(r2, r3);
        if ((r2 instanceof RecyclerView) == true) goto L5;
        return;
    L5:
        if (this.f616d.hasPendingAdapterUpdates() == true) goto L11;
        RecyclerView r22 = (RecyclerView) r2;
        if (r22.getLayoutManager() == null) goto L12;
        r22.getLayoutManager().onInitializeAccessibilityEvent(r3);
        return;
    L12:
        return;
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: d */
    public final void mo319d(View r3, C1118a0 r4) {
        this.f2082a.onInitializeAccessibilityNodeInfo(r3, r4.f3530a);
        RecyclerView r32 = this.f616d;
        if (r32.hasPendingAdapterUpdates() == false) goto L5;
        return;
    L5:
        if (r32.getLayoutManager() == null) goto L9;
        r32.getLayoutManager().onInitializeAccessibilityNodeInfo(r4);
        return;
    }

    @Override // p000.C0645P
    /* JADX INFO: renamed from: g */
    public final boolean mo322g(View r2, int r3, Bundle r4) {
        if (super.mo322g(r2, r3, r4) == false) goto L6;
        return true;
    L6:
        RecyclerView r22 = this.f616d;
        if (r22.hasPendingAdapterUpdates() == false) goto L9;
        return false;
    L9:
        if (r22.getLayoutManager() != null) goto L11;
        return false;
    L11:
        return r22.getLayoutManager().performAccessibilityAction(r3, r4);
    }
}
