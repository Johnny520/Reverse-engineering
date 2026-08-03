package p000;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Qg */
/* JADX INFO: loaded from: classes.dex */
public final class C0711Qg extends C0132D2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2223m9 f2285e;

    public C0711Qg(C2223m9 r1) {
        this.f2285e = r1;
        super(2);
    }

    @Override // p000.C0132D2
    /* JADX INFO: renamed from: u */
    public final C1118a0 mo246u(int r2) {
        return new C1118a0(AccessibilityNodeInfo.obtain(this.f2285e.m4478n(r2).f3530a));
    }

    @Override // p000.C0132D2
    /* JADX INFO: renamed from: v */
    public final C1118a0 mo247v(int r3) {
        C2223m9 r1 = this.f2285e;
        if (r3 != 2) goto L5;
        int r32 = r1.f7732k;
    L7:
        if (r32 != Integer.MIN_VALUE) goto L11;
        return null;
    L11:
        return mo246u(r32);
    L5:
        r32 = r1.f7733l;
        goto L7
    }

    @Override // p000.C0132D2
    /* JADX INFO: renamed from: x */
    public final boolean mo249x(int r7, int r8, Bundle r9) {
        C2223m9 r0 = this.f2285e;
        Chip r1 = r0.f7730i;
        if (r7 != (-1)) goto L5;
        WeakHashMap r72 = AbstractC2185lE.f7617a;
        return r1.performAccessibilityAction(r8, r9);
    L5:
        if (r8 == 1) goto L45;
        if (r8 == 2) goto L43;
        boolean r5 = false;
        if (r8 != 64) goto L11;
        AccessibilityManager r82 = r0.f7729h;
        if (r82.isEnabled() == true) goto L33;
    L41:
        return false;
    L33:
        if (r82.isTouchExplorationEnabled() == false) goto L41;
        int r83 = r0.f7732k;
        if (r83 == r7) goto L41;
        if (r83 == Integer.MIN_VALUE) goto L39;
        r0.f7732k = Integer.MIN_VALUE;
        r1.invalidate();
        r0.m4481q(r83, 65536);
    L39:
        r0.f7732k = r7;
        r1.invalidate();
        r0.m4481q(r7, 32768);
        return true;
    L11:
        if (r8 == 128) goto L26;
        Chip r02 = r0.f7735n;
        if (r8 != 16) goto L24;
        if (r7 == 0) goto L16;
        if (r7 != 1) goto L24;
        r02.playSoundEffect(0);
        View.OnClickListener r73 = r02.f4514h;
        if (r73 == null) goto L22;
        r73.onClick(r02);
        r5 = true;
    L22:
        if (r02.f4525s == false) goto L24;
        r02.f4524r.m4481q(1, 1);
        goto L24
    L16:
        return r02.performClick();
    L24:
        return r5;
    L26:
        if (r0.f7732k != r7) goto L29;
        r0.f7732k = Integer.MIN_VALUE;
        r1.invalidate();
        r0.m4481q(r7, 65536);
        return true;
    L29:
        return false;
    L43:
        return r0.m4474j(r7);
    L45:
        return r0.m4480p(r7);
    }
}
