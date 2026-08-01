package p000;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: b8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0059b8 {

    /* JADX INFO: renamed from: a */
    public final boolean f692a;

    /* JADX INFO: renamed from: b */
    public final Object f693b;

    public C0059b8(C0893xh c0893xh, boolean z) {
        this.f693b = c0893xh;
        this.f692a = z;
    }

    /* JADX INFO: renamed from: a */
    public boolean m493a() {
        return this.f692a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m494b(java.lang.CharSequence r7, int r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L48
            if (r8 < 0) goto L48
            int r0 = r7.length()
            int r0 = r0 - r8
            if (r0 < 0) goto L48
            java.lang.Object r0 = r6.f693b
            xh r0 = (p000.C0893xh) r0
            if (r0 != 0) goto L16
            boolean r7 = r6.m493a()
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
            b8 r5 = p000.h60.f2117a
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
            boolean r7 = r6.m493a()
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C0059b8.m494b(java.lang.CharSequence, int):boolean");
    }

    public C0059b8(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.f693b = bottomSheetBehavior;
        this.f692a = z;
    }
}
