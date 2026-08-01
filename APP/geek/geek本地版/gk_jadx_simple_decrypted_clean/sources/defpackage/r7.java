package defpackage;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class r7 {
    public final boolean a;
    public final Object b;

    public r7(vh r1, boolean r2) {
        this.b = r1;
        this.a = r2;
    }

    public boolean a() {
        return this.a;
    }

    public boolean b(CharSequence r7, int r8) {
        if (r7 == null) goto L30;
        if (r8 < 0) goto L30;
        if ((r7.length() - r8) < 0) goto L30;
        vh r0 = (vh) this.b;
        if (r0 == null) goto L9;
        r0.getClass();
        int r2 = 0;
        char r3 = 2;
    L12:
        if (r2 >= r8) goto L23;
        if (r3 != 2) goto L23;
        byte r32 = Character.getDirectionality(r7.charAt(r2));
        r7 r5 = b60.a;
        if (r32 == 0) goto L21;
        if (r32 == 1) goto L20;
        if (r32 == 2) goto L36;
        switch(r32) {
            case 14: goto L21;
            case 15: goto L21;
            case 16: goto L37;
            case 17: goto L37;
            default: goto L19;
        };
    L19:
        r3 = 2;
    L22:
        r2 = r2 + 1;
        goto L12
    L37:
        r3 = 0;
        goto L22
    L36:
        r3 = 0;
        goto L22
    L20:
        r3 = 0;
    L21:
        r3 = 1;
    L23:
        if (r3 == 0) goto L28;
        if (r3 != 1) goto L26;
        return false;
    L26:
        return a();
    L28:
        return true;
    L9:
        return a();
    L30:
        throw new IllegalArgumentException();
    }

    public r7(BottomSheetBehavior r1, boolean r2) {
        this.b = r1;
        this.a = r2;
    }
}
