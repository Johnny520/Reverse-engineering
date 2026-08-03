package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: az */
/* JADX INFO: loaded from: classes.dex */
public final class C1196az {

    /* JADX INFO: renamed from: a */
    public int f4104a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1006Xb f4105b;

    /* JADX INFO: renamed from: c */
    public int[][] f4106c;

    /* JADX INFO: renamed from: d */
    public InterfaceC1006Xb[] f4107d;

    public C1196az() {
        this.f4106c = new int[10][];
        this.f4107d = new InterfaceC1006Xb[10];
    }

    /* JADX INFO: renamed from: b */
    public static C1196az m2313b(InterfaceC1006Xb r2) {
        C1196az r0 = new C1196az();
        r0.m2314a(StateSet.WILD_CARD, r2);
        return r0;
    }

    /* JADX INFO: renamed from: a */
    public final void m2314a(int[] r6, InterfaceC1006Xb r7) {
        int r0 = this.f4104a;
        if (r0 != 0) goto L5;
    L6:
        this.f4105b = r7;
    L7:
        int[][] r1 = this.f4106c;
        if (r0 < r1.length) goto L10;
        int r2 = r0 + 10;
        int[][] r3 = new int[r2][];
        System.arraycopy(r1, 0, r3, 0, r0);
        this.f4106c = r3;
        InterfaceC1006Xb[] r12 = new InterfaceC1006Xb[r2];
        System.arraycopy(this.f4107d, 0, r12, 0, r0);
        this.f4107d = r12;
    L10:
        int[][] r02 = this.f4106c;
        int r13 = this.f4104a;
        r02[r13] = r6;
        this.f4107d[r13] = r7;
        this.f4104a = r13 + 1;
        return;
    L5:
        if (r6.length != 0) goto L7;
        goto L6
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC1006Xb m2315c(int[] r6) {
        int[][] r0 = this.f4106c;
        int r1 = 0;
        int r2 = 0;
    L3:
        int r4 = -1;
        if (r2 >= this.f4104a) goto L9;
        if (StateSet.stateSetMatches(r0[r2], r6) == true) goto L10;
        r2 = r2 + 1;
    L10:
        if (r2 >= 0) goto L19;
        int[] r62 = StateSet.WILD_CARD;
        int[][] r02 = this.f4106c;
    L13:
        if (r1 >= this.f4104a) goto L18;
        if (StateSet.stateSetMatches(r02[r1], r62) == true) goto L16;
        r1 = r1 + 1;
        goto L13
    L16:
        r4 = r1;
    L18:
        r2 = r4;
    L19:
        if (r2 >= 0) goto L23;
        return this.f4105b;
    L23:
        return this.f4107d[r2];
    L9:
        r2 = -1;
        goto L10
    }

    /* JADX INFO: renamed from: d */
    public final void m2316d(Context r12, XmlResourceParser r13, AttributeSet r14, Resources.Theme r15) {
        int r0 = r13.getDepth() + 1;
    L3:
        int r2 = r13.next();
        if (r2 == 1) goto L30;
        int r3 = r13.getDepth();
        if (r3 >= r0) goto L10;
        if (r2 != 3) goto L10;
        return;
    L10:
        if (r2 != 2) goto L3;
        if (r3 > r0) goto L3;
        if (r13.getName().equals("item") == false) goto L3;
        Resources r22 = r12.getResources();
        int[] r32 = AbstractC0939Vu.f2956y;
        if (r15 != null) goto L18;
        TypedArray r23 = r22.obtainAttributes(r14, r32);
    L19:
        InterfaceC1006Xb r33 = C0728Qx.m1513c(r23, 5, new C2436r(0.0f));
        r23.recycle();
        int r24 = r14.getAttributeCount();
        int[] r5 = new int[r24];
        int r6 = 0;
        int r7 = 0;
    L20:
        if (r6 >= r24) goto L29;
        int r8 = r14.getAttributeNameResource(r6);
        if (r8 == R.attr.cornerSize) goto L28;
        int r9 = r7 + 1;
        if (r14.getAttributeBooleanValue(r6, false) == true) goto L27;
        r8 = -r8;
    L27:
        r5[r7] = r8;
        r7 = r9;
    L28:
        r6 = r6 + 1;
        goto L20
    L29:
        m2314a(StateSet.trimStateSet(r5, r7), r33);
        goto L3
    L18:
        r23 = r15.obtainStyledAttributes(r14, r32, 0, 0);
        goto L19
    }
}
