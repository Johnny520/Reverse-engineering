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

    public /* synthetic */ C0342B(AbstractC0343C r1, int r2) {
        this.f665a = r2;
        this.f666b = r1;
    }

    /* JADX INFO: renamed from: a */
    public final View m760a(int r2) {
        switch(this.f665a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f666b.m812q(r2);
    L7:
        return this.f666b.m812q(r2);
    }

    /* JADX INFO: renamed from: b */
    public final int m761b(View r3) {
        switch(this.f665a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        C0344D r02 = (C0344D) r3.getLayoutParams();
        this.f666b.getClass();
        return (r3.getBottom() + ((C0344D) r3.getLayoutParams()).f677a.bottom) + ((ViewGroup.MarginLayoutParams) r02).bottomMargin;
    L6:
        C0344D r03 = (C0344D) r3.getLayoutParams();
        this.f666b.getClass();
        return (r3.getRight() + ((C0344D) r3.getLayoutParams()).f677a.right) + ((ViewGroup.MarginLayoutParams) r03).rightMargin;
    }

    /* JADX INFO: renamed from: c */
    public final int m762c(View r3) {
        switch(this.f665a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        C0344D r02 = (C0344D) r3.getLayoutParams();
        this.f666b.getClass();
        return (r3.getTop() - ((C0344D) r3.getLayoutParams()).f677a.top) - ((ViewGroup.MarginLayoutParams) r02).topMargin;
    L6:
        C0344D r03 = (C0344D) r3.getLayoutParams();
        this.f666b.getClass();
        return (r3.getLeft() - ((C0344D) r3.getLayoutParams()).f677a.left) - ((ViewGroup.MarginLayoutParams) r03).leftMargin;
    }

    /* JADX INFO: renamed from: d */
    public final int m763d() {
        switch(this.f665a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC0343C r02 = this.f666b;
        return r02.f676j - r02.m818z();
    L6:
        AbstractC0343C r03 = this.f666b;
        return r03.f675i - r03.m773B();
    }

    /* JADX INFO: renamed from: e */
    public final int m764e() {
        switch(this.f665a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return this.f666b.m774C();
    L7:
        return this.f666b.m772A();
    }
}
