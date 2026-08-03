package p021L;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.lang.reflect.Field;
import p006D.AbstractC0080Q;
import p008E.C0156j;
import p008E.C0158l;
import p074o0.C1028d;

/* JADX INFO: renamed from: L.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0241a extends C0158l {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0242b f483c;

    public C0241a(AbstractC0242b r1) {
        this.f483c = r1;
        super(0);
    }

    @Override // p008E.C0158l
    /* JADX INFO: renamed from: a */
    public final C0156j mo512a(int r2) {
        return new C0156j(AccessibilityNodeInfo.obtain(this.f483c.m665n(r2).f357a));
    }

    @Override // p008E.C0158l
    /* JADX INFO: renamed from: b */
    public final C0156j mo513b(int r3) {
        AbstractC0242b r1 = this.f483c;
        if (r3 != 2) goto L5;
        int r32 = r1.f494k;
    L7:
        if (r32 != Integer.MIN_VALUE) goto L11;
        return null;
    L11:
        return mo512a(r32);
    L5:
        r32 = r1.f495l;
        goto L7
    }

    @Override // p008E.C0158l
    /* JADX INFO: renamed from: c */
    public final boolean mo514c(int r7, int r8, Bundle r9) {
        AbstractC0242b r02 = this.f483c;
        View r1 = r02.f492i;
        if (r7 == (-1)) goto L41;
        boolean r92 = true;
        if (r8 == 1) goto L50;
        if (r8 == 2) goto L49;
        boolean r5 = false;
        if (r8 != 64) goto L11;
        AccessibilityManager r82 = r02.f491h;
        if (r82.isEnabled() == true) goto L32;
    L27:
        r92 = false;
    L48:
        return r92;
    L32:
        if (r82.isTouchExplorationEnabled() == false) goto L27;
        int r83 = r02.f494k;
        if (r83 == r7) goto L27;
        if (r83 == Integer.MIN_VALUE) goto L38;
        r02.f494k = Integer.MIN_VALUE;
        r02.f492i.invalidate();
        r02.m668q(r83, 65536);
    L38:
        r02.f494k = r7;
        r1.invalidate();
        r02.m668q(r7, 32768);
        goto L48
    L11:
        if (r8 == 128) goto L25;
        C1028d r03 = (C1028d) r02;
        if (r8 != 16) goto L43;
        Chip r84 = r03.f3776q;
        if (r7 == 0) goto L44;
        if (r7 != 1) goto L45;
        r84.playSoundEffect(0);
        View.OnClickListener r72 = r84.f2373h;
        if (r72 == null) goto L22;
        r72.onClick(r84);
        r5 = true;
    L22:
        if (r84.f2384s == false) goto L46;
        r84.f2383r.m668q(1, 1);
        return r5;
    L46:
        return r5;
    L45:
        return false;
    L44:
        return r84.performClick();
    L43:
        return false;
    L25:
        if (r02.f494k != r7) goto L27;
        r02.f494k = Integer.MIN_VALUE;
        r1.invalidate();
        r02.m668q(r7, 65536);
        goto L48
    L49:
        return r02.m661j(r7);
    L50:
        return r02.m667p(r7);
    L41:
        Field r73 = AbstractC0080Q.f219a;
        return r1.performAccessibilityAction(r8, r9);
    }
}
