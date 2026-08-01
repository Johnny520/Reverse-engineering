package p000;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: r7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0661r7 {

    /* JADX INFO: renamed from: a */
    public final boolean f4220a;

    /* JADX INFO: renamed from: b */
    public final Object f4221b;

    public C0661r7(C0819vh c0819vh, boolean z) {
        this.f4221b = c0819vh;
        this.f4220a = z;
    }

    /* JADX INFO: renamed from: a */
    public boolean m2251a() {
        return this.f4220a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m2252b(java.lang.CharSequence r7, int r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L48
            if (r8 < 0) goto L48
            int r0 = r7.length()
            int r0 = r0 - r8
            if (r0 < 0) goto L48
            java.lang.Object r0 = r6.f4221b
            vh r0 = (p000.C0819vh) r0
            if (r0 != 0) goto L16
            boolean r7 = r6.m2251a()
            return r7
        L16:
            r0.getClass()
            r0 = 0
            r1 = 2
            r2 = r0
            r3 = r1
        L1d:
            r4 = 1
            if (r2 >= r8) goto L3d
            if (r3 != r1) goto L3d
            char r3 = r7.charAt(r2)
            byte r3 = java.lang.Character.getDirectionality(r3)
            r7 r5 = p000.b60.f752a
            if (r3 == 0) goto L39
            if (r3 == r4) goto L37
            if (r3 == r1) goto L37
            switch(r3) {
                case 14: goto L39;
                case 15: goto L39;
                case 16: goto L37;
                case 17: goto L37;
                default: goto L35;
            }
        L35:
            r3 = r1
            goto L3a
        L37:
            r3 = r0
            goto L3a
        L39:
            r3 = r4
        L3a:
            int r2 = r2 + 1
            goto L1d
        L3d:
            if (r3 == 0) goto L47
            if (r3 == r4) goto L46
            boolean r7 = r6.m2251a()
            return r7
        L46:
            return r0
        L47:
            return r4
        L48:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0661r7.m2252b(java.lang.CharSequence, int):boolean");
    }

    public C0661r7(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.f4221b = bottomSheetBehavior;
        this.f4220a = z;
    }
}
