package defpackage;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class p90 extends t50 {
    public final /* synthetic */ int e;

    public p90(int r1, Class r2, int r3, int r4, int r5) {
        this.e = r5;
        this.a = r1;
        this.d = r2;
        this.c = r3;
        this.b = r4;
    }

    @Override // defpackage.t50
    public final Object b(View r2) {
        switch(this.e) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return Boolean.valueOf(ca0.c(r2));
    L7:
        return ca0.b(r2);
    L9:
        return Boolean.valueOf(ca0.d(r2));
    }

    @Override // defpackage.t50
    public final void c(View r2, Object r3) {
        switch(this.e) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ca0.g(r2, ((Boolean) r3).booleanValue());
        return;
    L6:
        ca0.h(r2, (CharSequence) r3);
        return;
    L8:
        ca0.i(r2, ((Boolean) r3).booleanValue());
    }

    @Override // defpackage.t50
    public final boolean e(Object r3, Object r4) {
        switch(this.e) {
            case 0: goto L21;
            case 1: goto L20;
            default: goto L4;
        };
    L4:
        Boolean r32 = (Boolean) r3;
        Boolean r42 = (Boolean) r4;
        boolean r0 = false;
        if (r32 != null) goto L7;
    L9:
        boolean r33 = false;
    L10:
        if (r42 != null) goto L12;
    L14:
        boolean r43 = false;
    L15:
        if (r33 != r43) goto L18;
        r0 = true;
    L18:
        return !r0;
    L12:
        if (r42.booleanValue() == false) goto L14;
        r43 = true;
        goto L15
    L7:
        if (r32.booleanValue() == false) goto L9;
        r33 = true;
        goto L10
    L21:
        Boolean r34 = (Boolean) r3;
        Boolean r44 = (Boolean) r4;
        boolean r02 = false;
        if (r34 != null) goto L24;
    L26:
        boolean r35 = false;
    L27:
        if (r44 != null) goto L29;
    L31:
        boolean r45 = false;
    L32:
        if (r35 != r45) goto L35;
        r02 = true;
    L35:
        return !r02;
    L29:
        if (r44.booleanValue() == false) goto L31;
        r45 = true;
        goto L32
    L24:
        if (r34.booleanValue() == false) goto L26;
        r35 = true;
        goto L27
    L20:
        return !TextUtils.equals((CharSequence) r3, (CharSequence) r4);
    }
}
