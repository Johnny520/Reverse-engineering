package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final a0 a;

    public b0(a0 r1) {
        this.a = r1;
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof b0) == true) goto L10;
        return false;
    L10:
        return this.a.equals(((b0) r2).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean r3) {
        ph r0 = (ph) ((oh) this.a).a;
        AutoCompleteTextView r1 = r0.h;
        if (r1 != null) goto L5;
        return;
    L5:
        if (r1.getInputType() == 0) goto L7;
        return;
    L7:
        CheckableImageButton r02 = r0.d;
        if (r3 == false) goto L10;
        int r32 = 2;
    L11:
        WeakHashMap r12 = ja0.a;
        s90.s(r02, r32);
        return;
    L10:
        r32 = 1;
        goto L11
    }
}
