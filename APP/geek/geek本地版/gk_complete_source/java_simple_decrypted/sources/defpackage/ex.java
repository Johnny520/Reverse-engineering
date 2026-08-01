package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class ex extends ai {
    public final /* synthetic */ int d;

    public /* synthetic */ ex(nz r1, int r2) {
        this.d = r2;
        super(r1);
    }

    @Override // defpackage.ai
    public final int b(View r3) {
        switch(this.d) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        oz r0 = (oz) r3.getLayoutParams();
        ((nz) this.b).getClass();
        int r1 = r3.getBottom() + ((oz) r3.getLayoutParams()).b.bottom;
        int r32 = ((ViewGroup.MarginLayoutParams) r0).bottomMargin;
    L6:
        return r1 + r32;
    L7:
        oz r02 = (oz) r3.getLayoutParams();
        ((nz) this.b).getClass();
        r1 = r3.getRight() + ((oz) r3.getLayoutParams()).b.right;
        r32 = ((ViewGroup.MarginLayoutParams) r02).rightMargin;
        goto L6
    }

    @Override // defpackage.ai
    public final int c(View r4) {
        switch(this.d) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        oz r0 = (oz) r4.getLayoutParams();
        ((nz) this.b).getClass();
        Rect r1 = ((oz) r4.getLayoutParams()).b;
        int r42 = ((r4.getMeasuredHeight() + r1.top) + r1.bottom) + ((ViewGroup.MarginLayoutParams) r0).topMargin;
        int r02 = ((ViewGroup.MarginLayoutParams) r0).bottomMargin;
    L6:
        return r42 + r02;
    L7:
        oz r03 = (oz) r4.getLayoutParams();
        ((nz) this.b).getClass();
        Rect r12 = ((oz) r4.getLayoutParams()).b;
        r42 = ((r4.getMeasuredWidth() + r12.left) + r12.right) + ((ViewGroup.MarginLayoutParams) r03).leftMargin;
        r02 = ((ViewGroup.MarginLayoutParams) r03).rightMargin;
        goto L6
    }

    @Override // defpackage.ai
    public final int d(View r4) {
        switch(this.d) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        oz r0 = (oz) r4.getLayoutParams();
        ((nz) this.b).getClass();
        Rect r1 = ((oz) r4.getLayoutParams()).b;
        int r42 = ((r4.getMeasuredWidth() + r1.left) + r1.right) + ((ViewGroup.MarginLayoutParams) r0).leftMargin;
        int r02 = ((ViewGroup.MarginLayoutParams) r0).rightMargin;
    L6:
        return r42 + r02;
    L7:
        oz r03 = (oz) r4.getLayoutParams();
        ((nz) this.b).getClass();
        Rect r12 = ((oz) r4.getLayoutParams()).b;
        r42 = ((r4.getMeasuredHeight() + r12.top) + r12.bottom) + ((ViewGroup.MarginLayoutParams) r03).topMargin;
        r02 = ((ViewGroup.MarginLayoutParams) r03).bottomMargin;
        goto L6
    }

    @Override // defpackage.ai
    public final int e(View r3) {
        switch(this.d) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        oz r0 = (oz) r3.getLayoutParams();
        ((nz) this.b).getClass();
        int r1 = r3.getTop() - ((oz) r3.getLayoutParams()).b.top;
        int r32 = ((ViewGroup.MarginLayoutParams) r0).topMargin;
    L6:
        return r1 - r32;
    L7:
        oz r02 = (oz) r3.getLayoutParams();
        ((nz) this.b).getClass();
        r1 = r3.getLeft() - ((oz) r3.getLayoutParams()).b.left;
        r32 = ((ViewGroup.MarginLayoutParams) r02).leftMargin;
        goto L6
    }

    @Override // defpackage.ai
    public final int f() {
        switch(this.d) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((nz) this.b).o;
    L7:
        return ((nz) this.b).n;
    }

    @Override // defpackage.ai
    public final int g() {
        switch(this.d) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        nz r0 = (nz) this.b;
        int r1 = r0.o;
        int r02 = r0.B();
    L6:
        return r1 - r02;
    L7:
        nz r03 = (nz) this.b;
        r1 = r03.n;
        r02 = r03.D();
        goto L6
    }

    @Override // defpackage.ai
    public final int h() {
        switch(this.d) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((nz) this.b).B();
    L7:
        return ((nz) this.b).D();
    }

    @Override // defpackage.ai
    public final int i() {
        switch(this.d) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((nz) this.b).m;
    L7:
        return ((nz) this.b).l;
    }

    @Override // defpackage.ai
    public final int j() {
        switch(this.d) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((nz) this.b).l;
    L7:
        return ((nz) this.b).m;
    }

    @Override // defpackage.ai
    public final int k() {
        switch(this.d) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return ((nz) this.b).E();
    L7:
        return ((nz) this.b).C();
    }

    @Override // defpackage.ai
    public final int l() {
        switch(this.d) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        nz r0 = (nz) this.b;
        int r1 = r0.o - r0.E();
        int r02 = r0.B();
    L6:
        return r1 - r02;
    L7:
        nz r03 = (nz) this.b;
        r1 = r03.n - r03.C();
        r02 = r03.D();
        goto L6
    }

    @Override // defpackage.ai
    public final int m(View r3) {
        switch(this.d) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        nz r0 = (nz) this.b;
        Rect r1 = (Rect) this.c;
        r0.I(r3, r1);
        return r1.bottom;
    L6:
        nz r02 = (nz) this.b;
        Rect r12 = (Rect) this.c;
        r02.I(r3, r12);
        return r12.right;
    }

    @Override // defpackage.ai
    public final int n(View r3) {
        switch(this.d) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        nz r0 = (nz) this.b;
        Rect r1 = (Rect) this.c;
        r0.I(r3, r1);
        return r1.top;
    L6:
        nz r02 = (nz) this.b;
        Rect r12 = (Rect) this.c;
        r02.I(r3, r12);
        return r12.left;
    }

    @Override // defpackage.ai
    public final void o(int r2) {
        switch(this.d) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((nz) this.b).N(r2);
        return;
    L6:
        ((nz) this.b).M(r2);
    }
}
