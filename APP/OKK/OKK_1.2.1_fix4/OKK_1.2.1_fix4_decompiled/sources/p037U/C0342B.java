package p037U;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: U.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0342B {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f665a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0343C f666b;

    public /* synthetic */ C0342B(AbstractC0343C abstractC0343C, int i2) {
        this.f665a = i2;
        this.f666b = abstractC0343C;
    }

    /* JADX INFO: renamed from: a */
    public final View m760a(int i2) {
        switch (this.f665a) {
        }
        return this.f666b.m812q(i2);
    }

    /* JADX INFO: renamed from: b */
    public final int m761b(View view) {
        switch (this.f665a) {
            case 0:
                C0344D c0344d = (C0344D) view.getLayoutParams();
                this.f666b.getClass();
                return view.getRight() + ((C0344D) view.getLayoutParams()).f677a.right + ((ViewGroup.MarginLayoutParams) c0344d).rightMargin;
            default:
                C0344D c0344d2 = (C0344D) view.getLayoutParams();
                this.f666b.getClass();
                return view.getBottom() + ((C0344D) view.getLayoutParams()).f677a.bottom + ((ViewGroup.MarginLayoutParams) c0344d2).bottomMargin;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m762c(View view) {
        switch (this.f665a) {
            case 0:
                C0344D c0344d = (C0344D) view.getLayoutParams();
                this.f666b.getClass();
                return (view.getLeft() - ((C0344D) view.getLayoutParams()).f677a.left) - ((ViewGroup.MarginLayoutParams) c0344d).leftMargin;
            default:
                C0344D c0344d2 = (C0344D) view.getLayoutParams();
                this.f666b.getClass();
                return (view.getTop() - ((C0344D) view.getLayoutParams()).f677a.top) - ((ViewGroup.MarginLayoutParams) c0344d2).topMargin;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m763d() {
        switch (this.f665a) {
            case 0:
                AbstractC0343C abstractC0343C = this.f666b;
                return abstractC0343C.f675i - abstractC0343C.m773B();
            default:
                AbstractC0343C abstractC0343C2 = this.f666b;
                return abstractC0343C2.f676j - abstractC0343C2.m818z();
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m764e() {
        switch (this.f665a) {
            case 0:
                return this.f666b.m772A();
            default:
                return this.f666b.m774C();
        }
    }
}
