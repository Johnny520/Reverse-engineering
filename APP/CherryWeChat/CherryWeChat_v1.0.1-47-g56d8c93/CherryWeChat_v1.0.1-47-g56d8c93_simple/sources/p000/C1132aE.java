package p000;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: aE */
/* JADX INFO: loaded from: classes.dex */
public final class C1132aE extends AbstractC2289nq {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f3582e;

    public C1132aE(int r1, Class r2, int r3, int r4, int r5) {
        this.f3582e = r5;
        this.f8034a = r1;
        this.f8037d = r2;
        this.f8036c = r3;
        this.f8035b = r4;
    }

    @Override // p000.AbstractC2289nq
    /* JADX INFO: renamed from: c */
    public final Object mo2051c(View r2) {
        switch(this.f3582e) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return Boolean.valueOf(AbstractC1492hE.m2851b(r2));
    L7:
        return AbstractC2093jE.m4278b(r2);
    L9:
        return AbstractC1492hE.m2850a(r2);
    L11:
        return Boolean.valueOf(AbstractC1492hE.m2852c(r2));
    }

    @Override // p000.AbstractC2289nq
    /* JADX INFO: renamed from: d */
    public final void mo2052d(View r2, Object r3) {
        switch(this.f3582e) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC1492hE.m2853d(r2, ((Boolean) r3).booleanValue());
        return;
    L6:
        AbstractC2093jE.m4279c(r2, (CharSequence) r3);
        return;
    L8:
        AbstractC1492hE.m2854e(r2, (CharSequence) r3);
        return;
    L10:
        AbstractC1492hE.m2855f(r2, ((Boolean) r3).booleanValue());
    }

    @Override // p000.AbstractC2289nq
    /* JADX INFO: renamed from: g */
    public final boolean mo2053g(Object r3, Object r4) {
        switch(this.f3582e) {
            case 0: goto L23;
            case 1: goto L22;
            case 2: goto L19;
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
    L19:
        boolean r34 = TextUtils.equals((CharSequence) r3, (CharSequence) r4);
    L21:
        return !r34;
    L22:
        r34 = TextUtils.equals((CharSequence) r3, (CharSequence) r4);
        goto L21
    L23:
        Boolean r35 = (Boolean) r3;
        Boolean r44 = (Boolean) r4;
        boolean r02 = false;
        if (r35 != null) goto L26;
    L28:
        boolean r36 = false;
    L29:
        if (r44 != null) goto L31;
    L33:
        boolean r45 = false;
    L34:
        if (r36 != r45) goto L37;
        r02 = true;
    L37:
        return !r02;
    L31:
        if (r44.booleanValue() == false) goto L33;
        r45 = true;
        goto L34
    L26:
        if (r35.booleanValue() == false) goto L28;
        r36 = true;
        goto L29
    }
}
