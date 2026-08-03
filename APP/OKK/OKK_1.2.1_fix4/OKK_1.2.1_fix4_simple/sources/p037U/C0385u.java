package p037U;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: U.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0385u {

    /* JADX INFO: renamed from: a */
    public final AbstractC0343C f872a;

    /* JADX INFO: renamed from: b */
    public final Rect f873b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f874c;

    public C0385u(AbstractC0343C r1, int r2) {
        this.f874c = r2;
        this.f873b = new Rect();
        this.f872a = r1;
    }

    /* JADX INFO: renamed from: a */
    public static C0385u m963a(AbstractC0343C r1, int r2) {
        if (r2 == 0) goto L10;
        if (r2 != 1) goto L8;
        return new C0385u(r1, 1);
    L8:
        throw new IllegalArgumentException("invalid orientation");
    L10:
        return new C0385u(r1, 0);
    }

    /* JADX INFO: renamed from: b */
    public final int m964b(View r3) {
        switch(this.f874c) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        C0344D r02 = (C0344D) r3.getLayoutParams();
        this.f872a.getClass();
        return (r3.getBottom() + ((C0344D) r3.getLayoutParams()).f677a.bottom) + ((ViewGroup.MarginLayoutParams) r02).bottomMargin;
    L6:
        C0344D r03 = (C0344D) r3.getLayoutParams();
        this.f872a.getClass();
        return (r3.getRight() + ((C0344D) r3.getLayoutParams()).f677a.right) + ((ViewGroup.MarginLayoutParams) r03).rightMargin;
    }

    /* JADX INFO: renamed from: c */
    public final int m965c(View r3) {
        switch(this.f874c) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        C0344D r02 = (C0344D) r3.getLayoutParams();
        this.f872a.getClass();
        return (AbstractC0343C.m770v(r3) + ((ViewGroup.MarginLayoutParams) r02).topMargin) + ((ViewGroup.MarginLayoutParams) r02).bottomMargin;
    L6:
        C0344D r03 = (C0344D) r3.getLayoutParams();
        this.f872a.getClass();
        return (AbstractC0343C.m771w(r3) + ((ViewGroup.MarginLayoutParams) r03).leftMargin) + ((ViewGroup.MarginLayoutParams) r03).rightMargin;
    }

    /* JADX INFO: renamed from: d */
    public final int m966d(View r3) {
        switch(this.f874c) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        C0344D r02 = (C0344D) r3.getLayoutParams();
        this.f872a.getClass();
        return (AbstractC0343C.m771w(r3) + ((ViewGroup.MarginLayoutParams) r02).leftMargin) + ((ViewGroup.MarginLayoutParams) r02).rightMargin;
    L6:
        C0344D r03 = (C0344D) r3.getLayoutParams();
        this.f872a.getClass();
        return (AbstractC0343C.m770v(r3) + ((ViewGroup.MarginLayoutParams) r03).topMargin) + ((ViewGroup.MarginLayoutParams) r03).bottomMargin;
    }

    /* JADX INFO: renamed from: e */
    public final int m967e(View r3) {
        switch(this.f874c) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        C0344D r02 = (C0344D) r3.getLayoutParams();
        this.f872a.getClass();
        return (r3.getTop() - ((C0344D) r3.getLayoutParams()).f677a.top) - ((ViewGroup.MarginLayoutParams) r02).topMargin;
    L6:
        C0344D r03 = (C0344D) r3.getLayoutParams();
        this.f872a.getClass();
        return (r3.getLeft() - ((C0344D) r3.getLayoutParams()).f677a.left) - ((ViewGroup.MarginLayoutParams) r03).leftMargin;
    }

    /* JADX INFO: renamed from: f */
    public final int m968f() {
        switch(this.f874c) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f872a.f676j;
    L7:
        return this.f872a.f675i;
    }

    /* JADX INFO: renamed from: g */
    public final int m969g() {
        switch(this.f874c) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC0343C r02 = this.f872a;
        return r02.f676j - r02.m818z();
    L6:
        AbstractC0343C r03 = this.f872a;
        return r03.f675i - r03.m773B();
    }

    /* JADX INFO: renamed from: h */
    public final int m970h() {
        switch(this.f874c) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f872a.m818z();
    L7:
        return this.f872a.m773B();
    }

    /* JADX INFO: renamed from: i */
    public final int m971i() {
        switch(this.f874c) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f872a.f674h;
    L7:
        return this.f872a.f673g;
    }

    /* JADX INFO: renamed from: j */
    public final int m972j() {
        switch(this.f874c) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f872a.f673g;
    L7:
        return this.f872a.f674h;
    }

    /* JADX INFO: renamed from: k */
    public final int m973k() {
        switch(this.f874c) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f872a.m774C();
    L7:
        return this.f872a.m772A();
    }

    /* JADX INFO: renamed from: l */
    public final int m974l() {
        switch(this.f874c) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC0343C r02 = this.f872a;
        return (r02.f676j - r02.m774C()) - r02.m818z();
    L6:
        AbstractC0343C r03 = this.f872a;
        return (r03.f675i - r03.m772A()) - r03.m773B();
    }

    /* JADX INFO: renamed from: m */
    public final int m975m(View r3) {
        switch(this.f874c) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC0343C r02 = this.f872a;
        Rect r1 = this.f873b;
        r02.m776G(r3, r1);
        return r1.bottom;
    L6:
        AbstractC0343C r03 = this.f872a;
        Rect r12 = this.f873b;
        r03.m776G(r3, r12);
        return r12.right;
    }

    /* JADX INFO: renamed from: n */
    public final int m976n(View r3) {
        switch(this.f874c) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC0343C r02 = this.f872a;
        Rect r1 = this.f873b;
        r02.m776G(r3, r1);
        return r1.top;
    L6:
        AbstractC0343C r03 = this.f872a;
        Rect r12 = this.f873b;
        r03.m776G(r3, r12);
        return r12.left;
    }
}
