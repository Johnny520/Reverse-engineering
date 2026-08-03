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
    public final Rect f873b = new Rect();

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f874c;

    public C0385u(AbstractC0343C abstractC0343C, int i2) {
        this.f874c = i2;
        this.f872a = abstractC0343C;
    }

    /* JADX INFO: renamed from: a */
    public static C0385u m963a(AbstractC0343C abstractC0343C, int i2) {
        if (i2 == 0) {
            return new C0385u(abstractC0343C, 0);
        }
        if (i2 == 1) {
            return new C0385u(abstractC0343C, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* JADX INFO: renamed from: b */
    public final int m964b(View view) {
        switch (this.f874c) {
            case 0:
                C0344D c0344d = (C0344D) view.getLayoutParams();
                this.f872a.getClass();
                return view.getRight() + ((C0344D) view.getLayoutParams()).f677a.right + ((ViewGroup.MarginLayoutParams) c0344d).rightMargin;
            default:
                C0344D c0344d2 = (C0344D) view.getLayoutParams();
                this.f872a.getClass();
                return view.getBottom() + ((C0344D) view.getLayoutParams()).f677a.bottom + ((ViewGroup.MarginLayoutParams) c0344d2).bottomMargin;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m965c(View view) {
        switch (this.f874c) {
            case 0:
                C0344D c0344d = (C0344D) view.getLayoutParams();
                this.f872a.getClass();
                return AbstractC0343C.m771w(view) + ((ViewGroup.MarginLayoutParams) c0344d).leftMargin + ((ViewGroup.MarginLayoutParams) c0344d).rightMargin;
            default:
                C0344D c0344d2 = (C0344D) view.getLayoutParams();
                this.f872a.getClass();
                return AbstractC0343C.m770v(view) + ((ViewGroup.MarginLayoutParams) c0344d2).topMargin + ((ViewGroup.MarginLayoutParams) c0344d2).bottomMargin;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m966d(View view) {
        switch (this.f874c) {
            case 0:
                C0344D c0344d = (C0344D) view.getLayoutParams();
                this.f872a.getClass();
                return AbstractC0343C.m770v(view) + ((ViewGroup.MarginLayoutParams) c0344d).topMargin + ((ViewGroup.MarginLayoutParams) c0344d).bottomMargin;
            default:
                C0344D c0344d2 = (C0344D) view.getLayoutParams();
                this.f872a.getClass();
                return AbstractC0343C.m771w(view) + ((ViewGroup.MarginLayoutParams) c0344d2).leftMargin + ((ViewGroup.MarginLayoutParams) c0344d2).rightMargin;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m967e(View view) {
        switch (this.f874c) {
            case 0:
                C0344D c0344d = (C0344D) view.getLayoutParams();
                this.f872a.getClass();
                return (view.getLeft() - ((C0344D) view.getLayoutParams()).f677a.left) - ((ViewGroup.MarginLayoutParams) c0344d).leftMargin;
            default:
                C0344D c0344d2 = (C0344D) view.getLayoutParams();
                this.f872a.getClass();
                return (view.getTop() - ((C0344D) view.getLayoutParams()).f677a.top) - ((ViewGroup.MarginLayoutParams) c0344d2).topMargin;
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m968f() {
        switch (this.f874c) {
            case 0:
                return this.f872a.f675i;
            default:
                return this.f872a.f676j;
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m969g() {
        switch (this.f874c) {
            case 0:
                AbstractC0343C abstractC0343C = this.f872a;
                return abstractC0343C.f675i - abstractC0343C.m773B();
            default:
                AbstractC0343C abstractC0343C2 = this.f872a;
                return abstractC0343C2.f676j - abstractC0343C2.m818z();
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m970h() {
        switch (this.f874c) {
            case 0:
                return this.f872a.m773B();
            default:
                return this.f872a.m818z();
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m971i() {
        switch (this.f874c) {
            case 0:
                return this.f872a.f673g;
            default:
                return this.f872a.f674h;
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m972j() {
        switch (this.f874c) {
            case 0:
                return this.f872a.f674h;
            default:
                return this.f872a.f673g;
        }
    }

    /* JADX INFO: renamed from: k */
    public final int m973k() {
        switch (this.f874c) {
            case 0:
                return this.f872a.m772A();
            default:
                return this.f872a.m774C();
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m974l() {
        switch (this.f874c) {
            case 0:
                AbstractC0343C abstractC0343C = this.f872a;
                return (abstractC0343C.f675i - abstractC0343C.m772A()) - abstractC0343C.m773B();
            default:
                AbstractC0343C abstractC0343C2 = this.f872a;
                return (abstractC0343C2.f676j - abstractC0343C2.m774C()) - abstractC0343C2.m818z();
        }
    }

    /* JADX INFO: renamed from: m */
    public final int m975m(View view) {
        switch (this.f874c) {
            case 0:
                AbstractC0343C abstractC0343C = this.f872a;
                Rect rect = this.f873b;
                abstractC0343C.m776G(view, rect);
                return rect.right;
            default:
                AbstractC0343C abstractC0343C2 = this.f872a;
                Rect rect2 = this.f873b;
                abstractC0343C2.m776G(view, rect2);
                return rect2.bottom;
        }
    }

    /* JADX INFO: renamed from: n */
    public final int m976n(View view) {
        switch (this.f874c) {
            case 0:
                AbstractC0343C abstractC0343C = this.f872a;
                Rect rect = this.f873b;
                abstractC0343C.m776G(view, rect);
                return rect.left;
            default:
                AbstractC0343C abstractC0343C2 = this.f872a;
                Rect rect2 = this.f873b;
                abstractC0343C2.m776G(view, rect2);
                return rect2.top;
        }
    }
}
