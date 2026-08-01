package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class mj extends l0 {
    public final /* synthetic */ ia c;

    public mj(ia r1) {
        this.c = r1;
        super(0);
    }

    @Override // defpackage.l0
    public final j0 t(int r2) {
        return new j0(AccessibilityNodeInfo.obtain(this.c.n(r2).a));
    }

    @Override // defpackage.l0
    public final j0 u(int r3) {
        ia r1 = this.c;
        if (r3 != 2) goto L5;
        int r32 = r1.k;
    L7:
        if (r32 != Integer.MIN_VALUE) goto L11;
        return null;
    L11:
        return t(r32);
    L5:
        r32 = r1.l;
        goto L7
    }

    @Override // defpackage.l0
    public final boolean w(int r7, int r8, Bundle r9) {
        ia r0 = this.c;
        Chip r1 = r0.i;
        if (r7 != (-1)) goto L5;
        WeakHashMap r72 = ja0.a;
        return s90.j(r1, r8, r9);
    L5:
        if (r8 == 1) goto L45;
        if (r8 == 2) goto L43;
        boolean r5 = false;
        if (r8 != 64) goto L11;
        AccessibilityManager r82 = r0.h;
        if (r82.isEnabled() == true) goto L33;
    L41:
        return false;
    L33:
        if (r82.isTouchExplorationEnabled() == false) goto L41;
        int r83 = r0.k;
        if (r83 == r7) goto L41;
        if (r83 == Integer.MIN_VALUE) goto L39;
        r0.k = Integer.MIN_VALUE;
        r1.invalidate();
        r0.p(r83, 65536);
    L39:
        r0.k = r7;
        r1.invalidate();
        r0.p(r7, 32768);
        return true;
    L11:
        if (r8 == 128) goto L26;
        Chip r02 = r0.n;
        if (r8 != 16) goto L24;
        if (r7 == 0) goto L16;
        if (r7 != 1) goto L24;
        r02.playSoundEffect(0);
        View.OnClickListener r73 = r02.h;
        if (r73 == null) goto L22;
        r73.onClick(r02);
        r5 = true;
    L22:
        if (r02.s == false) goto L24;
        r02.r.p(1, 1);
        goto L24
    L16:
        return r02.performClick();
    L24:
        return r5;
    L26:
        if (r0.k != r7) goto L29;
        r0.k = Integer.MIN_VALUE;
        r1.invalidate();
        r0.p(r7, 65536);
        return true;
    L29:
        return false;
    L43:
        return r0.j(r7);
    L45:
        return r0.o(r7);
    }
}
